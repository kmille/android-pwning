package com.google.common.collect;

import com.google.common.base.j;
import java.io.Serializable;
import javax.annotation.Nullable;

public final class t<C extends Comparable>
  extends u
  implements Serializable
{
  private static final t<Comparable> c = new t(g.a(), g.b());
  public final g<C> a;
  public final g<C> b;
  
  private t(g<C> paramg1, g<C> paramg2)
  {
    this.a = ((g)j.a(paramg1));
    this.b = ((g)j.a(paramg2));
    if ((paramg1.a(paramg2) <= 0) && (paramg1 != g.b()) && (paramg2 != g.a())) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("Invalid range: ");
    localStringBuilder.append(a(paramg1, paramg2));
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static <C extends Comparable<?>> t<C> a(C paramC1, C paramC2)
  {
    return new t(g.b(paramC1), g.c(paramC2));
  }
  
  private static String a(g<?> paramg1, g<?> paramg2)
  {
    StringBuilder localStringBuilder = new StringBuilder(16);
    paramg1.a(localStringBuilder);
    localStringBuilder.append("..");
    paramg2.b(localStringBuilder);
    return localStringBuilder.toString();
  }
  
  static int b(Comparable paramComparable1, Comparable paramComparable2)
  {
    return paramComparable1.compareTo(paramComparable2);
  }
  
  public final boolean equals(@Nullable Object paramObject)
  {
    if ((paramObject instanceof t))
    {
      paramObject = (t)paramObject;
      if ((this.a.equals(((t)paramObject).a)) && (this.b.equals(((t)paramObject).b))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.a.hashCode() * 31 + this.b.hashCode();
  }
  
  public final String toString()
  {
    return a(this.a, this.b);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */