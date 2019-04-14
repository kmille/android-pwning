package com.google.common.collect;

import java.util.Arrays;
import java.util.Map.Entry;
import javax.annotation.Nullable;

final class w<K, V>
  extends m<K, V>
{
  static final m<Object, Object> b = new w(null, new Object[0], 0);
  private final transient int[] c;
  private final transient Object[] d;
  private final transient int e;
  
  private w(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    this.c = paramArrayOfInt;
    this.d = paramArrayOfObject;
    this.e = paramInt;
  }
  
  static <K, V> w<K, V> a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == 0) {
      return (w)b;
    }
    Object localObject1 = null;
    int i = 0;
    if (paramInt == 1)
    {
      e.a(paramArrayOfObject[0], paramArrayOfObject[1]);
      return new w(null, paramArrayOfObject, 1);
    }
    com.google.common.base.j.b(paramInt, paramArrayOfObject.length >> 1);
    int k = n.a(paramInt);
    if (paramInt == 1)
    {
      e.a(paramArrayOfObject[0], paramArrayOfObject[1]);
    }
    else
    {
      localObject1 = new int[k];
      Arrays.fill((int[])localObject1, -1);
      if (i < paramInt)
      {
        int j = i * 2;
        int m = j + 0;
        Object localObject2 = paramArrayOfObject[m];
        Object localObject3 = paramArrayOfObject[(j + 1)];
        e.a(localObject2, localObject3);
        j = i.a(localObject2.hashCode());
        int n;
        for (;;)
        {
          j &= k - 1;
          n = localObject1[j];
          if (n == -1)
          {
            localObject1[j] = m;
            i += 1;
            break;
          }
          if (paramArrayOfObject[n].equals(localObject2)) {
            break label179;
          }
          j += 1;
        }
        label179:
        localObject1 = new StringBuilder("Multiple entries with same key: ");
        ((StringBuilder)localObject1).append(localObject2);
        ((StringBuilder)localObject1).append("=");
        ((StringBuilder)localObject1).append(localObject3);
        ((StringBuilder)localObject1).append(" and ");
        ((StringBuilder)localObject1).append(paramArrayOfObject[n]);
        ((StringBuilder)localObject1).append("=");
        ((StringBuilder)localObject1).append(paramArrayOfObject[(n ^ 0x1)]);
        throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
      }
    }
    return new w((int[])localObject1, paramArrayOfObject, paramInt);
  }
  
  final n<Map.Entry<K, V>> c()
  {
    return new a(this, this.d, this.e);
  }
  
  final n<K> d()
  {
    return new b(this, new c(this.d, 0, this.e));
  }
  
  final j<V> e()
  {
    return new c(this.d, 1, this.e);
  }
  
  @Nullable
  public final V get(@Nullable Object paramObject)
  {
    int[] arrayOfInt = this.c;
    Object[] arrayOfObject = this.d;
    int i = this.e;
    if (paramObject == null) {
      return null;
    }
    if (i == 1)
    {
      if (arrayOfObject[0].equals(paramObject)) {
        return (V)arrayOfObject[1];
      }
      return null;
    }
    if (arrayOfInt == null) {
      return null;
    }
    int j = arrayOfInt.length;
    i = i.a(paramObject.hashCode());
    for (;;)
    {
      i &= j - 1;
      int k = arrayOfInt[i];
      if (k == -1) {
        return null;
      }
      if (arrayOfObject[k].equals(paramObject)) {
        return (V)arrayOfObject[(k ^ 0x1)];
      }
      i += 1;
    }
  }
  
  public final int size()
  {
    return this.e;
  }
  
  static final class a<K, V>
    extends n<Map.Entry<K, V>>
  {
    private final transient m<K, V> a;
    private final transient Object[] b;
    private final transient int c;
    private final transient int d;
    
    a(m<K, V> paramm, Object[] paramArrayOfObject, int paramInt)
    {
      this.a = paramm;
      this.b = paramArrayOfObject;
      this.c = 0;
      this.d = paramInt;
    }
    
    public final ab<Map.Entry<K, V>> a()
    {
      return b().a(0);
    }
    
    public final boolean contains(Object paramObject)
    {
      if ((paramObject instanceof Map.Entry))
      {
        Object localObject = (Map.Entry)paramObject;
        paramObject = ((Map.Entry)localObject).getKey();
        localObject = ((Map.Entry)localObject).getValue();
        if ((localObject != null) && (localObject.equals(this.a.get(paramObject)))) {
          return true;
        }
      }
      return false;
    }
    
    final l<Map.Entry<K, V>> e()
    {
      new l()
      {
        public final int size()
        {
          return w.a.a(w.a.this);
        }
      };
    }
    
    public final int size()
    {
      return this.d;
    }
  }
  
  static final class b<K>
    extends n<K>
  {
    private final transient m<K, ?> a;
    private final transient l<K> b;
    
    b(m<K, ?> paramm, l<K> paraml)
    {
      this.a = paramm;
      this.b = paraml;
    }
    
    public final ab<K> a()
    {
      return this.b.a(0);
    }
    
    public final l<K> b()
    {
      return this.b;
    }
    
    public final boolean contains(@Nullable Object paramObject)
    {
      return this.a.get(paramObject) != null;
    }
    
    public final int size()
    {
      return this.a.size();
    }
  }
  
  static final class c
    extends l<Object>
  {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;
    
    c(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
    {
      this.a = paramArrayOfObject;
      this.b = paramInt1;
      this.c = paramInt2;
    }
    
    public final Object get(int paramInt)
    {
      com.google.common.base.j.a(paramInt, this.c);
      return this.a[(paramInt * 2 + this.b)];
    }
    
    public final int size()
    {
      return this.c;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */