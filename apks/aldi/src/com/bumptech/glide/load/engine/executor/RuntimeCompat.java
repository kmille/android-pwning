package com.bumptech.glide.load.engine.executor;

import android.os.Build.VERSION;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class RuntimeCompat
{
  private static final String CPU_LOCATION = "/sys/devices/system/cpu/";
  private static final String CPU_NAME_REGEX = "cpu[0-9]+";
  private static final String TAG = "GlideRuntimeCompat";
  
  static int availableProcessors()
  {
    int j = Runtime.getRuntime().availableProcessors();
    int i = j;
    if (Build.VERSION.SDK_INT < 17) {
      i = Math.max(getCoreCountPre17(), j);
    }
    return i;
  }
  
  /* Error */
  private static int getCoreCountPre17()
  {
    // Byte code:
    //   0: invokestatic 54	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore_2
    //   4: new 56	java/io/File
    //   7: dup
    //   8: ldc 10
    //   10: invokespecial 59	java/io/File:<init>	(Ljava/lang/String;)V
    //   13: new 6	com/bumptech/glide/load/engine/executor/RuntimeCompat$1
    //   16: dup
    //   17: ldc 13
    //   19: invokestatic 65	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   22: invokespecial 68	com/bumptech/glide/load/engine/executor/RuntimeCompat$1:<init>	(Ljava/util/regex/Pattern;)V
    //   25: invokevirtual 72	java/io/File:listFiles	(Ljava/io/FilenameFilter;)[Ljava/io/File;
    //   28: astore_1
    //   29: aload_2
    //   30: invokestatic 76	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   33: goto +33 -> 66
    //   36: astore_1
    //   37: goto +47 -> 84
    //   40: astore_1
    //   41: ldc 16
    //   43: bipush 6
    //   45: invokestatic 82	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   48: ifeq +12 -> 60
    //   51: ldc 16
    //   53: ldc 84
    //   55: aload_1
    //   56: invokestatic 88	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   59: pop
    //   60: aload_2
    //   61: invokestatic 76	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   64: aconst_null
    //   65: astore_1
    //   66: aload_1
    //   67: ifnull +9 -> 76
    //   70: aload_1
    //   71: arraylength
    //   72: istore_0
    //   73: goto +5 -> 78
    //   76: iconst_0
    //   77: istore_0
    //   78: iconst_1
    //   79: iload_0
    //   80: invokestatic 46	java/lang/Math:max	(II)I
    //   83: ireturn
    //   84: aload_2
    //   85: invokestatic 76	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   88: aload_1
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   72	8	0	i	int
    //   28	1	1	arrayOfFile	File[]
    //   36	1	1	localObject1	Object
    //   40	16	1	localThrowable	Throwable
    //   65	24	1	localObject2	Object
    //   3	82	2	localThreadPolicy	android.os.StrictMode.ThreadPolicy
    // Exception table:
    //   from	to	target	type
    //   4	29	36	finally
    //   41	60	36	finally
    //   4	29	40	java/lang/Throwable
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/executor/RuntimeCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */