package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.annotation.Nullable;

abstract interface LruPoolStrategy
{
  @Nullable
  public abstract Bitmap get(int paramInt1, int paramInt2, Bitmap.Config paramConfig);
  
  public abstract int getSize(Bitmap paramBitmap);
  
  public abstract String logBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig);
  
  public abstract String logBitmap(Bitmap paramBitmap);
  
  public abstract void put(Bitmap paramBitmap);
  
  @Nullable
  public abstract Bitmap removeLast();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/bitmap_recycle/LruPoolStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */