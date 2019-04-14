package b.f.b;

import b.i.b;
import b.i.d;
import b.i.l;

public class w
{
  public b a(Class paramClass)
  {
    return new e(paramClass);
  }
  
  public d a(Class paramClass, String paramString)
  {
    return new o(paramClass, paramString);
  }
  
  public b.i.e a(i parami)
  {
    return parami;
  }
  
  public b.i.h a(m paramm)
  {
    return paramm;
  }
  
  public l a(q paramq)
  {
    return paramq;
  }
  
  public b.i.m a(s params)
  {
    return params;
  }
  
  public String a(h paramh)
  {
    String str = paramh.getClass().getGenericInterfaces()[0].toString();
    paramh = str;
    if (str.startsWith("kotlin.jvm.functions.")) {
      paramh = str.substring(21);
    }
    return paramh;
  }
  
  public String a(k paramk)
  {
    return a(paramk);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/f/b/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */