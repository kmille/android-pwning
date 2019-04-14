package com.a.a;

import com.a.a.d.g;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class f<T>
  implements Closeable
{
  public final Iterator<? extends T> a;
  public final com.a.a.b.a b;
  
  public f(com.a.a.b.a parama, Iterable<? extends T> paramIterable)
  {
    this(parama, new com.a.a.c.a(paramIterable));
  }
  
  private f(com.a.a.b.a parama, Iterator<? extends T> paramIterator)
  {
    this.b = parama;
    this.a = paramIterator;
  }
  
  private f(Iterable<? extends T> paramIterable)
  {
    this(null, new com.a.a.c.a(paramIterable));
  }
  
  private f(Iterator<? extends T> paramIterator)
  {
    this(null, paramIterator);
  }
  
  public static <T> f<T> a()
  {
    return a(Collections.emptyList());
  }
  
  public static <T> f<T> a(Iterable<? extends T> paramIterable)
  {
    d.a(paramIterable);
    return new f(paramIterable);
  }
  
  public static <K, V> f<Map.Entry<K, V>> a(Map<K, V> paramMap)
  {
    d.a(paramMap);
    return new f(paramMap.entrySet());
  }
  
  public static <T> f<T> a(T... paramVarArgs)
  {
    d.a(paramVarArgs);
    if (paramVarArgs.length == 0) {
      return a(Collections.emptyList());
    }
    return new f(new com.a.a.d.a(paramVarArgs));
  }
  
  public final f<T> a(long paramLong)
  {
    if (paramLong >= 0L)
    {
      if (paramLong == 0L) {
        return this;
      }
      return new f(this.b, new com.a.a.d.f(this.a, paramLong));
    }
    throw new IllegalArgumentException("n cannot be negative");
  }
  
  public final <R> f<R> a(com.a.a.a.d<? super T, ? extends R> paramd)
  {
    return new f(this.b, new com.a.a.d.e(this.a, paramd));
  }
  
  public final f<T> a(com.a.a.a.e<? super T> parame)
  {
    return new f(this.b, new com.a.a.d.b(this.a, parame));
  }
  
  public final <R, A> R a(a<? super T, A, R> parama)
  {
    Object localObject1 = parama.a().a();
    while (this.a.hasNext())
    {
      Object localObject2 = this.a.next();
      parama.b().a(localObject1, localObject2);
    }
    if (parama.c() != null) {}
    for (parama = parama.c();; parama = b.b()) {
      return (R)parama.apply(localObject1);
    }
  }
  
  public final <R> R a(R paramR, com.a.a.a.b<? super R, ? super T, ? extends R> paramb)
  {
    while (this.a.hasNext()) {
      paramR = paramb.apply(paramR, this.a.next());
    }
    return paramR;
  }
  
  public final void a(com.a.a.a.c<? super T> paramc)
  {
    while (this.a.hasNext()) {
      paramc.accept(this.a.next());
    }
  }
  
  public final boolean a(com.a.a.a.e<? super T> parame, int paramInt)
  {
    int i;
    if (paramInt == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (paramInt == 1) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    while (this.a.hasNext())
    {
      int j = parame.test(this.a.next());
      if ((j ^ paramInt) != 0) {
        return (i != 0) && (j != 0);
      }
    }
    return i == 0;
  }
  
  public final f<T> b()
  {
    return new f(this.b, new com.a.a.d.d(this.a));
  }
  
  public final <R> f<R> b(com.a.a.a.d<? super T, ? extends f<? extends R>> paramd)
  {
    return new f(this.b, new com.a.a.d.c(this.a, paramd));
  }
  
  public final <R extends Comparable<? super R>> f<T> c(com.a.a.a.d<? super T, ? extends R> paramd)
  {
    paramd = c.a(paramd);
    return new f(this.b, new g(this.a, paramd));
  }
  
  public final List<T> c()
  {
    ArrayList localArrayList = new ArrayList();
    while (this.a.hasNext()) {
      localArrayList.add(this.a.next());
    }
    return localArrayList;
  }
  
  public final void close()
  {
    if ((this.b != null) && (this.b.a != null))
    {
      this.b.a.run();
      this.b.a = null;
    }
  }
  
  public final long d()
  {
    for (long l = 0L; this.a.hasNext(); l += 1L) {
      this.a.next();
    }
    return l;
  }
  
  public final e<T> e()
  {
    if (this.a.hasNext()) {
      return e.a(this.a.next());
    }
    return e.a();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */