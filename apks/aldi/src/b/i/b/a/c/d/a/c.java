package b.i.b.a.c.d.a;

import b.a.ac;
import b.a.v;
import b.f.b.k;
import b.i.b.a.c.a.g;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.l;
import b.i.b.a.c.f.f;
import b.m;
import b.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class c
{
  public static final c a = new c();
  private static final r b;
  private static final Map<r, f> c;
  private static final Map<String, f> d;
  private static final List<f> e;
  private static final Map<f, List<f>> f;
  
  static
  {
    Object localObject1 = b.i.b.a.c.i.d.c.e.k;
    b.f.b.j.a(localObject1, "JvmPrimitiveType.INT.desc");
    b = t.a("java/util/List", "removeAt", (String)localObject1, "Ljava/lang/Object;");
    localObject1 = b.i.b.a.c.d.b.t.a;
    localObject1 = b.i.b.a.c.d.b.t.a("Number");
    Object localObject2 = b.i.b.a.c.i.d.c.c.k;
    b.f.b.j.a(localObject2, "JvmPrimitiveType.BYTE.desc");
    localObject1 = q.a(t.a((String)localObject1, "toByte", "", (String)localObject2), f.a("byteValue"));
    localObject2 = b.i.b.a.c.d.b.t.a("Number");
    Object localObject3 = b.i.b.a.c.i.d.c.d.k;
    b.f.b.j.a(localObject3, "JvmPrimitiveType.SHORT.desc");
    localObject2 = q.a(t.a((String)localObject2, "toShort", "", (String)localObject3), f.a("shortValue"));
    localObject3 = b.i.b.a.c.d.b.t.a("Number");
    Object localObject4 = b.i.b.a.c.i.d.c.e.k;
    b.f.b.j.a(localObject4, "JvmPrimitiveType.INT.desc");
    localObject3 = q.a(t.a((String)localObject3, "toInt", "", (String)localObject4), f.a("intValue"));
    localObject4 = b.i.b.a.c.d.b.t.a("Number");
    Object localObject5 = b.i.b.a.c.i.d.c.g.k;
    b.f.b.j.a(localObject5, "JvmPrimitiveType.LONG.desc");
    localObject4 = q.a(t.a((String)localObject4, "toLong", "", (String)localObject5), f.a("longValue"));
    localObject5 = b.i.b.a.c.d.b.t.a("Number");
    Object localObject6 = b.i.b.a.c.i.d.c.f.k;
    b.f.b.j.a(localObject6, "JvmPrimitiveType.FLOAT.desc");
    localObject5 = q.a(t.a((String)localObject5, "toFloat", "", (String)localObject6), f.a("floatValue"));
    localObject6 = b.i.b.a.c.d.b.t.a("Number");
    Object localObject7 = b.i.b.a.c.i.d.c.h.k;
    b.f.b.j.a(localObject7, "JvmPrimitiveType.DOUBLE.desc");
    localObject6 = q.a(t.a((String)localObject6, "toDouble", "", (String)localObject7), f.a("doubleValue"));
    localObject7 = q.a(b, f.a("remove"));
    String str1 = b.i.b.a.c.d.b.t.a("CharSequence");
    String str2 = b.i.b.a.c.i.d.c.e.k;
    b.f.b.j.a(str2, "JvmPrimitiveType.INT.desc");
    String str3 = b.i.b.a.c.i.d.c.b.k;
    b.f.b.j.a(str3, "JvmPrimitiveType.CHAR.desc");
    localObject2 = ac.a(new m[] { localObject1, localObject2, localObject3, localObject4, localObject5, localObject6, localObject7, q.a(t.a(str1, "get", str2, str3), f.a("charAt")) });
    c = (Map)localObject2;
    localObject1 = (Map)new LinkedHashMap(ac.a(((Map)localObject2).size()));
    localObject2 = ((Iterable)((Map)localObject2).entrySet()).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      ((Map)localObject1).put(((r)((Map.Entry)localObject3).getKey()).b, ((Map.Entry)localObject3).getValue());
    }
    d = (Map)localObject1;
    localObject2 = (Iterable)c.keySet();
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((Collection)localObject1).add(((r)((Iterator)localObject2).next()).a);
    }
    e = (List)localObject1;
    localObject2 = (Iterable)c.entrySet();
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      ((Collection)localObject1).add(new m(((r)((Map.Entry)localObject3).getKey()).a, ((Map.Entry)localObject3).getValue()));
    }
    localObject1 = (Iterable)localObject1;
    localObject3 = (Map)new LinkedHashMap();
    localObject4 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject5 = (m)((Iterator)localObject4).next();
      localObject6 = (f)((m)localObject5).b;
      localObject2 = ((Map)localObject3).get(localObject6);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new ArrayList();
        ((Map)localObject3).put(localObject6, localObject1);
      }
      ((List)localObject1).add((f)((m)localObject5).a);
    }
    f = (Map)localObject3;
  }
  
  public static f a(al paramal)
  {
    b.f.b.j.b(paramal, "functionDescriptor");
    Map localMap = d;
    paramal = b.i.b.a.c.d.b.r.b((b.i.b.a.c.b.a)paramal);
    if (paramal == null) {
      return null;
    }
    return (f)localMap.get(paramal);
  }
  
  public static List<f> a()
  {
    return e;
  }
  
  public static boolean a(f paramf)
  {
    b.f.b.j.b(paramf, "receiver$0");
    return e.contains(paramf);
  }
  
  public static List<f> b(f paramf)
  {
    b.f.b.j.b(paramf, "name");
    List localList = (List)f.get(paramf);
    paramf = localList;
    if (localList == null) {
      paramf = (List)v.a;
    }
    return paramf;
  }
  
  public static boolean b(al paramal)
  {
    b.f.b.j.b(paramal, "functionDescriptor");
    return (g.a((l)paramal)) && (b.i.b.a.c.i.c.a.a((b.i.b.a.c.b.b)paramal, (b.f.a.b)new a(paramal)) != null);
  }
  
  public static boolean c(al paramal)
  {
    b.f.b.j.b(paramal, "receiver$0");
    return (b.f.b.j.a(paramal.i().a, "removeAt")) && (b.f.b.j.a(b.i.b.a.c.d.b.r.b((b.i.b.a.c.b.a)paramal), b.b));
  }
  
  static final class a
    extends k
    implements b.f.a.b<b.i.b.a.c.b.b, Boolean>
  {
    a(al paramal)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */