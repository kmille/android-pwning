package com.google.common.d.a;

import com.google.common.base.j;
import java.security.PrivilegedExceptionAction;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import sun.misc.Unsafe;

public abstract class a<V>
  extends d<V>
{
  private static final boolean b = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
  private static final Logger c = Logger.getLogger(a.class.getName());
  private static final a d;
  private static final Object e = new Object();
  volatile Object a;
  private volatile d f;
  private volatile j g;
  
  static
  {
    g localg;
    try
    {
      localObject = new i((byte)0);
    }
    catch (Throwable localThrowable2)
    {
      try
      {
        Object localObject = new e(AtomicReferenceFieldUpdater.newUpdater(j.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(j.class, j.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, j.class, "g"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "f"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
      }
      catch (Throwable localThrowable1)
      {
        c.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", localThrowable2);
        c.log(Level.SEVERE, "SafeAtomicHelper is broken!", localThrowable1);
        localg = new g((byte)0);
      }
    }
    d = localg;
  }
  
  private d a(d paramd)
  {
    d locald2;
    do
    {
      locald2 = this.f;
    } while (!d.a(this, locald2, d.a));
    d locald1 = paramd;
    for (paramd = locald2; paramd != null; paramd = locald2)
    {
      locald2 = paramd.d;
      paramd.d = locald1;
      locald1 = paramd;
    }
    return locald1;
  }
  
  private static CancellationException a(@Nullable String paramString, @Nullable Throwable paramThrowable)
  {
    paramString = new CancellationException(paramString);
    paramString.initCause(paramThrowable);
    return paramString;
  }
  
  private void a(j paramj)
  {
    paramj.b = null;
    paramj = this.g;
    if (paramj == j.a) {
      return;
    }
    j localj1 = null;
    for (;;)
    {
      if (paramj == null) {
        return;
      }
      j localj2 = paramj.c;
      if (paramj.b == null)
      {
        if (localj1 != null)
        {
          localj1.c = localj2;
          paramj = localj1;
          if (localj1.b != null) {
            break label74;
          }
          break;
        }
        if (!d.a(this, paramj, localj2)) {
          break;
        }
        paramj = localj1;
      }
      label74:
      localj1 = paramj;
      paramj = localj2;
    }
  }
  
  private void a(StringBuilder paramStringBuilder)
  {
    try
    {
      Object localObject = e.a(this);
      paramStringBuilder.append("SUCCESS, result=[");
      paramStringBuilder.append(localObject);
      paramStringBuilder.append("]");
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      paramStringBuilder.append("UNKNOWN, cause=[");
      paramStringBuilder.append(localRuntimeException.getClass());
      for (String str1 = " thrown from get()]";; str1 = "CANCELLED")
      {
        paramStringBuilder.append(str1);
        return;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;)
      {
        paramStringBuilder.append("FAILURE, cause=[");
        paramStringBuilder.append(localExecutionException.getCause());
        String str2 = "]";
      }
    }
    catch (CancellationException localCancellationException)
    {
      for (;;) {}
    }
  }
  
  private static Object b(i<?> parami)
  {
    if ((parami instanceof h)) {
      return ((a)parami).a;
    }
    try
    {
      Object localObject = e.a(parami);
      parami = (i<?>)localObject;
      if (localObject == null) {
        parami = e;
      }
      return parami;
    }
    catch (Throwable parami)
    {
      return new c(parami);
    }
    catch (CancellationException parami)
    {
      return new b(false, parami);
    }
    catch (ExecutionException parami) {}
    return new c(parami.getCause());
  }
  
  private static V b(Object paramObject)
    throws ExecutionException
  {
    if (!(paramObject instanceof b))
    {
      if (!(paramObject instanceof c))
      {
        Object localObject = paramObject;
        if (paramObject == e) {
          localObject = null;
        }
        return (V)localObject;
      }
      throw new ExecutionException(((c)paramObject).b);
    }
    throw a("Task was cancelled.", ((b)paramObject).b);
  }
  
  private static void b(Runnable paramRunnable, Executor paramExecutor)
  {
    try
    {
      paramExecutor.execute(paramRunnable);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      Logger localLogger = c;
      Level localLevel = Level.SEVERE;
      StringBuilder localStringBuilder = new StringBuilder("RuntimeException while executing runnable ");
      localStringBuilder.append(paramRunnable);
      localStringBuilder.append(" with executor ");
      localStringBuilder.append(paramExecutor);
      localLogger.log(localLevel, localStringBuilder.toString(), localRuntimeException);
    }
  }
  
  private void d()
  {
    j localj;
    do
    {
      localj = this.g;
    } while (!d.a(this, localj, j.a));
    while (localj != null)
    {
      localj.a();
      localj = localj.c;
    }
  }
  
  private static void e(a<?> parama)
  {
    Object localObject2 = null;
    Object localObject1 = parama;
    ((a)localObject1).d();
    ((a)localObject1).a();
    for (localObject1 = ((a)localObject1).a((d)localObject2);; localObject1 = parama)
    {
      if (localObject1 == null) {
        return;
      }
      parama = ((d)localObject1).d;
      localObject2 = ((d)localObject1).b;
      if ((localObject2 instanceof f))
      {
        f localf = (f)localObject2;
        a locala = localf.a;
        if (locala.a != localf) {
          continue;
        }
        Object localObject3 = b(localf.b);
        localObject2 = parama;
        localObject1 = locala;
        if (d.a(locala, localf, localObject3)) {
          break;
        }
        continue;
      }
      b((Runnable)localObject2, ((d)localObject1).c);
    }
  }
  
  protected void a() {}
  
  public void a(Runnable paramRunnable, Executor paramExecutor)
  {
    j.a(paramRunnable, "Runnable was null.");
    j.a(paramExecutor, "Executor was null.");
    Object localObject = this.f;
    if (localObject != d.a)
    {
      d locald2 = new d(paramRunnable, paramExecutor);
      d locald1;
      do
      {
        locald2.d = ((d)localObject);
        if (d.a(this, (d)localObject, locald2)) {
          return;
        }
        locald1 = this.f;
        localObject = locald1;
      } while (locald1 != d.a);
    }
    b(paramRunnable, paramExecutor);
  }
  
  protected boolean a(@Nullable V paramV)
  {
    Object localObject = paramV;
    if (paramV == null) {
      localObject = e;
    }
    if (d.a(this, null, localObject))
    {
      e(this);
      return true;
    }
    return false;
  }
  
  protected boolean a(Throwable paramThrowable)
  {
    paramThrowable = new c((Throwable)j.a(paramThrowable));
    if (d.a(this, null, paramThrowable))
    {
      e(this);
      return true;
    }
    return false;
  }
  
  @Nullable
  protected String b()
  {
    Object localObject = this.a;
    if ((localObject instanceof f))
    {
      StringBuilder localStringBuilder = new StringBuilder("setFuture=[");
      localStringBuilder.append(((f)localObject).b);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
    if ((this instanceof ScheduledFuture))
    {
      localObject = new StringBuilder("remaining delay=[");
      ((StringBuilder)localObject).append(((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS));
      ((StringBuilder)localObject).append(" ms]");
      return ((StringBuilder)localObject).toString();
    }
    return null;
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    Object localObject2 = this.a;
    boolean bool2 = true;
    int i;
    if (localObject2 == null) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i | localObject2 instanceof f) != 0)
    {
      if (b) {
        localObject1 = new CancellationException("Future.cancel() was called.");
      } else {
        localObject1 = null;
      }
      b localb = new b(paramBoolean, (Throwable)localObject1);
      bool1 = false;
      Object localObject1 = localObject2;
      localObject2 = this;
      Object localObject3;
      do
      {
        while (d.a((a)localObject2, localObject1, localb))
        {
          e((a)localObject2);
          bool1 = bool2;
          if (!(localObject1 instanceof f)) {
            return bool1;
          }
          localObject1 = ((f)localObject1).b;
          if ((localObject1 instanceof h))
          {
            localObject2 = (a)localObject1;
            localObject1 = ((a)localObject2).a;
            if (localObject1 == null) {
              i = 1;
            } else {
              i = 0;
            }
            if ((i | localObject1 instanceof f) == 0) {
              return true;
            }
            bool1 = true;
          }
          else
          {
            ((i)localObject1).cancel(paramBoolean);
            return true;
          }
        }
        localObject3 = ((a)localObject2).a;
        localObject1 = localObject3;
      } while ((localObject3 instanceof f));
      return bool1;
    }
    boolean bool1 = false;
    return bool1;
  }
  
  public V get()
    throws InterruptedException, ExecutionException
  {
    if (!Thread.interrupted())
    {
      Object localObject = this.a;
      int i;
      if (localObject != null) {
        i = 1;
      } else {
        i = 0;
      }
      int j;
      if (!(localObject instanceof f)) {
        j = 1;
      } else {
        j = 0;
      }
      if ((i & j) != 0) {
        return (V)b(localObject);
      }
      localObject = this.g;
      if (localObject != j.a)
      {
        j localj2 = new j();
        j localj1;
        do
        {
          localj2.a((j)localObject);
          if (d.a(this, (j)localObject, localj2))
          {
            do
            {
              LockSupport.park(this);
              if (Thread.interrupted()) {
                break;
              }
              localObject = this.a;
              if (localObject != null) {
                i = 1;
              } else {
                i = 0;
              }
              if (!(localObject instanceof f)) {
                j = 1;
              } else {
                j = 0;
              }
            } while ((i & j) == 0);
            return (V)b(localObject);
            a(localj2);
            throw new InterruptedException();
          }
          localj1 = this.g;
          localObject = localj1;
        } while (localj1 != j.a);
      }
      return (V)b(this.a);
    }
    throw new InterruptedException();
  }
  
  public V get(long paramLong, TimeUnit paramTimeUnit)
    throws InterruptedException, TimeoutException, ExecutionException
  {
    long l3 = paramTimeUnit.toNanos(paramLong);
    if (!Thread.interrupted())
    {
      Object localObject1 = this.a;
      int i;
      if (localObject1 != null) {
        i = 1;
      } else {
        i = 0;
      }
      int j;
      if (!(localObject1 instanceof f)) {
        j = 1;
      } else {
        j = 0;
      }
      if ((i & j) != 0) {
        return (V)b(localObject1);
      }
      long l2;
      if (l3 > 0L) {
        l2 = System.nanoTime() + l3;
      } else {
        l2 = 0L;
      }
      long l1 = l3;
      if (l3 >= 1000L)
      {
        localObject1 = this.g;
        if (localObject1 != j.a)
        {
          j localj = new j();
          do
          {
            localj.a((j)localObject1);
            if (d.a(this, (j)localObject1, localj))
            {
              do
              {
                LockSupport.parkNanos(this, l3);
                if (Thread.interrupted()) {
                  break;
                }
                localObject1 = this.a;
                if (localObject1 != null) {
                  i = 1;
                } else {
                  i = 0;
                }
                if (!(localObject1 instanceof f)) {
                  j = 1;
                } else {
                  j = 0;
                }
                if ((i & j) != 0) {
                  return (V)b(localObject1);
                }
                l1 = l2 - System.nanoTime();
                l3 = l1;
              } while (l1 >= 1000L);
              a(localj);
              break;
              a(localj);
              throw new InterruptedException();
            }
            localObject2 = this.g;
            localObject1 = localObject2;
          } while (localObject2 != j.a);
        }
        return (V)b(this.a);
      }
      while (l1 > 0L)
      {
        localObject1 = this.a;
        if (localObject1 != null) {
          i = 1;
        } else {
          i = 0;
        }
        if (!(localObject1 instanceof f)) {
          j = 1;
        } else {
          j = 0;
        }
        if ((i & j) != 0) {
          return (V)b(localObject1);
        }
        if (!Thread.interrupted()) {
          l1 = l2 - System.nanoTime();
        } else {
          throw new InterruptedException();
        }
      }
      localObject1 = toString();
      if (isDone())
      {
        localObject1 = new StringBuilder("Waited ");
        ((StringBuilder)localObject1).append(paramLong);
        ((StringBuilder)localObject1).append(" ");
        ((StringBuilder)localObject1).append(com.google.common.base.a.a(paramTimeUnit.toString()));
        ((StringBuilder)localObject1).append(" but future completed as timeout expired");
        throw new TimeoutException(((StringBuilder)localObject1).toString());
      }
      Object localObject2 = new StringBuilder("Waited ");
      ((StringBuilder)localObject2).append(paramLong);
      ((StringBuilder)localObject2).append(" ");
      ((StringBuilder)localObject2).append(com.google.common.base.a.a(paramTimeUnit.toString()));
      ((StringBuilder)localObject2).append(" for ");
      ((StringBuilder)localObject2).append((String)localObject1);
      throw new TimeoutException(((StringBuilder)localObject2).toString());
    }
    throw new InterruptedException();
  }
  
  public boolean isCancelled()
  {
    return this.a instanceof b;
  }
  
  public boolean isDone()
  {
    Object localObject = this.a;
    int j = 0;
    int i;
    if (localObject != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (!(localObject instanceof f)) {
      j = 1;
    }
    return i & j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append(super.toString());
    localStringBuilder1.append("[status=");
    String str1;
    if (isCancelled()) {
      str1 = "CANCELLED";
    }
    for (;;)
    {
      localStringBuilder1.append(str1);
      break;
      if (isDone()) {}
      do
      {
        a(localStringBuilder1);
        break label137;
        try
        {
          str1 = b();
        }
        catch (RuntimeException localRuntimeException)
        {
          StringBuilder localStringBuilder2 = new StringBuilder("Exception thrown from implementation: ");
          localStringBuilder2.append(localRuntimeException.getClass());
          str2 = localStringBuilder2.toString();
        }
        if (!com.google.common.base.i.a(str2))
        {
          localStringBuilder1.append("PENDING, info=[");
          localStringBuilder1.append(str2);
          str2 = "]";
          break;
        }
      } while (isDone());
      String str2 = "PENDING";
    }
    label137:
    localStringBuilder1.append("]");
    return localStringBuilder1.toString();
  }
  
  static abstract class a
  {
    abstract void a(a.j paramj1, a.j paramj2);
    
    abstract void a(a.j paramj, Thread paramThread);
    
    abstract boolean a(a<?> parama, a.d paramd1, a.d paramd2);
    
    abstract boolean a(a<?> parama, a.j paramj1, a.j paramj2);
    
    abstract boolean a(a<?> parama, Object paramObject1, Object paramObject2);
  }
  
  static final class b
  {
    final boolean a;
    @Nullable
    final Throwable b;
    
    b(boolean paramBoolean, @Nullable Throwable paramThrowable)
    {
      this.a = paramBoolean;
      this.b = paramThrowable;
    }
  }
  
  static final class c
  {
    static final c a = new c(new Throwable("Failure occurred while trying to finish a future.")
    {
      public final Throwable fillInStackTrace()
      {
        return this;
      }
    });
    final Throwable b;
    
    c(Throwable paramThrowable)
    {
      this.b = ((Throwable)j.a(paramThrowable));
    }
  }
  
  static final class d
  {
    static final d a = new d(null, null);
    final Runnable b;
    final Executor c;
    @Nullable
    d d;
    
    d(Runnable paramRunnable, Executor paramExecutor)
    {
      this.b = paramRunnable;
      this.c = paramExecutor;
    }
  }
  
  static final class e
    extends a.a
  {
    final AtomicReferenceFieldUpdater<a.j, Thread> a;
    final AtomicReferenceFieldUpdater<a.j, a.j> b;
    final AtomicReferenceFieldUpdater<a, a.j> c;
    final AtomicReferenceFieldUpdater<a, a.d> d;
    final AtomicReferenceFieldUpdater<a, Object> e;
    
    e(AtomicReferenceFieldUpdater<a.j, Thread> paramAtomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<a.j, a.j> paramAtomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater<a, a.j> paramAtomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, a.d> paramAtomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, Object> paramAtomicReferenceFieldUpdater4)
    {
      super();
      this.a = paramAtomicReferenceFieldUpdater;
      this.b = paramAtomicReferenceFieldUpdater1;
      this.c = paramAtomicReferenceFieldUpdater2;
      this.d = paramAtomicReferenceFieldUpdater3;
      this.e = paramAtomicReferenceFieldUpdater4;
    }
    
    final void a(a.j paramj1, a.j paramj2)
    {
      this.b.lazySet(paramj1, paramj2);
    }
    
    final void a(a.j paramj, Thread paramThread)
    {
      this.a.lazySet(paramj, paramThread);
    }
    
    final boolean a(a<?> parama, a.d paramd1, a.d paramd2)
    {
      return this.d.compareAndSet(parama, paramd1, paramd2);
    }
    
    final boolean a(a<?> parama, a.j paramj1, a.j paramj2)
    {
      return this.c.compareAndSet(parama, paramj1, paramj2);
    }
    
    final boolean a(a<?> parama, Object paramObject1, Object paramObject2)
    {
      return this.e.compareAndSet(parama, paramObject1, paramObject2);
    }
  }
  
  static final class f<V>
    implements Runnable
  {
    final a<V> a;
    final i<? extends V> b;
    
    public final void run()
    {
      if (a.a(this.a) != this) {
        return;
      }
      Object localObject = a.a(this.b);
      if (a.c().a(this.a, this, localObject)) {
        a.b(this.a);
      }
    }
  }
  
  static final class g
    extends a.a
  {
    private g()
    {
      super();
    }
    
    final void a(a.j paramj1, a.j paramj2)
    {
      paramj1.c = paramj2;
    }
    
    final void a(a.j paramj, Thread paramThread)
    {
      paramj.b = paramThread;
    }
    
    final boolean a(a<?> parama, a.d paramd1, a.d paramd2)
    {
      try
      {
        if (a.d(parama) == paramd1)
        {
          a.a(parama, paramd2);
          return true;
        }
        return false;
      }
      finally {}
    }
    
    final boolean a(a<?> parama, a.j paramj1, a.j paramj2)
    {
      try
      {
        if (a.c(parama) == paramj1)
        {
          a.a(parama, paramj2);
          return true;
        }
        return false;
      }
      finally {}
    }
    
    final boolean a(a<?> parama, Object paramObject1, Object paramObject2)
    {
      try
      {
        if (a.a(parama) == paramObject1)
        {
          a.a(parama, paramObject2);
          return true;
        }
        return false;
      }
      finally {}
    }
  }
  
  static abstract class h<V>
    extends a<V>
  {
    public final void a(Runnable paramRunnable, Executor paramExecutor)
    {
      super.a(paramRunnable, paramExecutor);
    }
    
    public final boolean cancel(boolean paramBoolean)
    {
      return super.cancel(paramBoolean);
    }
    
    public final V get()
      throws InterruptedException, ExecutionException
    {
      return (V)super.get();
    }
    
    public final V get(long paramLong, TimeUnit paramTimeUnit)
      throws InterruptedException, ExecutionException, TimeoutException
    {
      return (V)super.get(paramLong, paramTimeUnit);
    }
    
    public final boolean isCancelled()
    {
      return super.isCancelled();
    }
    
    public final boolean isDone()
    {
      return super.isDone();
    }
  }
  
  static final class i
    extends a.a
  {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;
    
    /* Error */
    static
    {
      // Byte code:
      //   0: invokestatic 31	sun/misc/Unsafe:getUnsafe	()Lsun/misc/Unsafe;
      //   3: astore_0
      //   4: goto +17 -> 21
      //   7: new 9	com/google/common/d/a/a$i$1
      //   10: dup
      //   11: invokespecial 34	com/google/common/d/a/a$i$1:<init>	()V
      //   14: invokestatic 40	java/security/AccessController:doPrivileged	(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;
      //   17: checkcast 27	sun/misc/Unsafe
      //   20: astore_0
      //   21: aload_0
      //   22: ldc 6
      //   24: ldc 42
      //   26: invokevirtual 48	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   29: invokevirtual 52	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
      //   32: putstatic 54	com/google/common/d/a/a$i:c	J
      //   35: aload_0
      //   36: ldc 6
      //   38: ldc 56
      //   40: invokevirtual 48	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   43: invokevirtual 52	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
      //   46: putstatic 58	com/google/common/d/a/a$i:b	J
      //   49: aload_0
      //   50: ldc 6
      //   52: ldc 60
      //   54: invokevirtual 48	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   57: invokevirtual 52	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
      //   60: putstatic 62	com/google/common/d/a/a$i:d	J
      //   63: aload_0
      //   64: ldc 64
      //   66: ldc 65
      //   68: invokevirtual 48	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   71: invokevirtual 52	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
      //   74: putstatic 67	com/google/common/d/a/a$i:e	J
      //   77: aload_0
      //   78: ldc 64
      //   80: ldc 68
      //   82: invokevirtual 48	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   85: invokevirtual 52	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
      //   88: putstatic 70	com/google/common/d/a/a$i:f	J
      //   91: aload_0
      //   92: putstatic 72	com/google/common/d/a/a$i:a	Lsun/misc/Unsafe;
      //   95: return
      //   96: astore_0
      //   97: aload_0
      //   98: invokestatic 77	com/google/common/base/l:a	(Ljava/lang/Throwable;)V
      //   101: new 79	java/lang/RuntimeException
      //   104: dup
      //   105: aload_0
      //   106: invokespecial 81	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
      //   109: athrow
      //   110: astore_0
      //   111: new 79	java/lang/RuntimeException
      //   114: dup
      //   115: ldc 83
      //   117: aload_0
      //   118: invokevirtual 87	java/security/PrivilegedActionException:getCause	()Ljava/lang/Throwable;
      //   121: invokespecial 90	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   124: athrow
      //   125: astore_0
      //   126: goto -119 -> 7
      // Local variable table:
      //   start	length	slot	name	signature
      //   3	89	0	localUnsafe	Unsafe
      //   96	10	0	localException	Exception
      //   110	8	0	localPrivilegedActionException	java.security.PrivilegedActionException
      //   125	1	0	localSecurityException	SecurityException
      // Exception table:
      //   from	to	target	type
      //   21	95	96	java/lang/Exception
      //   7	21	110	java/security/PrivilegedActionException
      //   0	4	125	java/lang/SecurityException
    }
    
    private i()
    {
      super();
    }
    
    final void a(a.j paramj1, a.j paramj2)
    {
      a.putObject(paramj1, f, paramj2);
    }
    
    final void a(a.j paramj, Thread paramThread)
    {
      a.putObject(paramj, e, paramThread);
    }
    
    final boolean a(a<?> parama, a.d paramd1, a.d paramd2)
    {
      return a.compareAndSwapObject(parama, b, paramd1, paramd2);
    }
    
    final boolean a(a<?> parama, a.j paramj1, a.j paramj2)
    {
      return a.compareAndSwapObject(parama, c, paramj1, paramj2);
    }
    
    final boolean a(a<?> parama, Object paramObject1, Object paramObject2)
    {
      return a.compareAndSwapObject(parama, d, paramObject1, paramObject2);
    }
  }
  
  static final class j
  {
    static final j a = new j((byte)0);
    @Nullable
    volatile Thread b;
    @Nullable
    volatile j c;
    
    j()
    {
      a.c().a(this, Thread.currentThread());
    }
    
    private j(byte paramByte) {}
    
    final void a()
    {
      Thread localThread = this.b;
      if (localThread != null)
      {
        this.b = null;
        LockSupport.unpark(localThread);
      }
    }
    
    final void a(j paramj)
    {
      a.c().a(this, paramj);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/d/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */