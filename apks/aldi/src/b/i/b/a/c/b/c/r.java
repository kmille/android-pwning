package b.i.b.a.c.b.c;

import b.f.a.a;
import b.f.b.k;
import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.ad;
import b.i.b.a.c.b.n;
import b.i.b.a.c.f.b;
import b.i.b.a.c.f.c;
import b.i.b.a.c.i.e.g;
import b.i.b.a.c.k.f;
import b.i.b.a.c.k.i;
import java.util.List;

public final class r
  extends j
  implements ad
{
  final v b;
  final b c;
  private final f e;
  private final b.i.b.a.c.i.e.h f;
  
  public r(v paramv, b paramb, i parami)
  {
    super(g.a.a(), paramb.b.e());
    this.b = paramv;
    this.c = paramb;
    this.e = parami.a((a)new a(this));
    this.f = ((b.i.b.a.c.i.e.h)new g(parami.a((a)new b(this))));
  }
  
  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    b.f.b.j.b(paramn, "visitor");
    return (R)paramn.a((ad)this, paramD);
  }
  
  public final b b()
  {
    return this.c;
  }
  
  public final b.i.b.a.c.i.e.h c()
  {
    return this.f;
  }
  
  public final boolean equals(Object paramObject)
  {
    Object localObject = paramObject;
    if (!(paramObject instanceof ad)) {
      localObject = null;
    }
    paramObject = (ad)localObject;
    if (paramObject == null) {
      return false;
    }
    return (b.f.b.j.a(this.c, ((ad)paramObject).b())) && (b.f.b.j.a(this.b, ((ad)paramObject).d()));
  }
  
  public final List<ab> f()
  {
    return (List)b.i.b.a.c.k.h.a(this.e, a[0]);
  }
  
  public final boolean g()
  {
    return f().isEmpty();
  }
  
  public final int hashCode()
  {
    return this.b.hashCode() * 31 + this.c.hashCode();
  }
  
  static final class a
    extends k
    implements a<List<? extends ab>>
  {
    a(r paramr)
    {
      super();
    }
  }
  
  static final class b
    extends k
    implements a<b.i.b.a.c.i.e.h>
  {
    b(r paramr)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */