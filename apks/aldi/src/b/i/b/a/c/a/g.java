package b.i.b.a.c.a;

import b.a.ai;
import b.i.b.a.c.a.a.b.b;
import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.b.a.a;
import b.i.b.a.c.b.b.c.b;
import b.i.b.a.c.b.c.v;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.q;
import b.i.b.a.c.b.s;
import b.i.b.a.c.b.y;
import b.i.b.a.c.k.i;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.ar;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.w;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class g
{
  private static final b.i.b.a.c.f.b a;
  public static final b.i.b.a.c.f.f b;
  public static final b.i.b.a.c.f.b c;
  public static final b.i.b.a.c.f.b d = c.a(b.i.b.a.c.f.f.a("collections"));
  public static final b.i.b.a.c.f.b e = c.a(b.i.b.a.c.f.f.a("ranges"));
  public static final b.i.b.a.c.f.b f = c.a(b.i.b.a.c.f.f.a("text"));
  public static final Set<b.i.b.a.c.f.b> g = ai.a(new b.i.b.a.c.f.b[] { c, d, e, a, j.a(), c.a(b.i.b.a.c.f.f.a("internal")), b.i.b.a.c.i.d.c });
  public static final a k = new a();
  public static final b.i.b.a.c.f.f l = b.i.b.a.c.f.f.c("<built-ins module>");
  public v h;
  public final b.i.b.a.c.k.f<b> i;
  protected final i j;
  private final b.i.b.a.c.k.f<c> n;
  private final b.i.b.a.c.k.c<b.i.b.a.c.f.f, e> o;
  
  static
  {
    Object localObject = b.i.b.a.c.f.f.a("kotlin");
    b = (b.i.b.a.c.f.f)localObject;
    localObject = b.i.b.a.c.f.b.c((b.i.b.a.c.f.f)localObject);
    c = (b.i.b.a.c.f.b)localObject;
    a = ((b.i.b.a.c.f.b)localObject).a(b.i.b.a.c.f.f.a("annotation"));
  }
  
  protected g(i parami)
  {
    this.j = parami;
    this.i = parami.a(new b.f.a.a() {});
    this.n = parami.a(new b.f.a.a() {});
    this.o = parami.a(new b.f.a.b() {});
  }
  
  private e a(b.i.b.a.c.f.f paramf)
  {
    return (e)this.o.a(paramf);
  }
  
  public static e a(b.i.b.a.c.f.f paramf, ab paramab)
  {
    Object localObject = paramab.c_().c(paramf, b.i.b.a.c.c.a.c.d);
    if ((!m) && (localObject != null) && (!(localObject instanceof e)))
    {
      paramab = new StringBuilder("Must be a class descriptor ");
      paramab.append(paramf);
      paramab.append(", but was ");
      paramab.append(localObject);
      throw new AssertionError(paramab.toString());
    }
    localObject = (e)localObject;
    if (localObject != null) {
      return (e)localObject;
    }
    localObject = new StringBuilder("Built-in class ");
    ((StringBuilder)localObject).append(paramab.c().a(paramf).b.a);
    ((StringBuilder)localObject).append(" is not found");
    throw new AssertionError(((StringBuilder)localObject).toString());
  }
  
  public static String a(int paramInt)
  {
    return "Function".concat(String.valueOf(paramInt));
  }
  
  public static boolean a(e parame)
  {
    return (a(parame, k.h)) || (d(parame) != null);
  }
  
  private static boolean a(b.i.b.a.c.b.h paramh, b.i.b.a.c.f.c paramc)
  {
    return (paramh.i().equals(paramc.d())) && (paramc.equals(b.i.b.a.c.i.d.c(paramh)));
  }
  
  public static boolean a(l paraml)
  {
    return b.i.b.a.c.i.d.a(paraml, c.class, false) != null;
  }
  
  public static boolean a(b.i.b.a.c.f.c paramc)
  {
    return k.aw.get(paramc) != null;
  }
  
  private static boolean a(w paramw, b.i.b.a.c.f.c paramc)
  {
    paramw = paramw.f().c();
    return ((paramw instanceof e)) && (a(paramw, paramc));
  }
  
  public static b.i.b.a.c.f.a b(int paramInt)
  {
    return new b.i.b.a.c.f.a(c, b.i.b.a.c.f.f.a(a(paramInt)));
  }
  
  public static boolean b(e parame)
  {
    return c(parame) != null;
  }
  
  public static boolean b(l paraml)
  {
    while (paraml != null)
    {
      if ((paraml instanceof ab)) {
        return ((ab)paraml).c().b(b);
      }
      paraml = paraml.a();
    }
    return false;
  }
  
  private static boolean b(w paramw, b.i.b.a.c.f.c paramc)
  {
    return (!paramw.c()) && (a(paramw, paramc));
  }
  
  public static h c(l paraml)
  {
    if (k.at.contains(paraml.i())) {
      return (h)k.av.get(b.i.b.a.c.i.d.c(paraml));
    }
    return null;
  }
  
  public static b.i.b.a.c.f.b c(h paramh)
  {
    return c.a(paramh.j);
  }
  
  public static boolean c(e parame)
  {
    return (a(parame, k.a)) || (a(parame, k.b));
  }
  
  public static boolean c(w paramw)
  {
    return a(paramw, k.h);
  }
  
  private static boolean c(w paramw, b.i.b.a.c.f.c paramc)
  {
    return (a(paramw, paramc)) && (!paramw.c());
  }
  
  public static h d(l paraml)
  {
    if (k.au.contains(paraml.i())) {
      return (h)k.aw.get(b.i.b.a.c.i.d.c(paraml));
    }
    return null;
  }
  
  public static boolean d(e parame)
  {
    return a(parame, k.a);
  }
  
  public static boolean d(w paramw)
  {
    paramw = paramw.f().c();
    return (paramw != null) && (d(paramw) != null);
  }
  
  public static boolean e(e parame)
  {
    return a(parame, k.ac);
  }
  
  public static boolean e(l paraml)
  {
    if (paraml.g_().r().b(k.y)) {
      return true;
    }
    if ((paraml instanceof ah))
    {
      Object localObject = (ah)paraml;
      boolean bool = ((ah)localObject).z();
      paraml = ((ah)localObject).b();
      localObject = ((ah)localObject).c();
      if ((paraml != null) && (e(paraml)) && ((!bool) || ((localObject != null) && (e((l)localObject))))) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean e(w paramw)
  {
    if (!paramw.c())
    {
      paramw = paramw.f().c();
      int i1;
      if (((paramw instanceof e)) && (b((e)paramw))) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 != 0) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean f(w paramw)
  {
    return c(paramw, k.i);
  }
  
  public static boolean g(w paramw)
  {
    return c(paramw, k.j);
  }
  
  public static boolean h(w paramw)
  {
    return c(paramw, k.m);
  }
  
  public static boolean i(w paramw)
  {
    return c(paramw, k.k);
  }
  
  public static boolean j(w paramw)
  {
    return c(paramw, k.n);
  }
  
  public static boolean k(w paramw)
  {
    return c(paramw, k.l);
  }
  
  public static boolean l(w paramw)
  {
    return (a(paramw, k.o)) && (!paramw.c());
  }
  
  public static boolean m(w paramw)
  {
    return (a(paramw, k.p)) && (!paramw.c());
  }
  
  public static boolean n(w paramw)
  {
    return (o(paramw)) && (!av.e(paramw));
  }
  
  public static boolean o(w paramw)
  {
    return a(paramw, k.b);
  }
  
  public static boolean p(w paramw)
  {
    return a(paramw, k.a);
  }
  
  public static boolean q(w paramw)
  {
    return (p(paramw)) && (paramw.c());
  }
  
  public static boolean r(w paramw)
  {
    return q(paramw);
  }
  
  public static boolean s(w paramw)
  {
    return b(paramw, k.e);
  }
  
  public static boolean t(w paramw)
  {
    return (paramw != null) && (b(paramw, k.g));
  }
  
  public final e a(b.i.b.a.c.f.b paramb)
  {
    e locale = q.a(this.h, paramb, b.i.b.a.c.c.a.c.d);
    if (!m)
    {
      if (locale != null) {
        return locale;
      }
      throw new AssertionError("Can't find built-in class ".concat(String.valueOf(paramb)));
    }
    return locale;
  }
  
  public final e a(String paramString)
  {
    return a(b.i.b.a.c.f.f.a(paramString));
  }
  
  public final ad a(h paramh)
  {
    return a(paramh.j.a).h();
  }
  
  public final ad a(ba paramba, w paramw)
  {
    paramba = Collections.singletonList(new ar(paramba, paramw));
    paramw = b.i.b.a.c.b.a.g.a;
    return b.i.b.a.c.l.x.a(b.i.b.a.c.b.a.g.a.a(), a("Array"), paramba);
  }
  
  public final w a(w paramw)
  {
    if (c(paramw))
    {
      if (paramw.a().size() == 1) {
        return ((ap)paramw.a().get(0)).c();
      }
      throw new IllegalStateException();
    }
    Object localObject1 = av.d(paramw);
    Object localObject2 = (w)((c)this.n.b_()).c.get(localObject1);
    if (localObject2 != null) {
      return (w)localObject2;
    }
    localObject2 = b.i.b.a.c.i.d.a((w)localObject1);
    if (localObject2 != null)
    {
      Object localObject3 = ((w)localObject1).f().c();
      localObject1 = null;
      if (localObject3 != null)
      {
        m localm = m.a;
        if (m.a(((b.i.b.a.c.b.h)localObject3).i()))
        {
          localObject3 = b.i.b.a.c.i.c.a.a((b.i.b.a.c.b.h)localObject3);
          if (localObject3 != null)
          {
            localm = m.a;
            localObject3 = m.a((b.i.b.a.c.f.a)localObject3);
            if (localObject3 != null)
            {
              localObject2 = s.a((y)localObject2, (b.i.b.a.c.f.a)localObject3);
              if (localObject2 != null) {
                localObject1 = ((e)localObject2).h();
              }
            }
          }
        }
      }
      if (localObject1 != null) {
        return (w)localObject1;
      }
    }
    throw new IllegalStateException("not array: ".concat(String.valueOf(paramw)));
  }
  
  public final ad b(h paramh)
  {
    return (ad)((c)this.n.b_()).a.get(paramh);
  }
  
  public final ad b(w paramw)
  {
    Object localObject = (ad)((c)this.n.b_()).b.get(paramw);
    if (localObject != null) {
      return (ad)localObject;
    }
    localObject = m.a;
    if (m.a(paramw))
    {
      if (av.e(paramw)) {
        return null;
      }
      localObject = b.i.b.a.c.i.d.a(paramw);
      if (localObject == null) {
        return null;
      }
      b.i.b.a.c.f.a locala = b.i.b.a.c.i.c.a.a(paramw.f().c());
      if ((!m) && (locala == null)) {
        throw new AssertionError("unsignedClassId should not be null for unsigned type ".concat(String.valueOf(paramw)));
      }
      paramw = m.a;
      paramw = m.b(locala);
      if ((!m) && (paramw == null)) {
        throw new AssertionError("arrayClassId should not be null for unsigned type ".concat(String.valueOf(locala)));
      }
      paramw = s.a((y)localObject, paramw);
      if (paramw == null) {
        return null;
      }
      return paramw.h();
    }
    return null;
  }
  
  protected final void b()
  {
    this.h = new v(l, this.j, this);
    v localv = this.h;
    Object localObject = b.a;
    localObject = (b)b.a.b.a();
    e();
    d();
    c();
    localv.a(((b)localObject).a());
    this.h.a(new v[] { this.h });
  }
  
  protected b.i.b.a.c.b.b.a c()
  {
    return a.a.a;
  }
  
  public final e c(int paramInt)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(b.b.b.f);
    ((StringBuilder)localObject).append(paramInt);
    localObject = b.i.b.a.c.f.f.a(((StringBuilder)localObject).toString());
    return a(b.i.b.a.c.i.d.c.a((b.i.b.a.c.f.f)localObject));
  }
  
  protected b.i.b.a.c.b.b.c d()
  {
    return c.b.a;
  }
  
  protected Iterable<b.i.b.a.c.b.b.b> e()
  {
    return Collections.singletonList(new b.i.b.a.c.a.a.a(this.j, this.h));
  }
  
  public final ad f()
  {
    return a("Nothing").h();
  }
  
  public final ad g()
  {
    return a("Any").h();
  }
  
  public final ad h()
  {
    return g().b(true);
  }
  
  public final ad i()
  {
    return a("Unit").h();
  }
  
  public final ad j()
  {
    return a("String").h();
  }
  
  public static final class a
  {
    public final b.i.b.a.c.f.b A = a("ReplaceWith");
    public final b.i.b.a.c.f.b B = a("ExtensionFunctionType");
    public final b.i.b.a.c.f.b C = a("ParameterName");
    public final b.i.b.a.c.f.b D = a("Annotation");
    public final b.i.b.a.c.f.b E = e("Target");
    public final b.i.b.a.c.f.b F = e("AnnotationTarget");
    public final b.i.b.a.c.f.b G = e("AnnotationRetention");
    public final b.i.b.a.c.f.b H = e("Retention");
    public final b.i.b.a.c.f.b I = e("Repeatable");
    public final b.i.b.a.c.f.b J = e("MustBeDocumented");
    public final b.i.b.a.c.f.b K = a("UnsafeVariance");
    public final b.i.b.a.c.f.b L = a("PublishedApi");
    public final b.i.b.a.c.f.b M = b("Iterator");
    public final b.i.b.a.c.f.b N = b("Iterable");
    public final b.i.b.a.c.f.b O = b("Collection");
    public final b.i.b.a.c.f.b P = b("List");
    public final b.i.b.a.c.f.b Q = b("ListIterator");
    public final b.i.b.a.c.f.b R = b("Set");
    public final b.i.b.a.c.f.b S = b("Map");
    public final b.i.b.a.c.f.b T = this.S.a(b.i.b.a.c.f.f.a("Entry"));
    public final b.i.b.a.c.f.b U = b("MutableIterator");
    public final b.i.b.a.c.f.b V = b("MutableIterable");
    public final b.i.b.a.c.f.b W = b("MutableCollection");
    public final b.i.b.a.c.f.b X = b("MutableList");
    public final b.i.b.a.c.f.b Y = b("MutableListIterator");
    public final b.i.b.a.c.f.b Z = b("MutableSet");
    public final b.i.b.a.c.f.c a = a("Any").b;
    public final b.i.b.a.c.f.b aa = b("MutableMap");
    public final b.i.b.a.c.f.b ab = this.aa.a(b.i.b.a.c.f.f.a("MutableEntry"));
    public final b.i.b.a.c.f.c ac = d("KClass");
    public final b.i.b.a.c.f.c ad = d("KCallable");
    public final b.i.b.a.c.f.c ae = d("KProperty0");
    public final b.i.b.a.c.f.c af = d("KProperty1");
    public final b.i.b.a.c.f.c ag = d("KProperty2");
    public final b.i.b.a.c.f.c ah = d("KMutableProperty0");
    public final b.i.b.a.c.f.c ai = d("KMutableProperty1");
    public final b.i.b.a.c.f.c aj = d("KMutableProperty2");
    public final b.i.b.a.c.f.a ak = b.i.b.a.c.f.a.a(d("KProperty").b());
    public final b.i.b.a.c.f.b al = a("UByte");
    public final b.i.b.a.c.f.b am = a("UShort");
    public final b.i.b.a.c.f.b an = a("UInt");
    public final b.i.b.a.c.f.b ao = a("ULong");
    public final b.i.b.a.c.f.a ap = b.i.b.a.c.f.a.a(this.al);
    public final b.i.b.a.c.f.a aq = b.i.b.a.c.f.a.a(this.am);
    public final b.i.b.a.c.f.a ar = b.i.b.a.c.f.a.a(this.an);
    public final b.i.b.a.c.f.a as = b.i.b.a.c.f.a.a(this.ao);
    public final Set<b.i.b.a.c.f.f> at = b.i.b.a.c.n.a.b(h.values().length);
    public final Set<b.i.b.a.c.f.f> au = b.i.b.a.c.n.a.b(h.values().length);
    public final Map<b.i.b.a.c.f.c, h> av = b.i.b.a.c.n.a.a(h.values().length);
    public final Map<b.i.b.a.c.f.c, h> aw = b.i.b.a.c.n.a.a(h.values().length);
    public final b.i.b.a.c.f.c b = a("Nothing").b;
    public final b.i.b.a.c.f.c c = a("Cloneable").b;
    public final b.i.b.a.c.f.b d = a("Suppress");
    public final b.i.b.a.c.f.c e = a("Unit").b;
    public final b.i.b.a.c.f.c f = a("CharSequence").b;
    public final b.i.b.a.c.f.c g = a("String").b;
    public final b.i.b.a.c.f.c h = a("Array").b;
    public final b.i.b.a.c.f.c i = a("Boolean").b;
    public final b.i.b.a.c.f.c j = a("Char").b;
    public final b.i.b.a.c.f.c k = a("Byte").b;
    public final b.i.b.a.c.f.c l = a("Short").b;
    public final b.i.b.a.c.f.c m = a("Int").b;
    public final b.i.b.a.c.f.c n = a("Long").b;
    public final b.i.b.a.c.f.c o = a("Float").b;
    public final b.i.b.a.c.f.c p = a("Double").b;
    public final b.i.b.a.c.f.c q = a("Number").b;
    public final b.i.b.a.c.f.c r = a("Enum").b;
    public final b.i.b.a.c.f.c s = a("Function").b;
    public final b.i.b.a.c.f.b t = a("Throwable");
    public final b.i.b.a.c.f.b u = a("Comparable");
    public final b.i.b.a.c.f.c v = c("CharRange");
    public final b.i.b.a.c.f.c w = c("IntRange");
    public final b.i.b.a.c.f.c x = c("LongRange");
    public final b.i.b.a.c.f.b y = a("Deprecated");
    public final b.i.b.a.c.f.b z = a("DeprecationLevel");
    
    public a()
    {
      h[] arrayOfh = h.values();
      int i2 = arrayOfh.length;
      int i1 = 0;
      while (i1 < i2)
      {
        h localh = arrayOfh[i1];
        this.at.add(localh.j);
        this.au.add(localh.k);
        this.av.put(a(localh.j.a).b, localh);
        this.aw.put(a(localh.k.a).b, localh);
        i1 += 1;
      }
    }
    
    private static b.i.b.a.c.f.b a(String paramString)
    {
      return g.c.a(b.i.b.a.c.f.f.a(paramString));
    }
    
    private static b.i.b.a.c.f.b b(String paramString)
    {
      return g.d.a(b.i.b.a.c.f.f.a(paramString));
    }
    
    private static b.i.b.a.c.f.c c(String paramString)
    {
      return g.e.a(b.i.b.a.c.f.f.a(paramString)).b;
    }
    
    private static b.i.b.a.c.f.c d(String paramString)
    {
      return j.a().a(b.i.b.a.c.f.f.a(paramString)).b;
    }
    
    private static b.i.b.a.c.f.b e(String paramString)
    {
      return g.k().a(b.i.b.a.c.f.f.a(paramString));
    }
  }
  
  public static final class b
  {
    public final ab a;
    public final ab b;
    public final ab c;
    public final Set<ab> d;
    
    private b(ab paramab1, ab paramab2, ab paramab3, Set<ab> paramSet)
    {
      this.a = paramab1;
      this.b = paramab2;
      this.c = paramab3;
      this.d = paramSet;
    }
  }
  
  static final class c
  {
    public final Map<h, ad> a;
    public final Map<w, ad> b;
    public final Map<ad, ad> c;
    
    private c(Map<h, ad> paramMap, Map<w, ad> paramMap1, Map<ad, ad> paramMap2)
    {
      this.a = paramMap;
      this.b = paramMap1;
      this.c = paramMap2;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */