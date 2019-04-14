package com.a.a;

import com.a.a.a.d;
import com.a.a.a.f;
import java.util.List;
import java.util.Map;

public final class b
{
  private static final f<long[]> a = new f() {};
  private static final f<double[]> b = new f() {};
  
  public static <T> a<T, ?, List<T>> a()
  {
    new a(new f()new com.a.a.a.a {}, new com.a.a.a.a() {});
  }
  
  public static <T, K> a<T, ?, Map<K, List<T>>> a(d<? super T, ? extends K> paramd)
  {
    final a locala = a();
    f local7 = new f() {};
    Object localObject = locala.c();
    if (localObject != null) {
      localObject = new d() {};
    } else {
      localObject = null;
    }
    new a(local7, new com.a.a.a.a() {}, (d)localObject);
  }
  
  public static <T, K, V> a<T, ?, Map<K, V>> a(d<? super T, ? extends K> paramd, final d<? super T, ? extends V> paramd1)
  {
    new a(new f()new com.a.a.a.a {}, new com.a.a.a.a() {});
  }
  
  public static a<CharSequence, ?, String> a(CharSequence paramCharSequence)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("".toString());
    ((StringBuilder)localObject).append("".toString());
    localObject = ((StringBuilder)localObject).toString();
    new a(new f()new com.a.a.a.a {}, new com.a.a.a.a()new d {}, new d() {});
  }
  
  static <A, R> d<A, R> b()
  {
    new d()
    {
      public final R apply(A paramAnonymousA)
      {
        return paramAnonymousA;
      }
    };
  }
  
  static final class a<T, A, R>
    implements a<T, A, R>
  {
    private final f<A> a;
    private final com.a.a.a.a<A, T> b;
    private final d<A, R> c;
    
    public a(f<A> paramf, com.a.a.a.a<A, T> parama)
    {
      this(paramf, parama, null);
    }
    
    public a(f<A> paramf, com.a.a.a.a<A, T> parama, d<A, R> paramd)
    {
      this.a = paramf;
      this.b = parama;
      this.c = paramd;
    }
    
    public final f<A> a()
    {
      return this.a;
    }
    
    public final com.a.a.a.a<A, T> b()
    {
      return this.b;
    }
    
    public final d<A, R> c()
    {
      return this.c;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */