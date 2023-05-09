package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Database extends haxe.lang.HxObject
{
	static
	{
		//line 12 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		haxe.root.Database.DB_PATH = haxe.io.Path.join(new haxe.root.Array<java.lang.String>(new java.lang.String[]{haxe.root.Reference.WORKNG_DIR, "data/db1.json"}));
		//line 13 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		haxe.root.Database.DB_SCHEMA = new haxe.lang.DynamicObject(new java.lang.String[]{"messages", "users"}, new java.lang.Object[]{new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})}, new java.lang.String[]{}, new double[]{});
	}
	
	public Database(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Database()
	{
		//line 11 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		haxe.root.Database.__hx_ctor__Database(this);
	}
	
	
	protected static void __hx_ctor__Database(haxe.root.Database __hx_this)
	{
	}
	
	
	public static java.lang.String DB_PATH;
	
	public static java.lang.Object DB_SCHEMA;
	
	public static int check()
	{
		//line 27 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		if (sys.FileSystem.exists(haxe.io.Path.join(new haxe.root.Array<java.lang.String>(new java.lang.String[]{haxe.root.Reference.WORKNG_DIR, "data/db1.json"})))) 
		{
			//line 28 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
			return 100;
		}
		
		//line 29 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		return 201;
	}
	
	
	public static void make()
	{
		//line 33 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		switch (haxe.root.Database.check())
		{
			case 100:
			{
				//line 35 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				return ;
			}
			
			
			case 200:
			{
				//line 37 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				haxe.root.Database.DB_PATH = haxe.io.Path.join(new haxe.root.Array<java.lang.String>(new java.lang.String[]{haxe.root.Reference.WORKNG_DIR, "data/db1.json"}));
				//line 38 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				haxe.lang.Function replacer = null;
				//line 38 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				java.lang.String space = null;
				//line 38 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				sys.io.File.saveContent(haxe.root.Database.DB_PATH, haxe.format.JsonPrinter.print(((java.lang.Object) (haxe.root.Database.DB_SCHEMA) ), replacer, space));
				//line 36 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				break;
			}
			
			
			case 201:
			{
				//line 40 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				haxe.lang.Function replacer1 = null;
				//line 40 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				java.lang.String space1 = null;
				//line 40 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				sys.io.File.saveContent(haxe.root.Database.DB_PATH, haxe.format.JsonPrinter.print(((java.lang.Object) (haxe.root.Database.DB_SCHEMA) ), replacer1, space1));
				//line 40 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				break;
			}
			
			
			case 202:
			{
				//line 42 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				haxe.lang.Function replacer2 = null;
				//line 42 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				java.lang.String space2 = null;
				//line 42 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				sys.io.File.saveContent(haxe.root.Database.DB_PATH, haxe.format.JsonPrinter.print(((java.lang.Object) (haxe.root.Database.DB_SCHEMA) ), replacer2, space2));
				//line 42 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				break;
			}
			
			
			case 299:
			{
				//line 44 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				throw new haxe.exceptions.ArgumentException(haxe.lang.Runtime.toString("Numerical code 299 was provided"), haxe.lang.Runtime.toString(null), ((haxe.Exception) (null) ), ((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Database", "src/Database.hx", "make"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (44) )) )})) ));
			}
			
			
			default:
			{
				//line 46 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				throw new haxe.exceptions.ArgumentException(haxe.lang.Runtime.toString("An unexpected numerical code was received"), haxe.lang.Runtime.toString(null), ((haxe.Exception) (null) ), ((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Database", "src/Database.hx", "make"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (46) )) )})) ));
			}
			
		}
		
	}
	
	
	public static void addMessage(java.lang.String sender, java.lang.String message, int timestamp, haxe.crypto.Crc32 crc32)
	{
	}
	
	
	public static void addUser()
	{
	}
	
	
	public static void read()
	{
	}
	
	
}


