package b.i.b.a.c.a;

import b.i.b.a.c.b.ab;
import b.i.b.a.c.f.a;
import b.i.b.a.c.f.b;
import b.i.b.a.c.f.c;
import b.i.b.a.c.f.f;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class m
{
  public static final m a = new m();
  private static final Set<f> b;
  private static final HashMap<a, a> c;
  private static final HashMap<a, a> d;
  private static final Set<f> e;
  
  static
  {
    l[] arrayOfl = l.values();
    Object localObject = (Collection)new ArrayList(arrayOfl.length);
    int k = arrayOfl.length;
    int j = 0;
    int i = 0;
    while (i < k)
    {
      ((Collection)localObject).add(arrayOfl[i].e);
      i += 1;
    }
    b = b.a.j.k((Iterable)localObject);
    c = new HashMap();
    d = new HashMap();
    arrayOfl = l.values();
    localObject = (Collection)new LinkedHashSet();
    k = arrayOfl.length;
    i = 0;
    while (i < k)
    {
      ((Collection)localObject).add(arrayOfl[i].f.b.b.d());
      i += 1;
    }
    e = (Set)localObject;
    arrayOfl = l.values();
    k = arrayOfl.length;
    i = j;
    while (i < k)
    {
      localObject = arrayOfl[i];
      ((Map)c).put(((l)localObject).f, ((l)localObject).g);
      ((Map)d).put(((l)localObject).g, ((l)localObject).f);
      i += 1;
    }
  }
  
  public static a a(a parama)
  {
    b.f.b.j.b(parama, "arrayClassId");
    return (a)c.get(parama);
  }
  
  public static boolean a(f paramf)
  {
    b.f.b.j.b(paramf, "name");
    return e.contains(paramf);
  }
  
  public static boolean a(w paramw)
  {
    b.f.b.j.b(paramw, "type");
    if (av.a(paramw)) {
      return false;
    }
    paramw = paramw.f().c();
    if (paramw == null) {
      return false;
    }
    b.f.b.j.a(paramw, "type.constructor.declara…escriptor ?: return false");
    paramw = (b.i.b.a.c.b.l)paramw;
    b.f.b.j.b(paramw, "descriptor");
    b.i.b.a.c.b.l locall = paramw.a();
    return ((locall instanceof ab)) && (b.f.b.j.a(((ab)locall).c(), g.c)) && (b.contains(paramw.i()));
  }
  
  public static a b(a parama)
  {
    b.f.b.j.b(parama, "arrayClassId");
    return (a)d.get(parama);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */