package b.i.b.a.c.b.c;

import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ap;
import b.i.b.a.c.b.ap.a;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.l;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.c.a;
import b.i.b.a.c.i.d;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.w;
import b.i.b.a.c.l.y;
import java.util.ArrayList;
import java.util.List;

public final class ah
  extends e
{
  private final b.f.a.b<w, Void> c = null;
  private final List<w> e = new ArrayList(1);
  private boolean f = false;
  
  private ah(l paraml, b.i.b.a.c.b.a.g paramg, boolean paramBoolean, ba paramba, f paramf, int paramInt, am paramam, ap paramap)
  {
    super(b.i.b.a.c.k.b.a, paraml, paramg, paramf, paramba, paramBoolean, paramInt, paramam, paramap);
  }
  
  public static ar a(l paraml, b.i.b.a.c.b.a.g paramg, ba paramba, f paramf, int paramInt)
  {
    paramg = a(paraml, paramg, false, paramba, paramf, paramInt, am.b);
    paramg.b(a.d(paraml).h());
    paramg.o();
    return paramg;
  }
  
  public static ah a(l paraml, b.i.b.a.c.b.a.g paramg, boolean paramBoolean, ba paramba, f paramf, int paramInt, am paramam)
  {
    return a(paraml, paramg, paramBoolean, paramba, paramf, paramInt, paramam, ap.a.a);
  }
  
  private static ah a(l paraml, b.i.b.a.c.b.a.g paramg, boolean paramBoolean, ba paramba, f paramf, int paramInt, am paramam, ap paramap)
  {
    return new ah(paraml, paramg, paramBoolean, paramba, paramf, paramInt, paramam, paramap);
  }
  
  private void c(w paramw)
  {
    if (y.b(paramw)) {
      return;
    }
    this.e.add(paramw);
  }
  
  private void p()
  {
    if (!this.f) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("Type parameter descriptor is already initialized: ");
    localStringBuilder.append(q());
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private String q()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.d);
    localStringBuilder.append(" declared in ");
    localStringBuilder.append(d.c(a()));
    return localStringBuilder.toString();
  }
  
  protected final void a(w paramw)
  {
    if (this.c == null) {
      return;
    }
    this.c.a(paramw);
  }
  
  public final void b(w paramw)
  {
    p();
    c(paramw);
  }
  
  protected final List<w> m()
  {
    if (this.f) {
      return this.e;
    }
    StringBuilder localStringBuilder = new StringBuilder("Type parameter descriptor is not initialized: ");
    localStringBuilder.append(q());
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public final void o()
  {
    p();
    this.f = true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */