package b.i.b.a.c.l;

import b.i.b.a.c.b.a.g;

public abstract class j
  extends i
{
  private final ad a;
  
  public j(ad paramad)
  {
    this.a = paramad;
  }
  
  private j c(g paramg)
  {
    b.f.b.j.b(paramg, "newAnnotations");
    if (paramg != r()) {
      return (j)new d((ad)this, paramg);
    }
    return this;
  }
  
  public final ad b(boolean paramBoolean)
  {
    if (paramBoolean == c()) {
      return (ad)this;
    }
    return this.a.b(paramBoolean).b(r());
  }
  
  protected final ad d()
  {
    return this.a;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */