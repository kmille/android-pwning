package b.i.b.a.c.d.b;

import b.a.ai;
import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.am;
import b.i.b.a.c.d.b.a.a.a;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.a.s;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.b.a.g;
import b.i.b.a.c.f.f;
import b.i.b.a.c.j.a.o;
import b.m;
import java.util.List;
import java.util.Set;

public final class e
{
  public static final a b = new a((byte)0);
  private static final Set<a.a> c = ai.a(a.a.b);
  private static final Set<a.a> d = ai.a(new a.a[] { a.a.c, a.a.f });
  private static final g e = new g(new int[] { 1, 1, 2 });
  private static final g f = new g(new int[] { 1, 1, 11 });
  private static final g g = new g(new int[] { 1, 1, 13 });
  public b.i.b.a.c.j.a.i a;
  
  private static String[] a(n paramn, Set<? extends a.a> paramSet)
  {
    b.f.b.j.b(paramn, "kotlinClass");
    b.f.b.j.b(paramSet, "expectedKinds");
    b.i.b.a.c.d.b.a.a locala = paramn.c();
    String[] arrayOfString = locala.c;
    paramn = arrayOfString;
    if (arrayOfString == null) {
      paramn = locala.d;
    }
    if ((paramn != null) && (paramSet.contains(locala.a))) {
      return paramn;
    }
    return null;
  }
  
  private final o<g> b(n paramn)
  {
    c();
    if (paramn.c().b.a()) {
      return null;
    }
    return new o((b.i.b.a.c.e.a.a)paramn.c().b, (b.i.b.a.c.e.a.a)g.e, paramn.a(), paramn.b());
  }
  
  private final boolean c()
  {
    if (this.a == null) {
      b.f.b.j.a("components");
    }
    return false;
  }
  
  private final boolean c(n paramn)
  {
    if (this.a == null) {
      b.f.b.j.a("components");
    }
    return d(paramn);
  }
  
  private final boolean d(n paramn)
  {
    if (this.a == null) {
      b.f.b.j.a("components");
    }
    return (paramn.c().b()) && (b.f.b.j.a(paramn.c().b, f));
  }
  
  public final b.i.b.a.c.i.e.h a(ab paramab, n paramn)
  {
    b.f.b.j.b(paramab, "descriptor");
    b.f.b.j.b(paramn, "kotlinClass");
    Object localObject1 = a(paramn, d);
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = paramn.c().e;
    if (localObject2 == null) {
      return null;
    }
    try
    {
      localObject1 = b.i.b.a.c.e.b.a.j.b((String[])localObject1, (String[])localObject2);
    }
    catch (Throwable localThrowable) {}catch (b.i.b.a.c.g.k localk)
    {
      localObject2 = new StringBuilder("Could not read data from ");
      ((StringBuilder)localObject2).append(paramn.a());
      throw ((Throwable)new IllegalStateException(((StringBuilder)localObject2).toString(), (Throwable)localk));
    }
    c();
    a.s locals;
    if (!paramn.c().b.a())
    {
      locals = null;
      if (locals == null) {
        return null;
      }
      localObject2 = (b.i.b.a.c.e.b.a.h)locals.a;
      locals = (a.s)locals.b;
      localObject2 = (c)localObject2;
      Object localObject3 = new i(paramn, locals, (c)localObject2, b(paramn), c(paramn));
      paramn = (b.i.b.a.c.e.a.a)paramn.c().b;
      localObject3 = (b.i.b.a.c.j.a.a.e)localObject3;
      b.i.b.a.c.j.a.i locali = this.a;
      if (locali == null) {
        b.f.b.j.a("components");
      }
      return (b.i.b.a.c.i.e.h)new b.i.b.a.c.j.a.a.h(paramab, locals, (c)localObject2, paramn, (b.i.b.a.c.j.a.a.e)localObject3, locali, (b.f.a.a)b.a);
    }
    throw locals;
  }
  
  public final b.i.b.a.c.j.a.e a(n paramn)
  {
    b.f.b.j.b(paramn, "kotlinClass");
    Object localObject1 = a(paramn, c);
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = paramn.c().e;
    if (localObject2 == null) {
      return null;
    }
    try
    {
      localObject1 = b.i.b.a.c.e.b.a.j.a((String[])localObject1, (String[])localObject2);
    }
    catch (Throwable localThrowable) {}catch (b.i.b.a.c.g.k localk)
    {
      localObject2 = new StringBuilder("Could not read data from ");
      ((StringBuilder)localObject2).append(paramn.a());
      throw ((Throwable)new IllegalStateException(((StringBuilder)localObject2).toString(), (Throwable)localk));
    }
    c();
    a.c localc;
    if (!paramn.c().b.a())
    {
      localc = null;
      if (localc == null) {
        return null;
      }
      localObject2 = (b.i.b.a.c.e.b.a.h)localc.a;
      localc = (a.c)localc.b;
      p localp = new p(paramn, b(paramn), c(paramn));
      return new b.i.b.a.c.j.a.e((c)localObject2, localc, (b.i.b.a.c.e.a.a)paramn.c().b, (am)localp);
    }
    throw localc;
  }
  
  public final b.i.b.a.c.j.a.i a()
  {
    b.i.b.a.c.j.a.i locali = this.a;
    if (locali == null) {
      b.f.b.j.a("components");
    }
    return locali;
  }
  
  public static final class a {}
  
  static final class b
    extends b.f.b.k
    implements b.f.a.a<List<? extends f>>
  {
    public static final b a = new b();
    
    b()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */