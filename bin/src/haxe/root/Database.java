package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Database extends haxe.lang.HxObject
{
	static
	{
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
		//line 26 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		try 
		{
			//line 27 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
			if (( ( haxe.root.Database.DB_PATH == null ) &&  ! (sys.FileSystem.exists(haxe.io.Path.join(new haxe.root.Array<java.lang.String>(new java.lang.String[]{haxe.root.Reference.WORKNG_DIR, "data/db1.json"}))))  )) 
			{
				//line 28 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				return 200;
			}
			else
			{
				//line 29 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				if ( ! (sys.FileSystem.exists(haxe.io.Path.join(new haxe.root.Array<java.lang.String>(new java.lang.String[]{haxe.root.Reference.WORKNG_DIR, "data/db1.json"})))) ) 
				{
					//line 30 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
					return 201;
				}
				else
				{
					//line 31 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
					if (sys.FileSystem.exists(haxe.io.Path.join(new haxe.root.Array<java.lang.String>(new java.lang.String[]{haxe.root.Reference.WORKNG_DIR, "data/db1.json"})))) 
					{
						//line 33 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
						try 
						{
							//line 33 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
							new haxe.format.JsonParser(haxe.lang.Runtime.toString(sys.io.File.getContent(haxe.io.Path.join(new haxe.root.Array<java.lang.String>(new java.lang.String[]{haxe.root.Reference.WORKNG_DIR, "data/db1.json"}))))).doParse();
						}
						catch (java.lang.Throwable _g)
						{
							//line 34 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
							java.lang.Object _g1 = haxe.Exception.caught(_g).unwrap();
							//line 32 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
							if (( _g1 instanceof java.lang.String )) 
							{
								//line 34 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
								java.lang.String err = haxe.lang.Runtime.toString(_g1);
								//line 35 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
								throw new haxe.Exception(haxe.lang.Runtime.toString(err), ((haxe.Exception) (null) ), ((java.lang.Object) (null) ));
							}
							else
							{
								//line 32 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
								throw _g;
							}
							
						}
						
						
					}
					else
					{
						//line 38 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
						if (sys.FileSystem.exists(haxe.io.Path.join(new haxe.root.Array<java.lang.String>(new java.lang.String[]{haxe.root.Reference.WORKNG_DIR, "data/db1.json"})))) 
						{
							//line 39 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
							return 100;
						}
						
					}
					
				}
				
			}
			
			//line 41 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
			return 299;
		}
		catch (java.lang.Throwable typedException)
		{
			//line 26 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(typedException)) );
		}
		
		
	}
	
	
	public static void make()
	{
		//line 45 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
		switch (haxe.root.Database.check())
		{
			case 100:
			{
				//line 47 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				return ;
			}
			
			
			case 200:
			{
				//line 49 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				haxe.root.Database.DB_PATH = haxe.io.Path.join(new haxe.root.Array<java.lang.String>(new java.lang.String[]{haxe.root.Reference.WORKNG_DIR, "data/db1.json"}));
				//line 50 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				haxe.lang.Function replacer = null;
				//line 50 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				java.lang.String space = null;
				//line 50 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				sys.io.File.saveContent(haxe.root.Database.DB_PATH, haxe.format.JsonPrinter.print(((java.lang.Object) (haxe.root.Database.DB_SCHEMA) ), replacer, space));
				//line 48 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				break;
			}
			
			
			case 201:
			{
				//line 52 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				haxe.lang.Function replacer1 = null;
				//line 52 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				java.lang.String space1 = null;
				//line 52 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				sys.io.File.saveContent(haxe.root.Database.DB_PATH, haxe.format.JsonPrinter.print(((java.lang.Object) (haxe.root.Database.DB_SCHEMA) ), replacer1, space1));
				//line 52 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				break;
			}
			
			
			case 202:
			{
				//line 54 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				haxe.lang.Function replacer2 = null;
				//line 54 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				java.lang.String space2 = null;
				//line 54 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				sys.io.File.saveContent(haxe.root.Database.DB_PATH, haxe.format.JsonPrinter.print(((java.lang.Object) (haxe.root.Database.DB_SCHEMA) ), replacer2, space2));
				//line 54 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				break;
			}
			
			
			case 299:
			{
				//line 56 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				throw new haxe.exceptions.ArgumentException(haxe.lang.Runtime.toString("Numerical code 299 was provided"), haxe.lang.Runtime.toString(null), ((haxe.Exception) (null) ), ((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Database", "src/Database.hx", "make"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (56) )) )})) ));
			}
			
			
			default:
			{
				//line 58 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Database.hx"
				throw new haxe.exceptions.ArgumentException(haxe.lang.Runtime.toString("An unexpected numerical code was received"), haxe.lang.Runtime.toString(null), ((haxe.Exception) (null) ), ((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Database", "src/Database.hx", "make"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (58) )) )})) ));
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

