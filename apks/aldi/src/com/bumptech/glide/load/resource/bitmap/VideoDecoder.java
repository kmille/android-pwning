package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Option.CacheKeyUpdater;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class VideoDecoder<T>
  implements ResourceDecoder<T, Bitmap>
{
  private static final MediaMetadataRetrieverFactory DEFAULT_FACTORY = new MediaMetadataRetrieverFactory();
  public static final long DEFAULT_FRAME = -1L;
  @VisibleForTesting
  static final int DEFAULT_FRAME_OPTION = 2;
  public static final Option<Integer> FRAME_OPTION;
  private static final String TAG = "VideoDecoder";
  public static final Option<Long> TARGET_FRAME = Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1L), new Option.CacheKeyUpdater()
  {
    private final ByteBuffer buffer = ByteBuffer.allocate(8);
    
    public void update(@NonNull byte[] arg1, @NonNull Long paramAnonymousLong, @NonNull MessageDigest paramAnonymousMessageDigest)
    {
      paramAnonymousMessageDigest.update(???);
      synchronized (this.buffer)
      {
        this.buffer.position(0);
        paramAnonymousMessageDigest.update(this.buffer.putLong(paramAnonymousLong.longValue()).array());
        return;
      }
    }
  });
  private final BitmapPool bitmapPool;
  private final MediaMetadataRetrieverFactory factory;
  private final MediaMetadataRetrieverInitializer<T> initializer;
  
  static
  {
    FRAME_OPTION = Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", Integer.valueOf(2), new Option.CacheKeyUpdater()
    {
      private final ByteBuffer buffer = ByteBuffer.allocate(4);
      
      public void update(@NonNull byte[] arg1, @NonNull Integer paramAnonymousInteger, @NonNull MessageDigest paramAnonymousMessageDigest)
      {
        if (paramAnonymousInteger == null) {
          return;
        }
        paramAnonymousMessageDigest.update(???);
        synchronized (this.buffer)
        {
          this.buffer.position(0);
          paramAnonymousMessageDigest.update(this.buffer.putInt(paramAnonymousInteger.intValue()).array());
          return;
        }
      }
    });
  }
  
  VideoDecoder(BitmapPool paramBitmapPool, MediaMetadataRetrieverInitializer<T> paramMediaMetadataRetrieverInitializer)
  {
    this(paramBitmapPool, paramMediaMetadataRetrieverInitializer, DEFAULT_FACTORY);
  }
  
  @VisibleForTesting
  VideoDecoder(BitmapPool paramBitmapPool, MediaMetadataRetrieverInitializer<T> paramMediaMetadataRetrieverInitializer, MediaMetadataRetrieverFactory paramMediaMetadataRetrieverFactory)
  {
    this.bitmapPool = paramBitmapPool;
    this.initializer = paramMediaMetadataRetrieverInitializer;
    this.factory = paramMediaMetadataRetrieverFactory;
  }
  
  public static ResourceDecoder<AssetFileDescriptor, Bitmap> asset(BitmapPool paramBitmapPool)
  {
    return new VideoDecoder(paramBitmapPool, new AssetFileDescriptorInitializer(null));
  }
  
  @Nullable
  private static Bitmap decodeFrame(MediaMetadataRetriever paramMediaMetadataRetriever, long paramLong, int paramInt1, int paramInt2, int paramInt3, DownsampleStrategy paramDownsampleStrategy)
  {
    if ((Build.VERSION.SDK_INT >= 27) && (paramInt2 != Integer.MIN_VALUE) && (paramInt3 != Integer.MIN_VALUE) && (paramDownsampleStrategy != DownsampleStrategy.NONE)) {
      paramDownsampleStrategy = decodeScaledFrame(paramMediaMetadataRetriever, paramLong, paramInt1, paramInt2, paramInt3, paramDownsampleStrategy);
    } else {
      paramDownsampleStrategy = null;
    }
    Object localObject = paramDownsampleStrategy;
    if (paramDownsampleStrategy == null) {
      localObject = decodeOriginalFrame(paramMediaMetadataRetriever, paramLong, paramInt1);
    }
    return (Bitmap)localObject;
  }
  
  private static Bitmap decodeOriginalFrame(MediaMetadataRetriever paramMediaMetadataRetriever, long paramLong, int paramInt)
  {
    return paramMediaMetadataRetriever.getFrameAtTime(paramLong, paramInt);
  }
  
  @TargetApi(27)
  private static Bitmap decodeScaledFrame(MediaMetadataRetriever paramMediaMetadataRetriever, long paramLong, int paramInt1, int paramInt2, int paramInt3, DownsampleStrategy paramDownsampleStrategy)
  {
    try
    {
      k = Integer.parseInt(paramMediaMetadataRetriever.extractMetadata(18));
      i = Integer.parseInt(paramMediaMetadataRetriever.extractMetadata(19));
      int n = Integer.parseInt(paramMediaMetadataRetriever.extractMetadata(24));
      if (n == 90) {
        break label114;
      }
      j = k;
      m = i;
      if (n != 270) {}
    }
    catch (Throwable paramMediaMetadataRetriever)
    {
      for (;;)
      {
        int k;
        int i;
        float f;
        continue;
        label114:
        int j = i;
        int m = k;
      }
    }
    f = paramDownsampleStrategy.getScaleFactor(j, m, paramInt2, paramInt3);
    paramMediaMetadataRetriever = paramMediaMetadataRetriever.getScaledFrameAtTime(paramLong, paramInt1, Math.round(j * f), Math.round(f * m));
    return paramMediaMetadataRetriever;
    Log.isLoggable("VideoDecoder", 3);
    return null;
  }
  
  public static ResourceDecoder<ParcelFileDescriptor, Bitmap> parcel(BitmapPool paramBitmapPool)
  {
    return new VideoDecoder(paramBitmapPool, new ParcelFileDescriptorInitializer());
  }
  
  /* Error */
  public com.bumptech.glide.load.engine.Resource<Bitmap> decode(@NonNull T paramT, int paramInt1, int paramInt2, @NonNull Options paramOptions)
    throws java.io.IOException
  {
    // Byte code:
    //   0: aload 4
    //   2: getstatic 69	com/bumptech/glide/load/resource/bitmap/VideoDecoder:TARGET_FRAME	Lcom/bumptech/glide/load/Option;
    //   5: invokevirtual 183	com/bumptech/glide/load/Options:get	(Lcom/bumptech/glide/load/Option;)Ljava/lang/Object;
    //   8: checkcast 54	java/lang/Long
    //   11: invokevirtual 187	java/lang/Long:longValue	()J
    //   14: lstore 5
    //   16: lload 5
    //   18: lconst_0
    //   19: lcmp
    //   20: ifge +33 -> 53
    //   23: lload 5
    //   25: ldc2_w 28
    //   28: lcmp
    //   29: ifne +6 -> 35
    //   32: goto +21 -> 53
    //   35: new 189	java/lang/IllegalArgumentException
    //   38: dup
    //   39: ldc -65
    //   41: lload 5
    //   43: invokestatic 196	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   46: invokevirtual 200	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   49: invokespecial 203	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   52: athrow
    //   53: aload 4
    //   55: getstatic 79	com/bumptech/glide/load/resource/bitmap/VideoDecoder:FRAME_OPTION	Lcom/bumptech/glide/load/Option;
    //   58: invokevirtual 183	com/bumptech/glide/load/Options:get	(Lcom/bumptech/glide/load/Option;)Ljava/lang/Object;
    //   61: checkcast 73	java/lang/Integer
    //   64: astore 8
    //   66: aload 8
    //   68: astore 7
    //   70: aload 8
    //   72: ifnonnull +9 -> 81
    //   75: iconst_2
    //   76: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   79: astore 7
    //   81: aload 4
    //   83: getstatic 206	com/bumptech/glide/load/resource/bitmap/DownsampleStrategy:OPTION	Lcom/bumptech/glide/load/Option;
    //   86: invokevirtual 183	com/bumptech/glide/load/Options:get	(Lcom/bumptech/glide/load/Option;)Ljava/lang/Object;
    //   89: checkcast 117	com/bumptech/glide/load/resource/bitmap/DownsampleStrategy
    //   92: astore 8
    //   94: aload 8
    //   96: astore 4
    //   98: aload 8
    //   100: ifnonnull +8 -> 108
    //   103: getstatic 209	com/bumptech/glide/load/resource/bitmap/DownsampleStrategy:DEFAULT	Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;
    //   106: astore 4
    //   108: aload_0
    //   109: getfield 96	com/bumptech/glide/load/resource/bitmap/VideoDecoder:factory	Lcom/bumptech/glide/load/resource/bitmap/VideoDecoder$MediaMetadataRetrieverFactory;
    //   112: invokevirtual 213	com/bumptech/glide/load/resource/bitmap/VideoDecoder$MediaMetadataRetrieverFactory:build	()Landroid/media/MediaMetadataRetriever;
    //   115: astore 8
    //   117: aload_0
    //   118: getfield 94	com/bumptech/glide/load/resource/bitmap/VideoDecoder:initializer	Lcom/bumptech/glide/load/resource/bitmap/VideoDecoder$MediaMetadataRetrieverInitializer;
    //   121: aload 8
    //   123: aload_1
    //   124: invokeinterface 217 3 0
    //   129: aload 8
    //   131: lload 5
    //   133: aload 7
    //   135: invokevirtual 221	java/lang/Integer:intValue	()I
    //   138: iload_2
    //   139: iload_3
    //   140: aload 4
    //   142: invokestatic 223	com/bumptech/glide/load/resource/bitmap/VideoDecoder:decodeFrame	(Landroid/media/MediaMetadataRetriever;JIIILcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;)Landroid/graphics/Bitmap;
    //   145: astore_1
    //   146: aload 8
    //   148: invokevirtual 226	android/media/MediaMetadataRetriever:release	()V
    //   151: aload_1
    //   152: aload_0
    //   153: getfield 92	com/bumptech/glide/load/resource/bitmap/VideoDecoder:bitmapPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;
    //   156: invokestatic 232	com/bumptech/glide/load/resource/bitmap/BitmapResource:obtain	(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)Lcom/bumptech/glide/load/resource/bitmap/BitmapResource;
    //   159: areturn
    //   160: astore_1
    //   161: goto +13 -> 174
    //   164: astore_1
    //   165: new 174	java/io/IOException
    //   168: dup
    //   169: aload_1
    //   170: invokespecial 235	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   173: athrow
    //   174: aload 8
    //   176: invokevirtual 226	android/media/MediaMetadataRetriever:release	()V
    //   179: aload_1
    //   180: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	181	0	this	VideoDecoder
    //   0	181	1	paramT	T
    //   0	181	2	paramInt1	int
    //   0	181	3	paramInt2	int
    //   0	181	4	paramOptions	Options
    //   14	118	5	l	long
    //   68	66	7	localObject1	Object
    //   64	111	8	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   117	146	160	finally
    //   165	174	160	finally
    //   117	146	164	java/lang/RuntimeException
  }
  
  public boolean handles(@NonNull T paramT, @NonNull Options paramOptions)
  {
    return true;
  }
  
  static final class AssetFileDescriptorInitializer
    implements VideoDecoder.MediaMetadataRetrieverInitializer<AssetFileDescriptor>
  {
    public final void initialize(MediaMetadataRetriever paramMediaMetadataRetriever, AssetFileDescriptor paramAssetFileDescriptor)
    {
      paramMediaMetadataRetriever.setDataSource(paramAssetFileDescriptor.getFileDescriptor(), paramAssetFileDescriptor.getStartOffset(), paramAssetFileDescriptor.getLength());
    }
  }
  
  @VisibleForTesting
  static class MediaMetadataRetrieverFactory
  {
    public MediaMetadataRetriever build()
    {
      return new MediaMetadataRetriever();
    }
  }
  
  @VisibleForTesting
  static abstract interface MediaMetadataRetrieverInitializer<T>
  {
    public abstract void initialize(MediaMetadataRetriever paramMediaMetadataRetriever, T paramT);
  }
  
  static final class ParcelFileDescriptorInitializer
    implements VideoDecoder.MediaMetadataRetrieverInitializer<ParcelFileDescriptor>
  {
    public final void initialize(MediaMetadataRetriever paramMediaMetadataRetriever, ParcelFileDescriptor paramParcelFileDescriptor)
    {
      paramMediaMetadataRetriever.setDataSource(paramParcelFileDescriptor.getFileDescriptor());
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/VideoDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */