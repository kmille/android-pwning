package b.i.b.a.c.d.a;

import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.r;

public final class o
{
  public static final b.i.b.a.c.f.b a = new b.i.b.a.c.f.b("kotlin.jvm.JvmField");
  public static final b.i.b.a.c.f.a b = b.i.b.a.c.f.a.a(new b.i.b.a.c.f.b("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
  
  public static boolean a(ah paramah)
  {
    if (paramah.t() == b.a.b) {
      return false;
    }
    Object localObject = paramah.a();
    if ((b.i.b.a.c.i.d.g((l)localObject)) && (b.i.b.a.c.i.d.m(((l)localObject).a())))
    {
      localObject = (e)localObject;
      b.i.b.a.c.a.d locald = b.i.b.a.c.a.d.a;
      if (!b.i.b.a.c.a.d.a((e)localObject))
      {
        i = 1;
        break label64;
      }
    }
    int i = 0;
    label64:
    if (i != 0) {
      return true;
    }
    if (b.i.b.a.c.i.d.g(paramah.a()))
    {
      if ((paramah instanceof ah))
      {
        localObject = ((ah)paramah).w();
        if ((localObject != null) && (((r)localObject).r().b(a)))
        {
          bool = true;
          break label140;
        }
      }
      boolean bool = paramah.r().b(a);
      label140:
      if (bool) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean a(String paramString)
  {
    return (paramString.startsWith("get")) || (paramString.startsWith("is"));
  }
  
  public static boolean b(String paramString)
  {
    return paramString.startsWith("set");
  }
  
  public static String c(String paramString)
  {
    if (e(paramString)) {
      return paramString;
    }
    StringBuilder localStringBuilder = new StringBuilder("get");
    localStringBuilder.append(b.i.b.a.c.m.a.a.b(paramString));
    return localStringBuilder.toString();
  }
  
  public static String d(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder("set");
    if (e(paramString)) {
      paramString = paramString.substring(2);
    } else {
      paramString = b.i.b.a.c.m.a.a.b(paramString);
    }
    localStringBuilder.append(paramString);
    return localStringBuilder.toString();
  }
  
  private static boolean e(String paramString)
  {
    if (!paramString.startsWith("is")) {
      return false;
    }
    if (paramString.length() == 2) {
      return false;
    }
    int i = paramString.charAt(2);
    return (97 > i) || (i > 122);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */