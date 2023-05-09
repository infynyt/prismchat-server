package;

import haxe.crypto.Crc32;

typedef DatabaseSchema = {
	users:Array<{username:String, passwordHash:String, ips:Array<String>}>,
	messages:Array<{
		sender:String,
		message:String,
		timestamp:Int,
		crc32:Crc32
	}>
}