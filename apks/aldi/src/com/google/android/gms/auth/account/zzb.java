package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzc;

public abstract class zzb
  extends com.google.android.gms.internal.auth.zzb
  implements zza
{
  public zzb()
  {
    super("com.google.android.gms.auth.account.IWorkAccountCallback");
  }
  
  public final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 2: 
      zza(zzc.zza(paramParcel1));
      break;
    case 1: 
      zzc((Account)zzc.zza(paramParcel1, Account.CREATOR));
    }
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/account/zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */