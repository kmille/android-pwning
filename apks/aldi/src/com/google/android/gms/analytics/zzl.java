package com.google.android.gms.analytics;

import java.util.Iterator;
import java.util.List;

final class zzl
  implements Runnable
{
  zzl(zzk paramzzk, zzg paramzzg) {}
  
  public final void run()
  {
    this.zzsg.zzv().zza(this.zzsg);
    Iterator localIterator = zzk.zza(this.zzsh).iterator();
    while (localIterator.hasNext()) {
      ((zzn)localIterator.next()).zza(this.zzsg);
    }
    zzk.zza(this.zzsh, this.zzsg);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */