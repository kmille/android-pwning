package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.InputStream;

public class StreamEncoder
  implements Encoder<InputStream>
{
  private static final String TAG = "StreamEncoder";
  private final ArrayPool byteArrayPool;
  
  public StreamEncoder(ArrayPool paramArrayPool)
  {
    this.byteArrayPool = paramArrayPool;
  }
  
  /* Error */
  public boolean encode(@android.support.annotation.NonNull InputStream paramInputStream, @android.support.annotation.NonNull java.io.File paramFile, @android.support.annotation.NonNull com.bumptech.glide.load.Options paramOptions)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	com/bumptech/glide/load/model/StreamEncoder:byteArrayPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;
    //   4: ldc 27
    //   6: ldc 29
    //   8: invokeinterface 35 3 0
    //   13: checkcast 29	[B
    //   16: astore 9
    //   18: iconst_0
    //   19: istore 7
    //   21: iconst_0
    //   22: istore 6
    //   24: aconst_null
    //   25: astore 8
    //   27: aconst_null
    //   28: astore_3
    //   29: new 37	java/io/FileOutputStream
    //   32: dup
    //   33: aload_2
    //   34: invokespecial 40	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   37: astore_2
    //   38: aload_1
    //   39: aload 9
    //   41: invokevirtual 46	java/io/InputStream:read	([B)I
    //   44: istore 4
    //   46: iload 4
    //   48: iconst_m1
    //   49: if_icmpeq +15 -> 64
    //   52: aload_2
    //   53: aload 9
    //   55: iconst_0
    //   56: iload 4
    //   58: invokevirtual 52	java/io/OutputStream:write	([BII)V
    //   61: goto -23 -> 38
    //   64: aload_2
    //   65: invokevirtual 55	java/io/OutputStream:close	()V
    //   68: iconst_1
    //   69: istore 5
    //   71: iconst_1
    //   72: istore 6
    //   74: aload_2
    //   75: invokevirtual 55	java/io/OutputStream:close	()V
    //   78: iload 6
    //   80: istore 5
    //   82: goto +47 -> 129
    //   85: astore_1
    //   86: aload_2
    //   87: astore_3
    //   88: goto +55 -> 143
    //   91: aload_2
    //   92: astore_1
    //   93: goto +7 -> 100
    //   96: astore_1
    //   97: goto +46 -> 143
    //   100: aload_1
    //   101: astore_3
    //   102: ldc 11
    //   104: iconst_3
    //   105: invokestatic 61	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   108: pop
    //   109: iload 6
    //   111: istore 5
    //   113: aload_1
    //   114: ifnull +15 -> 129
    //   117: iload 7
    //   119: istore 5
    //   121: aload_1
    //   122: invokevirtual 55	java/io/OutputStream:close	()V
    //   125: iload 6
    //   127: istore 5
    //   129: aload_0
    //   130: getfield 20	com/bumptech/glide/load/model/StreamEncoder:byteArrayPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;
    //   133: aload 9
    //   135: invokeinterface 65 2 0
    //   140: iload 5
    //   142: ireturn
    //   143: aload_3
    //   144: ifnull +7 -> 151
    //   147: aload_3
    //   148: invokevirtual 55	java/io/OutputStream:close	()V
    //   151: aload_0
    //   152: getfield 20	com/bumptech/glide/load/model/StreamEncoder:byteArrayPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;
    //   155: aload 9
    //   157: invokeinterface 65 2 0
    //   162: aload_1
    //   163: athrow
    //   164: astore_1
    //   165: aload 8
    //   167: astore_1
    //   168: goto -68 -> 100
    //   171: astore_1
    //   172: goto -81 -> 91
    //   175: astore_1
    //   176: goto -47 -> 129
    //   179: astore_2
    //   180: goto -29 -> 151
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	183	0	this	StreamEncoder
    //   0	183	1	paramInputStream	InputStream
    //   0	183	2	paramFile	java.io.File
    //   0	183	3	paramOptions	com.bumptech.glide.load.Options
    //   44	13	4	i	int
    //   69	72	5	bool1	boolean
    //   22	104	6	bool2	boolean
    //   19	99	7	bool3	boolean
    //   25	141	8	localObject	Object
    //   16	140	9	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   38	46	85	finally
    //   52	61	85	finally
    //   64	68	85	finally
    //   29	38	96	finally
    //   102	109	96	finally
    //   29	38	164	java/io/IOException
    //   38	46	171	java/io/IOException
    //   52	61	171	java/io/IOException
    //   64	68	171	java/io/IOException
    //   74	78	175	java/io/IOException
    //   121	125	175	java/io/IOException
    //   147	151	179	java/io/IOException
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/StreamEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */