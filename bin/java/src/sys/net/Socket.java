package sys.net;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Socket extends haxe.lang.HxObject
{
	public Socket(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Socket()
	{
		//line 38 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		sys.net.Socket.__hx_ctor_sys_net_Socket(this);
	}
	
	
	protected static void __hx_ctor_sys_net_Socket(sys.net.Socket __hx_this)
	{
		//line 39 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		__hx_this.create();
	}
	
	
	public haxe.io.Input input;
	
	public haxe.io.Output output;
	
	public java.net.Socket sock;
	
	public java.net.ServerSocket server;
	
	public java.net.SocketAddress boundAddr;
	
	public void create()
	{
		//line 43 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		this.sock = new java.net.Socket();
		//line 45 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		try 
		{
			//line 45 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			this.server = new java.net.ServerSocket();
		}
		catch (java.lang.Throwable _g)
		{
			//line 46 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			java.lang.Object e = ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) );
			//line 47 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(e)) );
		}
		
		
	}
	
	
	public void close()
	{
		//line 51 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		try 
		{
			//line 52 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			if (( this.sock != null )) 
			{
				//line 53 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
				this.sock.close();
			}
			
			//line 54 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			if (( this.server != null )) 
			{
				//line 55 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
				this.server.close();
			}
			
		}
		catch (java.lang.Throwable _g)
		{
			//line 56 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			java.lang.Object e = ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) );
			//line 57 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(e)) );
		}
		
		
	}
	
	
	public void listen(int connections)
	{
		//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		if (( this.boundAddr == null )) 
		{
			//line 79 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown("You must bind the Socket to an address!")) );
		}
		
		//line 81 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		try 
		{
			//line 81 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			this.server.bind(((java.net.SocketAddress) (this.boundAddr) ), ((int) (connections) ));
		}
		catch (java.lang.Throwable _g)
		{
			//line 82 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			java.lang.Object e = ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) );
			//line 83 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(e)) );
		}
		
		
	}
	
	
	public void bind(sys.net.Host host, int port)
	{
		//line 97 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		if (( this.boundAddr != null )) 
		{
			//line 98 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			if (this.server.isBound()) 
			{
				//line 99 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
				throw ((java.lang.RuntimeException) (haxe.Exception.thrown("Already bound")) );
			}
			
		}
		
		//line 101 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		this.boundAddr = new java.net.InetSocketAddress(((java.net.InetAddress) (host.wrapped) ), ((int) (port) ));
	}
	
	
	public sys.net.Socket accept()
	{
		//line 104 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		try 
		{
			//line 105 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			java.net.Socket ret = null;
			//line 105 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			try 
			{
				//line 105 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
				ret = this.server.accept();
			}
			catch (java.lang.Throwable _g)
			{
				//line 105 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
				java.lang.Object e = ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) );
				//line 105 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
				throw ((java.lang.RuntimeException) (haxe.Exception.thrown(e)) );
			}
			
			
			//line 107 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			sys.net.Socket s = new sys.net.Socket();
			//line 108 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			s.sock = ret;
			//line 109 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			s.output = new haxe.java.io.NativeOutput(((java.io.OutputStream) (ret.getOutputStream()) ));
			//line 110 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			s.input = new haxe.java.io.NativeInput(((java.io.InputStream) (ret.getInputStream()) ));
			//line 112 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			return s;
		}
		catch (java.lang.Throwable typedException)
		{
			//line 104 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(typedException)) );
		}
		
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		{
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
				switch (field.hashCode())
				{
					case -1151116657:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("boundAddr")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							this.boundAddr = ((java.net.SocketAddress) (value) );
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return value;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case 100358090:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("input")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							this.input = ((haxe.io.Input) (value) );
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return value;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case -905826493:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("server")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							this.server = ((java.net.ServerSocket) (value) );
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return value;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case -1005512447:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("output")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							this.output = ((haxe.io.Output) (value) );
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return value;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case 3535812:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("sock")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							this.sock = ((java.net.Socket) (value) );
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return value;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		{
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
				switch (field.hashCode())
				{
					case -1423461112:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("accept")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "accept")) );
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case 100358090:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("input")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return this.input;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case 3023933:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("bind")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "bind")) );
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case -1005512447:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("output")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return this.output;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case -1102508601:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("listen")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "listen")) );
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case 3535812:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("sock")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return this.sock;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case 94756344:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("close")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "close")) );
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case -905826493:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("server")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return this.server;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case -1352294148:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("create")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "create")) );
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case -1151116657:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("boundAddr")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return this.boundAddr;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		{
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
				switch (field.hashCode())
				{
					case -1423461112:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("accept")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							return this.accept();
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case -1352294148:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("create")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							this.create();
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case 3023933:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("bind")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							this.bind(((sys.net.Host) (dynargs[0]) ), ((int) (haxe.lang.Runtime.toInt(dynargs[1])) ));
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case 94756344:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("close")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							this.close();
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
					case -1102508601:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						if (field.equals("listen")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
							this.listen(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		baseArr.push("boundAddr");
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		baseArr.push("server");
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		baseArr.push("sock");
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		baseArr.push("output");
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		baseArr.push("input");
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\net\\Socket.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


