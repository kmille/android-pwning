package com.google.common.collect;

import com.google.common.base.e;
import com.google.common.base.j;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.Nullable;

final class d<F, T>
  extends s<F>
  implements Serializable
{
  final e<F, ? extends T> a;
  final s<T> b;
  
  d(e<F, ? extends T> parame, s<T> params)
  {
    this.a = ((e)j.a(parame));
    this.b = ((s)j.a(params));
  }
  
  public final int compare(F paramF1, F paramF2)
  {
    return this.b.compare(this.a.a(paramF1), this.a.a(paramF2));
  }
  
  public final boolean equals(@Nullable Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof d))
    {
      paramObject = (d)paramObject;
      if ((this.a.equals(((d)paramObject).a)) && (this.b.equals(((d)paramObject).b))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.a, this.b });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.b);
    localStringBuilder.append(".onResultOf(");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */