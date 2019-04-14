package com.google.common.collect;

import com.google.common.base.j;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.Nullable;

final class f<T>
  extends s<T>
  implements Serializable
{
  final Comparator<T> a;
  
  f(Comparator<T> paramComparator)
  {
    this.a = ((Comparator)j.a(paramComparator));
  }
  
  public final int compare(T paramT1, T paramT2)
  {
    return this.a.compare(paramT1, paramT2);
  }
  
  public final boolean equals(@Nullable Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f))
    {
      paramObject = (f)paramObject;
      return this.a.equals(((f)paramObject).a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */