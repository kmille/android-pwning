package com.google.common.collect;

import com.google.common.base.j;

final class z<E>
  extends n<E>
{
  final transient E a;
  private transient int b;
  
  z(E paramE)
  {
    this.a = j.a(paramE);
  }
  
  z(E paramE, int paramInt)
  {
    this.a = paramE;
    this.b = paramInt;
  }
  
  final int a(Object[] paramArrayOfObject, int paramInt)
  {
    paramArrayOfObject[0] = this.a;
    return 1;
  }
  
  public final ab<E> a()
  {
    return new o.2(this.a);
  }
  
  public final boolean contains(Object paramObject)
  {
    return this.a.equals(paramObject);
  }
  
  final boolean d()
  {
    return this.b != 0;
  }
  
  final l<E> e()
  {
    return l.a(this.a);
  }
  
  public final int hashCode()
  {
    int j = this.b;
    int i = j;
    if (j == 0)
    {
      i = this.a.hashCode();
      this.b = i;
    }
    return i;
  }
  
  public final int size()
  {
    return 1;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[");
    localStringBuilder.append(this.a.toString());
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */