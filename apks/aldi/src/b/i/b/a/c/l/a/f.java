package b.i.b.a.c.l.a;

import b.a.v;
import b.f.b.j;
import b.i.b.a.c.a.g;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.h;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.az;
import b.i.b.a.c.l.c.a;
import b.i.b.a.c.l.w;
import java.util.List;

public final class f
  implements an
{
  List<? extends az> a;
  private final ap b;
  
  public f(ap paramap, List<? extends az> paramList)
  {
    this.b = paramap;
    this.a = paramList;
  }
  
  public final List<ar> b()
  {
    return (List)v.a;
  }
  
  public final h c()
  {
    return null;
  }
  
  public final g d()
  {
    w localw = this.b.c();
    j.a(localw, "projection.type");
    return a.a(localw);
  }
  
  public final boolean e()
  {
    return false;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("CapturedType(");
    localStringBuilder.append(this.b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */