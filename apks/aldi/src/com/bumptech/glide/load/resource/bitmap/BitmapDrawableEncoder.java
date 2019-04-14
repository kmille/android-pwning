package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.File;

public class BitmapDrawableEncoder
  implements ResourceEncoder<BitmapDrawable>
{
  private final BitmapPool bitmapPool;
  private final ResourceEncoder<Bitmap> encoder;
  
  public BitmapDrawableEncoder(BitmapPool paramBitmapPool, ResourceEncoder<Bitmap> paramResourceEncoder)
  {
    this.bitmapPool = paramBitmapPool;
    this.encoder = paramResourceEncoder;
  }
  
  public boolean encode(@NonNull Resource<BitmapDrawable> paramResource, @NonNull File paramFile, @NonNull Options paramOptions)
  {
    return this.encoder.encode(new BitmapResource(((BitmapDrawable)paramResource.get()).getBitmap(), this.bitmapPool), paramFile, paramOptions);
  }
  
  @NonNull
  public EncodeStrategy getEncodeStrategy(@NonNull Options paramOptions)
  {
    return this.encoder.getEncodeStrategy(paramOptions);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/BitmapDrawableEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */