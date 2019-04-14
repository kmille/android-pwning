package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Util;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

final class BitmapPreFillRunner
  implements Runnable
{
  static final int BACKOFF_RATIO = 4;
  private static final Clock DEFAULT_CLOCK = new Clock();
  static final long INITIAL_BACKOFF_MS = 40L;
  static final long MAX_BACKOFF_MS = TimeUnit.SECONDS.toMillis(1L);
  static final long MAX_DURATION_MS = 32L;
  @VisibleForTesting
  static final String TAG = "PreFillRunner";
  private final BitmapPool bitmapPool;
  private final Clock clock;
  private long currentDelay = 40L;
  private final Handler handler;
  private boolean isCancelled;
  private final MemoryCache memoryCache;
  private final Set<PreFillType> seenTypes = new HashSet();
  private final PreFillQueue toPrefill;
  
  public BitmapPreFillRunner(BitmapPool paramBitmapPool, MemoryCache paramMemoryCache, PreFillQueue paramPreFillQueue)
  {
    this(paramBitmapPool, paramMemoryCache, paramPreFillQueue, DEFAULT_CLOCK, new Handler(Looper.getMainLooper()));
  }
  
  @VisibleForTesting
  BitmapPreFillRunner(BitmapPool paramBitmapPool, MemoryCache paramMemoryCache, PreFillQueue paramPreFillQueue, Clock paramClock, Handler paramHandler)
  {
    this.bitmapPool = paramBitmapPool;
    this.memoryCache = paramMemoryCache;
    this.toPrefill = paramPreFillQueue;
    this.clock = paramClock;
    this.handler = paramHandler;
  }
  
  private long getFreeMemoryCacheBytes()
  {
    return this.memoryCache.getMaxSize() - this.memoryCache.getCurrentSize();
  }
  
  private long getNextDelay()
  {
    long l = this.currentDelay;
    this.currentDelay = Math.min(this.currentDelay * 4L, MAX_BACKOFF_MS);
    return l;
  }
  
  private boolean isGcDetected(long paramLong)
  {
    return this.clock.now() - paramLong >= 32L;
  }
  
  @VisibleForTesting
  final boolean allocate()
  {
    long l = this.clock.now();
    while ((!this.toPrefill.isEmpty()) && (!isGcDetected(l)))
    {
      PreFillType localPreFillType = this.toPrefill.remove();
      Object localObject;
      if (!this.seenTypes.contains(localPreFillType))
      {
        this.seenTypes.add(localPreFillType);
        localObject = this.bitmapPool.getDirty(localPreFillType.getWidth(), localPreFillType.getHeight(), localPreFillType.getConfig());
      }
      else
      {
        localObject = Bitmap.createBitmap(localPreFillType.getWidth(), localPreFillType.getHeight(), localPreFillType.getConfig());
      }
      int i = Util.getBitmapByteSize((Bitmap)localObject);
      if (getFreeMemoryCacheBytes() >= i)
      {
        UniqueKey localUniqueKey = new UniqueKey();
        this.memoryCache.put(localUniqueKey, BitmapResource.obtain((Bitmap)localObject, this.bitmapPool));
      }
      else
      {
        this.bitmapPool.put((Bitmap)localObject);
      }
      if (Log.isLoggable("PreFillRunner", 3))
      {
        localObject = new StringBuilder("allocated [");
        ((StringBuilder)localObject).append(localPreFillType.getWidth());
        ((StringBuilder)localObject).append("x");
        ((StringBuilder)localObject).append(localPreFillType.getHeight());
        ((StringBuilder)localObject).append("] ");
        ((StringBuilder)localObject).append(localPreFillType.getConfig());
        ((StringBuilder)localObject).append(" size: ");
        ((StringBuilder)localObject).append(i);
      }
    }
    return (!this.isCancelled) && (!this.toPrefill.isEmpty());
  }
  
  public final void cancel()
  {
    this.isCancelled = true;
  }
  
  public final void run()
  {
    if (allocate()) {
      this.handler.postDelayed(this, getNextDelay());
    }
  }
  
  @VisibleForTesting
  static class Clock
  {
    long now()
    {
      return SystemClock.currentThreadTimeMillis();
    }
  }
  
  static final class UniqueKey
    implements Key
  {
    public final void updateDiskCacheKey(@NonNull MessageDigest paramMessageDigest)
    {
      throw new UnsupportedOperationException();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/prefill/BitmapPreFillRunner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */