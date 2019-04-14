package b.i.b.a.c.d.a.c;

import b.f.b.j;
import b.f.b.k;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.l;
import b.i.b.a.c.d.a.c.a.n;
import b.i.b.a.c.d.a.e.w;
import b.i.b.a.c.d.a.e.x;
import b.i.b.a.c.k.d;
import b.i.b.a.c.n.a;
import java.util.Map;

public final class i
  implements m
{
  final Map<w, Integer> a;
  final h b;
  final l c;
  final int d;
  private final d<w, n> e;
  
  public i(h paramh, l paraml, x paramx, int paramInt)
  {
    this.b = paramh;
    this.c = paraml;
    this.d = paramInt;
    this.a = a.a((Iterable)paramx.q());
    this.e = this.b.c.a.b((b.f.a.b)new a(this));
  }
  
  public final ar a(w paramw)
  {
    j.b(paramw, "javaTypeParameter");
    n localn = (n)this.e.a(paramw);
    if (localn != null) {
      return (ar)localn;
    }
    return this.b.d.a(paramw);
  }
  
  static final class a
    extends k
    implements b.f.a.b<w, n>
  {
    a(i parami)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */