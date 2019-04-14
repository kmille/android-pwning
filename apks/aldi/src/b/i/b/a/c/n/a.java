package b.i.b.a.c.n;

import b.a.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a
{
  public static final <K, V> HashMap<K, V> a(int paramInt)
  {
    return new HashMap(c(paramInt));
  }
  
  public static final <T> List<T> a(ArrayList<T> paramArrayList)
  {
    b.f.b.j.b(paramArrayList, "receiver$0");
    switch (paramArrayList.size())
    {
    default: 
      paramArrayList.trimToSize();
      return (List)paramArrayList;
    case 1: 
      return b.a.j.a(b.a.j.c((List)paramArrayList));
    }
    return (List)v.a;
  }
  
  public static final <K> Map<K, Integer> a(Iterable<? extends K> paramIterable)
  {
    b.f.b.j.b(paramIterable, "receiver$0");
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    paramIterable = paramIterable.iterator();
    int i = 0;
    while (paramIterable.hasNext())
    {
      Object localObject = paramIterable.next();
      ((Map)localLinkedHashMap).put(localObject, Integer.valueOf(i));
      i += 1;
    }
    return (Map)localLinkedHashMap;
  }
  
  public static final <T> void a(Collection<T> paramCollection, T paramT)
  {
    b.f.b.j.b(paramCollection, "receiver$0");
    if (paramT != null) {
      paramCollection.add(paramT);
    }
  }
  
  public static final <E> HashSet<E> b(int paramInt)
  {
    return new HashSet(c(paramInt));
  }
  
  public static final int c(int paramInt)
  {
    if (paramInt < 3) {
      return 3;
    }
    return paramInt + paramInt / 3 + 1;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/n/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */