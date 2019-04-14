package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public final class Downsampler
{
  public static final Option<Boolean> ALLOW_HARDWARE_CONFIG;
  public static final Option<DecodeFormat> DECODE_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);
  @Deprecated
  public static final Option<DownsampleStrategy> DOWNSAMPLE_STRATEGY = DownsampleStrategy.OPTION;
  private static final DecodeCallbacks EMPTY_CALLBACKS;
  public static final Option<Boolean> FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.FALSE);
  private static final String ICO_MIME_TYPE = "image/x-ico";
  private static final int MARK_POSITION = 10485760;
  private static final Set<String> NO_DOWNSAMPLE_PRE_N_MIME_TYPES;
  private static final Queue<BitmapFactory.Options> OPTIONS_QUEUE = Util.createQueue(0);
  static final String TAG = "Downsampler";
  private static final Set<ImageHeaderParser.ImageType> TYPES_THAT_USE_POOL_PRE_KITKAT;
  private static final String WBMP_MIME_TYPE = "image/vnd.wap.wbmp";
  private final BitmapPool bitmapPool;
  private final ArrayPool byteArrayPool;
  private final DisplayMetrics displayMetrics;
  private final HardwareConfigState hardwareConfigState = HardwareConfigState.getInstance();
  private final List<ImageHeaderParser> parsers;
  
  static
  {
    ALLOW_HARDWARE_CONFIG = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", Boolean.FALSE);
    NO_DOWNSAMPLE_PRE_N_MIME_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "image/vnd.wap.wbmp", "image/x-ico" })));
    EMPTY_CALLBACKS = new DecodeCallbacks()
    {
      public void onDecodeComplete(BitmapPool paramAnonymousBitmapPool, Bitmap paramAnonymousBitmap) {}
      
      public void onObtainBounds() {}
    };
    TYPES_THAT_USE_POOL_PRE_KITKAT = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
  }
  
  public Downsampler(List<ImageHeaderParser> paramList, DisplayMetrics paramDisplayMetrics, BitmapPool paramBitmapPool, ArrayPool paramArrayPool)
  {
    this.parsers = paramList;
    this.displayMetrics = ((DisplayMetrics)Preconditions.checkNotNull(paramDisplayMetrics));
    this.bitmapPool = ((BitmapPool)Preconditions.checkNotNull(paramBitmapPool));
    this.byteArrayPool = ((ArrayPool)Preconditions.checkNotNull(paramArrayPool));
  }
  
  private static int adjustTargetDensityForError(double paramDouble)
  {
    int i = getDensityMultiplier(paramDouble);
    double d = i;
    Double.isNaN(d);
    int j = round(d * paramDouble);
    d = j / i;
    Double.isNaN(d);
    paramDouble /= d;
    d = j;
    Double.isNaN(d);
    return round(paramDouble * d);
  }
  
  private void calculateConfig(InputStream paramInputStream, DecodeFormat paramDecodeFormat, boolean paramBoolean1, boolean paramBoolean2, BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    if (this.hardwareConfigState.setHardwareConfigIfAllowed(paramInt1, paramInt2, paramOptions, paramDecodeFormat, paramBoolean1, paramBoolean2)) {
      return;
    }
    if ((paramDecodeFormat != DecodeFormat.PREFER_ARGB_8888) && (Build.VERSION.SDK_INT != 16)) {}
    try
    {
      paramBoolean1 = ImageHeaderParserUtils.getType(this.parsers, paramInputStream, this.byteArrayPool).hasAlpha();
    }
    catch (IOException paramInputStream)
    {
      for (;;) {}
    }
    if (Log.isLoggable("Downsampler", 3)) {
      new StringBuilder("Cannot determine whether the image has alpha or not from header, format ").append(paramDecodeFormat);
    }
    paramBoolean1 = false;
    if (paramBoolean1) {
      paramInputStream = Bitmap.Config.ARGB_8888;
    } else {
      paramInputStream = Bitmap.Config.RGB_565;
    }
    paramOptions.inPreferredConfig = paramInputStream;
    if (paramOptions.inPreferredConfig == Bitmap.Config.RGB_565) {
      paramOptions.inDither = true;
    }
    return;
    paramOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
  }
  
  private static void calculateScaling(ImageHeaderParser.ImageType paramImageType, InputStream paramInputStream, DecodeCallbacks paramDecodeCallbacks, BitmapPool paramBitmapPool, DownsampleStrategy paramDownsampleStrategy, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, BitmapFactory.Options paramOptions)
    throws IOException
  {
    if ((paramInt2 > 0) && (paramInt3 > 0))
    {
      float f1;
      if ((paramInt1 != 90) && (paramInt1 != 270)) {
        f1 = paramDownsampleStrategy.getScaleFactor(paramInt2, paramInt3, paramInt4, paramInt5);
      } else {
        f1 = paramDownsampleStrategy.getScaleFactor(paramInt3, paramInt2, paramInt4, paramInt5);
      }
      if (f1 > 0.0F)
      {
        DownsampleStrategy.SampleSizeRounding localSampleSizeRounding = paramDownsampleStrategy.getSampleSizeRounding(paramInt2, paramInt3, paramInt4, paramInt5);
        if (localSampleSizeRounding != null)
        {
          float f2 = paramInt2;
          int i = round(f1 * f2);
          float f3 = paramInt3;
          paramInt1 = round(f1 * f3);
          i = paramInt2 / i;
          paramInt1 = paramInt3 / paramInt1;
          if (localSampleSizeRounding == DownsampleStrategy.SampleSizeRounding.MEMORY) {
            paramInt1 = Math.max(i, paramInt1);
          } else {
            paramInt1 = Math.min(i, paramInt1);
          }
          int j;
          if ((Build.VERSION.SDK_INT <= 23) && (NO_DOWNSAMPLE_PRE_N_MIME_TYPES.contains(paramOptions.outMimeType)))
          {
            j = 1;
          }
          else
          {
            j = Math.max(1, Integer.highestOneBit(paramInt1));
            if ((localSampleSizeRounding == DownsampleStrategy.SampleSizeRounding.MEMORY) && (j < 1.0F / f1)) {
              j <<= 1;
            }
          }
          paramOptions.inSampleSize = j;
          float f4;
          if (paramImageType == ImageHeaderParser.ImageType.JPEG)
          {
            f4 = Math.min(j, 8);
            int m = (int)Math.ceil(f2 / f4);
            int k = (int)Math.ceil(f3 / f4);
            int n = j / 8;
            paramInt1 = k;
            i = m;
            if (n > 0)
            {
              i = m / n;
              paramInt1 = k / n;
            }
          }
          else
          {
            if ((paramImageType != ImageHeaderParser.ImageType.PNG) && (paramImageType != ImageHeaderParser.ImageType.PNG_A))
            {
              if ((paramImageType != ImageHeaderParser.ImageType.WEBP) && (paramImageType != ImageHeaderParser.ImageType.WEBP_A))
              {
                if ((paramInt2 % j == 0) && (paramInt3 % j == 0))
                {
                  i = paramInt2 / j;
                  paramInt1 = paramInt3 / j;
                  break label477;
                }
                paramImageType = getDimensions(paramInputStream, paramOptions, paramDecodeCallbacks, paramBitmapPool);
                i = paramImageType[0];
                paramInt1 = paramImageType[1];
                break label477;
              }
              if (Build.VERSION.SDK_INT >= 24)
              {
                f4 = j;
                i = Math.round(f2 / f4);
                paramInt1 = Math.round(f3 / f4);
                break label477;
              }
            }
            f4 = j;
            i = (int)Math.floor(f2 / f4);
            paramInt1 = (int)Math.floor(f3 / f4);
          }
          label477:
          double d = paramDownsampleStrategy.getScaleFactor(i, paramInt1, paramInt4, paramInt5);
          if (Build.VERSION.SDK_INT >= 19)
          {
            paramOptions.inTargetDensity = adjustTargetDensityForError(d);
            paramOptions.inDensity = getDensityMultiplier(d);
          }
          if (isScaling(paramOptions))
          {
            paramOptions.inScaled = true;
          }
          else
          {
            paramOptions.inTargetDensity = 0;
            paramOptions.inDensity = 0;
          }
          if (Log.isLoggable("Downsampler", 2))
          {
            paramImageType = new StringBuilder("Calculate scaling, source: [");
            paramImageType.append(paramInt2);
            paramImageType.append("x");
            paramImageType.append(paramInt3);
            paramImageType.append("], target: [");
            paramImageType.append(paramInt4);
            paramImageType.append("x");
            paramImageType.append(paramInt5);
            paramImageType.append("], power of two scaled: [");
            paramImageType.append(i);
            paramImageType.append("x");
            paramImageType.append(paramInt1);
            paramImageType.append("], exact scale factor: ");
            paramImageType.append(f1);
            paramImageType.append(", power of 2 sample size: ");
            paramImageType.append(j);
            paramImageType.append(", adjusted scale factor: ");
            paramImageType.append(d);
            paramImageType.append(", target density: ");
            paramImageType.append(paramOptions.inTargetDensity);
            paramImageType.append(", density: ");
            paramImageType.append(paramOptions.inDensity);
          }
          return;
        }
        throw new IllegalArgumentException("Cannot round with null rounding");
      }
      paramImageType = new StringBuilder("Cannot scale with factor: ");
      paramImageType.append(f1);
      paramImageType.append(" from: ");
      paramImageType.append(paramDownsampleStrategy);
      paramImageType.append(", source: [");
      paramImageType.append(paramInt2);
      paramImageType.append("x");
      paramImageType.append(paramInt3);
      paramImageType.append("], target: [");
      paramImageType.append(paramInt4);
      paramImageType.append("x");
      paramImageType.append(paramInt5);
      paramImageType.append("]");
      throw new IllegalArgumentException(paramImageType.toString());
    }
    if (Log.isLoggable("Downsampler", 3))
    {
      paramInputStream = new StringBuilder("Unable to determine dimensions for: ");
      paramInputStream.append(paramImageType);
      paramInputStream.append(" with target [");
      paramInputStream.append(paramInt4);
      paramInputStream.append("x");
      paramInputStream.append(paramInt5);
      paramInputStream.append("]");
    }
  }
  
  private Bitmap decodeFromWrappedStreams(InputStream paramInputStream, BitmapFactory.Options paramOptions, DownsampleStrategy paramDownsampleStrategy, DecodeFormat paramDecodeFormat, boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2, DecodeCallbacks paramDecodeCallbacks)
    throws IOException
  {
    long l = LogTime.getLogTime();
    Object localObject = getDimensions(paramInputStream, paramOptions, paramDecodeCallbacks, this.bitmapPool);
    int k = 0;
    int m = localObject[0];
    int n = localObject[1];
    localObject = paramOptions.outMimeType;
    if ((m != -1) && (n != -1)) {
      break label60;
    }
    paramBoolean1 = false;
    label60:
    int i2 = ImageHeaderParserUtils.getOrientation(this.parsers, paramInputStream, this.byteArrayPool);
    int i1 = TransformationUtils.getExifOrientationDegrees(i2);
    boolean bool = TransformationUtils.isExifOrientationRequired(i2);
    int i;
    if (paramInt1 == Integer.MIN_VALUE) {
      i = m;
    } else {
      i = paramInt1;
    }
    int j = paramInt2;
    if (j == Integer.MIN_VALUE) {
      j = n;
    }
    ImageHeaderParser.ImageType localImageType = ImageHeaderParserUtils.getType(this.parsers, paramInputStream, this.byteArrayPool);
    calculateScaling(localImageType, paramInputStream, paramDecodeCallbacks, this.bitmapPool, paramDownsampleStrategy, i1, m, n, i, j, paramOptions);
    calculateConfig(paramInputStream, paramDecodeFormat, paramBoolean1, bool, paramOptions, i, j);
    if (Build.VERSION.SDK_INT >= 19) {
      k = 1;
    }
    if ((paramOptions.inSampleSize != 1) && (k == 0)) {
      break label523;
    }
    paramDownsampleStrategy = this;
    if (paramDownsampleStrategy.shouldUsePool(localImageType))
    {
      if ((m < 0) || (n < 0) || (!paramBoolean2) || (k == 0))
      {
        float f1;
        if (isScaling(paramOptions)) {
          f1 = paramOptions.inTargetDensity / paramOptions.inDensity;
        } else {
          f1 = 1.0F;
        }
        int i3 = paramOptions.inSampleSize;
        float f2 = m;
        float f3 = i3;
        j = (int)Math.ceil(f2 / f3);
        i = (int)Math.ceil(n / f3);
        k = Math.round(j * f1);
        i1 = Math.round(i * f1);
        i = k;
        j = i1;
        if (Log.isLoggable("Downsampler", 2))
        {
          paramDecodeFormat = new StringBuilder("Calculated target [");
          paramDecodeFormat.append(k);
          paramDecodeFormat.append("x");
          paramDecodeFormat.append(i1);
          paramDecodeFormat.append("] for source [");
          paramDecodeFormat.append(m);
          paramDecodeFormat.append("x");
          paramDecodeFormat.append(n);
          paramDecodeFormat.append("], sampleSize: ");
          paramDecodeFormat.append(i3);
          paramDecodeFormat.append(", targetDensity: ");
          paramDecodeFormat.append(paramOptions.inTargetDensity);
          paramDecodeFormat.append(", density: ");
          paramDecodeFormat.append(paramOptions.inDensity);
          paramDecodeFormat.append(", density multiplier: ");
          paramDecodeFormat.append(f1);
          j = i1;
          i = k;
        }
      }
      if ((i > 0) && (j > 0)) {
        setInBitmap(paramOptions, paramDownsampleStrategy.bitmapPool, i, j);
      }
    }
    label523:
    paramDownsampleStrategy = this;
    paramDecodeFormat = decodeStream(paramInputStream, paramOptions, paramDecodeCallbacks, paramDownsampleStrategy.bitmapPool);
    paramDecodeCallbacks.onDecodeComplete(paramDownsampleStrategy.bitmapPool, paramDecodeFormat);
    if (Log.isLoggable("Downsampler", 2)) {
      logDecode(m, n, (String)localObject, paramOptions, paramDecodeFormat, paramInt1, paramInt2, l);
    }
    paramInputStream = null;
    if (paramDecodeFormat != null)
    {
      paramDecodeFormat.setDensity(paramDownsampleStrategy.displayMetrics.densityDpi);
      paramOptions = TransformationUtils.rotateImageExif(paramDownsampleStrategy.bitmapPool, paramDecodeFormat, i2);
      paramInputStream = paramOptions;
      if (!paramDecodeFormat.equals(paramOptions))
      {
        paramDownsampleStrategy.bitmapPool.put(paramDecodeFormat);
        paramInputStream = paramOptions;
      }
    }
    return paramInputStream;
  }
  
  /* Error */
  private static Bitmap decodeStream(InputStream paramInputStream, BitmapFactory.Options paramOptions, DecodeCallbacks paramDecodeCallbacks, BitmapPool paramBitmapPool)
    throws IOException
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 462	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   4: ifeq +12 -> 16
    //   7: aload_0
    //   8: ldc 27
    //   10: invokevirtual 467	java/io/InputStream:mark	(I)V
    //   13: goto +9 -> 22
    //   16: aload_2
    //   17: invokeinterface 470 1 0
    //   22: aload_1
    //   23: getfield 473	android/graphics/BitmapFactory$Options:outWidth	I
    //   26: istore 4
    //   28: aload_1
    //   29: getfield 476	android/graphics/BitmapFactory$Options:outHeight	I
    //   32: istore 5
    //   34: aload_1
    //   35: getfield 281	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   38: astore 6
    //   40: invokestatic 480	com/bumptech/glide/load/resource/bitmap/TransformationUtils:getBitmapDrawableLock	()Ljava/util/concurrent/locks/Lock;
    //   43: invokeinterface 485 1 0
    //   48: aload_0
    //   49: aconst_null
    //   50: aload_1
    //   51: invokestatic 490	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   54: astore 7
    //   56: invokestatic 480	com/bumptech/glide/load/resource/bitmap/TransformationUtils:getBitmapDrawableLock	()Ljava/util/concurrent/locks/Lock;
    //   59: invokeinterface 493 1 0
    //   64: aload_1
    //   65: getfield 462	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   68: ifeq +7 -> 75
    //   71: aload_0
    //   72: invokevirtual 496	java/io/InputStream:reset	()V
    //   75: aload 7
    //   77: areturn
    //   78: astore_0
    //   79: goto +80 -> 159
    //   82: astore 7
    //   84: aload 7
    //   86: iload 4
    //   88: iload 5
    //   90: aload 6
    //   92: aload_1
    //   93: invokestatic 500	com/bumptech/glide/load/resource/bitmap/Downsampler:newIoExceptionForInBitmapAssertion	(Ljava/lang/IllegalArgumentException;IILjava/lang/String;Landroid/graphics/BitmapFactory$Options;)Ljava/io/IOException;
    //   96: astore 6
    //   98: ldc 36
    //   100: iconst_3
    //   101: invokestatic 224	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   104: pop
    //   105: aload_1
    //   106: getfield 504	android/graphics/BitmapFactory$Options:inBitmap	Landroid/graphics/Bitmap;
    //   109: astore 7
    //   111: aload 7
    //   113: ifnull +43 -> 156
    //   116: aload_0
    //   117: invokevirtual 496	java/io/InputStream:reset	()V
    //   120: aload_3
    //   121: aload_1
    //   122: getfield 504	android/graphics/BitmapFactory$Options:inBitmap	Landroid/graphics/Bitmap;
    //   125: invokeinterface 459 2 0
    //   130: aload_1
    //   131: aconst_null
    //   132: putfield 504	android/graphics/BitmapFactory$Options:inBitmap	Landroid/graphics/Bitmap;
    //   135: aload_0
    //   136: aload_1
    //   137: aload_2
    //   138: aload_3
    //   139: invokestatic 431	com/bumptech/glide/load/resource/bitmap/Downsampler:decodeStream	(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Lcom/bumptech/glide/load/resource/bitmap/Downsampler$DecodeCallbacks;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)Landroid/graphics/Bitmap;
    //   142: astore_0
    //   143: invokestatic 480	com/bumptech/glide/load/resource/bitmap/TransformationUtils:getBitmapDrawableLock	()Ljava/util/concurrent/locks/Lock;
    //   146: invokeinterface 493 1 0
    //   151: aload_0
    //   152: areturn
    //   153: aload 6
    //   155: athrow
    //   156: aload 6
    //   158: athrow
    //   159: invokestatic 480	com/bumptech/glide/load/resource/bitmap/TransformationUtils:getBitmapDrawableLock	()Ljava/util/concurrent/locks/Lock;
    //   162: invokeinterface 493 1 0
    //   167: aload_0
    //   168: athrow
    //   169: astore_0
    //   170: goto -17 -> 153
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	paramInputStream	InputStream
    //   0	173	1	paramOptions	BitmapFactory.Options
    //   0	173	2	paramDecodeCallbacks	DecodeCallbacks
    //   0	173	3	paramBitmapPool	BitmapPool
    //   26	61	4	i	int
    //   32	57	5	j	int
    //   38	119	6	localObject	Object
    //   54	22	7	localBitmap1	Bitmap
    //   82	3	7	localIllegalArgumentException	IllegalArgumentException
    //   109	3	7	localBitmap2	Bitmap
    // Exception table:
    //   from	to	target	type
    //   48	56	78	finally
    //   84	111	78	finally
    //   116	143	78	finally
    //   153	156	78	finally
    //   156	159	78	finally
    //   48	56	82	java/lang/IllegalArgumentException
    //   116	143	169	java/io/IOException
  }
  
  @TargetApi(19)
  @Nullable
  private static String getBitmapString(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return null;
    }
    Object localObject;
    if (Build.VERSION.SDK_INT >= 19)
    {
      localObject = new StringBuilder(" (");
      ((StringBuilder)localObject).append(paramBitmap.getAllocationByteCount());
      ((StringBuilder)localObject).append(")");
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "";
    }
    StringBuilder localStringBuilder = new StringBuilder("[");
    localStringBuilder.append(paramBitmap.getWidth());
    localStringBuilder.append("x");
    localStringBuilder.append(paramBitmap.getHeight());
    localStringBuilder.append("] ");
    localStringBuilder.append(paramBitmap.getConfig());
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
  
  /* Error */
  private static BitmapFactory.Options getDefaultOptions()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 145	com/bumptech/glide/load/resource/bitmap/Downsampler:OPTIONS_QUEUE	Ljava/util/Queue;
    //   6: astore_0
    //   7: aload_0
    //   8: monitorenter
    //   9: getstatic 145	com/bumptech/glide/load/resource/bitmap/Downsampler:OPTIONS_QUEUE	Ljava/util/Queue;
    //   12: invokeinterface 543 1 0
    //   17: checkcast 246	android/graphics/BitmapFactory$Options
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: astore_0
    //   25: aload_1
    //   26: ifnonnull +15 -> 41
    //   29: new 246	android/graphics/BitmapFactory$Options
    //   32: dup
    //   33: invokespecial 544	android/graphics/BitmapFactory$Options:<init>	()V
    //   36: astore_0
    //   37: aload_0
    //   38: invokestatic 548	com/bumptech/glide/load/resource/bitmap/Downsampler:resetOptions	(Landroid/graphics/BitmapFactory$Options;)V
    //   41: ldc 2
    //   43: monitorexit
    //   44: aload_0
    //   45: areturn
    //   46: astore_1
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: athrow
    //   51: astore_0
    //   52: ldc 2
    //   54: monitorexit
    //   55: aload_0
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   51	5	0	localObject2	Object
    //   20	6	1	localOptions	BitmapFactory.Options
    //   46	4	1	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   9	23	46	finally
    //   47	49	46	finally
    //   3	9	51	finally
    //   29	41	51	finally
    //   49	51	51	finally
  }
  
  private static int getDensityMultiplier(double paramDouble)
  {
    if (paramDouble > 1.0D) {
      paramDouble = 1.0D / paramDouble;
    }
    return (int)Math.round(paramDouble * 2.147483647E9D);
  }
  
  private static int[] getDimensions(InputStream paramInputStream, BitmapFactory.Options paramOptions, DecodeCallbacks paramDecodeCallbacks, BitmapPool paramBitmapPool)
    throws IOException
  {
    paramOptions.inJustDecodeBounds = true;
    decodeStream(paramInputStream, paramOptions, paramDecodeCallbacks, paramBitmapPool);
    paramOptions.inJustDecodeBounds = false;
    return new int[] { paramOptions.outWidth, paramOptions.outHeight };
  }
  
  private static String getInBitmapString(BitmapFactory.Options paramOptions)
  {
    return getBitmapString(paramOptions.inBitmap);
  }
  
  private static boolean isScaling(BitmapFactory.Options paramOptions)
  {
    return (paramOptions.inTargetDensity > 0) && (paramOptions.inDensity > 0) && (paramOptions.inTargetDensity != paramOptions.inDensity);
  }
  
  private static void logDecode(int paramInt1, int paramInt2, String paramString, BitmapFactory.Options paramOptions, Bitmap paramBitmap, int paramInt3, int paramInt4, long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder("Decoded ");
    localStringBuilder.append(getBitmapString(paramBitmap));
    localStringBuilder.append(" from [");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append("x");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append("] ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" with inBitmap ");
    localStringBuilder.append(getInBitmapString(paramOptions));
    localStringBuilder.append(" for [");
    localStringBuilder.append(paramInt3);
    localStringBuilder.append("x");
    localStringBuilder.append(paramInt4);
    localStringBuilder.append("], sample size: ");
    localStringBuilder.append(paramOptions.inSampleSize);
    localStringBuilder.append(", density: ");
    localStringBuilder.append(paramOptions.inDensity);
    localStringBuilder.append(", target density: ");
    localStringBuilder.append(paramOptions.inTargetDensity);
    localStringBuilder.append(", thread: ");
    localStringBuilder.append(Thread.currentThread().getName());
    localStringBuilder.append(", duration: ");
    localStringBuilder.append(LogTime.getElapsedMillis(paramLong));
  }
  
  private static IOException newIoExceptionForInBitmapAssertion(IllegalArgumentException paramIllegalArgumentException, int paramInt1, int paramInt2, String paramString, BitmapFactory.Options paramOptions)
  {
    StringBuilder localStringBuilder = new StringBuilder("Exception decoding bitmap, outWidth: ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(", outHeight: ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(", outMimeType: ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(", inBitmap: ");
    localStringBuilder.append(getInBitmapString(paramOptions));
    return new IOException(localStringBuilder.toString(), paramIllegalArgumentException);
  }
  
  private static void releaseOptions(BitmapFactory.Options paramOptions)
  {
    resetOptions(paramOptions);
    synchronized (OPTIONS_QUEUE)
    {
      OPTIONS_QUEUE.offer(paramOptions);
      return;
    }
  }
  
  private static void resetOptions(BitmapFactory.Options paramOptions)
  {
    paramOptions.inTempStorage = null;
    paramOptions.inDither = false;
    paramOptions.inScaled = false;
    paramOptions.inSampleSize = 1;
    paramOptions.inPreferredConfig = null;
    paramOptions.inJustDecodeBounds = false;
    paramOptions.inDensity = 0;
    paramOptions.inTargetDensity = 0;
    paramOptions.outWidth = 0;
    paramOptions.outHeight = 0;
    paramOptions.outMimeType = null;
    paramOptions.inBitmap = null;
    paramOptions.inMutable = true;
  }
  
  private static int round(double paramDouble)
  {
    return (int)(paramDouble + 0.5D);
  }
  
  @TargetApi(26)
  private static void setInBitmap(BitmapFactory.Options paramOptions, BitmapPool paramBitmapPool, int paramInt1, int paramInt2)
  {
    Bitmap.Config localConfig1;
    if (Build.VERSION.SDK_INT >= 26)
    {
      if (paramOptions.inPreferredConfig == Bitmap.Config.HARDWARE) {
        return;
      }
      localConfig1 = paramOptions.outConfig;
    }
    else
    {
      localConfig1 = null;
    }
    Bitmap.Config localConfig2 = localConfig1;
    if (localConfig1 == null) {
      localConfig2 = paramOptions.inPreferredConfig;
    }
    paramOptions.inBitmap = paramBitmapPool.getDirty(paramInt1, paramInt2, localConfig2);
  }
  
  private boolean shouldUsePool(ImageHeaderParser.ImageType paramImageType)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return true;
    }
    return TYPES_THAT_USE_POOL_PRE_KITKAT.contains(paramImageType);
  }
  
  public final Resource<Bitmap> decode(InputStream paramInputStream, int paramInt1, int paramInt2, Options paramOptions)
    throws IOException
  {
    return decode(paramInputStream, paramInt1, paramInt2, paramOptions, EMPTY_CALLBACKS);
  }
  
  public final Resource<Bitmap> decode(InputStream paramInputStream, int paramInt1, int paramInt2, Options paramOptions, DecodeCallbacks paramDecodeCallbacks)
    throws IOException
  {
    Preconditions.checkArgument(paramInputStream.markSupported(), "You must provide an InputStream that supports mark()");
    byte[] arrayOfByte = (byte[])this.byteArrayPool.get(65536, byte[].class);
    BitmapFactory.Options localOptions = getDefaultOptions();
    localOptions.inTempStorage = arrayOfByte;
    DecodeFormat localDecodeFormat = (DecodeFormat)paramOptions.get(DECODE_FORMAT);
    DownsampleStrategy localDownsampleStrategy = (DownsampleStrategy)paramOptions.get(DownsampleStrategy.OPTION);
    boolean bool2 = ((Boolean)paramOptions.get(FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS)).booleanValue();
    boolean bool1;
    if ((paramOptions.get(ALLOW_HARDWARE_CONFIG) != null) && (((Boolean)paramOptions.get(ALLOW_HARDWARE_CONFIG)).booleanValue())) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    try
    {
      paramInputStream = BitmapResource.obtain(decodeFromWrappedStreams(paramInputStream, localOptions, localDownsampleStrategy, localDecodeFormat, bool1, paramInt1, paramInt2, bool2, paramDecodeCallbacks), this.bitmapPool);
      return paramInputStream;
    }
    finally
    {
      releaseOptions(localOptions);
      this.byteArrayPool.put(arrayOfByte);
    }
  }
  
  public final boolean handles(InputStream paramInputStream)
  {
    return true;
  }
  
  public final boolean handles(ByteBuffer paramByteBuffer)
  {
    return true;
  }
  
  public static abstract interface DecodeCallbacks
  {
    public abstract void onDecodeComplete(BitmapPool paramBitmapPool, Bitmap paramBitmap)
      throws IOException;
    
    public abstract void onObtainBounds();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/Downsampler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */