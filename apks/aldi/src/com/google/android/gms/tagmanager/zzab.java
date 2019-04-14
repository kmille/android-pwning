package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;

final class zzab
  implements zzac
{
  private Long zzayq;
  
  zzab(zzy paramzzy, boolean paramBoolean) {}
  
  public final boolean zzb(Container paramContainer)
  {
    if (this.zzayr)
    {
      long l = paramContainer.getLastRefreshTime();
      if (this.zzayq == null) {
        this.zzayq = Long.valueOf(zzy.zzc(this.zzayp).zzmy());
      }
      return l + this.zzayq.longValue() >= zzy.zzd(this.zzayp).currentTimeMillis();
    }
    return !paramContainer.isDefault();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */