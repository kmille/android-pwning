package b.i.b.a.b;

@b.j(a={1, 1, 13}, b={"\000\022\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\032\030\020\000\032\b\022\002\b\003\030\0010\001*\0020\0022\006\020\003\032\0020\004¨\006\005"}, c={"tryLoadClass", "Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "fqName", "", "descriptors.runtime"})
public final class d
{
  public static final Class<?> a(ClassLoader paramClassLoader, String paramString)
  {
    b.f.b.j.b(paramClassLoader, "receiver$0");
    b.f.b.j.b(paramString, "fqName");
    try
    {
      paramClassLoader = paramClassLoader.loadClass(paramString);
      return paramClassLoader;
    }
    catch (ClassNotFoundException paramClassLoader)
    {
      for (;;) {}
    }
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */