package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

public final class zzcj
  extends zzn
  implements zzci
{
  zzcj(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
  }
  
  public final void zza(Map paramMap, long paramLong, String paramString, List<zzbo> paramList)
    throws RemoteException
  {
    Parcel localParcel = obtainAndWriteInterfaceToken();
    localParcel.writeMap(paramMap);
    localParcel.writeLong(paramLong);
    localParcel.writeString(paramString);
    localParcel.writeTypedList(paramList);
    transactAndReadExceptionReturnVoid(1, localParcel);
  }
  
  public final void zzbn()
    throws RemoteException
  {
    transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzcj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */