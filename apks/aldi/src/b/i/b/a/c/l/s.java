package b.i.b.a.c.l;

import b.f.b.j;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.h.c;
import b.i.b.a.c.h.i;

public final class s
  extends q
  implements aw
{
  private final q c;
  private final w d;
  
  public s(q paramq, w paramw)
  {
    super(paramq.a, paramq.b);
    this.c = paramq;
    this.d = paramw;
  }
  
  public final az a(g paramg)
  {
    j.b(paramg, "newAnnotations");
    return ax.b(this.c.a(paramg), this.d);
  }
  
  public final az a(boolean paramBoolean)
  {
    return ax.b(this.c.a(paramBoolean), (w)this.d.i().a(paramBoolean));
  }
  
  public final String a(c paramc, i parami)
  {
    j.b(paramc, "renderer");
    j.b(parami, "options");
    if (parami.c()) {
      return paramc.a(this.d);
    }
    return this.c.a(paramc, parami);
  }
  
  public final w h()
  {
    return this.d;
  }
  
  public final ad n_()
  {
    return this.c.n_();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */