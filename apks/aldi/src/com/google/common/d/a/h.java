package com.google.common.d.a;

import com.google.common.base.j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

abstract class h<V>
  extends d<V>
{
  private static final Logger a = Logger.getLogger(h.class.getName());
  
  public final void a(Runnable paramRunnable, Executor paramExecutor)
  {
    j.a(paramRunnable, "Runnable was null.");
    j.a(paramExecutor, "Executor was null.");
    try
    {
      paramExecutor.execute(paramRunnable);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      Logger localLogger = a;
      Level localLevel = Level.SEVERE;
      StringBuilder localStringBuilder = new StringBuilder("RuntimeException while executing runnable ");
      localStringBuilder.append(paramRunnable);
      localStringBuilder.append(" with executor ");
      localStringBuilder.append(paramExecutor);
      localLogger.log(localLevel, localStringBuilder.toString(), localRuntimeException);
    }
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    return false;
  }
  
  public abstract V get()
    throws ExecutionException;
  
  public V get(long paramLong, TimeUnit paramTimeUnit)
    throws ExecutionException
  {
    j.a(paramTimeUnit);
    return (V)get();
  }
  
  public boolean isCancelled()
  {
    return false;
  }
  
  public boolean isDone()
  {
    return true;
  }
  
  static final class a<V>
    extends a.h<V>
  {
    a(Throwable paramThrowable)
    {
      a(paramThrowable);
    }
  }
  
  static final class b<V>
    extends h<V>
  {
    static final b<Object> a = new b(null);
    @Nullable
    private final V b;
    
    b(@Nullable V paramV)
    {
      this.b = paramV;
    }
    
    public final V get()
    {
      return (V)this.b;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/d/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */