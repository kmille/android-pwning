package b.f.b;

import b.i.b;
import b.i.d;
import b.i.e;
import b.i.h;
import b.i.l;

public final class v
{
  private static final w a;
  private static final b[] b = new b[0];
  
  static
  {
    Object localObject = null;
    try
    {
      w localw = (w)Class.forName("b.i.b.a.aa").newInstance();
      localObject = localw;
    }
    catch (ClassCastException|ClassNotFoundException|InstantiationException|IllegalAccessException localClassCastException)
    {
      for (;;) {}
    }
    if (localObject == null) {
      localObject = new w();
    }
    a = (w)localObject;
  }
  
  public static b a(Class paramClass)
  {
    return a.a(paramClass);
  }
  
  public static d a(Class paramClass, String paramString)
  {
    return a.a(paramClass, paramString);
  }
  
  public static e a(i parami)
  {
    return a.a(parami);
  }
  
  public static h a(m paramm)
  {
    return a.a(paramm);
  }
  
  public static l a(q paramq)
  {
    return a.a(paramq);
  }
  
  public static b.i.m a(s params)
  {
    return a.a(params);
  }
  
  public static String a(k paramk)
  {
    return a.a(paramk);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/f/b/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */