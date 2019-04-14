package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

final class zat
  implements Runnable
{
  zat(zas paramzas) {}
  
  public final void run()
  {
    zas.zaa(this.zaep).lock();
    try
    {
      zas.zab(this.zaep);
      return;
    }
    finally
    {
      zas.zaa(this.zaep).unlock();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */