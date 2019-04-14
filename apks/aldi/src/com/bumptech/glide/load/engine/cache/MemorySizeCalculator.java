package com.bumptech.glide.load.engine.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.annotation.VisibleForTesting;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.util.Preconditions;

public final class MemorySizeCalculator
{
  @VisibleForTesting
  static final int BYTES_PER_ARGB_8888_PIXEL = 4;
  private static final int LOW_MEMORY_BYTE_ARRAY_POOL_DIVISOR = 2;
  private static final String TAG = "MemorySizeCalculator";
  private final int arrayPoolSize;
  private final int bitmapPoolSize;
  private final Context context;
  private final int memoryCacheSize;
  
  MemorySizeCalculator(Builder paramBuilder)
  {
    this.context = paramBuilder.context;
    if (isLowMemoryDevice(paramBuilder.activityManager)) {
      i = paramBuilder.arrayPoolSizeBytes / 2;
    } else {
      i = paramBuilder.arrayPoolSizeBytes;
    }
    this.arrayPoolSize = i;
    int i = getMaxSize(paramBuilder.activityManager, paramBuilder.maxSizeMultiplier, paramBuilder.lowMemoryMaxSizeMultiplier);
    float f = paramBuilder.screenDimensions.getWidthPixels() * paramBuilder.screenDimensions.getHeightPixels() * 4;
    int j = Math.round(paramBuilder.bitmapPoolScreens * f);
    int k = Math.round(f * paramBuilder.memoryCacheScreens);
    int m = i - this.arrayPoolSize;
    int n = k + j;
    if (n <= m)
    {
      this.memoryCacheSize = k;
      this.bitmapPoolSize = j;
    }
    else
    {
      f = m / (paramBuilder.bitmapPoolScreens + paramBuilder.memoryCacheScreens);
      this.memoryCacheSize = Math.round(paramBuilder.memoryCacheScreens * f);
      this.bitmapPoolSize = Math.round(f * paramBuilder.bitmapPoolScreens);
    }
    if (Log.isLoggable("MemorySizeCalculator", 3))
    {
      StringBuilder localStringBuilder = new StringBuilder("Calculation complete, Calculated memory cache size: ");
      localStringBuilder.append(toMb(this.memoryCacheSize));
      localStringBuilder.append(", pool size: ");
      localStringBuilder.append(toMb(this.bitmapPoolSize));
      localStringBuilder.append(", byte array size: ");
      localStringBuilder.append(toMb(this.arrayPoolSize));
      localStringBuilder.append(", memory class limited? ");
      boolean bool;
      if (n > i) {
        bool = true;
      } else {
        bool = false;
      }
      localStringBuilder.append(bool);
      localStringBuilder.append(", max size: ");
      localStringBuilder.append(toMb(i));
      localStringBuilder.append(", memoryClass: ");
      localStringBuilder.append(paramBuilder.activityManager.getMemoryClass());
      localStringBuilder.append(", isLowMemoryDevice: ");
      localStringBuilder.append(isLowMemoryDevice(paramBuilder.activityManager));
    }
  }
  
  private static int getMaxSize(ActivityManager paramActivityManager, float paramFloat1, float paramFloat2)
  {
    int i = paramActivityManager.getMemoryClass();
    boolean bool = isLowMemoryDevice(paramActivityManager);
    float f = i * 1024 * 1024;
    if (bool) {
      paramFloat1 = paramFloat2;
    }
    return Math.round(f * paramFloat1);
  }
  
  @TargetApi(19)
  static boolean isLowMemoryDevice(ActivityManager paramActivityManager)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramActivityManager.isLowRamDevice();
    }
    return true;
  }
  
  private String toMb(int paramInt)
  {
    return Formatter.formatFileSize(this.context, paramInt);
  }
  
  public final int getArrayPoolSizeInBytes()
  {
    return this.arrayPoolSize;
  }
  
  public final int getBitmapPoolSize()
  {
    return this.bitmapPoolSize;
  }
  
  public final int getMemoryCacheSize()
  {
    return this.memoryCacheSize;
  }
  
  public static final class Builder
  {
    static final int ARRAY_POOL_SIZE_BYTES = 4194304;
    static final int BITMAP_POOL_TARGET_SCREENS;
    static final float LOW_MEMORY_MAX_SIZE_MULTIPLIER = 0.33F;
    static final float MAX_SIZE_MULTIPLIER = 0.4F;
    @VisibleForTesting
    static final int MEMORY_CACHE_TARGET_SCREENS = 2;
    ActivityManager activityManager;
    int arrayPoolSizeBytes = 4194304;
    float bitmapPoolScreens = BITMAP_POOL_TARGET_SCREENS;
    final Context context;
    float lowMemoryMaxSizeMultiplier = 0.33F;
    float maxSizeMultiplier = 0.4F;
    float memoryCacheScreens = 2.0F;
    MemorySizeCalculator.ScreenDimensions screenDimensions;
    
    static
    {
      int i;
      if (Build.VERSION.SDK_INT < 26) {
        i = 4;
      } else {
        i = 1;
      }
      BITMAP_POOL_TARGET_SCREENS = i;
    }
    
    public Builder(Context paramContext)
    {
      this.context = paramContext;
      this.activityManager = ((ActivityManager)paramContext.getSystemService("activity"));
      this.screenDimensions = new MemorySizeCalculator.DisplayMetricsScreenDimensions(paramContext.getResources().getDisplayMetrics());
      if ((Build.VERSION.SDK_INT >= 26) && (MemorySizeCalculator.isLowMemoryDevice(this.activityManager))) {
        this.bitmapPoolScreens = 0.0F;
      }
    }
    
    public final MemorySizeCalculator build()
    {
      return new MemorySizeCalculator(this);
    }
    
    @VisibleForTesting
    final Builder setActivityManager(ActivityManager paramActivityManager)
    {
      this.activityManager = paramActivityManager;
      return this;
    }
    
    public final Builder setArrayPoolSize(int paramInt)
    {
      this.arrayPoolSizeBytes = paramInt;
      return this;
    }
    
    public final Builder setBitmapPoolScreens(float paramFloat)
    {
      boolean bool;
      if (paramFloat >= 0.0F) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "Bitmap pool screens must be greater than or equal to 0");
      this.bitmapPoolScreens = paramFloat;
      return this;
    }
    
    public final Builder setLowMemoryMaxSizeMultiplier(float paramFloat)
    {
      boolean bool;
      if ((paramFloat >= 0.0F) && (paramFloat <= 1.0F)) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "Low memory max size multiplier must be between 0 and 1");
      this.lowMemoryMaxSizeMultiplier = paramFloat;
      return this;
    }
    
    public final Builder setMaxSizeMultiplier(float paramFloat)
    {
      boolean bool;
      if ((paramFloat >= 0.0F) && (paramFloat <= 1.0F)) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "Size multiplier must be between 0 and 1");
      this.maxSizeMultiplier = paramFloat;
      return this;
    }
    
    public final Builder setMemoryCacheScreens(float paramFloat)
    {
      boolean bool;
      if (paramFloat >= 0.0F) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "Memory cache screens must be greater than or equal to 0");
      this.memoryCacheScreens = paramFloat;
      return this;
    }
    
    @VisibleForTesting
    final Builder setScreenDimensions(MemorySizeCalculator.ScreenDimensions paramScreenDimensions)
    {
      this.screenDimensions = paramScreenDimensions;
      return this;
    }
  }
  
  static final class DisplayMetricsScreenDimensions
    implements MemorySizeCalculator.ScreenDimensions
  {
    private final DisplayMetrics displayMetrics;
    
    DisplayMetricsScreenDimensions(DisplayMetrics paramDisplayMetrics)
    {
      this.displayMetrics = paramDisplayMetrics;
    }
    
    public final int getHeightPixels()
    {
      return this.displayMetrics.heightPixels;
    }
    
    public final int getWidthPixels()
    {
      return this.displayMetrics.widthPixels;
    }
  }
  
  static abstract interface ScreenDimensions
  {
    public abstract int getHeightPixels();
    
    public abstract int getWidthPixels();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/cache/MemorySizeCalculator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */