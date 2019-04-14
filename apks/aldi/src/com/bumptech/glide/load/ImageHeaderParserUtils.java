package com.bumptech.glide.load;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class ImageHeaderParserUtils
{
  private static final int MARK_POSITION = 5242880;
  
  public static int getOrientation(@NonNull List<ImageHeaderParser> paramList, @Nullable InputStream paramInputStream, @NonNull ArrayPool paramArrayPool)
    throws IOException
  {
    if (paramInputStream == null) {
      return -1;
    }
    Object localObject = paramInputStream;
    if (!paramInputStream.markSupported()) {
      localObject = new RecyclableBufferedInputStream(paramInputStream, paramArrayPool);
    }
    ((InputStream)localObject).mark(5242880);
    int i = 0;
    int j = paramList.size();
    while (i < j)
    {
      paramInputStream = (ImageHeaderParser)paramList.get(i);
      try
      {
        int k = paramInputStream.getOrientation((InputStream)localObject, paramArrayPool);
        if (k != -1) {
          return k;
        }
        ((InputStream)localObject).reset();
        i += 1;
      }
      finally
      {
        ((InputStream)localObject).reset();
      }
    }
    return -1;
  }
  
  @NonNull
  public static ImageHeaderParser.ImageType getType(@NonNull List<ImageHeaderParser> paramList, @Nullable InputStream paramInputStream, @NonNull ArrayPool paramArrayPool)
    throws IOException
  {
    if (paramInputStream == null) {
      return ImageHeaderParser.ImageType.UNKNOWN;
    }
    Object localObject = paramInputStream;
    if (!paramInputStream.markSupported()) {
      localObject = new RecyclableBufferedInputStream(paramInputStream, paramArrayPool);
    }
    ((InputStream)localObject).mark(5242880);
    int i = 0;
    int j = paramList.size();
    while (i < j)
    {
      paramInputStream = (ImageHeaderParser)paramList.get(i);
      try
      {
        paramInputStream = paramInputStream.getType((InputStream)localObject);
        paramArrayPool = ImageHeaderParser.ImageType.UNKNOWN;
        if (paramInputStream != paramArrayPool) {
          return paramInputStream;
        }
        ((InputStream)localObject).reset();
        i += 1;
      }
      finally
      {
        ((InputStream)localObject).reset();
      }
    }
    return ImageHeaderParser.ImageType.UNKNOWN;
  }
  
  @NonNull
  public static ImageHeaderParser.ImageType getType(@NonNull List<ImageHeaderParser> paramList, @Nullable ByteBuffer paramByteBuffer)
    throws IOException
  {
    if (paramByteBuffer == null) {
      return ImageHeaderParser.ImageType.UNKNOWN;
    }
    int i = 0;
    int j = paramList.size();
    while (i < j)
    {
      ImageHeaderParser.ImageType localImageType = ((ImageHeaderParser)paramList.get(i)).getType(paramByteBuffer);
      if (localImageType != ImageHeaderParser.ImageType.UNKNOWN) {
        return localImageType;
      }
      i += 1;
    }
    return ImageHeaderParser.ImageType.UNKNOWN;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/ImageHeaderParserUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */