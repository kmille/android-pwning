package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.ExecutorService;

public final class zzi
  extends Binder
{
  private final zze zzbi;
  
  zzi(zze paramzze)
  {
    this.zzbi = paramzze;
  }
  
  public final void zzd(zzg paramzzg)
  {
    if (Binder.getCallingUid() == Process.myUid())
    {
      Log.isLoggable("EnhancedIntentService", 3);
      Log.isLoggable("EnhancedIntentService", 3);
      this.zzbi.zzax.execute(new zzj(this, paramzzg));
      return;
    }
    throw new SecurityException("Binding only allowed within app");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */