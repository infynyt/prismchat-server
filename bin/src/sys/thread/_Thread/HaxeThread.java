package sys.thread._Thread;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class HaxeThread extends haxe.lang.HxObject
{
	static
	{
		//line 89 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		{
			//line 90 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			sys.thread._Thread.HaxeThread.nativeThreads = ((java.util.Map<java.lang.Thread, sys.thread._Thread.HaxeThread>) (java.util.Collections.synchronizedMap(((java.util.Map<java.lang.Thread, sys.thread._Thread.HaxeThread>) (new java.util.WeakHashMap<java.lang.Thread, sys.thread._Thread.HaxeThread>()) ))) );
			//line 91 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			sys.thread._Thread.HaxeThread.mainJavaThread = java.lang.Thread.currentThread();
			//line 92 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			sys.thread._Thread.HaxeThread.mainHaxeThread = new sys.thread._Thread.HaxeThread();
			//line 93 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			sys.thread._Thread.HaxeThread.mainHaxeThread.events = new sys.thread.EventLoop();
		}
		
	}
	
	public HaxeThread(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public HaxeThread()
	{
		//line 144 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		sys.thread._Thread.HaxeThread.__hx_ctor_sys_thread__Thread_HaxeThread(this);
	}
	
	
	protected static void __hx_ctor_sys_thread__Thread_HaxeThread(sys.thread._Thread.HaxeThread __hx_this)
	{
	}
	
	
	public static java.util.Map<java.lang.Thread, sys.thread._Thread.HaxeThread> nativeThreads;
	
	public static java.lang.Thread mainJavaThread;
	
	public static sys.thread._Thread.HaxeThread mainHaxeThread;
	
	public static sys.thread._Thread.HaxeThread create(haxe.lang.Function job, boolean withEventLoop)
	{
		//line 101 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		sys.thread._Thread.HaxeThread hx = new sys.thread._Thread.HaxeThread();
		//line 102 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		if (withEventLoop) 
		{
			//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			hx.events = new sys.thread.EventLoop();
		}
		
		//line 104 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		sys.thread._Thread.NativeHaxeThread thread = new sys.thread._Thread.NativeHaxeThread(((sys.thread._Thread.HaxeThread) (hx) ), ((haxe.lang.Function) (job) ), haxe.lang.Runtime.toBool(((java.lang.Boolean) (withEventLoop) )));
		//line 105 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		thread.setDaemon(haxe.lang.Runtime.toBool(((java.lang.Boolean) (true) )));
		//line 106 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		thread.start();
		//line 107 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		return hx;
	}
	
	
	public static sys.thread._Thread.HaxeThread get(java.lang.Thread javaThread)
	{
		//line 111 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		if (( javaThread == sys.thread._Thread.HaxeThread.mainJavaThread )) 
		{
			//line 112 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			return sys.thread._Thread.HaxeThread.mainHaxeThread;
		}
		else
		{
			//line 113 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			if (haxe.root.Std.isOfType(javaThread, sys.thread._Thread.NativeHaxeThread.class)) 
			{
				//line 114 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				return ((sys.thread._Thread.NativeHaxeThread) (javaThread) ).haxeThread;
			}
			else
			{
				//line 116 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				sys.thread._Thread.HaxeThread _g = sys.thread._Thread.HaxeThread.nativeThreads.get(((java.lang.Object) (javaThread) ));
				//line 117 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				if (( _g == null )) 
				{
					//line 118 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
					sys.thread._Thread.HaxeThread hx = new sys.thread._Thread.HaxeThread();
					//line 119 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
					sys.thread._Thread.HaxeThread.nativeThreads.put(((java.lang.Thread) (javaThread) ), ((sys.thread._Thread.HaxeThread) (hx) ));
					//line 120 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
					return hx;
				}
				else
				{
					//line 121 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
					sys.thread._Thread.HaxeThread hx1 = _g;
					//line 122 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
					return hx1;
				}
				
			}
			
		}
		
	}
	
	
	public sys.thread.EventLoop events;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		{
			//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			boolean __temp_executeDef1 = true;
			//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			if (( field != null )) 
			{
				//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				switch (field.hashCode())
				{
					case -1291329255:
					{
						//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
						if (field.equals("events")) 
						{
							//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
							__temp_executeDef1 = false;
							//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
							this.events = ((sys.thread.EventLoop) (value) );
							//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
							return value;
						}
						
						//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			if (__temp_executeDef1) 
			{
				//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		{
			//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			boolean __temp_executeDef1 = true;
			//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			if (( field != null )) 
			{
				//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				switch (field.hashCode())
				{
					case -1291329255:
					{
						//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
						if (field.equals("events")) 
						{
							//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
							__temp_executeDef1 = false;
							//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
							return this.events;
						}
						
						//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			if (__temp_executeDef1) 
			{
				//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		baseArr.push("events");
		//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

