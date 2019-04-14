package com.google.android.gms.iid;

import android.util.Log;

final class zzj
  implements Runnable
{
  zzj(zzi paramzzi, zzg paramzzg) {}
  
  public final void run()
  {
    Log.isLoggable("EnhancedIntentService", 3);
    zzi.zzd(this.zzbk).handleIntent(this.zzbj.intent);
    this.zzbj.finish();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */