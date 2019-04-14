package b.i.b.a.c.l.a;

import b.i.b.a.c.a.g;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.i.c.a;
import b.i.b.a.c.l.am;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.w;
import b.i.b.a.c.l.y;
import java.util.List;

public class q
{
  private final r b;
  
  public q(r paramr)
  {
    this.b = paramr;
  }
  
  private static w a(ar paramar, ap paramap)
  {
    int i;
    if ((paramap.b() != ba.b) && (paramar.k() != ba.b)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0) {
      return a.d(paramar).h();
    }
    return paramap.c();
  }
  
  public static w a(w paramw1, w paramw2)
  {
    return t.a(paramw1, paramw2, new p());
  }
  
  private static boolean a(ap paramap1, ap paramap2, ar paramar)
  {
    if (paramar.k() != ba.a) {
      return false;
    }
    if ((paramap1.b() != ba.a) && (paramap2.b() == ba.a)) {
      paramap2.c();
    }
    return false;
  }
  
  private static w b(ar paramar, ap paramap)
  {
    int i;
    if ((paramap.b() != ba.c) && (paramar.k() != ba.c)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0) {
      return a.d(paramar).f();
    }
    return paramap.c();
  }
  
  private static int c(ar paramar, ap paramap)
  {
    paramar = paramar.k();
    paramap = paramap.b();
    Object localObject2 = paramar;
    Object localObject1 = paramap;
    if (paramap == ba.a)
    {
      localObject1 = paramar;
      localObject2 = paramap;
    }
    if ((localObject2 == ba.b) && (localObject1 == ba.c)) {
      return a.d;
    }
    if ((localObject2 == ba.c) && (localObject1 == ba.b)) {
      return a.d;
    }
    return a.a((ba)localObject1);
  }
  
  private boolean d(w paramw1, w paramw2)
  {
    if ((!a) && (b.i.b.a.c.l.t.a(paramw1))) {
      throw new AssertionError("Only inflexible types are allowed here: ".concat(String.valueOf(paramw1)));
    }
    return (c(b.i.b.a.c.l.t.b(paramw2).a, paramw1)) && (c(paramw1, b.i.b.a.c.l.t.b(paramw2).b));
  }
  
  private boolean e(w paramw1, w paramw2)
  {
    if (!y.b(paramw1))
    {
      if (y.b(paramw2)) {
        return true;
      }
      if ((!paramw2.c()) && (paramw1.c())) {
        return false;
      }
      if (g.o(paramw1)) {
        return true;
      }
      paramw1 = t.a(paramw1, paramw2, this.b);
      if (paramw1 == null) {
        return false;
      }
      if ((!paramw2.c()) && (paramw1.c())) {
        return false;
      }
      return f(paramw1, paramw2);
    }
    return true;
  }
  
  private boolean f(w paramw1, w paramw2)
  {
    Object localObject1 = paramw1.f();
    paramw1 = paramw1.a();
    paramw2 = paramw2.a();
    if (paramw1.size() != paramw2.size()) {
      return false;
    }
    localObject1 = ((an)localObject1).b();
    int i = 0;
    for (;;)
    {
      int j = ((List)localObject1).size();
      int k = 1;
      if (i >= j) {
        break;
      }
      Object localObject2 = (ar)((List)localObject1).get(i);
      ap localap1 = (ap)paramw2.get(i);
      ap localap2 = (ap)paramw1.get(i);
      if (!localap1.a())
      {
        a(localap2, localap1, (ar)localObject2);
        j = k;
        if (!y.b(localap2.c())) {
          if (y.b(localap1.c())) {
            j = k;
          } else {
            j = 0;
          }
        }
        if ((j == 0) && (((ar)localObject2).k() == ba.a) && (localap2.b() == ba.a) && (localap1.b() == ba.a))
        {
          if (!this.b.a(localap2.c(), localap1.c(), this)) {
            return false;
          }
        }
        else
        {
          w localw1 = a((ar)localObject2, localap1);
          w localw2 = a((ar)localObject2, localap2);
          if (!this.b.b(localw2, localw1, this)) {
            return false;
          }
          localw1 = b((ar)localObject2, localap1);
          localObject2 = b((ar)localObject2, localap2);
          if (localap1.b() != ba.c)
          {
            if (!this.b.b(localw1, (w)localObject2, this)) {
              return false;
            }
          }
          else if ((!a) && (!g.n(localw1))) {
            throw new AssertionError("In component must be Nothing for out-projection");
          }
        }
      }
      i += 1;
    }
    return true;
  }
  
  public final boolean b(w paramw1, w paramw2)
  {
    if (paramw1 == paramw2) {
      return true;
    }
    if (b.i.b.a.c.l.t.a(paramw1))
    {
      if (b.i.b.a.c.l.t.a(paramw2)) {
        return (!y.b(paramw1)) && (!y.b(paramw2)) && (c(paramw1, paramw2)) && (c(paramw2, paramw1));
      }
      return d(paramw2, paramw1);
    }
    if (b.i.b.a.c.l.t.a(paramw2)) {
      return d(paramw1, paramw2);
    }
    if (paramw1.c() != paramw2.c()) {
      return false;
    }
    if (paramw1.c()) {
      return this.b.a(av.d(paramw1), av.d(paramw2), this);
    }
    an localan1 = paramw1.f();
    an localan2 = paramw2.f();
    if (!this.b.a(localan1, localan2)) {
      return false;
    }
    paramw1 = paramw1.a();
    paramw2 = paramw2.a();
    if (paramw1.size() != paramw2.size()) {
      return false;
    }
    int i = 0;
    while (i < paramw1.size())
    {
      ap localap1 = (ap)paramw1.get(i);
      ap localap2 = (ap)paramw2.get(i);
      if ((!localap1.a()) || (!localap2.a()))
      {
        ar localar1 = (ar)localan1.b().get(i);
        ar localar2 = (ar)localan2.b().get(i);
        a(localap1, localap2, localar1);
        if (c(localar1, localap1) != c(localar2, localap2)) {
          return false;
        }
        if (!this.b.a(localap1.c(), localap2.c(), this)) {
          return false;
        }
      }
      i += 1;
    }
    return true;
  }
  
  public final boolean c(w paramw1, w paramw2)
  {
    for (;;)
    {
      if (am.a(paramw1, paramw2)) {
        return (!paramw1.c()) || (paramw2.c());
      }
      w localw2 = am.c(paramw1);
      w localw1 = am.d(paramw2);
      if ((localw2 == paramw1) && (localw1 == paramw2)) {
        return e(paramw1, paramw2);
      }
      paramw1 = localw2;
      paramw2 = localw1;
    }
  }
  
  public static enum a
  {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    
    public static int a(ba paramba)
    {
      switch (q.1.a[paramba.ordinal()])
      {
      default: 
        throw new IllegalStateException("Unknown variance");
      case 3: 
        return b;
      case 2: 
        return a;
      }
      return c;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */