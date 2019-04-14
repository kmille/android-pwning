package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.support.annotation.RequiresPermission;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.zzaf;
import com.google.android.gms.iid.zzak;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public class GoogleCloudMessaging
{
  public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
  public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
  public static final String INSTANCE_ID_SCOPE = "GCM";
  @Deprecated
  public static final String MESSAGE_TYPE_DELETED = "deleted_messages";
  @Deprecated
  public static final String MESSAGE_TYPE_MESSAGE = "gcm";
  @Deprecated
  public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";
  @Deprecated
  public static final String MESSAGE_TYPE_SEND_EVENT = "send_event";
  private static GoogleCloudMessaging zzac;
  private static final AtomicInteger zzaf = new AtomicInteger(1);
  private PendingIntent zzad;
  private final Map<String, Handler> zzae = Collections.synchronizedMap(new ArrayMap());
  private final BlockingQueue<Intent> zzag = new LinkedBlockingQueue();
  private final Messenger zzah = new Messenger(new zzf(this, Looper.getMainLooper()));
  private Context zzk;
  
  @Deprecated
  public static GoogleCloudMessaging getInstance(Context paramContext)
  {
    try
    {
      if (zzac == null)
      {
        zze(paramContext);
        GoogleCloudMessaging localGoogleCloudMessaging = new GoogleCloudMessaging();
        zzac = localGoogleCloudMessaging;
        localGoogleCloudMessaging.zzk = paramContext.getApplicationContext();
      }
      paramContext = zzac;
      return paramContext;
    }
    finally {}
  }
  
  @Deprecated
  private final Intent zzd(Bundle paramBundle, boolean paramBoolean)
    throws IOException
  {
    if (Looper.getMainLooper() != Looper.myLooper())
    {
      if (zzf(this.zzk) >= 0)
      {
        if (paramBoolean) {
          localObject = "com.google.iid.TOKEN_REQUEST";
        } else {
          localObject = "com.google.android.c2dm.intent.REGISTER";
        }
        Object localObject = new Intent((String)localObject);
        ((Intent)localObject).setPackage(zzaf.zzl(this.zzk));
        zze((Intent)localObject);
        int i = zzaf.getAndIncrement();
        StringBuilder localStringBuilder = new StringBuilder(21);
        localStringBuilder.append("google.rpc");
        localStringBuilder.append(i);
        ((Intent)localObject).putExtra("google.message_id", localStringBuilder.toString());
        ((Intent)localObject).putExtras(paramBundle);
        ((Intent)localObject).putExtra("google.messenger", this.zzah);
        if (paramBoolean) {
          this.zzk.sendBroadcast((Intent)localObject);
        } else {
          this.zzk.startService((Intent)localObject);
        }
        try
        {
          paramBundle = (Intent)this.zzag.poll(30000L, TimeUnit.MILLISECONDS);
          return paramBundle;
        }
        catch (InterruptedException paramBundle)
        {
          throw new IOException(paramBundle.getMessage());
        }
      }
      throw new IOException("Google Play Services missing");
    }
    throw new IOException("MAIN_THREAD");
  }
  
  @Deprecated
  @VisibleForTesting
  private final String zzd(boolean paramBoolean, String... paramVarArgs)
    throws IOException
  {
    try
    {
      String str = zzaf.zzl(this.zzk);
      if (str != null)
      {
        if ((paramVarArgs != null) && (paramVarArgs.length != 0))
        {
          Object localObject = new StringBuilder(paramVarArgs[0]);
          int i = 1;
          while (i < paramVarArgs.length)
          {
            ((StringBuilder)localObject).append(',');
            ((StringBuilder)localObject).append(paramVarArgs[i]);
            i += 1;
          }
          paramVarArgs = ((StringBuilder)localObject).toString();
          localObject = new Bundle();
          if (str.contains(".gsf"))
          {
            ((Bundle)localObject).putString("legacy.sender", paramVarArgs);
            paramVarArgs = InstanceID.getInstance(this.zzk).getToken(paramVarArgs, "GCM", (Bundle)localObject);
            return paramVarArgs;
          }
          ((Bundle)localObject).putString("sender", paramVarArgs);
          paramVarArgs = zzd((Bundle)localObject, paramBoolean);
          if (paramVarArgs != null)
          {
            str = paramVarArgs.getStringExtra("registration_id");
            if (str != null) {
              return str;
            }
            paramVarArgs = paramVarArgs.getStringExtra("error");
            if (paramVarArgs != null) {
              throw new IOException(paramVarArgs);
            }
            throw new IOException("SERVICE_NOT_AVAILABLE");
          }
          throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IllegalArgumentException("No senderIds");
      }
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    finally {}
  }
  
  private final boolean zzd(Intent paramIntent)
  {
    Object localObject2 = paramIntent.getStringExtra("In-Reply-To");
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = localObject2;
      if (paramIntent.hasExtra("error")) {
        localObject1 = paramIntent.getStringExtra("google.message_id");
      }
    }
    if (localObject1 != null)
    {
      localObject1 = (Handler)this.zzae.remove(localObject1);
      if (localObject1 != null)
      {
        localObject2 = Message.obtain();
        ((Message)localObject2).obj = paramIntent;
        return ((Handler)localObject1).sendMessage((Message)localObject2);
      }
    }
    return false;
  }
  
  static void zze(Context paramContext)
  {
    paramContext = paramContext.getPackageName();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramContext).length() + 48);
    localStringBuilder.append("GCM SDK is deprecated, ");
    localStringBuilder.append(paramContext);
    localStringBuilder.append(" should update to use FCM");
  }
  
  private final void zze(Intent paramIntent)
  {
    try
    {
      if (this.zzad == null)
      {
        Intent localIntent = new Intent();
        localIntent.setPackage("com.google.example.invalidpackage");
        this.zzad = PendingIntent.getBroadcast(this.zzk, 0, localIntent, 0);
      }
      paramIntent.putExtra("app", this.zzad);
      return;
    }
    finally {}
  }
  
  public static int zzf(Context paramContext)
  {
    String str = zzaf.zzl(paramContext);
    if (str != null) {}
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(str, 0);
      if (paramContext != null)
      {
        int i = paramContext.versionCode;
        return i;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return -1;
  }
  
  private final void zzg()
  {
    try
    {
      if (this.zzad != null)
      {
        this.zzad.cancel();
        this.zzad = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @Deprecated
  public void close()
  {
    zzac = null;
    zzd.zzj = null;
    zzg();
  }
  
  @Deprecated
  public String getMessageType(Intent paramIntent)
  {
    if (!"com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction())) {
      return null;
    }
    paramIntent = paramIntent.getStringExtra("message_type");
    if (paramIntent != null) {
      return paramIntent;
    }
    return "gcm";
  }
  
  @Deprecated
  @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
  public String register(String... paramVarArgs)
    throws IOException
  {
    try
    {
      paramVarArgs = zzd(zzaf.zzk(this.zzk), paramVarArgs);
      return paramVarArgs;
    }
    finally
    {
      paramVarArgs = finally;
      throw paramVarArgs;
    }
  }
  
  @Deprecated
  @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
  public void send(String paramString1, String paramString2, long paramLong, Bundle paramBundle)
    throws IOException
  {
    if (paramString1 != null)
    {
      Object localObject1 = zzaf.zzl(this.zzk);
      if (localObject1 != null)
      {
        Object localObject2 = new Intent("com.google.android.gcm.intent.SEND");
        if (paramBundle != null) {
          ((Intent)localObject2).putExtras(paramBundle);
        }
        zze((Intent)localObject2);
        ((Intent)localObject2).setPackage((String)localObject1);
        ((Intent)localObject2).putExtra("google.to", paramString1);
        ((Intent)localObject2).putExtra("google.message_id", paramString2);
        ((Intent)localObject2).putExtra("google.ttl", Long.toString(paramLong));
        int i = paramString1.indexOf('@');
        String str;
        if (i > 0) {
          str = paramString1.substring(0, i);
        } else {
          str = paramString1;
        }
        InstanceID.getInstance(this.zzk);
        ((Intent)localObject2).putExtra("google.from", InstanceID.zzn().zze("", str, "GCM"));
        if (((String)localObject1).contains(".gsf"))
        {
          localObject1 = new Bundle();
          localObject2 = paramBundle.keySet().iterator();
          while (((Iterator)localObject2).hasNext())
          {
            str = (String)((Iterator)localObject2).next();
            Object localObject3 = paramBundle.get(str);
            if ((localObject3 instanceof String))
            {
              str = String.valueOf(str);
              if (str.length() != 0) {
                str = "gcm.".concat(str);
              } else {
                str = new String("gcm.");
              }
              ((Bundle)localObject1).putString(str, (String)localObject3);
            }
          }
          ((Bundle)localObject1).putString("google.to", paramString1);
          ((Bundle)localObject1).putString("google.message_id", paramString2);
          InstanceID.getInstance(this.zzk).zze("GCM", "upstream", (Bundle)localObject1);
          return;
        }
        this.zzk.sendOrderedBroadcast((Intent)localObject2, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
        return;
      }
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    throw new IllegalArgumentException("Missing 'to'");
  }
  
  @Deprecated
  @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
  public void send(String paramString1, String paramString2, Bundle paramBundle)
    throws IOException
  {
    send(paramString1, paramString2, -1L, paramBundle);
  }
  
  @Deprecated
  @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
  public void unregister()
    throws IOException
  {
    try
    {
      if (Looper.getMainLooper() != Looper.myLooper())
      {
        InstanceID.getInstance(this.zzk).deleteInstanceID();
        return;
      }
      throw new IOException("MAIN_THREAD");
    }
    finally {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/gcm/GoogleCloudMessaging.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */