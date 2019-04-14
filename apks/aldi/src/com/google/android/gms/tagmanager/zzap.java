package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

final class zzap
  implements zzaq
{
  zzap(DataLayer paramDataLayer) {}
  
  public final void zzd(List<DataLayer.zza> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      DataLayer.zza localzza = (DataLayer.zza)paramList.next();
      DataLayer.zza(this.zzaze, DataLayer.zzk(localzza.mKey, localzza.mValue));
    }
    DataLayer.zza(this.zzaze).countDown();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */