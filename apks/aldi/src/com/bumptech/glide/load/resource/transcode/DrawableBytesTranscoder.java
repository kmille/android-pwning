package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.gif.GifDrawable;

public final class DrawableBytesTranscoder
  implements ResourceTranscoder<Drawable, byte[]>
{
  private final ResourceTranscoder<Bitmap, byte[]> bitmapBytesTranscoder;
  private final BitmapPool bitmapPool;
  private final ResourceTranscoder<GifDrawable, byte[]> gifDrawableBytesTranscoder;
  
  public DrawableBytesTranscoder(@NonNull BitmapPool paramBitmapPool, @NonNull ResourceTranscoder<Bitmap, byte[]> paramResourceTranscoder, @NonNull ResourceTranscoder<GifDrawable, byte[]> paramResourceTranscoder1)
  {
    this.bitmapPool = paramBitmapPool;
    this.bitmapBytesTranscoder = paramResourceTranscoder;
    this.gifDrawableBytesTranscoder = paramResourceTranscoder1;
  }
  
  @NonNull
  private static Resource<GifDrawable> toGifDrawableResource(@NonNull Resource<Drawable> paramResource)
  {
    return paramResource;
  }
  
  @Nullable
  public final Resource<byte[]> transcode(@NonNull Resource<Drawable> paramResource, @NonNull Options paramOptions)
  {
    Drawable localDrawable = (Drawable)paramResource.get();
    if ((localDrawable instanceof BitmapDrawable)) {
      return this.bitmapBytesTranscoder.transcode(BitmapResource.obtain(((BitmapDrawable)localDrawable).getBitmap(), this.bitmapPool), paramOptions);
    }
    if ((localDrawable instanceof GifDrawable)) {
      return this.gifDrawableBytesTranscoder.transcode(toGifDrawableResource(paramResource), paramOptions);
    }
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/transcode/DrawableBytesTranscoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */