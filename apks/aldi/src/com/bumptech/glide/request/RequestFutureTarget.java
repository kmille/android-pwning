package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class RequestFutureTarget<R>
  implements FutureTarget<R>, RequestListener<R>, Runnable
{
  private static final Waiter DEFAULT_WAITER = new Waiter();
  private final boolean assertBackgroundThread;
  @Nullable
  private GlideException exception;
  private final int height;
  private boolean isCancelled;
  private boolean loadFailed;
  private final Handler mainHandler;
  @Nullable
  private Request request;
  @Nullable
  private R resource;
  private boolean resultReceived;
  private final Waiter waiter;
  private final int width;
  
  public RequestFutureTarget(Handler paramHandler, int paramInt1, int paramInt2)
  {
    this(paramHandler, paramInt1, paramInt2, true, DEFAULT_WAITER);
  }
  
  RequestFutureTarget(Handler paramHandler, int paramInt1, int paramInt2, boolean paramBoolean, Waiter paramWaiter)
  {
    this.mainHandler = paramHandler;
    this.width = paramInt1;
    this.height = paramInt2;
    this.assertBackgroundThread = paramBoolean;
    this.waiter = paramWaiter;
  }
  
  private void clearOnMainThread()
  {
    this.mainHandler.post(this);
  }
  
  private R doGet(Long paramLong)
    throws ExecutionException, InterruptedException, TimeoutException
  {
    try
    {
      if ((this.assertBackgroundThread) && (!isDone())) {
        Util.assertBackgroundThread();
      }
      if (!this.isCancelled)
      {
        if (!this.loadFailed)
        {
          if (this.resultReceived)
          {
            paramLong = this.resource;
            return paramLong;
          }
          if (paramLong == null)
          {
            this.waiter.waitForTimeout(this, 0L);
          }
          else if (paramLong.longValue() > 0L)
          {
            long l1 = System.currentTimeMillis();
            long l2 = paramLong.longValue() + l1;
            while ((!isDone()) && (l1 < l2))
            {
              this.waiter.waitForTimeout(this, l2 - l1);
              l1 = System.currentTimeMillis();
            }
          }
          if (!Thread.interrupted())
          {
            if (!this.loadFailed)
            {
              if (!this.isCancelled)
              {
                if (this.resultReceived)
                {
                  paramLong = this.resource;
                  return paramLong;
                }
                throw new TimeoutException();
              }
              throw new CancellationException();
            }
            throw new ExecutionException(this.exception);
          }
          throw new InterruptedException();
        }
        throw new ExecutionException(this.exception);
      }
      throw new CancellationException();
    }
    finally {}
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    try
    {
      boolean bool = isDone();
      if (bool) {
        return false;
      }
      this.isCancelled = true;
      this.waiter.notifyAll(this);
      if (paramBoolean) {
        clearOnMainThread();
      }
      return true;
    }
    finally {}
  }
  
  public R get()
    throws InterruptedException, ExecutionException
  {
    try
    {
      Object localObject = doGet(null);
      return (R)localObject;
    }
    catch (TimeoutException localTimeoutException)
    {
      throw new AssertionError(localTimeoutException);
    }
  }
  
  public R get(long paramLong, @NonNull TimeUnit paramTimeUnit)
    throws InterruptedException, ExecutionException, TimeoutException
  {
    return (R)doGet(Long.valueOf(paramTimeUnit.toMillis(paramLong)));
  }
  
  @Nullable
  public Request getRequest()
  {
    return this.request;
  }
  
  public void getSize(@NonNull SizeReadyCallback paramSizeReadyCallback)
  {
    paramSizeReadyCallback.onSizeReady(this.width, this.height);
  }
  
  public boolean isCancelled()
  {
    try
    {
      boolean bool = this.isCancelled;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public boolean isDone()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 83	com/bumptech/glide/request/RequestFutureTarget:isCancelled	Z
    //   6: ifne +28 -> 34
    //   9: aload_0
    //   10: getfield 87	com/bumptech/glide/request/RequestFutureTarget:resultReceived	Z
    //   13: ifne +21 -> 34
    //   16: aload_0
    //   17: getfield 85	com/bumptech/glide/request/RequestFutureTarget:loadFailed	Z
    //   20: istore_1
    //   21: iload_1
    //   22: ifeq +6 -> 28
    //   25: goto +9 -> 34
    //   28: iconst_0
    //   29: istore_1
    //   30: aload_0
    //   31: monitorexit
    //   32: iload_1
    //   33: ireturn
    //   34: iconst_1
    //   35: istore_1
    //   36: goto -6 -> 30
    //   39: astore_2
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_2
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	RequestFutureTarget
    //   20	16	1	bool	boolean
    //   39	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	21	39	finally
  }
  
  public void onDestroy() {}
  
  public void onLoadCleared(@Nullable Drawable paramDrawable) {}
  
  public void onLoadFailed(@Nullable Drawable paramDrawable) {}
  
  public boolean onLoadFailed(@Nullable GlideException paramGlideException, Object paramObject, Target<R> paramTarget, boolean paramBoolean)
  {
    try
    {
      this.loadFailed = true;
      this.exception = paramGlideException;
      this.waiter.notifyAll(this);
      return false;
    }
    finally
    {
      paramGlideException = finally;
      throw paramGlideException;
    }
  }
  
  public void onLoadStarted(@Nullable Drawable paramDrawable) {}
  
  public void onResourceReady(@NonNull R paramR, @Nullable Transition<? super R> paramTransition) {}
  
  public boolean onResourceReady(R paramR, Object paramObject, Target<R> paramTarget, DataSource paramDataSource, boolean paramBoolean)
  {
    try
    {
      this.resultReceived = true;
      this.resource = paramR;
      this.waiter.notifyAll(this);
      return false;
    }
    finally
    {
      paramR = finally;
      throw paramR;
    }
  }
  
  public void onStart() {}
  
  public void onStop() {}
  
  public void removeCallback(@NonNull SizeReadyCallback paramSizeReadyCallback) {}
  
  public void run()
  {
    if (this.request != null)
    {
      this.request.clear();
      this.request = null;
    }
  }
  
  public void setRequest(@Nullable Request paramRequest)
  {
    this.request = paramRequest;
  }
  
  @VisibleForTesting
  static class Waiter
  {
    void notifyAll(Object paramObject)
    {
      paramObject.notifyAll();
    }
    
    void waitForTimeout(Object paramObject, long paramLong)
      throws InterruptedException
    {
      paramObject.wait(paramLong);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/RequestFutureTarget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */