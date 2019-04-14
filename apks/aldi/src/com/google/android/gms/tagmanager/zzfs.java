package com.google.android.gms.tagmanager;

import android.os.Handler.Callback;
import android.os.Message;

final class zzfs
  implements Handler.Callback
{
  zzfs(zzfr paramzzfr) {}
  
  public final boolean handleMessage(Message paramMessage)
  {
    if ((1 == paramMessage.what) && (zzfn.zzpe().equals(paramMessage.obj)))
    {
      this.zzbeh.zzbeg.dispatch();
      if (!zzfn.zzb(this.zzbeh.zzbeg)) {
        this.zzbeh.zzh(zzfn.zzc(this.zzbeh.zzbeg));
      }
    }
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzfs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */