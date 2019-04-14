package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public abstract interface zad
  extends IInterface
{
  public abstract void zaa(ConnectionResult paramConnectionResult, zaa paramzaa)
    throws RemoteException;
  
  public abstract void zaa(Status paramStatus, GoogleSignInAccount paramGoogleSignInAccount)
    throws RemoteException;
  
  public abstract void zab(zaj paramzaj)
    throws RemoteException;
  
  public abstract void zag(Status paramStatus)
    throws RemoteException;
  
  public abstract void zah(Status paramStatus)
    throws RemoteException;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/signin/internal/zad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */