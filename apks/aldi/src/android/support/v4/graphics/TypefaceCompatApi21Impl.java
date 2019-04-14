package android.support.v4.graphics;

import android.os.ParcelFileDescriptor;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;

@RequiresApi(21)
@RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
class TypefaceCompatApi21Impl
  extends TypefaceCompatBaseImpl
{
  private static final String TAG = "TypefaceCompatApi21Impl";
  
  private File getFile(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder("/proc/self/fd/");
      localStringBuilder.append(paramParcelFileDescriptor.getFd());
      paramParcelFileDescriptor = Os.readlink(localStringBuilder.toString());
      if (OsConstants.S_ISREG(Os.stat(paramParcelFileDescriptor).st_mode))
      {
        paramParcelFileDescriptor = new File(paramParcelFileDescriptor);
        return paramParcelFileDescriptor;
      }
      return null;
    }
    catch (ErrnoException paramParcelFileDescriptor) {}
    return null;
  }
  
  /* Error */
  public android.graphics.Typeface createFromFontInfo(android.content.Context paramContext, android.os.CancellationSignal paramCancellationSignal, @android.support.annotation.NonNull android.support.v4.provider.FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    // Byte code:
    //   0: aload_3
    //   1: arraylength
    //   2: ifgt +5 -> 7
    //   5: aconst_null
    //   6: areturn
    //   7: aload_0
    //   8: aload_3
    //   9: iload 4
    //   11: invokevirtual 80	android/support/v4/graphics/TypefaceCompatApi21Impl:findBestInfo	([Landroid/support/v4/provider/FontsContractCompat$FontInfo;I)Landroid/support/v4/provider/FontsContractCompat$FontInfo;
    //   14: astore_3
    //   15: aload_1
    //   16: invokevirtual 86	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   19: astore 5
    //   21: aload 5
    //   23: aload_3
    //   24: invokevirtual 92	android/support/v4/provider/FontsContractCompat$FontInfo:getUri	()Landroid/net/Uri;
    //   27: ldc 94
    //   29: aload_2
    //   30: invokevirtual 100	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   33: astore 5
    //   35: aload_0
    //   36: aload 5
    //   38: invokespecial 102	android/support/v4/graphics/TypefaceCompatApi21Impl:getFile	(Landroid/os/ParcelFileDescriptor;)Ljava/io/File;
    //   41: astore_2
    //   42: aload_2
    //   43: ifnull +30 -> 73
    //   46: aload_2
    //   47: invokevirtual 106	java/io/File:canRead	()Z
    //   50: ifne +6 -> 56
    //   53: goto +20 -> 73
    //   56: aload_2
    //   57: invokestatic 112	android/graphics/Typeface:createFromFile	(Ljava/io/File;)Landroid/graphics/Typeface;
    //   60: astore_1
    //   61: aload 5
    //   63: ifnull +8 -> 71
    //   66: aload 5
    //   68: invokevirtual 115	android/os/ParcelFileDescriptor:close	()V
    //   71: aload_1
    //   72: areturn
    //   73: new 117	java/io/FileInputStream
    //   76: dup
    //   77: aload 5
    //   79: invokevirtual 121	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   82: invokespecial 124	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   85: astore 6
    //   87: aload_0
    //   88: aload_1
    //   89: aload 6
    //   91: invokespecial 128	android/support/v4/graphics/TypefaceCompatBaseImpl:createFromInputStream	(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    //   94: astore_1
    //   95: aload 6
    //   97: invokevirtual 129	java/io/FileInputStream:close	()V
    //   100: aload 5
    //   102: ifnull +8 -> 110
    //   105: aload 5
    //   107: invokevirtual 115	android/os/ParcelFileDescriptor:close	()V
    //   110: aload_1
    //   111: areturn
    //   112: astore_1
    //   113: aconst_null
    //   114: astore_3
    //   115: goto +11 -> 126
    //   118: astore_1
    //   119: aload_1
    //   120: athrow
    //   121: astore_2
    //   122: aload_1
    //   123: astore_3
    //   124: aload_2
    //   125: astore_1
    //   126: aload_3
    //   127: ifnull +11 -> 138
    //   130: aload 6
    //   132: invokevirtual 129	java/io/FileInputStream:close	()V
    //   135: goto +8 -> 143
    //   138: aload 6
    //   140: invokevirtual 129	java/io/FileInputStream:close	()V
    //   143: aload_1
    //   144: athrow
    //   145: astore_1
    //   146: aconst_null
    //   147: astore_3
    //   148: goto +11 -> 159
    //   151: astore_1
    //   152: aload_1
    //   153: athrow
    //   154: astore_2
    //   155: aload_1
    //   156: astore_3
    //   157: aload_2
    //   158: astore_1
    //   159: aload 5
    //   161: ifnull +20 -> 181
    //   164: aload_3
    //   165: ifnull +11 -> 176
    //   168: aload 5
    //   170: invokevirtual 115	android/os/ParcelFileDescriptor:close	()V
    //   173: goto +8 -> 181
    //   176: aload 5
    //   178: invokevirtual 115	android/os/ParcelFileDescriptor:close	()V
    //   181: aload_1
    //   182: athrow
    //   183: astore_1
    //   184: aconst_null
    //   185: areturn
    //   186: astore_2
    //   187: goto -44 -> 143
    //   190: astore_2
    //   191: goto -10 -> 181
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	194	0	this	TypefaceCompatApi21Impl
    //   0	194	1	paramContext	android.content.Context
    //   0	194	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	194	3	paramArrayOfFontInfo	android.support.v4.provider.FontsContractCompat.FontInfo[]
    //   0	194	4	paramInt	int
    //   19	158	5	localObject	Object
    //   85	54	6	localFileInputStream	java.io.FileInputStream
    // Exception table:
    //   from	to	target	type
    //   87	95	112	finally
    //   87	95	118	java/lang/Throwable
    //   119	121	121	finally
    //   35	42	145	finally
    //   46	53	145	finally
    //   56	61	145	finally
    //   73	87	145	finally
    //   95	100	145	finally
    //   130	135	145	finally
    //   138	143	145	finally
    //   143	145	145	finally
    //   35	42	151	java/lang/Throwable
    //   46	53	151	java/lang/Throwable
    //   56	61	151	java/lang/Throwable
    //   73	87	151	java/lang/Throwable
    //   95	100	151	java/lang/Throwable
    //   138	143	151	java/lang/Throwable
    //   143	145	151	java/lang/Throwable
    //   152	154	154	finally
    //   21	35	183	java/io/IOException
    //   66	71	183	java/io/IOException
    //   105	110	183	java/io/IOException
    //   168	173	183	java/io/IOException
    //   176	181	183	java/io/IOException
    //   181	183	183	java/io/IOException
    //   130	135	186	java/lang/Throwable
    //   168	173	190	java/lang/Throwable
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/graphics/TypefaceCompatApi21Impl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */