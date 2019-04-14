package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public final class zzg
  extends zza
  implements zze
{
  zzg(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.auth.IAuthManagerService");
  }
  
  public final Bundle zza(Account paramAccount)
    throws RemoteException
  {
    Object localObject = obtainAndWriteInterfaceToken();
    zzc.zza((Parcel)localObject, paramAccount);
    paramAccount = transactAndReadException(7, (Parcel)localObject);
    localObject = (Bundle)zzc.zza(paramAccount, Bundle.CREATOR);
    paramAccount.recycle();
    return (Bundle)localObject;
  }
  
  public final Bundle zza(Account paramAccount, String paramString, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zzc.zza(localParcel, paramAccount);
    localParcel.writeString(paramString);
    zzc.zza(localParcel, paramBundle);
    paramAccount = transactAndReadException(5, localParcel);
    paramString = (Bundle)zzc.zza(paramAccount, Bundle.CREATOR);
    paramAccount.recycle();
    return paramString;
  }
  
  public final Bundle zza(String paramString)
    throws RemoteException
  {
    Object localObject = obtainAndWriteInterfaceToken();
    ((Parcel)localObject).writeString(paramString);
    paramString = transactAndReadException(8, (Parcel)localObject);
    localObject = (Bundle)zzc.zza(paramString, Bundle.CREATOR);
    paramString.recycle();
    return (Bundle)localObject;
  }
  
  public final Bundle zza(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    localParcel.writeString(paramString);
    zzc.zza(localParcel, paramBundle);
    paramString = transactAndReadException(2, localParcel);
    paramBundle = (Bundle)zzc.zza(paramString, Bundle.CREATOR);
    paramString.recycle();
    return paramBundle;
  }
  
  public final AccountChangeEventsResponse zza(AccountChangeEventsRequest paramAccountChangeEventsRequest)
    throws RemoteException
  {
    Object localObject = obtainAndWriteInterfaceToken();
    zzc.zza((Parcel)localObject, paramAccountChangeEventsRequest);
    paramAccountChangeEventsRequest = transactAndReadException(3, (Parcel)localObject);
    localObject = (AccountChangeEventsResponse)zzc.zza(paramAccountChangeEventsRequest, AccountChangeEventsResponse.CREATOR);
    paramAccountChangeEventsRequest.recycle();
    return (AccountChangeEventsResponse)localObject;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */