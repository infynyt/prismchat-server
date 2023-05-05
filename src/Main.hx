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
			trace(Json.parse(Base64.decode(d.postData.substring(2, d.postData.length)).toString()));

			d.close();
		}
	}
}
