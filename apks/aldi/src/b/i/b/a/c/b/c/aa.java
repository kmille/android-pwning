package b.i.b.a.c.b.c;

import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.ai;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.n;
import b.i.b.a.c.f.f;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class aa
  extends y
  implements ai
{
  private b.i.b.a.c.l.w j;
  private final ai k;
  
  public aa(ah paramah, g paramg, b.i.b.a.c.b.w paramw, az paramaz, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, b.a parama, ai paramai, am paramam)
  {
    super(paramw, paramaz, paramah, paramg, f.c(localStringBuilder.toString()), paramBoolean1, paramBoolean2, paramBoolean3, parama, paramam);
    if (paramai != null) {
      paramah = paramai;
    } else {
      paramah = this;
    }
    this.k = paramah;
  }
  
  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    return (R)paramn.a(this, paramD);
  }
  
  public final void a(b.i.b.a.c.l.w paramw)
  {
    b.i.b.a.c.l.w localw = paramw;
    if (paramw == null) {
      localw = this.e.y();
    }
    this.j = localw;
  }
  
  public final b.i.b.a.c.l.w g()
  {
    return this.j;
  }
  
  public final List<au> k()
  {
    return Collections.emptyList();
  }
  
  public final Collection<? extends ai> m()
  {
    return super.a(true);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */