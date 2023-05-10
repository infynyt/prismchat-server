package hx_webserver;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class HTTPServer_start_79__Fun extends haxe.lang.Function
{
	public HTTPServer_start_79__Fun(java.lang.String head, sys.net.Socket client, hx_webserver.HTTPServer _gthis)
	{
		//line 79 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPServer.hx"
		super(0, 0);
		//line 79 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPServer.hx"
		this.head = head;
		//line 79 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPServer.hx"
		this.client = client;
		//line 79 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPServer.hx"
		this._gthis = _gthis;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 80 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPServer.hx"
		hx_webserver.HTTPRequest req = new hx_webserver.HTTPRequest(((sys.net.Socket) (this.client) ), ((hx_webserver.HTTPServer) (this._gthis) ), haxe.lang.Runtime.toString(this.head));
		//line 81 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPServer.hx"
		this._gthis.onClientConnect.__hx_invoke1_o(0.0, req);
		//line 82 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPServer.hx"
		if (this._gthis.log) 
		{
			//line 83 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPServer.hx"
			haxe.Log.trace.__hx_invoke2_o(0.0, "A new connection has been detected", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"hx_webserver.HTTPServer", "hx_webserver/HTTPServer.hx", "start"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (83) )) )}));
		}
		
		//line 79 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPServer.hx"
		return null;
	}
	
	
	public java.lang.String head;
	
	public sys.net.Socket client;
	
	public hx_webserver.HTTPServer _gthis;
	
}


