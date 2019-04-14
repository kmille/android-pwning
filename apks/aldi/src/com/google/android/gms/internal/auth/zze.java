package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public abstract interface zze
  extends IInterface
{
  public abstract Bundle zza(Account paramAccount)
    throws RemoteException;
  
  public abstract Bundle zza(Account paramAccount, String paramString, Bundle paramBundle)
    throws RemoteException;
  
  public abstract Bundle zza(String paramString)
    throws RemoteException;
  
  public abstract Bundle zza(String paramString, Bundle paramBundle)
    throws RemoteException;
  
  public abstract AccountChangeEventsResponse zza(AccountChangeEventsRequest paramAccountChangeEventsRequest)
    throws RemoteException;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */