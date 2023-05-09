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
		users: [],
		messages: []
	};

	/**
	 * This function returns a numerical code instead of a boolean
	 * 100 The database exists and is formatted with JSON
	 * 200 The database path is not specified
	 * 201 The database does not exist
	 * 202 The database exists but is not formatted with JSON and/or corrupted
	 * 299 An unknown error occurred
	 */
	public static function check():Int {
		if (FileSystem.exists(Path.join([Reference.WORKNG_DIR, "data/db1.json"])))
			return 100;
		return 201;
	}

	public static function make() {
		switch (check()) {
			case 100:
				return;
			case 200:
				DB_PATH = Path.join([Reference.WORKNG_DIR, "data/db1.json"]);
				File.saveContent(DB_PATH, Json.stringify(DB_SCHEMA));
			case 201:
				File.saveContent(DB_PATH, Json.stringify(DB_SCHEMA));
			case 202:
				File.saveContent(DB_PATH, Json.stringify(DB_SCHEMA));
			case 299:
				throw new ArgumentException("Numerical code 299 was provided");
			default:
				throw new ArgumentException("An unexpected numerical code was received");
		}
	}

	public static function addMessage(sender:String, message:String, timestamp:Int, crc32:Crc32) {}

	public static function addUser() {}

	public static function read() {}
}
