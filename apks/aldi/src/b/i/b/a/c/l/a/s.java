package b.i.b.a.c.l.a;

import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.az;
import b.i.b.a.c.l.t;
import b.i.b.a.c.l.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class s
{
  public static final s a = new s();
  
  public static ad a(List<? extends ad> paramList)
  {
    b.f.b.j.b(paramList, "types");
    int i;
    if (paramList.size() > 1) {
      i = 1;
    } else {
      i = 0;
    }
    if ((b.w.a) && (i == 0))
    {
      localObject1 = new StringBuilder("Size should be at least 2, but it is ");
      ((StringBuilder)localObject1).append(paramList.size());
      throw ((Throwable)new AssertionError(((StringBuilder)localObject1).toString()));
    }
    Object localObject2 = new ArrayList();
    Object localObject3 = paramList.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (ad)((Iterator)localObject3).next();
      if ((((ad)localObject4).f() instanceof b.i.b.a.c.l.v))
      {
        paramList = ((ad)localObject4).f().i_();
        b.f.b.j.a(paramList, "type.constructor.supertypes");
        paramList = (Iterable)paramList;
        Collection localCollection = (Collection)new ArrayList(b.a.j.a(paramList));
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          paramList = (b.i.b.a.c.l.w)localIterator.next();
          b.f.b.j.a(paramList, "it");
          localObject1 = t.d(paramList);
          paramList = (List<? extends ad>)localObject1;
          if (((ad)localObject4).c()) {
            paramList = ((ad)localObject1).b(true);
          }
          localCollection.add(paramList);
        }
        ((ArrayList)localObject2).addAll((Collection)localCollection);
      }
      else
      {
        ((ArrayList)localObject2).add(localObject4);
      }
    }
    paramList = (Iterable)localObject2;
    Object localObject1 = a.a;
    localObject2 = paramList.iterator();
    while (((Iterator)localObject2).hasNext()) {
      localObject1 = ((a)localObject1).a((az)((Iterator)localObject2).next());
    }
    localObject3 = (Collection)new LinkedHashSet();
    Object localObject4 = paramList.iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject2 = (ad)((Iterator)localObject4).next();
      paramList = (List<? extends ad>)localObject2;
      if (localObject1 == a.d)
      {
        b.f.b.j.b(localObject2, "receiver$0");
        paramList = b.i.b.a.c.l.g.b;
        paramList = b.i.b.a.c.l.g.a.a((az)localObject2);
        if (paramList != null) {
          paramList = (ad)paramList;
        } else {
          paramList = ((ad)localObject2).b(false);
        }
      }
      ((Collection)localObject3).add(paramList);
    }
    return a((Set)localObject3);
  }
  
  private static ad a(Set<? extends ad> paramSet)
  {
    if (paramSet.size() == 1) {
      return (ad)b.a.j.e((Iterable)paramSet);
    }
    Object localObject2 = (Collection)paramSet;
    Object localObject1 = new ArrayList((Collection)localObject2);
    Object localObject3 = ((ArrayList)localObject1).iterator();
    b.f.b.j.a(localObject3, "filteredSuperAndEqualTypes.iterator()");
    for (;;)
    {
      bool = ((Iterator)localObject3).hasNext();
      int j = 0;
      if (!bool) {
        break;
      }
      ad localad = (ad)((Iterator)localObject3).next();
      Object localObject4 = (Iterable)localObject1;
      int i = j;
      if (!((Collection)localObject4).isEmpty())
      {
        localObject4 = ((Iterable)localObject4).iterator();
        do
        {
          i = j;
          if (!((Iterator)localObject4).hasNext()) {
            break;
          }
          Object localObject5 = (ad)((Iterator)localObject4).next();
          if (localObject5 != localad)
          {
            b.f.b.j.a(localObject5, "lower");
            localObject5 = (b.i.b.a.c.l.w)localObject5;
            b.f.b.j.a(localad, "upper");
            b.i.b.a.c.l.w localw = (b.i.b.a.c.l.w)localad;
            h localh = h.b;
            if ((localh.a((b.i.b.a.c.l.w)localObject5, localw)) && (!localh.a(localw, (b.i.b.a.c.l.w)localObject5))) {
              i = 1;
            } else {
              i = 0;
            }
            if ((i != 0) || (h.b.b((b.i.b.a.c.l.w)localObject5, localw)))
            {
              i = 1;
              continue;
            }
          }
          i = 0;
        } while (i == 0);
        i = 1;
      }
      if (i != 0) {
        ((Iterator)localObject3).remove();
      }
    }
    boolean bool = ((Collection)localObject1).isEmpty();
    if ((b.w.a) && (!(true ^ bool)))
    {
      localObject1 = new StringBuilder("This collections cannot be empty! input types: ");
      ((StringBuilder)localObject1).append(b.a.j.a((Iterable)paramSet, null, null, null, 0, null, null, 63));
      throw ((Throwable)new AssertionError(((StringBuilder)localObject1).toString()));
    }
    if (((ArrayList)localObject1).size() < 2)
    {
      paramSet = b.a.j.g((List)localObject1);
      b.f.b.j.a(paramSet, "filteredSuperAndEqualTypes.single()");
      return (ad)paramSet;
    }
    paramSet = new b.i.b.a.c.l.v((Collection)localObject2);
    localObject1 = b.i.b.a.c.b.a.g.a;
    localObject1 = b.i.b.a.c.b.a.g.a.a();
    localObject2 = (an)paramSet;
    localObject3 = (List)b.a.v.a;
    paramSet = paramSet.f();
    b.f.b.j.a(paramSet, "constructor.createScopeForKotlinType()");
    return x.a((b.i.b.a.c.b.a.g)localObject1, (an)localObject2, (List)localObject3, false, paramSet);
  }
  
  static abstract enum a
  {
    static
    {
      c localc = new c("START");
      a = localc;
      a locala = new a("ACCEPT_NULL");
      b = locala;
      d locald = new d("UNKNOWN");
      c = locald;
      b localb = new b("NOT_NULL");
      d = localb;
      e = new a[] { localc, locala, locald, localb };
    }
    
    protected a() {}
    
    protected static a b(az paramaz)
    {
      b.f.b.j.b(paramaz, "receiver$0");
      if (paramaz.c()) {
        return b;
      }
      l locall = l.a;
      if (l.a(paramaz)) {
        return d;
      }
      return c;
    }
    
    public abstract a a(az paramaz);
    
    public static final class a
      extends s.a
    {
      a()
      {
        super(1);
      }
      
      public final s.a a(az paramaz)
      {
        b.f.b.j.b(paramaz, "nextType");
        return b(paramaz);
      }
    }
    
    public static final class b
      extends s.a
    {
      b()
      {
        super(3);
      }
    }
    
    public static final class c
      extends s.a
    {
      c()
      {
        super(0);
      }
      
      public final s.a a(az paramaz)
      {
        b.f.b.j.b(paramaz, "nextType");
        return b(paramaz);
      }
    }
    
    public static final class d
      extends s.a
    {
      d()
      {
        super(2);
      }
      
      public final s.a a(az paramaz)
      {
        b.f.b.j.b(paramaz, "nextType");
        s.a locala = b(paramaz);
        paramaz = locala;
        if (locala == s.a.b) {
          paramaz = (s.a)this;
        }
        return paramaz;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/a/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */