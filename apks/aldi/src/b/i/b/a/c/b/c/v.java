package b.i.b.a.c.b.c;

import b.a.x;
import b.d;
import b.f.a.a;
import b.f.b.k;
import b.i.b.a.c.a.g;
import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.ad;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.n;
import b.i.b.a.c.b.y;
import b.i.b.a.c.f.f;
import b.i.b.a.c.k.c;
import b.w;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class v
  extends j
  implements y
{
  private final Map<Object<? extends Object>, Object> b;
  private t c;
  private b.i.b.a.c.b.ac e;
  private boolean f;
  private final c<b.i.b.a.c.f.b, ad> g;
  private final d h;
  private final b.i.b.a.c.k.i i;
  private final g j;
  private final f k;
  
  public v(f paramf, b.i.b.a.c.k.i parami, g paramg)
  {
    this(paramf, parami, paramg, null, 48);
  }
  
  private v(f paramf, b.i.b.a.c.k.i parami, g paramg, Map<Object<?>, ? extends Object> paramMap)
  {
    super(g.a.a(), paramf);
    this.i = parami;
    this.j = paramg;
    this.k = null;
    if (paramf.b)
    {
      paramf = b.a.ac.a();
      b.f.b.j.b(paramMap, "receiver$0");
      b.f.b.j.b(paramf, "map");
      parami = new LinkedHashMap(paramMap);
      parami.putAll(paramf);
      this.b = ((Map)parami);
      this.f = true;
      this.g = this.i.a((b.f.a.b)new b(this));
      this.h = b.e.a((a)new a(this));
      return;
    }
    throw ((Throwable)new IllegalArgumentException("Module name must be special: ".concat(String.valueOf(paramf))));
  }
  
  private void a(t paramt)
  {
    b.f.b.j.b(paramt, "dependencies");
    int m;
    if (this.c == null) {
      m = 1;
    } else {
      m = 0;
    }
    if ((w.a) && (m == 0))
    {
      paramt = new StringBuilder("Dependencies of ");
      paramt.append(h());
      paramt.append(" were already set");
      throw ((Throwable)new AssertionError(paramt.toString()));
    }
    this.c = paramt;
  }
  
  private void a(List<v> paramList)
  {
    b.f.b.j.b(paramList, "descriptors");
    a(paramList, (Set)x.a);
  }
  
  private void a(List<v> paramList, Set<v> paramSet)
  {
    b.f.b.j.b(paramList, "descriptors");
    b.f.b.j.b(paramSet, "friends");
    a((t)new u(paramList, paramSet, (List)b.a.v.a));
  }
  
  private void d()
  {
    if (this.f) {
      return;
    }
    throw ((Throwable)new b.i.b.a.c.b.u("Accessing invalid module descriptor ".concat(String.valueOf(this))));
  }
  
  private final i f()
  {
    return (i)this.h.a();
  }
  
  private final boolean g()
  {
    return this.e != null;
  }
  
  private final String h()
  {
    String str = this.d.toString();
    b.f.b.j.a(str, "name.toString()");
    return str;
  }
  
  public final ad a(b.i.b.a.c.f.b paramb)
  {
    b.f.b.j.b(paramb, "fqName");
    d();
    return (ad)this.g.a(paramb);
  }
  
  public final l a()
  {
    return null;
  }
  
  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    b.f.b.j.b(paramn, "visitor");
    b.f.b.j.b(paramn, "visitor");
    return (R)paramn.a(this, paramD);
  }
  
  public final Collection<b.i.b.a.c.f.b> a(b.i.b.a.c.f.b paramb, b.f.a.b<? super f, Boolean> paramb1)
  {
    b.f.b.j.b(paramb, "fqName");
    b.f.b.j.b(paramb1, "nameFilter");
    d();
    return c().a(paramb, paramb1);
  }
  
  public final void a(b.i.b.a.c.b.ac paramac)
  {
    b.f.b.j.b(paramac, "providerForModuleContent");
    boolean bool = g();
    if ((w.a) && (!(bool ^ true)))
    {
      paramac = new StringBuilder("Attempt to initialize module ");
      paramac.append(h());
      paramac.append(" twice");
      throw ((Throwable)new AssertionError(paramac.toString()));
    }
    this.e = paramac;
  }
  
  public final void a(v... paramVarArgs)
  {
    b.f.b.j.b(paramVarArgs, "descriptors");
    a(b.a.e.g(paramVarArgs));
  }
  
  public final boolean a(y paramy)
  {
    b.f.b.j.b(paramy, "targetModule");
    if (!b.f.b.j.a((v)this, paramy))
    {
      t localt = this.c;
      if (localt == null) {
        b.f.b.j.a();
      }
      if (!b.a.j.a((Iterable)localt.b(), paramy))
      {
        localt = this.c;
        if (localt != null)
        {
          if (!localt.c().contains(paramy)) {
            return false;
          }
        }
        else
        {
          paramy = new StringBuilder("Dependencies of module ");
          paramy.append(h());
          paramy.append(" were not set");
          throw ((Throwable)new AssertionError(paramy.toString()));
        }
      }
    }
    return true;
  }
  
  public final g b()
  {
    return this.j;
  }
  
  public final b.i.b.a.c.b.ac c()
  {
    d();
    return (b.i.b.a.c.b.ac)f();
  }
  
  static final class a
    extends k
    implements a<i>
  {
    a(v paramv)
    {
      super();
    }
  }
  
  static final class b
    extends k
    implements b.f.a.b<b.i.b.a.c.f.b, r>
  {
    b(v paramv)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */