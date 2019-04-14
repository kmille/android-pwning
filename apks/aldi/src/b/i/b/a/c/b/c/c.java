package b.i.b.a.c.b.c;

import b.i.b.a.c.b.a;
import b.i.b.a.c.b.a.a;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.n;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.e.a.h;
import b.i.b.a.c.l.as;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.w;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class c
  extends j
  implements ak
{
  private static final f a = f.c("<this>");
  
  public c(g paramg)
  {
    super(paramg, a);
  }
  
  public final ak a(b.i.b.a.c.l.au paramau)
  {
    if (paramau.b.a()) {
      return this;
    }
    w localw;
    if ((a() instanceof b.i.b.a.c.b.e)) {
      localw = y();
    }
    for (ba localba = ba.c;; localba = ba.a)
    {
      paramau = paramau.b(localw, localba);
      break;
      localw = y();
    }
    if (paramau == null) {
      return null;
    }
    if (paramau == y()) {
      return this;
    }
    return new ac(a(), new h(paramau), r());
  }
  
  public final <V> V a(a.a<V> parama)
  {
    return null;
  }
  
  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    return (R)paramn.a(this, paramD);
  }
  
  public final ak d()
  {
    return null;
  }
  
  public final ak e()
  {
    return null;
  }
  
  public final List<ar> f()
  {
    return Collections.emptyList();
  }
  
  public final w g()
  {
    return y();
  }
  
  public final az j()
  {
    return ay.f;
  }
  
  public final List<b.i.b.a.c.b.au> k()
  {
    return Collections.emptyList();
  }
  
  public final boolean l()
  {
    return false;
  }
  
  public final Collection<? extends a> m()
  {
    return Collections.emptySet();
  }
  
  public final am s()
  {
    return am.b;
  }
  
  public final w y()
  {
    return b().a();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */