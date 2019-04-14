package b.i.b.a.c.b.c;

import b.i.b.a.c.b.a.a;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.t;
import b.i.b.a.c.b.t.a;
import b.i.b.a.c.f.f;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ad
  extends p
  implements al
{
  protected ad(l paraml, al paramal, g paramg, f paramf, b.a parama, am paramam)
  {
    super(paraml, paramal, paramg, paramf, parama, paramam);
  }
  
  public static ad a(l paraml, g paramg, f paramf, b.a parama, am paramam)
  {
    return new ad(paraml, null, paramg, paramf, parama, paramam);
  }
  
  public t.a<? extends al> D()
  {
    return super.D();
  }
  
  public al a(l paraml, b.i.b.a.c.b.w paramw, az paramaz, b.a parama, boolean paramBoolean)
  {
    return (al)super.b(paraml, paramw, paramaz, parama, paramBoolean);
  }
  
  public ad a(ak paramak1, ak paramak2, List<? extends ar> paramList, List<au> paramList1, b.i.b.a.c.l.w paramw, b.i.b.a.c.b.w paramw1, az paramaz, Map<? extends a.a<?>, ?> paramMap)
  {
    super.a(paramak1, paramak2, paramList, paramList1, paramw, paramw1, paramaz);
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      this.u = new LinkedHashMap(paramMap);
    }
    return this;
  }
  
  protected p a(l paraml, t paramt, b.a parama, f paramf, g paramg, am paramam)
  {
    paramt = (al)paramt;
    if (paramf == null) {
      for (;;)
      {
        paramf = this.d;
      }
    }
    return new ad(paraml, paramt, paramg, paramf, parama, paramam);
  }
  
  public final ad b(ak paramak1, ak paramak2, List<? extends ar> paramList, List<au> paramList1, b.i.b.a.c.l.w paramw, b.i.b.a.c.b.w paramw1, az paramaz)
  {
    return a(paramak1, paramak2, paramList, paramList1, paramw, paramw1, paramaz, null);
  }
  
  public final al u()
  {
    return (al)super.w();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */