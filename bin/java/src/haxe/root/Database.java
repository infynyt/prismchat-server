package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Database extends haxe.lang.HxObject
{
	static
	{
		//line 13 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		haxe.root.Database.DB_PATH = haxe.io.Path.join(new haxe.root.Array<java.lang.String>(new java.lang.String[]{haxe.root.Reference.WORKNG_DIR, "data/db1.json"}));
		//line 14 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		haxe.root.Database.DB_SCHEMA = new haxe.lang.DynamicObject(new java.lang.String[]{"messages", "name", "users"}, new java.lang.Object[]{new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{}), "To edit your server name, edit the \'name\' property in the \'data/db1.json\' file", new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})}, new java.lang.String[]{}, new double[]{});
	}
	
	public Database(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Database()
	{
		//line 12 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		haxe.root.Database.__hx_ctor__Database(this);
	}
	
	
	protected static void __hx_ctor__Database(haxe.root.Database __hx_this)
	{
	}
	
	
	public static java.lang.String DB_PATH;
	
	public static java.lang.Object DB_SCHEMA;
	
	public static boolean check()
	{
		//line 24 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		if (sys.FileSystem.exists(haxe.io.Path.join(new haxe.root.Array<java.lang.String>(new java.lang.String[]{haxe.root.Reference.WORKNG_DIR, "data/db1.json"})))) 
		{
			//line 25 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
			return true;
		}
		
		//line 26 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		return false;
	}
	
	
	public static void make()
	{
		//line 30 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		if ( ! (haxe.root.Database.check()) ) 
		{
			//line 31 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
			haxe.lang.Function replacer = null;
			//line 31 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
			java.lang.String space = null;
			//line 31 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
			sys.io.File.saveContent(haxe.root.Database.DB_PATH, haxe.format.JsonPrinter.print(((java.lang.Object) (haxe.root.Database.DB_SCHEMA) ), replacer, space));
		}
		
	}
	
	
	public static void addMessage(java.lang.String sndr, java.lang.String msg, int tstamp, int hash)
	{
		//line 36 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		java.lang.Object d = haxe.root.Database.read();
		//line 37 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.getField(d, "messages", true)) ).push(new haxe.lang.DynamicObject(new java.lang.String[]{"message", "sender"}, new java.lang.Object[]{msg, sndr}, new java.lang.String[]{"crc32", "timestamp"}, new double[]{((double) (((double) (hash) )) ), ((double) (((double) (tstamp) )) )}));
		//line 43 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		haxe.root.Database.overwrite(d);
	}
	
	
	public static void overwrite(java.lang.Object data)
	{
		//line 47 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		haxe.lang.Function replacer = null;
		//line 47 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		java.lang.String space = null;
		//line 47 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		sys.io.File.saveContent(haxe.root.Database.DB_PATH, haxe.format.JsonPrinter.print(((java.lang.Object) (data) ), replacer, space));
	}
	
	
	public static void addUser(java.lang.String user)
	{
		//line 51 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		java.lang.Object d = haxe.root.Database.read();
		//line 52 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.getField(d, "users", true)) ).push(new haxe.lang.DynamicObject(new java.lang.String[]{"passwordHash", "username"}, new java.lang.Object[]{"0", user}, new java.lang.String[]{}, new double[]{}));
		//line 56 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		haxe.root.Database.overwrite(d);
	}
	
	
	public static void removeUser(java.lang.String user)
	{
		//line 60 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		java.lang.Object d = haxe.root.Database.read();
		//line 61 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		{
			//line 61 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
			int _g = 0;
			//line 61 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
			haxe.root.Array<java.lang.Object> _g1 = ((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.getField(d, "users", true)) );
			//line 61 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
			while (( _g < _g1.length ))
			{
				//line 61 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				java.lang.Object v = _g1.__get(_g);
				//line 61 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				 ++ _g;
				//line 62 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				boolean tmp = haxe.lang.Runtime.valEq(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(v, "username", true)), user);
			}
			
		}
		
		//line 66 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		haxe.root.Database.overwrite(d);
	}
	
	
	public static java.lang.Object read()
	{
		//line 70 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		return new haxe.format.JsonParser(haxe.lang.Runtime.toString(sys.io.File.getContent(haxe.root.Database.DB_PATH))).doParse();
	}
	
	
}


