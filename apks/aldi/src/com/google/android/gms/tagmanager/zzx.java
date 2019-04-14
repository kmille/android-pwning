package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class zzx
  extends Handler
{
  private final ContainerHolder.ContainerAvailableListener zzayb;
  
  public zzx(zzv paramzzv, ContainerHolder.ContainerAvailableListener paramContainerAvailableListener, Looper paramLooper)
  {
    super(paramLooper);
    this.zzayb = paramContainerAvailableListener;
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what != 1)
    {
      zzdi.e("Don't know how to handle this message.");
      return;
    }
    paramMessage = (String)paramMessage.obj;
    this.zzayb.onContainerAvailable(this.zzayc, paramMessage);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */