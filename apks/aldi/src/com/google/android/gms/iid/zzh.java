package com.google.android.gms.iid;

import android.content.Intent;

final class zzh
  implements Runnable
{
  zzh(zzg paramzzg, Intent paramIntent) {}
  
  public final void run()
  {
    String str = this.zzbb.getAction();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 61);
    localStringBuilder.append("Service took too long to process intent: ");
    localStringBuilder.append(str);
    localStringBuilder.append(" App may get closed.");
    this.zzbh.finish();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */