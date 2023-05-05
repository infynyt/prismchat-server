package hx_webserver;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class HTTPServer extends haxe.lang.HxObject
{
	public HTTPServer(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public HTTPServer(java.lang.String ip, int port, java.lang.Object log)
	{
		//line 49 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		hx_webserver.HTTPServer.__hx_ctor_hx_webserver_HTTPServer(this, ip, port, log);
	}
	
	
	protected static void __hx_ctor_hx_webserver_HTTPServer(hx_webserver.HTTPServer __hx_this, java.lang.String ip, int port, java.lang.Object log)
	{
		//line 48 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		__hx_this.on = true;
		//line 46 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		__hx_this.log = false;
		//line 45 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		__hx_this.port = 0;
		//line 44 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		__hx_this.ip = null;
		//line 60 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		__hx_this.onClientConnect = ( (( hx_webserver.HTTPServer___hx_ctor_hx_webserver_HTTPServer_60__Fun.__hx_current != null )) ? (hx_webserver.HTTPServer___hx_ctor_hx_webserver_HTTPServer_60__Fun.__hx_current) : (hx_webserver.HTTPServer___hx_ctor_hx_webserver_HTTPServer_60__Fun.__hx_current = ((hx_webserver.HTTPServer___hx_ctor_hx_webserver_HTTPServer_60__Fun) (new hx_webserver.HTTPServer___hx_ctor_hx_webserver_HTTPServer_60__Fun()) )) );
		//line 49 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		{
			//line 50 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			__hx_this.ip = ip;
			//line 51 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			__hx_this.port = port;
			//line 52 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			if (haxe.lang.Runtime.eq(log, null)) 
			{
				//line 53 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				__hx_this.log = false;
			}
			else
			{
				//line 55 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				__hx_this.log = haxe.lang.Runtime.toBool(((java.lang.Boolean) (log) ));
			}
			
			//line 57 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			__hx_this.on = true;
			//line 58 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			haxe.EntryPoint.addThread(((haxe.lang.Function) (new haxe.lang.Closure(__hx_this, "start")) ));
		}
		
	}
	
	
	public java.lang.String ip;
	
	public int port;
	
	public boolean log;
	
	public sys.net.Socket server;
	
	public boolean on;
	
	public haxe.lang.Function onClientConnect;
	
	public void start()
	{
		//line 61 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		try 
		{
			//line 62 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			this.server = new sys.net.Socket();
			//line 64 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			try 
			{
				//line 64 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				this.server.bind(new sys.net.Host(haxe.lang.Runtime.toString(this.ip)), this.port);
			}
			catch (java.lang.Throwable _g)
			{
				//line 65 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				java.lang.Object _g1 = haxe.Exception.caught(_g).unwrap();
				//line 63 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				if (( _g1 instanceof java.lang.String )) 
				{
					//line 65 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
					java.lang.String err = haxe.lang.Runtime.toString(_g1);
					//line 66 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
					throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( ( ( ( ( "Cannot bind to " + this.ip ) + ":" ) + this.port ) + ", perhaps the port is already being used?\n" ) + err ))) );
				}
				else
				{
					//line 63 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
					throw _g;
				}
				
			}
			
			
			//line 68 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			this.server.listen(256);
			//line 69 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			if (this.log) 
			{
				//line 70 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, ( ( ( "HTTP server successfully initialized at " + this.ip ) + ":" ) + this.port ), 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"hx_webserver.HTTPServer", "hx_webserver/HTTPServer.hx", "start"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (70) )) )}));
			}
			
			//line 61 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			hx_webserver.HTTPServer _gthis = this;
			//line 73 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			while (this.on)
			{
				//line 74 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				try 
				{
					//line 75 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
					sys.net.Socket client = this.server.accept();
					//line 76 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
					java.lang.String head = client.input.readLine();
					//line 78 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
					if (( haxe.lang.StringExt.indexOf(head, "HTTP/1.1", null) != -1 )) 
					{
						//line 79 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						sys.thread._Thread.HaxeThread.create(new hx_webserver.HTTPServer_start_79__Fun(head, client, _gthis), false);
					}
					
				}
				catch (java.lang.Throwable _g2)
				{
					//line 87 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
					haxe.Exception err1 = haxe.Exception.caught(_g2);
					//line 88 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
					if (this.log) 
					{
						//line 89 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						haxe.Log.trace.__hx_invoke2_o(0.0, ( "An error has occurred: " + haxe.root.Std.string(err1) ), 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"hx_webserver.HTTPServer", "hx_webserver/HTTPServer.hx", "start"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (89) )) )}));
					}
					
				}
				
				
			}
			
		}
		catch (java.lang.Throwable typedException)
		{
			//line 61 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(typedException)) );
		}
		
		
	}
	
	
	public haxe.io.Bytes prepareHttpResponse(int code, java.lang.String mime, haxe.io.Bytes value)
	{
		//line 95 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		haxe.io.BytesOutput bytesOutput = new haxe.io.BytesOutput();
		//line 96 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		bytesOutput.writeString(( ( ( "HTTP/1.1 " + code ) + " " ) + hx_webserver.HTTPUtils.codeToMessage(code) ), null);
		//line 97 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		bytesOutput.writeString("\n", null);
		//line 98 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		bytesOutput.writeString(( "Content-Length: " + value.length ), null);
		//line 99 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		bytesOutput.writeString("\n", null);
		//line 100 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		bytesOutput.writeString(( "Content-Type: " + mime ), null);
		//line 101 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		bytesOutput.writeString("\n", null);
		//line 102 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		bytesOutput.writeString("\n", null);
		//line 103 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		bytesOutput.writeString(value.toString(), null);
		//line 104 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		bytesOutput.writeString("\r\n", null);
		//line 107 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		return bytesOutput.getBytes();
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		{
			//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			boolean __temp_executeDef1 = true;
			//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			if (( field != null )) 
			{
				//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				switch (field.hashCode())
				{
					case 3446913:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("port")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							this.port = ((int) (value) );
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return value;
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			if (__temp_executeDef1) 
			{
				//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		{
			//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			boolean __temp_executeDef1 = true;
			//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			if (( field != null )) 
			{
				//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				switch (field.hashCode())
				{
					case -2066729216:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("onClientConnect")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							this.onClientConnect = ((haxe.lang.Function) (value) );
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return value;
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
					case 3367:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("ip")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							this.ip = haxe.lang.Runtime.toString(value);
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return value;
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
					case 3551:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("on")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							this.on = haxe.lang.Runtime.toBool(((java.lang.Boolean) (value) ));
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return value;
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
					case 3446913:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("port")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							this.port = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return value;
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
					case -905826493:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("server")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							this.server = ((sys.net.Socket) (value) );
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return value;
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
					case 107332:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("log")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							this.log = haxe.lang.Runtime.toBool(((java.lang.Boolean) (value) ));
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return value;
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			if (__temp_executeDef1) 
			{
				//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		{
			//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			boolean __temp_executeDef1 = true;
			//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			if (( field != null )) 
			{
				//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				switch (field.hashCode())
				{
					case -514816112:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("prepareHttpResponse")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "prepareHttpResponse")) );
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
					case 3367:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("ip")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return this.ip;
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
					case 109757538:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("start")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "start")) );
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
					case 3446913:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("port")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return this.port;
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
					case -2066729216:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("onClientConnect")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return this.onClientConnect;
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
					case 107332:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("log")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return this.log;
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
					case 3551:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("on")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return this.on;
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
					case -905826493:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("server")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return this.server;
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			if (__temp_executeDef1) 
			{
				//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		{
			//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			boolean __temp_executeDef1 = true;
			//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			if (( field != null )) 
			{
				//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				switch (field.hashCode())
				{
					case 3446913:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("port")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return ((double) (this.port) );
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			if (__temp_executeDef1) 
			{
				//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		{
			//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			boolean __temp_executeDef1 = true;
			//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			if (( field != null )) 
			{
				//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				switch (field.hashCode())
				{
					case -514816112:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("prepareHttpResponse")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							return this.prepareHttpResponse(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), haxe.lang.Runtime.toString(dynargs[1]), ((haxe.io.Bytes) (dynargs[2]) ));
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
					case 109757538:
					{
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						if (field.equals("start")) 
						{
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							__temp_executeDef1 = false;
							//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
							this.start();
						}
						
						//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
			if (__temp_executeDef1) 
			{
				//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		baseArr.push("onClientConnect");
		//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		baseArr.push("on");
		//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		baseArr.push("server");
		//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		baseArr.push("log");
		//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		baseArr.push("port");
		//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		baseArr.push("ip");
		//line 43 "C:\\Users\\saytl\\haxe\\lib\\hx_webserver\\0,0,2\\hx_webserver\\HTTPServer.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


