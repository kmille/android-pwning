package b.i.b.a.c.j.a.a;

import b.i.b.a.c.b.a.a;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.c.ad;
import b.i.b.a.c.b.c.p;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.t;
import b.i.b.a.c.e.a.o;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.a.h;
import b.i.b.a.c.e.a.i;
import b.i.b.a.c.f.f;
import java.util.List;
import java.util.Map;

public final class j
  extends ad
  implements b
{
  private f.a a;
  private final a.o b;
  private final c v;
  private final h w;
  private final i x;
  private final e y;
  
  private j(l paraml, al paramal, g paramg, f paramf, b.a parama, a.o paramo, c paramc, h paramh, i parami, e parame, am paramam)
  {
    super(paraml, paramal, paramg, paramf, parama, paramam);
    this.b = paramo;
    this.v = paramc;
    this.w = paramh;
    this.x = parami;
    this.y = parame;
    this.a = f.a.a;
  }
  
  public final c H()
  {
    return this.v;
  }
  
  public final h I()
  {
    return this.w;
  }
  
  public final e J()
  {
    return this.y;
  }
  
  public final ad a(ak paramak1, ak paramak2, List<? extends ar> paramList, List<? extends au> paramList1, b.i.b.a.c.l.w paramw, b.i.b.a.c.b.w paramw1, az paramaz, Map<? extends a.a<?>, ?> paramMap, f.a parama)
  {
    b.f.b.j.b(paramList, "typeParameters");
    b.f.b.j.b(paramList1, "unsubstitutedValueParameters");
    b.f.b.j.b(paramaz, "visibility");
    b.f.b.j.b(paramMap, "userDataMap");
    b.f.b.j.b(parama, "isExperimentalCoroutineInReleaseEnvironment");
    paramak1 = super.a(paramak1, paramak2, paramList, paramList1, paramw, paramw1, paramaz, paramMap);
    this.a = parama;
    b.f.b.j.a(paramak1, "super.initialize(\n      …easeEnvironment\n        }");
    return paramak1;
  }
  
  public final p a(l paraml, t paramt, b.a parama, f paramf, g paramg, am paramam)
  {
    b.f.b.j.b(paraml, "newOwner");
    b.f.b.j.b(parama, "kind");
    b.f.b.j.b(paramg, "annotations");
    b.f.b.j.b(paramam, "source");
    al localal = (al)paramt;
    if (paramf == null)
    {
      paramt = this.d;
      b.f.b.j.a(paramt, "name");
    }
    else
    {
      paramt = paramf;
    }
    paraml = new j(paraml, localal, paramg, paramt, parama, this.b, this.v, this.w, this.x, this.y, paramam);
    paraml.a = this.a;
    return (p)paraml;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */