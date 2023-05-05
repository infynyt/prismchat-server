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
		Server = new HTTPServer("0.0.0.0", Reference.SERVER_PORT, true);
		Server.onClientConnect = (d:HTTPRequest) -> {
			final data:ChatRequest = Json.parse(Base64.decode(d.postData.substring(2, d.postData.length)).toString());
			switch (data.request) {
				case "login":
					var username = "";
					var password = "";

					for (i in 0...data.parameters.length) {
						switch (data.parameters[i].key) {
							case "username":
								username = data.parameters[i].value;
							case "passwordHash":
								password = data.parameters[i].value;
							case "password":
								Sys.stderr().writeString("Client used unhashed password; rejected request\r\n");
								d.reply("DANGER: DO NOT USE UNHASHED PASSWORDS!", 400);
						}
					}
					trace(username);
					trace(password);
			}

			d.close();
		}
	}
}
