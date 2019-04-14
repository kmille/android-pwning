package b.i.b.a.c.l;

import b.a.v;
import b.f.a.a;
import b.f.a.b;
import b.f.b.k;
import b.i.b.a.c.b.ap;
import b.i.b.a.c.k.f;
import b.i.b.a.c.k.i;
import b.u;
import java.util.Collection;
import java.util.List;

public abstract class c
  implements an
{
  private final f<a> a;
  
  public c(i parami)
  {
    this.a = parami.a((a)new b(this), (b)c.a, (b)new d(this));
  }
  
  protected abstract Collection<w> a();
  
  protected Collection<w> a(boolean paramBoolean)
  {
    return (Collection)v.a;
  }
  
  protected void a(w paramw)
  {
    b.f.b.j.b(paramw, "type");
  }
  
  protected abstract ap f();
  
  protected w g()
  {
    return null;
  }
  
  public final List<w> h()
  {
    return ((a)this.a.b_()).a;
  }
  
  static final class a
  {
    List<? extends w> a;
    final Collection<w> b;
    
    public a(Collection<? extends w> paramCollection)
    {
      this.b = paramCollection;
      this.a = b.a.j.a(p.a);
    }
  }
  
  static final class b
    extends k
    implements a<c.a>
  {
    b(c paramc)
    {
      super();
    }
  }
  
  static final class c
    extends k
    implements b<Boolean, c.a>
  {
    public static final c a = new c();
    
    c()
    {
      super();
    }
  }
  
  static final class d
    extends k
    implements b<c.a, u>
  {
    d(c paramc)
    {
      super();
    }
    
    static final class a
      extends k
      implements b<an, Collection<? extends w>>
    {
      a(c.d paramd)
      {
        super();
      }
    }
    
    static final class b
      extends k
      implements b<w, u>
    {
      b(c.d paramd)
      {
        super();
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */