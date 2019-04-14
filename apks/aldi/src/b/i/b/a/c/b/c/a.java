package b.i.b.a.c.b.c;

import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.n;
import b.i.b.a.c.i.e.h;
import b.i.b.a.c.i.e.l;
import b.i.b.a.c.k.i;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.as;
import b.i.b.a.c.l.au;

public abstract class a
  implements e
{
  private final b.i.b.a.c.k.f<h> a;
  private final b.i.b.a.c.k.f<ak> b;
  public final b.i.b.a.c.f.f d;
  protected final b.i.b.a.c.k.f<ad> e;
  
  public a(i parami, b.i.b.a.c.f.f paramf)
  {
    this.d = paramf;
    this.e = parami.a(new b.f.a.a() {});
    this.a = parami.a(new b.f.a.a() {});
    this.b = parami.a(new b.f.a.a() {});
  }
  
  public e a(au paramau)
  {
    if (paramau.b.a()) {
      return this;
    }
    return new s(this, paramau);
  }
  
  public h a(as paramas)
  {
    if (paramas.a()) {
      return d();
    }
    paramas = au.a(paramas);
    return new l(d(), paramas);
  }
  
  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    return (R)paramn.a(this, paramD);
  }
  
  public final ad h()
  {
    return (ad)this.e.b_();
  }
  
  public final b.i.b.a.c.f.f i()
  {
    return this.d;
  }
  
  public h v()
  {
    return (h)this.a.b_();
  }
  
  public final ak w()
  {
    return (ak)this.b.b_();
  }
  
  public final e x()
  {
    return this;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */