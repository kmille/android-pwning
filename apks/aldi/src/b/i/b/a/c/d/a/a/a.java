package b.i.b.a.c.d.a.a;

import b.i.b.a.c.b.au;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.d;
import b.i.b.a.c.b.e;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.h;
import b.i.b.a.c.i.j;
import b.i.b.a.c.j.a.m;
import b.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class a
{
  public static au a(f paramf, e parame)
  {
    parame = parame.f();
    if (parame.size() != 1) {
      return null;
    }
    parame = ((d)parame.iterator().next()).k().iterator();
    while (parame.hasNext())
    {
      au localau = (au)parame.next();
      if (localau.i().equals(paramf)) {
        return localau;
      }
    }
    return null;
  }
  
  public static <D extends b.i.b.a.c.b.b> Collection<D> a(Collection<D> paramCollection1, Collection<D> paramCollection2, e parame, m paramm)
  {
    return a(paramCollection1, paramCollection2, parame, paramm, false);
  }
  
  private static <D extends b.i.b.a.c.b.b> Collection<D> a(Collection<D> paramCollection1, Collection<D> paramCollection2, e parame, m paramm, final boolean paramBoolean)
  {
    final LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    j.a(paramCollection1, paramCollection2, parame, new h()
    {
      public final void a(b.i.b.a.c.b.b paramAnonymousb)
      {
        j.a(paramAnonymousb, new b.f.a.b() {});
        localLinkedHashSet.add(paramAnonymousb);
      }
      
      public final void a(b.i.b.a.c.b.b paramAnonymousb1, b.i.b.a.c.b.b paramAnonymousb2) {}
      
      public final void a(b.i.b.a.c.b.b paramAnonymousb, Collection<? extends b.i.b.a.c.b.b> paramAnonymousCollection)
      {
        if ((paramBoolean) && (paramAnonymousb.t() != b.a.b)) {
          return;
        }
        super.a(paramAnonymousb, paramAnonymousCollection);
      }
    });
    return localLinkedHashSet;
  }
  
  public static <D extends b.i.b.a.c.b.b> Collection<D> b(Collection<D> paramCollection1, Collection<D> paramCollection2, e parame, m paramm)
  {
    return a(paramCollection1, paramCollection2, parame, paramm, true);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */