package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;

public class BitmapEncoder
  implements ResourceEncoder<Bitmap>
{
  public static final Option<Bitmap.CompressFormat> COMPRESSION_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
  public static final Option<Integer> COMPRESSION_QUALITY = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", Integer.valueOf(90));
  private static final String TAG = "BitmapEncoder";
  @Nullable
  private final ArrayPool arrayPool;
  
  @Deprecated
  public BitmapEncoder()
  {
    this.arrayPool = null;
  }
  
  public BitmapEncoder(@NonNull ArrayPool paramArrayPool)
  {
    this.arrayPool = paramArrayPool;
  }
  
  private Bitmap.CompressFormat getFormat(Bitmap paramBitmap, Options paramOptions)
  {
    paramOptions = (Bitmap.CompressFormat)paramOptions.get(COMPRESSION_FORMAT);
    if (paramOptions != null) {
      return paramOptions;
    }
    if (paramBitmap.hasAlpha()) {
      return Bitmap.CompressFormat.PNG;
    }
    return Bitmap.CompressFormat.JPEG;
  }
  
  /* Error */
  public boolean encode(@NonNull com.bumptech.glide.load.engine.Resource<Bitmap> paramResource, @NonNull java.io.File paramFile, @NonNull Options paramOptions)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 87 1 0
    //   6: checkcast 67	android/graphics/Bitmap
    //   9: astore 11
    //   11: aload_0
    //   12: aload 11
    //   14: aload_3
    //   15: invokespecial 89	com/bumptech/glide/load/resource/bitmap/BitmapEncoder:getFormat	(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/Options;)Landroid/graphics/Bitmap$CompressFormat;
    //   18: astore 12
    //   20: ldc 91
    //   22: aload 11
    //   24: invokevirtual 95	android/graphics/Bitmap:getWidth	()I
    //   27: invokestatic 29	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   30: aload 11
    //   32: invokevirtual 98	android/graphics/Bitmap:getHeight	()I
    //   35: invokestatic 29	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   38: aload 12
    //   40: invokestatic 104	com/bumptech/glide/util/pool/GlideTrace:beginSectionFormat	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   43: invokestatic 110	com/bumptech/glide/util/LogTime:getLogTime	()J
    //   46: lstore 5
    //   48: aload_3
    //   49: getstatic 37	com/bumptech/glide/load/resource/bitmap/BitmapEncoder:COMPRESSION_QUALITY	Lcom/bumptech/glide/load/Option;
    //   52: invokevirtual 63	com/bumptech/glide/load/Options:get	(Lcom/bumptech/glide/load/Option;)Ljava/lang/Object;
    //   55: checkcast 25	java/lang/Integer
    //   58: invokevirtual 113	java/lang/Integer:intValue	()I
    //   61: istore 4
    //   63: iconst_0
    //   64: istore 7
    //   66: iconst_0
    //   67: istore 8
    //   69: aconst_null
    //   70: astore 10
    //   72: aconst_null
    //   73: astore 9
    //   75: new 115	java/io/FileOutputStream
    //   78: dup
    //   79: aload_2
    //   80: invokespecial 118	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   83: astore_1
    //   84: aload_0
    //   85: getfield 51	com/bumptech/glide/load/resource/bitmap/BitmapEncoder:arrayPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;
    //   88: ifnull +21 -> 109
    //   91: new 120	com/bumptech/glide/load/data/BufferedOutputStream
    //   94: dup
    //   95: aload_1
    //   96: aload_0
    //   97: getfield 51	com/bumptech/glide/load/resource/bitmap/BitmapEncoder:arrayPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;
    //   100: invokespecial 123	com/bumptech/glide/load/data/BufferedOutputStream:<init>	(Ljava/io/OutputStream;Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;)V
    //   103: astore_2
    //   104: aload_2
    //   105: astore_1
    //   106: goto +3 -> 109
    //   109: aload_1
    //   110: astore 9
    //   112: aload_1
    //   113: astore 10
    //   115: aload 11
    //   117: aload 12
    //   119: iload 4
    //   121: aload_1
    //   122: invokevirtual 127	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   125: pop
    //   126: aload_1
    //   127: astore 9
    //   129: aload_1
    //   130: astore 10
    //   132: aload_1
    //   133: invokevirtual 132	java/io/OutputStream:close	()V
    //   136: iconst_1
    //   137: istore 7
    //   139: aload_1
    //   140: invokevirtual 132	java/io/OutputStream:close	()V
    //   143: goto +40 -> 183
    //   146: astore_2
    //   147: aload_1
    //   148: astore 9
    //   150: aload_2
    //   151: astore_1
    //   152: goto +133 -> 285
    //   155: goto +7 -> 162
    //   158: astore_1
    //   159: goto +126 -> 285
    //   162: aload_1
    //   163: astore 9
    //   165: ldc 16
    //   167: iconst_3
    //   168: invokestatic 138	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   171: pop
    //   172: aload_1
    //   173: ifnull +10 -> 183
    //   176: iload 8
    //   178: istore 7
    //   180: goto -41 -> 139
    //   183: ldc 16
    //   185: iconst_2
    //   186: invokestatic 138	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   189: ifeq +90 -> 279
    //   192: new 140	java/lang/StringBuilder
    //   195: dup
    //   196: ldc -114
    //   198: invokespecial 145	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   201: astore_1
    //   202: aload_1
    //   203: aload 12
    //   205: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   208: pop
    //   209: aload_1
    //   210: ldc -105
    //   212: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: aload_1
    //   217: aload 11
    //   219: invokestatic 160	com/bumptech/glide/util/Util:getBitmapByteSize	(Landroid/graphics/Bitmap;)I
    //   222: invokevirtual 163	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: aload_1
    //   227: ldc -91
    //   229: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: pop
    //   233: aload_1
    //   234: lload 5
    //   236: invokestatic 169	com/bumptech/glide/util/LogTime:getElapsedMillis	(J)D
    //   239: invokevirtual 172	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   242: pop
    //   243: aload_1
    //   244: ldc -82
    //   246: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: pop
    //   250: aload_1
    //   251: aload_3
    //   252: getstatic 44	com/bumptech/glide/load/resource/bitmap/BitmapEncoder:COMPRESSION_FORMAT	Lcom/bumptech/glide/load/Option;
    //   255: invokevirtual 63	com/bumptech/glide/load/Options:get	(Lcom/bumptech/glide/load/Option;)Ljava/lang/Object;
    //   258: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   261: pop
    //   262: aload_1
    //   263: ldc -80
    //   265: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: pop
    //   269: aload_1
    //   270: aload 11
    //   272: invokevirtual 71	android/graphics/Bitmap:hasAlpha	()Z
    //   275: invokevirtual 179	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   278: pop
    //   279: invokestatic 182	com/bumptech/glide/util/pool/GlideTrace:endSection	()V
    //   282: iload 7
    //   284: ireturn
    //   285: aload 9
    //   287: ifnull +8 -> 295
    //   290: aload 9
    //   292: invokevirtual 132	java/io/OutputStream:close	()V
    //   295: aload_1
    //   296: athrow
    //   297: astore_1
    //   298: invokestatic 182	com/bumptech/glide/util/pool/GlideTrace:endSection	()V
    //   301: aload_1
    //   302: athrow
    //   303: astore_1
    //   304: aload 10
    //   306: astore_1
    //   307: goto -145 -> 162
    //   310: astore_2
    //   311: goto -156 -> 155
    //   314: astore_1
    //   315: goto -132 -> 183
    //   318: astore_2
    //   319: goto -24 -> 295
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	322	0	this	BitmapEncoder
    //   0	322	1	paramResource	com.bumptech.glide.load.engine.Resource<Bitmap>
    //   0	322	2	paramFile	java.io.File
    //   0	322	3	paramOptions	Options
    //   61	59	4	i	int
    //   46	189	5	l	long
    //   64	219	7	bool1	boolean
    //   67	110	8	bool2	boolean
    //   73	218	9	localResource1	com.bumptech.glide.load.engine.Resource<Bitmap>
    //   70	235	10	localResource2	com.bumptech.glide.load.engine.Resource<Bitmap>
    //   9	262	11	localBitmap	Bitmap
    //   18	186	12	localCompressFormat	Bitmap.CompressFormat
    // Exception table:
    //   from	to	target	type
    //   84	104	146	finally
    //   75	84	158	finally
    //   115	126	158	finally
    //   132	136	158	finally
    //   165	172	158	finally
    //   43	63	297	finally
    //   139	143	297	finally
    //   183	279	297	finally
    //   290	295	297	finally
    //   295	297	297	finally
    //   75	84	303	java/io/IOException
    //   115	126	303	java/io/IOException
    //   132	136	303	java/io/IOException
    //   84	104	310	java/io/IOException
    //   139	143	314	java/io/IOException
    //   290	295	318	java/io/IOException
  }
  
  @NonNull
  public EncodeStrategy getEncodeStrategy(@NonNull Options paramOptions)
  {
    return EncodeStrategy.TRANSFORMED;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/BitmapEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */