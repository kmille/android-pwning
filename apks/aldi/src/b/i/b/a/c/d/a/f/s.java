package b.i.b.a.c.d.a.f;

import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.h;
import b.i.b.a.c.d.a.p;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.ax;
import b.i.b.a.c.l.az;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.c.a;
import b.i.b.a.c.l.x;
import b.i.b.a.c.l.y;
import b.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class s
{
  private static final b a;
  private static final b b;
  
  static
  {
    b.i.b.a.c.f.b localb = p.k;
    b.f.b.j.a(localb, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
    a = new b(localb);
    localb = p.l;
    b.f.b.j.a(localb, "JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION");
    b = new b(localb);
  }
  
  private static final b.i.b.a.c.b.a.g a(List<? extends b.i.b.a.c.b.a.g> paramList)
  {
    switch (paramList.size())
    {
    default: 
      return (b.i.b.a.c.b.a.g)new b.i.b.a.c.b.a.k(b.a.j.i((Iterable)paramList));
    case 1: 
      return (b.i.b.a.c.b.a.g)b.a.j.g(paramList);
    }
    throw ((Throwable)new IllegalStateException("At least one Annotations object expected".toString()));
  }
  
  private static final c<h> a(h paramh, d paramd, int paramInt)
  {
    if (!a(paramInt)) {
      return a(paramh);
    }
    if (!(paramh instanceof e)) {
      return a(paramh);
    }
    b.i.b.a.c.a.b.c localc = b.i.b.a.c.a.b.c.b;
    paramd = paramd.b;
    if (paramd != null) {
      switch (t.a[paramd.ordinal()])
      {
      default: 
        break;
      case 2: 
        if (paramInt == q.b)
        {
          paramd = (e)paramh;
          if (!b.i.b.a.c.a.b.c.b(paramd)) {
            break;
          }
        }
        break;
      case 1: 
        for (paramh = b.i.b.a.c.a.b.c.d(paramd);; paramh = b.i.b.a.c.a.b.c.c(paramd))
        {
          return c(paramh);
          if (paramInt != q.a) {
            break;
          }
          paramd = (e)paramh;
          if (!b.i.b.a.c.a.b.c.a(paramd)) {
            break;
          }
        }
      }
    }
    return a(paramh);
  }
  
  private static final c<Boolean> a(b.i.b.a.c.l.w paramw, d paramd, int paramInt)
  {
    if (!a(paramInt)) {
      return a(Boolean.valueOf(paramw.c()));
    }
    paramd = paramd.a;
    if (paramd != null) {
      switch (t.b[paramd.ordinal()])
      {
      default: 
        break;
      case 2: 
        return b(Boolean.FALSE);
      case 1: 
        return b(Boolean.TRUE);
      }
    }
    return a(Boolean.valueOf(paramw.c()));
  }
  
  private static final <T> c<T> a(T paramT)
  {
    return new c(paramT, null);
  }
  
  private static final k a(az paramaz, b.f.a.b<? super Integer, d> paramb, int paramInt)
  {
    Object localObject = (b.i.b.a.c.l.w)paramaz;
    boolean bool2 = y.b((b.i.b.a.c.l.w)localObject);
    boolean bool1 = false;
    if (bool2) {
      return new k((b.i.b.a.c.l.w)localObject, 1, false);
    }
    if ((paramaz instanceof b.i.b.a.c.l.q))
    {
      localObject = (b.i.b.a.c.l.q)paramaz;
      o localo1 = a(((b.i.b.a.c.l.q)localObject).a, paramb, paramInt, q.a);
      o localo2 = a(((b.i.b.a.c.l.q)localObject).b, paramb, paramInt, q.b);
      if (localo1.a == localo2.a) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if ((b.w.a) && (paramInt == 0))
      {
        paramaz = new StringBuilder("Different tree sizes of bounds: lower = (");
        paramaz.append(((b.i.b.a.c.l.q)localObject).a);
        paramaz.append(", ");
        paramaz.append(localo1.a);
        paramaz.append("), upper = (");
        paramaz.append(((b.i.b.a.c.l.q)localObject).b);
        paramaz.append(", ");
        paramaz.append(localo2.a);
        paramaz.append(')');
        throw ((Throwable)new AssertionError(paramaz.toString()));
      }
      if ((localo1.b) || (localo2.b)) {
        bool1 = true;
      }
      localObject = ax.a((b.i.b.a.c.l.w)localo1.c);
      paramb = (b.f.a.b<? super Integer, d>)localObject;
      if (localObject == null) {
        paramb = ax.a((b.i.b.a.c.l.w)localo2.c);
      }
      if (bool1)
      {
        if ((paramaz instanceof b.i.b.a.c.d.a.c.b.g)) {
          paramaz = (az)new b.i.b.a.c.d.a.c.b.g(localo1.c, localo2.c);
        } else {
          paramaz = x.a(localo1.c, localo2.c);
        }
        paramaz = ax.b(paramaz, paramb);
      }
      return new k((b.i.b.a.c.l.w)paramaz, localo1.a, bool1);
    }
    if ((paramaz instanceof ad)) {
      return (k)a((ad)paramaz, paramb, paramInt, q.c);
    }
    throw new b.k();
  }
  
  private static final o a(ad paramad, b.f.a.b<? super Integer, d> paramb, int paramInt1, int paramInt2)
  {
    if ((!a(paramInt2)) && (paramad.a().isEmpty())) {
      return new o(paramad, 1, false);
    }
    Object localObject1 = paramad.f().c();
    if (localObject1 == null) {
      return new o(paramad, 1, false);
    }
    b.f.b.j.a(localObject1, "constructor.declarationD…pleResult(this, 1, false)");
    d locald = (d)paramb.a(Integer.valueOf(paramInt1));
    localObject1 = a((h)localObject1, locald, paramInt2);
    Object localObject2 = (h)((c)localObject1).a;
    b.i.b.a.c.b.a.g localg = ((c)localObject1).b;
    an localan = ((h)localObject2).c();
    b.f.b.j.a(localan, "enhancedClassifier.typeConstructor");
    if (localg != null) {
      i = 1;
    } else {
      i = 0;
    }
    localObject1 = (Iterable)paramad.a();
    Collection localCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject1));
    Iterator localIterator = ((Iterable)localObject1).iterator();
    int k = paramInt1 + 1;
    int m = 0;
    int j = i;
    while (localIterator.hasNext())
    {
      localObject1 = localIterator.next();
      if (m < 0) {
        b.a.j.a();
      }
      localObject1 = (ap)localObject1;
      if (((ap)localObject1).a())
      {
        i = k + 1;
        localObject1 = ((h)localObject2).c();
        b.f.b.j.a(localObject1, "enhancedClassifier.typeConstructor");
        localObject1 = av.a((ar)((an)localObject1).b().get(m));
      }
      else
      {
        Object localObject3 = a(((ap)localObject1).c().i(), paramb, k);
        if ((j == 0) && (!((k)localObject3).b)) {
          j = 0;
        } else {
          j = 1;
        }
        i = k + ((k)localObject3).a;
        localObject3 = ((k)localObject3).a();
        localObject1 = ((ap)localObject1).b();
        b.f.b.j.a(localObject1, "arg.projectionKind");
        localObject1 = a.a((b.i.b.a.c.l.w)localObject3, (ba)localObject1, (ar)localan.b().get(m));
      }
      localCollection.add(localObject1);
      m += 1;
      k = i;
    }
    paramb = (List)localCollection;
    localObject1 = a((b.i.b.a.c.l.w)paramad, locald, paramInt2);
    boolean bool = ((Boolean)((c)localObject1).a).booleanValue();
    localObject2 = ((c)localObject1).b;
    if ((j == 0) && (localObject2 == null)) {
      paramInt2 = 0;
    } else {
      paramInt2 = 1;
    }
    int i = k - paramInt1;
    if (paramInt2 == 0) {
      return new o(paramad, i, false);
    }
    paramInt2 = 0;
    localObject1 = x.a(a(b.a.j.h((Iterable)b.a.j.b(new b.i.b.a.c.b.a.g[] { paramad.r(), localg, localObject2 }))), localan, paramb, bool);
    paramb = (b.f.a.b<? super Integer, d>)localObject1;
    if (locald.c) {
      paramb = (ad)new f((ad)localObject1);
    }
    paramInt1 = paramInt2;
    if (localObject2 != null)
    {
      paramInt1 = paramInt2;
      if (locald.d) {
        paramInt1 = 1;
      }
    }
    if (paramInt1 != 0) {
      paramad = ax.b((az)paramad, (b.i.b.a.c.l.w)paramb);
    } else {
      paramad = (az)paramb;
    }
    if (paramad != null) {
      return new o((ad)paramad, i, true);
    }
    throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
  }
  
  public static final b.i.b.a.c.l.w a(b.i.b.a.c.l.w paramw, b.f.a.b<? super Integer, d> paramb)
  {
    b.f.b.j.b(paramw, "receiver$0");
    b.f.b.j.b(paramb, "qualifiers");
    paramw = a(paramw.i(), paramb, 0);
    paramb = paramw.a();
    if (paramw.b) {
      return paramb;
    }
    return null;
  }
  
  private static final boolean a(int paramInt)
  {
    return paramInt != q.c;
  }
  
  public static final boolean a(b.i.b.a.c.l.w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    paramw = paramw.r();
    b.i.b.a.c.f.b localb = p.k;
    b.f.b.j.a(localb, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
    return paramw.a(localb) != null;
  }
  
  private static final <T> c<T> b(T paramT)
  {
    return new c(paramT, (b.i.b.a.c.b.a.g)a);
  }
  
  private static final <T> c<T> c(T paramT)
  {
    return new c(paramT, (b.i.b.a.c.b.a.g)b);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/f/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */