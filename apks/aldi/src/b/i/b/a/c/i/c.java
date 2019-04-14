package b.i.b.a.c.i;

import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.c.aa;
import b.i.b.a.c.b.c.ab;
import b.i.b.a.c.b.c.ac;
import b.i.b.a.c.b.c.ad;
import b.i.b.a.c.b.c.ai;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.t;
import b.i.b.a.c.i.e.a.b;
import b.i.b.a.c.l.ba;
import java.util.Collections;

public final class c
{
  public static ak a(b.i.b.a.c.b.a parama, b.i.b.a.c.l.w paramw, b.i.b.a.c.b.a.g paramg)
  {
    if (paramw == null) {
      return null;
    }
    return new ac(parama, new b(parama, paramw, null), paramg);
  }
  
  public static al a(e parame)
  {
    g.a locala = b.i.b.a.c.b.a.g.a;
    return ad.a(parame, g.a.a(), d.a, b.a.d, parame.s()).b(null, null, Collections.emptyList(), Collections.emptyList(), b.i.b.a.c.i.c.a.d(parame).a(ba.a, parame.h()), b.i.b.a.c.b.w.a, ay.e);
  }
  
  public static aa a(ah paramah, b.i.b.a.c.b.a.g paramg)
  {
    return a(paramah, paramg, true, paramah.s());
  }
  
  public static aa a(ah paramah, b.i.b.a.c.b.a.g paramg, boolean paramBoolean, am paramam)
  {
    return new aa(paramah, paramg, paramah.d_(), paramah.j(), paramBoolean, false, false, b.a.a, null, paramam);
  }
  
  public static ab a(ah paramah, b.i.b.a.c.b.a.g paramg1, b.i.b.a.c.b.a.g paramg2)
  {
    return a(paramah, paramg1, paramg2, paramah.s());
  }
  
  private static ab a(ah paramah, b.i.b.a.c.b.a.g paramg1, b.i.b.a.c.b.a.g paramg2, am paramam)
  {
    return a(paramah, paramg1, paramg2, true, paramah.j(), paramam);
  }
  
  public static ab a(ah paramah, b.i.b.a.c.b.a.g paramg1, b.i.b.a.c.b.a.g paramg2, boolean paramBoolean, az paramaz, am paramam)
  {
    paramg1 = new ab(paramah, paramg1, paramah.d_(), paramaz, paramBoolean, false, false, b.a.a, null, paramam);
    paramg1.a(ab.a(paramg1, paramah.y(), paramg2));
    return paramg1;
  }
  
  public static boolean a(t paramt)
  {
    return (paramt.t() == b.a.d) && (d.j(paramt.a()));
  }
  
  public static al b(e parame)
  {
    Object localObject1 = b.i.b.a.c.b.a.g.a;
    localObject1 = ad.a(parame, g.a.a(), d.b, b.a.d, parame.s());
    Object localObject2 = b.i.b.a.c.b.a.g.a;
    localObject2 = new ai((b.i.b.a.c.b.a)localObject1, null, 0, g.a.a(), b.i.b.a.c.f.f.a("value"), b.i.b.a.c.i.c.a.d(parame).j(), false, false, false, null, parame.s());
    return ((ad)localObject1).b(null, null, Collections.emptyList(), Collections.singletonList(localObject2), parame.h(), b.i.b.a.c.b.w.a, ay.e);
  }
  
  public static final class a
    extends b.i.b.a.c.b.c.f
  {
    public a(e parame, am paramam)
    {
      super(null, g.a.a(), true, b.a.a, paramam);
      a(Collections.emptyList(), d.b(parame));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */