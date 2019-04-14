package b.i.b.a.c.l.a;

import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.az;
import b.i.b.a.c.l.n;
import b.i.b.a.c.l.p;
import b.i.b.a.c.l.q;
import b.i.b.a.c.l.t;
import b.i.b.a.c.l.w;
import b.i.b.a.c.l.x;
import b.i.b.a.c.l.y;
import b.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class b
{
  public static final az a(List<? extends az> paramList)
  {
    b.f.b.j.b(paramList, "types");
    Collection localCollection;
    Iterator localIterator;
    int i;
    int j;
    switch (paramList.size())
    {
    default: 
      localObject2 = (Iterable)paramList;
      localCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
      localIterator = ((Iterable)localObject2).iterator();
      i = 0;
      j = 0;
      break;
    case 1: 
      return (az)b.a.j.g(paramList);
    case 0: 
      throw ((Throwable)new IllegalStateException("Expected some types".toString()));
    }
    while (localIterator.hasNext())
    {
      localObject1 = (az)localIterator.next();
      if ((i == 0) && (!y.b((w)localObject1))) {
        i = 0;
      } else {
        i = 1;
      }
      if ((localObject1 instanceof ad))
      {
        localObject1 = (ad)localObject1;
      }
      else
      {
        if (!(localObject1 instanceof q)) {
          break label200;
        }
        if (n.a((w)localObject1)) {
          return (az)localObject1;
        }
        localObject1 = ((q)localObject1).a;
        j = 1;
      }
      localCollection.add(localObject1);
      continue;
      label200:
      throw new k();
    }
    Object localObject1 = (List)localCollection;
    if (i != 0)
    {
      paramList = p.c("Intersection of error types: ".concat(String.valueOf(paramList)));
      b.f.b.j.a(paramList, "ErrorUtils.createErrorTy… of error types: $types\")");
      return (az)paramList;
    }
    if (j == 0)
    {
      paramList = s.a;
      return (az)s.a((List)localObject1);
    }
    paramList = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    Object localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      paramList.add(t.d((w)((Iterator)localObject2).next()));
    }
    paramList = (List)paramList;
    localObject2 = s.a;
    localObject1 = s.a((List)localObject1);
    localObject2 = s.a;
    return x.a((ad)localObject1, s.a(paramList));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */