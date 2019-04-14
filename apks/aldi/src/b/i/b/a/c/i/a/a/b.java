package b.i.b.a.c.i.a.a;

import b.a.v;
import b.i.b.a.c.a.g;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.l.a.f;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.ba;
import java.util.Collection;
import java.util.List;

public final class b
  implements an
{
  public f a;
  public final ap b;
  
  public b(ap paramap)
  {
    this.b = paramap;
    int i;
    if (this.b.b() != ba.a) {
      i = 1;
    } else {
      i = 0;
    }
    if (b.w.a)
    {
      if (i != 0) {
        return;
      }
      paramap = new StringBuilder("Only nontrivial projections can be captured, not: ");
      paramap.append(this.b);
      throw ((Throwable)new AssertionError(paramap.toString()));
    }
  }
  
  public final List<ar> b()
  {
    return (List)v.a;
  }
  
  public final g d()
  {
    g localg = this.b.c().f().d();
    b.f.b.j.a(localg, "typeProjection.type.constructor.builtIns");
    return localg;
  }
  
  public final boolean e()
  {
    return false;
  }
  
  public final Collection<b.i.b.a.c.l.w> i_()
  {
    b.i.b.a.c.l.w localw;
    if (this.b.b() == ba.c) {
      localw = this.b.c();
    } else {
      localw = (b.i.b.a.c.l.w)d().h();
    }
    b.f.b.j.a(localw, "if (typeProjection.proje… builtIns.nullableAnyType");
    return (Collection)b.a.j.a(localw);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("CapturedTypeConstructor(");
    localStringBuilder.append(this.b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */