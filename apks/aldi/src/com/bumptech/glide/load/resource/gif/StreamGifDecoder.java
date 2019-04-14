package com.bumptech.glide.load.resource.gif;

import android.support.annotation.NonNull;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class StreamGifDecoder
  implements ResourceDecoder<InputStream, GifDrawable>
{
  private static final String TAG = "StreamGifDecoder";
  private final ArrayPool byteArrayPool;
  private final ResourceDecoder<ByteBuffer, GifDrawable> byteBufferDecoder;
  private final List<ImageHeaderParser> parsers;
  
  public StreamGifDecoder(List<ImageHeaderParser> paramList, ResourceDecoder<ByteBuffer, GifDrawable> paramResourceDecoder, ArrayPool paramArrayPool)
  {
    this.parsers = paramList;
    this.byteBufferDecoder = paramResourceDecoder;
    this.byteArrayPool = paramArrayPool;
  }
  
  private static byte[] inputStreamToBytes(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(16384);
    try
    {
      byte[] arrayOfByte = new byte['䀀'];
      for (;;)
      {
        int i = paramInputStream.read(arrayOfByte);
        if (i == -1) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      localByteArrayOutputStream.flush();
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException paramInputStream)
    {
      for (;;) {}
    }
    Log.isLoggable("StreamGifDecoder", 5);
    return null;
  }
  
  public Resource<GifDrawable> decode(@NonNull InputStream paramInputStream, int paramInt1, int paramInt2, @NonNull Options paramOptions)
    throws IOException
  {
    paramInputStream = inputStreamToBytes(paramInputStream);
    if (paramInputStream == null) {
      return null;
    }
    paramInputStream = ByteBuffer.wrap(paramInputStream);
    return this.byteBufferDecoder.decode(paramInputStream, paramInt1, paramInt2, paramOptions);
  }
  
  public boolean handles(@NonNull InputStream paramInputStream, @NonNull Options paramOptions)
    throws IOException
  {
    return (!((Boolean)paramOptions.get(GifOptions.DISABLE_ANIMATION)).booleanValue()) && (ImageHeaderParserUtils.getType(this.parsers, paramInputStream, this.byteArrayPool) == ImageHeaderParser.ImageType.GIF);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/gif/StreamGifDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */