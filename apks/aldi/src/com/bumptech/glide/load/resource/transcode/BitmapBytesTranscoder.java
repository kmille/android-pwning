package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bytes.BytesResource;
import java.io.ByteArrayOutputStream;

public class BitmapBytesTranscoder
  implements ResourceTranscoder<Bitmap, byte[]>
{
  private final Bitmap.CompressFormat compressFormat;
  private final int quality;
  
  public BitmapBytesTranscoder()
  {
    this(Bitmap.CompressFormat.JPEG, 100);
  }
  
  public BitmapBytesTranscoder(@NonNull Bitmap.CompressFormat paramCompressFormat, int paramInt)
  {
    this.compressFormat = paramCompressFormat;
    this.quality = paramInt;
  }
  
  @Nullable
  public Resource<byte[]> transcode(@NonNull Resource<Bitmap> paramResource, @NonNull Options paramOptions)
  {
    paramOptions = new ByteArrayOutputStream();
    ((Bitmap)paramResource.get()).compress(this.compressFormat, this.quality, paramOptions);
    paramResource.recycle();
    return new BytesResource(paramOptions.toByteArray());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/transcode/BitmapBytesTranscoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */