package b.i.b.a.c.j.a.a;

import b.f.b.j;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.as;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.c.af;
import b.i.b.a.c.b.c.d;
import b.i.b.a.c.b.l;
import b.i.b.a.c.e.a.ab;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.i.e.h.b;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.w;
import b.i.b.a.c.l.y;
import java.util.Collection;
import java.util.List;

public final class k
  extends d
  implements f
{
  private Collection<? extends af> c;
  private ad e;
  private ad f;
  private List<? extends ar> g;
  private ad h;
  private f.a i;
  private final b.i.b.a.c.k.i j;
  private final a.ab k;
  private final c l;
  private final b.i.b.a.c.e.a.h m;
  private final b.i.b.a.c.e.a.i n;
  private final e o;
  
  public k(b.i.b.a.c.k.i parami, l paraml, g paramg, b.i.b.a.c.f.f paramf, az paramaz, a.ab paramab, c paramc, b.i.b.a.c.e.a.h paramh, b.i.b.a.c.e.a.i parami1, e parame)
  {
    super(paraml, paramg, paramf, localam, paramaz);
    this.j = parami;
    this.k = paramab;
    this.l = paramc;
    this.m = paramh;
    this.n = parami1;
    this.o = parame;
    this.i = f.a.a;
  }
  
  public final c H()
  {
    return this.l;
  }
  
  public final b.i.b.a.c.e.a.h I()
  {
    return this.m;
  }
  
  public final e J()
  {
    return this.o;
  }
  
  public final void a(List<? extends ar> paramList, ad paramad1, ad paramad2, f.a parama)
  {
    j.b(paramList, "declaredTypeParameters");
    j.b(paramad1, "underlyingType");
    j.b(paramad2, "expandedType");
    j.b(parama, "isExperimentalCoroutineInReleaseEnvironment");
    j.b(paramList, "declaredTypeParameters");
    this.a = paramList;
    this.e = paramad1;
    this.f = paramad2;
    this.g = as.a(this);
    paramad2 = (b.i.b.a.c.b.h)this;
    paramList = g();
    if (paramList != null)
    {
      paramad1 = paramList.d();
      paramList = paramad1;
      if (paramad1 != null) {}
    }
    else
    {
      paramList = (b.i.b.a.c.i.e.h)h.b.a;
    }
    paramList = av.a(paramad2, paramList);
    j.a(paramList, "TypeUtils.makeUnsubstitu…ope ?: MemberScope.Empty)");
    this.h = paramList;
    this.c = m();
    this.i = parama;
  }
  
  public final ad b()
  {
    ad localad = this.e;
    if (localad == null) {
      j.a("underlyingType");
    }
    return localad;
  }
  
  public final ad d()
  {
    ad localad = this.f;
    if (localad == null) {
      j.a("expandedType");
    }
    return localad;
  }
  
  public final b.i.b.a.c.b.e g()
  {
    if (y.b((w)d())) {
      return null;
    }
    b.i.b.a.c.b.h localh2 = d().f().c();
    b.i.b.a.c.b.h localh1 = localh2;
    if (!(localh2 instanceof b.i.b.a.c.b.e)) {
      localh1 = null;
    }
    return (b.i.b.a.c.b.e)localh1;
  }
  
  public final ad h()
  {
    ad localad = this.h;
    if (localad == null) {
      j.a("defaultTypeImpl");
    }
    return localad;
  }
  
  public final b.i.b.a.c.k.i k()
  {
    return this.j;
  }
  
  public final List<ar> t()
  {
    List localList = this.g;
    if (localList == null) {
      j.a("typeConstructorParameters");
    }
    return localList;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */