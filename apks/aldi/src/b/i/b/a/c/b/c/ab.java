package b.i.b.a.c.b.c;

import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.aj;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.n;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.c.a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ab
  extends y
  implements aj
{
  private au k;
  private final aj l;
  
  public ab(ah paramah, b.i.b.a.c.b.a.g paramg, b.i.b.a.c.b.w paramw, az paramaz, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, b.a parama, aj paramaj, am paramam)
  {
    super(paramw, paramaz, paramah, paramg, f.c(localStringBuilder.toString()), paramBoolean1, paramBoolean2, paramBoolean3, parama, paramam);
    if (paramaj != null) {
      paramah = paramaj;
    } else {
      paramah = this;
    }
    this.l = paramah;
  }
  
  public static ai a(aj paramaj, b.i.b.a.c.l.w paramw, b.i.b.a.c.b.a.g paramg)
  {
    return new ai(paramaj, null, 0, paramg, f.c("<set-?>"), paramw, false, false, false, null, am.b);
  }
  
  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    return (R)paramn.a(this, paramD);
  }
  
  public final void a(au paramau)
  {
    if ((!j) && (this.k != null)) {
      throw new AssertionError();
    }
    this.k = paramau;
  }
  
  public final b.i.b.a.c.l.w g()
  {
    return a.d(this).i();
  }
  
  public final List<au> k()
  {
    if (this.k != null) {
      return Collections.singletonList(this.k);
    }
    throw new IllegalStateException();
  }
  
  public final Collection<? extends aj> m()
  {
    return super.a(false);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */