package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzl
  extends zza
  implements IGmsCallbacks
{
  zzl(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
  }
  
  public final void onPostInitComplete(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(paramInt);
    localParcel.writeStrongBinder(paramIBinder);
    zzc.zza(localParcel, paramBundle);
    zzb(1, localParcel);
  }
  
  public final void zza(int paramInt, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(paramInt);
    zzc.zza(localParcel, paramBundle);
    zzb(2, localParcel);
  }
  
  public final void zza(int paramInt, IBinder paramIBinder, zzb paramzzb)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(paramInt);
    localParcel.writeStrongBinder(paramIBinder);
    zzc.zza(localParcel, paramzzb);
    zzb(3, localParcel);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */