package sys;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FileSystem extends haxe.lang.HxObject
{
	public FileSystem(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public FileSystem()
	{
		//line 29 "/usr/share/haxe/std/java/_std/sys/FileSystem.hx"
		sys.FileSystem.__hx_ctor_sys_FileSystem(this);
	}
	
	
	protected static void __hx_ctor_sys_FileSystem(sys.FileSystem __hx_this)
	{
	}
	
	
	public static boolean exists(java.lang.String path)
	{
		//line 31 "/usr/share/haxe/std/java/_std/sys/FileSystem.hx"
		return new java.io.File(haxe.lang.Runtime.toString(path)).exists();
	}
	
	
}


