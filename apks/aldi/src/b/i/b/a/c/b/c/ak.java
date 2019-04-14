package b.i.b.a.c.b.c;

import b.i.b.a.c.b.am;
import b.i.b.a.c.b.l;

public abstract class ak
  extends aj
{
  protected final boolean r;
  protected b.i.b.a.c.k.g<b.i.b.a.c.i.b.f<?>> s;
  
  public ak(l paraml, b.i.b.a.c.b.a.g paramg, b.i.b.a.c.f.f paramf, boolean paramBoolean, am paramam)
  {
    super(paraml, paramg, paramf, null, paramam);
    this.r = paramBoolean;
  }
  
  public final b.i.b.a.c.i.b.f<?> A()
  {
    if (this.s != null) {
      return (b.i.b.a.c.i.b.f)this.s.b_();
    }
    return null;
  }
  
  public final void a(b.i.b.a.c.k.g<b.i.b.a.c.i.b.f<?>> paramg)
  {
    if ((!t) && (this.r))
    {
      paramg = new StringBuilder("Constant value for variable initializer should be recorded only for final variables: ");
      paramg.append(this.d);
      throw new AssertionError(paramg.toString());
    }
    this.s = paramg;
  }
  
  public final boolean z()
  {
    return this.r;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */