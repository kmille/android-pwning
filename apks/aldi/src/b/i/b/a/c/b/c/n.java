package b.i.b.a.c.b.c;

import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.l;
import b.i.b.a.c.i.e.h.b;
import b.i.b.a.c.i.j;
import b.i.b.a.c.k.c;
import b.i.b.a.c.l.an;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class n
  extends g
{
  final an a;
  private final b.i.b.a.c.i.e.h c;
  private final b.i.b.a.c.k.f<Set<b.i.b.a.c.f.f>> g;
  private final b.i.b.a.c.b.a.g h;
  
  private n(b.i.b.a.c.k.i parami, b.i.b.a.c.b.e parame, b.i.b.a.c.l.w paramw, b.i.b.a.c.f.f paramf, b.i.b.a.c.k.f<Set<b.i.b.a.c.f.f>> paramf1, b.i.b.a.c.b.a.g paramg, am paramam)
  {
    super(parami, parame, paramf, paramam);
    if ((!b) && (parame.g() != b.i.b.a.c.b.f.c)) {
      throw new AssertionError();
    }
    this.h = paramg;
    this.a = new b.i.b.a.c.l.e(this, Collections.emptyList(), Collections.singleton(paramw), parami);
    this.c = new a(parami);
    this.g = paramf1;
  }
  
  public static n a(b.i.b.a.c.k.i parami, b.i.b.a.c.b.e parame, b.i.b.a.c.f.f paramf, b.i.b.a.c.k.f<Set<b.i.b.a.c.f.f>> paramf1, b.i.b.a.c.b.a.g paramg, am paramam)
  {
    return new n(parami, parame, parame.h(), paramf, paramf1, paramg, paramam);
  }
  
  public final b.i.b.a.c.i.e.h b()
  {
    return h.b.a;
  }
  
  public final an c()
  {
    return this.a;
  }
  
  public final b.i.b.a.c.i.e.h d()
  {
    return this.c;
  }
  
  public final b.i.b.a.c.b.w d_()
  {
    return b.i.b.a.c.b.w.a;
  }
  
  public final b.i.b.a.c.b.e e()
  {
    return null;
  }
  
  public final b.i.b.a.c.b.d e_()
  {
    return null;
  }
  
  public final Collection<b.i.b.a.c.b.d> f()
  {
    return Collections.emptyList();
  }
  
  public final b.i.b.a.c.b.f g()
  {
    return b.i.b.a.c.b.f.d;
  }
  
  public final az j()
  {
    return ay.e;
  }
  
  public final boolean k()
  {
    return false;
  }
  
  public final boolean l()
  {
    return false;
  }
  
  public final boolean m()
  {
    return false;
  }
  
  public final boolean n()
  {
    return false;
  }
  
  public final boolean o()
  {
    return false;
  }
  
  public final boolean p()
  {
    return false;
  }
  
  public final b.i.b.a.c.b.a.g r()
  {
    return this.h;
  }
  
  public final Collection<b.i.b.a.c.b.e> t()
  {
    return Collections.emptyList();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("enum entry ");
    localStringBuilder.append(this.d);
    return localStringBuilder.toString();
  }
  
  public final List<ar> u()
  {
    return Collections.emptyList();
  }
  
  final class a
    extends b.i.b.a.c.i.e.i
  {
    private final c<b.i.b.a.c.f.f, Collection<al>> c;
    private final c<b.i.b.a.c.f.f, Collection<ah>> d;
    private final b.i.b.a.c.k.f<Collection<l>> e;
    
    public a(b.i.b.a.c.k.i parami)
    {
      this.c = parami.a(new b.f.a.b() {});
      this.d = parami.a(new b.f.a.b() {});
      this.e = parami.a(new b.f.a.a() {});
    }
    
    private <D extends b.i.b.a.c.b.b> Collection<D> a(Collection<D> paramCollection)
    {
      final LinkedHashSet localLinkedHashSet = new LinkedHashSet();
      j.a(paramCollection, Collections.emptySet(), n.this, new b.i.b.a.c.i.h()
      {
        public final void a(b.i.b.a.c.b.b paramAnonymousb)
        {
          j.a(paramAnonymousb, null);
          localLinkedHashSet.add(paramAnonymousb);
        }
        
        public final void a(b.i.b.a.c.b.b paramAnonymousb1, b.i.b.a.c.b.b paramAnonymousb2) {}
      });
      return localLinkedHashSet;
    }
    
    private b.i.b.a.c.i.e.h c()
    {
      Collection localCollection = n.this.a.i_();
      if ((!a) && (localCollection.size() != 1)) {
        throw new AssertionError("Enum entry and its companion object both should have exactly one supertype: ".concat(String.valueOf(localCollection)));
      }
      return ((b.i.b.a.c.l.w)localCollection.iterator().next()).b();
    }
    
    public final Collection a(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
    {
      return (Collection)this.d.a(paramf);
    }
    
    public final Collection<l> a(b.i.b.a.c.i.e.d paramd, b.f.a.b<? super b.i.b.a.c.f.f, Boolean> paramb)
    {
      return (Collection)this.e.b_();
    }
    
    public final Collection b(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
    {
      return (Collection)this.c.a(paramf);
    }
    
    public final Set<b.i.b.a.c.f.f> j_()
    {
      return (Set)n.a(n.this).b_();
    }
    
    public final Set<b.i.b.a.c.f.f> l_()
    {
      return (Set)n.a(n.this).b_();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */