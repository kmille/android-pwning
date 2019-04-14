package b.i.b.a.c.i.d;

import b.i.b.a.c.a.h;
import b.i.b.a.c.f.b;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public enum c
{
  private static final Set<b> m;
  private static final Map<String, c> n;
  private static final Map<h, c> o;
  private static final Map<String, c> p;
  public final h i;
  public final String j;
  public final String k;
  public final b l;
  
  static
  {
    Object localObject1 = a;
    int i1 = 0;
    q = new c[] { localObject1, b, c, d, e, f, g, h };
    m = new HashSet();
    n = new HashMap();
    o = new EnumMap(h.class);
    p = new HashMap();
    localObject1 = values();
    int i2 = localObject1.length;
    while (i1 < i2)
    {
      Object localObject2 = localObject1[i1];
      m.add(((c)localObject2).l);
      n.put(((c)localObject2).j, localObject2);
      o.put(((c)localObject2).i, localObject2);
      p.put(((c)localObject2).k, localObject2);
      i1 += 1;
    }
  }
  
  private c(h paramh, String paramString1, String paramString2, String paramString3)
  {
    this.i = paramh;
    this.j = paramString1;
    this.k = paramString2;
    this.l = new b(paramString3);
  }
  
  public static c a(h paramh)
  {
    return (c)o.get(paramh);
  }
  
  public static c a(String paramString)
  {
    c localc = (c)n.get(paramString);
    if (localc != null) {
      return localc;
    }
    throw new AssertionError("Non-primitive type name passed: ".concat(String.valueOf(paramString)));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */