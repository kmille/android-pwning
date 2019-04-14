package b.i.b.a.c.b.c;

import b.a.j;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.d;
import b.i.b.a.c.b.n;
import b.i.b.a.c.i.e.h;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.as;
import b.i.b.a.c.l.au;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.k;
import b.i.b.a.c.l.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class s
  implements b.i.b.a.c.b.e
{
  private final b.i.b.a.c.b.e a;
  private final au b;
  private au c;
  private List<ar> d;
  private List<ar> e;
  private an f;
  
  public s(b.i.b.a.c.b.e parame, au paramau)
  {
    this.a = parame;
    this.b = paramau;
  }
  
  private au y()
  {
    if (this.c == null) {
      if (this.b.b.a())
      {
        this.c = this.b;
      }
      else
      {
        List localList = this.a.c().b();
        this.d = new ArrayList(localList.size());
        this.c = k.a(localList, this.b.b, this, this.d);
        this.e = j.b(this.d, new b.f.a.b() {});
      }
    }
    return this.c;
  }
  
  public final b.i.b.a.c.b.l a()
  {
    return this.a.a();
  }
  
  public final h a(as paramas)
  {
    paramas = this.a.a(paramas);
    if (this.b.b.a()) {
      return paramas;
    }
    return new b.i.b.a.c.i.e.l(paramas, y());
  }
  
  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    return (R)paramn.a(this, paramD);
  }
  
  public final h b()
  {
    return this.a.b();
  }
  
  public final an c()
  {
    Object localObject1 = this.a.c();
    if (this.b.b.a()) {
      return (an)localObject1;
    }
    if (this.f == null)
    {
      au localau = y();
      Object localObject2 = ((an)localObject1).i_();
      localObject1 = new ArrayList(((Collection)localObject2).size());
      localObject2 = ((Collection)localObject2).iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((Collection)localObject1).add(localau.b((b.i.b.a.c.l.w)((Iterator)localObject2).next(), ba.a));
      }
      this.f = new b.i.b.a.c.l.e(this, this.d, (Collection)localObject1, b.i.b.a.c.k.b.a);
    }
    return this.f;
  }
  
  public final h d()
  {
    h localh = this.a.d();
    if (this.b.b.a()) {
      return localh;
    }
    return new b.i.b.a.c.i.e.l(localh, y());
  }
  
  public final b.i.b.a.c.b.w d_()
  {
    return this.a.d_();
  }
  
  public final b.i.b.a.c.b.e e()
  {
    return this.a.e();
  }
  
  public final d e_()
  {
    return this.a.e_();
  }
  
  public final Collection<d> f()
  {
    Object localObject = this.a.f();
    ArrayList localArrayList = new ArrayList(((Collection)localObject).size());
    localObject = ((Collection)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      d locald = (d)((Iterator)localObject).next();
      localArrayList.add(locald.a(this, locald.d_(), locald.j(), locald.t(), false).a(y()));
    }
    return localArrayList;
  }
  
  public final b.i.b.a.c.b.f g()
  {
    return this.a.g();
  }
  
  public final ad h()
  {
    List localList = av.a(c().b());
    return x.a(r(), this, localList);
  }
  
  public final b.i.b.a.c.f.f i()
  {
    return this.a.i();
  }
  
  public final az j()
  {
    return this.a.j();
  }
  
  public final boolean k()
  {
    return this.a.k();
  }
  
  public final boolean l()
  {
    return this.a.l();
  }
  
  public final boolean m()
  {
    return this.a.m();
  }
  
  public final boolean n()
  {
    return this.a.n();
  }
  
  public final boolean o()
  {
    return this.a.o();
  }
  
  public final boolean p()
  {
    return this.a.p();
  }
  
  public final boolean q()
  {
    return this.a.q();
  }
  
  public final g r()
  {
    return this.a.r();
  }
  
  public final am s()
  {
    return am.b;
  }
  
  public final Collection<b.i.b.a.c.b.e> t()
  {
    return this.a.t();
  }
  
  public final List<ar> u()
  {
    y();
    return this.e;
  }
  
  public final h v()
  {
    return this.a.v();
  }
  
  public final ak w()
  {
    throw new UnsupportedOperationException();
  }
  
  public final b.i.b.a.c.b.e x()
  {
    return this.a.x();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */