package com.google.common.collect;

public final class r
{
  static Object a(Object paramObject, int paramInt)
  {
    if (paramObject != null) {
      return paramObject;
    }
    throw new NullPointerException("at index ".concat(String.valueOf(paramInt)));
  }
  
  static Object[] a(Object[] paramArrayOfObject, int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      a(paramArrayOfObject[i], i);
      i += 1;
    }
    return paramArrayOfObject;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */