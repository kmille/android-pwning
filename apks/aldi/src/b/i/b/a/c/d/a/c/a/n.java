package b.i.b.a.c.d.a.c.a;

import b.i.b.a.c.a.g;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.y;
import b.i.b.a.c.d.a.c.b.c;
import b.i.b.a.c.d.a.c.e;
import b.i.b.a.c.d.a.c.h;
import b.i.b.a.c.d.a.e.v;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class n
  extends b.i.b.a.c.b.c.b
{
  private final e c;
  private final h e;
  private final b.i.b.a.c.d.a.e.w f;
  
  public n(h paramh, b.i.b.a.c.d.a.e.w paramw, int paramInt, b.i.b.a.c.b.l paraml)
  {
    super(paramh.c.a, paraml, paramw.p(), ba.a, false, paramInt, am.b, paramh.c.l);
    this.e = paramh;
    this.f = paramw;
    this.c = new e(this.e, (b.i.b.a.c.d.a.e.d)this.f);
  }
  
  public final void a(b.i.b.a.c.l.w paramw)
  {
    b.f.b.j.b(paramw, "type");
  }
  
  public final List<b.i.b.a.c.l.w> m()
  {
    Object localObject1 = this.f.b();
    if (((Collection)localObject1).isEmpty())
    {
      localObject1 = this.e.c.n.b().g();
      b.f.b.j.a(localObject1, "c.module.builtIns.anyType");
      localObject2 = this.e.c.n.b().h();
      b.f.b.j.a(localObject2, "c.module.builtIns.nullableAnyType");
      return b.a.j.a(x.a((ad)localObject1, (ad)localObject2));
    }
    Object localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      b.i.b.a.c.d.a.e.j localj = (b.i.b.a.c.d.a.e.j)((Iterator)localObject2).next();
      ((Collection)localObject1).add(this.e.b.a((v)localj, b.i.b.a.c.d.a.c.b.d.a(b.i.b.a.c.d.a.a.l.b, false, (ar)this, 1)));
    }
    return (List)localObject1;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */