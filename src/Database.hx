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
		name: "Chat Room",
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

	public static function addMessage(sender:String, message:String, timestamp:Int, crc32:Crc32) {}

	public static function addUser() {}

	public static function read():DatabaseSchema {
		return Json.parse(File.getContent(DB_PATH));
	}
}
