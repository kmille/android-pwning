package b.i.b.a.c.l.a;

import b.a.v;
import b.f.b.j;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.i.e.h;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.az;
import b.i.b.a.c.l.p;
import java.util.List;

public final class e
  extends ad
{
  final f a;
  final az b;
  private final a c;
  private final g d;
  private final boolean e;
  
  public e(a parama, f paramf, az paramaz, g paramg, boolean paramBoolean)
  {
    this.c = parama;
    this.a = paramf;
    this.b = paramaz;
    this.d = paramg;
    this.e = paramBoolean;
  }
  
  public e(a parama, az paramaz, ap paramap)
  {
    this(parama, new f(paramap), paramaz);
  }
  
  private e c(g paramg)
  {
    j.b(paramg, "newAnnotations");
    return new e(this.c, this.a, this.b, paramg, this.e);
  }
  
  private e c(boolean paramBoolean)
  {
    return new e(this.c, this.a, this.b, this.d, paramBoolean);
  }
  
  public final List<ap> a()
  {
    return (List)v.a;
  }
  
  public final h b()
  {
    h localh = p.a("No member resolution should be done on captured type!", true);
    j.a(localh, "ErrorUtils.createErrorSc…on captured type!\", true)");
    return localh;
  }
  
  public final boolean c()
  {
    return this.e;
  }
  
  public final g r()
  {
    return this.d;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */