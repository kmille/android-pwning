package b.i.b.a.c.l;

import b.a.j;
import b.f.a.b;
import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.e;
import b.i.b.a.c.l.a.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class av
{
  public static final ad a = p.d("DONT_CARE");
  public static final ad b = p.c("Cannot be inferred");
  public static final ad c = new a("NO_EXPECTED_TYPE");
  public static final ad d = new a("UNIT_EXPECTED_TYPE");
  
  public static ad a(b.i.b.a.c.b.h paramh, b.i.b.a.c.i.e.h paramh1)
  {
    if (p.a(paramh)) {
      return p.c("Unsubstituted type for ".concat(String.valueOf(paramh)));
    }
    paramh = paramh.c();
    List localList = a(paramh.b());
    g.a locala = b.i.b.a.c.b.a.g.a;
    return x.a(g.a.a(), paramh, localList, false, paramh1);
  }
  
  public static ap a(b.i.b.a.c.b.ar paramar)
  {
    return new ah(paramar);
  }
  
  public static w a(w paramw, boolean paramBoolean)
  {
    return paramw.i().a(paramBoolean);
  }
  
  public static List<ap> a(List<b.i.b.a.c.b.ar> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(new ar(((b.i.b.a.c.b.ar)paramList.next()).h()));
    }
    return j.i(localArrayList);
  }
  
  public static boolean a(w paramw)
  {
    return (paramw == c) || (paramw == d);
  }
  
  public static boolean a(w paramw, b<az, Boolean> paramb)
  {
    if (paramw == null) {
      return false;
    }
    az localaz = paramw.i();
    if (((Boolean)paramb.a(localaz)).booleanValue()) {
      return true;
    }
    if ((localaz instanceof q)) {
      localObject = (q)localaz;
    } else {
      localObject = null;
    }
    if ((localObject != null) && ((a(((q)localObject).a, paramb)) || (a(((q)localObject).b, paramb)))) {
      return true;
    }
    if (((localaz instanceof g)) && (a(((g)localaz).a, paramb))) {
      return true;
    }
    Object localObject = paramw.f();
    if ((localObject instanceof v))
    {
      paramw = ((v)localObject).a.iterator();
      while (paramw.hasNext()) {
        if (a((w)paramw.next(), paramb)) {
          return true;
        }
      }
      return false;
    }
    paramw = paramw.a().iterator();
    for (;;)
    {
      if (paramw.hasNext())
      {
        localObject = (ap)paramw.next();
        if (((ap)localObject).a()) {
          continue;
        }
        localObject = ((ap)localObject).c();
      }
      try
      {
        boolean bool = a((w)localObject, paramb);
        if (bool) {
          return true;
        }
      }
      catch (Throwable paramw)
      {
        throw paramw;
      }
    }
    return false;
  }
  
  public static w b(w paramw, boolean paramBoolean)
  {
    w localw = paramw;
    if (paramBoolean) {
      localw = a(paramw, true);
    }
    return localw;
  }
  
  public static boolean b(w paramw)
  {
    return (paramw != null) && (paramw.f() == a.f());
  }
  
  public static w c(w paramw)
  {
    return a(paramw, true);
  }
  
  public static w d(w paramw)
  {
    return a(paramw, false);
  }
  
  public static boolean e(w paramw)
  {
    if (paramw.c()) {
      return true;
    }
    if ((t.a(paramw)) && (e(t.b(paramw).b))) {
      return true;
    }
    if (h(paramw))
    {
      if (!(paramw.f().c() instanceof e))
      {
        au localau = au.a(paramw);
        Object localObject = paramw.f().i_();
        ArrayList localArrayList = new ArrayList(((Collection)localObject).size());
        Iterator localIterator = ((Collection)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = localau.b((w)localIterator.next(), ba.a);
          if (localObject != null) {
            localObject = b((w)localObject, paramw.c());
          } else {
            localObject = null;
          }
          if (localObject != null) {
            localArrayList.add(localObject);
          }
        }
        paramw = localArrayList.iterator();
        while (paramw.hasNext()) {
          if (e((w)paramw.next())) {
            return true;
          }
        }
      }
      return false;
    }
    paramw = paramw.f();
    if ((paramw instanceof v))
    {
      paramw = paramw.i_().iterator();
      while (paramw.hasNext()) {
        if (e((w)paramw.next())) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean f(w paramw)
  {
    if (paramw.c()) {
      return true;
    }
    return (t.a(paramw)) && (f(t.b(paramw).b));
  }
  
  public static e g(w paramw)
  {
    paramw = paramw.f().c();
    if ((paramw instanceof e)) {
      return (e)paramw;
    }
    return null;
  }
  
  public static boolean h(w paramw)
  {
    return (i(paramw) != null) || ((paramw.f() instanceof k));
  }
  
  private static b.i.b.a.c.b.ar i(w paramw)
  {
    if ((paramw.f().c() instanceof b.i.b.a.c.b.ar)) {
      return (b.i.b.a.c.b.ar)paramw.f().c();
    }
    return null;
  }
  
  public static final class a
    extends i
  {
    private final String a;
    
    public a(String paramString)
    {
      this.a = paramString;
    }
    
    public final ad b(b.i.b.a.c.b.a.g paramg)
    {
      throw new IllegalStateException(this.a);
    }
    
    public final ad b(boolean paramBoolean)
    {
      throw new IllegalStateException(this.a);
    }
    
    protected final ad d()
    {
      throw new IllegalStateException(this.a);
    }
    
    public final String toString()
    {
      return this.a;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */