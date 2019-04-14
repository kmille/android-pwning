package b.i.b.a.c.a;

import b.a.ac;
import b.i.b.a.c.a.a.a.a;
import b.i.b.a.c.a.a.b.b;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.f.b;
import b.i.b.a.c.i.b.s;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class f
{
  private static b.b a(l paraml)
  {
    b.f.b.j.b(paraml, "receiver$0");
    if (!(paraml instanceof e)) {
      return null;
    }
    if (!g.b(paraml)) {
      return null;
    }
    return a(b.i.b.a.c.i.c.a.a(paraml));
  }
  
  private static final b.b a(b.i.b.a.c.f.c paramc)
  {
    if ((paramc.a()) && (!paramc.a.isEmpty()))
    {
      Object localObject = b.i.b.a.c.a.a.a.a;
      localObject = paramc.d().a;
      b.f.b.j.a(localObject, "shortName().asString()");
      paramc = paramc.b().b();
      b.f.b.j.a(paramc, "toSafe().parent()");
      return a.a.b((String)localObject, paramc);
    }
    return null;
  }
  
  public static final ad a(g paramg, b.i.b.a.c.b.a.g paramg1, b.i.b.a.c.l.w paramw1, List<? extends b.i.b.a.c.l.w> paramList, b.i.b.a.c.l.w paramw2, boolean paramBoolean)
  {
    b.f.b.j.b(paramg, "builtIns");
    b.f.b.j.b(paramg1, "annotations");
    b.f.b.j.b(paramList, "parameterTypes");
    b.f.b.j.b(paramw2, "returnType");
    b.f.b.j.b(paramList, "parameterTypes");
    b.f.b.j.b(paramw2, "returnType");
    b.f.b.j.b(paramg, "builtIns");
    int k = paramList.size();
    int j = 0;
    if (paramw1 != null) {
      i = 1;
    } else {
      i = 0;
    }
    ArrayList localArrayList = new ArrayList(k + i + 1);
    Collection localCollection = (Collection)localArrayList;
    if (paramw1 != null) {
      localObject1 = b.i.b.a.c.l.c.a.f(paramw1);
    } else {
      localObject1 = null;
    }
    b.i.b.a.c.n.a.a(localCollection, localObject1);
    Object localObject1 = ((Iterable)paramList).iterator();
    int i = j;
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      if (i < 0) {
        b.a.j.a();
      }
      localCollection.add(b.i.b.a.c.l.c.a.f((b.i.b.a.c.l.w)localObject2));
      i += 1;
    }
    localArrayList.add(b.i.b.a.c.l.c.a.f(paramw2));
    localObject1 = (List)localArrayList;
    i = paramList.size();
    if (paramw1 != null) {
      i += 1;
    }
    if (paramBoolean) {
      paramList = paramg.c(i);
    } else {
      paramList = paramg.a(g.a(i));
    }
    b.f.b.j.a(paramList, "if (suspendFunction) bui…tFunction(parameterCount)");
    paramw2 = paramg1;
    if (paramw1 != null)
    {
      paramw1 = g.k.B;
      b.f.b.j.a(paramw1, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
      if (paramg1.a(paramw1) != null)
      {
        paramw2 = paramg1;
      }
      else
      {
        paramw1 = b.i.b.a.c.b.a.g.a;
        paramg1 = (Iterable)paramg1;
        paramw1 = g.k.B;
        b.f.b.j.a(paramw1, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
        paramw2 = b.i.b.a.c.b.a.g.a.a(b.a.j.c(paramg1, new b.i.b.a.c.b.a.j(paramg, paramw1, ac.a())));
      }
    }
    return x.a(paramw2, paramList, (List)localObject1);
  }
  
  public static final boolean a(b.i.b.a.c.l.w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    paramw = paramw.f().c();
    if (paramw != null) {
      paramw = a((l)paramw);
    } else {
      paramw = null;
    }
    return paramw == b.b.a;
  }
  
  public static final boolean b(b.i.b.a.c.l.w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    paramw = paramw.f().c();
    if (paramw != null) {
      paramw = a((l)paramw);
    } else {
      paramw = null;
    }
    return paramw == b.b.b;
  }
  
  public static final boolean c(b.i.b.a.c.l.w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    paramw = paramw.f().c();
    if (paramw != null) {
      paramw = a((l)paramw);
    } else {
      paramw = null;
    }
    return (paramw == b.b.a) || (paramw == b.b.b);
  }
  
  public static final b.i.b.a.c.l.w d(b.i.b.a.c.l.w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    boolean bool = c(paramw);
    if ((b.w.a) && (!bool)) {
      throw ((Throwable)new AssertionError("Not a function type: ".concat(String.valueOf(paramw))));
    }
    if (h(paramw)) {
      return ((ap)b.a.j.c(paramw.a())).c();
    }
    return null;
  }
  
  public static final b.i.b.a.c.l.w e(b.i.b.a.c.l.w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    boolean bool = c(paramw);
    if ((b.w.a) && (!bool)) {
      throw ((Throwable)new AssertionError("Not a function type: ".concat(String.valueOf(paramw))));
    }
    paramw = ((ap)b.a.j.e(paramw.a())).c();
    b.f.b.j.a(paramw, "arguments.last().type");
    return paramw;
  }
  
  public static final List<ap> f(b.i.b.a.c.l.w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    boolean bool = c(paramw);
    if ((b.w.a) && (!bool)) {
      throw ((Throwable)new AssertionError("Not a function type: ".concat(String.valueOf(paramw))));
    }
    List localList = paramw.a();
    b.f.b.j.b(paramw, "receiver$0");
    bool = c(paramw);
    int j = 0;
    int i;
    if ((bool) && (h(paramw))) {
      i = 1;
    } else {
      i = 0;
    }
    int k = localList.size() - 1;
    if (i <= k) {
      j = 1;
    }
    if ((b.w.a) && (j == 0)) {
      throw ((Throwable)new AssertionError("Not an exact function type: ".concat(String.valueOf(paramw))));
    }
    return localList.subList(i, k);
  }
  
  public static final b.i.b.a.c.f.f g(b.i.b.a.c.l.w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    paramw = paramw.r();
    Object localObject = g.k.C;
    b.f.b.j.a(localObject, "KotlinBuiltIns.FQ_NAMES.parameterName");
    paramw = paramw.a((b)localObject);
    if (paramw == null) {
      return null;
    }
    localObject = b.a.j.f((Iterable)paramw.c().values());
    paramw = (b.i.b.a.c.l.w)localObject;
    if (!(localObject instanceof s)) {
      paramw = null;
    }
    paramw = (s)paramw;
    if (paramw != null)
    {
      paramw = (String)paramw.a();
      if (paramw != null)
      {
        if (!b.i.b.a.c.f.f.b(paramw)) {
          paramw = null;
        }
        if (paramw == null) {
          return null;
        }
        return b.i.b.a.c.f.f.a(paramw);
      }
    }
    return null;
  }
  
  private static final boolean h(b.i.b.a.c.l.w paramw)
  {
    paramw = paramw.r();
    b localb = g.k.B;
    b.f.b.j.a(localb, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
    return paramw.a(localb) != null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */