package com.google.android.gms.gcm;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.CallSuper;
import android.support.annotation.RequiresPermission;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class Task
  implements ReflectedParcelable
{
  public static final int EXTRAS_LIMIT_BYTES = 10240;
  public static final int NETWORK_STATE_ANY = 2;
  public static final int NETWORK_STATE_CONNECTED = 0;
  public static final int NETWORK_STATE_UNMETERED = 1;
  protected static final long UNINITIALIZED = -1L;
  private final Bundle extras;
  private final String gcmTaskService;
  private final boolean isPersisted;
  private final int requiredNetworkState;
  private final boolean requiresCharging;
  private final String tag;
  private final boolean updateCurrent;
  private final Set<Uri> zzau;
  private final boolean zzav;
  private final zzl zzaw;
  
  @Deprecated
  Task(Parcel paramParcel)
  {
    Log.e("Task", "Constructing a Task object using a parcel.");
    this.gcmTaskService = paramParcel.readString();
    this.tag = paramParcel.readString();
    int i = paramParcel.readInt();
    boolean bool2 = true;
    boolean bool1;
    if (i == 1) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    this.updateCurrent = bool1;
    if (paramParcel.readInt() == 1) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    this.isPersisted = bool1;
    this.requiredNetworkState = 2;
    this.zzau = Collections.emptySet();
    this.requiresCharging = false;
    this.zzav = false;
    this.zzaw = zzl.zzao;
    this.extras = null;
  }
  
  Task(Builder paramBuilder)
  {
    this.gcmTaskService = paramBuilder.gcmTaskService;
    this.tag = paramBuilder.tag;
    this.updateCurrent = paramBuilder.updateCurrent;
    this.isPersisted = paramBuilder.isPersisted;
    this.requiredNetworkState = paramBuilder.requiredNetworkState;
    this.zzau = paramBuilder.zzau;
    this.requiresCharging = paramBuilder.requiresCharging;
    this.zzav = false;
    this.extras = paramBuilder.extras;
    if (paramBuilder.zzaw != null) {
      paramBuilder = paramBuilder.zzaw;
    } else {
      paramBuilder = zzl.zzao;
    }
    this.zzaw = paramBuilder;
  }
  
  private static void zzd(Uri paramUri)
  {
    if (paramUri != null)
    {
      String str1 = paramUri.getScheme();
      String str2 = paramUri.getHost();
      if ((!TextUtils.isEmpty(str2)) && (!"null".equals(str2))) {
        try
        {
          int i = paramUri.getPort();
          if ("tcp".equals(str1))
          {
            if ((i > 0) && (i <= 65535)) {
              return;
            }
            i = paramUri.getPort();
            paramUri = new StringBuilder(38);
            paramUri.append("Invalid required URI port: ");
            paramUri.append(i);
            throw new IllegalArgumentException(paramUri.toString());
          }
          if ("ping".equals(str1))
          {
            if (i == -1) {
              return;
            }
            throw new IllegalArgumentException("Ping does not support port numbers");
          }
          paramUri = String.valueOf(str1);
          if (paramUri.length() != 0) {
            paramUri = "Unsupported required URI scheme: ".concat(paramUri);
          } else {
            paramUri = new String("Unsupported required URI scheme: ");
          }
          throw new IllegalArgumentException(paramUri);
        }
        catch (NumberFormatException paramUri)
        {
          paramUri = String.valueOf(paramUri.getMessage());
          if (paramUri.length() != 0) {
            paramUri = "Invalid port number: ".concat(paramUri);
          } else {
            paramUri = new String("Invalid port number: ");
          }
          throw new IllegalArgumentException(paramUri);
        }
      }
      throw new IllegalArgumentException("URI hostname is required");
    }
    throw new IllegalArgumentException("Null URI");
  }
  
  public static void zzg(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      Object localObject1 = Parcel.obtain();
      paramBundle.writeToParcel((Parcel)localObject1, 0);
      int i = ((Parcel)localObject1).dataSize();
      ((Parcel)localObject1).recycle();
      if (i <= 10240)
      {
        localObject1 = paramBundle.keySet().iterator();
        for (;;)
        {
          if (!((Iterator)localObject1).hasNext()) {
            return;
          }
          Object localObject2 = paramBundle.get((String)((Iterator)localObject1).next());
          if ((!(localObject2 instanceof Integer)) && (!(localObject2 instanceof Long)) && (!(localObject2 instanceof Double)) && (!(localObject2 instanceof String)) && (!(localObject2 instanceof Boolean))) {
            i = 0;
          } else {
            i = 1;
          }
          if (i == 0)
          {
            if (!(localObject2 instanceof Bundle)) {
              break;
            }
            zzg((Bundle)localObject2);
          }
        }
        throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
      }
      paramBundle = new StringBuilder(55);
      paramBundle.append("Extras exceeding maximum size(10240 bytes): ");
      paramBundle.append(i);
      throw new IllegalArgumentException(paramBundle.toString());
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Bundle getExtras()
  {
    return this.extras;
  }
  
  public int getRequiredNetwork()
  {
    return this.requiredNetworkState;
  }
  
  public boolean getRequiresCharging()
  {
    return this.requiresCharging;
  }
  
  public String getServiceName()
  {
    return this.gcmTaskService;
  }
  
  public String getTag()
  {
    return this.tag;
  }
  
  public boolean isPersisted()
  {
    return this.isPersisted;
  }
  
  public boolean isUpdateCurrent()
  {
    return this.updateCurrent;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    paramBundle.putString("tag", this.tag);
    paramBundle.putBoolean("update_current", this.updateCurrent);
    paramBundle.putBoolean("persisted", this.isPersisted);
    paramBundle.putString("service", this.gcmTaskService);
    paramBundle.putInt("requiredNetwork", this.requiredNetworkState);
    if (!this.zzau.isEmpty())
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.zzau.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(((Uri)localIterator.next()).toString());
      }
      paramBundle.putStringArrayList("reachabilityUris", localArrayList);
    }
    paramBundle.putBoolean("requiresCharging", this.requiresCharging);
    paramBundle.putBoolean("requiresIdle", false);
    paramBundle.putBundle("retryStrategy", this.zzaw.zzf(new Bundle()));
    paramBundle.putBundle("extras", this.extras);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static abstract class Builder
  {
    protected Bundle extras;
    protected String gcmTaskService;
    protected boolean isPersisted;
    protected int requiredNetworkState;
    protected boolean requiresCharging;
    protected String tag;
    protected boolean updateCurrent;
    protected Set<Uri> zzau = Collections.emptySet();
    protected zzl zzaw = zzl.zzao;
    
    public abstract Task build();
    
    @CallSuper
    protected void checkConditions()
    {
      boolean bool;
      if (this.gcmTaskService != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "Must provide an endpoint for this task by calling setService(ComponentName).");
      GcmNetworkManager.zzd(this.tag);
      Object localObject = this.zzaw;
      if (localObject != null)
      {
        int i = ((zzl)localObject).zzh();
        if ((i != 1) && (i != 0))
        {
          localObject = new StringBuilder(45);
          ((StringBuilder)localObject).append("Must provide a valid RetryPolicy: ");
          ((StringBuilder)localObject).append(i);
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
        int j = ((zzl)localObject).zzi();
        int k = ((zzl)localObject).zzj();
        if ((i == 0) && (j < 0))
        {
          localObject = new StringBuilder(52);
          ((StringBuilder)localObject).append("InitialBackoffSeconds can't be negative: ");
          ((StringBuilder)localObject).append(j);
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
        if ((i == 1) && (j < 10)) {
          throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
        }
        if (k < j)
        {
          i = ((zzl)localObject).zzj();
          localObject = new StringBuilder(77);
          ((StringBuilder)localObject).append("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: ");
          ((StringBuilder)localObject).append(i);
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      if (this.isPersisted) {
        Task.zzg(this.extras);
      }
      if ((!this.zzau.isEmpty()) && (this.requiredNetworkState == 2)) {
        throw new IllegalArgumentException("Required URIs may not be used with NETWORK_STATE_ANY");
      }
      localObject = this.zzau.iterator();
      while (((Iterator)localObject).hasNext()) {
        Task.zze((Uri)((Iterator)localObject).next());
      }
    }
    
    public abstract Builder setExtras(Bundle paramBundle);
    
    @RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
    public abstract Builder setPersisted(boolean paramBoolean);
    
    public abstract Builder setRequiredNetwork(int paramInt);
    
    public abstract Builder setRequiresCharging(boolean paramBoolean);
    
    public abstract Builder setService(Class<? extends GcmTaskService> paramClass);
    
    public abstract Builder setTag(String paramString);
    
    public abstract Builder setUpdateCurrent(boolean paramBoolean);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/gcm/Task.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */