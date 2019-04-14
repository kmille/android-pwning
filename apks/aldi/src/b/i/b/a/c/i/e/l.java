package b.i.b.a.c.i.e;

import b.e;
import b.f.a.b;
import b.f.b.j;
import b.f.b.k;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.ao;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.a.a.c;
import b.i.b.a.c.l.as;
import b.i.b.a.c.l.au;
import b.r;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class l
  implements h
{
  private final au b;
  private Map<b.i.b.a.c.b.l, b.i.b.a.c.b.l> c;
  private final b.d d;
  private final h e;
  
  public l(h paramh, au paramau)
  {
    this.e = paramh;
    paramh = paramau.b;
    j.a(paramh, "givenSubstitutor.substitution");
    this.b = c.a(paramh).d();
    this.d = e.a((b.f.a.a)new a(this));
  }
  
  private final <D extends b.i.b.a.c.b.l> D a(D paramD)
  {
    if (this.b.b.a()) {
      return paramD;
    }
    if (this.c == null) {
      this.c = ((Map)new HashMap());
    }
    Map localMap = this.c;
    if (localMap == null) {
      j.a();
    }
    Object localObject2 = localMap.get(paramD);
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      if ((paramD instanceof ao))
      {
        localObject1 = ((ao)paramD).d(this.b);
        if (localObject1 != null)
        {
          localObject1 = (b.i.b.a.c.b.l)localObject1;
          localMap.put(paramD, localObject1);
        }
        else
        {
          localObject1 = new StringBuilder("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ");
          ((StringBuilder)localObject1).append(paramD);
          ((StringBuilder)localObject1).append(" substitution fails");
          throw ((Throwable)new AssertionError(((StringBuilder)localObject1).toString()));
        }
      }
      else
      {
        throw ((Throwable)new IllegalStateException("Unknown descriptor in scope: ".concat(String.valueOf(paramD)).toString()));
      }
    }
    paramD = (b.i.b.a.c.b.l)localObject1;
    if (paramD != null) {
      return paramD;
    }
    throw new r("null cannot be cast to non-null type D");
  }
  
  private final <D extends b.i.b.a.c.b.l> Collection<D> a(Collection<? extends D> paramCollection)
  {
    if (this.b.b.a()) {
      return paramCollection;
    }
    if (paramCollection.isEmpty()) {
      return paramCollection;
    }
    LinkedHashSet localLinkedHashSet = new LinkedHashSet(b.i.b.a.c.n.a.c(paramCollection.size()));
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      localLinkedHashSet.add(a((b.i.b.a.c.b.l)paramCollection.next()));
    }
    return (Collection)localLinkedHashSet;
  }
  
  public final Collection<ah> a(f paramf, b.i.b.a.c.c.a.a parama)
  {
    j.b(paramf, "name");
    j.b(parama, "location");
    return a(this.e.a(paramf, parama));
  }
  
  public final Collection<b.i.b.a.c.b.l> a(d paramd, b<? super f, Boolean> paramb)
  {
    j.b(paramd, "kindFilter");
    j.b(paramb, "nameFilter");
    return (Collection)this.d.a();
  }
  
  public final Collection<al> b(f paramf, b.i.b.a.c.c.a.a parama)
  {
    j.b(paramf, "name");
    j.b(parama, "location");
    return a(this.e.b(paramf, parama));
  }
  
  public final b.i.b.a.c.b.h c(f paramf, b.i.b.a.c.c.a.a parama)
  {
    j.b(paramf, "name");
    j.b(parama, "location");
    paramf = this.e.c(paramf, parama);
    if (paramf != null) {
      return (b.i.b.a.c.b.h)a((b.i.b.a.c.b.l)paramf);
    }
    return null;
  }
  
  public final Set<f> j_()
  {
    return this.e.j_();
  }
  
  public final Set<f> l_()
  {
    return this.e.l_();
  }
  
  static final class a
    extends k
    implements b.f.a.a<Collection<? extends b.i.b.a.c.b.l>>
  {
    a(l paraml)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/e/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */