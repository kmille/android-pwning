package com.google.common.d.a;

import com.google.common.base.j;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import javax.annotation.Nullable;

abstract class b<I, O, F, T>
  extends a.h<O>
  implements Runnable
{
  @Nullable
  i<? extends I> b;
  @Nullable
  F c;
  
  b(i<? extends I> parami, F paramF)
  {
    this.b = ((i)j.a(parami));
    this.c = j.a(paramF);
  }
  
  static <I, O> i<O> a(i<I> parami, com.google.common.base.e<? super I, ? extends O> parame, Executor paramExecutor)
  {
    j.a(parame);
    parame = new a(parami, parame);
    j.a(paramExecutor);
    j.a(parame);
    if (paramExecutor != j.a.a) {
      paramExecutor = new j.1(paramExecutor, parame);
    }
    parami.a(parame, paramExecutor);
    return parame;
  }
  
  @Nullable
  abstract T a(F paramF, @Nullable I paramI)
    throws Exception;
  
  protected final void a()
  {
    i locali = this.b;
    boolean bool2 = false;
    int i;
    if (locali != null) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i & isCancelled()) != 0)
    {
      Object localObject = this.a;
      boolean bool1 = bool2;
      if ((localObject instanceof a.b))
      {
        bool1 = bool2;
        if (((a.b)localObject).a) {
          bool1 = true;
        }
      }
      locali.cancel(bool1);
    }
    this.b = null;
    this.c = null;
  }
  
  protected final String b()
  {
    i locali = this.b;
    Object localObject = this.c;
    if ((locali != null) && (localObject != null))
    {
      StringBuilder localStringBuilder = new StringBuilder("inputFuture=[");
      localStringBuilder.append(locali);
      localStringBuilder.append("], function=[");
      localStringBuilder.append(localObject);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
    return null;
  }
  
  abstract void b(@Nullable T paramT);
  
  public final void run()
  {
    Object localObject2 = this.b;
    Object localObject1 = this.c;
    boolean bool2 = isCancelled();
    int i = 1;
    boolean bool1;
    if (localObject2 == null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    if (localObject1 != null) {
      i = 0;
    }
    if ((bool2 | bool1 | i)) {
      return;
    }
    this.b = null;
    this.c = null;
    try
    {
      localObject2 = e.a((Future)localObject2);
      try
      {
        localObject1 = a(localObject1, localObject2);
        b(localObject1);
        return;
      }
      catch (Throwable localThrowable1)
      {
        a(localThrowable1);
        return;
      }
      catch (UndeclaredThrowableException localUndeclaredThrowableException)
      {
        localThrowable2 = localUndeclaredThrowableException.getCause();
      }
    }
    catch (Error localError)
    {
      Throwable localThrowable2;
      a(localError);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      a(localRuntimeException);
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;)
      {
        Throwable localThrowable3 = localExecutionException.getCause();
      }
      cancel(false);
      return;
    }
    catch (CancellationException localCancellationException)
    {
      for (;;) {}
    }
    a(localThrowable2);
  }
  
  static final class a<I, O>
    extends b<I, O, com.google.common.base.e<? super I, ? extends O>, O>
  {
    a(i<? extends I> parami, com.google.common.base.e<? super I, ? extends O> parame)
    {
      super(parame);
    }
    
    final void b(@Nullable O paramO)
    {
      a(paramO);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/d/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */