package b.i.b.a.c.j.a.a;

import b.i.b.a.c.a.g;
import b.i.b.a.c.b.a.c;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ap;
import b.i.b.a.c.b.ap.a;
import b.i.b.a.c.b.c.b;
import b.i.b.a.c.e.a.aa;
import b.i.b.a.c.e.a.ae;
import b.i.b.a.c.e.a.ae.b;
import b.i.b.a.c.e.a.h;
import b.i.b.a.c.f.f;
import b.i.b.a.c.j.a.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class l
  extends b
{
  final b.i.b.a.c.j.a.k c;
  final a.ae e;
  private final a f;
  
  public l(b.i.b.a.c.j.a.k paramk, a.ae paramae, int paramInt)
  {
    super(locali, locall, localf, t.a((a.ae.b)localObject), paramae.d, paramInt, am.b, (ap)ap.a.a);
    this.c = paramk;
    this.e = paramae;
    this.f = new a(this.c.c.b, (b.f.a.a)new a(this));
  }
  
  public final List<b.i.b.a.c.l.w> m()
  {
    Object localObject4 = this.e;
    Object localObject3 = this.c.f;
    b.f.b.j.b(localObject4, "receiver$0");
    b.f.b.j.b(localObject3, "typeTable");
    Object localObject1 = ((a.ae)localObject4).f;
    if (!(((Collection)localObject1).isEmpty() ^ true)) {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject1 = ((a.ae)localObject4).g;
      b.f.b.j.a(localObject1, "upperBoundIdList");
      localObject2 = (Iterable)localObject1;
      localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject4 = (Integer)((Iterator)localObject2).next();
        b.f.b.j.a(localObject4, "it");
        ((Collection)localObject1).add(((h)localObject3).a(((Integer)localObject4).intValue()));
      }
      localObject2 = (List)localObject1;
    }
    if (((List)localObject2).isEmpty()) {
      return b.a.j.a(b.i.b.a.c.i.c.a.d((b.i.b.a.c.b.l)this).h());
    }
    localObject3 = (Iterable)localObject2;
    localObject1 = this.c.a;
    localObject2 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject3));
    localObject3 = ((Iterable)localObject3).iterator();
    while (((Iterator)localObject3).hasNext()) {
      ((Collection)localObject2).add(((b.i.b.a.c.j.a.w)localObject1).a((a.aa)((Iterator)localObject3).next()));
    }
    return (List)localObject2;
  }
  
  static final class a
    extends b.f.b.k
    implements b.f.a.a<List<? extends c>>
  {
    a(l paraml)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */