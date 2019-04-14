package b.i.b.a.c.l;

import b.f.b.j;
import b.i.b.a.c.b.a.g;
import b.r;

public final class af
  extends i
  implements aw
{
  private final ad a;
  private final w b;
  
  public af(ad paramad, w paramw)
  {
    this.a = paramad;
    this.b = paramw;
  }
  
  public final ad b(g paramg)
  {
    j.b(paramg, "newAnnotations");
    paramg = ax.b(((az)this.a).a(paramg), this.b);
    if (paramg != null) {
      return (ad)paramg;
    }
    throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
  }
  
  public final ad b(boolean paramBoolean)
  {
    az localaz = ax.b(((az)this.a).a(paramBoolean), (w)this.b.i().a(paramBoolean));
    if (localaz != null) {
      return (ad)localaz;
    }
    throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
  }
  
  protected final ad d()
  {
    return this.a;
  }
  
  public final az g()
  {
    return (az)this.a;
  }
  
  public final w h()
  {
    return this.b;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */