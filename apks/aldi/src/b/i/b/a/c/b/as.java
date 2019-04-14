package b.i.b.a.c.b;

import b.a.v;
import b.f.a.b;
import b.f.b.k;
import b.i.b.a.c.i.d;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.p;
import b.j.h;
import b.j.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class as
{
  public static final af a(b.i.b.a.c.l.w paramw, i parami, int paramInt)
  {
    Object localObject = null;
    if (parami != null)
    {
      l locall = (l)parami;
      if (p.a(locall)) {
        return null;
      }
      int j = parami.u().size() + paramInt;
      if (!parami.l())
      {
        int i;
        if ((j != paramw.a().size()) && (!d.b(locall))) {
          i = 0;
        } else {
          i = 1;
        }
        if ((b.w.a) && (i == 0))
        {
          parami = new StringBuilder();
          parami.append(paramw.a().size() - j);
          parami.append(" trailing arguments were found in ");
          parami.append(paramw);
          parami.append(" type");
          throw ((Throwable)new AssertionError(parami.toString()));
        }
        return new af(parami, paramw.a().subList(paramInt, paramw.a().size()), null);
      }
      List localList = paramw.a().subList(paramInt, j);
      locall = parami.a();
      if ((locall instanceof i)) {
        localObject = locall;
      }
      return new af(parami, localList, a(paramw, (i)localObject, j));
    }
    return null;
  }
  
  public static final List<ar> a(i parami)
  {
    b.f.b.j.b(parami, "receiver$0");
    List localList1 = parami.u();
    b.f.b.j.a(localList1, "declaredTypeParameters");
    if ((!parami.l()) && (!(parami.a() instanceof a))) {
      return localList1;
    }
    l locall = (l)parami;
    Object localObject1 = b.i.b.a.c.i.c.a.e(locall);
    Object localObject2 = (b)a.a;
    b.f.b.j.b(localObject1, "receiver$0");
    b.f.b.j.b(localObject2, "predicate");
    List localList2 = b.j.i.c(b.j.i.c((h)new o((h)localObject1, (b)localObject2), (b)b.a));
    Object localObject3 = b.i.b.a.c.i.c.a.e(locall).a();
    do
    {
      boolean bool = ((Iterator)localObject3).hasNext();
      localObject2 = null;
      if (!bool) {
        break;
      }
      localObject1 = ((Iterator)localObject3).next();
    } while (!(localObject1 instanceof e));
    break label148;
    localObject1 = null;
    label148:
    localObject3 = (e)localObject1;
    localObject1 = localObject2;
    if (localObject3 != null)
    {
      localObject3 = ((e)localObject3).c();
      localObject1 = localObject2;
      if (localObject3 != null) {
        localObject1 = ((an)localObject3).b();
      }
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = (List)v.a;
    }
    if ((localList2.isEmpty()) && (((List)localObject2).isEmpty()))
    {
      parami = parami.u();
      b.f.b.j.a(parami, "declaredTypeParameters");
      return parami;
    }
    localObject1 = (Iterable)b.a.j.b((Collection)localList2, (Iterable)localObject2);
    parami = (Collection)new ArrayList(b.a.j.a((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (ar)((Iterator)localObject1).next();
      b.f.b.j.a(localObject2, "it");
      parami.add(new c((ar)localObject2, locall, localList1.size()));
    }
    parami = (List)parami;
    return b.a.j.b((Collection)localList1, (Iterable)parami);
  }
  
  static final class a
    extends k
    implements b<l, Boolean>
  {
    public static final a a = new a();
    
    a()
    {
      super();
    }
  }
  
  static final class b
    extends k
    implements b<l, h<? extends ar>>
  {
    public static final b a = new b();
    
    b()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */