package b.i.b.a.c.i.a.a;

import b.a.v;
import b.f.b.j;
import b.i.b.a.c.i.e.h;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.ak;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.p;
import b.i.b.a.c.l.w;
import java.util.List;

public final class a
  extends ad
  implements ak
{
  private final ap a;
  private final b b;
  private final boolean c;
  private final b.i.b.a.c.b.a.g d;
  
  private a(ap paramap, b paramb, boolean paramBoolean, b.i.b.a.c.b.a.g paramg)
  {
    this.a = paramap;
    this.b = paramb;
    this.c = paramBoolean;
    this.d = paramg;
  }
  
  private final w a(ba paramba, w paramw)
  {
    if (this.a.b() == paramba) {
      paramw = this.a.c();
    }
    j.a(paramw, "if (typeProjection.proje…jection.type else default");
    return paramw;
  }
  
  private a c(b.i.b.a.c.b.a.g paramg)
  {
    j.b(paramg, "newAnnotations");
    return new a(this.a, this.b, this.c, paramg);
  }
  
  private a c(boolean paramBoolean)
  {
    if (paramBoolean == this.c) {
      return this;
    }
    return new a(this.a, this.b, paramBoolean, this.d);
  }
  
  public final List<ap> a()
  {
    return (List)v.a;
  }
  
  public final boolean a(w paramw)
  {
    j.b(paramw, "type");
    return this.b == paramw.f();
  }
  
  public final h b()
  {
    h localh = p.a("No member resolution should be done on captured type, it used only during constraint system resolution", true);
    j.a(localh, "ErrorUtils.createErrorSc…system resolution\", true)");
    return localh;
  }
  
  public final boolean c()
  {
    return this.c;
  }
  
  public final w d()
  {
    ba localba = ba.c;
    ad localad = b.i.b.a.c.l.c.a.a(this).h();
    j.a(localad, "builtIns.nullableAnyType");
    return a(localba, (w)localad);
  }
  
  public final w e()
  {
    ba localba = ba.b;
    ad localad = b.i.b.a.c.l.c.a.a(this).f();
    j.a(localad, "builtIns.nothingType");
    return a(localba, (w)localad);
  }
  
  public final b.i.b.a.c.b.a.g r()
  {
    return this.d;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Captured(");
    localStringBuilder.append(this.a);
    localStringBuilder.append(')');
    String str;
    if (this.c) {
      str = "?";
    } else {
      str = "";
    }
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */