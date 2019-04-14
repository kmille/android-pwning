package com.google.android.gms.gcm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

public class GcmNetworkManager
{
  public static final int RESULT_FAILURE = 2;
  public static final int RESULT_RESCHEDULE = 1;
  public static final int RESULT_SUCCESS = 0;
  @GuardedBy("GcmNetworkManager.class")
  private static GcmNetworkManager zzg;
  private final Context zzh;
  @GuardedBy("this")
  private final Map<String, Map<String, Boolean>> zzi = new ArrayMap();
  
  private GcmNetworkManager(Context paramContext)
  {
    this.zzh = paramContext;
  }
  
  public static GcmNetworkManager getInstance(Context paramContext)
  {
    try
    {
      if (zzg == null) {
        zzg = new GcmNetworkManager(paramContext.getApplicationContext());
      }
      paramContext = zzg;
      return paramContext;
    }
    finally {}
  }
  
  @NonNull
  private final zzn zzd()
  {
    if (GoogleCloudMessaging.zzf(this.zzh) < 5000000)
    {
      Log.e("GcmNetworkManager", "Google Play services is not available, dropping all GcmNetworkManager requests");
      return new zzo();
    }
    return new zzm(this.zzh);
  }
  
  static void zzd(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (100 >= paramString.length()) {
        return;
      }
      throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
    }
    throw new IllegalArgumentException("Must provide a valid tag.");
  }
  
  private final boolean zze(String paramString)
  {
    Preconditions.checkNotNull(paramString, "GcmTaskService must not be null.");
    Object localObject2 = this.zzh.getPackageManager();
    if (localObject2 == null)
    {
      localObject1 = Collections.emptyList();
    }
    else
    {
      if (paramString != null) {
        localObject1 = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setClassName(this.zzh, paramString);
      } else {
        localObject1 = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setPackage(this.zzh.getPackageName());
      }
      localObject1 = ((PackageManager)localObject2).queryIntentServices((Intent)localObject1, 0);
    }
    if (CollectionUtils.isEmpty((Collection)localObject1))
    {
      Log.e("GcmNetworkManager", String.valueOf(paramString).concat(" is not available. This may cause the task to be lost."));
      return true;
    }
    Object localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (ResolveInfo)((Iterator)localObject1).next();
      if ((((ResolveInfo)localObject2).serviceInfo != null) && (((ResolveInfo)localObject2).serviceInfo.enabled)) {
        return true;
      }
    }
    localObject1 = new StringBuilder(String.valueOf(paramString).length() + 118);
    ((StringBuilder)localObject1).append("The GcmTaskService class you provided ");
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY");
    throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
  }
  
  @WorkerThread
  public void cancelAllTasks(Class<? extends GcmTaskService> paramClass)
  {
    paramClass = new ComponentName(this.zzh, paramClass);
    zze(paramClass.getClassName());
    zzd().zzd(paramClass);
  }
  
  @WorkerThread
  public void cancelTask(String paramString, Class<? extends GcmTaskService> paramClass)
  {
    paramClass = new ComponentName(this.zzh, paramClass);
    zzd(paramString);
    zze(paramClass.getClassName());
    zzd().zzd(paramClass, paramString);
  }
  
  @WorkerThread
  public void schedule(Task paramTask)
  {
    try
    {
      zze(paramTask.getServiceName());
      if (zzd().zzd(paramTask))
      {
        Map localMap = (Map)this.zzi.get(paramTask.getServiceName());
        if ((localMap != null) && (localMap.containsKey(paramTask.getTag()))) {
          localMap.put(paramTask.getTag(), Boolean.TRUE);
        }
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  final boolean zzd(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 32	com/google/android/gms/gcm/GcmNetworkManager:zzi	Ljava/util/Map;
    //   6: aload_2
    //   7: invokeinterface 243 2 0
    //   12: checkcast 239	java/util/Map
    //   15: astore 5
    //   17: aload 5
    //   19: astore 4
    //   21: aload 5
    //   23: ifnonnull +25 -> 48
    //   26: new 29	android/support/v4/util/ArrayMap
    //   29: dup
    //   30: invokespecial 30	android/support/v4/util/ArrayMap:<init>	()V
    //   33: astore 4
    //   35: aload_0
    //   36: getfield 32	com/google/android/gms/gcm/GcmNetworkManager:zzi	Ljava/util/Map;
    //   39: aload_2
    //   40: aload 4
    //   42: invokeinterface 259 3 0
    //   47: pop
    //   48: aload 4
    //   50: aload_1
    //   51: getstatic 263	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   54: invokeinterface 259 3 0
    //   59: astore_1
    //   60: aload_1
    //   61: ifnonnull +9 -> 70
    //   64: iconst_1
    //   65: istore_3
    //   66: aload_0
    //   67: monitorexit
    //   68: iload_3
    //   69: ireturn
    //   70: iconst_0
    //   71: istore_3
    //   72: goto -6 -> 66
    //   75: astore_1
    //   76: aload_0
    //   77: monitorexit
    //   78: aload_1
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	GcmNetworkManager
    //   0	80	1	paramString1	String
    //   0	80	2	paramString2	String
    //   65	7	3	bool	boolean
    //   19	30	4	localObject	Object
    //   15	7	5	localMap	Map
    // Exception table:
    //   from	to	target	type
    //   2	17	75	finally
    //   26	48	75	finally
    //   48	60	75	finally
  }
  
  final void zze(String paramString1, String paramString2)
  {
    for (;;)
    {
      try
      {
        Map localMap = (Map)this.zzi.get(paramString2);
        if (localMap != null)
        {
          if (localMap.remove(paramString1) == null) {
            break label71;
          }
          i = 1;
          if ((i != 0) && (localMap.isEmpty())) {
            this.zzi.remove(paramString2);
          }
        }
        return;
      }
      finally {}
      label71:
      int i = 0;
    }
  }
  
  final boolean zzf(String paramString)
  {
    try
    {
      boolean bool = this.zzi.containsKey(paramString);
      return bool;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  final boolean zzf(String paramString1, String paramString2)
  {
    try
    {
      paramString2 = (Map)this.zzi.get(paramString2);
      if (paramString2 != null)
      {
        paramString1 = (Boolean)paramString2.get(paramString1);
        if (paramString1 == null) {
          return false;
        }
        boolean bool = paramString1.booleanValue();
        return bool;
      }
      return false;
    }
    finally {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/gcm/GcmNetworkManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */