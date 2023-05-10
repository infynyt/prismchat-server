package sys.thread;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class NoEventLoopException extends haxe.Exception
{
	public NoEventLoopException(haxe.lang.EmptyObject empty)
	{
		//line 5 "/usr/share/haxe/std/sys/thread/NoEventLoopException.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public NoEventLoopException(java.lang.String msg, haxe.Exception previous)
	{
		//line 7 "/usr/share/haxe/std/sys/thread/NoEventLoopException.hx"
		super(haxe.lang.Runtime.toString(( (( msg == null )) ? ("Event loop is not available. Refer to sys.thread.Thread.runWithEventLoop.") : (msg) )), ((haxe.Exception) (( (( previous == null )) ? (null) : (previous) )) ), ((java.lang.Object) (null) ));
		//line 7 "/usr/share/haxe/std/sys/thread/NoEventLoopException.hx"
		if (( msg == null )) 
		{
			//line 7 "/usr/share/haxe/std/sys/thread/NoEventLoopException.hx"
			msg = "Event loop is not available. Refer to sys.thread.Thread.runWithEventLoop.";
		}
		
	}
	
	
}


