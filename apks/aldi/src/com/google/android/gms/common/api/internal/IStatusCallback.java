package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract interface IStatusCallback
  extends IInterface
{
  public abstract void onResult(Status paramStatus)
    throws RemoteException;
  
  public static abstract class Stub
    extends zab
    implements IStatusCallback
  {
    public Stub()
    {
      super();
    }
    
    public static IStatusCallback asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
      if ((localIInterface instanceof IStatusCallback)) {
        return (IStatusCallback)localIInterface;
      }
      return new zaa(paramIBinder);
    }
    
    public boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      if (paramInt1 == 1)
      {
        onResult((Status)zac.zaa(paramParcel1, Status.CREATOR));
        return true;
      }
      return false;
    }
    
    public static final class zaa
      extends zaa
      implements IStatusCallback
    {
      zaa(IBinder paramIBinder)
      {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
      }
      
      public final void onResult(Status paramStatus)
        throws RemoteException
      {
        Parcel localParcel = zaa();
        zac.zaa(localParcel, paramStatus);
        zac(1, localParcel);
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/IStatusCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */