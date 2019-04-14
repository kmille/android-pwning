package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

class zzcn
  extends BroadcastReceiver
{
  @VisibleForTesting
  private static final String zzaav = "com.google.android.gms.internal.measurement.zzcn";
  private boolean zzaaw;
  private boolean zzaax;
  private final zzat zzvm;
  
  zzcn(zzat paramzzat)
  {
    Preconditions.checkNotNull(paramzzat);
    this.zzvm = paramzzat;
  }
  
  private final void zzev()
  {
    this.zzvm.zzbu();
    this.zzvm.zzby();
  }
  
  @VisibleForTesting
  private final boolean zzex()
  {
    Object localObject = (ConnectivityManager)this.zzvm.getContext().getSystemService("connectivity");
    try
    {
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if (localObject != null)
      {
        boolean bool = ((NetworkInfo)localObject).isConnected();
        if (bool) {
          return true;
        }
      }
      return false;
    }
    catch (SecurityException localSecurityException) {}
    return false;
  }
  
  public final boolean isConnected()
  {
    if (!this.zzaaw) {
      this.zzvm.zzbu().zzt("Connectivity unknown. Receiver not registered");
    }
    return this.zzaax;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    zzev();
    paramContext = paramIntent.getAction();
    this.zzvm.zzbu().zza("NetworkBroadcastReceiver received action", paramContext);
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramContext))
    {
      boolean bool = zzex();
      if (this.zzaax != bool)
      {
        this.zzaax = bool;
        paramContext = this.zzvm.zzby();
        paramContext.zza("Network connectivity status changed", Boolean.valueOf(bool));
        paramContext.zzbw().zza(new zzak(paramContext, bool));
      }
      return;
    }
    if ("com.google.analytics.RADIO_POWERED".equals(paramContext))
    {
      if (!paramIntent.hasExtra(zzaav))
      {
        paramContext = this.zzvm.zzby();
        paramContext.zzq("Radio powered up");
        paramContext.zzbo();
      }
      return;
    }
    this.zzvm.zzbu().zzd("NetworkBroadcastReceiver received unknown action", paramContext);
  }
  
  public final void unregister()
  {
    if (!this.zzaaw) {
      return;
    }
    this.zzvm.zzbu().zzq("Unregistering connectivity change receiver");
    this.zzaaw = false;
    this.zzaax = false;
    Context localContext = this.zzvm.getContext();
    try
    {
      localContext.unregisterReceiver(this);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      this.zzvm.zzbu().zze("Failed to unregister the network broadcast receiver", localIllegalArgumentException);
    }
  }
  
  public final void zzeu()
  {
    zzev();
    if (this.zzaaw) {
      return;
    }
    Context localContext = this.zzvm.getContext();
    localContext.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    IntentFilter localIntentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
    localIntentFilter.addCategory(localContext.getPackageName());
    localContext.registerReceiver(this, localIntentFilter);
    this.zzaax = zzex();
    this.zzvm.zzbu().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzaax));
    this.zzaaw = true;
  }
  
  @VisibleForTesting
  public final void zzew()
  {
    Context localContext = this.zzvm.getContext();
    Intent localIntent = new Intent("com.google.analytics.RADIO_POWERED");
    localIntent.addCategory(localContext.getPackageName());
    localIntent.putExtra(zzaav, true);
    localContext.sendOrderedBroadcast(localIntent, null);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzcn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */