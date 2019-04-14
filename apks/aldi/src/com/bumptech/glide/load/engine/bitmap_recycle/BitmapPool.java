package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.annotation.NonNull;

public abstract interface BitmapPool
{
  public abstract void clearMemory();
  
  @NonNull
  public abstract Bitmap get(int paramInt1, int paramInt2, Bitmap.Config paramConfig);
  
  @NonNull
  public abstract Bitmap getDirty(int paramInt1, int paramInt2, Bitmap.Config paramConfig);
  
  public abstract long getMaxSize();
  
  public abstract void put(Bitmap paramBitmap);
  
  public abstract void setSizeMultiplier(float paramFloat);
  
  public abstract void trimMemory(int paramInt);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/bitmap_recycle/BitmapPool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */