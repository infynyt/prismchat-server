package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		haxe.java.Init.init();
		{
			//line 1 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\?"
			haxe.root.Main.main();
			//line 1 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\?"
			sys.thread._Thread.Thread_Impl_.processEvents();
		}
		;
	}
	
	public Main(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Main()
	{
		//line 11 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		haxe.root.Main.__hx_ctor__Main(this);
	}
	
	
	protected static void __hx_ctor__Main(haxe.root.Main __hx_this)
	{
	}
	
	
	public static hx_webserver.HTTPServer Server;
	
	public static void main()
	{
		//line 15 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		haxe.root.Database.make();
		//line 16 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		haxe.root.Main.Server = new hx_webserver.HTTPServer(haxe.lang.Runtime.toString("0.0.0.0"), ((int) (haxe.root.Reference.SERVER_PORT) ), ((java.lang.Object) (true) ));
		//line 17 "C:\\Users\\saytl\\Documents\\Code\\prismchat\\src\\Main.hx"
		haxe.root.Main.Server.onClientConnect = ( (( haxe.root.Main_main_17__Fun.__hx_current != null )) ? (haxe.root.Main_main_17__Fun.__hx_current) : (haxe.root.Main_main_17__Fun.__hx_current = ((haxe.root.Main_main_17__Fun) (new haxe.root.Main_main_17__Fun()) )) );
	}
	
	
}


