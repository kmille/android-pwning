package b.i.a;

import b.j;

@j(a={1, 1, 13}, b={"\000\026\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\007\030\0002\0060\001j\002`\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005¨\006\006"}, c={"Lkotlin/reflect/full/IllegalPropertyDelegateAccessException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "Ljava/lang/IllegalAccessException;", "(Ljava/lang/IllegalAccessException;)V", "kotlin-reflect-api"})
public final class b
  extends Exception
{
  public b(IllegalAccessException paramIllegalAccessException)
  {
    super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", (Throwable)paramIllegalAccessException);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */