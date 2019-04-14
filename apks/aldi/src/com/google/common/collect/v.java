package com.google.common.collect;

import com.google.common.base.j;

final class v<E>
  extends l<E>
{
  static final l<Object> a = new v(new Object[0], 0);
  final transient Object[] b;
  private final transient int c;
  
  v(Object[] paramArrayOfObject, int paramInt)
  {
    this.b = paramArrayOfObject;
    this.c = paramInt;
  }
  
  final int a(Object[] paramArrayOfObject, int paramInt)
  {
    System.arraycopy(this.b, 0, paramArrayOfObject, 0, this.c);
    return this.c + 0;
  }
  
  public final ac<E> a(int paramInt)
  {
    return o.a(this.b, this.c, paramInt);
  }
  
  public final E get(int paramInt)
  {
    j.a(paramInt, this.c);
    return (E)this.b[paramInt];
  }
  
  public final int size()
  {
    return this.c;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */