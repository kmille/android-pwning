package b.d;

import b.k.l;
import b.r;

@b.j(a={1, 1, 13}, b={"\000\036\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\004\n\002\020\000\n\002\b\004\032 \020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\007\032\0020\005H\001\032\"\020\b\032\002H\t\"\n\b\000\020\t\030\001*\0020\n2\006\020\013\032\0020\nH\b¢\006\002\020\f\032\b\020\r\032\0020\005H\002\"\020\020\000\032\0020\0018\000X\004¢\006\002\n\000¨\006\016"}, c={"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "castToBaseType", "T", "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "getJavaVersion", "kotlin-stdlib"})
public final class b
{
  public static final a a;
  
  static
  {
    int i = a();
    if (i >= 65544) {}
    for (;;)
    {
      try
      {
        localObject5 = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
        b.f.b.j.a(localObject5, "Class.forName(\"kotlin.in…entations\").newInstance()");
        if (localObject5 != null) {}
        try
        {
          a locala = (a)localObject5;
        }
        catch (ClassCastException localClassCastException1)
        {
          localObject5 = localObject5.getClass().getClassLoader();
          localClassLoader = a.class.getClassLoader();
          localStringBuilder = new StringBuilder("Instance classloader: ");
          localStringBuilder.append(localObject5);
          localStringBuilder.append(", base type classloader: ");
          localStringBuilder.append(localClassLoader);
          localObject1 = new ClassCastException(localStringBuilder.toString()).initCause((Throwable)localClassCastException1);
          b.f.b.j.a(localObject1, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
          throw ((Throwable)localObject1);
        }
        throw new r("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
      }
      catch (ClassNotFoundException localClassNotFoundException1)
      {
        Object localObject5;
        ClassLoader localClassLoader;
        StringBuilder localStringBuilder;
        Object localObject1;
        Object localObject2;
        continue;
      }
      try
      {
        localObject5 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
        b.f.b.j.a(localObject5, "Class.forName(\"kotlin.in…entations\").newInstance()");
        if (localObject5 != null) {}
        try
        {
          localObject1 = (a)localObject5;
        }
        catch (ClassCastException localClassCastException2)
        {
          localObject5 = localObject5.getClass().getClassLoader();
          localClassLoader = a.class.getClassLoader();
          localStringBuilder = new StringBuilder("Instance classloader: ");
          localStringBuilder.append(localObject5);
          localStringBuilder.append(", base type classloader: ");
          localStringBuilder.append(localClassLoader);
          localObject2 = new ClassCastException(localStringBuilder.toString()).initCause((Throwable)localClassCastException2);
          b.f.b.j.a(localObject2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
          throw ((Throwable)localObject2);
        }
        throw new r("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
      }
      catch (ClassNotFoundException localClassNotFoundException2) {}
    }
    if (i >= 65543) {}
    for (;;)
    {
      try
      {
        localObject5 = Class.forName("b.d.a.a").newInstance();
        b.f.b.j.a(localObject5, "Class.forName(\"kotlin.in…entations\").newInstance()");
        if (localObject5 != null) {}
        try
        {
          localObject2 = (a)localObject5;
        }
        catch (ClassCastException localClassCastException3)
        {
          localObject5 = localObject5.getClass().getClassLoader();
          localClassLoader = a.class.getClassLoader();
          localStringBuilder = new StringBuilder("Instance classloader: ");
          localStringBuilder.append(localObject5);
          localStringBuilder.append(", base type classloader: ");
          localStringBuilder.append(localClassLoader);
          localObject3 = new ClassCastException(localStringBuilder.toString()).initCause((Throwable)localClassCastException3);
          b.f.b.j.a(localObject3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
          throw ((Throwable)localObject3);
        }
        throw new r("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
      }
      catch (ClassNotFoundException localClassNotFoundException3)
      {
        Object localObject3;
        Object localObject4;
        continue;
      }
      try
      {
        localObject5 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
        b.f.b.j.a(localObject5, "Class.forName(\"kotlin.in…entations\").newInstance()");
        if (localObject5 != null) {}
        try
        {
          localObject3 = (a)localObject5;
        }
        catch (ClassCastException localClassCastException4)
        {
          localObject5 = localObject5.getClass().getClassLoader();
          localClassLoader = a.class.getClassLoader();
          localStringBuilder = new StringBuilder("Instance classloader: ");
          localStringBuilder.append(localObject5);
          localStringBuilder.append(", base type classloader: ");
          localStringBuilder.append(localClassLoader);
          localObject4 = new ClassCastException(localStringBuilder.toString()).initCause((Throwable)localClassCastException4);
          b.f.b.j.a(localObject4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
          throw ((Throwable)localObject4);
        }
        throw new r("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
      }
      catch (ClassNotFoundException localClassNotFoundException4) {}
    }
    localObject4 = new a();
    a = (a)localObject4;
  }
  
  private static final int a()
  {
    String str = System.getProperty("java.specification.version");
    if (str == null) {
      return 65542;
    }
    Object localObject = (CharSequence)str;
    int k = l.a((CharSequence)localObject, '.', 0, 6);
    if (k < 0) {}
    try
    {
      i = Integer.parseInt(str);
      return i * 65536;
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      int i;
      int m;
      int j;
      return 65542;
    }
    m = k + 1;
    j = l.a((CharSequence)localObject, '.', m, 4);
    i = j;
    if (j < 0) {
      i = str.length();
    }
    if (str != null)
    {
      localObject = str.substring(0, k);
      b.f.b.j.a(localObject, "(this as java.lang.Strin…ing(startIndex, endIndex)");
      if (str != null)
      {
        str = str.substring(m, i);
        b.f.b.j.a(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
      }
    }
    try
    {
      i = Integer.parseInt((String)localObject);
      j = Integer.parseInt(str);
      return i * 65536 + j;
    }
    catch (NumberFormatException localNumberFormatException2) {}
    throw new r("null cannot be cast to non-null type java.lang.String");
    throw new r("null cannot be cast to non-null type java.lang.String");
    return 65542;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */