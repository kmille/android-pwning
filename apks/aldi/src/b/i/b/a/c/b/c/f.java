package b.i.b.a.c.b.c;

import b.i.b.a.c.b.a.g;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.d;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.k;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.n;
import b.i.b.a.c.b.t;
import b.i.b.a.c.b.w;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class f
  extends p
  implements d
{
  private static final b.i.b.a.c.f.f v = b.i.b.a.c.f.f.c("<init>");
  protected final boolean a;
  
  protected f(e parame, k paramk, g paramg, boolean paramBoolean, b.a parama, am paramam)
  {
    super(parame, paramk, paramg, v, parama, paramam);
    this.a = paramBoolean;
  }
  
  public static f a(e parame, g paramg, am paramam)
  {
    return new f(parame, null, paramg, true, b.a.a, paramam);
  }
  
  public final e E()
  {
    return (e)super.a();
  }
  
  public final f a(List<b.i.b.a.c.b.au> paramList, az paramaz)
  {
    a(paramList, paramaz, ((e)super.a()).u());
    return this;
  }
  
  public final f a(List<b.i.b.a.c.b.au> paramList, az paramaz, List<ar> paramList1)
  {
    Object localObject = (e)super.a();
    if (((e)localObject).l())
    {
      localObject = ((e)localObject).a();
      if ((localObject instanceof e))
      {
        localObject = ((e)localObject).w();
        break label54;
      }
    }
    localObject = null;
    label54:
    super.a(null, (ak)localObject, paramList1, paramList, null, w.a, paramaz);
    return this;
  }
  
  public final d a(l paraml, w paramw, az paramaz, b.a parama, boolean paramBoolean)
  {
    return (d)super.b(paraml, paramw, paramaz, parama, paramBoolean);
  }
  
  public final d a(b.i.b.a.c.l.au paramau)
  {
    return (d)super.c(paramau);
  }
  
  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    return (R)paramn.a(this, paramD);
  }
  
  public final void a(Collection<? extends b> paramCollection)
  {
    if (!b)
    {
      if (paramCollection.isEmpty()) {
        return;
      }
      throw new AssertionError("Constructors cannot override anything");
    }
  }
  
  protected f b(l paraml, t paramt, b.a parama, b.i.b.a.c.f.f paramf, g paramg, am paramam)
  {
    if ((parama != b.a.a) && (parama != b.a.d))
    {
      paramt = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
      paramt.append(this);
      paramt.append("\nnewOwner: ");
      paramt.append(paraml);
      paramt.append("\nkind: ");
      paramt.append(parama);
      throw new IllegalStateException(paramt.toString());
    }
    if ((!b) && (paramf != null)) {
      throw new AssertionError("Attempt to rename constructor: ".concat(String.valueOf(this)));
    }
    return new f((e)paraml, this, paramg, this.a, b.a.a, paramam);
  }
  
  public final Collection<? extends t> m()
  {
    return Collections.emptySet();
  }
  
  public final d u()
  {
    return (d)super.w();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */