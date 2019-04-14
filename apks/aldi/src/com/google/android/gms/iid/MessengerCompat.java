package com.google.android.gms.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class MessengerCompat
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<MessengerCompat> CREATOR = new zzq();
  private Messenger zzab;
  private zzl zzby;
  
  public MessengerCompat(IBinder paramIBinder)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.zzab = new Messenger(paramIBinder);
      return;
    }
    if (paramIBinder == null)
    {
      paramIBinder = null;
    }
    else
    {
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
      if ((localIInterface instanceof zzl)) {
        paramIBinder = (zzl)localIInterface;
      } else {
        paramIBinder = new zzm(paramIBinder);
      }
    }
    this.zzby = paramIBinder;
  }
  
  private final IBinder getBinder()
  {
    if (this.zzab != null) {
      return this.zzab.getBinder();
    }
    return this.zzby.asBinder();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    try
    {
      boolean bool = getBinder().equals(((MessengerCompat)paramObject).getBinder());
      return bool;
    }
    catch (ClassCastException paramObject) {}
    return false;
  }
  
  public int hashCode()
  {
    return getBinder().hashCode();
  }
  
  public final void send(Message paramMessage)
    throws RemoteException
  {
    if (this.zzab != null)
    {
      this.zzab.send(paramMessage);
      return;
    }
    this.zzby.send(paramMessage);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.zzab != null) {}
    for (IBinder localIBinder = this.zzab.getBinder();; localIBinder = this.zzby.asBinder())
    {
      paramParcel.writeStrongBinder(localIBinder);
      return;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/MessengerCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */