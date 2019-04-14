package com.google.android.gms.internal.auth-api-phone;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zzm
  extends TaskApiCall<zzi, Void>
{
  private TaskCompletionSource<Void> zzf;
  
  protected abstract void zza(zze paramzze)
    throws RemoteException;
  
  protected final void zzb(Status paramStatus)
  {
    TaskUtil.setResultOrApiException(paramStatus, this.zzf);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth-api-phone/zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */