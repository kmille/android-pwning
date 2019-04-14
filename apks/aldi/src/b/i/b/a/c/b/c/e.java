package b.i.b.a.c.b.c;

import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ap;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.n;
import b.i.b.a.c.k.i;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.c;
import b.i.b.a.c.l.p;
import b.i.b.a.c.l.w;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class e
  extends k
  implements ar
{
  final ba a;
  final boolean b;
  private final int c;
  private final b.i.b.a.c.k.f<an> e;
  private final b.i.b.a.c.k.f<ad> f;
  
  protected e(final i parami, l paraml, b.i.b.a.c.b.a.g paramg, final b.i.b.a.c.f.f paramf, ba paramba, boolean paramBoolean, int paramInt, am paramam, final ap paramap)
  {
    super(paraml, paramg, paramf, paramam);
    this.a = paramba;
    this.b = paramBoolean;
    this.c = paramInt;
    this.e = parami.a(new b.f.a.a() {});
    this.f = parami.a(new b.f.a.a() {});
  }
  
  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    return (R)paramn.a(this, paramD);
  }
  
  protected abstract void a(w paramw);
  
  public final boolean b()
  {
    return false;
  }
  
  public final an c()
  {
    return (an)this.e.b_();
  }
  
  public final ar d()
  {
    return (ar)super.n();
  }
  
  public final int g()
  {
    return this.c;
  }
  
  public final ad h()
  {
    return (ad)this.f.b_();
  }
  
  public final List<w> j()
  {
    return ((a)c()).h();
  }
  
  public final ba k()
  {
    return this.a;
  }
  
  public final boolean l()
  {
    return this.b;
  }
  
  protected abstract List<w> m();
  
  final class a
    extends c
  {
    private final ap b;
    
    public a(i parami, ap paramap)
    {
      super();
      this.b = paramap;
    }
    
    public final Collection<w> a()
    {
      return e.this.m();
    }
    
    public final void a(w paramw)
    {
      e.this.a(paramw);
    }
    
    public final List<ar> b()
    {
      return Collections.emptyList();
    }
    
    public final b.i.b.a.c.b.h c()
    {
      return e.this;
    }
    
    public final b.i.b.a.c.a.g d()
    {
      return b.i.b.a.c.i.c.a.d(e.this);
    }
    
    public final boolean e()
    {
      return true;
    }
    
    public final ap f()
    {
      return this.b;
    }
    
    public final w g()
    {
      return p.c("Cyclic upper bounds");
    }
    
    public final String toString()
    {
      return e.this.d.toString();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */