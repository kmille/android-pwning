package android.support.v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

@RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class TypefaceCompatUtil
{
  private static final String CACHE_FILE_PREFIX = ".font";
  private static final String TAG = "TypefaceCompatUtil";
  
  public static void closeQuietly(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  @Nullable
  @RequiresApi(19)
  public static ByteBuffer copyToDirectBuffer(Context paramContext, Resources paramResources, int paramInt)
  {
    paramContext = getTempFile(paramContext);
    if (paramContext == null) {
      return null;
    }
    try
    {
      boolean bool = copyToFile(paramContext, paramResources, paramInt);
      if (!bool) {
        return null;
      }
      paramResources = mmap(paramContext);
      return paramResources;
    }
    finally
    {
      paramContext.delete();
    }
  }
  
  /* Error */
  public static boolean copyToFile(File paramFile, Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: iload_2
    //   2: invokevirtual 59	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   5: astore_1
    //   6: aload_0
    //   7: aload_1
    //   8: invokestatic 62	android/support/v4/graphics/TypefaceCompatUtil:copyToFile	(Ljava/io/File;Ljava/io/InputStream;)Z
    //   11: istore_3
    //   12: aload_1
    //   13: invokestatic 64	android/support/v4/graphics/TypefaceCompatUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   16: iload_3
    //   17: ireturn
    //   18: astore_0
    //   19: goto +6 -> 25
    //   22: astore_0
    //   23: aconst_null
    //   24: astore_1
    //   25: aload_1
    //   26: invokestatic 64	android/support/v4/graphics/TypefaceCompatUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   29: aload_0
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	paramFile	File
    //   0	31	1	paramResources	Resources
    //   0	31	2	paramInt	int
    //   11	6	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   6	12	18	finally
    //   0	6	22	finally
  }
  
  /* Error */
  public static boolean copyToFile(File paramFile, java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: invokestatic 70	android/os/StrictMode:allowThreadDiskWrites	()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore 5
    //   5: aconst_null
    //   6: astore 4
    //   8: aconst_null
    //   9: astore_3
    //   10: new 72	java/io/FileOutputStream
    //   13: dup
    //   14: aload_0
    //   15: iconst_0
    //   16: invokespecial 75	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   19: astore_0
    //   20: sipush 1024
    //   23: newarray <illegal type>
    //   25: astore_3
    //   26: aload_1
    //   27: aload_3
    //   28: invokevirtual 81	java/io/InputStream:read	([B)I
    //   31: istore_2
    //   32: iload_2
    //   33: iconst_m1
    //   34: if_icmpeq +13 -> 47
    //   37: aload_0
    //   38: aload_3
    //   39: iconst_0
    //   40: iload_2
    //   41: invokevirtual 85	java/io/FileOutputStream:write	([BII)V
    //   44: goto -18 -> 26
    //   47: aload_0
    //   48: invokestatic 64	android/support/v4/graphics/TypefaceCompatUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   51: aload 5
    //   53: invokestatic 89	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   56: iconst_1
    //   57: ireturn
    //   58: astore_1
    //   59: aload_0
    //   60: astore_3
    //   61: aload_1
    //   62: astore_0
    //   63: goto +64 -> 127
    //   66: astore_1
    //   67: goto +11 -> 78
    //   70: astore_0
    //   71: goto +56 -> 127
    //   74: astore_1
    //   75: aload 4
    //   77: astore_0
    //   78: aload_0
    //   79: astore_3
    //   80: new 91	java/lang/StringBuilder
    //   83: dup
    //   84: ldc 93
    //   86: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   89: astore 4
    //   91: aload_0
    //   92: astore_3
    //   93: aload 4
    //   95: aload_1
    //   96: invokevirtual 100	java/io/IOException:getMessage	()Ljava/lang/String;
    //   99: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload_0
    //   104: astore_3
    //   105: ldc 15
    //   107: aload 4
    //   109: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   112: invokestatic 113	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   115: pop
    //   116: aload_0
    //   117: invokestatic 64	android/support/v4/graphics/TypefaceCompatUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   120: aload 5
    //   122: invokestatic 89	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   125: iconst_0
    //   126: ireturn
    //   127: aload_3
    //   128: invokestatic 64	android/support/v4/graphics/TypefaceCompatUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   131: aload 5
    //   133: invokestatic 89	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   136: aload_0
    //   137: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	paramFile	File
    //   0	138	1	paramInputStream	java.io.InputStream
    //   31	10	2	i	int
    //   9	119	3	localObject	Object
    //   6	102	4	localStringBuilder	StringBuilder
    //   3	129	5	localThreadPolicy	android.os.StrictMode.ThreadPolicy
    // Exception table:
    //   from	to	target	type
    //   20	26	58	finally
    //   26	32	58	finally
    //   37	44	58	finally
    //   20	26	66	java/io/IOException
    //   26	32	66	java/io/IOException
    //   37	44	66	java/io/IOException
    //   10	20	70	finally
    //   80	91	70	finally
    //   93	103	70	finally
    //   105	116	70	finally
    //   10	20	74	java/io/IOException
  }
  
  @Nullable
  public static File getTempFile(Context paramContext)
  {
    Object localObject = new StringBuilder(".font");
    ((StringBuilder)localObject).append(Process.myPid());
    ((StringBuilder)localObject).append("-");
    ((StringBuilder)localObject).append(Process.myTid());
    ((StringBuilder)localObject).append("-");
    localObject = ((StringBuilder)localObject).toString();
    int i = 0;
    while (i < 100)
    {
      File localFile = paramContext.getCacheDir();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(i);
      localFile = new File(localFile, localStringBuilder.toString());
      try
      {
        boolean bool = localFile.createNewFile();
        if (bool) {
          return localFile;
        }
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
      i += 1;
    }
    return null;
  }
  
  /* Error */
  @Nullable
  @RequiresApi(19)
  public static ByteBuffer mmap(Context paramContext, android.os.CancellationSignal paramCancellationSignal, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 147	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore_0
    //   5: aload_0
    //   6: aload_2
    //   7: ldc -107
    //   9: aload_1
    //   10: invokevirtual 155	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   13: astore 5
    //   15: aload 5
    //   17: ifnonnull +15 -> 32
    //   20: aload 5
    //   22: ifnull +8 -> 30
    //   25: aload 5
    //   27: invokevirtual 158	android/os/ParcelFileDescriptor:close	()V
    //   30: aconst_null
    //   31: areturn
    //   32: new 160	java/io/FileInputStream
    //   35: dup
    //   36: aload 5
    //   38: invokevirtual 164	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   41: invokespecial 167	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   44: astore_2
    //   45: aload_2
    //   46: invokevirtual 171	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   49: astore_0
    //   50: aload_0
    //   51: invokevirtual 177	java/nio/channels/FileChannel:size	()J
    //   54: lstore_3
    //   55: aload_0
    //   56: getstatic 183	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   59: lconst_0
    //   60: lload_3
    //   61: invokevirtual 187	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   64: astore_0
    //   65: aload_2
    //   66: invokevirtual 188	java/io/FileInputStream:close	()V
    //   69: aload 5
    //   71: ifnull +8 -> 79
    //   74: aload 5
    //   76: invokevirtual 158	android/os/ParcelFileDescriptor:close	()V
    //   79: aload_0
    //   80: areturn
    //   81: astore_1
    //   82: aconst_null
    //   83: astore_0
    //   84: goto +7 -> 91
    //   87: astore_0
    //   88: aload_0
    //   89: athrow
    //   90: astore_1
    //   91: aload_0
    //   92: ifnull +10 -> 102
    //   95: aload_2
    //   96: invokevirtual 188	java/io/FileInputStream:close	()V
    //   99: goto +7 -> 106
    //   102: aload_2
    //   103: invokevirtual 188	java/io/FileInputStream:close	()V
    //   106: aload_1
    //   107: athrow
    //   108: astore_0
    //   109: aconst_null
    //   110: astore_2
    //   111: goto +11 -> 122
    //   114: astore_0
    //   115: aload_0
    //   116: athrow
    //   117: astore_1
    //   118: aload_0
    //   119: astore_2
    //   120: aload_1
    //   121: astore_0
    //   122: aload 5
    //   124: ifnull +20 -> 144
    //   127: aload_2
    //   128: ifnull +11 -> 139
    //   131: aload 5
    //   133: invokevirtual 158	android/os/ParcelFileDescriptor:close	()V
    //   136: goto +8 -> 144
    //   139: aload 5
    //   141: invokevirtual 158	android/os/ParcelFileDescriptor:close	()V
    //   144: aload_0
    //   145: athrow
    //   146: astore_0
    //   147: aconst_null
    //   148: areturn
    //   149: astore_0
    //   150: goto -44 -> 106
    //   153: astore_1
    //   154: goto -10 -> 144
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	157	0	paramContext	Context
    //   0	157	1	paramCancellationSignal	android.os.CancellationSignal
    //   0	157	2	paramUri	android.net.Uri
    //   54	7	3	l	long
    //   13	127	5	localParcelFileDescriptor	android.os.ParcelFileDescriptor
    // Exception table:
    //   from	to	target	type
    //   45	65	81	finally
    //   45	65	87	java/lang/Throwable
    //   88	90	90	finally
    //   32	45	108	finally
    //   65	69	108	finally
    //   95	99	108	finally
    //   102	106	108	finally
    //   106	108	108	finally
    //   32	45	114	java/lang/Throwable
    //   65	69	114	java/lang/Throwable
    //   102	106	114	java/lang/Throwable
    //   106	108	114	java/lang/Throwable
    //   115	117	117	finally
    //   5	15	146	java/io/IOException
    //   25	30	146	java/io/IOException
    //   74	79	146	java/io/IOException
    //   131	136	146	java/io/IOException
    //   139	144	146	java/io/IOException
    //   144	146	146	java/io/IOException
    //   95	99	149	java/lang/Throwable
    //   131	136	153	java/lang/Throwable
  }
  
  /* Error */
  @Nullable
  @RequiresApi(19)
  private static ByteBuffer mmap(File paramFile)
  {
    // Byte code:
    //   0: new 160	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 191	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   8: astore 4
    //   10: aload 4
    //   12: invokevirtual 171	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   15: astore_0
    //   16: aload_0
    //   17: invokevirtual 177	java/nio/channels/FileChannel:size	()J
    //   20: lstore_1
    //   21: aload_0
    //   22: getstatic 183	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   25: lconst_0
    //   26: lload_1
    //   27: invokevirtual 187	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   30: astore_0
    //   31: aload 4
    //   33: invokevirtual 188	java/io/FileInputStream:close	()V
    //   36: aload_0
    //   37: areturn
    //   38: astore_3
    //   39: aconst_null
    //   40: astore_0
    //   41: goto +7 -> 48
    //   44: astore_0
    //   45: aload_0
    //   46: athrow
    //   47: astore_3
    //   48: aload_0
    //   49: ifnull +11 -> 60
    //   52: aload 4
    //   54: invokevirtual 188	java/io/FileInputStream:close	()V
    //   57: goto +8 -> 65
    //   60: aload 4
    //   62: invokevirtual 188	java/io/FileInputStream:close	()V
    //   65: aload_3
    //   66: athrow
    //   67: astore_0
    //   68: aconst_null
    //   69: areturn
    //   70: astore_0
    //   71: goto -6 -> 65
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	paramFile	File
    //   20	7	1	l	long
    //   38	1	3	localObject1	Object
    //   47	19	3	localObject2	Object
    //   8	53	4	localFileInputStream	java.io.FileInputStream
    // Exception table:
    //   from	to	target	type
    //   10	31	38	finally
    //   10	31	44	java/lang/Throwable
    //   45	47	47	finally
    //   0	10	67	java/io/IOException
    //   31	36	67	java/io/IOException
    //   52	57	67	java/io/IOException
    //   60	65	67	java/io/IOException
    //   65	67	67	java/io/IOException
    //   52	57	70	java/lang/Throwable
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/graphics/TypefaceCompatUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */