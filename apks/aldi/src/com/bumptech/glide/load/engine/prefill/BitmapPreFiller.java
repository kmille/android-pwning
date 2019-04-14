package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.util.Util;
import java.util.HashMap;
import java.util.Map;

public final class BitmapPreFiller
{
  private final BitmapPool bitmapPool;
  private BitmapPreFillRunner current;
  private final DecodeFormat defaultFormat;
  private final Handler handler = new Handler(Looper.getMainLooper());
  private final MemoryCache memoryCache;
  
  public BitmapPreFiller(MemoryCache paramMemoryCache, BitmapPool paramBitmapPool, DecodeFormat paramDecodeFormat)
  {
    this.memoryCache = paramMemoryCache;
    this.bitmapPool = paramBitmapPool;
    this.defaultFormat = paramDecodeFormat;
  }
  
  private static int getSizeInBytes(PreFillType paramPreFillType)
  {
    return Util.getBitmapByteSize(paramPreFillType.getWidth(), paramPreFillType.getHeight(), paramPreFillType.getConfig());
  }
  
  @VisibleForTesting
  final PreFillQueue generateAllocationOrder(PreFillType... paramVarArgs)
  {
    long l1 = this.memoryCache.getMaxSize();
    long l2 = this.memoryCache.getCurrentSize();
    long l3 = this.bitmapPool.getMaxSize();
    int m = paramVarArgs.length;
    int k = 0;
    int i = 0;
    int j = 0;
    while (i < m)
    {
      j += paramVarArgs[i].getWeight();
      i += 1;
    }
    float f = (float)(l1 - l2 + l3) / j;
    HashMap localHashMap = new HashMap();
    j = paramVarArgs.length;
    i = k;
    while (i < j)
    {
      PreFillType localPreFillType = paramVarArgs[i];
      localHashMap.put(localPreFillType, Integer.valueOf(Math.round(localPreFillType.getWeight() * f) / getSizeInBytes(localPreFillType)));
      i += 1;
    }
    return new PreFillQueue(localHashMap);
  }
  
  public final void preFill(PreFillType.Builder... paramVarArgs)
  {
    if (this.current != null) {
      this.current.cancel();
    }
    PreFillType[] arrayOfPreFillType = new PreFillType[paramVarArgs.length];
    int i = 0;
    while (i < paramVarArgs.length)
    {
      PreFillType.Builder localBuilder = paramVarArgs[i];
      if (localBuilder.getConfig() == null)
      {
        Bitmap.Config localConfig;
        if (this.defaultFormat == DecodeFormat.PREFER_ARGB_8888) {
          localConfig = Bitmap.Config.ARGB_8888;
        } else {
          localConfig = Bitmap.Config.RGB_565;
        }
        localBuilder.setConfig(localConfig);
      }
      arrayOfPreFillType[i] = localBuilder.build();
      i += 1;
    }
    paramVarArgs = generateAllocationOrder(arrayOfPreFillType);
    this.current = new BitmapPreFillRunner(this.bitmapPool, this.memoryCache, paramVarArgs);
    this.handler.post(this.current);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/prefill/BitmapPreFiller.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */