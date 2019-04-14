package com.bumptech.glide.load.resource.bitmap;

import android.media.ExifInterface;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@RequiresApi(27)
public final class ExifInterfaceImageHeaderParser
  implements ImageHeaderParser
{
  public final int getOrientation(@NonNull InputStream paramInputStream, @NonNull ArrayPool paramArrayPool)
    throws IOException
  {
    int j = new ExifInterface(paramInputStream).getAttributeInt("Orientation", 1);
    int i = j;
    if (j == 0) {
      i = -1;
    }
    return i;
  }
  
  public final int getOrientation(@NonNull ByteBuffer paramByteBuffer, @NonNull ArrayPool paramArrayPool)
    throws IOException
  {
    return getOrientation(ByteBufferUtil.toStream(paramByteBuffer), paramArrayPool);
  }
  
  @NonNull
  public final ImageHeaderParser.ImageType getType(@NonNull InputStream paramInputStream)
    throws IOException
  {
    return ImageHeaderParser.ImageType.UNKNOWN;
  }
  
  @NonNull
  public final ImageHeaderParser.ImageType getType(@NonNull ByteBuffer paramByteBuffer)
    throws IOException
  {
    return ImageHeaderParser.ImageType.UNKNOWN;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/ExifInterfaceImageHeaderParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */