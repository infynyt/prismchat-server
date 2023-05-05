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
		//line 26 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		sys.io.File.__hx_ctor_sys_io_File(this);
	}
	
	
	protected static void __hx_ctor_sys_io_File(sys.io.File __hx_this)
	{
	}
	
	
	public static haxe.io.Bytes getBytes(java.lang.String path)
	{
		//line 41 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		sys.io.FileInput f = sys.io.File.read(path, true);
		//line 42 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		haxe.io.Bytes ret = f.readAll(null);
		//line 43 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		f.close();
		//line 44 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		return ret;
	}
	
	
	public static sys.io.FileInput read(java.lang.String path, java.lang.Object binary)
	{
		//line 54 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		boolean binary1 = ( (haxe.lang.Runtime.eq(binary, null)) ? (true) : (haxe.lang.Runtime.toBool(((java.lang.Boolean) (binary) ))) );
		//line 55 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		try 
		{
			//line 55 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			return new sys.io.FileInput(((java.io.RandomAccessFile) (new java.io.RandomAccessFile(((java.io.File) (new java.io.File(haxe.lang.Runtime.toString(path))) ), haxe.lang.Runtime.toString("r"))) ));
		}
		catch (java.lang.Throwable _g)
		{
			//line 56 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			java.lang.Object e = ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) );
			//line 58 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(e)) );
		}
		
		
	}
	
	
}


