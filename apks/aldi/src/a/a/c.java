package a.a;

import a.a.b.h;
import a.a.d.a.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public final class c
{
  public final Map<Class, a> a = new HashMap();
  public final Map<Class, a.a.d.b> b = new HashMap();
  public final List<Class> c = new ArrayList();
  public final List<h> d = new ArrayList();
  public final a.a.d.a.e e = new a.a.d.a.e();
  public final d f = new a.a.d.a.c();
  public final Map<Class, Enum> g = new HashMap();
  public b h;
  public TimeZone i = TimeZone.getDefault();
  public boolean j = false;
  public boolean k = false;
  private boolean l = true;
  
  private static void a(List<Class> paramList, Class paramClass)
  {
    int m = paramList.size() - 1;
    if (m >= 0) {
      if (((Class)paramList.get(m)).isAssignableFrom(paramClass)) {
        m += 1;
      }
    }
    for (;;)
    {
      paramList.add(m, paramClass);
      return;
      m -= 1;
      break;
      m = 0;
    }
  }
  
  public final a a(Class paramClass)
  {
    a locala2 = (a)this.a.get(paramClass);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = new a(paramClass);
      this.a.put(paramClass, locala1);
      a(this.c, paramClass);
    }
    return locala1;
  }
  
  public final <T> c a(Class<T> paramClass, e<T> parame)
  {
    a(paramClass).b = parame;
    return this;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */