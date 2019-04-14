package b.i.b.a.c.b.c;

import b.f.b.j;
import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.n;
import b.i.b.a.c.b.y;
import b.i.b.a.c.f.b;
import b.i.b.a.c.f.c;
import b.r;

public abstract class x
  extends k
  implements ab
{
  public final b e;
  
  public x(y paramy, b paramb)
  {
    super(paramy, g.a.a(), paramb.b.e(), am.b);
    this.e = paramb;
  }
  
  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    j.b(paramn, "visitor");
    return (R)paramn.a((ab)this, paramD);
  }
  
  public final y b()
  {
    l locall = super.a();
    if (locall != null) {
      return (y)locall;
    }
    throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
  }
  
  public final b c()
  {
    return this.e;
  }
  
  public am s()
  {
    am localam = am.b;
    j.a(localam, "SourceElement.NO_SOURCE");
    return localam;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("package ");
    localStringBuilder.append(this.e);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */