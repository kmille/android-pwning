package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

public abstract interface GifDecoder
{
  public static final int STATUS_FORMAT_ERROR = 1;
  public static final int STATUS_OK = 0;
  public static final int STATUS_OPEN_ERROR = 2;
  public static final int STATUS_PARTIAL_DECODE = 3;
  public static final int TOTAL_ITERATION_COUNT_FOREVER = 0;
  
  public abstract void advance();
  
  public abstract void clear();
  
  public abstract int getByteSize();
  
  public abstract int getCurrentFrameIndex();
  
  @NonNull
  public abstract ByteBuffer getData();
  
  public abstract int getDelay(int paramInt);
  
  public abstract int getFrameCount();
  
  public abstract int getHeight();
  
  @Deprecated
  public abstract int getLoopCount();
  
  public abstract int getNetscapeLoopCount();
  
  public abstract int getNextDelay();
  
  @Nullable
  public abstract Bitmap getNextFrame();
  
  public abstract int getStatus();
  
  public abstract int getTotalIterationCount();
  
  public abstract int getWidth();
  
  public abstract int read(@Nullable InputStream paramInputStream, int paramInt);
  
  public abstract int read(@Nullable byte[] paramArrayOfByte);
  
  public abstract void resetFrameIndex();
  
  public abstract void setData(@NonNull GifHeader paramGifHeader, @NonNull ByteBuffer paramByteBuffer);
  
  public abstract void setData(@NonNull GifHeader paramGifHeader, @NonNull ByteBuffer paramByteBuffer, int paramInt);
  
  public abstract void setData(@NonNull GifHeader paramGifHeader, @NonNull byte[] paramArrayOfByte);
  
  public abstract void setDefaultBitmapConfig(@NonNull Bitmap.Config paramConfig);
  
  public static abstract interface BitmapProvider
  {
    @NonNull
    public abstract Bitmap obtain(int paramInt1, int paramInt2, @NonNull Bitmap.Config paramConfig);
    
    @NonNull
    public abstract byte[] obtainByteArray(int paramInt);
    
    @NonNull
    public abstract int[] obtainIntArray(int paramInt);
    
    public abstract void release(@NonNull Bitmap paramBitmap);
    
    public abstract void release(@NonNull byte[] paramArrayOfByte);
    
    public abstract void release(@NonNull int[] paramArrayOfInt);
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface GifDecodeStatus {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/gifdecoder/GifDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */