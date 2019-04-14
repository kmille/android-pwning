package b.i.b.a.c.l;

import b.a.v;
import b.f.b.j;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.i.e.h;
import java.util.List;

public final class aj
  extends ad
{
  private final an a;
  private final boolean b;
  private final an c;
  private final h d;
  
  private aj(an paraman1, boolean paramBoolean, an paraman2, h paramh)
  {
    this.a = paraman1;
    this.b = paramBoolean;
    this.c = paraman2;
    this.d = paramh;
  }
  
  public final List<ap> a()
  {
    return (List)v.a;
  }
  
  public final h b()
  {
    return this.d;
  }
  
  public final ad b(g paramg)
  {
    j.b(paramg, "newAnnotations");
    throw ((Throwable)new IllegalStateException("Shouldn't be called on non-fixed type".toString()));
  }
  
  public final ad b(boolean paramBoolean)
  {
    if (paramBoolean == this.b) {
      return (ad)this;
    }
    return (ad)new aj(this.a, paramBoolean, this.c, this.d);
  }
  
  public final boolean c()
  {
    return this.b;
  }
  
  public final an f()
  {
    return this.c;
  }
  
  public final g r()
  {
    g.a locala = g.a;
    return g.a.a();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("NonFixed: ");
    localStringBuilder.append(this.a);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */