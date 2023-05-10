package sys.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class File extends haxe.lang.HxObject
{
	public File(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public File()
	{
		//line 26 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		sys.io.File.__hx_ctor_sys_io_File(this);
	}
	
	
	protected static void __hx_ctor_sys_io_File(sys.io.File __hx_this)
	{
	}
	
	
	public static java.lang.String getContent(java.lang.String path)
	{
		//line 28 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		sys.io.FileInput f = sys.io.File.read(path, false);
		//line 29 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		java.lang.String ret = f.readAll(null).toString();
		//line 30 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		f.close();
		//line 31 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		return ret;
	}
	
	
	public static void saveContent(java.lang.String path, java.lang.String content)
	{
		//line 35 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		sys.io.FileOutput f = sys.io.File.write(path, false);
		//line 36 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		f.writeString(content, null);
		//line 37 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		f.close();
	}
	
	
	public static haxe.io.Bytes getBytes(java.lang.String path)
	{
		//line 41 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		sys.io.FileInput f = sys.io.File.read(path, true);
		//line 42 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		haxe.io.Bytes ret = f.readAll(null);
		//line 43 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		f.close();
		//line 44 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		return ret;
	}
	
	
	public static sys.io.FileInput read(java.lang.String path, java.lang.Object binary)
	{
		//line 54 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		boolean binary1 = ( (haxe.lang.Runtime.eq(binary, null)) ? (true) : (haxe.lang.Runtime.toBool(((java.lang.Boolean) (binary) ))) );
		//line 55 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		try 
		{
			//line 55 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
			return new sys.io.FileInput(((java.io.RandomAccessFile) (new java.io.RandomAccessFile(((java.io.File) (new java.io.File(haxe.lang.Runtime.toString(path))) ), haxe.lang.Runtime.toString("r"))) ));
		}
		catch (java.lang.Throwable _g)
		{
			//line 56 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
			java.lang.Object e = ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) );
			//line 58 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(e)) );
		}
		
		
	}
	
	
	public static sys.io.FileOutput write(java.lang.String path, java.lang.Object binary)
	{
		//line 62 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		boolean binary1 = ( (haxe.lang.Runtime.eq(binary, null)) ? (true) : (haxe.lang.Runtime.toBool(((java.lang.Boolean) (binary) ))) );
		//line 63 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		java.io.File f = new java.io.File(haxe.lang.Runtime.toString(path));
		//line 64 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		if (f.exists()) 
		{
			//line 65 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
			f.delete();
		}
		
		//line 69 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
		try 
		{
			//line 69 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
			return new sys.io.FileOutput(((java.io.RandomAccessFile) (new java.io.RandomAccessFile(((java.io.File) (f) ), haxe.lang.Runtime.toString("rw"))) ));
		}
		catch (java.lang.Throwable _g)
		{
			//line 70 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
			java.lang.Object e = ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) );
			//line 72 "/usr/share/haxe/std/java/_std/sys/io/File.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(e)) );
		}
		
		
	}
	
	
}


