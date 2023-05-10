package hx_webserver;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class HTTPUtils extends haxe.lang.HxObject
{
	public HTTPUtils(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public HTTPUtils()
	{
		//line 3 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
		hx_webserver.HTTPUtils.__hx_ctor_hx_webserver_HTTPUtils(this);
	}
	
	
	protected static void __hx_ctor_hx_webserver_HTTPUtils(hx_webserver.HTTPUtils __hx_this)
	{
	}
	
	
	public static java.lang.String codeToMessage(int code)
	{
		//line 5 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
		java.lang.String message = "";
		//line 6 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
		switch (code)
		{
			case 100:
			{
				//line 8 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Continue";
				//line 8 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 101:
			{
				//line 10 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Switching Protocols";
				//line 10 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 102:
			{
				//line 12 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Processing";
				//line 12 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 103:
			{
				//line 14 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Early Hints";
				//line 14 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 200:
			{
				//line 16 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "OK";
				//line 16 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 201:
			{
				//line 18 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Created";
				//line 18 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 202:
			{
				//line 20 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Accepted";
				//line 20 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 203:
			{
				//line 22 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Non-authoritative Information";
				//line 22 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 204:
			{
				//line 24 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "No Content";
				//line 24 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 205:
			{
				//line 26 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Reset Content";
				//line 26 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 206:
			{
				//line 28 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Partial Content";
				//line 28 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 207:
			{
				//line 30 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Multi-Status";
				//line 30 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 208:
			{
				//line 32 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Already Reported";
				//line 32 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 226:
			{
				//line 34 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "IM Used";
				//line 34 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 300:
			{
				//line 36 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Multiple Choices";
				//line 36 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 301:
			{
				//line 38 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Moved Permanently";
				//line 38 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 302:
			{
				//line 40 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Found";
				//line 40 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 303:
			{
				//line 42 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "See Other";
				//line 42 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 304:
			{
				//line 44 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Not Modified";
				//line 44 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 305:
			{
				//line 46 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Use Proxy";
				//line 46 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 306:
			{
				//line 48 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "unused";
				//line 48 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 307:
			{
				//line 50 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Temporary Redirect";
				//line 50 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 308:
			{
				//line 52 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Permanent Redirect";
				//line 52 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 400:
			{
				//line 54 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Bad Request";
				//line 54 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 401:
			{
				//line 56 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Unauthorized";
				//line 56 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 402:
			{
				//line 58 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Payment Required";
				//line 58 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 403:
			{
				//line 60 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Forbidden";
				//line 60 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 404:
			{
				//line 62 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Not Found";
				//line 62 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 405:
			{
				//line 64 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Method Not Allowed";
				//line 64 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 406:
			{
				//line 66 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Not Acceptable";
				//line 66 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 407:
			{
				//line 68 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Proxy Authentication Required";
				//line 68 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 408:
			{
				//line 70 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Request Timeout";
				//line 70 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 409:
			{
				//line 72 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Conflict";
				//line 72 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 410:
			{
				//line 74 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Gone";
				//line 74 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 411:
			{
				//line 76 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Length Required";
				//line 76 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 412:
			{
				//line 78 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Precondition Failed";
				//line 78 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 413:
			{
				//line 80 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Payload Too Large";
				//line 80 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 414:
			{
				//line 82 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "URI Too Long";
				//line 82 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 415:
			{
				//line 84 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Unsupported Media Type";
				//line 84 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 416:
			{
				//line 86 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Range Not Satisfiable";
				//line 86 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 417:
			{
				//line 88 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Expectation Failed";
				//line 88 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 418:
			{
				//line 90 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "I\'m a teapot";
				//line 90 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 421:
			{
				//line 92 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Misdirected Request";
				//line 92 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 422:
			{
				//line 94 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Unprocessable Content";
				//line 94 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 423:
			{
				//line 96 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Locked";
				//line 96 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 424:
			{
				//line 98 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Failed Dependency";
				//line 98 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 425:
			{
				//line 100 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Too Early";
				//line 100 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 426:
			{
				//line 102 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Upgrade Required";
				//line 102 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 428:
			{
				//line 104 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Precondition Required";
				//line 104 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 429:
			{
				//line 106 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Too Many Requests";
				//line 106 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 431:
			{
				//line 108 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Request Header Fields Too Large";
				//line 108 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 451:
			{
				//line 110 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Unavailable For Legal Reasons";
				//line 110 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 500:
			{
				//line 112 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Internal Server Error";
				//line 112 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 501:
			{
				//line 114 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Not Implemented";
				//line 114 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 502:
			{
				//line 116 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Bad Gateway";
				//line 116 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 503:
			{
				//line 118 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Service Unavailable";
				//line 118 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 504:
			{
				//line 120 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Gateway Timeout";
				//line 120 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 505:
			{
				//line 122 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "HTTP Version Not Supported";
				//line 122 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 506:
			{
				//line 124 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Variant Also Negotiates";
				//line 124 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 507:
			{
				//line 126 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Insufficient Storage";
				//line 126 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 508:
			{
				//line 128 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Loop Detected";
				//line 128 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 510:
			{
				//line 130 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Not Extended";
				//line 130 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
			case 511:
			{
				//line 132 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				message = "Network Authentication Required";
				//line 132 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				break;
			}
			
			
		}
		
		//line 134 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
		return message;
	}
	
	
	public static java.lang.String getMimeType(java.lang.String file)
	{
		//line 140 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
		java.lang.String mimetype = "";
		//line 141 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
		haxe.root.Array<java.lang.String> split = haxe.lang.StringExt.split(file, ".");
		//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
		{
			//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
			java.lang.String __temp_svar1 = (split.__get(( split.length - 1 )));
			//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
			int __temp_hash3 = __temp_svar1.hashCode();
			//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
			boolean __temp_executeDef2 = true;
			//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
			if (( __temp_svar1 != null )) 
			{
				//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				switch (__temp_hash3)
				{
					case 52254:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("3g2")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 283 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "video/3gpp2";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 120609:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("zip")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 279 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/zip";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 52316:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("3gp")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 281 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "video/3gpp";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 119055:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("xul")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 277 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/vnd.mozilla.xul+xml";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 1827:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("7z")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 285 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/x-7z-compressed";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 118807:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("xml")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 275 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/xml";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 96323:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("aac")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 145 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "audio/aac";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3682393:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("xlsx")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 273 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 96374:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("abw")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 147 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/x-abiword";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 118783:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("xls")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 271 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/vnd.ms-excel";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 96850:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("arc")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 149 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/x-freearc";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 114035747:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("xhtml")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 269 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/xhtml+xml";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 96980:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("avi")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 153 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "video/x-msvideo";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 113307034:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("woff2")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 267 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "font/woff2";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3006482:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("avif")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 151 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "image/avif";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3655064:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("woff")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 265 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "font/woff";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 97118:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("azw")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 155 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/vnd.amazon.ebook";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3645340:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("webp")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 263 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "image/webp";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 97543:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("bin")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 157 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/octet-stream";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3645337:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("webm")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 261 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "video/webm";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 97669:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("bmp")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 159 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "image/bmp";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3645325:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("weba")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 259 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "audio/webm";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3160:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("bz")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 161 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/x-bzip";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 117484:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("wav")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 257 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "audio/wav";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 98010:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("bz2")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 163 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/x-bzip2";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 117063:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("vsd")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 255 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/vnd.visio";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 98336:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("cda")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 165 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/x-cdf";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 115312:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("txt")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 253 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "text/plain";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 98808:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("csh")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 167 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/x-csh";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 115174:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("ttf")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 251 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "font/ttf";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 98819:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("css")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 169 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "text/css";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3711:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("ts")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 249 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "video/mp2t";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 98822:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("csv")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 171 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "text/csv";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3559925:
					case 114833:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (( (( ( __temp_hash3 == 3559925 ) && __temp_svar1.equals("tiff") )) || __temp_svar1.equals("tif") )) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 247 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "image/tiff";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 99640:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("doc")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 173 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/msword";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 114597:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("tar")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 245 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/x-tar";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3088960:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("docx")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 175 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 114276:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("svg")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 243 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "image/svg+xml";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 100618:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("eot")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 177 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/vnd.ms-fontopbject";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3669:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("sh")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 241 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/x-sh";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3120248:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("epub")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 179 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/epub+zip";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 113252:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("rtf")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 239 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/rtf";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 102340:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("gif")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 183 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "image/gif";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 112675:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("rar")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 237 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/vnd.rar";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3315:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("gz")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 181 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/gzip";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3447940:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("pptx")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 235 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/vnd.openxmlformats-officedocument.presentationml.presentation";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3213227:
					case 103649:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (( (( ( __temp_hash3 == 3213227 ) && __temp_svar1.equals("html") )) || __temp_svar1.equals("htm") )) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 185 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "text/html";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 111220:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("ppt")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 233 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/vnd.ms-powerpoint";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 104085:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("ico")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 187 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "image/vnd.microsoft.icon";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 111145:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("png")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 227 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "image/png";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 104089:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("ics")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 189 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "text/calendar";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 110968:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("php")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 231 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/x-httpd-php";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 104987:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("jar")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 191 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/java-archive";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 110834:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("pdf")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 229 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/pdf";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 105441:
					case 3268712:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (( (( ( __temp_hash3 == 105441 ) && __temp_svar1.equals("jpg") )) || __temp_svar1.equals("jpeg") )) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 193 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "image/jpeg";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 110369:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("otf")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 225 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "font/otf";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3401:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("js")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 195 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "text/javascript";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3418175:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("opus")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 223 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "audio/opus";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3271912:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("json")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 197 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/json";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 109982:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("ogv")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 221 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "video/ogg";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case -1150656416:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("jsonld")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 199 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/ls+json";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 109967:
					case 109961:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (( (( ( __temp_hash3 == 109967 ) && __temp_svar1.equals("ogg") )) || __temp_svar1.equals("oga") )) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 219 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "audio/ogg";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3351329:
					case 108104:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (( (( ( __temp_hash3 == 3351329 ) && __temp_svar1.equals("midi") )) || __temp_svar1.equals("mid") )) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 201 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "audio/midi";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 109887:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("odt")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 217 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/vnd.oasis.opendocument.text";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 108150:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("mjs")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 203 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "text/javascript";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 109886:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("ods")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 215 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/vnd.oasis.opendocument.spreadsheet";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 108272:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("mp3")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 205 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "audio/mpeg";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 109883:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("odp")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 213 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/vnd.oasis.opendocument.presentation";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 108273:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("mp4")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 207 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "video/mp4";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3358271:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("mpkg")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 211 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "application/vnd.apple.installer+xml";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
					case 3358085:
					{
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						if (__temp_svar1.equals("mpeg")) 
						{
							//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							__temp_executeDef2 = false;
							//line 209 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
							mimetype = "video/mpeg";
						}
						
						//line 142 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 287 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
			if (__temp_executeDef2) 
			{
				//line 287 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
				mimetype = "text/plain";
			}
			
		}
		
		//line 289 "/home/sidgames5/haxe/lib/hx_webserver/0,0,2/hx_webserver/HTTPUtils.hx"
		return mimetype;
	}
	
	
}


