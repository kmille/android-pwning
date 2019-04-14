package com.google.android.gms.common.config;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public abstract class GservicesValue<T>
{
  private static final Object sLock = new Object();
  private static zza zzbl = null;
  private static int zzbm = 0;
  private static Context zzbn;
  @GuardedBy("sLock")
  private static HashSet<String> zzbo;
  protected final String mKey;
  protected final T zzbp;
  private T zzbq = null;
  
  protected GservicesValue(String paramString, T paramT)
  {
    this.mKey = paramString;
    this.zzbp = paramT;
  }
  
  @KeepForSdk
  public static boolean isInitialized()
  {
    synchronized (sLock)
    {
      return false;
    }
  }
  
  @KeepForSdk
  public static GservicesValue<Float> value(String paramString, Float paramFloat)
  {
    return new zzd(paramString, paramFloat);
  }
  
  @KeepForSdk
  public static GservicesValue<Integer> value(String paramString, Integer paramInteger)
  {
    return new zzc(paramString, paramInteger);
  }
  
  @KeepForSdk
  public static GservicesValue<Long> value(String paramString, Long paramLong)
  {
    return new zzb(paramString, paramLong);
  }
  
  @KeepForSdk
  public static GservicesValue<String> value(String paramString1, String paramString2)
  {
    return new zze(paramString1, paramString2);
  }
  
  @KeepForSdk
  public static GservicesValue<Boolean> value(String paramString, boolean paramBoolean)
  {
    return new zza(paramString, Boolean.valueOf(paramBoolean));
  }
  
  private static boolean zzi()
  {
    synchronized (sLock)
    {
      return false;
    }
  }
  
  /* Error */
  @KeepForSdk
  public final T get()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 42	com/google/android/gms/common/config/GservicesValue:zzbq	Ljava/lang/Object;
    //   4: ifnull +8 -> 12
    //   7: aload_0
    //   8: getfield 42	com/google/android/gms/common/config/GservicesValue:zzbq	Ljava/lang/Object;
    //   11: areturn
    //   12: invokestatic 103	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   15: astore_3
    //   16: getstatic 34	com/google/android/gms/common/config/GservicesValue:sLock	Ljava/lang/Object;
    //   19: astore 4
    //   21: aload 4
    //   23: monitorenter
    //   24: aload 4
    //   26: monitorexit
    //   27: getstatic 34	com/google/android/gms/common/config/GservicesValue:sLock	Ljava/lang/Object;
    //   30: astore 4
    //   32: aload 4
    //   34: monitorenter
    //   35: aconst_null
    //   36: putstatic 105	com/google/android/gms/common/config/GservicesValue:zzbo	Ljava/util/HashSet;
    //   39: aconst_null
    //   40: putstatic 107	com/google/android/gms/common/config/GservicesValue:zzbn	Landroid/content/Context;
    //   43: aload 4
    //   45: monitorexit
    //   46: aload_0
    //   47: aload_0
    //   48: getfield 44	com/google/android/gms/common/config/GservicesValue:mKey	Ljava/lang/String;
    //   51: invokevirtual 111	com/google/android/gms/common/config/GservicesValue:zzd	(Ljava/lang/String;)Ljava/lang/Object;
    //   54: astore 4
    //   56: aload_3
    //   57: invokestatic 115	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   60: aload 4
    //   62: areturn
    //   63: astore 4
    //   65: goto +37 -> 102
    //   68: invokestatic 121	android/os/Binder:clearCallingIdentity	()J
    //   71: lstore_1
    //   72: aload_0
    //   73: aload_0
    //   74: getfield 44	com/google/android/gms/common/config/GservicesValue:mKey	Ljava/lang/String;
    //   77: invokevirtual 111	com/google/android/gms/common/config/GservicesValue:zzd	(Ljava/lang/String;)Ljava/lang/Object;
    //   80: astore 4
    //   82: lload_1
    //   83: invokestatic 125	android/os/Binder:restoreCallingIdentity	(J)V
    //   86: aload_3
    //   87: invokestatic 115	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   90: aload 4
    //   92: areturn
    //   93: astore 4
    //   95: lload_1
    //   96: invokestatic 125	android/os/Binder:restoreCallingIdentity	(J)V
    //   99: aload 4
    //   101: athrow
    //   102: aload_3
    //   103: invokestatic 115	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   106: aload 4
    //   108: athrow
    //   109: astore_3
    //   110: aload 4
    //   112: monitorexit
    //   113: aload_3
    //   114: athrow
    //   115: astore_3
    //   116: aload 4
    //   118: monitorexit
    //   119: aload_3
    //   120: athrow
    //   121: astore 4
    //   123: goto -55 -> 68
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	this	GservicesValue
    //   71	25	1	l	long
    //   15	88	3	localThreadPolicy	android.os.StrictMode.ThreadPolicy
    //   109	5	3	localObject1	Object
    //   115	5	3	localObject2	Object
    //   19	42	4	localObject3	Object
    //   63	1	4	localObject4	Object
    //   80	11	4	localObject5	Object
    //   93	24	4	localObject6	Object
    //   121	1	4	localSecurityException	SecurityException
    // Exception table:
    //   from	to	target	type
    //   46	56	63	finally
    //   68	72	63	finally
    //   82	86	63	finally
    //   95	102	63	finally
    //   72	82	93	finally
    //   35	46	109	finally
    //   110	113	109	finally
    //   24	27	115	finally
    //   116	119	115	finally
    //   46	56	121	java/lang/SecurityException
  }
  
  @Deprecated
  @KeepForSdk
  public final T getBinderSafe()
  {
    return (T)get();
  }
  
  @KeepForSdk
  @VisibleForTesting
  public void override(T arg1)
  {
    this.zzbq = ???;
    synchronized (sLock)
    {
      zzi();
      return;
    }
  }
  
  @KeepForSdk
  @VisibleForTesting
  public void resetOverride()
  {
    this.zzbq = null;
  }
  
  protected abstract T zzd(String paramString);
  
  static abstract interface zza
  {
    public abstract Long getLong(String paramString, Long paramLong);
    
    public abstract String getString(String paramString1, String paramString2);
    
    public abstract Boolean zza(String paramString, Boolean paramBoolean);
    
    public abstract Float zza(String paramString, Float paramFloat);
    
    public abstract Integer zza(String paramString, Integer paramInteger);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/config/GservicesValue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */