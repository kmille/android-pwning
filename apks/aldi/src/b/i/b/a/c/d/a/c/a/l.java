package b.i.b.a.c.d.a.c.a;

import b.a.x;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.e;
import b.i.b.a.c.d.a.b.i;
import b.i.b.a.c.d.a.e.g;
import b.i.b.a.c.d.a.e.p;
import b.i.b.a.c.l.w;
import b.i.b.a.c.n.b.b;
import b.i.b.a.c.n.b.c;
import b.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class l
  extends m
{
  private final g a;
  private final f b;
  
  public l(b.i.b.a.c.d.a.c.h paramh, g paramg, f paramf)
  {
    super(paramh);
    this.a = paramg;
    this.b = paramf;
  }
  
  private final ah a(ah paramah)
  {
    Object localObject = paramah.t();
    b.f.b.j.a(localObject, "this.kind");
    if (((b.i.b.a.c.b.b.a)localObject).a()) {
      return paramah;
    }
    paramah = paramah.m();
    b.f.b.j.a(paramah, "this.overriddenDescriptors");
    localObject = (Iterable)paramah;
    paramah = (Collection)new ArrayList(b.a.j.a((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ah localah = (ah)((Iterator)localObject).next();
      b.f.b.j.a(localah, "it");
      paramah.add(a(localah));
    }
    paramah = (Iterable)paramah;
    b.f.b.j.b(paramah, "receiver$0");
    return (ah)b.a.j.g(b.a.j.i((Iterable)b.a.j.m(paramah)));
  }
  
  private static <R> Set<R> a(e parame, final Set<R> paramSet, final b.f.a.b<? super b.i.b.a.c.i.e.h, ? extends Collection<? extends R>> paramb)
  {
    b.i.b.a.c.n.b.a((Collection)b.a.j.a(parame), (b.b)d.a, (b.c)new e(parame, paramSet, paramb));
    return paramSet;
  }
  
  protected final Set<b.i.b.a.c.f.f> a(b.i.b.a.c.i.e.d paramd)
  {
    b.f.b.j.b(paramd, "kindFilter");
    paramd = b.a.j.m((Iterable)((b)this.d.b_()).b());
    a((e)this.b, paramd, (b.f.a.b)c.a);
    return paramd;
  }
  
  protected final void a(b.i.b.a.c.f.f paramf, Collection<ah> paramCollection)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(paramCollection, "result");
    paramf = a((e)this.b, (Set)new LinkedHashSet(), (b.f.a.b)new b(paramf));
    if ((paramCollection.isEmpty() ^ true))
    {
      paramf = b.i.b.a.c.d.a.a.a.b((Collection)paramf, paramCollection, (e)this.b, this.e.c.f);
      b.f.b.j.a(paramf, "resolveOverridesForStati…rorReporter\n            )");
    }
    for (;;)
    {
      paramCollection.addAll(paramf);
      return;
      paramf = (Iterable)paramf;
      Map localMap = (Map)new LinkedHashMap();
      Iterator localIterator = paramf.iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = localIterator.next();
        ah localah = a((ah)localObject2);
        localObject1 = localMap.get(localah);
        paramf = (b.i.b.a.c.f.f)localObject1;
        if (localObject1 == null)
        {
          paramf = new ArrayList();
          localMap.put(localah, paramf);
        }
        ((List)paramf).add(localObject2);
      }
      paramf = (Collection)new ArrayList();
      Object localObject1 = localMap.entrySet().iterator();
      while (((Iterator)localObject1).hasNext()) {
        b.a.j.a(paramf, (Iterable)b.i.b.a.c.d.a.a.a.b((Collection)((Map.Entry)((Iterator)localObject1).next()).getValue(), paramCollection, (e)this.b, this.e.c.f));
      }
      paramf = (Collection)paramf;
    }
  }
  
  protected final void a(Collection<al> paramCollection, b.i.b.a.c.f.f paramf)
  {
    b.f.b.j.b(paramCollection, "result");
    b.f.b.j.b(paramf, "name");
    Object localObject = i.a((e)this.b);
    if (localObject == null) {
      localObject = (Set)x.a;
    } else {
      localObject = b.a.j.k((Iterable)((l)localObject).b(paramf, (b.i.b.a.c.c.a.a)b.i.b.a.c.c.a.c.o));
    }
    localObject = b.i.b.a.c.d.a.a.a.b((Collection)localObject, paramCollection, (e)this.b, this.e.c.f);
    b.f.b.j.a(localObject, "resolveOverridesForStati…components.errorReporter)");
    paramCollection.addAll((Collection)localObject);
    if (this.a.h())
    {
      if (b.f.b.j.a(paramf, b.i.b.a.c.i.d.b))
      {
        paramf = b.i.b.a.c.i.c.b((e)this.b);
        b.f.b.j.a(paramf, "createEnumValueOfMethod(ownerDescriptor)");
        paramCollection.add(paramf);
        return;
      }
      if (b.f.b.j.a(paramf, b.i.b.a.c.i.d.a))
      {
        paramf = b.i.b.a.c.i.c.a((e)this.b);
        b.f.b.j.a(paramf, "createEnumValuesMethod(ownerDescriptor)");
        paramCollection.add(paramf);
      }
    }
  }
  
  protected final Set<b.i.b.a.c.f.f> b(b.i.b.a.c.i.e.d paramd, b.f.a.b<? super b.i.b.a.c.f.f, Boolean> paramb)
  {
    b.f.b.j.b(paramd, "kindFilter");
    Set localSet = b.a.j.m((Iterable)((b)this.d.b_()).a());
    paramd = i.a((e)this.b);
    if (paramd != null) {
      paramd = paramd.j_();
    } else {
      paramd = null;
    }
    paramb = paramd;
    if (paramd == null) {
      paramb = (Set)x.a;
    }
    localSet.addAll((Collection)paramb);
    if (this.a.h()) {
      localSet.addAll((Collection)b.a.j.b(new b.i.b.a.c.f.f[] { b.i.b.a.c.i.d.b, b.i.b.a.c.i.d.a }));
    }
    return localSet;
  }
  
  public final b.i.b.a.c.b.h c(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    return null;
  }
  
  protected final Set<b.i.b.a.c.f.f> c(b.i.b.a.c.i.e.d paramd, b.f.a.b<? super b.i.b.a.c.f.f, Boolean> paramb)
  {
    b.f.b.j.b(paramd, "kindFilter");
    return (Set)x.a;
  }
  
  static final class a
    extends b.f.b.k
    implements b.f.a.b<p, Boolean>
  {
    public static final a a = new a();
    
    a()
    {
      super();
    }
  }
  
  static final class b
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.i.e.h, Collection<? extends ah>>
  {
    b(b.i.b.a.c.f.f paramf)
    {
      super();
    }
  }
  
  static final class c
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.i.e.h, Set<? extends b.i.b.a.c.f.f>>
  {
    public static final c a = new c();
    
    c()
    {
      super();
    }
  }
  
  static final class d<N>
    implements b.b<N>
  {
    public static final d a = new d();
  }
  
  public static final class e
    extends b.i.b.a.c.n.b.a<e, u>
  {
    e(e parame, Set paramSet, b.f.a.b paramb) {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */