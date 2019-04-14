package com.google.common.collect;

import com.google.common.base.g;
import com.google.common.base.j;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.Nullable;

public final class p
{
  @Nullable
  static <K> K a(@Nullable Map.Entry<K, ?> paramEntry)
  {
    if (paramEntry == null) {
      return null;
    }
    return (K)paramEntry.getKey();
  }
  
  static <V> V a(Map<?, V> paramMap, @Nullable Object paramObject)
  {
    j.a(paramMap);
    try
    {
      paramMap = paramMap.get(paramObject);
      return paramMap;
    }
    catch (ClassCastException|NullPointerException paramMap) {}
    return null;
  }
  
  static abstract enum a
    implements com.google.common.base.e<Map.Entry<?, ?>, Object>
  {
    private a() {}
  }
  
  static abstract class b<K, V>
    extends y.a<Map.Entry<K, V>>
  {
    abstract Map<K, V> a();
    
    public void clear()
    {
      a().clear();
    }
    
    public boolean contains(Object paramObject)
    {
      if ((paramObject instanceof Map.Entry))
      {
        paramObject = (Map.Entry)paramObject;
        Object localObject1 = ((Map.Entry)paramObject).getKey();
        Object localObject2 = p.a(a(), localObject1);
        if ((g.a(localObject2, ((Map.Entry)paramObject).getValue())) && ((localObject2 != null) || (a().containsKey(localObject1)))) {
          return true;
        }
      }
      return false;
    }
    
    public boolean isEmpty()
    {
      return a().isEmpty();
    }
    
    public boolean remove(Object paramObject)
    {
      if (contains(paramObject))
      {
        paramObject = (Map.Entry)paramObject;
        return a().keySet().remove(((Map.Entry)paramObject).getKey());
      }
      return false;
    }
    
    public boolean removeAll(Collection<?> paramCollection)
    {
      try
      {
        boolean bool = super.removeAll((Collection)j.a(paramCollection));
        return bool;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        for (;;) {}
      }
      return y.a(this, paramCollection.iterator());
    }
    
    public boolean retainAll(Collection<?> paramCollection)
    {
      try
      {
        boolean bool = super.retainAll((Collection)j.a(paramCollection));
        return bool;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        int i;
        HashSet localHashSet;
        for (;;) {}
      }
      i = paramCollection.size();
      if (i < 3)
      {
        e.a(i, "expectedSize");
        i += 1;
      }
      else if (i < 1073741824)
      {
        i = (int)(i / 0.75F + 1.0F);
      }
      else
      {
        i = Integer.MAX_VALUE;
      }
      localHashSet = new HashSet(i);
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        Object localObject = paramCollection.next();
        if (contains(localObject)) {
          localHashSet.add(((Map.Entry)localObject).getKey());
        }
      }
      return a().keySet().retainAll(localHashSet);
    }
    
    public int size()
    {
      return a().size();
    }
  }
  
  static abstract class c<K, V>
    extends AbstractMap<K, V>
  {
    abstract Iterator<Map.Entry<K, V>> c();
    
    public void clear()
    {
      Iterator localIterator = c();
      j.a(localIterator);
      while (localIterator.hasNext())
      {
        localIterator.next();
        localIterator.remove();
      }
    }
    
    public Set<Map.Entry<K, V>> entrySet()
    {
      new p.b()
      {
        final Map<K, V> a()
        {
          return p.c.this;
        }
        
        public final Iterator<Map.Entry<K, V>> iterator()
        {
          return p.c.this.c();
        }
      };
    }
  }
  
  static class d<K, V>
    extends y.a<K>
  {
    final Map<K, V> b;
    
    d(Map<K, V> paramMap)
    {
      this.b = ((Map)j.a(paramMap));
    }
    
    public void clear()
    {
      this.b.clear();
    }
    
    public boolean contains(Object paramObject)
    {
      return this.b.containsKey(paramObject);
    }
    
    public boolean isEmpty()
    {
      return this.b.isEmpty();
    }
    
    public Iterator<K> iterator()
    {
      Iterator localIterator = this.b.entrySet().iterator();
      p.a locala = p.a.a;
      j.a(locala);
      return new o.1(localIterator, locala);
    }
    
    public boolean remove(Object paramObject)
    {
      if (contains(paramObject))
      {
        this.b.remove(paramObject);
        return true;
      }
      return false;
    }
    
    public int size()
    {
      return this.b.size();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */