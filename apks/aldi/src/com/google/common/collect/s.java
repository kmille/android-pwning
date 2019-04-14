package com.google.common.collect;

import java.util.Comparator;
import javax.annotation.Nullable;

public abstract class s<T>
  implements Comparator<T>
{
  public static <T> s<T> a(Comparator<T> paramComparator)
  {
    if ((paramComparator instanceof s)) {
      return (s)paramComparator;
    }
    return new f(paramComparator);
  }
  
  public abstract int compare(@Nullable T paramT1, @Nullable T paramT2);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */