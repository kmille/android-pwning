package b.i.b.a.c.b.c;

import b.a.j;
import b.i.b.a.c.b.a.a;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.a.i;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.n;
import b.i.b.a.c.b.t;
import b.i.b.a.c.b.t.a;
import b.i.b.a.c.f.f;
import b.i.b.a.c.l.as;
import b.i.b.a.c.l.ba;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class p
  extends k
  implements t
{
  private ak a;
  private boolean b = true;
  public List<ar> c;
  public List<b.i.b.a.c.b.au> e;
  public b.i.b.a.c.l.w f;
  protected ak g;
  protected b.i.b.a.c.b.w h;
  public az i = ay.i;
  public boolean j = false;
  public boolean k = false;
  public boolean l = false;
  public boolean m = false;
  public boolean n = false;
  public boolean o = false;
  boolean p = false;
  boolean q = false;
  boolean r = false;
  public boolean s = false;
  protected final b.a t;
  protected Map<a.a<?>, Object> u = null;
  private boolean v = false;
  private Collection<? extends t> w = null;
  private volatile b.f.a.a<Collection<t>> x = null;
  private final t y;
  private t z = null;
  
  protected p(l paraml, t paramt, g paramg, f paramf, b.a parama, am paramam)
  {
    super(paraml, paramg, paramf, paramam);
    paraml = paramt;
    if (paramt == null) {
      paraml = this;
    }
    this.y = paraml;
    this.t = parama;
  }
  
  public static List<b.i.b.a.c.b.au> a(t paramt, List<b.i.b.a.c.b.au> paramList, b.i.b.a.c.l.au paramau, boolean paramBoolean1, boolean paramBoolean2, boolean[] paramArrayOfBoolean)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (b.i.b.a.c.b.au)localIterator.next();
      b.i.b.a.c.l.w localw = paramau.b(((b.i.b.a.c.b.au)localObject2).y(), ba.b);
      Object localObject1 = ((b.i.b.a.c.b.au)localObject2).m_();
      if (localObject1 == null) {
        paramList = null;
      } else {
        paramList = paramau.b((b.i.b.a.c.l.w)localObject1, ba.b);
      }
      if (localw == null) {
        return null;
      }
      if (((localw != ((b.i.b.a.c.b.au)localObject2).y()) || (localObject1 != paramList)) && (paramArrayOfBoolean != null)) {
        paramArrayOfBoolean[0] = true;
      }
      if (paramBoolean1) {
        localObject1 = null;
      } else {
        localObject1 = localObject2;
      }
      int i1 = ((b.i.b.a.c.b.au)localObject2).c();
      g localg = ((b.i.b.a.c.b.au)localObject2).r();
      f localf = ((b.i.b.a.c.b.au)localObject2).i();
      boolean bool1 = ((b.i.b.a.c.b.au)localObject2).h();
      boolean bool2 = ((b.i.b.a.c.b.au)localObject2).p();
      boolean bool3 = ((b.i.b.a.c.b.au)localObject2).q();
      if (paramBoolean2) {}
      for (localObject2 = ((b.i.b.a.c.b.au)localObject2).s();; localObject2 = am.b) {
        break;
      }
      localArrayList.add(new ai(paramt, (b.i.b.a.c.b.au)localObject1, i1, localg, localf, localw, bool1, bool2, bool3, paramList, (am)localObject2));
    }
    return localArrayList;
  }
  
  public final boolean A()
  {
    if (this.k) {
      return true;
    }
    Iterator localIterator = w().m().iterator();
    while (localIterator.hasNext()) {
      if (((t)localIterator.next()).A()) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean B()
  {
    return this.r;
  }
  
  public boolean C()
  {
    return this.s;
  }
  
  public t.a<? extends t> D()
  {
    return e(b.i.b.a.c.l.au.a);
  }
  
  public boolean F()
  {
    return this.b;
  }
  
  public p a(ak paramak1, ak paramak2, List<? extends ar> paramList, List<b.i.b.a.c.b.au> paramList1, b.i.b.a.c.l.w paramw, b.i.b.a.c.b.w paramw1, az paramaz)
  {
    this.c = j.i(paramList);
    this.e = j.i(paramList1);
    this.f = paramw;
    this.h = paramw1;
    this.i = paramaz;
    this.a = paramak1;
    this.g = paramak2;
    int i3 = 0;
    int i1 = 0;
    int i2;
    for (;;)
    {
      i2 = i3;
      if (i1 >= paramList.size()) {
        break label156;
      }
      paramak1 = (ar)paramList.get(i1);
      if (paramak1.g() != i1) {
        break;
      }
      i1 += 1;
    }
    paramak2 = new StringBuilder();
    paramak2.append(paramak1);
    paramak2.append(" index is ");
    paramak2.append(paramak1.g());
    paramak2.append(" but position is ");
    paramak2.append(i1);
    throw new IllegalStateException(paramak2.toString());
    label156:
    while (i2 < paramList1.size())
    {
      paramak1 = (b.i.b.a.c.b.au)paramList1.get(i2);
      if (paramak1.c() == i2 + 0)
      {
        i2 += 1;
      }
      else
      {
        paramak2 = new StringBuilder();
        paramak2.append(paramak1);
        paramak2.append("index is ");
        paramak2.append(paramak1.c());
        paramak2.append(" but position is ");
        paramak2.append(i2);
        throw new IllegalStateException(paramak2.toString());
      }
    }
    return this;
  }
  
  protected abstract p a(l paraml, t paramt, b.a parama, f paramf, g paramg, am paramam);
  
  protected t a(a parama)
  {
    Object localObject3 = new boolean[1];
    if (parama.r != null) {}
    for (Object localObject1 = i.a(r(), parama.r);; localObject1 = r()) {
      break;
    }
    Object localObject4 = parama.b;
    final Object localObject5 = parama.e;
    Object localObject6 = parama.f;
    Object localObject7 = parama.k;
    boolean bool1 = parama.n;
    Object localObject2 = parama.e;
    if (bool1)
    {
      if (localObject2 == null) {
        localObject2 = w();
      }
      localObject2 = ((t)localObject2).s();
    }
    else
    {
      localObject2 = am.b;
    }
    localObject4 = a((l)localObject4, (t)localObject5, (b.a)localObject6, (f)localObject7, (g)localObject1, (am)localObject2);
    if (parama.q == null) {
      localObject1 = this.c;
    } else {
      localObject1 = parama.q;
    }
    localObject3[0] |= ((List)localObject1).isEmpty() ^ true;
    localObject6 = new ArrayList(((List)localObject1).size());
    localObject5 = b.i.b.a.c.l.k.a((List)localObject1, parama.a, (l)localObject4, (List)localObject6, (boolean[])localObject3);
    if (localObject5 == null) {
      return null;
    }
    int i1;
    if (parama.h != null)
    {
      localObject2 = ((b.i.b.a.c.l.au)localObject5).b(parama.h.y(), ba.b);
      if (localObject2 == null) {
        return null;
      }
      localObject1 = new ac((l)localObject4, new b.i.b.a.c.i.e.a.b((b.i.b.a.c.b.a)localObject4, (b.i.b.a.c.l.w)localObject2, parama.h.b()), parama.h.r());
      i2 = localObject3[0];
      if (localObject2 != parama.h.y()) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      localObject3[0] = (i1 | i2);
    }
    else
    {
      localObject1 = null;
    }
    if (parama.i != null)
    {
      localObject2 = parama.i.a((b.i.b.a.c.l.au)localObject5);
      if (localObject2 == null) {
        return null;
      }
      i2 = localObject3[0];
      if (localObject2 != parama.i) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      localObject3[0] = (i2 | i1);
    }
    else
    {
      localObject2 = null;
    }
    localObject7 = a((t)localObject4, parama.g, (b.i.b.a.c.l.au)localObject5, parama.o, parama.n, (boolean[])localObject3);
    if (localObject7 == null) {
      return null;
    }
    b.i.b.a.c.l.w localw = ((b.i.b.a.c.l.au)localObject5).b(parama.j, ba.c);
    if (localw == null) {
      return null;
    }
    int i2 = localObject3[0];
    if (localw != parama.j) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    localObject3[0] = (i2 | i1);
    if ((localObject3[0] == 0) && (parama.v)) {
      return this;
    }
    ((p)localObject4).a((ak)localObject1, (ak)localObject2, (List)localObject6, (List)localObject7, localw, parama.c, parama.d);
    ((p)localObject4).j = this.j;
    ((p)localObject4).k = this.k;
    ((p)localObject4).l = this.l;
    ((p)localObject4).m = this.m;
    ((p)localObject4).n = this.n;
    ((p)localObject4).s = this.s;
    ((p)localObject4).o = this.o;
    ((p)localObject4).p = this.p;
    ((p)localObject4).a(this.b);
    ((p)localObject4).q = parama.p;
    ((p)localObject4).r = parama.s;
    boolean bool2;
    if (parama.u != null) {
      bool2 = parama.u.booleanValue();
    } else {
      bool2 = this.v;
    }
    ((p)localObject4).b(bool2);
    if ((!parama.t.isEmpty()) || (this.u != null))
    {
      localObject2 = parama.t;
      if (this.u != null)
      {
        localObject1 = this.u.entrySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (Map.Entry)((Iterator)localObject1).next();
          if (!((Map)localObject2).containsKey(((Map.Entry)localObject3).getKey())) {
            ((Map)localObject2).put(((Map.Entry)localObject3).getKey(), ((Map.Entry)localObject3).getValue());
          }
        }
      }
      localObject1 = localObject2;
      if (((Map)localObject2).size() == 1) {
        localObject1 = Collections.singletonMap(((Map)localObject2).keySet().iterator().next(), ((Map)localObject2).values().iterator().next());
      }
      ((p)localObject4).u = ((Map)localObject1);
    }
    if ((parama.m) || (this.z != null))
    {
      if (this.z != null) {
        localObject1 = this.z;
      } else {
        localObject1 = this;
      }
      ((p)localObject4).z = ((t)localObject1).c((b.i.b.a.c.l.au)localObject5);
    }
    if ((parama.l) && (!w().m().isEmpty()))
    {
      if (parama.a.a())
      {
        parama = this.x;
        if (parama == null)
        {
          ((p)localObject4).a(m());
          return (t)localObject4;
        }
      }
      else
      {
        parama = new b.f.a.a() {};
      }
      ((p)localObject4).x = parama;
    }
    return (t)localObject4;
  }
  
  public <V> V a(a.a<V> parama)
  {
    if (this.u == null) {
      return null;
    }
    return (V)this.u.get(parama);
  }
  
  public <R, D> R a(n<R, D> paramn, D paramD)
  {
    return (R)paramn.a(this, paramD);
  }
  
  public final <V> void a(a.a<V> parama, Object paramObject)
  {
    if (this.u == null) {
      this.u = new LinkedHashMap();
    }
    this.u.put(parama, paramObject);
  }
  
  public void a(Collection<? extends b.i.b.a.c.b.b> paramCollection)
  {
    this.w = paramCollection;
    paramCollection = this.w.iterator();
    while (paramCollection.hasNext()) {
      if (((t)paramCollection.next()).B()) {
        this.r = true;
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public t b(l paraml, b.i.b.a.c.b.w paramw, az paramaz, b.a parama, boolean paramBoolean)
  {
    return D().a(paraml).a(paramw).a(paramaz).a(parama).a(paramBoolean).f();
  }
  
  public void b(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }
  
  public boolean b()
  {
    return this.m;
  }
  
  public t c(b.i.b.a.c.l.au paramau)
  {
    if (paramau.b.a()) {
      return this;
    }
    return e(paramau).a(w()).g().f();
  }
  
  public boolean c()
  {
    return this.n;
  }
  
  public final ak d()
  {
    return this.a;
  }
  
  public final b.i.b.a.c.b.w d_()
  {
    return this.h;
  }
  
  public final ak e()
  {
    return this.g;
  }
  
  protected final a e(b.i.b.a.c.l.au paramau)
  {
    return new a(paramau.b, a(), this.h, this.i, this.t, this.e, this.a, g());
  }
  
  public final List<ar> f()
  {
    return this.c;
  }
  
  public b.i.b.a.c.l.w g()
  {
    return this.f;
  }
  
  public final az j()
  {
    return this.i;
  }
  
  public final List<b.i.b.a.c.b.au> k()
  {
    return this.e;
  }
  
  public boolean l()
  {
    return this.v;
  }
  
  public Collection<? extends t> m()
  {
    b.f.a.a locala = this.x;
    if (locala != null)
    {
      this.w = ((Collection)locala.b_());
      this.x = null;
    }
    if (this.w != null) {
      return this.w;
    }
    return Collections.emptyList();
  }
  
  public final boolean o()
  {
    return this.o;
  }
  
  public final boolean p()
  {
    return this.p;
  }
  
  public boolean q()
  {
    return this.l;
  }
  
  public final b.a t()
  {
    return this.t;
  }
  
  public t w()
  {
    if (this.y == this) {
      return this;
    }
    return this.y.w();
  }
  
  public final t x()
  {
    return this.z;
  }
  
  public final boolean y()
  {
    return this.q;
  }
  
  public final boolean z()
  {
    if (this.j) {
      return true;
    }
    Iterator localIterator = w().m().iterator();
    while (localIterator.hasNext()) {
      if (((t)localIterator.next()).z()) {
        return true;
      }
    }
    return false;
  }
  
  public final class a
    implements t.a<t>
  {
    protected as a;
    protected l b;
    protected b.i.b.a.c.b.w c;
    protected az d;
    protected t e = null;
    protected b.a f;
    protected List<b.i.b.a.c.b.au> g;
    protected ak h;
    protected ak i = p.a(p.this);
    protected b.i.b.a.c.l.w j;
    protected f k;
    protected boolean l = true;
    protected boolean m = false;
    protected boolean n = false;
    protected boolean o = false;
    boolean p = p.this.q;
    List<ar> q = null;
    g r = null;
    boolean s = p.this.r;
    Map<a.a<?>, Object> t = new LinkedHashMap();
    public Boolean u = null;
    protected boolean v = false;
    
    public a(l paraml, b.i.b.a.c.b.w paramw, az paramaz, b.a parama, List<b.i.b.a.c.b.au> paramList, ak paramak, b.i.b.a.c.l.w paramw1, f paramf)
    {
      this.a = paraml;
      this.b = paramw;
      this.c = paramaz;
      this.d = parama;
      this.f = paramList;
      this.g = paramak;
      this.h = paramw1;
      this.j = paramf;
      this.k = null;
    }
    
    public final a a(b.i.b.a.c.b.b paramb)
    {
      this.e = ((t)paramb);
      return this;
    }
    
    public final a b(List<b.i.b.a.c.b.au> paramList)
    {
      this.g = paramList;
      return this;
    }
    
    public final t f()
    {
      return p.this.a(this);
    }
    
    public final a g()
    {
      this.v = true;
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */