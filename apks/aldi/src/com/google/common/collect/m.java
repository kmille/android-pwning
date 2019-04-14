package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class m<K, V>
  implements Serializable, Map<K, V>
{
  static final Map.Entry<?, ?>[] a = new Map.Entry[0];
  private transient n<Map.Entry<K, V>> b;
  private transient n<K> c;
  private transient j<V> d;
  
  public static <K, V> m<K, V> a()
  {
    return w.b;
  }
  
  public static <K, V> m<K, V> a(K paramK, V paramV)
  {
    e.a(paramK, paramV);
    return w.a(1, new Object[] { paramK, paramV });
  }
  
  public static <K, V> m<K, V> a(K paramK1, V paramV1, K paramK2, V paramV2)
  {
    e.a(paramK1, paramV1);
    e.a(paramK2, paramV2);
    return w.a(2, new Object[] { paramK1, paramV1, paramK2, paramV2 });
  }
  
  public static <K, V> m<K, V> a(K paramK1, V paramV1, K paramK2, V paramV2, K paramK3, V paramV3)
  {
    e.a(paramK1, paramV1);
    e.a(paramK2, paramV2);
    e.a(paramK3, paramV3);
    return w.a(3, new Object[] { paramK1, paramV1, paramK2, paramV2, paramK3, paramV3 });
  }
  
  public static <K, V> m<K, V> a(K paramK1, V paramV1, K paramK2, V paramV2, K paramK3, V paramV3, K paramK4, V paramV4)
  {
    e.a(paramK1, paramV1);
    e.a(paramK2, paramV2);
    e.a(paramK3, paramV3);
    e.a(paramK4, paramV4);
    return w.a(4, new Object[] { paramK1, paramV1, paramK2, paramV2, paramK3, paramV3, paramK4, paramV4 });
  }
  
  public static <K, V> m<K, V> a(K paramK1, V paramV1, K paramK2, V paramV2, K paramK3, V paramV3, K paramK4, V paramV4, K paramK5, V paramV5)
  {
    e.a(paramK1, paramV1);
    e.a(paramK2, paramV2);
    e.a(paramK3, paramV3);
    e.a(paramK4, paramV4);
    e.a(paramK5, paramV5);
    return w.a(5, new Object[] { paramK1, paramV1, paramK2, paramV2, paramK3, paramV3, paramK4, paramV4, paramK5, paramV5 });
  }
  
  public static <K, V> a<K, V> b()
  {
    return new a();
  }
  
  private n<Map.Entry<K, V>> f()
  {
    n localn2 = this.b;
    n localn1 = localn2;
    if (localn2 == null)
    {
      localn1 = c();
      this.b = localn1;
    }
    return localn1;
  }
  
  private j<V> g()
  {
    j localj2 = this.d;
    j localj1 = localj2;
    if (localj2 == null)
    {
      localj1 = e();
      this.d = localj1;
    }
    return localj1;
  }
  
  abstract n<Map.Entry<K, V>> c();
  
  @Deprecated
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean containsKey(@Nullable Object paramObject)
  {
    return get(paramObject) != null;
  }
  
  public boolean containsValue(@Nullable Object paramObject)
  {
    return g().contains(paramObject);
  }
  
  abstract n<K> d();
  
  abstract j<V> e();
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = (Map)paramObject;
      return entrySet().equals(((Map)paramObject).entrySet());
    }
    return false;
  }
  
  public abstract V get(@Nullable Object paramObject);
  
  public int hashCode()
  {
    return y.a(f());
  }
  
  public boolean isEmpty()
  {
    return size() == 0;
  }
  
  @Deprecated
  public final V put(K paramK, V paramV)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final V remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public String toString()
  {
    int i = size();
    e.a(i, "size");
    StringBuilder localStringBuilder = new StringBuilder((int)Math.min(i * 8L, 1073741824L));
    localStringBuilder.append('{');
    Iterator localIterator = entrySet().iterator();
    i = 1;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (i == 0) {
        localStringBuilder.append(", ");
      }
      i = 0;
      localStringBuilder.append(localEntry.getKey());
      localStringBuilder.append('=');
      localStringBuilder.append(localEntry.getValue());
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static final class a<K, V>
  {
    Comparator<? super V> a;
    Object[] b = new Object[8];
    int c = 0;
    boolean d = false;
    
    public a()
    {
      this((byte)0);
    }
    
    private a(byte paramByte) {}
    
    private void a(int paramInt)
    {
      int j = paramInt * 2;
      if (j > this.b.length)
      {
        Object[] arrayOfObject = this.b;
        paramInt = this.b.length;
        if (j >= 0)
        {
          int i = paramInt + (paramInt >> 1) + 1;
          paramInt = i;
          if (i < j) {
            paramInt = Integer.highestOneBit(j - 1) << 1;
          }
          i = paramInt;
          if (paramInt < 0) {
            i = Integer.MAX_VALUE;
          }
          this.b = Arrays.copyOf(arrayOfObject, i);
          this.d = false;
          return;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
      }
    }
    
    public final a<K, V> a(K paramK, V paramV)
    {
      a(this.c + 1);
      e.a(paramK, paramV);
      this.b[(this.c * 2)] = paramK;
      this.b[(this.c * 2 + 1)] = paramV;
      this.c += 1;
      return this;
    }
    
    public final a<K, V> a(Map<? extends K, ? extends V> paramMap)
    {
      paramMap = paramMap.entrySet();
      if ((paramMap instanceof Collection)) {
        a(this.c + ((Collection)paramMap).size());
      }
      paramMap = paramMap.iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        a(localEntry.getKey(), localEntry.getValue());
      }
      return this;
    }
    
    public final m<K, V> a()
    {
      if (this.a != null)
      {
        if (this.d) {
          this.b = Arrays.copyOf(this.b, this.c * 2);
        }
        Map.Entry[] arrayOfEntry = new Map.Entry[this.c];
        int j = 0;
        int i = 0;
        while (i < this.c)
        {
          localObject = this.b;
          int k = i * 2;
          arrayOfEntry[i] = new AbstractMap.SimpleImmutableEntry(localObject[k], this.b[(k + 1)]);
          i += 1;
        }
        i = this.c;
        Object localObject = s.a(this.a);
        Arrays.sort(arrayOfEntry, 0, i, new d(p.a.b, (s)localObject));
        i = j;
        while (i < this.c)
        {
          localObject = this.b;
          j = i * 2;
          localObject[j] = arrayOfEntry[i].getKey();
          this.b[(j + 1)] = arrayOfEntry[i].getValue();
          i += 1;
        }
      }
      this.d = true;
      return w.a(this.c, this.b);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */