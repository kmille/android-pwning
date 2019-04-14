package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@KeepForSdk
public class AdvertisingIdClient
{
  @GuardedBy("this")
  private final Context mContext;
  @Nullable
  @GuardedBy("this")
  private BlockingServiceConnection zze;
  @Nullable
  @GuardedBy("this")
  private zze zzf;
  @GuardedBy("this")
  private boolean zzg;
  private final Object zzh = new Object();
  @Nullable
  @GuardedBy("mAutoDisconnectTaskLock")
  private zza zzi;
  private final boolean zzj;
  private final long zzk;
  
  @KeepForSdk
  public AdvertisingIdClient(Context paramContext)
  {
    this(paramContext, 30000L, false, false);
  }
  
  @VisibleForTesting
  private AdvertisingIdClient(Context paramContext, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    Preconditions.checkNotNull(paramContext);
    Context localContext = paramContext;
    if (paramBoolean1)
    {
      localContext = paramContext.getApplicationContext();
      if (localContext == null) {
        localContext = paramContext;
      }
    }
    this.mContext = localContext;
    this.zzg = false;
    this.zzk = paramLong;
    this.zzj = paramBoolean2;
  }
  
  /* Error */
  @KeepForSdk
  public static Info getAdvertisingIdInfo(Context paramContext)
    throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    // Byte code:
    //   0: new 81	com/google/android/gms/ads/identifier/zzb
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 83	com/google/android/gms/ads/identifier/zzb:<init>	(Landroid/content/Context;)V
    //   8: astore 6
    //   10: aload 6
    //   12: ldc 85
    //   14: iconst_0
    //   15: invokevirtual 89	com/google/android/gms/ads/identifier/zzb:getBoolean	(Ljava/lang/String;Z)Z
    //   18: istore_2
    //   19: aload 6
    //   21: ldc 91
    //   23: fconst_0
    //   24: invokevirtual 95	com/google/android/gms/ads/identifier/zzb:getFloat	(Ljava/lang/String;F)F
    //   27: fstore_1
    //   28: aload 6
    //   30: ldc 97
    //   32: ldc 99
    //   34: invokevirtual 103	com/google/android/gms/ads/identifier/zzb:getString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   37: astore 5
    //   39: new 2	com/google/android/gms/ads/identifier/AdvertisingIdClient
    //   42: dup
    //   43: aload_0
    //   44: ldc2_w 104
    //   47: iload_2
    //   48: aload 6
    //   50: ldc 107
    //   52: iconst_0
    //   53: invokevirtual 89	com/google/android/gms/ads/identifier/zzb:getBoolean	(Ljava/lang/String;Z)Z
    //   56: invokespecial 39	com/google/android/gms/ads/identifier/AdvertisingIdClient:<init>	(Landroid/content/Context;JZZ)V
    //   59: astore_0
    //   60: invokestatic 113	android/os/SystemClock:elapsedRealtime	()J
    //   63: lstore_3
    //   64: aload_0
    //   65: iconst_0
    //   66: invokespecial 116	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	(Z)V
    //   69: aload_0
    //   70: invokevirtual 120	com/google/android/gms/ads/identifier/AdvertisingIdClient:getInfo	()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //   73: astore 6
    //   75: aload_0
    //   76: aload 6
    //   78: iload_2
    //   79: fload_1
    //   80: invokestatic 113	android/os/SystemClock:elapsedRealtime	()J
    //   83: lload_3
    //   84: lsub
    //   85: aload 5
    //   87: aconst_null
    //   88: invokespecial 123	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;ZFJLjava/lang/String;Ljava/lang/Throwable;)Z
    //   91: pop
    //   92: aload_0
    //   93: invokevirtual 126	com/google/android/gms/ads/identifier/AdvertisingIdClient:finish	()V
    //   96: aload 6
    //   98: areturn
    //   99: astore 5
    //   101: goto +23 -> 124
    //   104: astore 6
    //   106: aload_0
    //   107: aconst_null
    //   108: iload_2
    //   109: fload_1
    //   110: ldc2_w 104
    //   113: aload 5
    //   115: aload 6
    //   117: invokespecial 123	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;ZFJLjava/lang/String;Ljava/lang/Throwable;)Z
    //   120: pop
    //   121: aload 6
    //   123: athrow
    //   124: aload_0
    //   125: invokevirtual 126	com/google/android/gms/ads/identifier/AdvertisingIdClient:finish	()V
    //   128: aload 5
    //   130: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	paramContext	Context
    //   27	83	1	f	float
    //   18	91	2	bool	boolean
    //   63	21	3	l	long
    //   37	49	5	str1	String
    //   99	30	5	str2	String
    //   8	89	6	localObject	Object
    //   104	18	6	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   60	92	99	finally
    //   106	124	99	finally
    //   60	92	104	java/lang/Throwable
  }
  
  @KeepForSdk
  public static boolean getIsAdIdFakeForDebugLogging(Context paramContext)
    throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    zzb localzzb = new zzb(paramContext);
    paramContext = new AdvertisingIdClient(paramContext, -1L, localzzb.getBoolean("gads:ad_id_app_context:enabled", false), localzzb.getBoolean("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
    try
    {
      paramContext.zza(false);
      boolean bool = paramContext.zzb();
      return bool;
    }
    finally
    {
      paramContext.finish();
    }
  }
  
  @KeepForSdk
  public static void setShouldSkipGmsCoreVersionCheck(boolean paramBoolean) {}
  
  private static BlockingServiceConnection zza(Context paramContext, boolean paramBoolean)
    throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    try
    {
      paramContext.getPackageManager().getPackageInfo("com.android.vending", 0);
      int i = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(paramContext, 12451000);
      if ((i != 0) && (i != 2)) {
        throw new IOException("Google Play services not available");
      }
      if (paramBoolean) {
        localObject = "com.google.android.gms.ads.identifier.service.PERSISTENT_START";
      } else {
        localObject = "com.google.android.gms.ads.identifier.service.START";
      }
      BlockingServiceConnection localBlockingServiceConnection = new BlockingServiceConnection();
      Object localObject = new Intent((String)localObject);
      ((Intent)localObject).setPackage("com.google.android.gms");
      try
      {
        paramBoolean = ConnectionTracker.getInstance().bindService(paramContext, (Intent)localObject, localBlockingServiceConnection, 1);
        if (paramBoolean) {
          return localBlockingServiceConnection;
        }
        throw new IOException("Connection failure");
      }
      catch (Throwable paramContext)
      {
        throw new IOException(paramContext);
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    throw new GooglePlayServicesNotAvailableException(9);
  }
  
  @VisibleForTesting
  private static zze zza(Context paramContext, BlockingServiceConnection paramBlockingServiceConnection)
    throws IOException
  {
    try
    {
      paramContext = zzf.zza(paramBlockingServiceConnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS));
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      throw new IOException(paramContext);
      throw new IOException("Interrupted exception");
    }
    catch (InterruptedException paramContext)
    {
      for (;;) {}
    }
  }
  
  private final void zza()
  {
    synchronized (this.zzh)
    {
      if (this.zzi != null) {
        this.zzi.zzo.countDown();
      }
    }
    try
    {
      this.zzi.join();
      if (this.zzk > 0L) {
        this.zzi = new zza(this, this.zzk);
      }
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  @VisibleForTesting
  private final void zza(boolean paramBoolean)
    throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
    try
    {
      if (this.zzg) {
        finish();
      }
      this.zze = zza(this.mContext, this.zzj);
      this.zzf = zza(this.mContext, this.zze);
      this.zzg = true;
      if (paramBoolean) {
        zza();
      }
      return;
    }
    finally {}
  }
  
  @VisibleForTesting
  private final boolean zza(Info paramInfo, boolean paramBoolean, float paramFloat, long paramLong, String paramString, Throwable paramThrowable)
  {
    if (Math.random() > paramFloat) {
      return false;
    }
    HashMap localHashMap = new HashMap();
    String str;
    if (paramBoolean) {
      str = "1";
    } else {
      str = "0";
    }
    localHashMap.put("app_context", str);
    if (paramInfo != null)
    {
      if (paramInfo.isLimitAdTrackingEnabled()) {
        str = "1";
      } else {
        str = "0";
      }
      localHashMap.put("limit_ad_tracking", str);
    }
    if ((paramInfo != null) && (paramInfo.getId() != null)) {
      localHashMap.put("ad_id_size", Integer.toString(paramInfo.getId().length()));
    }
    if (paramThrowable != null) {
      localHashMap.put("error", paramThrowable.getClass().getName());
    }
    if ((paramString != null) && (!paramString.isEmpty())) {
      localHashMap.put("experiment_id", paramString);
    }
    localHashMap.put("tag", "AdvertisingIdClient");
    localHashMap.put("time_spent", Long.toString(paramLong));
    new zza(this, localHashMap).start();
    return true;
  }
  
  private final boolean zzb()
    throws IOException
  {
    Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
    label95:
    boolean bool;
    label129:
    try
    {
      if (!this.zzg) {
        synchronized (this.zzh)
        {
          if ((this.zzi != null) && (this.zzi.zzp)) {
            try
            {
              zza(false);
              if (this.zzg) {
                break label95;
              }
              throw new IOException("AdvertisingIdClient cannot reconnect.");
            }
            catch (Exception localException)
            {
              throw new IOException("AdvertisingIdClient cannot reconnect.", localException);
            }
          }
          throw new IOException("AdvertisingIdClient is not connected.");
        }
      }
      Preconditions.checkNotNull(this.zze);
      Preconditions.checkNotNull(this.zzf);
    }
    finally {}
    try
    {
      bool = this.zzf.zzc();
      zza();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      break label129;
    }
    throw new IOException("Remote exception");
  }
  
  protected void finalize()
    throws Throwable
  {
    finish();
    super.finalize();
  }
  
  /* Error */
  public final void finish()
  {
    // Byte code:
    //   0: ldc -17
    //   2: invokestatic 242	com/google/android/gms/common/internal/Preconditions:checkNotMainThread	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 61	com/google/android/gms/ads/identifier/AdvertisingIdClient:mContext	Landroid/content/Context;
    //   11: ifnull +54 -> 65
    //   14: aload_0
    //   15: getfield 246	com/google/android/gms/ads/identifier/AdvertisingIdClient:zze	Lcom/google/android/gms/common/BlockingServiceConnection;
    //   18: astore_1
    //   19: aload_1
    //   20: ifnonnull +6 -> 26
    //   23: goto +42 -> 65
    //   26: aload_0
    //   27: getfield 63	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzg	Z
    //   30: ifeq +17 -> 47
    //   33: invokestatic 186	com/google/android/gms/common/stats/ConnectionTracker:getInstance	()Lcom/google/android/gms/common/stats/ConnectionTracker;
    //   36: aload_0
    //   37: getfield 61	com/google/android/gms/ads/identifier/AdvertisingIdClient:mContext	Landroid/content/Context;
    //   40: aload_0
    //   41: getfield 246	com/google/android/gms/ads/identifier/AdvertisingIdClient:zze	Lcom/google/android/gms/common/BlockingServiceConnection;
    //   44: invokevirtual 359	com/google/android/gms/common/stats/ConnectionTracker:unbindService	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield 63	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzg	Z
    //   52: aload_0
    //   53: aconst_null
    //   54: putfield 250	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzf	Lcom/google/android/gms/internal/ads_identifier/zze;
    //   57: aload_0
    //   58: aconst_null
    //   59: putfield 246	com/google/android/gms/ads/identifier/AdvertisingIdClient:zze	Lcom/google/android/gms/common/BlockingServiceConnection;
    //   62: aload_0
    //   63: monitorexit
    //   64: return
    //   65: aload_0
    //   66: monitorexit
    //   67: return
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: athrow
    //   73: astore_1
    //   74: goto -27 -> 47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	AdvertisingIdClient
    //   18	2	1	localBlockingServiceConnection	BlockingServiceConnection
    //   68	4	1	localObject	Object
    //   73	1	1	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   7	19	68	finally
    //   26	47	68	finally
    //   47	64	68	finally
    //   65	67	68	finally
    //   69	71	68	finally
    //   26	47	73	java/lang/Throwable
  }
  
  @KeepForSdk
  public Info getInfo()
    throws IOException
  {
    Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
    label95:
    Info localInfo;
    label146:
    try
    {
      if (!this.zzg) {
        synchronized (this.zzh)
        {
          if ((this.zzi != null) && (this.zzi.zzp)) {
            try
            {
              zza(false);
              if (this.zzg) {
                break label95;
              }
              throw new IOException("AdvertisingIdClient cannot reconnect.");
            }
            catch (Exception localException)
            {
              throw new IOException("AdvertisingIdClient cannot reconnect.", localException);
            }
          }
          throw new IOException("AdvertisingIdClient is not connected.");
        }
      }
      Preconditions.checkNotNull(this.zze);
      Preconditions.checkNotNull(this.zzf);
    }
    finally {}
    try
    {
      localInfo = new Info(this.zzf.getId(), this.zzf.zzb(true));
      zza();
      return localInfo;
    }
    catch (RemoteException localRemoteException)
    {
      break label146;
    }
    throw new IOException("Remote exception");
  }
  
  @KeepForSdk
  public void start()
    throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    zza(true);
  }
  
  @KeepForSdkWithMembers
  public static final class Info
  {
    private final String zzq;
    private final boolean zzr;
    
    public Info(String paramString, boolean paramBoolean)
    {
      this.zzq = paramString;
      this.zzr = paramBoolean;
    }
    
    public final String getId()
    {
      return this.zzq;
    }
    
    public final boolean isLimitAdTrackingEnabled()
    {
      return this.zzr;
    }
    
    public final String toString()
    {
      String str = this.zzq;
      boolean bool = this.zzr;
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 7);
      localStringBuilder.append("{");
      localStringBuilder.append(str);
      localStringBuilder.append("}");
      localStringBuilder.append(bool);
      return localStringBuilder.toString();
    }
  }
  
  @VisibleForTesting
  static final class zza
    extends Thread
  {
    private WeakReference<AdvertisingIdClient> zzm;
    private long zzn;
    CountDownLatch zzo;
    boolean zzp;
    
    public zza(AdvertisingIdClient paramAdvertisingIdClient, long paramLong)
    {
      this.zzm = new WeakReference(paramAdvertisingIdClient);
      this.zzn = paramLong;
      this.zzo = new CountDownLatch(1);
      this.zzp = false;
      start();
    }
    
    private final void disconnect()
    {
      AdvertisingIdClient localAdvertisingIdClient = (AdvertisingIdClient)this.zzm.get();
      if (localAdvertisingIdClient != null)
      {
        localAdvertisingIdClient.finish();
        this.zzp = true;
      }
    }
    
    public final void run()
    {
      try
      {
        if (!this.zzo.await(this.zzn, TimeUnit.MILLISECONDS)) {
          disconnect();
        }
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
      disconnect();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/ads/identifier/AdvertisingIdClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */