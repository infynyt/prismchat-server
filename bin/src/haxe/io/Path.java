package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Path extends haxe.lang.HxObject
{
	public Path(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Path()
	{
		//line 32 "/usr/share/haxe/std/haxe/io/Path.hx"
		haxe.io.Path.__hx_ctor_haxe_io_Path(this);
	}
	
	
	protected static void __hx_ctor_haxe_io_Path(haxe.io.Path __hx_this)
	{
	}
	
	
	public static java.lang.String join(haxe.root.Array<java.lang.String> paths)
	{
		//line 190 "/usr/share/haxe/std/haxe/io/Path.hx"
		haxe.root.Array<java.lang.String> ret = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
		//line 190 "/usr/share/haxe/std/haxe/io/Path.hx"
		{
			//line 190 "/usr/share/haxe/std/haxe/io/Path.hx"
			int _g = 0;
			//line 190 "/usr/share/haxe/std/haxe/io/Path.hx"
			int _g1 = paths.length;
			//line 190 "/usr/share/haxe/std/haxe/io/Path.hx"
			while (( _g < _g1 ))
			{
				//line 190 "/usr/share/haxe/std/haxe/io/Path.hx"
				int i = _g++;
				//line 190 "/usr/share/haxe/std/haxe/io/Path.hx"
				java.lang.String elt = paths.__get(i);
				//line 190 "/usr/share/haxe/std/haxe/io/Path.hx"
				if (( ( elt != null ) &&  ! (haxe.lang.Runtime.valEq(elt, ""))  )) 
				{
					//line 190 "/usr/share/haxe/std/haxe/io/Path.hx"
					ret.push(elt);
				}
				
			}
			
		}
		
		//line 190 "/usr/share/haxe/std/haxe/io/Path.hx"
		haxe.root.Array<java.lang.String> paths1 = ret;
		//line 191 "/usr/share/haxe/std/haxe/io/Path.hx"
		if (( paths1.length == 0 )) 
		{
			//line 192 "/usr/share/haxe/std/haxe/io/Path.hx"
			return "";
		}
		
		//line 194 "/usr/share/haxe/std/haxe/io/Path.hx"
		java.lang.String path = paths1.__get(0);
		//line 195 "/usr/share/haxe/std/haxe/io/Path.hx"
		{
			//line 195 "/usr/share/haxe/std/haxe/io/Path.hx"
			int _g2 = 1;
			//line 195 "/usr/share/haxe/std/haxe/io/Path.hx"
			int _g3 = paths1.length;
			//line 195 "/usr/share/haxe/std/haxe/io/Path.hx"
			while (( _g2 < _g3 ))
			{
				//line 195 "/usr/share/haxe/std/haxe/io/Path.hx"
				int i1 = _g2++;
				//line 196 "/usr/share/haxe/std/haxe/io/Path.hx"
				path = haxe.io.Path.addTrailingSlash(path);
				//line 197 "/usr/share/haxe/std/haxe/io/Path.hx"
				path += paths1.__get(i1);
			}
			
		}
		
		//line 199 "/usr/share/haxe/std/haxe/io/Path.hx"
		return haxe.io.Path.normalize(path);
	}
	
	
	public static java.lang.String normalize(java.lang.String path)
	{
		//line 211 "/usr/share/haxe/std/haxe/io/Path.hx"
		java.lang.String slash = "/";
		//line 212 "/usr/share/haxe/std/haxe/io/Path.hx"
		path = haxe.lang.StringExt.split(path, "\\").join(slash);
		//line 213 "/usr/share/haxe/std/haxe/io/Path.hx"
		if (haxe.lang.Runtime.valEq(path, slash)) 
		{
			//line 214 "/usr/share/haxe/std/haxe/io/Path.hx"
			return slash;
		}
		
		//line 216 "/usr/share/haxe/std/haxe/io/Path.hx"
		haxe.root.Array<java.lang.String> target = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
		//line 218 "/usr/share/haxe/std/haxe/io/Path.hx"
		{
			//line 218 "/usr/share/haxe/std/haxe/io/Path.hx"
			int _g = 0;
			//line 218 "/usr/share/haxe/std/haxe/io/Path.hx"
			haxe.root.Array<java.lang.String> _g1 = haxe.lang.StringExt.split(path, slash);
			//line 218 "/usr/share/haxe/std/haxe/io/Path.hx"
			while (( _g < _g1.length ))
			{
				//line 218 "/usr/share/haxe/std/haxe/io/Path.hx"
				java.lang.String token = _g1.__get(_g);
				//line 218 "/usr/share/haxe/std/haxe/io/Path.hx"
				 ++ _g;
				//line 219 "/usr/share/haxe/std/haxe/io/Path.hx"
				if (( ( haxe.lang.Runtime.valEq(token, "..") && ( target.length > 0 ) ) &&  ! (haxe.lang.Runtime.valEq(target.__get(( target.length - 1 )), ".."))  )) 
				{
					//line 220 "/usr/share/haxe/std/haxe/io/Path.hx"
					java.lang.String __temp_expr1 = haxe.lang.Runtime.toString(target.pop());
				}
				else
				{
					//line 221 "/usr/share/haxe/std/haxe/io/Path.hx"
					if (haxe.lang.Runtime.valEq(token, "")) 
					{
						//line 222 "/usr/share/haxe/std/haxe/io/Path.hx"
						if (( ( target.length > 0 ) || haxe.lang.Runtime.eq(haxe.lang.StringExt.charCodeAt(path, 0), 47) )) 
						{
							//line 223 "/usr/share/haxe/std/haxe/io/Path.hx"
							target.push(token);
						}
						
					}
					else
					{
						//line 225 "/usr/share/haxe/std/haxe/io/Path.hx"
						if ( ! (haxe.lang.Runtime.valEq(token, ".")) ) 
						{
							//line 226 "/usr/share/haxe/std/haxe/io/Path.hx"
							target.push(token);
						}
						
					}
					
				}
				
			}
			
		}
		
		//line 230 "/usr/share/haxe/std/haxe/io/Path.hx"
		java.lang.String tmp = target.join(slash);
		//line 231 "/usr/share/haxe/std/haxe/io/Path.hx"
		haxe.root.StringBuf acc = new haxe.root.StringBuf();
		//line 232 "/usr/share/haxe/std/haxe/io/Path.hx"
		boolean colon = false;
		//line 233 "/usr/share/haxe/std/haxe/io/Path.hx"
		boolean slashes = false;
		//line 235 "/usr/share/haxe/std/haxe/io/Path.hx"
		{
			//line 235 "/usr/share/haxe/std/haxe/io/Path.hx"
			int _g2_offset = 0;
			//line 235 "/usr/share/haxe/std/haxe/io/Path.hx"
			java.lang.String _g2_s = tmp;
			//line 235 "/usr/share/haxe/std/haxe/io/Path.hx"
			while (( _g2_offset < _g2_s.length() ))
			{
				//line 235 "/usr/share/haxe/std/haxe/io/Path.hx"
				java.lang.String s = _g2_s;
				//line 235 "/usr/share/haxe/std/haxe/io/Path.hx"
				int index = _g2_offset++;
				//line 235 "/usr/share/haxe/std/haxe/io/Path.hx"
				int c = ( (( index < s.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s) )) ).charAt(index)) )) : (-1) );
				//line 235 "/usr/share/haxe/std/haxe/io/Path.hx"
				if (( ( c >= 55296 ) && ( c <= 56319 ) )) 
				{
					//line 235 "/usr/share/haxe/std/haxe/io/Path.hx"
					int index1 = ( index + 1 );
					//line 635 "/usr/share/haxe/std/StringTools.hx"
					c = ( ( ( c - 55232 ) << 10 ) | ( (( (( index1 < s.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s) )) ).charAt(index1)) )) : (-1) )) & 1023 ) );
				}
				
				//line 235 "/usr/share/haxe/std/haxe/io/Path.hx"
				int c1 = c;
				//line 235 "/usr/share/haxe/std/haxe/io/Path.hx"
				if (( c1 >= 65536 )) 
				{
					//line 235 "/usr/share/haxe/std/haxe/io/Path.hx"
					 ++ _g2_offset;
				}
				
				//line 235 "/usr/share/haxe/std/haxe/io/Path.hx"
				int c2 = c1;
				//line 236 "/usr/share/haxe/std/haxe/io/Path.hx"
				switch (c2)
				{
					case 47:
					{
						//line 244 "/usr/share/haxe/std/haxe/io/Path.hx"
						if ( ! (colon) ) 
						{
							//line 245 "/usr/share/haxe/std/haxe/io/Path.hx"
							slashes = true;
						}
						else
						{
							//line 246 "/usr/share/haxe/std/haxe/io/Path.hx"
							int i = c2;
							//line 246 "/usr/share/haxe/std/haxe/io/Path.hx"
							{
								//line 247 "/usr/share/haxe/std/haxe/io/Path.hx"
								colon = false;
								//line 248 "/usr/share/haxe/std/haxe/io/Path.hx"
								if (slashes) 
								{
									//line 249 "/usr/share/haxe/std/haxe/io/Path.hx"
									acc.add(haxe.lang.Runtime.toString("/"));
									//line 249 "/usr/share/haxe/std/haxe/io/Path.hx"
									java.lang.Object __temp_expr3 = ((java.lang.Object) (null) );
									//line 250 "/usr/share/haxe/std/haxe/io/Path.hx"
									slashes = false;
								}
								
								//line 252 "/usr/share/haxe/std/haxe/io/Path.hx"
								acc.addChar(i);
							}
							
						}
						
						//line 244 "/usr/share/haxe/std/haxe/io/Path.hx"
						break;
					}
					
					
					case 58:
					{
						//line 242 "/usr/share/haxe/std/haxe/io/Path.hx"
						acc.add(haxe.lang.Runtime.toString(":"));
						//line 242 "/usr/share/haxe/std/haxe/io/Path.hx"
						java.lang.Object __temp_expr4 = ((java.lang.Object) (null) );
						//line 243 "/usr/share/haxe/std/haxe/io/Path.hx"
						colon = true;
						//line 241 "/usr/share/haxe/std/haxe/io/Path.hx"
						break;
					}
					
					
					default:
					{
						//line 246 "/usr/share/haxe/std/haxe/io/Path.hx"
						int i1 = c2;
						//line 246 "/usr/share/haxe/std/haxe/io/Path.hx"
						{
							//line 247 "/usr/share/haxe/std/haxe/io/Path.hx"
							colon = false;
							//line 248 "/usr/share/haxe/std/haxe/io/Path.hx"
							if (slashes) 
							{
								//line 249 "/usr/share/haxe/std/haxe/io/Path.hx"
								acc.add(haxe.lang.Runtime.toString("/"));
								//line 249 "/usr/share/haxe/std/haxe/io/Path.hx"
								java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
								//line 250 "/usr/share/haxe/std/haxe/io/Path.hx"
								slashes = false;
							}
							
							//line 252 "/usr/share/haxe/std/haxe/io/Path.hx"
							acc.addChar(i1);
						}
						
						//line 246 "/usr/share/haxe/std/haxe/io/Path.hx"
						break;
					}
					
				}
				
			}
			
		}
		
		//line 256 "/usr/share/haxe/std/haxe/io/Path.hx"
		return acc.toString();
	}
	
	
	public static java.lang.String addTrailingSlash(java.lang.String path)
	{
		//line 272 "/usr/share/haxe/std/haxe/io/Path.hx"
		if (( path.length() == 0 )) 
		{
			//line 273 "/usr/share/haxe/std/haxe/io/Path.hx"
			return "/";
		}
		
		//line 274 "/usr/share/haxe/std/haxe/io/Path.hx"
		int c1 = haxe.lang.StringExt.lastIndexOf(path, "/", null);
		//line 275 "/usr/share/haxe/std/haxe/io/Path.hx"
		int c2 = haxe.lang.StringExt.lastIndexOf(path, "\\", null);
		//line 276 "/usr/share/haxe/std/haxe/io/Path.hx"
		if (( c1 < c2 )) 
		{
			//line 277 "/usr/share/haxe/std/haxe/io/Path.hx"
			if (( c2 != ( path.length() - 1 ) )) 
			{
				//line 278 "/usr/share/haxe/std/haxe/io/Path.hx"
				return ( path + "\\" );
			}
			else
			{
				//line 280 "/usr/share/haxe/std/haxe/io/Path.hx"
				return path;
			}
			
		}
		else
		{
			//line 282 "/usr/share/haxe/std/haxe/io/Path.hx"
			if (( c1 != ( path.length() - 1 ) )) 
			{
				//line 283 "/usr/share/haxe/std/haxe/io/Path.hx"
				return ( path + "/" );
			}
			else
			{
				//line 285 "/usr/share/haxe/std/haxe/io/Path.hx"
				return path;
			}
			
		}
		
	}
	
	
}


