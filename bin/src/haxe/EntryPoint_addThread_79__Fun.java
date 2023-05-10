package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class EntryPoint_addThread_79__Fun extends haxe.lang.Function
{
	public EntryPoint_addThread_79__Fun(haxe.lang.Function f)
	{
		//line 79 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		super(0, 0);
		//line 79 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		this.f = f;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 80 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		this.f.__hx_invoke0_o();
		//line 81 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		haxe.EntryPoint.mutex.acquire();
		//line 82 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		haxe.EntryPoint.threadCount--;
		//line 83 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		if (( haxe.EntryPoint.threadCount == 0 )) 
		{
			//line 84 "/usr/share/haxe/std/haxe/EntryPoint.hx"
			haxe.EntryPoint.wakeup();
		}
		
		//line 85 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		haxe.EntryPoint.mutex.release();
		//line 87 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		sys.thread._Thread.Thread_Impl_.get_events(haxe.EntryPoint.mainThread).runPromised(( (( haxe.EntryPoint_addThread_87__Fun.__hx_current != null )) ? (haxe.EntryPoint_addThread_87__Fun.__hx_current) : (haxe.EntryPoint_addThread_87__Fun.__hx_current = ((haxe.EntryPoint_addThread_87__Fun) (new haxe.EntryPoint_addThread_87__Fun()) )) ));
		//line 79 "/usr/share/haxe/std/haxe/EntryPoint.hx"
		return null;
	}
	
	
	public haxe.lang.Function f;
	
}


