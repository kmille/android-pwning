package b.i.b.a.c.i;

import b.i.b.a.c.a.g;
import b.i.b.a.c.a.m;
import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.ad;
import b.i.b.a.c.b.ag;
import b.i.b.a.c.b.aj;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.aw;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.o;
import b.i.b.a.c.l.av;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class d
{
  public static final b.i.b.a.c.f.f a;
  public static final b.i.b.a.c.f.f b;
  public static final b.i.b.a.c.f.b c;
  public static final b.i.b.a.c.f.b d;
  public static final b.i.b.a.c.f.b e;
  public static final b.i.b.a.c.f.b f = d.a(b.i.b.a.c.f.f.a("Continuation"));
  public static final b.i.b.a.c.f.b g = c.a(b.i.b.a.c.f.f.a("Continuation"));
  public static final b.i.b.a.c.f.b h = new b.i.b.a.c.f.b("kotlin.Result");
  public static final b.i.b.a.c.f.b i = new b.i.b.a.c.f.b("kotlin.jvm.JvmName");
  
  static
  {
    a = b.i.b.a.c.f.f.a("values");
    b = b.i.b.a.c.f.f.a("valueOf");
    b.i.b.a.c.f.b localb = new b.i.b.a.c.f.b("kotlin.coroutines");
    c = localb;
    localb = localb.a(b.i.b.a.c.f.f.a("experimental"));
    d = localb;
    e = localb.a(b.i.b.a.c.f.f.a("intrinsics"));
  }
  
  public static ak a(l paraml)
  {
    if ((paraml instanceof e)) {
      return ((e)paraml).w();
    }
    return null;
  }
  
  public static <D extends b.i.b.a.c.b.b> D a(D paramD)
  {
    while (paramD.t() == b.a.b)
    {
      Collection localCollection = paramD.m();
      if (!localCollection.isEmpty()) {
        paramD = (b.i.b.a.c.b.b)localCollection.iterator().next();
      } else {
        throw new IllegalStateException("Fake override should have at least one overridden descriptor: ".concat(String.valueOf(paramD)));
      }
    }
    return paramD;
  }
  
  public static e a(e parame)
  {
    parame = parame.c().i_().iterator();
    while (parame.hasNext())
    {
      e locale = a(((b.i.b.a.c.l.w)parame.next()).f());
      if (locale.g() != b.i.b.a.c.b.f.b) {
        return locale;
      }
    }
    return null;
  }
  
  private static e a(b.i.b.a.c.l.an paraman)
  {
    b.i.b.a.c.b.h localh = paraman.c();
    if ((!j) && (!(localh instanceof e))) {
      throw new AssertionError("Classifier descriptor of a type should be of type ClassDescriptor: ".concat(String.valueOf(paraman)));
    }
    return (e)localh;
  }
  
  public static <D extends l> D a(l paraml, Class<D> paramClass)
  {
    return a(paraml, paramClass, true);
  }
  
  public static <D extends l> D a(l paraml, Class<D> paramClass, boolean paramBoolean)
  {
    if (paraml == null) {
      return null;
    }
    l locall = paraml;
    if (paramBoolean) {}
    do
    {
      locall = paraml.a();
      if (locall == null) {
        break;
      }
      paraml = locall;
    } while (!paramClass.isInstance(locall));
    return locall;
    return null;
  }
  
  public static <D extends b.i.b.a.c.b.p> D a(D paramD)
  {
    Object localObject = paramD;
    if ((paramD instanceof b.i.b.a.c.b.b)) {
      localObject = a((b.i.b.a.c.b.b)paramD);
    }
    return (D)localObject;
  }
  
  public static b.i.b.a.c.b.y a(b.i.b.a.c.l.w paramw)
  {
    paramw = paramw.f().c();
    if (paramw == null) {
      return null;
    }
    return q(paramw);
  }
  
  public static <D extends b.i.b.a.c.b.a> Set<D> a(D paramD)
  {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    a(paramD.k_(), localLinkedHashSet);
    return localLinkedHashSet;
  }
  
  private static <D extends b.i.b.a.c.b.a> void a(D paramD, Set<D> paramSet)
  {
    if (paramSet.contains(paramD)) {
      return;
    }
    paramD = paramD.k_().m().iterator();
    while (paramD.hasNext())
    {
      b.i.b.a.c.b.a locala = ((b.i.b.a.c.b.a)paramD.next()).k_();
      a(locala, paramSet);
      paramSet.add(locala);
    }
  }
  
  public static boolean a(aw paramaw, b.i.b.a.c.l.w paramw)
  {
    if (!paramaw.z())
    {
      if (b.i.b.a.c.l.y.b(paramw)) {
        return false;
      }
      if (av.f(paramw)) {
        return true;
      }
      paramaw = b.i.b.a.c.i.c.a.d(paramaw);
      if ((!g.e(paramw)) && (!b.i.b.a.c.l.a.c.a.b(paramaw.j(), paramw)) && (!b.i.b.a.c.l.a.c.a.b(paramaw.a("Number").h(), paramw)) && (!b.i.b.a.c.l.a.c.a.b(paramaw.g(), paramw)))
      {
        paramaw = m.a;
        return m.a(paramw);
      }
      return true;
    }
    return false;
  }
  
  public static boolean a(e parame1, e parame2)
  {
    parame1 = parame1.c().i_().iterator();
    while (parame1.hasNext()) {
      if (b((b.i.b.a.c.l.w)parame1.next(), parame2.x())) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean a(l paraml, b.i.b.a.c.b.f paramf)
  {
    return ((paraml instanceof e)) && (((e)paraml).g() == paramf);
  }
  
  public static boolean a(l paraml1, l paraml2)
  {
    return f(paraml1).equals(f(paraml2));
  }
  
  public static boolean a(b.i.b.a.c.l.w paramw, l paraml)
  {
    if (b(paramw, paraml)) {
      return true;
    }
    paramw = paramw.f().i_().iterator();
    while (paramw.hasNext()) {
      if (a((b.i.b.a.c.l.w)paramw.next(), paraml)) {
        return true;
      }
    }
    return false;
  }
  
  public static az b(e parame)
  {
    b.i.b.a.c.b.f localf = parame.g();
    if ((localf != b.i.b.a.c.b.f.c) && (!localf.a()) && (!h(parame)))
    {
      if (r(parame)) {
        return ay.k;
      }
      if ((!j) && (localf != b.i.b.a.c.b.f.a) && (localf != b.i.b.a.c.b.f.b) && (localf != b.i.b.a.c.b.f.e)) {
        throw new AssertionError();
      }
      return ay.e;
    }
    return ay.a;
  }
  
  public static b.i.b.a.c.b.b b(b.i.b.a.c.b.b paramb)
  {
    Object localObject = paramb;
    if ((paramb instanceof ag)) {
      localObject = ((ag)paramb).v();
    }
    return (b.i.b.a.c.b.b)localObject;
  }
  
  public static e b(b.i.b.a.c.l.w paramw)
  {
    return a(paramw.f());
  }
  
  public static boolean b(e parame1, e parame2)
  {
    return a(parame1.h(), parame2.x());
  }
  
  public static boolean b(l paraml)
  {
    for (;;)
    {
      int m = 0;
      if (paraml == null) {
        break label59;
      }
      if (r(paraml)) {
        break;
      }
      int k = m;
      if ((paraml instanceof b.i.b.a.c.b.p))
      {
        k = m;
        if (((b.i.b.a.c.b.p)paraml).j() == ay.f) {
          k = 1;
        }
      }
      if (k != 0) {
        return true;
      }
      paraml = paraml.a();
    }
    return true;
    label59:
    return false;
  }
  
  private static boolean b(b.i.b.a.c.l.w paramw, l paraml)
  {
    paramw = paramw.f().c();
    if (paramw != null)
    {
      paramw = paramw.g_();
      if (((paramw instanceof b.i.b.a.c.b.h)) && ((paraml instanceof b.i.b.a.c.b.h)) && (((b.i.b.a.c.b.h)paraml).c().equals(((b.i.b.a.c.b.h)paramw).c()))) {
        return true;
      }
    }
    return false;
  }
  
  public static b.i.b.a.c.f.c c(l paraml)
  {
    b.i.b.a.c.f.b localb = o(paraml);
    if (localb != null) {
      return localb.b;
    }
    return p(paraml);
  }
  
  public static b.i.b.a.c.f.b d(l paraml)
  {
    b.i.b.a.c.f.b localb = o(paraml);
    if (localb != null) {
      return localb;
    }
    return p(paraml).b();
  }
  
  public static boolean e(l paraml)
  {
    return (paraml != null) && ((paraml.a() instanceof ab));
  }
  
  public static b.i.b.a.c.b.y f(l paraml)
  {
    b.i.b.a.c.b.y localy = q(paraml);
    if (!j)
    {
      if (localy != null) {
        return localy;
      }
      throw new AssertionError("Descriptor without a containing module: ".concat(String.valueOf(paraml)));
    }
    return localy;
  }
  
  public static boolean g(l paraml)
  {
    return (a(paraml, b.i.b.a.c.b.f.f)) && (((e)paraml).k());
  }
  
  public static boolean h(l paraml)
  {
    return (a(paraml, b.i.b.a.c.b.f.a)) && (((e)paraml).d_() == b.i.b.a.c.b.w.b);
  }
  
  public static boolean i(l paraml)
  {
    return a(paraml, b.i.b.a.c.b.f.d);
  }
  
  public static boolean j(l paraml)
  {
    return a(paraml, b.i.b.a.c.b.f.c);
  }
  
  public static boolean k(l paraml)
  {
    return a(paraml, b.i.b.a.c.b.f.e);
  }
  
  public static boolean l(l paraml)
  {
    return a(paraml, b.i.b.a.c.b.f.b);
  }
  
  public static boolean m(l paraml)
  {
    return (a(paraml, b.i.b.a.c.b.f.a)) || (a(paraml, b.i.b.a.c.b.f.c));
  }
  
  public static b.i.b.a.c.b.an n(l paraml)
  {
    Object localObject = paraml;
    if ((paraml instanceof aj)) {
      localObject = ((aj)paraml).v();
    }
    if ((localObject instanceof o)) {
      return ((o)localObject).s().a();
    }
    return b.i.b.a.c.b.an.a;
  }
  
  private static b.i.b.a.c.f.b o(l paraml)
  {
    if ((!(paraml instanceof b.i.b.a.c.b.y)) && (!b.i.b.a.c.l.p.a(paraml)))
    {
      if ((paraml instanceof ad)) {
        return ((ad)paraml).b();
      }
      if ((paraml instanceof ab)) {
        return ((ab)paraml).c();
      }
      return null;
    }
    return b.i.b.a.c.f.b.a;
  }
  
  private static b.i.b.a.c.f.c p(l paraml)
  {
    l locall = paraml.a();
    if ((!j) && (locall == null)) {
      throw new AssertionError("Not package/module descriptor doesn't have containing declaration: ".concat(String.valueOf(paraml)));
    }
    return c(locall).a(paraml.i());
  }
  
  private static b.i.b.a.c.b.y q(l paraml)
  {
    while (paraml != null)
    {
      if ((paraml instanceof b.i.b.a.c.b.y)) {
        return (b.i.b.a.c.b.y)paraml;
      }
      if ((paraml instanceof ad)) {
        return ((ad)paraml).d();
      }
      paraml = paraml.a();
    }
    return null;
  }
  
  private static boolean r(l paraml)
  {
    return (a(paraml, b.i.b.a.c.b.f.a)) && (paraml.i().equals(b.i.b.a.c.f.h.a));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */