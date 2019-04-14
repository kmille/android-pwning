package com.google.common.collect;

import javax.annotation.Nullable;

final class i
{
  static int a(int paramInt)
  {
    return (int)(Integer.rotateLeft((int)(paramInt * -862048943L), 15) * 461845907L);
  }
  
  static int a(@Nullable Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = 0;
    } else {
      i = paramObject.hashCode();
    }
    return a(i);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */