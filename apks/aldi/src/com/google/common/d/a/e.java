package com.google.common.d.a;

import com.google.common.base.j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import javax.annotation.Nullable;

public final class e
  extends g
{
  private static final c<i<Object>, Object> a = new c() {};
  
  public static <I, O> i<O> a(i<I> parami, com.google.common.base.e<? super I, ? extends O> parame, Executor paramExecutor)
  {
    return b.a(parami, parame, paramExecutor);
  }
  
  public static <V> i<V> a(@Nullable V paramV)
  {
    if (paramV == null) {
      return h.b.a;
    }
    return new h.b(paramV);
  }
  
  public static <V> i<V> a(Throwable paramThrowable)
  {
    j.a(paramThrowable);
    return new h.a(paramThrowable);
  }
  
  public static <V> V a(Future<V> paramFuture)
    throws ExecutionException
  {
    if (paramFuture.isDone()) {
      return (V)l.a(paramFuture);
    }
    throw new IllegalStateException(j.a("Future was expected to be done: %s", new Object[] { paramFuture }));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/d/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */