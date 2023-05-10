package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class EntryPoint extends haxe.lang.HxObject
{
	static
	{
		//line 37 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		haxe.EntryPoint.mutex = new haxe.java.vm.Mutex();
		//line 39 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		haxe.EntryPoint.mainThread = ((sys.thread._Thread.HaxeThread) (sys.thread._Thread.HaxeThread.get(java.lang.Thread.currentThread())) );
		//line 45 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		haxe.EntryPoint.threadCount = 0;
	}
	
	public EntryPoint(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public EntryPoint()
	{
		//line 35 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		haxe.EntryPoint.__hx_ctor_haxe_EntryPoint(this);
	}
	
	
	protected static void __hx_ctor_haxe_EntryPoint(haxe.EntryPoint __hx_this)
	{
	}
	
	
	public static haxe.java.vm.Mutex mutex;
	
	public static sys.thread._Thread.HaxeThread mainThread;
	
	public static int threadCount;
	
	public static void wakeup()
	{
	}
	
	
	public static void addThread(haxe.lang.Function f)
	{
		//line 73 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		haxe.EntryPoint.mutex.acquire();
		//line 74 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		haxe.EntryPoint.threadCount++;
		//line 75 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		haxe.EntryPoint.mutex.release();
		//line 77 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		sys.thread._Thread.Thread_Impl_.get_events(haxe.EntryPoint.mainThread).promise();
		//line 79 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		sys.thread._Thread.HaxeThread.create(new haxe.EntryPoint_addThread_79__Fun(f), false);
	}
	
	
	public static void run()
	{
	}
	
	
}


