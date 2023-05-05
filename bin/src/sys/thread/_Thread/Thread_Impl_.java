package sys.thread._Thread;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Thread_Impl_
{
	
	
	public static sys.thread.EventLoop get_events(sys.thread._Thread.HaxeThread this1)
	{
		//line 73 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		if (( this1.events == null )) 
		{
			//line 74 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			throw new sys.thread.NoEventLoopException(haxe.lang.Runtime.toString(null), ((haxe.Exception) (null) ));
		}
		
		//line 75 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		return this1.events;
	}
	
	
	public static void processEvents()
	{
		//line 80 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		((sys.thread._Thread.HaxeThread) (sys.thread._Thread.HaxeThread.get(java.lang.Thread.currentThread())) ).events.loop();
	}
	
	
}


