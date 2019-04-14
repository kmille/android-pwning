package b.i.b.a.c.i;

import b.f.a.b;
import b.i.b.a.c.b.a;
import b.i.b.a.c.n.i;
import b.i.b.a.c.n.i.b;
import b.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
{
  public static final <H> Collection<H> a(Collection<? extends H> paramCollection, b<? super H, ? extends a> paramb)
  {
    b.f.b.j.b(paramCollection, "receiver$0");
    b.f.b.j.b(paramb, "descriptorByHandle");
    if (paramCollection.size() <= 1) {
      return paramCollection;
    }
    paramCollection = new LinkedList(paramCollection);
    Object localObject1 = i.a;
    localObject1 = i.b.a();
    for (;;)
    {
      Object localObject3 = (Collection)paramCollection;
      if (!(((Collection)localObject3).isEmpty() ^ true)) {
        break;
      }
      Object localObject4 = b.a.j.c((List)paramCollection);
      Object localObject2 = i.a;
      localObject2 = i.b.a();
      Object localObject5 = j.a(localObject4, (Collection)localObject3, paramb, (b)new b((i)localObject2));
      b.f.b.j.a(localObject5, "OverridingUtil.extractMe…nflictedHandles.add(it) }");
      if ((((Collection)localObject5).size() == 1) && (((i)localObject2).isEmpty()))
      {
        localObject2 = b.a.j.e((Iterable)localObject5);
        b.f.b.j.a(localObject2, "overridableGroup.single()");
        ((i)localObject1).add(localObject2);
      }
      else
      {
        localObject3 = j.a((Collection)localObject5, paramb);
        b.f.b.j.a(localObject3, "OverridingUtil.selectMos…roup, descriptorByHandle)");
        localObject4 = (a)paramb.a(localObject3);
        localObject5 = ((Iterable)localObject5).iterator();
        while (((Iterator)localObject5).hasNext())
        {
          Object localObject6 = ((Iterator)localObject5).next();
          b.f.b.j.a(localObject6, "it");
          if (!j.a((a)localObject4, (a)paramb.a(localObject6))) {
            ((Collection)localObject2).add(localObject6);
          }
        }
        localObject2 = (Collection)localObject2;
        if ((((Collection)localObject2).isEmpty() ^ true)) {
          ((i)localObject1).addAll((Collection)localObject2);
        }
        ((i)localObject1).add(localObject3);
      }
    }
    return (Collection)localObject1;
  }
  
  public static final class a
    extends b.f.b.k
    implements b<D, D>
  {
    public static final a a = new a();
    
    a()
    {
      super();
    }
  }
  
  static final class b
    extends b.f.b.k
    implements b<H, u>
  {
    b(i parami)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */