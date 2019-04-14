package b.i.b.a.c.b.c;

import b.a.v;
import b.f.a.b;
import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.aq;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.n;
import b.i.b.a.c.b.o;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.c;
import b.i.b.a.c.k.i;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.au;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.ba;
import b.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class d
  extends k
  implements aq
{
  protected List<? extends ar> a;
  protected final b.i.b.a.c.b.az b;
  private final b c;
  
  public d(l paraml, b.i.b.a.c.b.a.g paramg, f paramf, am paramam, b.i.b.a.c.b.az paramaz)
  {
    super(paraml, paramg, paramf, paramam);
    this.b = paramaz;
    this.c = new b(this);
  }
  
  private aq v()
  {
    o localo = super.n();
    if (localo != null) {
      return (aq)localo;
    }
    throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
  }
  
  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    b.f.b.j.b(paramn, "visitor");
    return (R)paramn.a((aq)this, paramD);
  }
  
  public final an c()
  {
    return (an)this.c;
  }
  
  public final b.i.b.a.c.b.w d_()
  {
    return b.i.b.a.c.b.w.a;
  }
  
  public final b.i.b.a.c.b.az j()
  {
    return this.b;
  }
  
  protected abstract i k();
  
  public final boolean l()
  {
    return av.a((b.i.b.a.c.l.w)b(), (b)new a(this));
  }
  
  public final Collection<af> m()
  {
    Object localObject1 = g();
    if (localObject1 == null) {
      return (Collection)v.a;
    }
    localObject1 = ((e)localObject1).f();
    b.f.b.j.a(localObject1, "classDescriptor.constructors");
    localObject1 = (Iterable)localObject1;
    Collection localCollection = (Collection)new ArrayList();
    Iterator localIterator = ((Iterable)localObject1).iterator();
    while (localIterator.hasNext())
    {
      Object localObject5 = (b.i.b.a.c.b.d)localIterator.next();
      localObject1 = ag.w;
      Object localObject3 = k();
      aq localaq = (aq)this;
      b.f.b.j.a(localObject5, "it");
      b.f.b.j.b(localObject3, "storageManager");
      b.f.b.j.b(localaq, "typeAliasDescriptor");
      b.f.b.j.b(localObject5, "constructor");
      Object localObject2 = ag.a.a(localaq);
      ad localad = null;
      localObject1 = null;
      if (localObject2 == null)
      {
        localObject1 = localad;
      }
      else
      {
        Object localObject6 = ((b.i.b.a.c.b.d)localObject5).a((au)localObject2);
        if (localObject6 == null)
        {
          localObject1 = localad;
        }
        else
        {
          Object localObject4 = ((b.i.b.a.c.b.d)localObject5).r();
          b.a locala = ((b.i.b.a.c.b.d)localObject5).t();
          b.f.b.j.a(locala, "constructor.kind");
          am localam = localaq.s();
          b.f.b.j.a(localam, "typeAliasDescriptor.source");
          localObject3 = new ag((i)localObject3, localaq, (b.i.b.a.c.b.d)localObject6, null, (b.i.b.a.c.b.a.g)localObject4, locala, localam, (byte)0);
          localObject4 = p.a((b.i.b.a.c.b.t)localObject3, ((b.i.b.a.c.b.d)localObject5).k(), (au)localObject2, false, false, null);
          if (localObject4 == null)
          {
            localObject1 = localad;
          }
          else
          {
            b.f.b.j.a(localObject4, "FunctionDescriptorImpl.g…         ) ?: return null");
            localad = b.i.b.a.c.l.t.c((b.i.b.a.c.l.w)((b.i.b.a.c.b.d)localObject6).g().i());
            localObject6 = localaq.h();
            b.f.b.j.a(localObject6, "typeAliasDescriptor.defaultType");
            localad = b.i.b.a.c.l.ag.a(localad, (ad)localObject6);
            localObject5 = ((b.i.b.a.c.b.d)localObject5).e();
            if (localObject5 != null)
            {
              localObject1 = (b.i.b.a.c.b.a)localObject3;
              b.f.b.j.a(localObject5, "it");
              localObject2 = ((au)localObject2).a(((ak)localObject5).y(), ba.a);
              localObject5 = b.i.b.a.c.b.a.g.a;
              localObject1 = c.a((b.i.b.a.c.b.a)localObject1, (b.i.b.a.c.l.w)localObject2, g.a.a());
            }
            ((ag)localObject3).a((ak)localObject1, null, localaq.u(), (List)localObject4, (b.i.b.a.c.l.w)localad, b.i.b.a.c.b.w.a, localaq.j());
            localObject1 = (af)localObject3;
          }
        }
      }
      if (localObject1 != null) {
        localCollection.add(localObject1);
      }
    }
    return (Collection)localCollection;
  }
  
  public final boolean o()
  {
    return false;
  }
  
  public final boolean p()
  {
    return false;
  }
  
  public final boolean q()
  {
    return false;
  }
  
  protected abstract List<ar> t();
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("typealias ");
    localStringBuilder.append(this.d.a);
    return localStringBuilder.toString();
  }
  
  public final List<ar> u()
  {
    List localList = this.a;
    if (localList == null) {
      b.f.b.j.a("declaredTypeParametersImpl");
    }
    return localList;
  }
  
  static final class a
    extends b.f.b.k
    implements b<b.i.b.a.c.l.az, Boolean>
  {
    a(d paramd)
    {
      super();
    }
  }
  
  public static final class b
    implements an
  {
    public final List<ar> b()
    {
      return this.a.t();
    }
    
    public final b.i.b.a.c.a.g d()
    {
      return b.i.b.a.c.i.c.a.d((l)this.a);
    }
    
    public final boolean e()
    {
      return true;
    }
    
    public final Collection<b.i.b.a.c.l.w> i_()
    {
      Collection localCollection = ((aq)this.a).b().f().i_();
      b.f.b.j.a(localCollection, "declarationDescriptor.un…pe.constructor.supertypes");
      return localCollection;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("[typealias ");
      localStringBuilder.append(((aq)this.a).i().a);
      localStringBuilder.append(']');
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */