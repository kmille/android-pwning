package b.i.b.a.c.l;

import b.i.b.a.c.b.am;
import b.i.b.a.c.b.c.ah;
import b.i.b.a.c.b.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class k
{
  public static au a(List<b.i.b.a.c.b.ar> paramList1, as paramas, l paraml, List<b.i.b.a.c.b.ar> paramList2)
  {
    paramList1 = a(paramList1, paramas, paraml, paramList2, null);
    if (paramList1 != null) {
      return paramList1;
    }
    throw new AssertionError("Substitution failed");
  }
  
  public static au a(List<b.i.b.a.c.b.ar> paramList1, as paramas, l paraml, List<b.i.b.a.c.b.ar> paramList2, boolean[] paramArrayOfBoolean)
  {
    Object localObject1 = new HashMap();
    HashMap localHashMap = new HashMap();
    Object localObject2 = paramList1.iterator();
    int i = 0;
    while (((Iterator)localObject2).hasNext())
    {
      b.i.b.a.c.b.ar localar = (b.i.b.a.c.b.ar)((Iterator)localObject2).next();
      ah localah = ah.a(paraml, localar.r(), localar.l(), localar.k(), localar.i(), i, am.b);
      ((Map)localObject1).put(localar.c(), new ar(localah.h()));
      localHashMap.put(localar, localah);
      paramList2.add(localah);
      i += 1;
    }
    paramas = au.a(paramas, ao.a((Map)localObject1));
    paramList1 = paramList1.iterator();
    while (paramList1.hasNext())
    {
      paramList2 = (b.i.b.a.c.b.ar)paramList1.next();
      paraml = (ah)localHashMap.get(paramList2);
      paramList2 = paramList2.j().iterator();
      while (paramList2.hasNext())
      {
        localObject1 = (w)paramList2.next();
        localObject2 = paramas.b((w)localObject1, ba.b);
        if (localObject2 == null) {
          return null;
        }
        if ((localObject2 != localObject1) && (paramArrayOfBoolean != null)) {
          paramArrayOfBoolean[0] = true;
        }
        paraml.b((w)localObject2);
      }
      paraml.o();
    }
    return paramas;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */