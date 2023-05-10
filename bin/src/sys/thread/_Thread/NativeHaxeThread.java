package sys.thread._Thread;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class NativeHaxeThread extends java.lang.Thread implements haxe.lang.IHxObject
{
	public NativeHaxeThread(haxe.lang.EmptyObject empty)
	{
		//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		super();
	}
	
	
	public NativeHaxeThread(sys.thread._Thread.HaxeThread haxeThread, haxe.lang.Function job, boolean withEventLoop)
	{
		//line 160 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		super(((java.lang.Runnable) (new sys.thread._Thread.Job(((haxe.lang.Function) (job) ))) ));
		//line 161 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		this.haxeThread = haxeThread;
		//line 162 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		this.withEventLoop = withEventLoop;
	}
	
	
	public sys.thread._Thread.HaxeThread haxeThread;
	
	public boolean withEventLoop;
	
	@Override public void run()
	{
		//line 166 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		super.run();
		//line 167 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		if (this.withEventLoop) 
		{
			//line 168 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			this.haxeThread.events.loop();
		}
		
	}
	
	
	public java.lang.Object __hx_lookupField(java.lang.String field, boolean throwErrors, boolean isCheck)
	{
		//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		if (isCheck) 
		{
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			return haxe.lang.Runtime.undefined;
		}
		else
		{
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			if (throwErrors) 
			{
				//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
				throw new java.lang.RuntimeException(haxe.lang.Runtime.toString("Field not found."));
			}
			else
			{
				//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
				return null;
			}
			
		}
		
	}
	
	
	public double __hx_lookupField_f(java.lang.String field, boolean throwErrors)
	{
		//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		if (throwErrors) 
		{
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			throw new java.lang.RuntimeException(haxe.lang.Runtime.toString("Field not found or incompatible field type."));
		}
		else
		{
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			return 0.0;
		}
		
	}
	
	
	public java.lang.Object __hx_lookupSetField(java.lang.String field, java.lang.Object value)
	{
		//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		throw new java.lang.RuntimeException(haxe.lang.Runtime.toString("Cannot access field for writing."));
	}
	
	
	public double __hx_lookupSetField_f(java.lang.String field, double value)
	{
		//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		throw new java.lang.RuntimeException(haxe.lang.Runtime.toString("Cannot access field for writing or incompatible type."));
	}
	
	
	public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		{
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			{
				//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
				return this.__hx_lookupSetField_f(field, value);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		{
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			boolean __temp_executeDef1 = true;
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			if (( field != null )) 
			{
				//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
				switch (field.hashCode())
				{
					case 898219576:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("withEventLoop")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							this.withEventLoop = haxe.lang.Runtime.toBool(((java.lang.Boolean) (value) ));
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return value;
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case -1855166640:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("haxeThread")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							this.haxeThread = ((sys.thread._Thread.HaxeThread) (value) );
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return value;
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			if (__temp_executeDef1) 
			{
				//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
				return this.__hx_lookupSetField(field, value);
			}
			else
			{
				//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		{
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			boolean __temp_executeDef1 = true;
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			if (( field != null )) 
			{
				//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
				switch (field.hashCode())
				{
					case 94756189:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("clone")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "clone")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case -1855166640:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("haxeThread")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return this.haxeThread;
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 109757538:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("start")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "start")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 898219576:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("withEventLoop")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return this.withEventLoop;
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 3540994:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("stop")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "stop")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 113291:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("run")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "run")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 503000675:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("interrupt")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "interrupt")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case -1671974670:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("setUncaughtExceptionHandler")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setUncaughtExceptionHandler")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 937282232:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("isInterrupted")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isInterrupted")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case -326440986:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("getUncaughtExceptionHandler")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getUncaughtExceptionHandler")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 1557372922:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("destroy")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "destroy")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 1965583067:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("getState")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getState")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 2054309315:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("isAlive")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isAlive")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 98245393:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("getId")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getId")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case -1852006340:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("suspend")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "suspend")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 1728531347:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("getStackTrace")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getStackTrace")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case -934426579:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("resume")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "resume")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case -579858818:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("setContextClassLoader")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setContextClassLoader")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 823859238:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("setPriority")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setPriority")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 1178897522:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("getContextClassLoader")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getContextClassLoader")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 912439066:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("getPriority")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getPriority")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case -1776922004:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("toString")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 1984801293:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("setName")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setName")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 237150348:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("checkAccess")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "checkAccess")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case -75308287:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("getName")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getName")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case -665319346:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("isDaemon")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isDaemon")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 1268544863:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("getThreadGroup")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getThreadGroup")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 142044550:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("setDaemon")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setDaemon")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 1346802879:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("countStackFrames")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "countStackFrames")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
					case 3267882:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (field.equals("join")) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "join")) );
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			if (__temp_executeDef1) 
			{
				//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
				return this.__hx_lookupField(field, throwErrors, isCheck);
			}
			else
			{
				//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		{
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			{
				//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
				return this.__hx_lookupField_f(field, throwErrors);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		{
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			int __temp_hash2 = field.hashCode();
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			boolean __temp_executeDef1 = true;
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			if (( field != null )) 
			{
				//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
				switch (__temp_hash2)
				{
					case 94756189:
					case 109757538:
					case 3540994:
					case 503000675:
					case 937282232:
					case 1557372922:
					case 2054309315:
					case -1852006340:
					case -934426579:
					case 823859238:
					case 912439066:
					case 1984801293:
					case -75308287:
					case 1268544863:
					case 1346802879:
					case 3267882:
					case 142044550:
					case -665319346:
					case 237150348:
					case -1776922004:
					case 1178897522:
					case -579858818:
					case 1728531347:
					case 98245393:
					case 1965583067:
					case -326440986:
					case -1671974670:
					case 113291:
					{
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						if (( (( ( __temp_hash2 == 94756189 ) && field.equals("clone") )) || ( (( ( __temp_hash2 == 109757538 ) && field.equals("start") )) || ( (( ( __temp_hash2 == 3540994 ) && field.equals("stop") )) || ( (( ( __temp_hash2 == 503000675 ) && field.equals("interrupt") )) || ( (( ( __temp_hash2 == 937282232 ) && field.equals("isInterrupted") )) || ( (( ( __temp_hash2 == 1557372922 ) && field.equals("destroy") )) || ( (( ( __temp_hash2 == 2054309315 ) && field.equals("isAlive") )) || ( (( ( __temp_hash2 == -1852006340 ) && field.equals("suspend") )) || ( (( ( __temp_hash2 == -934426579 ) && field.equals("resume") )) || ( (( ( __temp_hash2 == 823859238 ) && field.equals("setPriority") )) || ( (( ( __temp_hash2 == 912439066 ) && field.equals("getPriority") )) || ( (( ( __temp_hash2 == 1984801293 ) && field.equals("setName") )) || ( (( ( __temp_hash2 == -75308287 ) && field.equals("getName") )) || ( (( ( __temp_hash2 == 1268544863 ) && field.equals("getThreadGroup") )) || ( (( ( __temp_hash2 == 1346802879 ) && field.equals("countStackFrames") )) || ( (( ( __temp_hash2 == 3267882 ) && field.equals("join") )) || ( (( ( __temp_hash2 == 142044550 ) && field.equals("setDaemon") )) || ( (( ( __temp_hash2 == -665319346 ) && field.equals("isDaemon") )) || ( (( ( __temp_hash2 == 237150348 ) && field.equals("checkAccess") )) || ( (( ( __temp_hash2 == -1776922004 ) && field.equals("toString") )) || ( (( ( __temp_hash2 == 1178897522 ) && field.equals("getContextClassLoader") )) || ( (( ( __temp_hash2 == -579858818 ) && field.equals("setContextClassLoader") )) || ( (( ( __temp_hash2 == 1728531347 ) && field.equals("getStackTrace") )) || ( (( ( __temp_hash2 == 98245393 ) && field.equals("getId") )) || ( (( ( __temp_hash2 == 1965583067 ) && field.equals("getState") )) || ( (( ( __temp_hash2 == -326440986 ) && field.equals("getUncaughtExceptionHandler") )) || ( (( ( __temp_hash2 == -1671974670 ) && field.equals("setUncaughtExceptionHandler") )) || field.equals("run") ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )) 
						{
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							__temp_executeDef1 = false;
							//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
							return haxe.lang.Runtime.slowCallField(this, field, dynargs);
						}
						
						//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
			if (__temp_executeDef1) 
			{
				//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
				return ((haxe.lang.Function) (this.__hx_getField(field, true, false, false)) ).__hx_invokeDynamic(dynargs);
			}
			else
			{
				//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		baseArr.push("withEventLoop");
		//line 155 "/usr/share/haxe/std/java/_std/sys/thread/Thread.hx"
		baseArr.push("haxeThread");
	}
	
	
}


