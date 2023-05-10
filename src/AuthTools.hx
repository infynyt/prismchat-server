package;

import haxe.crypto.Sha512;
import haxe.io.Bytes;

class AuthTools {
	public static function generateAuthToken(username:String):{token:Int, expiry:Int} {
		var ct = Date.now();
		var e = Std.int(ct.getTime() + 7776000000);
		var iu = Std.parseInt(Bytes.ofString(username).toHex());
		var b = Std.int(ct.getTime() * e * iu);
		var t = Sha512.make(Bytes.ofString('${b}')).toHex();
		return {token: Std.parseInt(t), expiry: e};
	}
}
