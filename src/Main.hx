package;

import hx_webserver.HTTPRequest;
import hx_webserver.HTTPServer;

class Main {
	static var Server:HTTPServer;

	static function main() {
		Server = new HTTPServer("0.0.0.0", Reference.SERVER_PORT, true);
		Server.onClientConnect = (d:HTTPRequest) -> {
			trace(d.postData);
			d.reply("hi");
		}
	}
}
