package b.i.b.a.c.a;

import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.c.ah;
import b.i.b.a.c.b.c.m;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.y;
import b.i.b.a.c.f.c;
import b.i.b.a.c.i.d;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.c.a;
import b.i.b.a.c.l.p;
import b.i.b.a.c.l.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class k
{
  private static final b.i.b.a.c.b.c.w a;
  private static final b.i.b.a.c.b.c.w b;
  
  static
  {
    Object localObject1 = p.a();
    b.f.b.j.a(localObject1, "ErrorUtils.getErrorModule()");
    Object localObject2 = d.d;
    b.f.b.j.a(localObject2, "DescriptorUtils.COROUTIN…KAGE_FQ_NAME_EXPERIMENTAL");
    localObject1 = new b.i.b.a.c.b.c.w((l)new m((y)localObject1, (b.i.b.a.c.f.b)localObject2), b.i.b.a.c.b.f.b, d.f.b.d(), am.b, b.i.b.a.c.k.b.a);
    ((b.i.b.a.c.b.c.w)localObject1).a(b.i.b.a.c.b.w.d);
    ((b.i.b.a.c.b.c.w)localObject1).a = ay.e;
    localObject2 = (l)localObject1;
    g.a locala = b.i.b.a.c.b.a.g.a;
    ((b.i.b.a.c.b.c.w)localObject1).a(b.a.j.a(ah.a((l)localObject2, g.a.a(), ba.b, b.i.b.a.c.f.f.a("T"), 0)));
    ((b.i.b.a.c.b.c.w)localObject1).y();
    a = (b.i.b.a.c.b.c.w)localObject1;
    localObject1 = p.a();
    b.f.b.j.a(localObject1, "ErrorUtils.getErrorModule()");
    localObject2 = d.c;
    b.f.b.j.a(localObject2, "DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE");
    localObject1 = new b.i.b.a.c.b.c.w((l)new m((y)localObject1, (b.i.b.a.c.f.b)localObject2), b.i.b.a.c.b.f.b, d.g.b.d(), am.b, b.i.b.a.c.k.b.a);
    ((b.i.b.a.c.b.c.w)localObject1).a(b.i.b.a.c.b.w.d);
    ((b.i.b.a.c.b.c.w)localObject1).a = ay.e;
    localObject2 = (l)localObject1;
    locala = b.i.b.a.c.b.a.g.a;
    ((b.i.b.a.c.b.c.w)localObject1).a(b.a.j.a(ah.a((l)localObject2, g.a.a(), ba.b, b.i.b.a.c.f.f.a("T"), 0)));
    ((b.i.b.a.c.b.c.w)localObject1).y();
    b = (b.i.b.a.c.b.c.w)localObject1;
  }
  
  public static final b.i.b.a.c.b.c.w a()
  {
    return a;
  }
  
  public static final ad a(b.i.b.a.c.l.w paramw)
  {
    b.f.b.j.b(paramw, "suspendFunType");
    boolean bool = f.b(paramw);
    if ((b.w.a) && (!bool)) {
      throw ((Throwable)new AssertionError("This type should be suspend function type: ".concat(String.valueOf(paramw))));
    }
    g localg = a.a(paramw);
    b.i.b.a.c.b.a.g localg1 = paramw.r();
    b.i.b.a.c.l.w localw = f.d(paramw);
    Object localObject2 = (Iterable)f.f(paramw);
    Object localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((Collection)localObject1).add(((ap)((Iterator)localObject2).next()).c());
    }
    localObject1 = (Collection)localObject1;
    localObject2 = b.i.b.a.c.b.a.g.a;
    localObject2 = g.a.a();
    an localan = a.c();
    b.f.b.j.a(localan, "if (isReleaseCoroutines)…ERIMENTAL.typeConstructor");
    localObject1 = b.a.j.a((Collection)localObject1, x.a((b.i.b.a.c.b.a.g)localObject2, localan, b.a.j.a(a.f(f.e(paramw))), false));
    localObject2 = a.a(paramw).h();
    b.f.b.j.a(localObject2, "suspendFunType.builtIns.nullableAnyType");
    return f.a(localg, localg1, localw, (List)localObject1, (b.i.b.a.c.l.w)localObject2).b(paramw.c());
  }
  
  public static final boolean a(b.i.b.a.c.f.b paramb, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (b.i.b.a.c.f.b localb = d.g;; localb = d.f) {
      return b.f.b.j.a(paramb, localb);
    }
  }
  
  public static final b.i.b.a.c.b.c.w b()
  {
    return b;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */