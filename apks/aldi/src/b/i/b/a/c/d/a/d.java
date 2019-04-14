package b.i.b.a.c.d.a;

import b.a.ac;
import b.a.ai;
import b.f.b.k;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.d.c;
import b.m;
import b.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  public static final d a = new d();
  private static final List<r> b;
  private static final List<String> c;
  private static final List<String> d;
  private static final Map<r, b> e;
  private static final Map<String, b> f;
  private static final Set<f> g;
  private static final Set<String> h;
  
  static
  {
    Object localObject2 = (Iterable)ai.a(new String[] { "containsAll", "removeAll", "retainAll" });
    Object localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (String)((Iterator)localObject2).next();
      localObject4 = c.a.k;
      b.f.b.j.a(localObject4, "JvmPrimitiveType.BOOLEAN.desc");
      ((Collection)localObject1).add(t.a("java/util/Collection", (String)localObject3, "Ljava/util/Collection;", (String)localObject4));
    }
    localObject1 = (List)localObject1;
    b = (List)localObject1;
    localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((Collection)localObject1).add(((r)((Iterator)localObject2).next()).b);
    }
    c = (List)localObject1;
    localObject2 = (Iterable)b;
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((Collection)localObject1).add(((r)((Iterator)localObject2).next()).a.a);
    }
    d = (List)localObject1;
    localObject1 = b.i.b.a.c.d.b.t.a;
    localObject1 = b.i.b.a.c.d.b.t.b("Collection");
    localObject2 = c.a.k;
    b.f.b.j.a(localObject2, "JvmPrimitiveType.BOOLEAN.desc");
    localObject1 = q.a(t.a((String)localObject1, "contains", "Ljava/lang/Object;", (String)localObject2), b.c);
    localObject2 = b.i.b.a.c.d.b.t.b("Collection");
    Object localObject3 = c.a.k;
    b.f.b.j.a(localObject3, "JvmPrimitiveType.BOOLEAN.desc");
    localObject2 = q.a(t.a((String)localObject2, "remove", "Ljava/lang/Object;", (String)localObject3), b.c);
    localObject3 = b.i.b.a.c.d.b.t.b("Map");
    Object localObject4 = c.a.k;
    b.f.b.j.a(localObject4, "JvmPrimitiveType.BOOLEAN.desc");
    localObject3 = q.a(t.a((String)localObject3, "containsKey", "Ljava/lang/Object;", (String)localObject4), b.c);
    localObject4 = b.i.b.a.c.d.b.t.b("Map");
    Object localObject5 = c.a.k;
    b.f.b.j.a(localObject5, "JvmPrimitiveType.BOOLEAN.desc");
    localObject4 = q.a(t.a((String)localObject4, "containsValue", "Ljava/lang/Object;", (String)localObject5), b.c);
    localObject5 = b.i.b.a.c.d.b.t.b("Map");
    Object localObject6 = c.a.k;
    b.f.b.j.a(localObject6, "JvmPrimitiveType.BOOLEAN.desc");
    localObject5 = q.a(t.a((String)localObject5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", (String)localObject6), b.c);
    localObject6 = q.a(t.a(b.i.b.a.c.d.b.t.b("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), b.d);
    m localm1 = q.a(t.a(b.i.b.a.c.d.b.t.b("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;"), b.a);
    m localm2 = q.a(t.a(b.i.b.a.c.d.b.t.b("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), b.a);
    Object localObject7 = b.i.b.a.c.d.b.t.b("List");
    String str1 = c.e.k;
    b.f.b.j.a(str1, "JvmPrimitiveType.INT.desc");
    localObject7 = q.a(t.a((String)localObject7, "indexOf", "Ljava/lang/Object;", str1), b.b);
    str1 = b.i.b.a.c.d.b.t.b("List");
    String str2 = c.e.k;
    b.f.b.j.a(str2, "JvmPrimitiveType.INT.desc");
    localObject2 = ac.a(new m[] { localObject1, localObject2, localObject3, localObject4, localObject5, localObject6, localm1, localm2, localObject7, q.a(t.a(str1, "lastIndexOf", "Ljava/lang/Object;", str2), b.b) });
    e = (Map)localObject2;
    localObject1 = (Map)new LinkedHashMap(ac.a(((Map)localObject2).size()));
    localObject2 = ((Iterable)((Map)localObject2).entrySet()).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      ((Map)localObject1).put(((r)((Map.Entry)localObject3).getKey()).b, ((Map.Entry)localObject3).getValue());
    }
    f = (Map)localObject1;
    localObject1 = (Iterable)ai.a(e.keySet(), (Iterable)b);
    localObject2 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject1));
    localObject3 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject3).hasNext()) {
      ((Collection)localObject2).add(((r)((Iterator)localObject3).next()).a);
    }
    g = b.a.j.k((Iterable)localObject2);
    localObject2 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      ((Collection)localObject2).add(((r)((Iterator)localObject1).next()).b);
    }
    h = b.a.j.k((Iterable)localObject2);
  }
  
  public static final b.i.b.a.c.b.t a(b.i.b.a.c.b.t paramt)
  {
    b.f.b.j.b(paramt, "functionDescriptor");
    f localf = paramt.i();
    b.f.b.j.a(localf, "functionDescriptor.name");
    if (!a(localf)) {
      return null;
    }
    return (b.i.b.a.c.b.t)b.i.b.a.c.i.c.a.a((b.i.b.a.c.b.b)paramt, (b.f.a.b)c.a);
  }
  
  public static final a a(b.i.b.a.c.b.b paramb)
  {
    b.f.b.j.b(paramb, "receiver$0");
    if (!g.contains(paramb.i())) {
      return null;
    }
    paramb = b.i.b.a.c.i.c.a.a(paramb, (b.f.a.b)d.a);
    if (paramb != null)
    {
      paramb = b.i.b.a.c.d.b.r.b((b.i.b.a.c.b.a)paramb);
      if (paramb == null) {
        return null;
      }
      if (c.contains(paramb)) {
        return a.a;
      }
      paramb = f.get(paramb);
      if (paramb == null) {
        b.f.b.j.a();
      }
      if ((b)paramb == b.a) {
        return a.c;
      }
      return a.b;
    }
    return null;
  }
  
  public static boolean a(f paramf)
  {
    b.f.b.j.b(paramf, "receiver$0");
    return g.contains(paramf);
  }
  
  public static enum a
  {
    private final String e;
    private final boolean f;
    
    static
    {
      a locala1 = new a("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);
      a = locala1;
      a locala2 = new a("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);
      b = locala2;
      a locala3 = new a("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);
      c = locala3;
      d = new a[] { locala1, locala2, locala3 };
    }
    
    private a(String paramString, boolean paramBoolean)
    {
      this.e = paramString;
      this.f = paramBoolean;
    }
  }
  
  public static enum b
  {
    private final Object f;
    
    static
    {
      b localb1 = new b("NULL", 0, null);
      a = localb1;
      b localb2 = new b("INDEX", 1, Integer.valueOf(-1));
      b = localb2;
      b localb3 = new b("FALSE", 2, Boolean.FALSE);
      c = localb3;
      a locala = new a("MAP_GET_OR_DEFAULT");
      d = locala;
      e = new b[] { localb1, localb2, localb3, locala };
    }
    
    protected b(Object paramObject)
    {
      this.f = paramObject;
    }
    
    public static final class a
      extends d.b
    {
      a()
      {
        super(3, null);
      }
    }
  }
  
  static final class c
    extends k
    implements b.f.a.b<b.i.b.a.c.b.b, Boolean>
  {
    public static final c a = new c();
    
    c()
    {
      super();
    }
  }
  
  static final class d
    extends k
    implements b.f.a.b<b.i.b.a.c.b.b, Boolean>
  {
    public static final d a = new d();
    
    d()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */