package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzad;
import com.google.android.gms.internal.auth.zzz;

final class zze
  extends AccountTransferClient.zzb<byte[]>
{
  zze(AccountTransferClient paramAccountTransferClient, zzad paramzzad)
  {
    super(null);
  }
  
  protected final void zza(zzz paramzzz)
    throws RemoteException
  {
    paramzzz.zza(new zzf(this, this), this.zzap);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/accounttransfer/zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */