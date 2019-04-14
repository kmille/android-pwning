package b.i.b.a.c.l.c;

import b.i.b.a.c.l.a.c;
import b.i.b.a.c.l.a.e;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.ah;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.at;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.ax;
import b.i.b.a.c.l.az;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.q;
import b.i.b.a.c.l.w;
import b.i.b.a.c.l.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a
{
  public static final b.i.b.a.c.a.g a(w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    paramw = paramw.f().d();
    b.f.b.j.a(paramw, "constructor.builtIns");
    return paramw;
  }
  
  public static final ap a(w paramw, ba paramba, b.i.b.a.c.b.ar paramar)
  {
    b.f.b.j.b(paramw, "type");
    b.f.b.j.b(paramba, "projectionKind");
    if (paramar != null) {
      paramar = paramar.k();
    } else {
      paramar = null;
    }
    ba localba = paramba;
    if (paramar == paramba) {
      localba = ba.a;
    }
    return (ap)new b.i.b.a.c.l.ar(localba, paramw);
  }
  
  public static final w a(w paramw, b.i.b.a.c.b.a.g paramg)
  {
    b.f.b.j.b(paramw, "receiver$0");
    b.f.b.j.b(paramg, "newAnnotations");
    if ((paramw.r().a()) && (paramg.a())) {
      return paramw;
    }
    return (w)paramw.i().a(paramg);
  }
  
  public static final boolean a(az paramaz)
  {
    b.f.b.j.b(paramaz, "receiver$0");
    return ((paramaz.f() instanceof b.i.b.a.c.l.a.k)) || ((paramaz.f().c() instanceof b.i.b.a.c.b.ar)) || ((paramaz instanceof e));
  }
  
  public static final boolean a(w paramw1, w paramw2)
  {
    b.f.b.j.b(paramw1, "receiver$0");
    b.f.b.j.b(paramw2, "superType");
    return c.a.a(paramw1, paramw2);
  }
  
  public static final w b(w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    paramw = av.c(paramw);
    b.f.b.j.a(paramw, "TypeUtils.makeNullable(this)");
    return paramw;
  }
  
  public static final w c(w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    paramw = av.d(paramw);
    b.f.b.j.a(paramw, "TypeUtils.makeNotNullable(this)");
    return paramw;
  }
  
  public static final boolean d(w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    return b.i.b.a.c.a.g.p(paramw);
  }
  
  public static final boolean e(w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    return av.h(paramw);
  }
  
  public static final ap f(w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    return (ap)new b.i.b.a.c.l.ar(paramw);
  }
  
  public static final w g(w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    az localaz = paramw.i();
    Object localObject2;
    Object localObject1;
    if ((localaz instanceof q))
    {
      localObject2 = (q)localaz;
      localObject1 = ((q)localObject2).a;
      paramw = (w)localObject1;
      Object localObject3;
      if (!((ad)localObject1).f().b().isEmpty()) {
        if (((ad)localObject1).f().c() == null)
        {
          paramw = (w)localObject1;
        }
        else
        {
          paramw = ((ad)localObject1).f().b();
          b.f.b.j.a(paramw, "constructor.parameters");
          localObject3 = (Iterable)paramw;
          paramw = (Collection)new ArrayList(b.a.j.a((Iterable)localObject3));
          localObject3 = ((Iterable)localObject3).iterator();
          while (((Iterator)localObject3).hasNext()) {
            paramw.add(new ah((b.i.b.a.c.b.ar)((Iterator)localObject3).next()));
          }
          paramw = at.a((ad)localObject1, (List)paramw);
        }
      }
      localObject2 = ((q)localObject2).b;
      localObject1 = localObject2;
      if (!((ad)localObject2).f().b().isEmpty()) {
        if (((ad)localObject2).f().c() == null)
        {
          localObject1 = localObject2;
        }
        else
        {
          localObject1 = ((ad)localObject2).f().b();
          b.f.b.j.a(localObject1, "constructor.parameters");
          localObject3 = (Iterable)localObject1;
          localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject3));
          localObject3 = ((Iterable)localObject3).iterator();
          while (((Iterator)localObject3).hasNext()) {
            ((Collection)localObject1).add(new ah((b.i.b.a.c.b.ar)((Iterator)localObject3).next()));
          }
          localObject1 = at.a((ad)localObject2, (List)localObject1);
        }
      }
      paramw = x.a(paramw, (ad)localObject1);
    }
    else
    {
      if (!(localaz instanceof ad)) {
        break label452;
      }
      localObject1 = (ad)localaz;
      paramw = (w)localObject1;
      if (!((ad)localObject1).f().b().isEmpty()) {
        if (((ad)localObject1).f().c() == null)
        {
          paramw = (w)localObject1;
        }
        else
        {
          paramw = ((ad)localObject1).f().b();
          b.f.b.j.a(paramw, "constructor.parameters");
          localObject2 = (Iterable)paramw;
          paramw = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
          localObject2 = ((Iterable)localObject2).iterator();
          while (((Iterator)localObject2).hasNext()) {
            paramw.add(new ah((b.i.b.a.c.b.ar)((Iterator)localObject2).next()));
          }
          paramw = at.a((ad)localObject1, (List)paramw);
        }
      }
      paramw = (az)paramw;
    }
    return (w)ax.a(paramw, (w)localaz);
    label452:
    throw new b.k();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */