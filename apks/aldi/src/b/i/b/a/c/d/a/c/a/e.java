package b.i.b.a.c.d.a.c.a;

import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.au;
import b.i.b.a.c.d.a.c.b.d;
import b.i.b.a.c.d.a.e.m;
import b.i.b.a.c.i.b.q;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.ar;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.w;
import b.i.b.a.c.l.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class e
  implements b.i.b.a.c.b.a.c
{
  private final b.i.b.a.c.k.g b;
  private final b.i.b.a.c.k.f c;
  private final b.i.b.a.c.d.a.d.a d;
  private final b.i.b.a.c.k.f e;
  private final b.i.b.a.c.d.a.c.h f;
  private final b.i.b.a.c.d.a.e.a g;
  
  public e(b.i.b.a.c.d.a.c.h paramh, b.i.b.a.c.d.a.e.a parama)
  {
    this.f = paramh;
    this.g = parama;
    this.b = this.f.c.a.b((b.f.a.a)new b(this));
    this.c = this.f.c.a.a((b.f.a.a)new c(this));
    this.d = this.f.c.i.a((b.i.b.a.c.d.a.e.l)this.g);
    this.e = this.f.c.a.a((b.f.a.a)new a(this));
  }
  
  private final b.i.b.a.c.i.b.f<?> a(b.i.b.a.c.d.a.e.b paramb)
  {
    if ((paramb instanceof b.i.b.a.c.d.a.e.o)) {
      return b.i.b.a.c.i.b.g.a.a(((b.i.b.a.c.d.a.e.o)paramb).b());
    }
    boolean bool = paramb instanceof m;
    Object localObject1 = null;
    Object localObject2;
    Object localObject3;
    if (bool)
    {
      paramb = (m)paramb;
      localObject2 = paramb.b();
      localObject3 = paramb.c();
      paramb = (b.i.b.a.c.d.a.e.b)localObject1;
      if (localObject2 != null)
      {
        if (localObject3 == null) {
          return null;
        }
        paramb = (b.i.b.a.c.i.b.f)new b.i.b.a.c.i.b.i((b.i.b.a.c.f.a)localObject2, (b.i.b.a.c.f.f)localObject3);
      }
      return paramb;
    }
    if ((paramb instanceof b.i.b.a.c.d.a.e.e))
    {
      localObject2 = paramb.a();
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = b.i.b.a.c.d.a.p.c;
        b.f.b.j.a(localObject1, "DEFAULT_ANNOTATION_MEMBER_NAME");
      }
      localObject2 = ((b.i.b.a.c.d.a.e.e)paramb).b();
      paramb = e();
      b.f.b.j.a(paramb, "type");
      if (!b.i.b.a.c.l.y.b((w)paramb))
      {
        paramb = b.i.b.a.c.i.c.a.a(this);
        if (paramb == null) {
          b.f.b.j.a();
        }
        paramb = b.i.b.a.c.d.a.a.a.a((b.i.b.a.c.f.f)localObject1, paramb);
        if (paramb != null)
        {
          localObject1 = paramb.y();
          paramb = (b.i.b.a.c.d.a.e.b)localObject1;
          if (localObject1 != null) {}
        }
        else
        {
          paramb = (w)this.f.c.n.b().a(ba.a, (w)b.i.b.a.c.l.p.c("Unknown array element type"));
        }
        b.f.b.j.a(paramb, "DescriptorResolverUtils.…e\")\n                    )");
        localObject1 = (Iterable)localObject2;
        localObject3 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject1));
        Iterator localIterator = ((Iterable)localObject1).iterator();
        while (localIterator.hasNext())
        {
          localObject2 = a((b.i.b.a.c.d.a.e.b)localIterator.next());
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = (b.i.b.a.c.i.b.f)new q();
          }
          ((Collection)localObject3).add(localObject1);
        }
        localObject1 = (List)localObject3;
        localObject2 = b.i.b.a.c.i.b.g.a;
        return (b.i.b.a.c.i.b.f)b.i.b.a.c.i.b.g.a((List)localObject1, paramb);
      }
    }
    else
    {
      if ((paramb instanceof b.i.b.a.c.d.a.e.c)) {
        paramb = ((b.i.b.a.c.d.a.e.c)paramb).b();
      }
      for (paramb = new b.i.b.a.c.i.b.a((b.i.b.a.c.b.a.c)new e(this.f, paramb));; paramb = new b.i.b.a.c.i.b.o((w)x.a(g.a.a(), paramb, (List)localObject1)))
      {
        return (b.i.b.a.c.i.b.f)paramb;
        if (!(paramb instanceof b.i.b.a.c.d.a.e.h)) {
          break;
        }
        paramb = ((b.i.b.a.c.d.a.e.h)paramb).b();
        localObject1 = av.d(this.f.b.a(paramb, d.a(b.i.b.a.c.d.a.a.l.b, false, null, 3)));
        b.f.b.j.a(localObject1, "TypeUtils.makeNotNullabl…toAttributes())\n        )");
        paramb = b.i.b.a.c.i.c.a.a(this.f.c.n, new b.i.b.a.c.f.b("java.lang.Class"), (b.i.b.a.c.c.a.a)b.i.b.a.c.c.a.c.p);
        if (paramb == null) {
          return null;
        }
        localObject1 = b.a.j.a(new ar((w)localObject1));
        localObject2 = b.i.b.a.c.b.a.g.a;
      }
    }
    return null;
  }
  
  private ad e()
  {
    return (ad)b.i.b.a.c.k.h.a(this.c, a[1]);
  }
  
  public final b.i.b.a.c.f.b b()
  {
    b.i.b.a.c.k.g localg = this.b;
    b.i.k localk = a[0];
    b.f.b.j.b(localg, "receiver$0");
    b.f.b.j.b(localk, "p");
    return (b.i.b.a.c.f.b)localg.b_();
  }
  
  public final Map<b.i.b.a.c.f.f, b.i.b.a.c.i.b.f<?>> c()
  {
    return (Map)b.i.b.a.c.k.h.a(this.e, a[2]);
  }
  
  public final String toString()
  {
    return b.i.b.a.c.h.c.a(b.i.b.a.c.h.c.f, (b.i.b.a.c.b.a.c)this);
  }
  
  static final class a
    extends b.f.b.k
    implements b.f.a.a<Map<b.i.b.a.c.f.f, ? extends b.i.b.a.c.i.b.f<?>>>
  {
    a(e parame)
    {
      super();
    }
  }
  
  static final class b
    extends b.f.b.k
    implements b.f.a.a<b.i.b.a.c.f.b>
  {
    b(e parame)
    {
      super();
    }
  }
  
  static final class c
    extends b.f.b.k
    implements b.f.a.a<ad>
  {
    c(e parame)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */