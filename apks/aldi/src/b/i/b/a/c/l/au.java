package b.i.b.a.c.l;

import b.i.b.a.c.a.g.a;
import b.i.b.a.c.b.a.k;
import b.i.b.a.c.l.c.a;
import java.util.ArrayList;
import java.util.List;

public class au
{
  public static final au a = a(as.d);
  public final as b;
  
  private au(as paramas)
  {
    this.b = paramas;
  }
  
  private static b.i.b.a.c.b.a.g a(b.i.b.a.c.b.a.g paramg)
  {
    if (!paramg.b(b.i.b.a.c.a.g.k.K)) {
      return paramg;
    }
    new b.i.b.a.c.b.a.l(paramg, new b.f.a.b() {});
  }
  
  private ap a(ap paramap, int paramInt)
    throws au.a
  {
    a(paramInt, paramap, this.b);
    if (paramap.a()) {
      return paramap;
    }
    Object localObject4 = paramap.c();
    Object localObject2;
    if ((localObject4 instanceof aw))
    {
      localObject2 = (aw)localObject4;
      localObject1 = ((aw)localObject2).g();
      localObject2 = ((aw)localObject2).h();
      localObject1 = a(new ar(paramap.b(), (w)localObject1), paramInt + 1);
      paramap = b((w)localObject2, paramap.b());
      paramap = ax.b(((ap)localObject1).c().i(), paramap);
      return new ar(((ap)localObject1).b(), paramap);
    }
    Object localObject1 = paramap;
    if (!n.a((w)localObject4))
    {
      if ((((w)localObject4).i() instanceof ac)) {
        return paramap;
      }
      Object localObject3 = this.b.a((w)localObject4);
      localObject2 = paramap.b();
      if ((localObject3 == null) && (t.a((w)localObject4)) && (!am.a((w)localObject4)))
      {
        localObject1 = t.b((w)localObject4);
        localObject3 = new ar((ba)localObject2, ((q)localObject1).a);
        paramInt += 1;
        localObject4 = a((ap)localObject3, paramInt);
        ap localap = a(new ar((ba)localObject2, ((q)localObject1).b), paramInt);
        localObject3 = ((ap)localObject4).b();
        if ((!c) && ((localObject3 != localap.b()) || (localObject2 != ba.a)) && (localObject2 != localObject3))
        {
          paramap = new StringBuilder("Unexpected substituted projection kind: ");
          paramap.append(localObject3);
          paramap.append("; original: ");
          paramap.append(localObject2);
          throw new AssertionError(paramap.toString());
        }
        if ((((ap)localObject4).c() == ((q)localObject1).a) && (localap.c() == ((q)localObject1).b)) {
          return paramap;
        }
        return new ar((ba)localObject3, x.a(at.a(((ap)localObject4).c()), at.a(localap.c())));
      }
      localObject1 = paramap;
      if (!b.i.b.a.c.a.g.n((w)localObject4))
      {
        if (y.b((w)localObject4)) {
          return paramap;
        }
        if (localObject3 != null)
        {
          paramInt = b((ba)localObject2, ((ap)localObject3).b());
          if (!b.i.b.a.c.i.a.a.c.a((w)localObject4)) {
            switch (2.a[(paramInt - 1)])
            {
            default: 
              break;
            case 2: 
              return new ar(ba.c, ((w)localObject4).f().d().h());
            case 1: 
              throw new a("Out-projection in in-position");
            }
          }
          paramap = am.b((w)localObject4);
          if (((ap)localObject3).a()) {
            return (ap)localObject3;
          }
          if (paramap != null) {
            paramap = paramap.a_(((ap)localObject3).c());
          } else {
            paramap = av.b(((ap)localObject3).c(), ((w)localObject4).c());
          }
          localObject1 = paramap;
          if (!((w)localObject4).r().a())
          {
            localObject1 = a(this.b.a(((w)localObject4).r()));
            localObject1 = a.a(paramap, new k(new b.i.b.a.c.b.a.g[] { paramap.r(), localObject1 }));
          }
          paramap = (ap)localObject2;
          if (paramInt == b.a) {
            paramap = a((ba)localObject2, ((ap)localObject3).b());
          }
          return new ar(paramap, (w)localObject1);
        }
        localObject1 = b(paramap, paramInt);
      }
    }
    return (ap)localObject1;
  }
  
  public static au a(as paramas)
  {
    return new au(paramas);
  }
  
  public static au a(as paramas1, as paramas2)
  {
    return a(l.a(paramas1, paramas2));
  }
  
  public static au a(w paramw)
  {
    return a(ao.a(paramw.f(), paramw.a()));
  }
  
  public static ba a(ba paramba, ap paramap)
  {
    if (paramap.a()) {
      return ba.c;
    }
    return a(paramba, paramap.b());
  }
  
  private static ba a(ba paramba1, ba paramba2)
  {
    if (paramba1 == ba.a) {
      return paramba2;
    }
    if (paramba2 == ba.a) {
      return paramba1;
    }
    if (paramba1 == paramba2) {
      return paramba2;
    }
    StringBuilder localStringBuilder = new StringBuilder("Variance conflict: type parameter variance '");
    localStringBuilder.append(paramba1);
    localStringBuilder.append("' and projection kind '");
    localStringBuilder.append(paramba2);
    localStringBuilder.append("' cannot be combined");
    throw new AssertionError(localStringBuilder.toString());
  }
  
  private static String a(Object paramObject)
  {
    try
    {
      paramObject = paramObject.toString();
      return (String)paramObject;
    }
    catch (Throwable paramObject)
    {
      if (!b.i.b.a.c.n.c.a((Throwable)paramObject))
      {
        StringBuilder localStringBuilder = new StringBuilder("[Exception while computing toString(): ");
        localStringBuilder.append(paramObject);
        localStringBuilder.append("]");
        return localStringBuilder.toString();
      }
      throw ((RuntimeException)paramObject);
    }
  }
  
  private List<ap> a(List<b.i.b.a.c.b.ar> paramList, List<ap> paramList1, int paramInt)
    throws au.a
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    int i = 0;
    int j = 0;
    while (i < paramList.size())
    {
      b.i.b.a.c.b.ar localar = (b.i.b.a.c.b.ar)paramList.get(i);
      ap localap2 = (ap)paramList1.get(i);
      ap localap1 = a(localap2, paramInt + 1);
      Object localObject;
      switch (2.a[(b(localar.k(), localap1.b()) - 1)])
      {
      default: 
        localObject = localap1;
        break;
      case 3: 
        localObject = localap1;
        if (localar.k() != ba.a)
        {
          localObject = localap1;
          if (!localap1.a()) {
            localObject = new ar(ba.a, localap1.c());
          }
        }
        break;
      case 1: 
      case 2: 
        localObject = av.a(localar);
      }
      if (localObject != localap2) {
        j = 1;
      }
      localArrayList.add(localObject);
      i += 1;
    }
    if (j == 0) {
      return paramList1;
    }
    return localArrayList;
  }
  
  private static void a(int paramInt, ap paramap, as paramas)
  {
    if (paramInt <= 100) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("Recursion too deep. Most likely infinite loop while substituting ");
    localStringBuilder.append(a(paramap));
    localStringBuilder.append("; substitution: ");
    localStringBuilder.append(a(paramas));
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private static int b(ba paramba1, ba paramba2)
  {
    if ((paramba1 == ba.b) && (paramba2 == ba.c)) {
      return b.c;
    }
    if ((paramba1 == ba.c) && (paramba2 == ba.b)) {
      return b.b;
    }
    return b.a;
  }
  
  private ap b(ap paramap)
  {
    paramap = a(paramap);
    if ((!this.b.c()) && (!this.b.b())) {
      return paramap;
    }
    return b.i.b.a.c.l.d.b.a(paramap, this.b.b());
  }
  
  private ap b(ap paramap, int paramInt)
    throws au.a
  {
    Object localObject1 = paramap.c();
    ba localba = paramap.b();
    if ((((w)localObject1).f().c() instanceof b.i.b.a.c.b.ar)) {
      return paramap;
    }
    paramap = null;
    Object localObject2 = ag.a((w)localObject1);
    if (localObject2 != null) {
      paramap = b((w)localObject2, ba.a);
    }
    localObject2 = at.a((w)localObject1, a(((w)localObject1).f().b(), ((w)localObject1).a(), paramInt), this.b.a(((w)localObject1).r()));
    localObject1 = localObject2;
    if ((localObject2 instanceof ad))
    {
      localObject1 = localObject2;
      if ((paramap instanceof ad)) {
        localObject1 = ag.a((ad)localObject2, (ad)paramap);
      }
    }
    return new ar(localba, (w)localObject1);
  }
  
  public final ap a(ap paramap)
  {
    if (this.b.a()) {
      return paramap;
    }
    try
    {
      paramap = a(paramap, 0);
      return paramap;
    }
    catch (a paramap)
    {
      for (;;) {}
    }
    return null;
  }
  
  public final w a(w paramw, ba paramba)
  {
    if (this.b.a()) {
      return paramw;
    }
    try
    {
      paramw = a(new ar(paramba, paramw), 0).c();
      return paramw;
    }
    catch (a paramw) {}
    return p.c(paramw.getMessage());
  }
  
  public final w b(w paramw, ba paramba)
  {
    paramw = b(new ar(paramba, this.b.a(paramw, paramba)));
    if (paramw == null) {
      return null;
    }
    return paramw.c();
  }
  
  static final class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
  
  static enum b
  {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    
    public static int[] a()
    {
      return (int[])d.clone();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */