package com.google.common.cache;

import com.google.common.base.j;
import com.google.common.base.m;
import com.google.common.collect.n;
import com.google.common.d.a.i;
import com.google.common.d.a.j.a;
import com.google.common.d.a.l;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

class LocalCache<K, V>
  extends AbstractMap<K, V>
  implements ConcurrentMap<K, V>
{
  static final Logger a = Logger.getLogger(LocalCache.class.getName());
  static final t<Object, Object> r = new t()
  {
    public final int a()
    {
      return 0;
    }
    
    public final LocalCache.t<Object, Object> a(ReferenceQueue<Object> paramAnonymousReferenceQueue, @Nullable Object paramAnonymousObject, LocalCache.ReferenceEntry<Object, Object> paramAnonymousReferenceEntry)
    {
      return this;
    }
    
    public final void a(Object paramAnonymousObject) {}
    
    public final LocalCache.ReferenceEntry<Object, Object> b()
    {
      return null;
    }
    
    public final boolean c()
    {
      return false;
    }
    
    public final boolean d()
    {
      return false;
    }
    
    public final Object get()
    {
      return null;
    }
  };
  static final Queue<? extends Object> s = new AbstractQueue()
  {
    public final Iterator<Object> iterator()
    {
      return n.c().a();
    }
    
    public final boolean offer(Object paramAnonymousObject)
    {
      return true;
    }
    
    public final Object peek()
    {
      return null;
    }
    
    public final Object poll()
    {
      return null;
    }
    
    public final int size()
    {
      return 0;
    }
  };
  final int b;
  final int c;
  final k<K, V>[] d;
  final com.google.common.base.c<Object> e;
  final com.google.common.base.c<Object> f;
  final m g;
  final m h;
  final long i;
  final d<K, V> j;
  final long k;
  final long l;
  final long m;
  final Queue<c<K, V>> n;
  final m o;
  final c p;
  @Nullable
  final a<? super K, V> q;
  Set<K> t;
  Collection<V> u;
  Set<Map.Entry<K, V>> v;
  
  private int a(@Nullable Object paramObject)
  {
    int i1 = this.e.a(paramObject);
    i1 += (i1 << 15 ^ 0xCD7D);
    i1 ^= i1 >>> 10;
    i1 += (i1 << 3);
    i1 ^= i1 >>> 6;
    i1 += (i1 << 2) + (i1 << 14);
    return i1 ^ i1 >>> 16;
  }
  
  private k<K, V> a(int paramInt)
  {
    return this.d[(paramInt >>> this.c & this.b)];
  }
  
  static <K, V> void a(ReferenceEntry<K, V> paramReferenceEntry1, ReferenceEntry<K, V> paramReferenceEntry2)
  {
    paramReferenceEntry1.a(paramReferenceEntry2);
    paramReferenceEntry2.b(paramReferenceEntry1);
  }
  
  static <K, V> void b(ReferenceEntry<K, V> paramReferenceEntry)
  {
    j localj = j.a;
    paramReferenceEntry.a(localj);
    paramReferenceEntry.b(localj);
  }
  
  static <K, V> void b(ReferenceEntry<K, V> paramReferenceEntry1, ReferenceEntry<K, V> paramReferenceEntry2)
  {
    paramReferenceEntry1.c(paramReferenceEntry2);
    paramReferenceEntry2.d(paramReferenceEntry1);
  }
  
  static <K, V> void c(ReferenceEntry<K, V> paramReferenceEntry)
  {
    j localj = j.a;
    paramReferenceEntry.c(localj);
    paramReferenceEntry.d(localj);
  }
  
  static <K, V> t<K, V> f()
  {
    return r;
  }
  
  static <K, V> ReferenceEntry<K, V> g()
  {
    return j.a;
  }
  
  final void a(ReferenceEntry<K, V> paramReferenceEntry)
  {
    int i1 = paramReferenceEntry.c();
    a(i1).a(paramReferenceEntry, i1);
  }
  
  final void a(t<K, V> paramt)
  {
    ReferenceEntry localReferenceEntry = paramt.b();
    int i1 = localReferenceEntry.c();
    a(i1).a(localReferenceEntry.d(), i1, paramt);
  }
  
  final boolean a()
  {
    return this.l > 0L;
  }
  
  final boolean a(ReferenceEntry<K, V> paramReferenceEntry, long paramLong)
  {
    j.a(paramReferenceEntry);
    if ((b()) && (paramLong - paramReferenceEntry.e() >= this.k)) {
      return true;
    }
    return (a()) && (paramLong - paramReferenceEntry.h() >= this.l);
  }
  
  final boolean b()
  {
    return this.k > 0L;
  }
  
  final boolean c()
  {
    return this.m > 0L;
  }
  
  public void clear()
  {
    k[] arrayOfk = this.d;
    int i3 = arrayOfk.length;
    int i1 = 0;
    k localk;
    if (i1 < i3)
    {
      localk = arrayOfk[i1];
      if (localk.b != 0) {
        localk.lock();
      }
    }
    for (;;)
    {
      try
      {
        localk.b(localk.a.o.a());
        AtomicReferenceArray localAtomicReferenceArray = localk.f;
        i2 = 0;
        if (i2 >= localAtomicReferenceArray.length()) {
          break label350;
        }
        ReferenceEntry localReferenceEntry = (ReferenceEntry)localAtomicReferenceArray.get(i2);
        if (localReferenceEntry == null) {
          break label343;
        }
        if (localReferenceEntry.a().d())
        {
          Object localObject2 = localReferenceEntry.d();
          Object localObject3 = localReferenceEntry.a().get();
          b localb;
          if ((localObject2 != null) && (localObject3 != null)) {
            localb = b.a;
          } else {
            localb = b.c;
          }
          localReferenceEntry.c();
          localk.a(localObject2, localObject3, localReferenceEntry.a().a(), localb);
        }
        localReferenceEntry = localReferenceEntry.b();
        continue;
        if (i2 < localAtomicReferenceArray.length())
        {
          localAtomicReferenceArray.set(i2, null);
          i2 += 1;
          continue;
        }
        if ((localk.a.d()) && (localk.h.poll() != null)) {
          continue;
        }
        if ((localk.a.e()) && (localk.i.poll() != null)) {
          continue;
        }
        localk.l.clear();
        localk.m.clear();
        localk.k.set(0);
        localk.d += 1;
        localk.b = 0;
      }
      finally
      {
        localk.unlock();
        localk.c();
      }
      i1 += 1;
      break;
      return;
      label343:
      i2 += 1;
      continue;
      label350:
      int i2 = 0;
    }
  }
  
  public boolean containsKey(@Nullable Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    int i1 = a(paramObject);
    return a(i1).b(paramObject, i1);
  }
  
  public boolean containsValue(@Nullable Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    long l1 = this.o.a();
    k[] arrayOfk = this.d;
    long l3 = -1L;
    int i1 = 0;
    while (i1 < 3)
    {
      int i4 = arrayOfk.length;
      long l2 = 0L;
      int i2 = 0;
      while (i2 < i4)
      {
        k localk = arrayOfk[i2];
        int i3 = localk.b;
        AtomicReferenceArray localAtomicReferenceArray = localk.f;
        i3 = 0;
        while (i3 < localAtomicReferenceArray.length())
        {
          for (ReferenceEntry localReferenceEntry = (ReferenceEntry)localAtomicReferenceArray.get(i3); localReferenceEntry != null; localReferenceEntry = localReferenceEntry.b())
          {
            if (localReferenceEntry.d() == null) {
              localk.a();
            }
            Object localObject;
            for (;;)
            {
              localObject = null;
              break label167;
              localObject = localReferenceEntry.a().get();
              if (localObject == null) {
                break;
              }
              if (!localk.a.a(localReferenceEntry, l1)) {
                break label167;
              }
              localk.a(l1);
            }
            label167:
            if ((localObject != null) && (this.f.a(paramObject, localObject))) {
              return true;
            }
          }
          i3 += 1;
        }
        l2 += localk.d;
        i2 += 1;
      }
      if (l2 == l3) {
        break;
      }
      i1 += 1;
      l3 = l2;
    }
    return false;
  }
  
  final boolean d()
  {
    return this.g != m.a;
  }
  
  final boolean e()
  {
    return this.h != m.a;
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    Object localObject = this.v;
    if (localObject != null) {
      return (Set<Map.Entry<K, V>>)localObject;
    }
    localObject = new e(this);
    this.v = ((Set)localObject);
    return (Set<Map.Entry<K, V>>)localObject;
  }
  
  @Nullable
  public V get(@Nullable Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    int i1 = a(paramObject);
    return (V)a(i1).a(paramObject, i1);
  }
  
  @Nullable
  public V getOrDefault(@Nullable Object paramObject, @Nullable V paramV)
  {
    paramObject = get(paramObject);
    if (paramObject != null) {
      return (V)paramObject;
    }
    return paramV;
  }
  
  final void h()
  {
    while ((c)this.n.poll() != null) {}
  }
  
  public boolean isEmpty()
  {
    k[] arrayOfk = this.d;
    long l1 = 0L;
    int i1 = 0;
    while (i1 < arrayOfk.length)
    {
      if (arrayOfk[i1].b != 0) {
        return false;
      }
      l1 += arrayOfk[i1].d;
      i1 += 1;
    }
    if (l1 != 0L)
    {
      i1 = 0;
      while (i1 < arrayOfk.length)
      {
        if (arrayOfk[i1].b != 0) {
          return false;
        }
        l1 -= arrayOfk[i1].d;
        i1 += 1;
      }
      if (l1 != 0L) {
        return false;
      }
    }
    return true;
  }
  
  public Set<K> keySet()
  {
    Object localObject = this.t;
    if (localObject != null) {
      return (Set<K>)localObject;
    }
    localObject = new h(this);
    this.t = ((Set)localObject);
    return (Set<K>)localObject;
  }
  
  public V put(K paramK, V paramV)
  {
    j.a(paramK);
    j.a(paramV);
    int i1 = a(paramK);
    return (V)a(i1).a(paramK, i1, paramV, false);
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }
  
  public V putIfAbsent(K paramK, V paramV)
  {
    j.a(paramK);
    j.a(paramV);
    int i1 = a(paramK);
    return (V)a(i1).a(paramK, i1, paramV, true);
  }
  
  public V remove(@Nullable Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    int i1 = a(paramObject);
    return (V)a(i1).c(paramObject, i1);
  }
  
  public boolean remove(@Nullable Object paramObject1, @Nullable Object paramObject2)
  {
    if ((paramObject1 != null) && (paramObject2 != null))
    {
      int i1 = a(paramObject1);
      return a(i1).b(paramObject1, i1, paramObject2);
    }
    return false;
  }
  
  public V replace(K paramK, V paramV)
  {
    j.a(paramK);
    j.a(paramV);
    int i1 = a(paramK);
    return (V)a(i1).a(paramK, i1, paramV);
  }
  
  public boolean replace(K paramK, @Nullable V paramV1, V paramV2)
  {
    j.a(paramK);
    j.a(paramV2);
    if (paramV1 == null) {
      return false;
    }
    int i1 = a(paramK);
    return a(i1).a(paramK, i1, paramV1, paramV2);
  }
  
  public int size()
  {
    k[] arrayOfk = this.d;
    long l1 = 0L;
    int i1 = 0;
    while (i1 < arrayOfk.length)
    {
      l1 += Math.max(0, arrayOfk[i1].b);
      i1 += 1;
    }
    return com.google.common.c.a.a(l1);
  }
  
  public Collection<V> values()
  {
    Object localObject = this.u;
    if (localObject != null) {
      return (Collection<V>)localObject;
    }
    localObject = new u(this);
    this.u = ((Collection)localObject);
    return (Collection<V>)localObject;
  }
  
  static abstract interface ReferenceEntry<K, V>
  {
    public abstract LocalCache.t<K, V> a();
    
    public abstract void a(long paramLong);
    
    public abstract void a(ReferenceEntry<K, V> paramReferenceEntry);
    
    public abstract void a(LocalCache.t<K, V> paramt);
    
    @Nullable
    public abstract ReferenceEntry<K, V> b();
    
    public abstract void b(long paramLong);
    
    public abstract void b(ReferenceEntry<K, V> paramReferenceEntry);
    
    public abstract int c();
    
    public abstract void c(ReferenceEntry<K, V> paramReferenceEntry);
    
    @Nullable
    public abstract K d();
    
    public abstract void d(ReferenceEntry<K, V> paramReferenceEntry);
    
    public abstract long e();
    
    public abstract ReferenceEntry<K, V> f();
    
    public abstract ReferenceEntry<K, V> g();
    
    public abstract long h();
    
    public abstract ReferenceEntry<K, V> i();
    
    public abstract ReferenceEntry<K, V> j();
  }
  
  abstract class a<T>
    extends AbstractSet<T>
  {
    final ConcurrentMap<?, ?> a;
    
    a()
    {
      ConcurrentMap localConcurrentMap;
      this.a = localConcurrentMap;
    }
    
    public void clear()
    {
      this.a.clear();
    }
    
    public boolean isEmpty()
    {
      return this.a.isEmpty();
    }
    
    public int size()
    {
      return this.a.size();
    }
    
    public Object[] toArray()
    {
      return LocalCache.a(this).toArray();
    }
    
    public <E> E[] toArray(E[] paramArrayOfE)
    {
      return LocalCache.a(this).toArray(paramArrayOfE);
    }
  }
  
  static final class aa<K, V>
    extends LocalCache.l<K, V>
  {
    final int b;
    
    aa(ReferenceQueue<V> paramReferenceQueue, V paramV, LocalCache.ReferenceEntry<K, V> paramReferenceEntry, int paramInt)
    {
      super(paramV, paramReferenceEntry);
      this.b = paramInt;
    }
    
    public final int a()
    {
      return this.b;
    }
    
    public final LocalCache.t<K, V> a(ReferenceQueue<V> paramReferenceQueue, V paramV, LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      return new aa(paramReferenceQueue, paramV, paramReferenceEntry, this.b);
    }
  }
  
  static final class ab<K, V>
    extends LocalCache.q<K, V>
  {
    final int b;
    
    ab(V paramV, int paramInt)
    {
      super();
      this.b = paramInt;
    }
    
    public final int a()
    {
      return this.b;
    }
  }
  
  static final class ac<K, V>
    extends LocalCache.y<K, V>
  {
    final int b;
    
    ac(ReferenceQueue<V> paramReferenceQueue, V paramV, LocalCache.ReferenceEntry<K, V> paramReferenceEntry, int paramInt)
    {
      super(paramV, paramReferenceEntry);
      this.b = paramInt;
    }
    
    public final int a()
    {
      return this.b;
    }
    
    public final LocalCache.t<K, V> a(ReferenceQueue<V> paramReferenceQueue, V paramV, LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      return new ac(paramReferenceQueue, paramV, paramReferenceEntry, this.b);
    }
  }
  
  final class ad
    implements Map.Entry<K, V>
  {
    final K a;
    V b;
    
    ad(V paramV)
    {
      this.a = paramV;
      Object localObject;
      this.b = localObject;
    }
    
    public final boolean equals(@Nullable Object paramObject)
    {
      if ((paramObject instanceof Map.Entry))
      {
        paramObject = (Map.Entry)paramObject;
        if ((this.a.equals(((Map.Entry)paramObject).getKey())) && (this.b.equals(((Map.Entry)paramObject).getValue()))) {
          return true;
        }
      }
      return false;
    }
    
    public final K getKey()
    {
      return (K)this.a;
    }
    
    public final V getValue()
    {
      return (V)this.b;
    }
    
    public final int hashCode()
    {
      return this.a.hashCode() ^ this.b.hashCode();
    }
    
    public final V setValue(V paramV)
    {
      Object localObject = LocalCache.this.put(this.a, paramV);
      this.b = paramV;
      return (V)localObject;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(getKey());
      localStringBuilder.append("=");
      localStringBuilder.append(getValue());
      return localStringBuilder.toString();
    }
  }
  
  static abstract class b<K, V>
    implements LocalCache.ReferenceEntry<K, V>
  {
    public LocalCache.t<K, V> a()
    {
      throw new UnsupportedOperationException();
    }
    
    public void a(long paramLong)
    {
      throw new UnsupportedOperationException();
    }
    
    public void a(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      throw new UnsupportedOperationException();
    }
    
    public void a(LocalCache.t<K, V> paramt)
    {
      throw new UnsupportedOperationException();
    }
    
    public LocalCache.ReferenceEntry<K, V> b()
    {
      throw new UnsupportedOperationException();
    }
    
    public void b(long paramLong)
    {
      throw new UnsupportedOperationException();
    }
    
    public void b(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      throw new UnsupportedOperationException();
    }
    
    public int c()
    {
      throw new UnsupportedOperationException();
    }
    
    public void c(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      throw new UnsupportedOperationException();
    }
    
    public K d()
    {
      throw new UnsupportedOperationException();
    }
    
    public void d(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      throw new UnsupportedOperationException();
    }
    
    public long e()
    {
      throw new UnsupportedOperationException();
    }
    
    public LocalCache.ReferenceEntry<K, V> f()
    {
      throw new UnsupportedOperationException();
    }
    
    public LocalCache.ReferenceEntry<K, V> g()
    {
      throw new UnsupportedOperationException();
    }
    
    public long h()
    {
      throw new UnsupportedOperationException();
    }
    
    public LocalCache.ReferenceEntry<K, V> i()
    {
      throw new UnsupportedOperationException();
    }
    
    public LocalCache.ReferenceEntry<K, V> j()
    {
      throw new UnsupportedOperationException();
    }
  }
  
  static abstract enum c
  {
    static final c[] i = { a, b, c, d, e, f, g, h };
    
    private c() {}
    
    static <K, V> void a(LocalCache.ReferenceEntry<K, V> paramReferenceEntry1, LocalCache.ReferenceEntry<K, V> paramReferenceEntry2)
    {
      paramReferenceEntry2.a(paramReferenceEntry1.e());
      LocalCache.a(paramReferenceEntry1.g(), paramReferenceEntry2);
      LocalCache.a(paramReferenceEntry2, paramReferenceEntry1.f());
      LocalCache.b(paramReferenceEntry1);
    }
    
    static <K, V> void b(LocalCache.ReferenceEntry<K, V> paramReferenceEntry1, LocalCache.ReferenceEntry<K, V> paramReferenceEntry2)
    {
      paramReferenceEntry2.b(paramReferenceEntry1.h());
      LocalCache.b(paramReferenceEntry1.j(), paramReferenceEntry2);
      LocalCache.b(paramReferenceEntry2, paramReferenceEntry1.i());
      LocalCache.c(paramReferenceEntry1);
    }
    
    <K, V> LocalCache.ReferenceEntry<K, V> a(LocalCache.k<K, V> paramk, LocalCache.ReferenceEntry<K, V> paramReferenceEntry1, LocalCache.ReferenceEntry<K, V> paramReferenceEntry2)
    {
      return a(paramk, paramReferenceEntry1.d(), paramReferenceEntry1.c(), paramReferenceEntry2);
    }
    
    abstract <K, V> LocalCache.ReferenceEntry<K, V> a(LocalCache.k<K, V> paramk, K paramK, int paramInt, @Nullable LocalCache.ReferenceEntry<K, V> paramReferenceEntry);
  }
  
  final class d
    extends LocalCache<K, V>.f<Map.Entry<K, V>>
  {
    d()
    {
      super();
    }
  }
  
  final class e
    extends LocalCache<K, V>.a<Map.Entry<K, V>>
  {
    e()
    {
      super(localConcurrentMap);
    }
    
    public final boolean contains(Object paramObject)
    {
      if (!(paramObject instanceof Map.Entry)) {
        return false;
      }
      paramObject = (Map.Entry)paramObject;
      Object localObject = ((Map.Entry)paramObject).getKey();
      if (localObject == null) {
        return false;
      }
      localObject = LocalCache.this.get(localObject);
      return (localObject != null) && (LocalCache.this.f.a(((Map.Entry)paramObject).getValue(), localObject));
    }
    
    public final Iterator<Map.Entry<K, V>> iterator()
    {
      return new LocalCache.d(LocalCache.this);
    }
    
    public final boolean remove(Object paramObject)
    {
      if (!(paramObject instanceof Map.Entry)) {
        return false;
      }
      paramObject = (Map.Entry)paramObject;
      Object localObject = ((Map.Entry)paramObject).getKey();
      return (localObject != null) && (LocalCache.this.remove(localObject, ((Map.Entry)paramObject).getValue()));
    }
  }
  
  abstract class f<T>
    implements Iterator<T>
  {
    int b = LocalCache.this.d.length - 1;
    int c = -1;
    LocalCache.k<K, V> d;
    AtomicReferenceArray<LocalCache.ReferenceEntry<K, V>> e;
    LocalCache.ReferenceEntry<K, V> f;
    LocalCache<K, V>.ad g;
    LocalCache<K, V>.ad h;
    
    f()
    {
      b();
    }
    
    private boolean a(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      for (;;)
      {
        Object localObject2;
        try
        {
          long l = LocalCache.this.o.a();
          Object localObject3 = paramReferenceEntry.d();
          LocalCache localLocalCache = LocalCache.this;
          localObject2 = paramReferenceEntry.d();
          Object localObject1 = null;
          if (localObject2 == null)
          {
            paramReferenceEntry = (LocalCache.ReferenceEntry<K, V>)localObject1;
          }
          else
          {
            localObject2 = paramReferenceEntry.a().get();
            if (localObject2 == null)
            {
              paramReferenceEntry = (LocalCache.ReferenceEntry<K, V>)localObject1;
            }
            else
            {
              if (!localLocalCache.a(paramReferenceEntry, l)) {
                break label137;
              }
              paramReferenceEntry = (LocalCache.ReferenceEntry<K, V>)localObject1;
            }
          }
          if (paramReferenceEntry != null)
          {
            this.g = new LocalCache.ad(LocalCache.this, localObject3, paramReferenceEntry);
            return true;
          }
          return false;
        }
        finally
        {
          this.d.b();
        }
        label137:
        paramReferenceEntry = (LocalCache.ReferenceEntry<K, V>)localObject2;
      }
    }
    
    private void b()
    {
      this.g = null;
      if (c()) {
        return;
      }
      if (d()) {
        return;
      }
      do
      {
        do
        {
          if (this.b < 0) {
            break;
          }
          LocalCache.k[] arrayOfk = LocalCache.this.d;
          int j = this.b;
          this.b = (j - 1);
          this.d = arrayOfk[j];
        } while (this.d.b == 0);
        this.e = this.d.f;
        this.c = (this.e.length() - 1);
      } while (!d());
    }
    
    private boolean c()
    {
      if (this.f != null)
      {
        do
        {
          this.f = this.f.b();
          if (this.f == null) {
            break;
          }
        } while (!a(this.f));
        return true;
      }
      return false;
    }
    
    private boolean d()
    {
      while (this.c >= 0)
      {
        Object localObject = this.e;
        int j = this.c;
        this.c = (j - 1);
        localObject = (LocalCache.ReferenceEntry)((AtomicReferenceArray)localObject).get(j);
        this.f = ((LocalCache.ReferenceEntry)localObject);
        if ((localObject != null) && ((a(this.f)) || (c()))) {
          return true;
        }
      }
      return false;
    }
    
    final LocalCache<K, V>.ad a()
    {
      if (this.g != null)
      {
        this.h = this.g;
        b();
        return this.h;
      }
      throw new NoSuchElementException();
    }
    
    public boolean hasNext()
    {
      return this.g != null;
    }
    
    public void remove()
    {
      boolean bool;
      if (this.h != null) {
        bool = true;
      } else {
        bool = false;
      }
      j.b(bool);
      LocalCache.this.remove(this.h.getKey());
      this.h = null;
    }
  }
  
  final class g
    extends LocalCache<K, V>.f<K>
  {
    g()
    {
      super();
    }
    
    public final K next()
    {
      return (K)a().getKey();
    }
  }
  
  final class h
    extends LocalCache<K, V>.a<K>
  {
    h()
    {
      super(localConcurrentMap);
    }
    
    public final boolean contains(Object paramObject)
    {
      return this.a.containsKey(paramObject);
    }
    
    public final Iterator<K> iterator()
    {
      return new LocalCache.g(LocalCache.this);
    }
    
    public final boolean remove(Object paramObject)
    {
      return this.a.remove(paramObject) != null;
    }
  }
  
  static final class i<K, V>
    implements LocalCache.t<K, V>
  {
    volatile LocalCache.t<K, V> a;
    final com.google.common.d.a.k<V> b = com.google.common.d.a.k.d();
    final com.google.common.base.k c = new com.google.common.base.k();
    
    public i()
    {
      this(LocalCache.f());
    }
    
    public i(LocalCache.t<K, V> paramt)
    {
      this.a = paramt;
    }
    
    public final int a()
    {
      return this.a.a();
    }
    
    public final LocalCache.t<K, V> a(ReferenceQueue<V> paramReferenceQueue, @Nullable V paramV, LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      return this;
    }
    
    public final i<V> a(K paramK, a<? super K, V> parama)
    {
      try
      {
        Object localObject = this.c;
        j.b(((com.google.common.base.k)localObject).b ^ true, "This stopwatch is already running.");
        ((com.google.common.base.k)localObject).b = true;
        ((com.google.common.base.k)localObject).c = ((com.google.common.base.k)localObject).a.a();
        localObject = this.a.get();
        if (localObject == null)
        {
          paramK = parama.a();
          if (b(paramK)) {
            return this.b;
          }
          return com.google.common.d.a.e.a(paramK);
        }
        j.a(paramK);
        j.a(localObject);
        paramK = com.google.common.d.a.e.a(parama.a());
        if (paramK == null) {
          return com.google.common.d.a.e.a(null);
        }
        paramK = com.google.common.d.a.e.a(paramK, new com.google.common.base.e()
        {
          public final V a(V paramAnonymousV)
          {
            LocalCache.i.this.b(paramAnonymousV);
            return paramAnonymousV;
          }
        }, j.a.a);
        return paramK;
      }
      catch (Throwable parama)
      {
        if (a(parama)) {
          paramK = this.b;
        } else {
          paramK = com.google.common.d.a.e.a(parama);
        }
        if ((parama instanceof InterruptedException)) {
          Thread.currentThread().interrupt();
        }
      }
      return paramK;
    }
    
    public final void a(@Nullable V paramV)
    {
      if (paramV != null)
      {
        b(paramV);
        return;
      }
      this.a = LocalCache.f();
    }
    
    public final boolean a(Throwable paramThrowable)
    {
      return this.b.a(paramThrowable);
    }
    
    public final LocalCache.ReferenceEntry<K, V> b()
    {
      return null;
    }
    
    public final boolean b(@Nullable V paramV)
    {
      return this.b.a(paramV);
    }
    
    public final boolean c()
    {
      return true;
    }
    
    public final boolean d()
    {
      return this.a.d();
    }
    
    public final long e()
    {
      com.google.common.base.k localk = this.c;
      return TimeUnit.NANOSECONDS.convert(localk.a(), TimeUnit.NANOSECONDS);
    }
    
    public final V get()
    {
      return (V)this.a.get();
    }
  }
  
  static enum j
    implements LocalCache.ReferenceEntry<Object, Object>
  {
    private j() {}
    
    public final LocalCache.t<Object, Object> a()
    {
      return null;
    }
    
    public final void a(long paramLong) {}
    
    public final void a(LocalCache.ReferenceEntry<Object, Object> paramReferenceEntry) {}
    
    public final void a(LocalCache.t<Object, Object> paramt) {}
    
    public final LocalCache.ReferenceEntry<Object, Object> b()
    {
      return null;
    }
    
    public final void b(long paramLong) {}
    
    public final void b(LocalCache.ReferenceEntry<Object, Object> paramReferenceEntry) {}
    
    public final int c()
    {
      return 0;
    }
    
    public final void c(LocalCache.ReferenceEntry<Object, Object> paramReferenceEntry) {}
    
    public final Object d()
    {
      return null;
    }
    
    public final void d(LocalCache.ReferenceEntry<Object, Object> paramReferenceEntry) {}
    
    public final long e()
    {
      return 0L;
    }
    
    public final LocalCache.ReferenceEntry<Object, Object> f()
    {
      return this;
    }
    
    public final LocalCache.ReferenceEntry<Object, Object> g()
    {
      return this;
    }
    
    public final long h()
    {
      return 0L;
    }
    
    public final LocalCache.ReferenceEntry<Object, Object> i()
    {
      return this;
    }
    
    public final LocalCache.ReferenceEntry<Object, Object> j()
    {
      return this;
    }
  }
  
  static final class k<K, V>
    extends ReentrantLock
  {
    final LocalCache<K, V> a;
    volatile int b;
    @GuardedBy("this")
    long c;
    int d;
    int e;
    volatile AtomicReferenceArray<LocalCache.ReferenceEntry<K, V>> f;
    final long g;
    final ReferenceQueue<K> h;
    final ReferenceQueue<V> i;
    final Queue<LocalCache.ReferenceEntry<K, V>> j;
    final AtomicInteger k;
    @GuardedBy("this")
    final Queue<LocalCache.ReferenceEntry<K, V>> l;
    @GuardedBy("this")
    final Queue<LocalCache.ReferenceEntry<K, V>> m;
    
    @GuardedBy("this")
    private LocalCache.ReferenceEntry<K, V> a(LocalCache.ReferenceEntry<K, V> paramReferenceEntry1, LocalCache.ReferenceEntry<K, V> paramReferenceEntry2)
    {
      if (paramReferenceEntry1.d() == null) {
        return null;
      }
      LocalCache.t localt = paramReferenceEntry1.a();
      Object localObject = localt.get();
      if ((localObject == null) && (localt.d())) {
        return null;
      }
      paramReferenceEntry1 = this.a.p.a(this, paramReferenceEntry1, paramReferenceEntry2);
      paramReferenceEntry1.a(localt.a(this.i, localObject, paramReferenceEntry1));
      return paramReferenceEntry1;
    }
    
    @Nullable
    @GuardedBy("this")
    private LocalCache.ReferenceEntry<K, V> a(LocalCache.ReferenceEntry<K, V> paramReferenceEntry1, LocalCache.ReferenceEntry<K, V> paramReferenceEntry2, @Nullable K paramK, V paramV, LocalCache.t<K, V> paramt, b paramb)
    {
      a(paramK, paramV, paramt.a(), paramb);
      this.l.remove(paramReferenceEntry2);
      this.m.remove(paramReferenceEntry2);
      if (paramt.c())
      {
        paramt.a(null);
        return paramReferenceEntry1;
      }
      return b(paramReferenceEntry1, paramReferenceEntry2);
    }
    
    @Nullable
    private LocalCache.ReferenceEntry<K, V> a(Object paramObject, int paramInt, long paramLong)
    {
      paramObject = e(paramObject, paramInt);
      if (paramObject == null) {
        return null;
      }
      if (this.a.a((LocalCache.ReferenceEntry)paramObject, paramLong))
      {
        a(paramLong);
        return null;
      }
      return (LocalCache.ReferenceEntry<K, V>)paramObject;
    }
    
    @GuardedBy("this")
    private LocalCache.ReferenceEntry<K, V> a(K paramK, int paramInt, @Nullable LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      return this.a.p.a(this, j.a(paramK), paramInt, paramReferenceEntry);
    }
    
    @Nullable
    private V a(final K paramK, final int paramInt, final a<? super K, V> parama)
    {
      final LocalCache.i locali = d(paramK, paramInt);
      if (locali == null) {
        return null;
      }
      parama = locali.a(paramK, parama);
      parama.a(new Runnable()
      {
        public final void run()
        {
          try
          {
            LocalCache.k.this.a(paramK, paramInt, locali, parama);
            return;
          }
          catch (Throwable localThrowable)
          {
            LocalCache.a.log(Level.WARNING, "Exception thrown during refresh", localThrowable);
            locali.a(localThrowable);
          }
        }
      }, j.a.a);
      if (parama.isDone()) {}
      try
      {
        paramK = l.a(parama);
        return paramK;
      }
      catch (Throwable paramK) {}
      return null;
      return null;
    }
    
    private static AtomicReferenceArray<LocalCache.ReferenceEntry<K, V>> a(int paramInt)
    {
      return new AtomicReferenceArray(paramInt);
    }
    
    @GuardedBy("this")
    private void a(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      int n;
      if (this.a.i >= 0L) {
        n = 1;
      } else {
        n = 0;
      }
      if (n == 0) {
        return;
      }
      g();
      if ((paramReferenceEntry.a().a() > this.g) && (!a(paramReferenceEntry, paramReferenceEntry.c(), b.e))) {
        throw new AssertionError();
      }
      while (this.c > this.g)
      {
        paramReferenceEntry = h();
        if (!a(paramReferenceEntry, paramReferenceEntry.c(), b.e)) {
          throw new AssertionError();
        }
      }
    }
    
    @GuardedBy("this")
    private void a(LocalCache.ReferenceEntry<K, V> paramReferenceEntry, long paramLong)
    {
      if (this.a.b()) {
        paramReferenceEntry.a(paramLong);
      }
      this.m.add(paramReferenceEntry);
    }
    
    @GuardedBy("this")
    private void a(LocalCache.ReferenceEntry<K, V> paramReferenceEntry, V paramV, long paramLong)
    {
      LocalCache.t localt = paramReferenceEntry.a();
      int i1 = this.a.j.a();
      int n = 0;
      boolean bool;
      if (i1 >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      j.b(bool, "Weights must be non-negative");
      paramReferenceEntry.a(this.a.h.a(this, paramReferenceEntry, paramV, i1));
      g();
      this.c += i1;
      if (this.a.b()) {
        paramReferenceEntry.a(paramLong);
      }
      LocalCache localLocalCache = this.a;
      if ((localLocalCache.a()) || (localLocalCache.c())) {
        n = 1;
      }
      if (n != 0) {
        paramReferenceEntry.b(paramLong);
      }
      this.m.add(paramReferenceEntry);
      this.l.add(paramReferenceEntry);
      localt.a(paramV);
    }
    
    @GuardedBy("this")
    private boolean a(LocalCache.ReferenceEntry<K, V> paramReferenceEntry, int paramInt, b paramb)
    {
      int n = this.b;
      AtomicReferenceArray localAtomicReferenceArray = this.f;
      paramInt &= localAtomicReferenceArray.length() - 1;
      LocalCache.ReferenceEntry localReferenceEntry2 = (LocalCache.ReferenceEntry)localAtomicReferenceArray.get(paramInt);
      for (LocalCache.ReferenceEntry localReferenceEntry1 = localReferenceEntry2; localReferenceEntry1 != null; localReferenceEntry1 = localReferenceEntry1.b()) {
        if (localReferenceEntry1 == paramReferenceEntry)
        {
          this.d += 1;
          paramReferenceEntry = a(localReferenceEntry2, localReferenceEntry1, localReferenceEntry1.d(), localReferenceEntry1.a().get(), localReferenceEntry1.a(), paramb);
          n = this.b;
          localAtomicReferenceArray.set(paramInt, paramReferenceEntry);
          this.b = (n - 1);
          return true;
        }
      }
      return false;
    }
    
    /* Error */
    private boolean a(K paramK, int paramInt, LocalCache.i<K, V> parami)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual 254	com/google/common/cache/LocalCache$k:lock	()V
      //   4: aload_0
      //   5: getfield 233	com/google/common/cache/LocalCache$k:f	Ljava/util/concurrent/atomic/AtomicReferenceArray;
      //   8: astore 7
      //   10: aload 7
      //   12: invokevirtual 236	java/util/concurrent/atomic/AtomicReferenceArray:length	()I
      //   15: iconst_1
      //   16: isub
      //   17: iload_2
      //   18: iand
      //   19: istore 4
      //   21: aload 7
      //   23: iload 4
      //   25: invokevirtual 239	java/util/concurrent/atomic/AtomicReferenceArray:get	(I)Ljava/lang/Object;
      //   28: checkcast 40	com/google/common/cache/LocalCache$ReferenceEntry
      //   31: astore 6
      //   33: aload 6
      //   35: astore 5
      //   37: aload 5
      //   39: ifnull +101 -> 140
      //   42: aload 5
      //   44: invokeinterface 43 1 0
      //   49: astore 8
      //   51: aload 5
      //   53: invokeinterface 177 1 0
      //   58: iload_2
      //   59: if_icmpne +91 -> 150
      //   62: aload 8
      //   64: ifnull +86 -> 150
      //   67: aload_0
      //   68: getfield 56	com/google/common/cache/LocalCache$k:a	Lcom/google/common/cache/LocalCache;
      //   71: getfield 257	com/google/common/cache/LocalCache:e	Lcom/google/common/base/c;
      //   74: aload_1
      //   75: aload 8
      //   77: invokevirtual 262	com/google/common/base/c:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
      //   80: ifeq +70 -> 150
      //   83: aload 5
      //   85: invokeinterface 46 1 0
      //   90: aload_3
      //   91: if_acmpne +49 -> 140
      //   94: aload_3
      //   95: invokevirtual 263	com/google/common/cache/LocalCache$i:d	()Z
      //   98: ifeq +17 -> 115
      //   101: aload 5
      //   103: aload_3
      //   104: getfield 266	com/google/common/cache/LocalCache$i:a	Lcom/google/common/cache/LocalCache$t;
      //   107: invokeinterface 73 2 0
      //   112: goto +18 -> 130
      //   115: aload 7
      //   117: iload 4
      //   119: aload_0
      //   120: aload 6
      //   122: aload 5
      //   124: invokespecial 102	com/google/common/cache/LocalCache$k:b	(Lcom/google/common/cache/LocalCache$ReferenceEntry;Lcom/google/common/cache/LocalCache$ReferenceEntry;)Lcom/google/common/cache/LocalCache$ReferenceEntry;
      //   127: invokevirtual 247	java/util/concurrent/atomic/AtomicReferenceArray:set	(ILjava/lang/Object;)V
      //   130: aload_0
      //   131: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   134: aload_0
      //   135: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   138: iconst_1
      //   139: ireturn
      //   140: aload_0
      //   141: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   144: aload_0
      //   145: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   148: iconst_0
      //   149: ireturn
      //   150: aload 5
      //   152: invokeinterface 249 1 0
      //   157: astore 5
      //   159: goto -122 -> 37
      //   162: astore_1
      //   163: aload_0
      //   164: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   167: aload_0
      //   168: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   171: aload_1
      //   172: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	173	0	this	k
      //   0	173	1	paramK	K
      //   0	173	2	paramInt	int
      //   0	173	3	parami	LocalCache.i<K, V>
      //   19	99	4	n	int
      //   35	123	5	localReferenceEntry1	LocalCache.ReferenceEntry
      //   31	90	6	localReferenceEntry2	LocalCache.ReferenceEntry
      //   8	108	7	localAtomicReferenceArray	AtomicReferenceArray
      //   49	27	8	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   4	33	162	finally
      //   42	62	162	finally
      //   67	112	162	finally
      //   115	130	162	finally
      //   150	159	162	finally
    }
    
    /* Error */
    private boolean a(K paramK, int paramInt, LocalCache.i<K, V> parami, V paramV)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual 254	com/google/common/cache/LocalCache$k:lock	()V
      //   4: aload_0
      //   5: getfield 56	com/google/common/cache/LocalCache$k:a	Lcom/google/common/cache/LocalCache;
      //   8: getfield 277	com/google/common/cache/LocalCache:o	Lcom/google/common/base/m;
      //   11: invokevirtual 282	com/google/common/base/m:a	()J
      //   14: lstore 7
      //   16: aload_0
      //   17: lload 7
      //   19: invokevirtual 283	com/google/common/cache/LocalCache$k:b	(J)V
      //   22: aload_0
      //   23: getfield 231	com/google/common/cache/LocalCache$k:b	I
      //   26: iconst_1
      //   27: iadd
      //   28: istore 6
      //   30: iload 6
      //   32: istore 5
      //   34: iload 6
      //   36: aload_0
      //   37: getfield 285	com/google/common/cache/LocalCache$k:e	I
      //   40: if_icmple +15 -> 55
      //   43: aload_0
      //   44: invokespecial 287	com/google/common/cache/LocalCache$k:i	()V
      //   47: aload_0
      //   48: getfield 231	com/google/common/cache/LocalCache$k:b	I
      //   51: iconst_1
      //   52: iadd
      //   53: istore 5
      //   55: aload_0
      //   56: getfield 233	com/google/common/cache/LocalCache$k:f	Ljava/util/concurrent/atomic/AtomicReferenceArray;
      //   59: astore 11
      //   61: aload 11
      //   63: invokevirtual 236	java/util/concurrent/atomic/AtomicReferenceArray:length	()I
      //   66: iconst_1
      //   67: isub
      //   68: iload_2
      //   69: iand
      //   70: istore 6
      //   72: aload 11
      //   74: iload 6
      //   76: invokevirtual 239	java/util/concurrent/atomic/AtomicReferenceArray:get	(I)Ljava/lang/Object;
      //   79: checkcast 40	com/google/common/cache/LocalCache$ReferenceEntry
      //   82: astore 10
      //   84: aload 10
      //   86: astore 9
      //   88: aload 9
      //   90: ifnull +204 -> 294
      //   93: aload 9
      //   95: invokeinterface 43 1 0
      //   100: astore 12
      //   102: aload 9
      //   104: invokeinterface 177 1 0
      //   109: iload_2
      //   110: if_icmpne +172 -> 282
      //   113: aload 12
      //   115: ifnull +167 -> 282
      //   118: aload_0
      //   119: getfield 56	com/google/common/cache/LocalCache$k:a	Lcom/google/common/cache/LocalCache;
      //   122: getfield 257	com/google/common/cache/LocalCache:e	Lcom/google/common/base/c;
      //   125: aload_1
      //   126: aload 12
      //   128: invokevirtual 262	com/google/common/base/c:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
      //   131: ifeq +151 -> 282
      //   134: aload 9
      //   136: invokeinterface 46 1 0
      //   141: astore 10
      //   143: aload 10
      //   145: invokeinterface 51 1 0
      //   150: astore 11
      //   152: aload_3
      //   153: aload 10
      //   155: if_acmpeq +40 -> 195
      //   158: aload 11
      //   160: ifnonnull +14 -> 174
      //   163: aload 10
      //   165: getstatic 290	com/google/common/cache/LocalCache:r	Lcom/google/common/cache/LocalCache$t;
      //   168: if_acmpeq +6 -> 174
      //   171: goto +24 -> 195
      //   174: aload_0
      //   175: aload_1
      //   176: aload 4
      //   178: iconst_0
      //   179: getstatic 292	com/google/common/cache/b:b	Lcom/google/common/cache/b;
      //   182: invokevirtual 85	com/google/common/cache/LocalCache$k:a	(Ljava/lang/Object;Ljava/lang/Object;ILcom/google/common/cache/b;)V
      //   185: aload_0
      //   186: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   189: aload_0
      //   190: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   193: iconst_0
      //   194: ireturn
      //   195: aload_0
      //   196: aload_0
      //   197: getfield 241	com/google/common/cache/LocalCache$k:d	I
      //   200: iconst_1
      //   201: iadd
      //   202: putfield 241	com/google/common/cache/LocalCache$k:d	I
      //   205: iload 5
      //   207: istore_2
      //   208: aload_3
      //   209: invokevirtual 263	com/google/common/cache/LocalCache$i:d	()Z
      //   212: ifeq +39 -> 251
      //   215: aload 11
      //   217: ifnonnull +11 -> 228
      //   220: getstatic 294	com/google/common/cache/b:c	Lcom/google/common/cache/b;
      //   223: astore 10
      //   225: goto +8 -> 233
      //   228: getstatic 292	com/google/common/cache/b:b	Lcom/google/common/cache/b;
      //   231: astore 10
      //   233: aload_0
      //   234: aload_1
      //   235: aload 11
      //   237: aload_3
      //   238: invokevirtual 295	com/google/common/cache/LocalCache$i:a	()I
      //   241: aload 10
      //   243: invokevirtual 85	com/google/common/cache/LocalCache$k:a	(Ljava/lang/Object;Ljava/lang/Object;ILcom/google/common/cache/b;)V
      //   246: iload 5
      //   248: iconst_1
      //   249: isub
      //   250: istore_2
      //   251: aload_0
      //   252: aload 9
      //   254: aload 4
      //   256: lload 7
      //   258: invokespecial 297	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;J)V
      //   261: aload_0
      //   262: iload_2
      //   263: putfield 231	com/google/common/cache/LocalCache$k:b	I
      //   266: aload_0
      //   267: aload 9
      //   269: invokespecial 299	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;)V
      //   272: aload_0
      //   273: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   276: aload_0
      //   277: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   280: iconst_1
      //   281: ireturn
      //   282: aload 9
      //   284: invokeinterface 249 1 0
      //   289: astore 9
      //   291: goto -203 -> 88
      //   294: aload_0
      //   295: aload_0
      //   296: getfield 241	com/google/common/cache/LocalCache$k:d	I
      //   299: iconst_1
      //   300: iadd
      //   301: putfield 241	com/google/common/cache/LocalCache$k:d	I
      //   304: aload_0
      //   305: aload_1
      //   306: iload_2
      //   307: aload 10
      //   309: invokespecial 301	com/google/common/cache/LocalCache$k:a	(Ljava/lang/Object;ILcom/google/common/cache/LocalCache$ReferenceEntry;)Lcom/google/common/cache/LocalCache$ReferenceEntry;
      //   312: astore_1
      //   313: aload_0
      //   314: aload_1
      //   315: aload 4
      //   317: lload 7
      //   319: invokespecial 297	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;J)V
      //   322: aload 11
      //   324: iload 6
      //   326: aload_1
      //   327: invokevirtual 247	java/util/concurrent/atomic/AtomicReferenceArray:set	(ILjava/lang/Object;)V
      //   330: aload_0
      //   331: iload 5
      //   333: putfield 231	com/google/common/cache/LocalCache$k:b	I
      //   336: aload_0
      //   337: aload_1
      //   338: invokespecial 299	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;)V
      //   341: goto -69 -> 272
      //   344: astore_1
      //   345: aload_0
      //   346: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   349: aload_0
      //   350: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   353: aload_1
      //   354: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	355	0	this	k
      //   0	355	1	paramK	K
      //   0	355	2	paramInt	int
      //   0	355	3	parami	LocalCache.i<K, V>
      //   0	355	4	paramV	V
      //   32	300	5	n	int
      //   28	297	6	i1	int
      //   14	304	7	l1	long
      //   86	204	9	localObject1	Object
      //   82	226	10	localObject2	Object
      //   59	264	11	localObject3	Object
      //   100	27	12	localObject4	Object
      // Exception table:
      //   from	to	target	type
      //   4	30	344	finally
      //   34	55	344	finally
      //   55	84	344	finally
      //   93	113	344	finally
      //   118	152	344	finally
      //   163	171	344	finally
      //   174	185	344	finally
      //   195	205	344	finally
      //   208	215	344	finally
      //   220	225	344	finally
      //   228	233	344	finally
      //   233	246	344	finally
      //   251	272	344	finally
      //   282	291	344	finally
      //   294	341	344	finally
    }
    
    @Nullable
    @GuardedBy("this")
    private LocalCache.ReferenceEntry<K, V> b(LocalCache.ReferenceEntry<K, V> paramReferenceEntry1, LocalCache.ReferenceEntry<K, V> paramReferenceEntry2)
    {
      int n = this.b;
      Object localObject = paramReferenceEntry2.b();
      while (paramReferenceEntry1 != paramReferenceEntry2)
      {
        LocalCache.ReferenceEntry localReferenceEntry = a(paramReferenceEntry1, (LocalCache.ReferenceEntry)localObject);
        if (localReferenceEntry != null)
        {
          localObject = localReferenceEntry;
        }
        else
        {
          b(paramReferenceEntry1);
          n -= 1;
        }
        paramReferenceEntry1 = paramReferenceEntry1.b();
      }
      this.b = n;
      return (LocalCache.ReferenceEntry<K, V>)localObject;
    }
    
    @GuardedBy("this")
    private void b(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      Object localObject = paramReferenceEntry.d();
      paramReferenceEntry.c();
      a(localObject, paramReferenceEntry.a().get(), paramReferenceEntry.a().a(), b.c);
      this.l.remove(paramReferenceEntry);
      this.m.remove(paramReferenceEntry);
    }
    
    @GuardedBy("this")
    private void c(long paramLong)
    {
      g();
      LocalCache.ReferenceEntry localReferenceEntry;
      do
      {
        localReferenceEntry = (LocalCache.ReferenceEntry)this.l.peek();
        if ((localReferenceEntry == null) || (!this.a.a(localReferenceEntry, paramLong))) {
          break;
        }
      } while (a(localReferenceEntry, localReferenceEntry.c(), b.d));
      throw new AssertionError();
      do
      {
        localReferenceEntry = (LocalCache.ReferenceEntry)this.m.peek();
        if ((localReferenceEntry == null) || (!this.a.a(localReferenceEntry, paramLong))) {
          break;
        }
      } while (a(localReferenceEntry, localReferenceEntry.c(), b.d));
      throw new AssertionError();
    }
    
    @Nullable
    private LocalCache.i<K, V> d(K paramK, int paramInt)
    {
      lock();
      try
      {
        long l1 = this.a.o.a();
        b(l1);
        AtomicReferenceArray localAtomicReferenceArray = this.f;
        int n = localAtomicReferenceArray.length() - 1 & paramInt;
        LocalCache.ReferenceEntry localReferenceEntry = (LocalCache.ReferenceEntry)localAtomicReferenceArray.get(n);
        for (Object localObject1 = localReferenceEntry; localObject1 != null; localObject1 = ((LocalCache.ReferenceEntry)localObject1).b())
        {
          Object localObject2 = ((LocalCache.ReferenceEntry)localObject1).d();
          if ((((LocalCache.ReferenceEntry)localObject1).c() == paramInt) && (localObject2 != null) && (this.a.e.a(paramK, localObject2)))
          {
            paramK = ((LocalCache.ReferenceEntry)localObject1).a();
            if ((!paramK.c()) && (l1 - ((LocalCache.ReferenceEntry)localObject1).h() >= this.a.m))
            {
              this.d += 1;
              paramK = new LocalCache.i(paramK);
              ((LocalCache.ReferenceEntry)localObject1).a(paramK);
              return paramK;
            }
            return null;
          }
        }
        this.d += 1;
        localObject1 = new LocalCache.i();
        paramK = a(paramK, paramInt, localReferenceEntry);
        paramK.a((LocalCache.t)localObject1);
        localAtomicReferenceArray.set(n, paramK);
        return (LocalCache.i<K, V>)localObject1;
      }
      finally
      {
        unlock();
        c();
      }
    }
    
    @GuardedBy("this")
    private void d()
    {
      if (this.a.d()) {
        e();
      }
      if (this.a.e()) {
        f();
      }
    }
    
    @Nullable
    private LocalCache.ReferenceEntry<K, V> e(Object paramObject, int paramInt)
    {
      Object localObject1 = this.f;
      for (localObject1 = (LocalCache.ReferenceEntry)((AtomicReferenceArray)localObject1).get(((AtomicReferenceArray)localObject1).length() - 1 & paramInt); localObject1 != null; localObject1 = ((LocalCache.ReferenceEntry)localObject1).b()) {
        if (((LocalCache.ReferenceEntry)localObject1).c() == paramInt)
        {
          Object localObject2 = ((LocalCache.ReferenceEntry)localObject1).d();
          if (localObject2 == null) {
            a();
          } else if (this.a.e.a(paramObject, localObject2)) {
            return (LocalCache.ReferenceEntry<K, V>)localObject1;
          }
        }
      }
      return null;
    }
    
    @GuardedBy("this")
    private void e()
    {
      int n = 0;
      int i1;
      do
      {
        Object localObject = this.h.poll();
        if (localObject == null) {
          break;
        }
        localObject = (LocalCache.ReferenceEntry)localObject;
        this.a.a((LocalCache.ReferenceEntry)localObject);
        i1 = n + 1;
        n = i1;
      } while (i1 != 16);
    }
    
    @GuardedBy("this")
    private void f()
    {
      int n = 0;
      int i1;
      do
      {
        Object localObject = this.i.poll();
        if (localObject == null) {
          break;
        }
        localObject = (LocalCache.t)localObject;
        this.a.a((LocalCache.t)localObject);
        i1 = n + 1;
        n = i1;
      } while (i1 != 16);
    }
    
    @GuardedBy("this")
    private void g()
    {
      for (;;)
      {
        LocalCache.ReferenceEntry localReferenceEntry = (LocalCache.ReferenceEntry)this.j.poll();
        if (localReferenceEntry == null) {
          break;
        }
        if (this.m.contains(localReferenceEntry)) {
          this.m.add(localReferenceEntry);
        }
      }
    }
    
    @GuardedBy("this")
    private LocalCache.ReferenceEntry<K, V> h()
    {
      Iterator localIterator = this.m.iterator();
      while (localIterator.hasNext())
      {
        LocalCache.ReferenceEntry localReferenceEntry = (LocalCache.ReferenceEntry)localIterator.next();
        if (localReferenceEntry.a().a() > 0) {
          return localReferenceEntry;
        }
      }
      throw new AssertionError();
    }
    
    @GuardedBy("this")
    private void i()
    {
      AtomicReferenceArray localAtomicReferenceArray1 = this.f;
      int i5 = localAtomicReferenceArray1.length();
      if (i5 >= 1073741824) {
        return;
      }
      int n = this.b;
      AtomicReferenceArray localAtomicReferenceArray2 = a(i5 << 1);
      this.e = (localAtomicReferenceArray2.length() * 3 / 4);
      int i6 = localAtomicReferenceArray2.length() - 1;
      int i1 = 0;
      while (i1 < i5)
      {
        LocalCache.ReferenceEntry localReferenceEntry2 = (LocalCache.ReferenceEntry)localAtomicReferenceArray1.get(i1);
        int i2 = n;
        if (localReferenceEntry2 != null)
        {
          LocalCache.ReferenceEntry localReferenceEntry1 = localReferenceEntry2.b();
          i2 = localReferenceEntry2.c() & i6;
          if (localReferenceEntry1 == null)
          {
            localAtomicReferenceArray2.set(i2, localReferenceEntry2);
            i2 = n;
          }
          else
          {
            LocalCache.ReferenceEntry localReferenceEntry3 = localReferenceEntry2;
            while (localReferenceEntry1 != null)
            {
              int i4 = localReferenceEntry1.c() & i6;
              int i3 = i2;
              if (i4 != i2)
              {
                localReferenceEntry3 = localReferenceEntry1;
                i3 = i4;
              }
              localReferenceEntry1 = localReferenceEntry1.b();
              i2 = i3;
            }
            localAtomicReferenceArray2.set(i2, localReferenceEntry3);
            for (;;)
            {
              i2 = n;
              if (localReferenceEntry2 == localReferenceEntry3) {
                break;
              }
              i2 = localReferenceEntry2.c() & i6;
              localReferenceEntry1 = a(localReferenceEntry2, (LocalCache.ReferenceEntry)localAtomicReferenceArray2.get(i2));
              if (localReferenceEntry1 != null)
              {
                localAtomicReferenceArray2.set(i2, localReferenceEntry1);
              }
              else
              {
                b(localReferenceEntry2);
                n -= 1;
              }
              localReferenceEntry2 = localReferenceEntry2.b();
            }
          }
        }
        i1 += 1;
        n = i2;
      }
      this.f = localAtomicReferenceArray2;
      this.b = n;
    }
    
    private void j()
    {
      b(this.a.o.a());
      c();
    }
    
    @Nullable
    final V a(Object paramObject, int paramInt)
    {
      try
      {
        if (this.b != 0)
        {
          long l1 = this.a.o.a();
          Object localObject1 = a(paramObject, paramInt, l1);
          if (localObject1 == null) {
            return null;
          }
          paramObject = ((LocalCache.ReferenceEntry)localObject1).a().get();
          if (paramObject != null)
          {
            if (this.a.b()) {
              ((LocalCache.ReferenceEntry)localObject1).a(l1);
            }
            this.j.add(localObject1);
            Object localObject2 = ((LocalCache.ReferenceEntry)localObject1).d();
            a locala = this.a.q;
            if ((this.a.c()) && (l1 - ((LocalCache.ReferenceEntry)localObject1).h() > this.a.m) && (!((LocalCache.ReferenceEntry)localObject1).a().c()))
            {
              localObject1 = a(localObject2, paramInt, locala);
              if (localObject1 != null) {
                paramObject = localObject1;
              }
            }
            return (V)paramObject;
          }
          a();
        }
        return null;
      }
      finally
      {
        b();
      }
    }
    
    /* Error */
    final V a(K paramK, int paramInt, LocalCache.i<K, V> parami, i<V> parami1)
      throws java.util.concurrent.ExecutionException
    {
      // Byte code:
      //   0: aload 4
      //   2: invokestatic 159	com/google/common/d/a/l:a	(Ljava/util/concurrent/Future;)Ljava/lang/Object;
      //   5: astore 5
      //   7: aload 5
      //   9: ifnull +39 -> 48
      //   12: aload_3
      //   13: invokevirtual 379	com/google/common/cache/LocalCache$i:e	()J
      //   16: pop2
      //   17: aload_0
      //   18: aload_1
      //   19: iload_2
      //   20: aload_3
      //   21: aload 5
      //   23: invokespecial 381	com/google/common/cache/LocalCache$k:a	(Ljava/lang/Object;ILcom/google/common/cache/LocalCache$i;Ljava/lang/Object;)Z
      //   26: pop
      //   27: aload 5
      //   29: ifnonnull +16 -> 45
      //   32: aload_3
      //   33: invokevirtual 379	com/google/common/cache/LocalCache$i:e	()J
      //   36: pop2
      //   37: aload_0
      //   38: aload_1
      //   39: iload_2
      //   40: aload_3
      //   41: invokespecial 383	com/google/common/cache/LocalCache$k:a	(Ljava/lang/Object;ILcom/google/common/cache/LocalCache$i;)Z
      //   44: pop
      //   45: aload 5
      //   47: areturn
      //   48: new 385	java/lang/StringBuilder
      //   51: dup
      //   52: ldc_w 387
      //   55: invokespecial 390	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   58: astore 4
      //   60: aload 4
      //   62: aload_1
      //   63: invokevirtual 394	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   66: pop
      //   67: aload 4
      //   69: ldc_w 396
      //   72: invokevirtual 399	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   75: pop
      //   76: new 401	com/google/common/cache/a$a
      //   79: dup
      //   80: aload 4
      //   82: invokevirtual 405	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   85: invokespecial 406	com/google/common/cache/a$a:<init>	(Ljava/lang/String;)V
      //   88: athrow
      //   89: astore 4
      //   91: goto +8 -> 99
      //   94: astore 4
      //   96: aconst_null
      //   97: astore 5
      //   99: aload 5
      //   101: ifnonnull +16 -> 117
      //   104: aload_3
      //   105: invokevirtual 379	com/google/common/cache/LocalCache$i:e	()J
      //   108: pop2
      //   109: aload_0
      //   110: aload_1
      //   111: iload_2
      //   112: aload_3
      //   113: invokespecial 383	com/google/common/cache/LocalCache$k:a	(Ljava/lang/Object;ILcom/google/common/cache/LocalCache$i;)Z
      //   116: pop
      //   117: aload 4
      //   119: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	120	0	this	k
      //   0	120	1	paramK	K
      //   0	120	2	paramInt	int
      //   0	120	3	parami	LocalCache.i<K, V>
      //   0	120	4	parami1	i<V>
      //   5	95	5	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   12	27	89	finally
      //   48	89	89	finally
      //   0	7	94	finally
    }
    
    /* Error */
    @Nullable
    final V a(K paramK, int paramInt, V paramV)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual 254	com/google/common/cache/LocalCache$k:lock	()V
      //   4: aload_0
      //   5: getfield 56	com/google/common/cache/LocalCache$k:a	Lcom/google/common/cache/LocalCache;
      //   8: getfield 277	com/google/common/cache/LocalCache:o	Lcom/google/common/base/m;
      //   11: invokevirtual 282	com/google/common/base/m:a	()J
      //   14: lstore 5
      //   16: aload_0
      //   17: lload 5
      //   19: invokevirtual 283	com/google/common/cache/LocalCache$k:b	(J)V
      //   22: aload_0
      //   23: getfield 233	com/google/common/cache/LocalCache$k:f	Ljava/util/concurrent/atomic/AtomicReferenceArray;
      //   26: astore 9
      //   28: aload 9
      //   30: invokevirtual 236	java/util/concurrent/atomic/AtomicReferenceArray:length	()I
      //   33: iconst_1
      //   34: isub
      //   35: iload_2
      //   36: iand
      //   37: istore 4
      //   39: aload 9
      //   41: iload 4
      //   43: invokevirtual 239	java/util/concurrent/atomic/AtomicReferenceArray:get	(I)Ljava/lang/Object;
      //   46: checkcast 40	com/google/common/cache/LocalCache$ReferenceEntry
      //   49: astore 8
      //   51: aload 8
      //   53: astore 7
      //   55: aload 7
      //   57: ifnull +130 -> 187
      //   60: aload 7
      //   62: invokeinterface 43 1 0
      //   67: astore 10
      //   69: aload 7
      //   71: invokeinterface 177 1 0
      //   76: iload_2
      //   77: if_icmpne +173 -> 250
      //   80: aload 10
      //   82: ifnull +168 -> 250
      //   85: aload_0
      //   86: getfield 56	com/google/common/cache/LocalCache$k:a	Lcom/google/common/cache/LocalCache;
      //   89: getfield 257	com/google/common/cache/LocalCache:e	Lcom/google/common/base/c;
      //   92: aload_1
      //   93: aload 10
      //   95: invokevirtual 262	com/google/common/base/c:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
      //   98: ifeq +152 -> 250
      //   101: aload 7
      //   103: invokeinterface 46 1 0
      //   108: astore 11
      //   110: aload 11
      //   112: invokeinterface 51 1 0
      //   117: astore 12
      //   119: aload 12
      //   121: ifnonnull +76 -> 197
      //   124: aload 11
      //   126: invokeinterface 54 1 0
      //   131: ifeq +56 -> 187
      //   134: aload_0
      //   135: getfield 231	com/google/common/cache/LocalCache$k:b	I
      //   138: istore_2
      //   139: aload_0
      //   140: aload_0
      //   141: getfield 241	com/google/common/cache/LocalCache$k:d	I
      //   144: iconst_1
      //   145: iadd
      //   146: putfield 241	com/google/common/cache/LocalCache$k:d	I
      //   149: aload_0
      //   150: aload 8
      //   152: aload 7
      //   154: aload 10
      //   156: aload 12
      //   158: aload 11
      //   160: getstatic 294	com/google/common/cache/b:c	Lcom/google/common/cache/b;
      //   163: invokespecial 243	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;Lcom/google/common/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/common/cache/LocalCache$t;Lcom/google/common/cache/b;)Lcom/google/common/cache/LocalCache$ReferenceEntry;
      //   166: astore_1
      //   167: aload_0
      //   168: getfield 231	com/google/common/cache/LocalCache$k:b	I
      //   171: istore_2
      //   172: aload 9
      //   174: iload 4
      //   176: aload_1
      //   177: invokevirtual 247	java/util/concurrent/atomic/AtomicReferenceArray:set	(ILjava/lang/Object;)V
      //   180: aload_0
      //   181: iload_2
      //   182: iconst_1
      //   183: isub
      //   184: putfield 231	com/google/common/cache/LocalCache$k:b	I
      //   187: aload_0
      //   188: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   191: aload_0
      //   192: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   195: aconst_null
      //   196: areturn
      //   197: aload_0
      //   198: aload_0
      //   199: getfield 241	com/google/common/cache/LocalCache$k:d	I
      //   202: iconst_1
      //   203: iadd
      //   204: putfield 241	com/google/common/cache/LocalCache$k:d	I
      //   207: aload_0
      //   208: aload_1
      //   209: aload 12
      //   211: aload 11
      //   213: invokeinterface 82 1 0
      //   218: getstatic 292	com/google/common/cache/b:b	Lcom/google/common/cache/b;
      //   221: invokevirtual 85	com/google/common/cache/LocalCache$k:a	(Ljava/lang/Object;Ljava/lang/Object;ILcom/google/common/cache/b;)V
      //   224: aload_0
      //   225: aload 7
      //   227: aload_3
      //   228: lload 5
      //   230: invokespecial 297	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;J)V
      //   233: aload_0
      //   234: aload 7
      //   236: invokespecial 299	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;)V
      //   239: aload_0
      //   240: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   243: aload_0
      //   244: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   247: aload 12
      //   249: areturn
      //   250: aload 7
      //   252: invokeinterface 249 1 0
      //   257: astore 7
      //   259: goto -204 -> 55
      //   262: astore_1
      //   263: aload_0
      //   264: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   267: aload_0
      //   268: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   271: aload_1
      //   272: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	273	0	this	k
      //   0	273	1	paramK	K
      //   0	273	2	paramInt	int
      //   0	273	3	paramV	V
      //   37	138	4	n	int
      //   14	215	5	l1	long
      //   53	205	7	localReferenceEntry1	LocalCache.ReferenceEntry
      //   49	102	8	localReferenceEntry2	LocalCache.ReferenceEntry
      //   26	147	9	localAtomicReferenceArray	AtomicReferenceArray
      //   67	88	10	localObject1	Object
      //   108	104	11	localt	LocalCache.t
      //   117	131	12	localObject2	Object
      // Exception table:
      //   from	to	target	type
      //   4	51	262	finally
      //   60	80	262	finally
      //   85	119	262	finally
      //   124	187	262	finally
      //   197	239	262	finally
      //   250	259	262	finally
    }
    
    /* Error */
    @Nullable
    final V a(K paramK, int paramInt, V paramV, boolean paramBoolean)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual 254	com/google/common/cache/LocalCache$k:lock	()V
      //   4: aload_0
      //   5: getfield 56	com/google/common/cache/LocalCache$k:a	Lcom/google/common/cache/LocalCache;
      //   8: getfield 277	com/google/common/cache/LocalCache:o	Lcom/google/common/base/m;
      //   11: invokevirtual 282	com/google/common/base/m:a	()J
      //   14: lstore 6
      //   16: aload_0
      //   17: lload 6
      //   19: invokevirtual 283	com/google/common/cache/LocalCache$k:b	(J)V
      //   22: aload_0
      //   23: getfield 231	com/google/common/cache/LocalCache$k:b	I
      //   26: iconst_1
      //   27: iadd
      //   28: aload_0
      //   29: getfield 285	com/google/common/cache/LocalCache$k:e	I
      //   32: if_icmple +13 -> 45
      //   35: aload_0
      //   36: invokespecial 287	com/google/common/cache/LocalCache$k:i	()V
      //   39: aload_0
      //   40: getfield 231	com/google/common/cache/LocalCache$k:b	I
      //   43: istore 5
      //   45: aload_0
      //   46: getfield 233	com/google/common/cache/LocalCache$k:f	Ljava/util/concurrent/atomic/AtomicReferenceArray;
      //   49: astore 10
      //   51: aload 10
      //   53: invokevirtual 236	java/util/concurrent/atomic/AtomicReferenceArray:length	()I
      //   56: iconst_1
      //   57: isub
      //   58: iload_2
      //   59: iand
      //   60: istore 5
      //   62: aload 10
      //   64: iload 5
      //   66: invokevirtual 239	java/util/concurrent/atomic/AtomicReferenceArray:get	(I)Ljava/lang/Object;
      //   69: checkcast 40	com/google/common/cache/LocalCache$ReferenceEntry
      //   72: astore 9
      //   74: aload 9
      //   76: astore 8
      //   78: aload 8
      //   80: ifnull +239 -> 319
      //   83: aload 8
      //   85: invokeinterface 43 1 0
      //   90: astore 11
      //   92: aload 8
      //   94: invokeinterface 177 1 0
      //   99: iload_2
      //   100: if_icmpne +207 -> 307
      //   103: aload 11
      //   105: ifnull +202 -> 307
      //   108: aload_0
      //   109: getfield 56	com/google/common/cache/LocalCache$k:a	Lcom/google/common/cache/LocalCache;
      //   112: getfield 257	com/google/common/cache/LocalCache:e	Lcom/google/common/base/c;
      //   115: aload_1
      //   116: aload 11
      //   118: invokevirtual 262	com/google/common/base/c:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
      //   121: ifeq +186 -> 307
      //   124: aload 8
      //   126: invokeinterface 46 1 0
      //   131: astore 9
      //   133: aload 9
      //   135: invokeinterface 51 1 0
      //   140: astore 10
      //   142: aload 10
      //   144: ifnonnull +94 -> 238
      //   147: aload_0
      //   148: aload_0
      //   149: getfield 241	com/google/common/cache/LocalCache$k:d	I
      //   152: iconst_1
      //   153: iadd
      //   154: putfield 241	com/google/common/cache/LocalCache$k:d	I
      //   157: aload 9
      //   159: invokeinterface 54 1 0
      //   164: ifeq +37 -> 201
      //   167: aload_0
      //   168: aload_1
      //   169: aload 10
      //   171: aload 9
      //   173: invokeinterface 82 1 0
      //   178: getstatic 294	com/google/common/cache/b:c	Lcom/google/common/cache/b;
      //   181: invokevirtual 85	com/google/common/cache/LocalCache$k:a	(Ljava/lang/Object;Ljava/lang/Object;ILcom/google/common/cache/b;)V
      //   184: aload_0
      //   185: aload 8
      //   187: aload_3
      //   188: lload 6
      //   190: invokespecial 297	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;J)V
      //   193: aload_0
      //   194: getfield 231	com/google/common/cache/LocalCache$k:b	I
      //   197: istore_2
      //   198: goto +19 -> 217
      //   201: aload_0
      //   202: aload 8
      //   204: aload_3
      //   205: lload 6
      //   207: invokespecial 297	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;J)V
      //   210: aload_0
      //   211: getfield 231	com/google/common/cache/LocalCache$k:b	I
      //   214: iconst_1
      //   215: iadd
      //   216: istore_2
      //   217: aload_0
      //   218: iload_2
      //   219: putfield 231	com/google/common/cache/LocalCache$k:b	I
      //   222: aload_0
      //   223: aload 8
      //   225: invokespecial 299	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;)V
      //   228: aload_0
      //   229: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   232: aload_0
      //   233: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   236: aconst_null
      //   237: areturn
      //   238: iload 4
      //   240: ifeq +22 -> 262
      //   243: aload_0
      //   244: aload 8
      //   246: lload 6
      //   248: invokespecial 413	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;J)V
      //   251: aload_0
      //   252: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   255: aload_0
      //   256: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   259: aload 10
      //   261: areturn
      //   262: aload_0
      //   263: aload_0
      //   264: getfield 241	com/google/common/cache/LocalCache$k:d	I
      //   267: iconst_1
      //   268: iadd
      //   269: putfield 241	com/google/common/cache/LocalCache$k:d	I
      //   272: aload_0
      //   273: aload_1
      //   274: aload 10
      //   276: aload 9
      //   278: invokeinterface 82 1 0
      //   283: getstatic 292	com/google/common/cache/b:b	Lcom/google/common/cache/b;
      //   286: invokevirtual 85	com/google/common/cache/LocalCache$k:a	(Ljava/lang/Object;Ljava/lang/Object;ILcom/google/common/cache/b;)V
      //   289: aload_0
      //   290: aload 8
      //   292: aload_3
      //   293: lload 6
      //   295: invokespecial 297	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;J)V
      //   298: aload_0
      //   299: aload 8
      //   301: invokespecial 299	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;)V
      //   304: goto -53 -> 251
      //   307: aload 8
      //   309: invokeinterface 249 1 0
      //   314: astore 8
      //   316: goto -238 -> 78
      //   319: aload_0
      //   320: aload_0
      //   321: getfield 241	com/google/common/cache/LocalCache$k:d	I
      //   324: iconst_1
      //   325: iadd
      //   326: putfield 241	com/google/common/cache/LocalCache$k:d	I
      //   329: aload_0
      //   330: aload_1
      //   331: iload_2
      //   332: aload 9
      //   334: invokespecial 301	com/google/common/cache/LocalCache$k:a	(Ljava/lang/Object;ILcom/google/common/cache/LocalCache$ReferenceEntry;)Lcom/google/common/cache/LocalCache$ReferenceEntry;
      //   337: astore_1
      //   338: aload_0
      //   339: aload_1
      //   340: aload_3
      //   341: lload 6
      //   343: invokespecial 297	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;J)V
      //   346: aload 10
      //   348: iload 5
      //   350: aload_1
      //   351: invokevirtual 247	java/util/concurrent/atomic/AtomicReferenceArray:set	(ILjava/lang/Object;)V
      //   354: aload_0
      //   355: aload_0
      //   356: getfield 231	com/google/common/cache/LocalCache$k:b	I
      //   359: iconst_1
      //   360: iadd
      //   361: putfield 231	com/google/common/cache/LocalCache$k:b	I
      //   364: aload_0
      //   365: aload_1
      //   366: invokespecial 299	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;)V
      //   369: goto -141 -> 228
      //   372: astore_1
      //   373: aload_0
      //   374: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   377: aload_0
      //   378: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   381: aload_1
      //   382: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	383	0	this	k
      //   0	383	1	paramK	K
      //   0	383	2	paramInt	int
      //   0	383	3	paramV	V
      //   0	383	4	paramBoolean	boolean
      //   43	306	5	n	int
      //   14	328	6	l1	long
      //   76	239	8	localObject1	Object
      //   72	261	9	localObject2	Object
      //   49	298	10	localObject3	Object
      //   90	27	11	localObject4	Object
      // Exception table:
      //   from	to	target	type
      //   4	45	372	finally
      //   45	74	372	finally
      //   83	103	372	finally
      //   108	142	372	finally
      //   147	198	372	finally
      //   201	217	372	finally
      //   217	228	372	finally
      //   243	251	372	finally
      //   262	304	372	finally
      //   307	316	372	finally
      //   319	369	372	finally
    }
    
    final void a()
    {
      if (tryLock()) {
        try
        {
          d();
          return;
        }
        finally
        {
          unlock();
        }
      }
    }
    
    final void a(long paramLong)
    {
      if (tryLock()) {
        try
        {
          c(paramLong);
          return;
        }
        finally
        {
          unlock();
        }
      }
    }
    
    @GuardedBy("this")
    final void a(@Nullable K paramK, @Nullable V paramV, int paramInt, b paramb)
    {
      this.c -= paramInt;
      if (this.a.n != LocalCache.s)
      {
        paramK = c.a(paramK, paramV, paramb);
        this.a.n.offer(paramK);
      }
    }
    
    final boolean a(LocalCache.ReferenceEntry<K, V> paramReferenceEntry, int paramInt)
    {
      lock();
      try
      {
        int n = this.b;
        AtomicReferenceArray localAtomicReferenceArray = this.f;
        paramInt &= localAtomicReferenceArray.length() - 1;
        LocalCache.ReferenceEntry localReferenceEntry2 = (LocalCache.ReferenceEntry)localAtomicReferenceArray.get(paramInt);
        for (LocalCache.ReferenceEntry localReferenceEntry1 = localReferenceEntry2; localReferenceEntry1 != null; localReferenceEntry1 = localReferenceEntry1.b()) {
          if (localReferenceEntry1 == paramReferenceEntry)
          {
            this.d += 1;
            paramReferenceEntry = a(localReferenceEntry2, localReferenceEntry1, localReferenceEntry1.d(), localReferenceEntry1.a().get(), localReferenceEntry1.a(), b.c);
            n = this.b;
            localAtomicReferenceArray.set(paramInt, paramReferenceEntry);
            this.b = (n - 1);
            return true;
          }
        }
        return false;
      }
      finally
      {
        unlock();
        c();
      }
    }
    
    final boolean a(K paramK, int paramInt, LocalCache.t<K, V> paramt)
    {
      lock();
      try
      {
        int n = this.b;
        AtomicReferenceArray localAtomicReferenceArray = this.f;
        n = localAtomicReferenceArray.length() - 1 & paramInt;
        LocalCache.ReferenceEntry localReferenceEntry2 = (LocalCache.ReferenceEntry)localAtomicReferenceArray.get(n);
        for (LocalCache.ReferenceEntry localReferenceEntry1 = localReferenceEntry2; localReferenceEntry1 != null; localReferenceEntry1 = localReferenceEntry1.b())
        {
          Object localObject = localReferenceEntry1.d();
          if ((localReferenceEntry1.c() == paramInt) && (localObject != null) && (this.a.e.a(paramK, localObject)))
          {
            if (localReferenceEntry1.a() == paramt)
            {
              this.d += 1;
              paramK = a(localReferenceEntry2, localReferenceEntry1, localObject, paramt.get(), paramt, b.c);
              paramInt = this.b;
              localAtomicReferenceArray.set(n, paramK);
              this.b = (paramInt - 1);
              return true;
            }
            return false;
          }
        }
        return false;
      }
      finally
      {
        unlock();
        if (!isHeldByCurrentThread()) {
          c();
        }
      }
    }
    
    /* Error */
    final boolean a(K paramK, int paramInt, V paramV1, V paramV2)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual 254	com/google/common/cache/LocalCache$k:lock	()V
      //   4: aload_0
      //   5: getfield 56	com/google/common/cache/LocalCache$k:a	Lcom/google/common/cache/LocalCache;
      //   8: getfield 277	com/google/common/cache/LocalCache:o	Lcom/google/common/base/m;
      //   11: invokevirtual 282	com/google/common/base/m:a	()J
      //   14: lstore 6
      //   16: aload_0
      //   17: lload 6
      //   19: invokevirtual 283	com/google/common/cache/LocalCache$k:b	(J)V
      //   22: aload_0
      //   23: getfield 233	com/google/common/cache/LocalCache$k:f	Ljava/util/concurrent/atomic/AtomicReferenceArray;
      //   26: astore 10
      //   28: iload_2
      //   29: aload 10
      //   31: invokevirtual 236	java/util/concurrent/atomic/AtomicReferenceArray:length	()I
      //   34: iconst_1
      //   35: isub
      //   36: iand
      //   37: istore 5
      //   39: aload 10
      //   41: iload 5
      //   43: invokevirtual 239	java/util/concurrent/atomic/AtomicReferenceArray:get	(I)Ljava/lang/Object;
      //   46: checkcast 40	com/google/common/cache/LocalCache$ReferenceEntry
      //   49: astore 9
      //   51: aload 9
      //   53: astore 8
      //   55: aload 8
      //   57: ifnull +130 -> 187
      //   60: aload 8
      //   62: invokeinterface 43 1 0
      //   67: astore 11
      //   69: aload 8
      //   71: invokeinterface 177 1 0
      //   76: iload_2
      //   77: if_icmpne +200 -> 277
      //   80: aload 11
      //   82: ifnull +195 -> 277
      //   85: aload_0
      //   86: getfield 56	com/google/common/cache/LocalCache$k:a	Lcom/google/common/cache/LocalCache;
      //   89: getfield 257	com/google/common/cache/LocalCache:e	Lcom/google/common/base/c;
      //   92: aload_1
      //   93: aload 11
      //   95: invokevirtual 262	com/google/common/base/c:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
      //   98: ifeq +179 -> 277
      //   101: aload 8
      //   103: invokeinterface 46 1 0
      //   108: astore 12
      //   110: aload 12
      //   112: invokeinterface 51 1 0
      //   117: astore 13
      //   119: aload 13
      //   121: ifnonnull +76 -> 197
      //   124: aload 12
      //   126: invokeinterface 54 1 0
      //   131: ifeq +56 -> 187
      //   134: aload_0
      //   135: getfield 231	com/google/common/cache/LocalCache$k:b	I
      //   138: istore_2
      //   139: aload_0
      //   140: aload_0
      //   141: getfield 241	com/google/common/cache/LocalCache$k:d	I
      //   144: iconst_1
      //   145: iadd
      //   146: putfield 241	com/google/common/cache/LocalCache$k:d	I
      //   149: aload_0
      //   150: aload 9
      //   152: aload 8
      //   154: aload 11
      //   156: aload 13
      //   158: aload 12
      //   160: getstatic 294	com/google/common/cache/b:c	Lcom/google/common/cache/b;
      //   163: invokespecial 243	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;Lcom/google/common/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/common/cache/LocalCache$t;Lcom/google/common/cache/b;)Lcom/google/common/cache/LocalCache$ReferenceEntry;
      //   166: astore_1
      //   167: aload_0
      //   168: getfield 231	com/google/common/cache/LocalCache$k:b	I
      //   171: istore_2
      //   172: aload 10
      //   174: iload 5
      //   176: aload_1
      //   177: invokevirtual 247	java/util/concurrent/atomic/AtomicReferenceArray:set	(ILjava/lang/Object;)V
      //   180: aload_0
      //   181: iload_2
      //   182: iconst_1
      //   183: isub
      //   184: putfield 231	com/google/common/cache/LocalCache$k:b	I
      //   187: aload_0
      //   188: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   191: aload_0
      //   192: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   195: iconst_0
      //   196: ireturn
      //   197: aload_0
      //   198: getfield 56	com/google/common/cache/LocalCache$k:a	Lcom/google/common/cache/LocalCache;
      //   201: getfield 446	com/google/common/cache/LocalCache:f	Lcom/google/common/base/c;
      //   204: aload_3
      //   205: aload 13
      //   207: invokevirtual 262	com/google/common/base/c:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
      //   210: ifeq +56 -> 266
      //   213: aload_0
      //   214: aload_0
      //   215: getfield 241	com/google/common/cache/LocalCache$k:d	I
      //   218: iconst_1
      //   219: iadd
      //   220: putfield 241	com/google/common/cache/LocalCache$k:d	I
      //   223: aload_0
      //   224: aload_1
      //   225: aload 13
      //   227: aload 12
      //   229: invokeinterface 82 1 0
      //   234: getstatic 292	com/google/common/cache/b:b	Lcom/google/common/cache/b;
      //   237: invokevirtual 85	com/google/common/cache/LocalCache$k:a	(Ljava/lang/Object;Ljava/lang/Object;ILcom/google/common/cache/b;)V
      //   240: aload_0
      //   241: aload 8
      //   243: aload 4
      //   245: lload 6
      //   247: invokespecial 297	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;J)V
      //   250: aload_0
      //   251: aload 8
      //   253: invokespecial 299	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;)V
      //   256: aload_0
      //   257: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   260: aload_0
      //   261: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   264: iconst_1
      //   265: ireturn
      //   266: aload_0
      //   267: aload 8
      //   269: lload 6
      //   271: invokespecial 413	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;J)V
      //   274: goto -87 -> 187
      //   277: aload 8
      //   279: invokeinterface 249 1 0
      //   284: astore 8
      //   286: goto -231 -> 55
      //   289: astore_1
      //   290: aload_0
      //   291: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   294: aload_0
      //   295: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   298: aload_1
      //   299: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	300	0	this	k
      //   0	300	1	paramK	K
      //   0	300	2	paramInt	int
      //   0	300	3	paramV1	V
      //   0	300	4	paramV2	V
      //   37	138	5	n	int
      //   14	256	6	l1	long
      //   53	232	8	localReferenceEntry1	LocalCache.ReferenceEntry
      //   49	102	9	localReferenceEntry2	LocalCache.ReferenceEntry
      //   26	147	10	localAtomicReferenceArray	AtomicReferenceArray
      //   67	88	11	localObject1	Object
      //   108	120	12	localt	LocalCache.t
      //   117	109	13	localObject2	Object
      // Exception table:
      //   from	to	target	type
      //   4	51	289	finally
      //   60	80	289	finally
      //   85	119	289	finally
      //   124	187	289	finally
      //   197	256	289	finally
      //   266	274	289	finally
      //   277	286	289	finally
    }
    
    final void b()
    {
      if ((this.k.incrementAndGet() & 0x3F) == 0) {
        j();
      }
    }
    
    final void b(long paramLong)
    {
      if (tryLock()) {
        try
        {
          d();
          c(paramLong);
          this.k.set(0);
          return;
        }
        finally
        {
          unlock();
        }
      }
    }
    
    final boolean b(Object paramObject, int paramInt)
    {
      try
      {
        int n = this.b;
        boolean bool = false;
        if (n != 0)
        {
          paramObject = a(paramObject, paramInt, this.a.o.a());
          if (paramObject == null) {
            return false;
          }
          paramObject = ((LocalCache.ReferenceEntry)paramObject).a().get();
          if (paramObject != null) {
            bool = true;
          }
          return bool;
        }
        return false;
      }
      finally
      {
        b();
      }
    }
    
    /* Error */
    final boolean b(Object paramObject1, int paramInt, Object paramObject2)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual 254	com/google/common/cache/LocalCache$k:lock	()V
      //   4: aload_0
      //   5: aload_0
      //   6: getfield 56	com/google/common/cache/LocalCache$k:a	Lcom/google/common/cache/LocalCache;
      //   9: getfield 277	com/google/common/cache/LocalCache:o	Lcom/google/common/base/m;
      //   12: invokevirtual 282	com/google/common/base/m:a	()J
      //   15: invokevirtual 283	com/google/common/cache/LocalCache$k:b	(J)V
      //   18: aload_0
      //   19: getfield 231	com/google/common/cache/LocalCache$k:b	I
      //   22: istore 4
      //   24: aload_0
      //   25: getfield 233	com/google/common/cache/LocalCache$k:f	Ljava/util/concurrent/atomic/AtomicReferenceArray;
      //   28: astore 8
      //   30: aload 8
      //   32: invokevirtual 236	java/util/concurrent/atomic/AtomicReferenceArray:length	()I
      //   35: istore 4
      //   37: iconst_1
      //   38: istore 5
      //   40: iload 4
      //   42: iconst_1
      //   43: isub
      //   44: iload_2
      //   45: iand
      //   46: istore 4
      //   48: aload 8
      //   50: iload 4
      //   52: invokevirtual 239	java/util/concurrent/atomic/AtomicReferenceArray:get	(I)Ljava/lang/Object;
      //   55: checkcast 40	com/google/common/cache/LocalCache$ReferenceEntry
      //   58: astore 7
      //   60: aload 7
      //   62: astore 6
      //   64: aload 6
      //   66: ifnull +176 -> 242
      //   69: aload 6
      //   71: invokeinterface 43 1 0
      //   76: astore 9
      //   78: aload 6
      //   80: invokeinterface 177 1 0
      //   85: iload_2
      //   86: if_icmpne +166 -> 252
      //   89: aload 9
      //   91: ifnull +161 -> 252
      //   94: aload_0
      //   95: getfield 56	com/google/common/cache/LocalCache$k:a	Lcom/google/common/cache/LocalCache;
      //   98: getfield 257	com/google/common/cache/LocalCache:e	Lcom/google/common/base/c;
      //   101: aload_1
      //   102: aload 9
      //   104: invokevirtual 262	com/google/common/base/c:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
      //   107: ifeq +145 -> 252
      //   110: aload 6
      //   112: invokeinterface 46 1 0
      //   117: astore 10
      //   119: aload 10
      //   121: invokeinterface 51 1 0
      //   126: astore 11
      //   128: aload_0
      //   129: getfield 56	com/google/common/cache/LocalCache$k:a	Lcom/google/common/cache/LocalCache;
      //   132: getfield 446	com/google/common/cache/LocalCache:f	Lcom/google/common/base/c;
      //   135: aload_3
      //   136: aload 11
      //   138: invokevirtual 262	com/google/common/base/c:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
      //   141: ifeq +10 -> 151
      //   144: getstatic 462	com/google/common/cache/b:a	Lcom/google/common/cache/b;
      //   147: astore_1
      //   148: goto +22 -> 170
      //   151: aload 11
      //   153: ifnonnull +89 -> 242
      //   156: aload 10
      //   158: invokeinterface 54 1 0
      //   163: ifeq +79 -> 242
      //   166: getstatic 294	com/google/common/cache/b:c	Lcom/google/common/cache/b;
      //   169: astore_1
      //   170: aload_0
      //   171: aload_0
      //   172: getfield 241	com/google/common/cache/LocalCache$k:d	I
      //   175: iconst_1
      //   176: iadd
      //   177: putfield 241	com/google/common/cache/LocalCache$k:d	I
      //   180: aload_0
      //   181: aload 7
      //   183: aload 6
      //   185: aload 9
      //   187: aload 11
      //   189: aload 10
      //   191: aload_1
      //   192: invokespecial 243	com/google/common/cache/LocalCache$k:a	(Lcom/google/common/cache/LocalCache$ReferenceEntry;Lcom/google/common/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/common/cache/LocalCache$t;Lcom/google/common/cache/b;)Lcom/google/common/cache/LocalCache$ReferenceEntry;
      //   195: astore_3
      //   196: aload_0
      //   197: getfield 231	com/google/common/cache/LocalCache$k:b	I
      //   200: istore_2
      //   201: aload 8
      //   203: iload 4
      //   205: aload_3
      //   206: invokevirtual 247	java/util/concurrent/atomic/AtomicReferenceArray:set	(ILjava/lang/Object;)V
      //   209: aload_0
      //   210: iload_2
      //   211: iconst_1
      //   212: isub
      //   213: putfield 231	com/google/common/cache/LocalCache$k:b	I
      //   216: getstatic 462	com/google/common/cache/b:a	Lcom/google/common/cache/b;
      //   219: astore_3
      //   220: aload_1
      //   221: aload_3
      //   222: if_acmpne +6 -> 228
      //   225: goto +6 -> 231
      //   228: iconst_0
      //   229: istore 5
      //   231: aload_0
      //   232: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   235: aload_0
      //   236: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   239: iload 5
      //   241: ireturn
      //   242: aload_0
      //   243: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   246: aload_0
      //   247: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   250: iconst_0
      //   251: ireturn
      //   252: aload 6
      //   254: invokeinterface 249 1 0
      //   259: astore 6
      //   261: goto -197 -> 64
      //   264: astore_1
      //   265: aload_0
      //   266: invokevirtual 269	com/google/common/cache/LocalCache$k:unlock	()V
      //   269: aload_0
      //   270: invokevirtual 271	com/google/common/cache/LocalCache$k:c	()V
      //   273: aload_1
      //   274: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	275	0	this	k
      //   0	275	1	paramObject1	Object
      //   0	275	2	paramInt	int
      //   0	275	3	paramObject2	Object
      //   22	182	4	n	int
      //   38	202	5	bool	boolean
      //   62	198	6	localReferenceEntry1	LocalCache.ReferenceEntry
      //   58	124	7	localReferenceEntry2	LocalCache.ReferenceEntry
      //   28	174	8	localAtomicReferenceArray	AtomicReferenceArray
      //   76	110	9	localObject1	Object
      //   117	73	10	localt	LocalCache.t
      //   126	62	11	localObject2	Object
      // Exception table:
      //   from	to	target	type
      //   4	37	264	finally
      //   48	60	264	finally
      //   69	89	264	finally
      //   94	148	264	finally
      //   156	170	264	finally
      //   170	220	264	finally
      //   252	261	264	finally
    }
    
    @Nullable
    final V c(Object paramObject, int paramInt)
    {
      lock();
      try
      {
        b(this.a.o.a());
        int n = this.b;
        AtomicReferenceArray localAtomicReferenceArray = this.f;
        n = localAtomicReferenceArray.length() - 1 & paramInt;
        LocalCache.ReferenceEntry localReferenceEntry2 = (LocalCache.ReferenceEntry)localAtomicReferenceArray.get(n);
        LocalCache.ReferenceEntry localReferenceEntry1 = localReferenceEntry2;
        Object localObject1;
        LocalCache.t localt;
        Object localObject2;
        if (localReferenceEntry1 != null)
        {
          localObject1 = localReferenceEntry1.d();
          if ((localReferenceEntry1.c() != paramInt) || (localObject1 == null) || (!this.a.e.a(paramObject, localObject1))) {
            break label213;
          }
          localt = localReferenceEntry1.a();
          localObject2 = localt.get();
          if (localObject2 != null)
          {
            paramObject = b.a;
            break label236;
          }
          if (localt.d())
          {
            paramObject = b.c;
            break label236;
          }
        }
        for (;;)
        {
          this.d += 1;
          paramObject = a(localReferenceEntry2, localReferenceEntry1, localObject1, localObject2, localt, (b)paramObject);
          paramInt = this.b;
          localAtomicReferenceArray.set(n, paramObject);
          this.b = (paramInt - 1);
          return (V)localObject2;
          return null;
          label213:
          localReferenceEntry1 = localReferenceEntry1.b();
          break;
        }
      }
      finally
      {
        unlock();
        c();
      }
    }
    
    final void c()
    {
      if (!isHeldByCurrentThread()) {
        this.a.h();
      }
    }
  }
  
  static class l<K, V>
    extends SoftReference<V>
    implements LocalCache.t<K, V>
  {
    final LocalCache.ReferenceEntry<K, V> a;
    
    l(ReferenceQueue<V> paramReferenceQueue, V paramV, LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      super(paramReferenceQueue);
      this.a = paramReferenceEntry;
    }
    
    public int a()
    {
      return 1;
    }
    
    public LocalCache.t<K, V> a(ReferenceQueue<V> paramReferenceQueue, V paramV, LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      return new l(paramReferenceQueue, paramV, paramReferenceEntry);
    }
    
    public final void a(V paramV) {}
    
    public final LocalCache.ReferenceEntry<K, V> b()
    {
      return this.a;
    }
    
    public final boolean c()
    {
      return false;
    }
    
    public final boolean d()
    {
      return true;
    }
  }
  
  static abstract enum m
  {
    private m() {}
    
    abstract <K, V> LocalCache.t<K, V> a(LocalCache.k<K, V> paramk, LocalCache.ReferenceEntry<K, V> paramReferenceEntry, V paramV, int paramInt);
  }
  
  static final class n<K, V>
    extends LocalCache.p<K, V>
  {
    volatile long a = Long.MAX_VALUE;
    LocalCache.ReferenceEntry<K, V> b = LocalCache.g();
    LocalCache.ReferenceEntry<K, V> c = LocalCache.g();
    
    n(K paramK, int paramInt, @Nullable LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      super(paramInt, paramReferenceEntry);
    }
    
    public final void a(long paramLong)
    {
      this.a = paramLong;
    }
    
    public final void a(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.b = paramReferenceEntry;
    }
    
    public final void b(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.c = paramReferenceEntry;
    }
    
    public final long e()
    {
      return this.a;
    }
    
    public final LocalCache.ReferenceEntry<K, V> f()
    {
      return this.b;
    }
    
    public final LocalCache.ReferenceEntry<K, V> g()
    {
      return this.c;
    }
  }
  
  static final class o<K, V>
    extends LocalCache.p<K, V>
  {
    volatile long a = Long.MAX_VALUE;
    LocalCache.ReferenceEntry<K, V> b = LocalCache.g();
    LocalCache.ReferenceEntry<K, V> c = LocalCache.g();
    volatile long d = Long.MAX_VALUE;
    LocalCache.ReferenceEntry<K, V> e = LocalCache.g();
    LocalCache.ReferenceEntry<K, V> f = LocalCache.g();
    
    o(K paramK, int paramInt, @Nullable LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      super(paramInt, paramReferenceEntry);
    }
    
    public final void a(long paramLong)
    {
      this.a = paramLong;
    }
    
    public final void a(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.b = paramReferenceEntry;
    }
    
    public final void b(long paramLong)
    {
      this.d = paramLong;
    }
    
    public final void b(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.c = paramReferenceEntry;
    }
    
    public final void c(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.e = paramReferenceEntry;
    }
    
    public final void d(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.f = paramReferenceEntry;
    }
    
    public final long e()
    {
      return this.a;
    }
    
    public final LocalCache.ReferenceEntry<K, V> f()
    {
      return this.b;
    }
    
    public final LocalCache.ReferenceEntry<K, V> g()
    {
      return this.c;
    }
    
    public final long h()
    {
      return this.d;
    }
    
    public final LocalCache.ReferenceEntry<K, V> i()
    {
      return this.e;
    }
    
    public final LocalCache.ReferenceEntry<K, V> j()
    {
      return this.f;
    }
  }
  
  static class p<K, V>
    extends LocalCache.b<K, V>
  {
    final K g;
    final int h;
    final LocalCache.ReferenceEntry<K, V> i;
    volatile LocalCache.t<K, V> j = LocalCache.f();
    
    p(K paramK, int paramInt, @Nullable LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.g = paramK;
      this.h = paramInt;
      this.i = paramReferenceEntry;
    }
    
    public final LocalCache.t<K, V> a()
    {
      return this.j;
    }
    
    public final void a(LocalCache.t<K, V> paramt)
    {
      this.j = paramt;
    }
    
    public final LocalCache.ReferenceEntry<K, V> b()
    {
      return this.i;
    }
    
    public final int c()
    {
      return this.h;
    }
    
    public final K d()
    {
      return (K)this.g;
    }
  }
  
  static class q<K, V>
    implements LocalCache.t<K, V>
  {
    final V a;
    
    q(V paramV)
    {
      this.a = paramV;
    }
    
    public int a()
    {
      return 1;
    }
    
    public final LocalCache.t<K, V> a(ReferenceQueue<V> paramReferenceQueue, V paramV, LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      return this;
    }
    
    public final void a(V paramV) {}
    
    public final LocalCache.ReferenceEntry<K, V> b()
    {
      return null;
    }
    
    public final boolean c()
    {
      return false;
    }
    
    public final boolean d()
    {
      return true;
    }
    
    public V get()
    {
      return (V)this.a;
    }
  }
  
  static final class r<K, V>
    extends LocalCache.p<K, V>
  {
    volatile long a = Long.MAX_VALUE;
    LocalCache.ReferenceEntry<K, V> b = LocalCache.g();
    LocalCache.ReferenceEntry<K, V> c = LocalCache.g();
    
    r(K paramK, int paramInt, @Nullable LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      super(paramInt, paramReferenceEntry);
    }
    
    public final void b(long paramLong)
    {
      this.a = paramLong;
    }
    
    public final void c(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.b = paramReferenceEntry;
    }
    
    public final void d(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.c = paramReferenceEntry;
    }
    
    public final long h()
    {
      return this.a;
    }
    
    public final LocalCache.ReferenceEntry<K, V> i()
    {
      return this.b;
    }
    
    public final LocalCache.ReferenceEntry<K, V> j()
    {
      return this.c;
    }
  }
  
  final class s
    extends LocalCache<K, V>.f<V>
  {
    s()
    {
      super();
    }
    
    public final V next()
    {
      return (V)a().getValue();
    }
  }
  
  static abstract interface t<K, V>
  {
    public abstract int a();
    
    public abstract t<K, V> a(ReferenceQueue<V> paramReferenceQueue, @Nullable V paramV, LocalCache.ReferenceEntry<K, V> paramReferenceEntry);
    
    public abstract void a(@Nullable V paramV);
    
    @Nullable
    public abstract LocalCache.ReferenceEntry<K, V> b();
    
    public abstract boolean c();
    
    public abstract boolean d();
    
    @Nullable
    public abstract V get();
  }
  
  final class u
    extends AbstractCollection<V>
  {
    private final ConcurrentMap<?, ?> b;
    
    u()
    {
      ConcurrentMap localConcurrentMap;
      this.b = localConcurrentMap;
    }
    
    public final void clear()
    {
      this.b.clear();
    }
    
    public final boolean contains(Object paramObject)
    {
      return this.b.containsValue(paramObject);
    }
    
    public final boolean isEmpty()
    {
      return this.b.isEmpty();
    }
    
    public final Iterator<V> iterator()
    {
      return new LocalCache.s(LocalCache.this);
    }
    
    public final int size()
    {
      return this.b.size();
    }
    
    public final Object[] toArray()
    {
      return LocalCache.a(this).toArray();
    }
    
    public final <E> E[] toArray(E[] paramArrayOfE)
    {
      return LocalCache.a(this).toArray(paramArrayOfE);
    }
  }
  
  static final class v<K, V>
    extends LocalCache.x<K, V>
  {
    volatile long a = Long.MAX_VALUE;
    LocalCache.ReferenceEntry<K, V> b = LocalCache.g();
    LocalCache.ReferenceEntry<K, V> c = LocalCache.g();
    
    v(ReferenceQueue<K> paramReferenceQueue, K paramK, int paramInt, @Nullable LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      super(paramK, paramInt, paramReferenceEntry);
    }
    
    public final void a(long paramLong)
    {
      this.a = paramLong;
    }
    
    public final void a(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.b = paramReferenceEntry;
    }
    
    public final void b(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.c = paramReferenceEntry;
    }
    
    public final long e()
    {
      return this.a;
    }
    
    public final LocalCache.ReferenceEntry<K, V> f()
    {
      return this.b;
    }
    
    public final LocalCache.ReferenceEntry<K, V> g()
    {
      return this.c;
    }
  }
  
  static final class w<K, V>
    extends LocalCache.x<K, V>
  {
    volatile long a = Long.MAX_VALUE;
    LocalCache.ReferenceEntry<K, V> b = LocalCache.g();
    LocalCache.ReferenceEntry<K, V> c = LocalCache.g();
    volatile long d = Long.MAX_VALUE;
    LocalCache.ReferenceEntry<K, V> e = LocalCache.g();
    LocalCache.ReferenceEntry<K, V> f = LocalCache.g();
    
    w(ReferenceQueue<K> paramReferenceQueue, K paramK, int paramInt, @Nullable LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      super(paramK, paramInt, paramReferenceEntry);
    }
    
    public final void a(long paramLong)
    {
      this.a = paramLong;
    }
    
    public final void a(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.b = paramReferenceEntry;
    }
    
    public final void b(long paramLong)
    {
      this.d = paramLong;
    }
    
    public final void b(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.c = paramReferenceEntry;
    }
    
    public final void c(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.e = paramReferenceEntry;
    }
    
    public final void d(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.f = paramReferenceEntry;
    }
    
    public final long e()
    {
      return this.a;
    }
    
    public final LocalCache.ReferenceEntry<K, V> f()
    {
      return this.b;
    }
    
    public final LocalCache.ReferenceEntry<K, V> g()
    {
      return this.c;
    }
    
    public final long h()
    {
      return this.d;
    }
    
    public final LocalCache.ReferenceEntry<K, V> i()
    {
      return this.e;
    }
    
    public final LocalCache.ReferenceEntry<K, V> j()
    {
      return this.f;
    }
  }
  
  static class x<K, V>
    extends WeakReference<K>
    implements LocalCache.ReferenceEntry<K, V>
  {
    final int g;
    final LocalCache.ReferenceEntry<K, V> h;
    volatile LocalCache.t<K, V> i = LocalCache.f();
    
    x(ReferenceQueue<K> paramReferenceQueue, K paramK, int paramInt, @Nullable LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      super(paramReferenceQueue);
      this.g = paramInt;
      this.h = paramReferenceEntry;
    }
    
    public final LocalCache.t<K, V> a()
    {
      return this.i;
    }
    
    public void a(long paramLong)
    {
      throw new UnsupportedOperationException();
    }
    
    public void a(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      throw new UnsupportedOperationException();
    }
    
    public final void a(LocalCache.t<K, V> paramt)
    {
      this.i = paramt;
    }
    
    public final LocalCache.ReferenceEntry<K, V> b()
    {
      return this.h;
    }
    
    public void b(long paramLong)
    {
      throw new UnsupportedOperationException();
    }
    
    public void b(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      throw new UnsupportedOperationException();
    }
    
    public final int c()
    {
      return this.g;
    }
    
    public void c(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      throw new UnsupportedOperationException();
    }
    
    public final K d()
    {
      return (K)get();
    }
    
    public void d(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      throw new UnsupportedOperationException();
    }
    
    public long e()
    {
      throw new UnsupportedOperationException();
    }
    
    public LocalCache.ReferenceEntry<K, V> f()
    {
      throw new UnsupportedOperationException();
    }
    
    public LocalCache.ReferenceEntry<K, V> g()
    {
      throw new UnsupportedOperationException();
    }
    
    public long h()
    {
      throw new UnsupportedOperationException();
    }
    
    public LocalCache.ReferenceEntry<K, V> i()
    {
      throw new UnsupportedOperationException();
    }
    
    public LocalCache.ReferenceEntry<K, V> j()
    {
      throw new UnsupportedOperationException();
    }
  }
  
  static class y<K, V>
    extends WeakReference<V>
    implements LocalCache.t<K, V>
  {
    final LocalCache.ReferenceEntry<K, V> a;
    
    y(ReferenceQueue<V> paramReferenceQueue, V paramV, LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      super(paramReferenceQueue);
      this.a = paramReferenceEntry;
    }
    
    public int a()
    {
      return 1;
    }
    
    public LocalCache.t<K, V> a(ReferenceQueue<V> paramReferenceQueue, V paramV, LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      return new y(paramReferenceQueue, paramV, paramReferenceEntry);
    }
    
    public final void a(V paramV) {}
    
    public final LocalCache.ReferenceEntry<K, V> b()
    {
      return this.a;
    }
    
    public final boolean c()
    {
      return false;
    }
    
    public final boolean d()
    {
      return true;
    }
  }
  
  static final class z<K, V>
    extends LocalCache.x<K, V>
  {
    volatile long a = Long.MAX_VALUE;
    LocalCache.ReferenceEntry<K, V> b = LocalCache.g();
    LocalCache.ReferenceEntry<K, V> c = LocalCache.g();
    
    z(ReferenceQueue<K> paramReferenceQueue, K paramK, int paramInt, @Nullable LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      super(paramK, paramInt, paramReferenceEntry);
    }
    
    public final void b(long paramLong)
    {
      this.a = paramLong;
    }
    
    public final void c(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.b = paramReferenceEntry;
    }
    
    public final void d(LocalCache.ReferenceEntry<K, V> paramReferenceEntry)
    {
      this.c = paramReferenceEntry;
    }
    
    public final long h()
    {
      return this.a;
    }
    
    public final LocalCache.ReferenceEntry<K, V> i()
    {
      return this.b;
    }
    
    public final LocalCache.ReferenceEntry<K, V> j()
    {
      return this.c;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/cache/LocalCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */