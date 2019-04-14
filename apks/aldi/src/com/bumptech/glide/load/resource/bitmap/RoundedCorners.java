package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class RoundedCorners
  extends BitmapTransformation
{
  private static final String ID = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";
  private static final byte[] ID_BYTES = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(CHARSET);
  private final int roundingRadius;
  
  public RoundedCorners(int paramInt)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "roundingRadius must be greater than 0.");
    this.roundingRadius = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof RoundedCorners))
    {
      paramObject = (RoundedCorners)paramObject;
      if (this.roundingRadius == ((RoundedCorners)paramObject).roundingRadius) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Util.hashCode("com.bumptech.glide.load.resource.bitmap.RoundedCorners".hashCode(), Util.hashCode(this.roundingRadius));
  }
  
  protected final Bitmap transform(@NonNull BitmapPool paramBitmapPool, @NonNull Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    return TransformationUtils.roundedCorners(paramBitmapPool, paramBitmap, this.roundingRadius);
  }
  
  public final void updateDiskCacheKey(@NonNull MessageDigest paramMessageDigest)
  {
    paramMessageDigest.update(ID_BYTES);
    paramMessageDigest.update(ByteBuffer.allocate(4).putInt(this.roundingRadius).array());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/RoundedCorners.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */