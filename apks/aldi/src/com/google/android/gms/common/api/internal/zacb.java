package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zacb
  extends UnregisterListenerMethod<A, L>
{
  zacb(RegistrationMethods.Builder paramBuilder, ListenerHolder.ListenerKey paramListenerKey)
  {
    super(paramListenerKey);
  }
  
  protected final void unregisterListener(A paramA, TaskCompletionSource<Boolean> paramTaskCompletionSource)
    throws RemoteException
  {
    RegistrationMethods.Builder.zab(this.zakg).accept(paramA, paramTaskCompletionSource);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zacb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */