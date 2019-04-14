package b.i.b.a.c.d.a;

import b.a.ac;
import b.a.v;
import b.f.b.k;
import b.i.b.a.c.a.g;
import b.i.b.a.c.a.g.a;
import b.i.b.a.c.b.l;
import b.i.b.a.c.f.c;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.c.a;
import b.m;
import b.q;
import b.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class e
{
  public static final e a = new e();
  private static final Map<b.i.b.a.c.f.b, f> b;
  private static final Map<f, List<f>> c;
  private static final Set<b.i.b.a.c.f.b> d;
  private static final Set<f> e;
  
  static
  {
    Object localObject1 = g.k.r;
    b.f.b.j.a(localObject1, "BUILTIN_NAMES._enum");
    localObject1 = q.a(t.a((c)localObject1, "name"), f.a("name"));
    Object localObject2 = g.k.r;
    b.f.b.j.a(localObject2, "BUILTIN_NAMES._enum");
    localObject2 = q.a(t.a((c)localObject2, "ordinal"), f.a("ordinal"));
    Object localObject3 = g.k.O;
    b.f.b.j.a(localObject3, "BUILTIN_NAMES.collection");
    localObject3 = q.a(t.a((b.i.b.a.c.f.b)localObject3, "size"), f.a("size"));
    Object localObject4 = g.k.S;
    b.f.b.j.a(localObject4, "BUILTIN_NAMES.map");
    localObject4 = q.a(t.a((b.i.b.a.c.f.b)localObject4, "size"), f.a("size"));
    Object localObject5 = g.k.f;
    b.f.b.j.a(localObject5, "BUILTIN_NAMES.charSequence");
    localObject5 = q.a(t.a((c)localObject5, "length"), f.a("length"));
    Object localObject6 = g.k.S;
    b.f.b.j.a(localObject6, "BUILTIN_NAMES.map");
    localObject6 = q.a(t.a((b.i.b.a.c.f.b)localObject6, "keys"), f.a("keySet"));
    Object localObject7 = g.k.S;
    b.f.b.j.a(localObject7, "BUILTIN_NAMES.map");
    localObject7 = q.a(t.a((b.i.b.a.c.f.b)localObject7, "values"), f.a("values"));
    b.i.b.a.c.f.b localb = g.k.S;
    b.f.b.j.a(localb, "BUILTIN_NAMES.map");
    localObject1 = ac.a(new m[] { localObject1, localObject2, localObject3, localObject4, localObject5, localObject6, localObject7, q.a(t.a(localb, "entries"), f.a("entrySet")) });
    b = (Map)localObject1;
    localObject2 = (Iterable)((Map)localObject1).entrySet();
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      ((Collection)localObject1).add(new m(((b.i.b.a.c.f.b)((Map.Entry)localObject3).getKey()).b.d(), ((Map.Entry)localObject3).getValue()));
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
    c = (Map)localObject3;
    localObject1 = b.keySet();
    d = (Set)localObject1;
    localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((Collection)localObject1).add(((b.i.b.a.c.f.b)((Iterator)localObject2).next()).b.d());
    }
    e = b.a.j.k((Iterable)localObject1);
  }
  
  public static List<f> a(f paramf)
  {
    b.f.b.j.b(paramf, "name1");
    List localList = (List)c.get(paramf);
    paramf = localList;
    if (localList == null) {
      paramf = (List)v.a;
    }
    return paramf;
  }
  
  public static Set<f> a()
  {
    return e;
  }
  
  public static boolean a(b.i.b.a.c.b.b paramb)
  {
    b.f.b.j.b(paramb, "callableMemberDescriptor");
    if (!e.contains(paramb.i())) {
      return false;
    }
    Object localObject = (Iterable)d;
    l locall = (l)paramb;
    if ((b.a.j.a((Iterable)localObject, a.f(locall))) && (paramb.k().isEmpty())) {
      return true;
    }
    if (g.a(locall))
    {
      paramb = paramb.m();
      b.f.b.j.a(paramb, "overriddenDescriptors");
      paramb = (Iterable)paramb;
      if ((!(paramb instanceof Collection)) || (!((Collection)paramb).isEmpty()))
      {
        paramb = paramb.iterator();
        while (paramb.hasNext())
        {
          localObject = (b.i.b.a.c.b.b)paramb.next();
          b.f.b.j.a(localObject, "it");
          if (a((b.i.b.a.c.b.b)localObject)) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public static String b(b.i.b.a.c.b.b paramb)
  {
    b.f.b.j.b(paramb, "receiver$0");
    boolean bool = g.a((l)paramb);
    if ((w.a) && (!bool))
    {
      StringBuilder localStringBuilder = new StringBuilder("This method is defined only for builtin members, but ");
      localStringBuilder.append(paramb);
      localStringBuilder.append(" found");
      throw ((Throwable)new AssertionError(localStringBuilder.toString()));
    }
    paramb = a.a(a.a(paramb), (b.f.a.b)a.a);
    if (paramb == null) {
      return null;
    }
    paramb = (f)b.get(a.b((l)paramb));
    if (paramb != null) {
      return paramb.a;
    }
    return null;
  }
  
  static final class a
    extends k
    implements b.f.a.b<b.i.b.a.c.b.b, Boolean>
  {
    public static final a a = new a();
    
    a()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */