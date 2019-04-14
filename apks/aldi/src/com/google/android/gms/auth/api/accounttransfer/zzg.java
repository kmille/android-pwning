package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzv;
import com.google.android.gms.internal.auth.zzz;

final class zzg
  extends AccountTransferClient.zzb<DeviceMetaData>
{
  zzg(AccountTransferClient paramAccountTransferClient, zzv paramzzv)
  {
    super(null);
  }
  
  protected final void zza(zzz paramzzz)
    throws RemoteException
  {
    paramzzz.zza(new zzh(this, this), this.zzar);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/accounttransfer/zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */