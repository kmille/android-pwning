package b.i.b.a.c.d.a.c.a;

import b.a.v;
import b.f.b.k;
import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.c.x;
import b.i.b.a.c.b.e;
import b.i.b.a.c.d.a.e.t;
import b.i.b.a.c.d.b.n;
import b.i.b.a.c.d.b.o;
import b.i.b.a.c.k.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class h
  extends x
{
  public final b.i.b.a.c.k.f<List<b.i.b.a.c.f.b>> b;
  private final b.i.b.a.c.d.a.c.h c;
  private final b.i.b.a.c.k.f f;
  private final d g;
  private final b.i.b.a.c.b.a.g h;
  private final b.i.b.a.c.k.f i;
  private final t j;
  
  public h(b.i.b.a.c.d.a.c.h paramh, t paramt)
  {
    super(paramh.c.n, paramt.b());
    this.j = paramt;
    this.c = b.i.b.a.c.d.a.c.a.a(paramh, (b.i.b.a.c.b.g)this, null, 6);
    this.f = this.c.c.a.a((b.f.a.a)new a(this));
    this.g = new d(this.c, this.j, this);
    this.b = this.c.c.a.a((b.f.a.a)new c(this), (List)v.a);
    if (this.c.c.p.a)
    {
      paramh = b.i.b.a.c.b.a.g.a;
      paramh = g.a.a();
    }
    else
    {
      paramh = b.i.b.a.c.d.a.c.f.a(this.c, (b.i.b.a.c.d.a.e.d)this.j);
    }
    this.h = paramh;
    this.i = this.c.c.a.a((b.f.a.a)new b(this));
  }
  
  public final e a(b.i.b.a.c.d.a.e.g paramg)
  {
    b.f.b.j.b(paramg, "jClass");
    j localj = this.g.b;
    b.f.b.j.b(paramg, "javaClass");
    return localj.a(paramg.p(), paramg);
  }
  
  public final Map<String, n> d()
  {
    return (Map)b.i.b.a.c.k.h.a(this.f, a[0]);
  }
  
  public final b.i.b.a.c.b.a.g r()
  {
    return this.h;
  }
  
  public final am s()
  {
    return (am)new o(this);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Lazy Java package fragment: ");
    localStringBuilder.append(this.e);
    return localStringBuilder.toString();
  }
  
  static final class a
    extends k
    implements b.f.a.a<Map<String, ? extends n>>
  {
    a(h paramh)
    {
      super();
    }
  }
  
  static final class b
    extends k
    implements b.f.a.a<HashMap<b.i.b.a.c.i.d.b, b.i.b.a.c.i.d.b>>
  {
    b(h paramh)
    {
      super();
    }
  }
  
  static final class c
    extends k
    implements b.f.a.a<List<? extends b.i.b.a.c.f.b>>
  {
    c(h paramh)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */