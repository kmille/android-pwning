package b.i.b.a.c.e.b.a;

import b.a.ac;
import b.a.x;
import b.a.y;
import b.h.d;
import b.i.b.a.c.e.a.c;
import b.i.b.a.c.e.b.b.g;
import b.i.b.a.c.e.b.b.g.b;
import b.i.b.a.c.e.b.b.g.b.b;
import b.k.l;
import b.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class h
  implements c
{
  public static final a a = new a((byte)0);
  private static final List<String> f;
  private static final Map<String, Integer> g;
  private final Set<Integer> b;
  private final List<b.g.b> c;
  private final b.g d;
  private final String[] e;
  
  static
  {
    Object localObject1 = b.a.j.b(new String[] { "kotlin/Any", "kotlin/Nothing", "kotlin/Unit", "kotlin/Throwable", "kotlin/Number", "kotlin/Byte", "kotlin/Double", "kotlin/Float", "kotlin/Int", "kotlin/Long", "kotlin/Short", "kotlin/Boolean", "kotlin/Char", "kotlin/CharSequence", "kotlin/String", "kotlin/Comparable", "kotlin/Enum", "kotlin/Array", "kotlin/ByteArray", "kotlin/DoubleArray", "kotlin/FloatArray", "kotlin/IntArray", "kotlin/LongArray", "kotlin/ShortArray", "kotlin/BooleanArray", "kotlin/CharArray", "kotlin/Cloneable", "kotlin/Annotation", "kotlin/collections/Iterable", "kotlin/collections/MutableIterable", "kotlin/collections/Collection", "kotlin/collections/MutableCollection", "kotlin/collections/List", "kotlin/collections/MutableList", "kotlin/collections/Set", "kotlin/collections/MutableSet", "kotlin/collections/Map", "kotlin/collections/MutableMap", "kotlin/collections/Map.Entry", "kotlin/collections/MutableMap.MutableEntry", "kotlin/collections/Iterator", "kotlin/collections/MutableIterator", "kotlin/collections/ListIterator", "kotlin/collections/MutableListIterator" });
    f = (List)localObject1;
    Object localObject2 = b.a.j.l((Iterable)localObject1);
    localObject1 = (Map)new LinkedHashMap(d.b(ac.a(b.a.j.a((Iterable)localObject2)), 16));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      y localy = (y)((Iterator)localObject2).next();
      ((Map)localObject1).put((String)localy.b, Integer.valueOf(localy.a));
    }
    g = (Map)localObject1;
  }
  
  public h(b.g paramg, String[] paramArrayOfString)
  {
    this.d = paramg;
    this.e = paramArrayOfString;
    paramg = this.d.c;
    if (paramg.isEmpty()) {
      paramg = (Set)x.a;
    } else {
      paramg = b.a.j.k((Iterable)paramg);
    }
    this.b = paramg;
    paramg = new ArrayList();
    paramArrayOfString = this.d.b;
    paramg.ensureCapacity(paramArrayOfString.size());
    paramArrayOfString = paramArrayOfString.iterator();
    while (paramArrayOfString.hasNext())
    {
      b.g.b localb = (b.g.b)paramArrayOfString.next();
      b.f.b.j.a(localb, "record");
      int j = localb.b;
      int i = 0;
      while (i < j)
      {
        paramg.add(localb);
        i += 1;
      }
    }
    paramg.trimToSize();
    this.c = ((List)paramg);
  }
  
  public final String a(int paramInt)
  {
    Object localObject3 = (b.g.b)this.c.get(paramInt);
    int i;
    if (((b.g.b)localObject3).g())
    {
      localObject1 = ((b.g.b)localObject3).k();
    }
    else
    {
      if (((b.g.b)localObject3).d())
      {
        i = ((Collection)f).size();
        int j = ((b.g.b)localObject3).c;
        if ((j >= 0) && (i > j))
        {
          localObject1 = (String)f.get(((b.g.b)localObject3).c);
          break label100;
        }
      }
      localObject1 = this.e[paramInt];
    }
    label100:
    Object localObject2 = localObject1;
    if (((b.g.b)localObject3).m() >= 2)
    {
      localObject2 = ((b.g.b)localObject3).e;
      localObject4 = (Integer)((List)localObject2).get(0);
      Integer localInteger = (Integer)((List)localObject2).get(1);
      b.f.b.j.a(localObject4, "begin");
      localObject2 = localObject1;
      if (b.f.b.j.a(0, ((Integer)localObject4).intValue()) <= 0)
      {
        paramInt = ((Integer)localObject4).intValue();
        b.f.b.j.a(localInteger, "end");
        localObject2 = localObject1;
        if (b.f.b.j.a(paramInt, localInteger.intValue()) <= 0)
        {
          localObject2 = localObject1;
          if (b.f.b.j.a(localInteger.intValue(), ((String)localObject1).length()) <= 0)
          {
            b.f.b.j.a(localObject1, "string");
            paramInt = ((Integer)localObject4).intValue();
            i = localInteger.intValue();
            if (localObject1 != null)
            {
              localObject2 = ((String)localObject1).substring(paramInt, i);
              b.f.b.j.a(localObject2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            else
            {
              throw new r("null cannot be cast to non-null type java.lang.String");
            }
          }
        }
      }
    }
    Object localObject1 = localObject2;
    if (((b.g.b)localObject3).n() >= 2)
    {
      localObject4 = ((b.g.b)localObject3).f;
      localObject1 = (Integer)((List)localObject4).get(0);
      localObject4 = (Integer)((List)localObject4).get(1);
      b.f.b.j.a(localObject2, "string");
      localObject1 = l.a((String)localObject2, (char)((Integer)localObject1).intValue(), (char)((Integer)localObject4).intValue());
    }
    localObject3 = ((b.g.b)localObject3).d;
    localObject2 = localObject3;
    if (localObject3 == null) {
      localObject2 = b.g.b.b.a;
    }
    localObject3 = localObject1;
    Object localObject4 = localObject1;
    switch (i.a[localObject2.ordinal()])
    {
    default: 
      localObject4 = localObject1;
      break;
    case 3: 
      localObject3 = localObject1;
      if (((String)localObject1).length() >= 2)
      {
        b.f.b.j.a(localObject1, "string");
        paramInt = ((String)localObject1).length();
        if (localObject1 != null)
        {
          localObject3 = ((String)localObject1).substring(1, paramInt - 1);
          b.f.b.j.a(localObject3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        else
        {
          throw new r("null cannot be cast to non-null type java.lang.String");
        }
      }
    case 2: 
      b.f.b.j.a(localObject3, "string");
      localObject4 = l.a((String)localObject3, '$', '.');
    }
    b.f.b.j.a(localObject4, "string");
    return (String)localObject4;
  }
  
  public final String b(int paramInt)
  {
    return a(paramInt);
  }
  
  public final boolean c(int paramInt)
  {
    return this.b.contains(Integer.valueOf(paramInt));
  }
  
  public static final class a {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/b/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */