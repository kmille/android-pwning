package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;

public final class GifFrameResourceDecoder
  implements ResourceDecoder<GifDecoder, Bitmap>
{
  private final BitmapPool bitmapPool;
  
  public GifFrameResourceDecoder(BitmapPool paramBitmapPool)
  {
    this.bitmapPool = paramBitmapPool;
  }
  
  public final Resource<Bitmap> decode(@NonNull GifDecoder paramGifDecoder, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    return BitmapResource.obtain(paramGifDecoder.getNextFrame(), this.bitmapPool);
  }
  
  public final boolean handles(@NonNull GifDecoder paramGifDecoder, @NonNull Options paramOptions)
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/gif/GifFrameResourceDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */