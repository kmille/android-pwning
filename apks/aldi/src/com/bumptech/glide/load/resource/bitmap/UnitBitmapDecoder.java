package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Util;

public final class UnitBitmapDecoder
  implements ResourceDecoder<Bitmap, Bitmap>
{
  public final Resource<Bitmap> decode(@NonNull Bitmap paramBitmap, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    return new NonOwnedBitmapResource(paramBitmap);
  }
  
  public final boolean handles(@NonNull Bitmap paramBitmap, @NonNull Options paramOptions)
  {
    return true;
  }
  
  static final class NonOwnedBitmapResource
    implements Resource<Bitmap>
  {
    private final Bitmap bitmap;
    
    NonOwnedBitmapResource(@NonNull Bitmap paramBitmap)
    {
      this.bitmap = paramBitmap;
    }
    
    @NonNull
    public final Bitmap get()
    {
      return this.bitmap;
    }
    
    @NonNull
    public final Class<Bitmap> getResourceClass()
    {
      return Bitmap.class;
    }
    
    public final int getSize()
    {
      return Util.getBitmapByteSize(this.bitmap);
    }
    
    public final void recycle() {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/UnitBitmapDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */