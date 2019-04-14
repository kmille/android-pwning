package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;

public class ResourceBitmapDecoder
  implements ResourceDecoder<Uri, Bitmap>
{
  private final BitmapPool bitmapPool;
  private final ResourceDrawableDecoder drawableDecoder;
  
  public ResourceBitmapDecoder(ResourceDrawableDecoder paramResourceDrawableDecoder, BitmapPool paramBitmapPool)
  {
    this.drawableDecoder = paramResourceDrawableDecoder;
    this.bitmapPool = paramBitmapPool;
  }
  
  @Nullable
  public Resource<Bitmap> decode(@NonNull Uri paramUri, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    paramUri = this.drawableDecoder.decode(paramUri, paramInt1, paramInt2, paramOptions);
    if (paramUri == null) {
      return null;
    }
    paramUri = (Drawable)paramUri.get();
    return DrawableToBitmapConverter.convert(this.bitmapPool, paramUri, paramInt1, paramInt2);
  }
  
  public boolean handles(@NonNull Uri paramUri, @NonNull Options paramOptions)
  {
    return "android.resource".equals(paramUri.getScheme());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/ResourceBitmapDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */