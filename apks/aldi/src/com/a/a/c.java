package com.a.a;

import java.util.Collections;
import java.util.Comparator;

public final class c<T>
  implements Comparator<T>
{
  private static final c<Comparable<Object>> a = new c(new Comparator() {});
  private static final c<Comparable<Object>> b = new c(Collections.reverseOrder());
  private final Comparator<? super T> c;
  
  private c(Comparator<? super T> paramComparator)
  {
    this.c = paramComparator;
  }
  
  public static <T, U extends Comparable<? super U>> c<T> a(com.a.a.a.d<? super T, ? extends U> paramd)
  {
    d.a(paramd);
    new c(new Comparator()
    {
      public final int compare(T paramAnonymousT1, T paramAnonymousT2)
      {
        return ((Comparable)this.a.apply(paramAnonymousT1)).compareTo((Comparable)this.a.apply(paramAnonymousT2));
      }
    });
  }
  
  public final int compare(T paramT1, T paramT2)
  {
    return this.c.compare(paramT1, paramT2);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */