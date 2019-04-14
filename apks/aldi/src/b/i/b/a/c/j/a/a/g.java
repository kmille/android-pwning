package b.i.b.a.c.j.a.a;

import b.a.ac;
import b.a.v;
import b.f.a.b;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.aq;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.e.a.ab;
import b.i.b.a.c.e.a.o;
import b.i.b.a.c.e.a.u;
import b.i.b.a.c.g.q;
import b.i.b.a.c.g.s;
import b.i.b.a.c.j.a.r;
import b.i.b.a.c.k.c;
import b.u;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class g
  extends b.i.b.a.c.i.e.i
{
  private final Map<b.i.b.a.c.f.f, byte[]> a;
  final b.i.b.a.c.j.a.k c;
  private final Map<b.i.b.a.c.f.f, byte[]> d;
  private final Map<b.i.b.a.c.f.f, byte[]> e;
  private final c<b.i.b.a.c.f.f, Collection<al>> g;
  private final c<b.i.b.a.c.f.f, Collection<ah>> h;
  private final b.i.b.a.c.k.d<b.i.b.a.c.f.f, aq> i;
  private final b.i.b.a.c.k.f j;
  private final b.i.b.a.c.k.f k;
  private final b.i.b.a.c.k.f l;
  
  protected g(b.i.b.a.c.j.a.k paramk, Collection<a.o> paramCollection, Collection<a.u> paramCollection1, Collection<a.ab> paramCollection2, b.f.a.a<? extends Collection<b.i.b.a.c.f.f>> parama)
  {
    this.c = paramk;
    paramk = (Iterable)paramCollection;
    Object localObject1 = (Map)new LinkedHashMap();
    Object localObject2 = paramk.iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = ((Iterator)localObject2).next();
      paramk = (q)localObject3;
      b.i.b.a.c.f.f localf = r.b(this.c.d, ((a.o)paramk).d);
      paramCollection = ((Map)localObject1).get(localf);
      paramk = paramCollection;
      if (paramCollection == null)
      {
        paramk = new ArrayList();
        ((Map)localObject1).put(localf, paramk);
      }
      ((List)paramk).add(localObject3);
    }
    this.a = a((Map)localObject1);
    paramk = (Iterable)paramCollection1;
    paramCollection1 = (Map)new LinkedHashMap();
    localObject1 = paramk.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      paramk = (q)localObject2;
      localObject3 = r.b(this.c.d, ((a.u)paramk).d);
      paramCollection = paramCollection1.get(localObject3);
      paramk = paramCollection;
      if (paramCollection == null)
      {
        paramk = new ArrayList();
        paramCollection1.put(localObject3, paramk);
      }
      ((List)paramk).add(localObject2);
    }
    this.d = a(paramCollection1);
    paramk = (Iterable)paramCollection2;
    paramCollection1 = (Map)new LinkedHashMap();
    paramCollection2 = paramk.iterator();
    while (paramCollection2.hasNext())
    {
      localObject1 = paramCollection2.next();
      paramk = (q)localObject1;
      localObject2 = r.b(this.c.d, ((a.ab)paramk).c);
      paramCollection = paramCollection1.get(localObject2);
      paramk = paramCollection;
      if (paramCollection == null)
      {
        paramk = new ArrayList();
        paramCollection1.put(localObject2, paramk);
      }
      ((List)paramk).add(localObject1);
    }
    this.e = a(paramCollection1);
    this.g = this.c.c.b.a((b)new e(this));
    this.h = this.c.c.b.a((b)new f(this));
    this.i = this.c.c.b.b((b)new g(this));
    this.j = this.c.c.b.a((b.f.a.a)new d(this));
    this.k = this.c.c.b.a((b.f.a.a)new h(this));
    this.l = this.c.c.b.a((b.f.a.a)new a(parama));
  }
  
  private static Map<b.i.b.a.c.f.f, byte[]> a(Map<b.i.b.a.c.f.f, ? extends Collection<? extends b.i.b.a.c.g.a>> paramMap)
  {
    Map localMap = (Map)new LinkedHashMap(ac.a(paramMap.size()));
    paramMap = ((Iterable)paramMap.entrySet()).iterator();
    while (paramMap.hasNext())
    {
      Object localObject2 = (Map.Entry)paramMap.next();
      Object localObject1 = ((Map.Entry)localObject2).getKey();
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      Object localObject3 = (Iterable)((Map.Entry)localObject2).getValue();
      localObject2 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject3));
      localObject3 = ((Iterable)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        ((b.i.b.a.c.g.a)((Iterator)localObject3).next()).a((OutputStream)localByteArrayOutputStream);
        ((Collection)localObject2).add(u.a);
      }
      localMap.put(localObject1, localByteArrayOutputStream.toByteArray());
    }
    return localMap;
  }
  
  private final void a(Collection<l> paramCollection, b.i.b.a.c.i.e.d paramd, b<? super b.i.b.a.c.f.f, Boolean> paramb, b.i.b.a.c.c.a.a parama)
  {
    Object localObject1 = b.i.b.a.c.i.e.d.m;
    Object localObject2;
    if (paramd.a(b.i.b.a.c.i.e.d.g()))
    {
      localObject2 = (Collection)l_();
      localObject1 = new ArrayList();
      localObject2 = ((Collection)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (b.i.b.a.c.f.f)((Iterator)localObject2).next();
        if (((Boolean)paramb.a(localObject3)).booleanValue()) {
          ((ArrayList)localObject1).addAll(a((b.i.b.a.c.f.f)localObject3, parama));
        }
      }
      localObject2 = (List)localObject1;
      Object localObject3 = b.i.b.a.c.i.g.a.a;
      b.f.b.j.a(localObject3, "MemberComparator.NameAnd…MemberComparator.INSTANCE");
      b.a.j.a((List)localObject2, (Comparator)localObject3);
      paramCollection.addAll((Collection)localObject1);
    }
    localObject1 = b.i.b.a.c.i.e.d.m;
    if (paramd.a(b.i.b.a.c.i.e.d.f()))
    {
      localObject1 = (Collection)j_();
      paramd = new ArrayList();
      localObject1 = ((Collection)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (b.i.b.a.c.f.f)((Iterator)localObject1).next();
        if (((Boolean)paramb.a(localObject2)).booleanValue()) {
          paramd.addAll(b((b.i.b.a.c.f.f)localObject2, parama));
        }
      }
      paramb = (List)paramd;
      parama = b.i.b.a.c.i.g.a.a;
      b.f.b.j.a(parama, "MemberComparator.NameAnd…MemberComparator.INSTANCE");
      b.a.j.a(paramb, (Comparator)parama);
      paramCollection.addAll((Collection)paramd);
    }
  }
  
  private final e c(b.i.b.a.c.f.f paramf)
  {
    return this.c.c.a(a(paramf));
  }
  
  private final Set<b.i.b.a.c.f.f> f()
  {
    return this.e.keySet();
  }
  
  protected abstract b.i.b.a.c.f.a a(b.i.b.a.c.f.f paramf);
  
  public Collection<ah> a(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    if (!l_().contains(paramf)) {}
    for (paramf = (List)v.a;; paramf = this.h.a(paramf)) {
      return (Collection)paramf;
    }
  }
  
  protected final Collection<l> a(b.i.b.a.c.i.e.d paramd, b<? super b.i.b.a.c.f.f, Boolean> paramb, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramd, "kindFilter");
    b.f.b.j.b(paramb, "nameFilter");
    b.f.b.j.b(parama, "location");
    ArrayList localArrayList = new ArrayList(0);
    Object localObject = b.i.b.a.c.i.e.d.m;
    if (paramd.a(b.i.b.a.c.i.e.d.c())) {
      a((Collection)localArrayList, paramb);
    }
    localObject = (Collection)localArrayList;
    a((Collection)localObject, paramd, paramb, parama);
    parama = b.i.b.a.c.i.e.d.m;
    if (paramd.a(b.i.b.a.c.i.e.d.i()))
    {
      parama = e().iterator();
      while (parama.hasNext())
      {
        b.i.b.a.c.f.f localf = (b.i.b.a.c.f.f)parama.next();
        if (((Boolean)paramb.a(localf)).booleanValue()) {
          b.i.b.a.c.n.a.a((Collection)localObject, c(localf));
        }
      }
    }
    parama = b.i.b.a.c.i.e.d.m;
    if (paramd.a(b.i.b.a.c.i.e.d.d()))
    {
      paramd = f().iterator();
      while (paramd.hasNext())
      {
        parama = (b.i.b.a.c.f.f)paramd.next();
        if (((Boolean)paramb.a(parama)).booleanValue()) {
          b.i.b.a.c.n.a.a((Collection)localObject, this.i.a(parama));
        }
      }
    }
    return (Collection)b.i.b.a.c.n.a.a(localArrayList);
  }
  
  protected void a(b.i.b.a.c.f.f paramf, Collection<al> paramCollection)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(paramCollection, "functions");
  }
  
  protected abstract void a(Collection<l> paramCollection, b<? super b.i.b.a.c.f.f, Boolean> paramb);
  
  public Collection<al> b(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    if (!j_().contains(paramf)) {}
    for (paramf = (List)v.a;; paramf = this.g.a(paramf)) {
      return (Collection)paramf;
    }
  }
  
  protected void b(b.i.b.a.c.f.f paramf, Collection<ah> paramCollection)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(paramCollection, "descriptors");
  }
  
  protected boolean b(b.i.b.a.c.f.f paramf)
  {
    b.f.b.j.b(paramf, "name");
    return e().contains(paramf);
  }
  
  public b.i.b.a.c.b.h c(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    if (b(paramf)) {}
    for (paramf = c(paramf);; paramf = this.i.a(paramf))
    {
      return (b.i.b.a.c.b.h)paramf;
      if (!f().contains(paramf)) {
        break;
      }
    }
    return null;
  }
  
  protected abstract Set<b.i.b.a.c.f.f> c();
  
  protected abstract Set<b.i.b.a.c.f.f> d();
  
  public final Set<b.i.b.a.c.f.f> e()
  {
    return (Set)b.i.b.a.c.k.h.a(this.l, b[2]);
  }
  
  public final Set<b.i.b.a.c.f.f> j_()
  {
    return (Set)b.i.b.a.c.k.h.a(this.j, b[0]);
  }
  
  public final Set<b.i.b.a.c.f.f> l_()
  {
    return (Set)b.i.b.a.c.k.h.a(this.k, b[1]);
  }
  
  static final class a
    extends b.f.b.k
    implements b.f.a.a<Set<? extends b.i.b.a.c.f.f>>
  {
    a(b.f.a.a parama)
    {
      super();
    }
  }
  
  public static final class b
    extends b.f.b.k
    implements b.f.a.a<M>
  {
    public b(ByteArrayInputStream paramByteArrayInputStream, g paramg, s params)
    {
      super();
    }
  }
  
  public static final class c
    extends b.f.b.k
    implements b.f.a.a<M>
  {
    public c(ByteArrayInputStream paramByteArrayInputStream, g paramg, s params)
    {
      super();
    }
  }
  
  static final class d
    extends b.f.b.k
    implements b.f.a.a<Set<? extends b.i.b.a.c.f.f>>
  {
    d(g paramg)
    {
      super();
    }
  }
  
  static final class e
    extends b.f.b.k
    implements b<b.i.b.a.c.f.f, Collection<? extends al>>
  {
    e(g paramg)
    {
      super();
    }
  }
  
  static final class f
    extends b.f.b.k
    implements b<b.i.b.a.c.f.f, Collection<? extends ah>>
  {
    f(g paramg)
    {
      super();
    }
  }
  
  static final class g
    extends b.f.b.k
    implements b<b.i.b.a.c.f.f, aq>
  {
    g(g paramg)
    {
      super();
    }
  }
  
  static final class h
    extends b.f.b.k
    implements b.f.a.a<Set<? extends b.i.b.a.c.f.f>>
  {
    h(g paramg)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */