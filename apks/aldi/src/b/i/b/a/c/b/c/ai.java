package b.i.b.a.c.b.c;

import b.i.b.a.c.b.a;
import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.n;
import b.i.b.a.c.f.f;
import b.i.b.a.c.l.w;
import b.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ai
  extends aj
  implements au
{
  public static final a a = new a((byte)0);
  private final au b;
  private final int c;
  private final boolean e;
  private final boolean f;
  private final boolean g;
  private final w h;
  
  public ai(a parama, au paramau, int paramInt, g paramg, f paramf, w paramw1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, w paramw2, am paramam)
  {
    super((l)parama, paramg, paramf, paramw1, paramam);
    this.c = paramInt;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
    this.g = paramBoolean3;
    this.h = paramw2;
    if (paramau == null) {
      paramau = (au)this;
    }
    this.b = paramau;
  }
  
  public final boolean C()
  {
    return false;
  }
  
  public final au a(a parama, f paramf, int paramInt)
  {
    b.f.b.j.b(parama, "newOwner");
    b.f.b.j.b(paramf, "newName");
    g localg = r();
    b.f.b.j.a(localg, "annotations");
    w localw1 = y();
    b.f.b.j.a(localw1, "type");
    boolean bool1 = h();
    boolean bool2 = this.f;
    boolean bool3 = this.g;
    w localw2 = this.h;
    am localam = am.b;
    b.f.b.j.a(localam, "SourceElement.NO_SOURCE");
    return (au)new ai(parama, null, paramInt, localg, paramf, localw1, bool1, bool2, bool3, localw2, localam);
  }
  
  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    b.f.b.j.b(paramn, "visitor");
    return (R)paramn.a((au)this, paramD);
  }
  
  public final a b()
  {
    l locall = super.a();
    if (locall != null) {
      return (a)locall;
    }
    throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
  }
  
  public final int c()
  {
    return this.c;
  }
  
  public final boolean h()
  {
    if (this.e)
    {
      Object localObject = b();
      if (localObject != null)
      {
        localObject = ((b)localObject).t();
        b.f.b.j.a(localObject, "(containingDeclaration a…bleMemberDescriptor).kind");
        if (((b.a)localObject).a()) {
          return true;
        }
      }
      else
      {
        throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
      }
    }
    return false;
  }
  
  public final az j()
  {
    az localaz = ay.f;
    b.f.b.j.a(localaz, "Visibilities.LOCAL");
    return localaz;
  }
  
  public final Collection<au> m()
  {
    Collection localCollection = b().m();
    b.f.b.j.a(localCollection, "containingDeclaration.overriddenDescriptors");
    Object localObject = (Iterable)localCollection;
    localCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      b.f.b.j.a(locala, "it");
      localCollection.add((au)locala.k().get(this.c));
    }
    return (Collection)localCollection;
  }
  
  public final w m_()
  {
    return this.h;
  }
  
  public final au o()
  {
    if (this.b == (ai)this) {
      return (au)this;
    }
    return this.b.o();
  }
  
  public final boolean p()
  {
    return this.f;
  }
  
  public final boolean q()
  {
    return this.g;
  }
  
  public final boolean z()
  {
    return false;
  }
  
  public static final class a {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */