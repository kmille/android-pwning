package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.Nullable;

public abstract class l<E>
  extends j<E>
  implements List<E>, RandomAccess
{
  public static <E> l<E> a(E paramE)
  {
    paramE = r.a(new Object[] { paramE }, 1);
    return b(paramE, paramE.length);
  }
  
  public static <E> l<E> a(Collection<? extends E> paramCollection)
  {
    paramCollection = paramCollection.toArray();
    paramCollection = r.a(paramCollection, paramCollection.length);
    return b(paramCollection, paramCollection.length);
  }
  
  static <E> l<E> a(Object[] paramArrayOfObject)
  {
    return b(paramArrayOfObject, paramArrayOfObject.length);
  }
  
  static <E> l<E> b(Object[] paramArrayOfObject, int paramInt)
  {
    if (paramInt == 0) {
      return v.a;
    }
    return new v(paramArrayOfObject, paramInt);
  }
  
  public static <E> l<E> c()
  {
    return v.a;
  }
  
  int a(Object[] paramArrayOfObject, int paramInt)
  {
    int i = size();
    paramInt = 0;
    while (paramInt < i)
    {
      paramArrayOfObject[(paramInt + 0)] = get(paramInt);
      paramInt += 1;
    }
    return i + 0;
  }
  
  public final ab<E> a()
  {
    return a(0);
  }
  
  public ac<E> a(int paramInt)
  {
    new a(size(), paramInt)
    {
      protected final E a(int paramAnonymousInt)
      {
        return (E)l.this.get(paramAnonymousInt);
      }
    };
  }
  
  public l<E> a(int paramInt1, int paramInt2)
  {
    com.google.common.base.j.a(paramInt1, paramInt2, size());
    paramInt2 -= paramInt1;
    if (paramInt2 == size()) {
      return this;
    }
    if (paramInt2 == 0) {
      return v.a;
    }
    return new b(paramInt1, paramInt2);
  }
  
  @Deprecated
  public final void add(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final l<E> b()
  {
    return this;
  }
  
  public boolean contains(@Nullable Object paramObject)
  {
    return indexOf(paramObject) >= 0;
  }
  
  public l<E> d()
  {
    if (size() <= 1) {
      return this;
    }
    return new a(this);
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    return Lists.a(this, paramObject);
  }
  
  public int hashCode()
  {
    int k = size();
    int j = 1;
    int i = 0;
    while (i < k)
    {
      j = j * 31 + get(i).hashCode() ^ 0xFFFFFFFF ^ 0xFFFFFFFF;
      i += 1;
    }
    return j;
  }
  
  public int indexOf(@Nullable Object paramObject)
  {
    if (paramObject == null) {
      return -1;
    }
    return Lists.b(this, paramObject);
  }
  
  public int lastIndexOf(@Nullable Object paramObject)
  {
    if (paramObject == null) {
      return -1;
    }
    return Lists.c(this, paramObject);
  }
  
  @Deprecated
  public final E remove(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final E set(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  static final class a<E>
    extends l<E>
  {
    private final transient l<E> a;
    
    a(l<E> paraml)
    {
      this.a = paraml;
    }
    
    private int b(int paramInt)
    {
      return size() - 1 - paramInt;
    }
    
    public final l<E> a(int paramInt1, int paramInt2)
    {
      com.google.common.base.j.a(paramInt1, paramInt2, size());
      return this.a.a(size() - paramInt2, size() - paramInt1).d();
    }
    
    public final boolean contains(@Nullable Object paramObject)
    {
      return this.a.contains(paramObject);
    }
    
    public final l<E> d()
    {
      return this.a;
    }
    
    public final E get(int paramInt)
    {
      com.google.common.base.j.a(paramInt, size());
      return (E)this.a.get(b(paramInt));
    }
    
    public final int indexOf(@Nullable Object paramObject)
    {
      int i = this.a.lastIndexOf(paramObject);
      if (i >= 0) {
        return b(i);
      }
      return -1;
    }
    
    public final int lastIndexOf(@Nullable Object paramObject)
    {
      int i = this.a.indexOf(paramObject);
      if (i >= 0) {
        return b(i);
      }
      return -1;
    }
    
    public final int size()
    {
      return this.a.size();
    }
  }
  
  final class b
    extends l<E>
  {
    final transient int a;
    final transient int b;
    
    b(int paramInt1, int paramInt2)
    {
      this.a = paramInt1;
      this.b = paramInt2;
    }
    
    public final l<E> a(int paramInt1, int paramInt2)
    {
      com.google.common.base.j.a(paramInt1, paramInt2, this.b);
      return l.this.a(paramInt1 + this.a, paramInt2 + this.a);
    }
    
    public final E get(int paramInt)
    {
      com.google.common.base.j.a(paramInt, this.b);
      return (E)l.this.get(paramInt + this.a);
    }
    
    public final int size()
    {
      return this.b;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */