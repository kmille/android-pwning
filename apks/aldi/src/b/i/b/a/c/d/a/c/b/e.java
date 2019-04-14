package b.i.b.a.c.d.a.c.b;

import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.as;
import b.i.b.a.c.l.az;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.p;
import b.i.b.a.c.l.t;
import b.i.b.a.c.l.w;
import b.i.b.a.c.l.x;
import b.i.b.a.c.l.y;
import b.k;
import b.m;
import b.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class e
  extends as
{
  public static final e a = new e();
  private static final a b = d.a(b.i.b.a.c.d.a.a.l.b, false, null, 3).a(b.c);
  private static final a c = d.a(b.i.b.a.c.d.a.a.l.b, false, null, 3).a(b.b);
  
  public static ap a(b.i.b.a.c.b.ar paramar, a parama, w paramw)
  {
    b.f.b.j.b(paramar, "parameter");
    b.f.b.j.b(parama, "attr");
    b.f.b.j.b(paramw, "erasedUpperBound");
    Object localObject = parama.b;
    switch (f.a[localObject.ordinal()])
    {
    default: 
      throw new k();
    case 2: 
    case 3: 
      if (!paramar.k().e) {
        return (ap)new b.i.b.a.c.l.ar(ba.a, (w)b.i.b.a.c.i.c.a.d((b.i.b.a.c.b.l)paramar).f());
      }
      localObject = paramw.f().b();
      b.f.b.j.a(localObject, "erasedUpperBound.constructor.parameters");
      if (!(((Collection)localObject).isEmpty() ^ true)) {
        break;
      }
    }
    for (paramar = new b.i.b.a.c.l.ar(ba.c, paramw);; paramar = new b.i.b.a.c.l.ar(ba.a, paramw))
    {
      return (ap)paramar;
      return d.a(paramar, parama);
    }
  }
  
  private final m<ad, Boolean> a(ad paramad, b.i.b.a.c.b.e parame, a parama)
  {
    if (paramad.f().b().isEmpty()) {}
    for (parame = Boolean.FALSE;; parame = Boolean.TRUE)
    {
      return q.a(paramad, parame);
      Object localObject1 = (w)paramad;
      if (b.i.b.a.c.a.g.c((w)localObject1))
      {
        parama = (ap)paramad.a().get(0);
        parame = parama.b();
        parama = parama.c();
        b.f.b.j.a(parama, "componentTypeProjection.type");
        parame = b.a.j.a(new b.i.b.a.c.l.ar(parame, b(parama)));
        paramad = x.a(paramad.r(), paramad.f(), parame, paramad.c());
        break;
      }
      if (y.b((w)localObject1))
      {
        parame = new StringBuilder("Raw error type: ");
        parame.append(paramad.f());
        paramad = p.c(parame.toString());
        break;
      }
      localObject1 = paramad.r();
      an localan = paramad.f();
      Object localObject2 = paramad.f().b();
      b.f.b.j.a(localObject2, "type.constructor.parameters");
      Object localObject3 = (Iterable)localObject2;
      localObject2 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject3));
      localObject3 = ((Iterable)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        b.i.b.a.c.b.ar localar = (b.i.b.a.c.b.ar)((Iterator)localObject3).next();
        b.f.b.j.a(localar, "parameter");
        ((Collection)localObject2).add(a(localar, parama));
      }
      parama = (List)localObject2;
      boolean bool = paramad.c();
      paramad = parame.a((as)a);
      b.f.b.j.a(paramad, "declaration.getMemberScope(RawSubstitution)");
      paramad = x.a((b.i.b.a.c.b.a.g)localObject1, localan, parama, bool, paramad);
    }
  }
  
  private final w b(w paramw)
  {
    Object localObject;
    for (;;)
    {
      localObject = paramw.f().c();
      if (!(localObject instanceof b.i.b.a.c.b.ar)) {
        break;
      }
      paramw = d.a((b.i.b.a.c.b.ar)localObject);
    }
    if ((localObject instanceof b.i.b.a.c.b.e))
    {
      ad localad = t.c(paramw);
      localObject = (b.i.b.a.c.b.e)localObject;
      m localm = a(localad, (b.i.b.a.c.b.e)localObject, b);
      localad = (ad)localm.a;
      boolean bool1 = ((Boolean)localm.b).booleanValue();
      paramw = a(t.d(paramw), (b.i.b.a.c.b.e)localObject, c);
      localObject = (ad)paramw.a;
      boolean bool2 = ((Boolean)paramw.b).booleanValue();
      if ((!bool1) && (!bool2)) {
        paramw = x.a(localad, (ad)localObject);
      } else {
        paramw = (az)new g(localad, (ad)localObject);
      }
      return (w)paramw;
    }
    throw ((Throwable)new IllegalStateException("Unexpected declaration kind: ".concat(String.valueOf(localObject)).toString()));
  }
  
  public final boolean a()
  {
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */