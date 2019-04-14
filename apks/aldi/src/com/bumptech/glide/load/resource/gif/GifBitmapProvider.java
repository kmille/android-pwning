package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

public final class GifBitmapProvider
  implements GifDecoder.BitmapProvider
{
  @Nullable
  private final ArrayPool arrayPool;
  private final BitmapPool bitmapPool;
  
  public GifBitmapProvider(BitmapPool paramBitmapPool)
  {
    this(paramBitmapPool, null);
  }
  
  public GifBitmapProvider(BitmapPool paramBitmapPool, @Nullable ArrayPool paramArrayPool)
  {
    this.bitmapPool = paramBitmapPool;
    this.arrayPool = paramArrayPool;
  }
  
  @NonNull
  public final Bitmap obtain(int paramInt1, int paramInt2, @NonNull Bitmap.Config paramConfig)
  {
    return this.bitmapPool.getDirty(paramInt1, paramInt2, paramConfig);
  }
  
  @NonNull
  public final byte[] obtainByteArray(int paramInt)
  {
    if (this.arrayPool == null) {
      return new byte[paramInt];
    }
    return (byte[])this.arrayPool.get(paramInt, byte[].class);
  }
  
  @NonNull
  public final int[] obtainIntArray(int paramInt)
  {
    if (this.arrayPool == null) {
      return new int[paramInt];
    }
    return (int[])this.arrayPool.get(paramInt, int[].class);
  }
  
  public final void release(@NonNull Bitmap paramBitmap)
  {
    this.bitmapPool.put(paramBitmap);
  }
  
  public final void release(@NonNull byte[] paramArrayOfByte)
  {
    if (this.arrayPool == null) {
      return;
    }
    this.arrayPool.put(paramArrayOfByte);
  }
  
  public final void release(@NonNull int[] paramArrayOfInt)
  {
    if (this.arrayPool == null) {
      return;
    }
    this.arrayPool.put(paramArrayOfInt);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/gif/GifBitmapProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */