package b.i.b.a.c.j.a.a;

import b.f.b.j;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.aj;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.c.aa;
import b.i.b.a.c.b.c.ak;
import b.i.b.a.c.b.c.z;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.r;
import b.i.b.a.c.b.w;
import b.i.b.a.c.e.a.u;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.a.h;
import b.i.b.a.c.f.f;
import b.u;

public final class i
  extends z
  implements b
{
  public final a.u u;
  public final c v;
  public final h w;
  public final e x;
  private f.a y;
  private final b.i.b.a.c.e.a.i z;
  
  public i(l paraml, ah paramah, g paramg, w paramw, az paramaz, boolean paramBoolean1, f paramf, b.i.b.a.c.b.b.a parama, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, a.u paramu, c paramc, h paramh, b.i.b.a.c.e.a.i parami, e parame)
  {
    super(paraml, paramah, paramg, paramw, paramaz, paramBoolean1, paramf, parama, am.b, paramBoolean2, paramBoolean3, paramBoolean6, false, paramBoolean4, paramBoolean5);
    this.u = paramu;
    this.v = paramc;
    this.w = paramh;
    this.z = parami;
    this.x = parame;
    this.y = f.a.a;
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
    return this.x;
  }
  
  public final z a(l paraml, w paramw, az paramaz, ah paramah, b.i.b.a.c.b.b.a parama, f paramf)
  {
    j.b(paraml, "newOwner");
    j.b(paramw, "newModality");
    j.b(paramaz, "newVisibility");
    j.b(parama, "kind");
    j.b(paramf, "newName");
    return (z)new i(paraml, paramah, r(), paramw, paramaz, this.r, paramf, parama, this.f, B(), q(), this.h, this.g, this.u, this.v, this.w, this.z, this.x);
  }
  
  public final void a(aa paramaa, aj paramaj, r paramr1, r paramr2, f.a parama)
  {
    j.b(parama, "isExperimentalCoroutineInReleaseEnvironment");
    super.a(paramaa, paramaj, paramr1, paramr2);
    paramaa = u.a;
    this.y = parama;
  }
  
  public final boolean q()
  {
    Boolean localBoolean = b.i.b.a.c.e.a.b.z.a(this.u.b);
    j.a(localBoolean, "Flags.IS_EXTERNAL_PROPERTY.get(proto.flags)");
    return localBoolean.booleanValue();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */