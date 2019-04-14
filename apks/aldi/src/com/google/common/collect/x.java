package com.google.common.collect;

import javax.annotation.Nullable;

final class x<E>
  extends n<E>
{
  static final x<Object> a = new x(new Object[0], 0, null, 0, 0);
  final transient Object[] b;
  final transient Object[] c;
  private final transient int d;
  private final transient int e;
  private final transient int f;
  
  x(Object[] paramArrayOfObject1, int paramInt1, Object[] paramArrayOfObject2, int paramInt2, int paramInt3)
  {
    this.b = paramArrayOfObject1;
    this.c = paramArrayOfObject2;
    this.d = paramInt2;
    this.e = paramInt1;
    this.f = paramInt3;
  }
  
  final int a(Object[] paramArrayOfObject, int paramInt)
  {
    System.arraycopy(this.b, 0, paramArrayOfObject, 0, this.f);
    return this.f + 0;
  }
  
  public final ab<E> a()
  {
    return o.a(this.b, this.f, 0);
  }
  
  public final boolean contains(@Nullable Object paramObject)
  {
    Object[] arrayOfObject = this.c;
    if (paramObject != null)
    {
      if (arrayOfObject == null) {
        return false;
      }
      int i = i.a(paramObject);
      for (;;)
      {
        i &= this.d;
        Object localObject = arrayOfObject[i];
        if (localObject == null) {
          return false;
        }
        if (localObject.equals(paramObject)) {
          return true;
        }
        i += 1;
      }
    }
    return false;
  }
  
  final boolean d()
  {
    return true;
  }
  
  final l<E> e()
  {
    return l.b(this.b, this.f);
  }
  
  public final int hashCode()
  {
    return this.e;
  }
  
  public final int size()
  {
    return this.f;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */