package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

final class zzfr
  implements zzfq
{
  private Handler handler = new Handler(zzfn.zza(this.zzbeg).getMainLooper(), new zzfs(this));
  
  private zzfr(zzfn paramzzfn) {}
  
  private final Message obtainMessage()
  {
    return this.handler.obtainMessage(1, zzfn.zzpe());
  }
  
  public final void cancel()
  {
    this.handler.removeMessages(1, zzfn.zzpe());
  }
  
  public final void zzh(long paramLong)
  {
    this.handler.removeMessages(1, zzfn.zzpe());
    this.handler.sendMessageDelayed(obtainMessage(), paramLong);
  }
  
  public final void zzpf()
  {
    this.handler.removeMessages(1, zzfn.zzpe());
    this.handler.sendMessage(obtainMessage());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzfr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */