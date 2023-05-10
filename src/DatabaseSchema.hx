package;

import haxe.crypto.Crc32;

typedef DatabaseSchema = {
	name:String,
	users:Array<{
		username:String,
		passwordHash:Int,
		token:Int,
		expiry:Int
	}>,
	messages:Array<{
		sender:String,
		message:String,
		timestamp:Int,
		crc32:Int
	}>
}
