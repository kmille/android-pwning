package com.google.common.collect;

import java.util.Arrays;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class n<E>
  extends j<E>
  implements Set<E>
{
  private transient l<E> a;
  
  static int a(int paramInt)
  {
    boolean bool = true;
    if (paramInt < 751619276)
    {
      int i = Integer.highestOneBit(paramInt - 1) << 1;
      for (;;)
      {
        double d = i;
        Double.isNaN(d);
        if (d * 0.7D >= paramInt) {
          break;
        }
        i <<= 1;
      }
      return i;
    }
    if (paramInt >= 1073741824) {
      bool = false;
    }
    com.google.common.base.j.a(bool, "collection too large");
    return 1073741824;
  }
  
  public static <E> n<E> a(E paramE1, E paramE2)
  {
    int j = 2;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramE1;
    arrayOfObject[1] = paramE2;
    int i4;
    int m;
    int i;
    for (;;)
    {
      int i3;
      int k;
      switch (j)
      {
      default: 
        i3 = a(j);
        paramE2 = new Object[i3];
        i4 = i3 - 1;
        k = 0;
        m = 0;
        i = 0;
        break;
      case 1: 
        return new z(arrayOfObject[0]);
      case 0: 
        return x.a;
      }
      while (k < j)
      {
        paramE1 = r.a(arrayOfObject[k], k);
        int i5 = paramE1.hashCode();
        int i1 = i.a(i5);
        int n;
        int i2;
        for (;;)
        {
          n = i1 & i4;
          Object localObject = paramE2[n];
          if (localObject == null)
          {
            arrayOfObject[i] = paramE1;
            paramE2[n] = paramE1;
            n = m + i5;
            i2 = i + 1;
            break;
          }
          n = m;
          i2 = i;
          if (localObject.equals(paramE1)) {
            break;
          }
          i1 += 1;
        }
        k += 1;
        m = n;
        i = i2;
      }
      Arrays.fill(arrayOfObject, i, j, null);
      if (i == 1) {
        return new z(arrayOfObject[0], m);
      }
      if (a(i) >= i3 / 2) {
        break;
      }
      j = i;
    }
    paramE1 = arrayOfObject;
    if (i <= 0) {
      paramE1 = Arrays.copyOf(arrayOfObject, i);
    }
    return new x(paramE1, m, paramE2, i4, i);
  }
  
  public static <E> n<E> c()
  {
    return x.a;
  }
  
  public abstract ab<E> a();
  
  public l<E> b()
  {
    l locall2 = this.a;
    l locall1 = locall2;
    if (locall2 == null)
    {
      locall1 = e();
      this.a = locall1;
    }
    return locall1;
  }
  
  boolean d()
  {
    return false;
  }
  
  l<E> e()
  {
    return l.a(toArray());
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (((paramObject instanceof n)) && (d()) && (((n)paramObject).d()) && (hashCode() != paramObject.hashCode())) {
      return false;
    }
    return y.a(this, paramObject);
  }
  
  public int hashCode()
  {
    return y.a(this);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */