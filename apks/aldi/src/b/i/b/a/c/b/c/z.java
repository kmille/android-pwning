package b.i.b.a.c.b.c;

import b.i.b.a.c.b.a.a;
import b.i.b.a.c.b.ag;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.ai;
import b.i.b.a.c.b.aj;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.n;
import b.i.b.a.c.b.r;
import b.i.b.a.c.b.t;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.c.a;
import b.i.b.a.c.l.as;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.k;
import b.i.b.a.c.n.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class z
  extends ak
  implements ah
{
  protected final b.i.b.a.c.b.w a;
  public az b;
  protected Collection<? extends ah> c = null;
  public final b.a e;
  protected final boolean f;
  protected final boolean g;
  protected final boolean h;
  protected b.i.b.a.c.b.ak i;
  protected List<ar> j;
  public aa k;
  protected aj l;
  protected boolean m;
  protected r n;
  protected r o;
  private final ah u;
  private final boolean v;
  private final boolean w;
  private final boolean x;
  private b.i.b.a.c.b.ak y;
  
  protected z(l paraml, ah paramah, b.i.b.a.c.b.a.g paramg, b.i.b.a.c.b.w paramw, az paramaz, boolean paramBoolean1, f paramf, b.a parama, am paramam, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7)
  {
    super(paraml, paramg, paramf, paramBoolean1, paramam);
    this.a = paramw;
    this.b = paramaz;
    if (paramah == null) {
      paraml = this;
    } else {
      paraml = paramah;
    }
    this.u = paraml;
    this.e = parama;
    this.f = paramBoolean2;
    this.v = paramBoolean3;
    this.g = paramBoolean4;
    this.w = paramBoolean5;
    this.x = paramBoolean6;
    this.h = paramBoolean7;
  }
  
  private a F()
  {
    return new a();
  }
  
  private static az a(az paramaz, b.a parama)
  {
    az localaz = paramaz;
    if (parama == b.a.b)
    {
      localaz = paramaz;
      if (ay.a(paramaz.b())) {
        localaz = ay.h;
      }
    }
    return localaz;
  }
  
  public static z a(l paraml, b.i.b.a.c.b.a.g paramg, b.i.b.a.c.b.w paramw, az paramaz, f paramf, b.a parama, am paramam)
  {
    return new z(paraml, null, paramg, paramw, paramaz, true, paramf, parama, paramam, false, false, false, false, false, false);
  }
  
  private static t a(b.i.b.a.c.l.au paramau, ag paramag)
  {
    if (paramag.x() != null) {
      return paramag.x().c(paramau);
    }
    return null;
  }
  
  public boolean B()
  {
    return this.v;
  }
  
  public final boolean C()
  {
    return this.f;
  }
  
  public final boolean D()
  {
    return this.h;
  }
  
  protected final ah a(a parama)
  {
    z localz = a(parama.a, parama.b, parama.c, parama.d, parama.e, parama.j);
    if (parama.i == null) {
      localObject1 = this.j;
    } else {
      localObject1 = parama.i;
    }
    Object localObject3 = new ArrayList(((List)localObject1).size());
    b.i.b.a.c.l.au localau = k.a((List)localObject1, parama.f, localz, (List)localObject3);
    Object localObject4 = localau.b(y(), ba.c);
    o localo = null;
    if (localObject4 == null) {
      return null;
    }
    Object localObject1 = parama.h;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = ((b.i.b.a.c.b.ak)localObject1).a(localau);
      localObject1 = localObject2;
      if (localObject2 == null) {
        return null;
      }
    }
    else
    {
      localObject1 = null;
    }
    if (this.y != null)
    {
      localObject2 = localau.b(this.y.y(), ba.b);
      if (localObject2 == null) {
        return null;
      }
      localObject2 = new ac(localz, new b.i.b.a.c.i.e.a.b(localz, (b.i.b.a.c.l.w)localObject2, this.y.b()), this.y.r());
    }
    else
    {
      localObject2 = null;
    }
    localz.a((b.i.b.a.c.l.w)localObject4, (List)localObject3, (b.i.b.a.c.b.ak)localObject1, (b.i.b.a.c.b.ak)localObject2);
    boolean bool1;
    boolean bool2;
    boolean bool3;
    Object localObject5;
    if (this.k == null)
    {
      localObject1 = null;
    }
    else
    {
      localObject2 = this.k.r();
      localObject3 = parama.b;
      localObject4 = a(this.k.g, parama.e);
      bool1 = this.k.a;
      bool2 = this.k.b;
      bool3 = this.k.f;
      localObject5 = parama.e;
      if (parama.d == null) {
        localObject1 = null;
      } else {
        localObject1 = parama.d.b();
      }
      localObject1 = new aa(localz, (b.i.b.a.c.b.a.g)localObject2, (b.i.b.a.c.b.w)localObject3, (az)localObject4, bool1, bool2, bool3, (b.a)localObject5, (ai)localObject1, am.b);
    }
    if (localObject1 != null)
    {
      localObject2 = this.k.g();
      ((y)localObject1).h = a(localau, this.k);
      if (localObject2 != null) {
        localObject2 = localau.b((b.i.b.a.c.l.w)localObject2, ba.c);
      } else {
        localObject2 = null;
      }
      ((aa)localObject1).a((b.i.b.a.c.l.w)localObject2);
    }
    if (this.l == null)
    {
      localObject2 = null;
    }
    else
    {
      localObject3 = this.l.r();
      localObject4 = parama.b;
      localObject5 = a(this.l.j(), parama.e);
      bool1 = this.l.u();
      bool2 = this.l.q();
      bool3 = this.l.b();
      b.a locala = parama.e;
      if (parama.d == null) {
        localObject2 = null;
      } else {
        localObject2 = parama.d.c();
      }
      localObject2 = new ab(localz, (b.i.b.a.c.b.a.g)localObject3, (b.i.b.a.c.b.w)localObject4, (az)localObject5, bool1, bool2, bool3, locala, (aj)localObject2, am.b);
    }
    if (localObject2 != null)
    {
      localObject4 = p.a((t)localObject2, this.l.k(), localau, false, false, null);
      localObject3 = localObject4;
      if (localObject4 == null)
      {
        localz.m = true;
        localObject3 = Collections.singletonList(ab.a((aj)localObject2, a.d(parama.a).f(), ((b.i.b.a.c.b.au)this.l.k().get(0)).r()));
      }
      if (((List)localObject3).size() == 1)
      {
        ((y)localObject2).h = a(localau, this.l);
        ((ab)localObject2).a((b.i.b.a.c.b.au)((List)localObject3).get(0));
      }
      else
      {
        throw new IllegalStateException();
      }
    }
    if (this.n == null) {
      localObject3 = null;
    } else {
      localObject3 = new o(this.n.r(), localz);
    }
    if (this.o != null) {
      localo = new o(this.o.r(), localz);
    }
    localz.a((aa)localObject1, (aj)localObject2, (r)localObject3, localo);
    if (parama.g)
    {
      parama = i.a();
      localObject1 = m().iterator();
      while (((Iterator)localObject1).hasNext()) {
        parama.add(((ah)((Iterator)localObject1).next()).a(localau));
      }
      localz.a(parama);
    }
    if ((B()) && (this.s != null)) {
      localz.a(this.s);
    }
    return localz;
  }
  
  public final ah a(b.i.b.a.c.l.au paramau)
  {
    if (paramau.b.a()) {
      return this;
    }
    a locala = F();
    locala.f = paramau.b;
    return locala.a(v()).a();
  }
  
  protected z a(l paraml, b.i.b.a.c.b.w paramw, az paramaz, ah paramah, b.a parama, f paramf)
  {
    return new z(paraml, paramah, r(), paramw, paramaz, this.r, paramf, parama, am.b, this.f, B(), this.g, this.w, q(), this.h);
  }
  
  public <V> V a(a.a<V> parama)
  {
    return null;
  }
  
  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    return (R)paramn.a(this, paramD);
  }
  
  public final void a(aa paramaa, aj paramaj)
  {
    a(paramaa, paramaj, null, null);
  }
  
  public final void a(aa paramaa, aj paramaj, r paramr1, r paramr2)
  {
    this.k = paramaa;
    this.l = paramaj;
    this.n = paramr1;
    this.o = paramr2;
  }
  
  public final void a(b.i.b.a.c.l.w paramw, List<? extends ar> paramList, b.i.b.a.c.b.ak paramak1, b.i.b.a.c.b.ak paramak2)
  {
    a(paramw);
    this.j = new ArrayList(paramList);
    this.y = paramak2;
    this.i = paramak1;
  }
  
  public final void a(Collection<? extends b.i.b.a.c.b.b> paramCollection)
  {
    this.c = paramCollection;
  }
  
  public final aj c()
  {
    return this.l;
  }
  
  public final b.i.b.a.c.b.ak d()
  {
    return this.y;
  }
  
  public final b.i.b.a.c.b.w d_()
  {
    return this.a;
  }
  
  public final b.i.b.a.c.b.ak e()
  {
    return this.i;
  }
  
  public final List<ar> f()
  {
    return this.j;
  }
  
  public final b.i.b.a.c.l.w g()
  {
    return y();
  }
  
  public final az j()
  {
    return this.b;
  }
  
  public final Collection<? extends ah> m()
  {
    if (this.c != null) {
      return this.c;
    }
    return Collections.emptyList();
  }
  
  public final boolean o()
  {
    return this.g;
  }
  
  public final boolean p()
  {
    return this.w;
  }
  
  public boolean q()
  {
    return this.x;
  }
  
  public final b.a t()
  {
    return this.e;
  }
  
  public final List<ag> u()
  {
    ArrayList localArrayList = new ArrayList(2);
    if (this.k != null) {
      localArrayList.add(this.k);
    }
    if (this.l != null) {
      localArrayList.add(this.l);
    }
    return localArrayList;
  }
  
  public final ah v()
  {
    if (this.u == this) {
      return this;
    }
    return this.u.v();
  }
  
  public final r w()
  {
    return this.n;
  }
  
  public final r x()
  {
    return this.o;
  }
  
  public final class a
  {
    l a = z.this.a();
    b.i.b.a.c.b.w b = z.this.a;
    az c = z.this.b;
    ah d = null;
    b.a e = z.this.e;
    as f = as.d;
    boolean g = true;
    b.i.b.a.c.b.ak h = z.a(z.this);
    List<ar> i = null;
    f j = z.this.d;
    
    public a() {}
    
    public final ah a()
    {
      return z.this.a(this);
    }
    
    public final a a(b.i.b.a.c.b.b paramb)
    {
      this.d = ((ah)paramb);
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */