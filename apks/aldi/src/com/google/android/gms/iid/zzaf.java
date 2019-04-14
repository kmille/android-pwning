package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzaf
{
  private static int zzck = 0;
  private static final zzaj<Boolean> zzco = zzai.zzw().zzd("gcm_iid_use_messenger_ipc", true);
  private static String zzcp = null;
  private static boolean zzcq = false;
  private static int zzcr = 0;
  private static int zzcs = 0;
  private static BroadcastReceiver zzct = null;
  private PendingIntent zzad;
  private Messenger zzah;
  private Map<String, Object> zzcu = new ArrayMap();
  private Messenger zzcv;
  private MessengerCompat zzcw;
  private Context zzk;
  
  public zzaf(Context paramContext)
  {
    this.zzk = paramContext;
  }
  
  private static void zzd(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 instanceof ConditionVariable)) {
      ((ConditionVariable)paramObject1).open();
    }
    if ((paramObject1 instanceof Messenger))
    {
      paramObject1 = (Messenger)paramObject1;
      Message localMessage = Message.obtain();
      localMessage.obj = paramObject2;
      try
      {
        ((Messenger)paramObject1).send(localMessage);
        return;
      }
      catch (RemoteException paramObject1)
      {
        paramObject1 = String.valueOf(paramObject1);
        paramObject2 = new StringBuilder(String.valueOf(paramObject1).length() + 24);
        ((StringBuilder)paramObject2).append("Failed to send response ");
        ((StringBuilder)paramObject2).append((String)paramObject1);
      }
    }
  }
  
  private final void zzd(String paramString, Object paramObject)
  {
    synchronized (getClass())
    {
      Object localObject = this.zzcu.get(paramString);
      this.zzcu.put(paramString, paramObject);
      zzd(localObject, paramObject);
      return;
    }
  }
  
  private static boolean zzd(PackageManager paramPackageManager, String paramString)
  {
    try
    {
      paramPackageManager = paramPackageManager.getApplicationInfo(paramString, 0);
      zzcp = paramPackageManager.packageName;
      zzcs = paramPackageManager.uid;
      return true;
    }
    catch (PackageManager.NameNotFoundException paramPackageManager) {}
    return false;
  }
  
  private static boolean zzd(PackageManager paramPackageManager, String paramString1, String paramString2)
  {
    if (paramPackageManager.checkPermission("com.google.android.c2dm.permission.SEND", paramString1) == 0) {
      return zzd(paramPackageManager, paramString1);
    }
    paramPackageManager = new StringBuilder(String.valueOf(paramString1).length() + 56 + String.valueOf(paramString2).length());
    paramPackageManager.append("Possible malicious package ");
    paramPackageManager.append(paramString1);
    paramPackageManager.append(" declares ");
    paramPackageManager.append(paramString2);
    paramPackageManager.append(" without permission");
    return false;
  }
  
  private final void zzg(Intent paramIntent)
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
  
  static String zzi(Bundle paramBundle)
    throws IOException
  {
    if (paramBundle != null)
    {
      String str = paramBundle.getString("registration_id");
      Object localObject = str;
      if (str == null) {
        localObject = paramBundle.getString("unregistered");
      }
      if (localObject == null)
      {
        localObject = paramBundle.getString("error");
        if (localObject != null) {
          throw new IOException((String)localObject);
        }
        paramBundle = String.valueOf(paramBundle);
        localObject = new StringBuilder(String.valueOf(paramBundle).length() + 29);
        ((StringBuilder)localObject).append("Unexpected response from GCM ");
        ((StringBuilder)localObject).append(paramBundle);
        new Throwable();
        throw new IOException("SERVICE_NOT_AVAILABLE");
      }
      return (String)localObject;
    }
    throw new IOException("SERVICE_NOT_AVAILABLE");
  }
  
  private final Bundle zzj(Bundle paramBundle)
    throws IOException
  {
    Bundle localBundle2 = zzk(paramBundle);
    Bundle localBundle1 = localBundle2;
    if (localBundle2 != null)
    {
      localBundle1 = localBundle2;
      if (localBundle2.containsKey("google.messenger"))
      {
        paramBundle = zzk(paramBundle);
        localBundle1 = paramBundle;
        if (paramBundle != null)
        {
          localBundle1 = paramBundle;
          if (paramBundle.containsKey("google.messenger")) {
            localBundle1 = null;
          }
        }
      }
    }
    return localBundle1;
  }
  
  private final Bundle zzk(Bundle arg1)
    throws IOException
  {
    ConditionVariable localConditionVariable = new ConditionVariable();
    Object localObject3 = zzv();
    synchronized (getClass())
    {
      this.zzcu.put(localObject3, localConditionVariable);
      if (this.zzah == null)
      {
        zzl(this.zzk);
        this.zzah = new Messenger(new zzag(this, Looper.getMainLooper()));
      }
      boolean bool;
      if (zzcp != null)
      {
        if (zzcq) {
          ??? = "com.google.iid.TOKEN_REQUEST";
        } else {
          ??? = "com.google.android.c2dm.intent.REGISTER";
        }
        ??? = new Intent((String)???);
        ((Intent)???).setPackage(zzcp);
        ((Intent)???).putExtras(???);
        zzg((Intent)???);
        ??? = new StringBuilder(String.valueOf(localObject3).length() + 5);
        ???.append("|ID|");
        ???.append((String)localObject3);
        ???.append("|");
        ((Intent)???).putExtra("kid", ???.toString());
        ??? = new StringBuilder(String.valueOf(localObject3).length() + 5);
        ???.append("|ID|");
        ???.append((String)localObject3);
        ???.append("|");
        ((Intent)???).putExtra("X-kid", ???.toString());
        bool = "com.google.android.gsf".equals(zzcp);
        ??? = ((Intent)???).getStringExtra("useGsf");
        if (??? != null) {
          bool = "1".equals(???);
        }
        if (Log.isLoggable("InstanceID", 3))
        {
          ??? = String.valueOf(((Intent)???).getExtras());
          StringBuilder localStringBuilder = new StringBuilder(String.valueOf(???).length() + 8);
          localStringBuilder.append("Sending ");
          localStringBuilder.append(???);
        }
        if (this.zzcv != null)
        {
          ((Intent)???).putExtra("google.messenger", this.zzah);
          ??? = Message.obtain();
          ???.obj = ???;
        }
      }
      try
      {
        this.zzcv.send(???);
      }
      catch (RemoteException ???)
      {
        for (;;) {}
      }
      Log.isLoggable("InstanceID", 3);
      if (bool)
      {
        try
        {
          if (zzct == null)
          {
            zzct = new zzah(this);
            Log.isLoggable("InstanceID", 3);
            ??? = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
            ???.addCategory(this.zzk.getPackageName());
            this.zzk.registerReceiver(zzct, ???, "com.google.android.c2dm.permission.SEND", null);
          }
        }
        finally {}
      }
      else
      {
        ((Intent)???).putExtra("google.messenger", this.zzah);
        ((Intent)???).putExtra("messenger2", "1");
        if (this.zzcw != null)
        {
          ??? = Message.obtain();
          ???.obj = ???;
        }
      }
      try
      {
        this.zzcw.send(???);
      }
      catch (RemoteException ???)
      {
        for (;;) {}
      }
      Log.isLoggable("InstanceID", 3);
      if (zzcq) {
        this.zzk.sendBroadcast((Intent)???);
      } else {
        this.zzk.startService((Intent)???);
      }
      localConditionVariable.block(30000L);
      synchronized (getClass())
      {
        ??? = this.zzcu.remove(localObject3);
        if ((??? instanceof Bundle))
        {
          ??? = (Bundle)???;
          return (Bundle)???;
        }
        if ((??? instanceof String)) {
          throw new IOException((String)???);
        }
        ??? = String.valueOf(???);
        localObject3 = new StringBuilder(String.valueOf(???).length() + 12);
        ((StringBuilder)localObject3).append("No response ");
        ((StringBuilder)localObject3).append((String)???);
        throw new IOException("TIMEOUT");
      }
      throw new IOException("MISSING_INSTANCEID_SERVICE");
    }
  }
  
  public static boolean zzk(Context paramContext)
  {
    if (zzcp != null) {
      zzl(paramContext);
    }
    return zzcq;
  }
  
  public static String zzl(Context paramContext)
  {
    if (zzcp != null) {
      return zzcp;
    }
    zzcr = Process.myUid();
    paramContext = paramContext.getPackageManager();
    boolean bool = PlatformVersion.isAtLeastO();
    int j = 1;
    if (!bool)
    {
      localIterator = paramContext.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
      while (localIterator.hasNext()) {
        if (zzd(paramContext, ((ResolveInfo)localIterator.next()).serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER"))
        {
          zzcq = false;
          i = 1;
          break label98;
        }
      }
      i = 0;
      label98:
      if (i != 0) {
        return zzcp;
      }
    }
    Iterator localIterator = paramContext.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0).iterator();
    while (localIterator.hasNext()) {
      if (zzd(paramContext, ((ResolveInfo)localIterator.next()).activityInfo.packageName, "com.google.iid.TOKEN_REQUEST"))
      {
        zzcq = true;
        i = j;
        break label173;
      }
    }
    int i = 0;
    label173:
    if (i != 0) {
      return zzcp;
    }
    if (zzd(paramContext, "com.google.android.gms")) {}
    for (zzcq = PlatformVersion.isAtLeastO();; zzcq = false)
    {
      return zzcp;
      if ((PlatformVersion.isAtLeastLollipop()) || (!zzd(paramContext, "com.google.android.gsf"))) {
        break;
      }
    }
    return null;
  }
  
  private static int zzm(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      int i = localPackageManager.getPackageInfo(zzl(paramContext), 0).versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return -1;
  }
  
  private static String zzv()
  {
    try
    {
      int i = zzck;
      zzck = i + 1;
      String str = Integer.toString(i);
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final Bundle zzd(Bundle paramBundle, KeyPair paramKeyPair)
    throws IOException
  {
    int i = zzm(this.zzk);
    paramBundle.putString("gmsv", Integer.toString(i));
    paramBundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
    paramBundle.putString("app_ver", Integer.toString(InstanceID.zzg(this.zzk)));
    paramBundle.putString("app_ver_name", InstanceID.zzh(this.zzk));
    paramBundle.putString("cliv", "iid-12451000");
    paramBundle.putString("appid", InstanceID.zzd(paramKeyPair));
    if ((i >= 12000000) && (((Boolean)zzco.get()).booleanValue()))
    {
      paramKeyPair = new zzr(this.zzk).zzd(1, paramBundle);
      try
      {
        paramKeyPair = (Bundle)Tasks.await(paramKeyPair);
        return paramKeyPair;
      }
      catch (InterruptedException|ExecutionException paramKeyPair)
      {
        if (Log.isLoggable("InstanceID", 3))
        {
          String str = String.valueOf(paramKeyPair);
          StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
          localStringBuilder.append("Error making request: ");
          localStringBuilder.append(str);
        }
        if (((paramKeyPair.getCause() instanceof zzaa)) && (((zzaa)paramKeyPair.getCause()).getErrorCode() == 4)) {
          return zzj(paramBundle);
        }
        return null;
      }
    }
    return zzj(paramBundle);
  }
  
  public final void zze(Message paramMessage)
  {
    if (paramMessage == null) {
      return;
    }
    if ((paramMessage.obj instanceof Intent))
    {
      Object localObject = (Intent)paramMessage.obj;
      ((Intent)localObject).setExtrasClassLoader(MessengerCompat.class.getClassLoader());
      if (((Intent)localObject).hasExtra("google.messenger"))
      {
        localObject = ((Intent)localObject).getParcelableExtra("google.messenger");
        if ((localObject instanceof MessengerCompat)) {
          this.zzcw = ((MessengerCompat)localObject);
        }
        if ((localObject instanceof Messenger)) {
          this.zzcv = ((Messenger)localObject);
        }
      }
      zzh((Intent)paramMessage.obj);
    }
  }
  
  public final void zzh(Intent arg1)
  {
    if (??? == null)
    {
      Log.isLoggable("InstanceID", 3);
      return;
    }
    Object localObject1 = ???.getAction();
    if ((!"com.google.android.c2dm.intent.REGISTRATION".equals(localObject1)) && (!"com.google.android.gms.iid.InstanceID".equals(localObject1)))
    {
      if (Log.isLoggable("InstanceID", 3))
      {
        ??? = String.valueOf(???.getAction());
        if (???.length() != 0)
        {
          "Unexpected response ".concat(???);
          return;
        }
        new String("Unexpected response ");
      }
      return;
    }
    Object localObject3 = ???.getStringExtra("registration_id");
    localObject1 = localObject3;
    if (localObject3 == null) {
      localObject1 = ???.getStringExtra("unregistered");
    }
    if (localObject1 == null)
    {
      Object localObject4 = ???.getStringExtra("error");
      if (localObject4 == null)
      {
        ??? = String.valueOf(???.getExtras());
        localObject1 = new StringBuilder(String.valueOf(???).length() + 49);
        ((StringBuilder)localObject1).append("Unexpected response, no error or registration id ");
        ((StringBuilder)localObject1).append(???);
        return;
      }
      if (Log.isLoggable("InstanceID", 3))
      {
        localObject1 = String.valueOf(localObject4);
        if (((String)localObject1).length() != 0) {
          "Received InstanceID error ".concat((String)localObject1);
        } else {
          new String("Received InstanceID error ");
        }
      }
      localObject3 = null;
      String str2 = null;
      localObject1 = localObject4;
      if (((String)localObject4).startsWith("|"))
      {
        localObject1 = ((String)localObject4).split("\\|");
        if (!"ID".equals(localObject1[1]))
        {
          localObject3 = String.valueOf(localObject4);
          if (((String)localObject3).length() != 0) {
            "Unexpected structured response ".concat((String)localObject3);
          } else {
            new String("Unexpected structured response ");
          }
        }
        if (localObject1.length > 2)
        {
          localObject3 = localObject1[2];
          str2 = localObject1[3];
          localObject1 = str2;
          if (str2.startsWith(":")) {
            localObject1 = str2.substring(1);
          }
        }
        for (;;)
        {
          break;
          localObject1 = "UNKNOWN";
          localObject3 = str2;
        }
        ???.putExtra("error", (String)localObject1);
      }
      if (localObject3 == null) {
        synchronized (getClass())
        {
          localObject3 = this.zzcu.keySet().iterator();
          while (((Iterator)localObject3).hasNext())
          {
            str2 = (String)((Iterator)localObject3).next();
            localObject4 = this.zzcu.get(str2);
            this.zzcu.put(str2, localObject1);
            zzd(localObject4, localObject1);
          }
          return;
        }
      }
      zzd((String)localObject3, localObject2);
      return;
    }
    localObject3 = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher((CharSequence)localObject2);
    if (!((Matcher)localObject3).matches())
    {
      if (Log.isLoggable("InstanceID", 3))
      {
        ??? = String.valueOf(localObject2);
        if (???.length() != 0)
        {
          "Unexpected response string: ".concat(???);
          return;
        }
        new String("Unexpected response string: ");
      }
      return;
    }
    String str1 = ((Matcher)localObject3).group(1);
    localObject3 = ((Matcher)localObject3).group(2);
    ??? = ???.getExtras();
    ???.putString("registration_id", (String)localObject3);
    zzd(str1, ???);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */