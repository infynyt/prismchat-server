package;

import haxe.Exception;
import sys.FileSystem;
import haxe.crypto.Crc32;
import haxe.exceptions.ArgumentException;
import haxe.Json;
import sys.io.File;
import haxe.io.Path;

class Database {
	public static var DB_PATH:String = Path.join([Reference.WORKNG_DIR, "data/db1.json"]);
	public static final DB_SCHEMA:DatabaseSchema = {
		name: "To edit your server name, edit the 'name' property in the 'data/db1.json' file",
		users: [],
		messages: []
	};

	/**
	 * Check if the database file exists and is working. Returns true or false.
	 */
	public static function check():Bool {
		if (FileSystem.exists(Path.join([Reference.WORKNG_DIR, "data/db1.json"])))
			return true;
		return false;
	}

	public static function make() {
		if (!check()) {
			File.saveContent(DB_PATH, Json.stringify(DB_SCHEMA));
		}
	}

	public static function addMessage(sndr:String, msg:String, tstamp:Int) {
		var d = read();
		final h = Crc32.make(sndr + msg + tstamp);
		d.messsages.push({
			sender: sndr,
			message: msg,
			timestamp: tstamp,
			crc32: h
		});
		overwrite(d);
	}

	public static function overwrite(data:DatabaseSchema) {
		File.saveContent(DB_PATH, Json.stringify(data));
	}

	public static function addUser(user:String) {
		var d = read();
		d.users.push({
			username: user,
			passwordHash: "0"
		});
		overwrite(d);
	}

	public static function removeUser(user:String) {
		var d = read();
		for (v in d.users) {
			if (v.username == user) {
				// TODO
			}
		}
		overwrite(d);
	}

	public static function read():DatabaseSchema {
		return Json.parse(File.getContent(DB_PATH));
	}
}
