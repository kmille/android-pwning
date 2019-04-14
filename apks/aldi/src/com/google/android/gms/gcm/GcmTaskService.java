package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.concurrent.GuardedBy;

public abstract class GcmTaskService
  extends Service
{
  public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
  public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
  public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
  private ComponentName componentName;
  private final Object lock = new Object();
  @GuardedBy("lock")
  private int zzt;
  private ExecutorService zzu;
  private Messenger zzv;
  private GcmNetworkManager zzw;
  
  private final void zzd(int paramInt)
  {
    synchronized (this.lock)
    {
      this.zzt = paramInt;
      if (!this.zzw.zzf(this.componentName.getClassName())) {
        stopSelf(this.zzt);
      }
      return;
    }
  }
  
  private final void zzd(zze paramzze)
  {
    try
    {
      this.zzu.execute(paramzze);
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      Log.e("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", localRejectedExecutionException);
      zze.zzd(paramzze, 1);
    }
  }
  
  private final boolean zzg(String paramString)
  {
    synchronized (this.lock)
    {
      boolean bool = this.zzw.zzd(paramString, this.componentName.getClassName()) ^ true;
      if (bool)
      {
        String str = getPackageName();
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 44 + String.valueOf(paramString).length());
        localStringBuilder.append(str);
        localStringBuilder.append(" ");
        localStringBuilder.append(paramString);
        localStringBuilder.append(": Task already running, won't start another");
      }
      return bool;
    }
  }
  
  @CallSuper
  public IBinder onBind(Intent paramIntent)
  {
    if ((paramIntent != null) && (PlatformVersion.isAtLeastLollipop()) && ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(paramIntent.getAction()))) {
      return this.zzv.getBinder();
    }
    return null;
  }
  
  @CallSuper
  public void onCreate()
  {
    super.onCreate();
    this.zzw = GcmNetworkManager.getInstance(this);
    this.zzu = Executors.newFixedThreadPool(2, new zze(this));
    this.zzv = new Messenger(new zzd(Looper.getMainLooper()));
    this.componentName = new ComponentName(this, getClass());
  }
  
  @CallSuper
  public void onDestroy()
  {
    super.onDestroy();
    Object localObject = this.zzu.shutdownNow();
    if (!((List)localObject).isEmpty())
    {
      int i = ((List)localObject).size();
      localObject = new StringBuilder(79);
      ((StringBuilder)localObject).append("Shutting down, but not all tasks are finished executing. Remaining: ");
      ((StringBuilder)localObject).append(i);
      Log.e("GcmTaskService", ((StringBuilder)localObject).toString());
    }
  }
  
  public void onInitializeTasks() {}
  
  public abstract int onRunTask(TaskParams paramTaskParams);
  
  @CallSuper
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (paramIntent == null)
    {
      zzd(paramInt2);
      return 2;
    }
    try
    {
      paramIntent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
      String str = paramIntent.getAction();
      if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(str))
      {
        str = paramIntent.getStringExtra("tag");
        Object localObject = paramIntent.getParcelableExtra("callback");
        Bundle localBundle = paramIntent.getBundleExtra("extras");
        paramIntent = paramIntent.getParcelableArrayListExtra("triggered_uris");
        if (!(localObject instanceof PendingCallback))
        {
          paramIntent = getPackageName();
          localObject = new StringBuilder(String.valueOf(paramIntent).length() + 47 + String.valueOf(str).length());
          ((StringBuilder)localObject).append(paramIntent);
          ((StringBuilder)localObject).append(" ");
          ((StringBuilder)localObject).append(str);
          ((StringBuilder)localObject).append(": Could not process request, invalid callback.");
          Log.e("GcmTaskService", ((StringBuilder)localObject).toString());
          return 2;
        }
        boolean bool = zzg(str);
        if (bool) {
          return 2;
        }
        zzd(new zze(str, ((PendingCallback)localObject).zzal, localBundle, paramIntent));
      }
      else if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(str))
      {
        onInitializeTasks();
      }
      else
      {
        paramIntent = new StringBuilder(String.valueOf(str).length() + 37);
        paramIntent.append("Unknown action received ");
        paramIntent.append(str);
        paramIntent.append(", terminating");
        Log.e("GcmTaskService", paramIntent.toString());
      }
      return 2;
    }
    finally
    {
      zzd(paramInt2);
    }
  }
  
  @TargetApi(21)
  @VisibleForTesting
  final class zzd
    extends Handler
  {
    zzd(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      if (!UidVerifier.uidHasPackageName(GcmTaskService.this, paramMessage.sendingUid, "com.google.android.gms"))
      {
        Log.e("GcmTaskService", "unable to verify presence of Google Play Services");
        return;
      }
      int i = paramMessage.what;
      if (i != 4)
      {
        switch (i)
        {
        default: 
          paramMessage = String.valueOf(paramMessage);
          localObject = new StringBuilder(String.valueOf(paramMessage).length() + 31);
          ((StringBuilder)localObject).append("Unrecognized message received: ");
          ((StringBuilder)localObject).append(paramMessage);
          Log.e("GcmTaskService", ((StringBuilder)localObject).toString());
          return;
        case 2: 
          if (Log.isLoggable("GcmTaskService", 3))
          {
            paramMessage = String.valueOf(paramMessage);
            localObject = new StringBuilder(String.valueOf(paramMessage).length() + 45);
            ((StringBuilder)localObject).append("ignoring unimplemented stop message for now: ");
            ((StringBuilder)localObject).append(paramMessage);
          }
          return;
        }
        Object localObject = paramMessage.getData();
        if (!((Bundle)localObject).isEmpty())
        {
          paramMessage = paramMessage.replyTo;
          if (paramMessage != null)
          {
            String str = ((Bundle)localObject).getString("tag");
            ArrayList localArrayList = ((Bundle)localObject).getParcelableArrayList("triggered_uris");
            if (!GcmTaskService.zzd(GcmTaskService.this, str))
            {
              localObject = ((Bundle)localObject).getBundle("extras");
              paramMessage = new GcmTaskService.zze(GcmTaskService.this, str, paramMessage, (Bundle)localObject, localArrayList);
              GcmTaskService.zzd(GcmTaskService.this, paramMessage);
            }
          }
        }
        return;
      }
      GcmTaskService.this.onInitializeTasks();
    }
  }
  
  final class zze
    implements Runnable
  {
    private final Bundle extras;
    private final String tag;
    @Nullable
    private final zzg zzaa;
    @Nullable
    private final Messenger zzab;
    private final List<Uri> zzz;
    
    zze(IBinder paramIBinder, @NonNull Bundle paramBundle, List<Uri> paramList)
    {
      this.tag = paramIBinder;
      if (paramBundle == null)
      {
        this$1 = null;
      }
      else
      {
        this$1 = paramBundle.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
        if ((GcmTaskService.this instanceof zzg)) {
          this$1 = (zzg)GcmTaskService.this;
        } else {
          this$1 = new zzh(paramBundle);
        }
      }
      this.zzaa = GcmTaskService.this;
      this.extras = paramList;
      List localList;
      this.zzz = localList;
      this.zzab = null;
    }
    
    zze(Messenger paramMessenger, @NonNull Bundle paramBundle, List<Uri> paramList)
    {
      this.tag = paramMessenger;
      this.zzab = paramBundle;
      this.extras = paramList;
      List localList;
      this.zzz = localList;
      this.zzaa = null;
    }
    
    private final void zze(int paramInt)
    {
      for (;;)
      {
        try
        {
          synchronized (GcmTaskService.zzd(GcmTaskService.this))
          {
            boolean bool = GcmTaskService.zzf(GcmTaskService.this).zzf(this.tag, GcmTaskService.zze(GcmTaskService.this).getClassName());
            if (bool) {}
            try
            {
              GcmTaskService.zzf(GcmTaskService.this).zze(this.tag, GcmTaskService.zze(GcmTaskService.this).getClassName());
              if ((!zzf()) && (!GcmTaskService.zzf(GcmTaskService.this).zzf(GcmTaskService.zze(GcmTaskService.this).getClassName()))) {
                GcmTaskService.this.stopSelf(GcmTaskService.zzg(GcmTaskService.this));
              }
              return;
            }
            finally {}
            if (zzf())
            {
              localObject1 = this.zzab;
              Message localMessage = Message.obtain();
              localMessage.what = 3;
              localMessage.arg1 = paramInt;
              Bundle localBundle = new Bundle();
              localBundle.putParcelable("component", GcmTaskService.zze(GcmTaskService.this));
              localBundle.putString("tag", this.tag);
              localMessage.setData(localBundle);
              ((Messenger)localObject1).send(localMessage);
            }
            else
            {
              this.zzaa.zzf(paramInt);
            }
            GcmTaskService.zzf(GcmTaskService.this).zze(this.tag, GcmTaskService.zze(GcmTaskService.this).getClassName());
            if ((zzf()) || (GcmTaskService.zzf(GcmTaskService.this).zzf(GcmTaskService.zze(GcmTaskService.this).getClassName()))) {
              continue;
            }
            Object localObject1 = GcmTaskService.this;
            paramInt = GcmTaskService.zzg(GcmTaskService.this);
            ((GcmTaskService)localObject1).stopSelf(paramInt);
          }
        }
        catch (RemoteException localRemoteException)
        {
          Object localObject3;
          continue;
        }
        localObject3 = String.valueOf(this.tag);
        if (((String)localObject3).length() != 0) {
          localObject3 = "Error reporting result of operation to scheduler for ".concat((String)localObject3);
        } else {
          localObject3 = new String("Error reporting result of operation to scheduler for ");
        }
        Log.e("GcmTaskService", (String)localObject3);
        GcmTaskService.zzf(GcmTaskService.this).zze(this.tag, GcmTaskService.zze(GcmTaskService.this).getClassName());
        if ((zzf()) || (GcmTaskService.zzf(GcmTaskService.this).zzf(GcmTaskService.zze(GcmTaskService.this).getClassName()))) {
          continue;
        }
        localObject3 = GcmTaskService.this;
        paramInt = GcmTaskService.zzg(GcmTaskService.this);
      }
      return;
      GcmTaskService.zzf(GcmTaskService.this).zze(this.tag, GcmTaskService.zze(GcmTaskService.this).getClassName());
      if ((!zzf()) && (!GcmTaskService.zzf(GcmTaskService.this).zzf(GcmTaskService.zze(GcmTaskService.this).getClassName()))) {
        GcmTaskService.this.stopSelf(GcmTaskService.zzg(GcmTaskService.this));
      }
      throw ((Throwable)localObject3);
    }
    
    private final boolean zzf()
    {
      return this.zzab != null;
    }
    
    public final void run()
    {
      TaskParams localTaskParams = new TaskParams(this.tag, this.extras, this.zzz);
      zze(GcmTaskService.this.onRunTask(localTaskParams));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/gcm/GcmTaskService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */