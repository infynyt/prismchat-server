package;

import haxe.io.BytesData;
import haxe.io.Bytes;
import haxe.crypto.Crc32;
import haxe.crypto.Base64;
import haxe.Json;
import hx_webserver.HTTPRequest;
import hx_webserver.HTTPServer;

class Main {
	static var Server:HTTPServer;

	static function main() {
		Database.make();
		Server = new HTTPServer("0.0.0.0", Reference.SERVER_PORT, true);
		Server.onClientConnect = (d:HTTPRequest) -> {
			final data:ChatRequest = Json.parse(Base64.decode(d.postData.substring(2, d.postData.length)).toString());
			switch (data.request) {
				case "login":
					var username = "";
					var password:Int = 0;

					for (i in 0...data.parameters.length) {
						switch (data.parameters[i].key) {
							case "username":
								username = data.parameters[i].value;
							case "passwordHash":
								password = Std.parseInt(data.parameters[i].value);
							case "password":
								Sys.stderr().writeString("Client used unhashed password; rejected request\r\n");
								// d.reply("DANGER: DO NOT USE UNHASHED PASSWORDS!", 400);
								d.close();
						}
					}

					var db = Database.read();
					for (v in db.users) {
						if (v.username == username) {
							if (v.passwordHash == password) {
								final t = AuthTools.generateAuthToken(username);
								Database.assignToken(username, t);
								final r:ChatRequest = {
									request: "statusResponse",
									parameters: [
										{
											key: "authStatus",
											value: "100/AUTHENTICATION ACCEPTED"
										},
										{
											key: "accessTokenExpiry",
											value: Std.string(t.expiry)
										},
										{
											key: "accessTokenValue",
											value: Std.string(t.token)
										}
									]
								};
								d.reply(Base64.encode(Bytes.ofString(Json.stringify(r))));
							} else {
								final r:ChatRequest = {
									request: "statusResponse",
									parameters: [
										{
											key: "authStatus",
											value: "200/AUTHENTICATION REJECTED:WRONG PASSWORD"
										}
									]
								};
								d.reply(Base64.encode(Bytes.ofString(Json.stringify(r))));
							}
						}
					}
				case "message":
					var sender = "";
					var message = "";
					var timestamp:Int = 0;
					var crc32:Int = 0;

					for (v in data.parameters) {
						if (v.key == "sender") {
							sender = v.value;
						} else if (v.key == "message") {
							message = v.value;
						} else if (v.key == "timestamp") {
							timestamp = Std.parseInt(v.value);
						} else if (v.key == "crc32") {
							crc32 = Std.parseInt(v.value);
						}
					}

					Database.addMessage(sender, message, timestamp, crc32);
				case "getHistory":
					var length:Int = 0;
					final a = Database.read();
					final r = a.messages.slice(length);
					d.reply(Json.stringify(r));
				case "userStatus":
				// TODO
				case "statusResponse":
					// TODO
			}

			d.close();
		}
	}
}
