package b.i.b.a.c.d.a;

import b.f.b.j;
import b.i.b.a.c.a.g;
import b.i.b.a.c.a.g.a;
import b.i.b.a.c.f.b;
import b.m;
import b.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class i
{
  public static final i a = new i();
  private static final HashMap<b, b> b = new HashMap();
  
  static
  {
    b localb = g.k.X;
    j.a(localb, "FQ_NAMES.mutableList");
    a(localb, a(new String[] { "java.util.ArrayList", "java.util.LinkedList" }));
    localb = g.k.Z;
    j.a(localb, "FQ_NAMES.mutableSet");
    a(localb, a(new String[] { "java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet" }));
    localb = g.k.aa;
    j.a(localb, "FQ_NAMES.mutableMap");
    a(localb, a(new String[] { "java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap" }));
    a(new b("java.util.function.Function"), a(new String[] { "java.util.function.UnaryOperator" }));
    a(new b("java.util.function.BiFunction"), a(new String[] { "java.util.function.BinaryOperator" }));
  }
  
  public static b a(b paramb)
  {
    j.b(paramb, "classFqName");
    return (b)b.get(paramb);
  }
  
  private static List<b> a(String... paramVarArgs)
  {
    Collection localCollection = (Collection)new ArrayList(paramVarArgs.length);
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      localCollection.add(new b(paramVarArgs[i]));
      i += 1;
    }
    return (List)localCollection;
  }
  
  private static void a(b paramb, List<b> paramList)
  {
    Object localObject = (Iterable)paramList;
    paramList = (Map)b;
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      m localm = q.a((b)((Iterator)localObject).next(), paramb);
      paramList.put(localm.a, localm.b);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */