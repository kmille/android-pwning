package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider;
import com.bumptech.glide.gifdecoder.GifHeader;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

public class ByteBufferGifDecoder
  implements ResourceDecoder<ByteBuffer, GifDrawable>
{
  private static final GifDecoderFactory GIF_DECODER_FACTORY = new GifDecoderFactory();
  private static final GifHeaderParserPool PARSER_POOL = new GifHeaderParserPool();
  private static final String TAG = "BufferGifDecoder";
  private final Context context;
  private final GifDecoderFactory gifDecoderFactory;
  private final GifHeaderParserPool parserPool;
  private final List<ImageHeaderParser> parsers;
  private final GifBitmapProvider provider;
  
  public ByteBufferGifDecoder(Context paramContext)
  {
    this(paramContext, Glide.get(paramContext).getRegistry().getImageHeaderParsers(), Glide.get(paramContext).getBitmapPool(), Glide.get(paramContext).getArrayPool());
  }
  
  public ByteBufferGifDecoder(Context paramContext, List<ImageHeaderParser> paramList, BitmapPool paramBitmapPool, ArrayPool paramArrayPool)
  {
    this(paramContext, paramList, paramBitmapPool, paramArrayPool, PARSER_POOL, GIF_DECODER_FACTORY);
  }
  
  @VisibleForTesting
  ByteBufferGifDecoder(Context paramContext, List<ImageHeaderParser> paramList, BitmapPool paramBitmapPool, ArrayPool paramArrayPool, GifHeaderParserPool paramGifHeaderParserPool, GifDecoderFactory paramGifDecoderFactory)
  {
    this.context = paramContext.getApplicationContext();
    this.parsers = paramList;
    this.gifDecoderFactory = paramGifDecoderFactory;
    this.provider = new GifBitmapProvider(paramBitmapPool, paramArrayPool);
    this.parserPool = paramGifHeaderParserPool;
  }
  
  @Nullable
  private GifDrawableResource decode(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, GifHeaderParser paramGifHeaderParser, Options paramOptions)
  {
    long l = LogTime.getLogTime();
    try
    {
      GifHeader localGifHeader = paramGifHeaderParser.parseHeader();
      if ((localGifHeader.getNumFrames() > 0) && (localGifHeader.getStatus() == 0))
      {
        if (paramOptions.get(GifOptions.DECODE_FORMAT) == DecodeFormat.PREFER_RGB_565) {
          paramGifHeaderParser = Bitmap.Config.RGB_565;
        } else {
          paramGifHeaderParser = Bitmap.Config.ARGB_8888;
        }
        int i = getSampleSize(localGifHeader, paramInt1, paramInt2);
        paramByteBuffer = this.gifDecoderFactory.build(this.provider, localGifHeader, paramByteBuffer, i);
        paramByteBuffer.setDefaultBitmapConfig(paramGifHeaderParser);
        paramByteBuffer.advance();
        paramGifHeaderParser = paramByteBuffer.getNextFrame();
        if (paramGifHeaderParser == null) {
          return null;
        }
        paramOptions = UnitTransformation.get();
        paramByteBuffer = new GifDrawableResource(new GifDrawable(this.context, paramByteBuffer, paramOptions, paramInt1, paramInt2, paramGifHeaderParser));
        return paramByteBuffer;
      }
      return null;
    }
    finally
    {
      if (Log.isLoggable("BufferGifDecoder", 2)) {
        new StringBuilder("Decoded GIF from stream in ").append(LogTime.getElapsedMillis(l));
      }
    }
  }
  
  private static int getSampleSize(GifHeader paramGifHeader, int paramInt1, int paramInt2)
  {
    int i = Math.min(paramGifHeader.getHeight() / paramInt2, paramGifHeader.getWidth() / paramInt1);
    if (i == 0) {
      i = 0;
    } else {
      i = Integer.highestOneBit(i);
    }
    i = Math.max(1, i);
    if ((Log.isLoggable("BufferGifDecoder", 2)) && (i > 1))
    {
      StringBuilder localStringBuilder = new StringBuilder("Downsampling GIF, sampleSize: ");
      localStringBuilder.append(i);
      localStringBuilder.append(", target dimens: [");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append("x");
      localStringBuilder.append(paramInt2);
      localStringBuilder.append("], actual dimens: [");
      localStringBuilder.append(paramGifHeader.getWidth());
      localStringBuilder.append("x");
      localStringBuilder.append(paramGifHeader.getHeight());
      localStringBuilder.append("]");
    }
    return i;
  }
  
  public GifDrawableResource decode(@NonNull ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    GifHeaderParser localGifHeaderParser = this.parserPool.obtain(paramByteBuffer);
    try
    {
      paramByteBuffer = decode(paramByteBuffer, paramInt1, paramInt2, localGifHeaderParser, paramOptions);
      return paramByteBuffer;
    }
    finally
    {
      this.parserPool.release(localGifHeaderParser);
    }
  }
  
  public boolean handles(@NonNull ByteBuffer paramByteBuffer, @NonNull Options paramOptions)
    throws IOException
  {
    return (!((Boolean)paramOptions.get(GifOptions.DISABLE_ANIMATION)).booleanValue()) && (ImageHeaderParserUtils.getType(this.parsers, paramByteBuffer) == ImageHeaderParser.ImageType.GIF);
  }
  
  @VisibleForTesting
  static class GifDecoderFactory
  {
    GifDecoder build(GifDecoder.BitmapProvider paramBitmapProvider, GifHeader paramGifHeader, ByteBuffer paramByteBuffer, int paramInt)
    {
      return new StandardGifDecoder(paramBitmapProvider, paramGifHeader, paramByteBuffer, paramInt);
    }
  }
  
  @VisibleForTesting
  static class GifHeaderParserPool
  {
    private final Queue<GifHeaderParser> pool = Util.createQueue(0);
    
    GifHeaderParser obtain(ByteBuffer paramByteBuffer)
    {
      try
      {
        GifHeaderParser localGifHeaderParser2 = (GifHeaderParser)this.pool.poll();
        GifHeaderParser localGifHeaderParser1 = localGifHeaderParser2;
        if (localGifHeaderParser2 == null) {
          localGifHeaderParser1 = new GifHeaderParser();
        }
        paramByteBuffer = localGifHeaderParser1.setData(paramByteBuffer);
        return paramByteBuffer;
      }
      finally {}
    }
    
    void release(GifHeaderParser paramGifHeaderParser)
    {
      try
      {
        paramGifHeaderParser.clear();
        this.pool.offer(paramGifHeaderParser);
        return;
      }
      finally
      {
        paramGifHeaderParser = finally;
        throw paramGifHeaderParser;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/gif/ByteBufferGifDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */