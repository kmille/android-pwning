package com.google.common.collect;

import com.google.common.base.e;
import com.google.common.base.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class o
{
  static <T> ac<T> a(T[] paramArrayOfT, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (paramInt1 >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    j.a(bool);
    j.a(0, paramInt1 + 0, paramArrayOfT.length);
    j.b(paramInt2, paramInt1);
    if (paramInt1 == 0) {
      return a.a;
    }
    return new a(paramArrayOfT, paramInt1, paramInt2);
  }
  
  public static <T> T a(Iterator<T> paramIterator)
  {
    Object localObject;
    do
    {
      localObject = paramIterator.next();
    } while (paramIterator.hasNext());
    return (T)localObject;
  }
  
  public static <T> boolean a(Collection<T> paramCollection, Iterator<? extends T> paramIterator)
  {
    j.a(paramCollection);
    j.a(paramIterator);
    boolean bool = false;
    while (paramIterator.hasNext()) {
      bool |= paramCollection.add(paramIterator.next());
    }
    return bool;
  }
  
  static final class a<T>
    extends a<T>
  {
    static final ac<Object> a = new a(new Object[0], 0, 0);
    private final T[] b;
    private final int c;
    
    a(T[] paramArrayOfT, int paramInt1, int paramInt2)
    {
      super(paramInt2);
      this.b = paramArrayOfT;
      this.c = 0;
    }
    
    protected final T a(int paramInt)
    {
      return (T)this.b[(this.c + paramInt)];
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */