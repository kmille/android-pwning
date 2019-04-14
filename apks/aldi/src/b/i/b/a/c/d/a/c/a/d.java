package b.i.b.a.c.d.a.c.a;

import b.a.x;
import b.f.b.k;
import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.l;
import b.i.b.a.c.d.a.e.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class d
  implements b.i.b.a.c.i.e.h
{
  final j b;
  private final b.i.b.a.c.k.f c;
  private final b.i.b.a.c.d.a.c.h d;
  private final h e;
  
  public d(b.i.b.a.c.d.a.c.h paramh, t paramt, h paramh1)
  {
    this.d = paramh;
    this.e = paramh1;
    this.b = new j(this.d, paramt, this.e);
    this.c = this.d.c.a.a((b.f.a.a)new a(this));
  }
  
  private final List<b.i.b.a.c.i.e.h> c()
  {
    return (List)b.i.b.a.c.k.h.a(this.c, a[0]);
  }
  
  private void d(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    b.i.b.a.c.c.a.a(this.d.c.m, parama, (ab)this.e, paramf);
  }
  
  public final Collection<ah> a(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    d(paramf, parama);
    Object localObject1 = this.b;
    Object localObject2 = c();
    localObject1 = ((b.i.b.a.c.i.e.h)localObject1).a(paramf, parama);
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      localObject1 = b.i.b.a.c.m.b.a.a((Collection)localObject1, ((b.i.b.a.c.i.e.h)((Iterator)localObject2).next()).a(paramf, parama));
    }
    paramf = (b.i.b.a.c.f.f)localObject1;
    if (localObject1 == null) {
      paramf = (Collection)x.a;
    }
    return paramf;
  }
  
  public final Collection<l> a(b.i.b.a.c.i.e.d paramd, b.f.a.b<? super b.i.b.a.c.f.f, Boolean> paramb)
  {
    b.f.b.j.b(paramd, "kindFilter");
    b.f.b.j.b(paramb, "nameFilter");
    Object localObject1 = this.b;
    Object localObject2 = c();
    localObject1 = ((b.i.b.a.c.i.e.h)localObject1).a(paramd, paramb);
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      localObject1 = b.i.b.a.c.m.b.a.a((Collection)localObject1, ((b.i.b.a.c.i.e.h)((Iterator)localObject2).next()).a(paramd, paramb));
    }
    paramd = (b.i.b.a.c.i.e.d)localObject1;
    if (localObject1 == null) {
      paramd = (Collection)x.a;
    }
    return paramd;
  }
  
  public final Collection<al> b(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    d(paramf, parama);
    Object localObject1 = this.b;
    Object localObject2 = c();
    localObject1 = ((b.i.b.a.c.i.e.h)localObject1).b(paramf, parama);
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      localObject1 = b.i.b.a.c.m.b.a.a((Collection)localObject1, ((b.i.b.a.c.i.e.h)((Iterator)localObject2).next()).b(paramf, parama));
    }
    paramf = (b.i.b.a.c.f.f)localObject1;
    if (localObject1 == null) {
      paramf = (Collection)x.a;
    }
    return paramf;
  }
  
  public final b.i.b.a.c.b.h c(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    d(paramf, parama);
    Object localObject1 = this.b.e(paramf, parama);
    if (localObject1 != null) {
      return (b.i.b.a.c.b.h)localObject1;
    }
    Object localObject2 = c();
    localObject1 = null;
    Iterator localIterator = ((List)localObject2).iterator();
    while (localIterator.hasNext())
    {
      localObject2 = ((b.i.b.a.c.i.e.h)localIterator.next()).c(paramf, parama);
      if (localObject2 != null) {
        if (((localObject2 instanceof b.i.b.a.c.b.i)) && (((b.i.b.a.c.b.i)localObject2).o()))
        {
          if (localObject1 == null) {
            localObject1 = localObject2;
          }
        }
        else {
          return (b.i.b.a.c.b.h)localObject2;
        }
      }
    }
    return (b.i.b.a.c.b.h)localObject1;
  }
  
  public final Set<b.i.b.a.c.f.f> j_()
  {
    Object localObject2 = (Iterable)c();
    Object localObject1 = (Collection)new LinkedHashSet();
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      b.a.j.a((Collection)localObject1, (Iterable)((b.i.b.a.c.i.e.h)((Iterator)localObject2).next()).j_());
    }
    localObject1 = (Set)localObject1;
    ((Set)localObject1).addAll((Collection)this.b.j_());
    return (Set<b.i.b.a.c.f.f>)localObject1;
  }
  
  public final Set<b.i.b.a.c.f.f> l_()
  {
    Object localObject2 = (Iterable)c();
    Object localObject1 = (Collection)new LinkedHashSet();
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      b.a.j.a((Collection)localObject1, (Iterable)((b.i.b.a.c.i.e.h)((Iterator)localObject2).next()).l_());
    }
    localObject1 = (Set)localObject1;
    ((Set)localObject1).addAll((Collection)this.b.l_());
    return (Set<b.i.b.a.c.f.f>)localObject1;
  }
  
  static final class a
    extends k
    implements b.f.a.a<List<? extends b.i.b.a.c.i.e.h>>
  {
    a(d paramd)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */