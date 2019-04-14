package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LruBitmapPool
  implements BitmapPool
{
  private static final Bitmap.Config DEFAULT_CONFIG = Bitmap.Config.ARGB_8888;
  private static final String TAG = "LruBitmapPool";
  private final Set<Bitmap.Config> allowedConfigs;
  private long currentSize;
  private int evictions;
  private int hits;
  private final long initialMaxSize;
  private long maxSize;
  private int misses;
  private int puts;
  private final LruPoolStrategy strategy;
  private final BitmapTracker tracker;
  
  public LruBitmapPool(long paramLong)
  {
    this(paramLong, getDefaultStrategy(), getDefaultAllowedConfigs());
  }
  
  LruBitmapPool(long paramLong, LruPoolStrategy paramLruPoolStrategy, Set<Bitmap.Config> paramSet)
  {
    this.initialMaxSize = paramLong;
    this.maxSize = paramLong;
    this.strategy = paramLruPoolStrategy;
    this.allowedConfigs = paramSet;
    this.tracker = new NullBitmapTracker();
  }
  
  public LruBitmapPool(long paramLong, Set<Bitmap.Config> paramSet)
  {
    this(paramLong, getDefaultStrategy(), paramSet);
  }
  
  @TargetApi(26)
  private static void assertNotHardwareConfig(Bitmap.Config paramConfig)
  {
    if (Build.VERSION.SDK_INT < 26) {
      return;
    }
    if (paramConfig != Bitmap.Config.HARDWARE) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("Cannot create a mutable Bitmap with config: ");
    localStringBuilder.append(paramConfig);
    localStringBuilder.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  @NonNull
  private static Bitmap createBitmap(int paramInt1, int paramInt2, @Nullable Bitmap.Config paramConfig)
  {
    if (paramConfig == null) {
      paramConfig = DEFAULT_CONFIG;
    }
    return Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
  }
  
  private void dump()
  {
    if (Log.isLoggable("LruBitmapPool", 2)) {
      dumpUnchecked();
    }
  }
  
  private void dumpUnchecked()
  {
    StringBuilder localStringBuilder = new StringBuilder("Hits=");
    localStringBuilder.append(this.hits);
    localStringBuilder.append(", misses=");
    localStringBuilder.append(this.misses);
    localStringBuilder.append(", puts=");
    localStringBuilder.append(this.puts);
    localStringBuilder.append(", evictions=");
    localStringBuilder.append(this.evictions);
    localStringBuilder.append(", currentSize=");
    localStringBuilder.append(this.currentSize);
    localStringBuilder.append(", maxSize=");
    localStringBuilder.append(this.maxSize);
    localStringBuilder.append("\nStrategy=");
    localStringBuilder.append(this.strategy);
  }
  
  private void evict()
  {
    trimToSize(this.maxSize);
  }
  
  @TargetApi(26)
  private static Set<Bitmap.Config> getDefaultAllowedConfigs()
  {
    HashSet localHashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
    if (Build.VERSION.SDK_INT >= 19) {
      localHashSet.add(null);
    }
    if (Build.VERSION.SDK_INT >= 26) {
      localHashSet.remove(Bitmap.Config.HARDWARE);
    }
    return Collections.unmodifiableSet(localHashSet);
  }
  
  private static LruPoolStrategy getDefaultStrategy()
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return new SizeConfigStrategy();
    }
    return new AttributeStrategy();
  }
  
  @Nullable
  private Bitmap getDirtyOrNull(int paramInt1, int paramInt2, @Nullable Bitmap.Config paramConfig)
  {
    try
    {
      assertNotHardwareConfig(paramConfig);
      LruPoolStrategy localLruPoolStrategy = this.strategy;
      if (paramConfig != null) {
        localObject = paramConfig;
      } else {
        localObject = DEFAULT_CONFIG;
      }
      Object localObject = localLruPoolStrategy.get(paramInt1, paramInt2, (Bitmap.Config)localObject);
      if (localObject == null)
      {
        if (Log.isLoggable("LruBitmapPool", 3)) {
          new StringBuilder("Missing bitmap=").append(this.strategy.logBitmap(paramInt1, paramInt2, paramConfig));
        }
        this.misses += 1;
      }
      else
      {
        this.hits += 1;
        this.currentSize -= this.strategy.getSize((Bitmap)localObject);
        this.tracker.remove((Bitmap)localObject);
        normalize((Bitmap)localObject);
      }
      if (Log.isLoggable("LruBitmapPool", 2)) {
        new StringBuilder("Get bitmap=").append(this.strategy.logBitmap(paramInt1, paramInt2, paramConfig));
      }
      dump();
      return (Bitmap)localObject;
    }
    finally {}
  }
  
  @TargetApi(19)
  private static void maybeSetPreMultiplied(Bitmap paramBitmap)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      paramBitmap.setPremultiplied(true);
    }
  }
  
  private static void normalize(Bitmap paramBitmap)
  {
    paramBitmap.setHasAlpha(true);
    maybeSetPreMultiplied(paramBitmap);
  }
  
  private void trimToSize(long paramLong)
  {
    try
    {
      while (this.currentSize > paramLong)
      {
        Bitmap localBitmap = this.strategy.removeLast();
        if (localBitmap == null)
        {
          if (Log.isLoggable("LruBitmapPool", 5)) {
            dumpUnchecked();
          }
          this.currentSize = 0L;
          return;
        }
        this.tracker.remove(localBitmap);
        this.currentSize -= this.strategy.getSize(localBitmap);
        this.evictions += 1;
        if (Log.isLoggable("LruBitmapPool", 3)) {
          new StringBuilder("Evicting bitmap=").append(this.strategy.logBitmap(localBitmap));
        }
        dump();
        localBitmap.recycle();
      }
      return;
    }
    finally {}
  }
  
  public void clearMemory()
  {
    Log.isLoggable("LruBitmapPool", 3);
    trimToSize(0L);
  }
  
  @NonNull
  public Bitmap get(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    Bitmap localBitmap = getDirtyOrNull(paramInt1, paramInt2, paramConfig);
    if (localBitmap != null)
    {
      localBitmap.eraseColor(0);
      return localBitmap;
    }
    return createBitmap(paramInt1, paramInt2, paramConfig);
  }
  
  @NonNull
  public Bitmap getDirty(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    Bitmap localBitmap2 = getDirtyOrNull(paramInt1, paramInt2, paramConfig);
    Bitmap localBitmap1 = localBitmap2;
    if (localBitmap2 == null) {
      localBitmap1 = createBitmap(paramInt1, paramInt2, paramConfig);
    }
    return localBitmap1;
  }
  
  public long getMaxSize()
  {
    return this.maxSize;
  }
  
  public void put(Bitmap paramBitmap)
  {
    if (paramBitmap != null) {}
    try
    {
      if (!paramBitmap.isRecycled())
      {
        if ((paramBitmap.isMutable()) && (this.strategy.getSize(paramBitmap) <= this.maxSize) && (this.allowedConfigs.contains(paramBitmap.getConfig())))
        {
          int i = this.strategy.getSize(paramBitmap);
          this.strategy.put(paramBitmap);
          this.tracker.add(paramBitmap);
          this.puts += 1;
          this.currentSize += i;
          if (Log.isLoggable("LruBitmapPool", 2)) {
            new StringBuilder("Put bitmap in pool=").append(this.strategy.logBitmap(paramBitmap));
          }
          dump();
          evict();
          return;
        }
        if (Log.isLoggable("LruBitmapPool", 2))
        {
          StringBuilder localStringBuilder = new StringBuilder("Reject bitmap from pool, bitmap: ");
          localStringBuilder.append(this.strategy.logBitmap(paramBitmap));
          localStringBuilder.append(", is mutable: ");
          localStringBuilder.append(paramBitmap.isMutable());
          localStringBuilder.append(", is allowed config: ");
          localStringBuilder.append(this.allowedConfigs.contains(paramBitmap.getConfig()));
        }
        paramBitmap.recycle();
        return;
      }
      throw new IllegalStateException("Cannot pool recycled bitmap");
    }
    finally {}
    throw new NullPointerException("Bitmap must not be null");
  }
  
  public void setSizeMultiplier(float paramFloat)
  {
    try
    {
      this.maxSize = Math.round((float)this.initialMaxSize * paramFloat);
      evict();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @SuppressLint({"InlinedApi"})
  public void trimMemory(int paramInt)
  {
    Log.isLoggable("LruBitmapPool", 3);
    if (paramInt >= 40)
    {
      clearMemory();
      return;
    }
    if ((paramInt >= 20) || (paramInt == 15)) {
      trimToSize(getMaxSize() / 2L);
    }
  }
  
  static abstract interface BitmapTracker
  {
    public abstract void add(Bitmap paramBitmap);
    
    public abstract void remove(Bitmap paramBitmap);
  }
  
  static final class NullBitmapTracker
    implements LruBitmapPool.BitmapTracker
  {
    public final void add(Bitmap paramBitmap) {}
    
    public final void remove(Bitmap paramBitmap) {}
  }
  
  static class ThrowingBitmapTracker
    implements LruBitmapPool.BitmapTracker
  {
    private final Set<Bitmap> bitmaps = Collections.synchronizedSet(new HashSet());
    
    public void add(Bitmap paramBitmap)
    {
      if (!this.bitmaps.contains(paramBitmap))
      {
        this.bitmaps.add(paramBitmap);
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder("Can't add already added bitmap: ");
      localStringBuilder.append(paramBitmap);
      localStringBuilder.append(" [");
      localStringBuilder.append(paramBitmap.getWidth());
      localStringBuilder.append("x");
      localStringBuilder.append(paramBitmap.getHeight());
      localStringBuilder.append("]");
      throw new IllegalStateException(localStringBuilder.toString());
    }
    
    public void remove(Bitmap paramBitmap)
    {
      if (this.bitmaps.contains(paramBitmap))
      {
        this.bitmaps.remove(paramBitmap);
        return;
      }
      throw new IllegalStateException("Cannot remove bitmap not in tracker");
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */