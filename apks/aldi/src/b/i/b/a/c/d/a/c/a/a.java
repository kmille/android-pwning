package b.i.b.a.c.d.a.c.a;

import b.a.v;
import b.f.b.k;
import b.i.b.a.c.d.a.e.g;
import b.i.b.a.c.d.a.e.n;
import b.i.b.a.c.d.a.e.p;
import b.i.b.a.c.d.a.e.q;
import b.i.b.a.c.f.f;
import b.j.h;
import b.j.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a
  implements b
{
  final b.f.a.b<p, Boolean> a;
  private final b.f.a.b<q, Boolean> b;
  private final Map<f, List<q>> c;
  private final Map<f, n> d;
  private final g e;
  
  public a(g paramg, b.f.a.b<? super p, Boolean> paramb)
  {
    this.e = paramg;
    this.a = paramb;
    this.b = ((b.f.a.b)new a(this));
    paramg = i.a(b.a.j.n((Iterable)this.e.i()), this.b);
    Object localObject1 = (Map)new LinkedHashMap();
    Iterator localIterator = paramg.a();
    while (localIterator.hasNext())
    {
      Object localObject2 = localIterator.next();
      f localf = ((q)localObject2).p();
      paramb = ((Map)localObject1).get(localf);
      paramg = paramb;
      if (paramb == null)
      {
        paramg = new ArrayList();
        ((Map)localObject1).put(localf, paramg);
      }
      ((List)paramg).add(localObject2);
    }
    this.c = ((Map)localObject1);
    paramb = i.a(b.a.j.n((Iterable)this.e.j()), this.a);
    paramg = (Map)new LinkedHashMap();
    paramb = paramb.a();
    while (paramb.hasNext())
    {
      localObject1 = paramb.next();
      paramg.put(((n)localObject1).p(), localObject1);
    }
    this.d = paramg;
  }
  
  public final Collection<q> a(f paramf)
  {
    b.f.b.j.b(paramf, "name");
    paramf = (List)this.c.get(paramf);
    if (paramf != null) {
      return (Collection)paramf;
    }
    return (Collection)v.a;
  }
  
  public final Set<f> a()
  {
    Object localObject = i.a(b.a.j.n((Iterable)this.e.i()), this.b);
    Collection localCollection = (Collection)new LinkedHashSet();
    localObject = ((h)localObject).a();
    while (((Iterator)localObject).hasNext()) {
      localCollection.add(((q)((Iterator)localObject).next()).p());
    }
    return (Set)localCollection;
  }
  
  public final n b(f paramf)
  {
    b.f.b.j.b(paramf, "name");
    return (n)this.d.get(paramf);
  }
  
  public final Set<f> b()
  {
    Object localObject = i.a(b.a.j.n((Iterable)this.e.j()), this.a);
    Collection localCollection = (Collection)new LinkedHashSet();
    localObject = ((h)localObject).a();
    while (((Iterator)localObject).hasNext()) {
      localCollection.add(((n)((Iterator)localObject).next()).p());
    }
    return (Set)localCollection;
  }
  
  static final class a
    extends k
    implements b.f.a.b<q, Boolean>
  {
    a(a parama)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */