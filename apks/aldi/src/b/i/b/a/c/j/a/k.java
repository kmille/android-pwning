package b.i.b.a.c.j.a;

import b.i.b.a.c.b.l;
import b.i.b.a.c.e.a.ae;
import b.i.b.a.c.e.a.a;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.a.h;
import b.i.b.a.c.j.a.a.e;
import java.util.List;

public final class k
{
  public final w a;
  public final q b;
  public final i c;
  public final c d;
  public final l e;
  public final h f;
  final b.i.b.a.c.e.a.i g;
  final e h;
  private final a i;
  
  public k(i parami, c paramc, l paraml, h paramh, b.i.b.a.c.e.a.i parami1, a parama, e parame, w paramw, List<a.ae> paramList)
  {
    this.c = parami;
    this.d = paramc;
    this.e = paraml;
    this.f = paramh;
    this.g = parami1;
    this.i = parama;
    this.h = parame;
    parami = new StringBuilder("Deserializer for ");
    parami.append(this.e.i());
    this.a = new w(this, paramw, paramList, parami.toString(), (byte)0);
    this.b = new q(this);
  }
  
  public final k a(l paraml, List<a.ae> paramList, c paramc, h paramh, b.i.b.a.c.e.a.i parami, a parama)
  {
    b.f.b.j.b(paraml, "descriptor");
    b.f.b.j.b(paramList, "typeParameterProtos");
    b.f.b.j.b(paramc, "nameResolver");
    b.f.b.j.b(paramh, "typeTable");
    b.f.b.j.b(parami, "versionRequirementTable");
    b.f.b.j.b(parama, "metadataVersion");
    i locali = this.c;
    b.f.b.j.b(parama, "version");
    if (!b.i.b.a.c.e.a.j.a(parama)) {
      parami = this.g;
    }
    return new k(locali, paramc, paraml, paramh, parami, parama, this.h, this.a, paramList);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */