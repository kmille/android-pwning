package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

public final class zah
  extends zad<Boolean>
{
  private final ListenerHolder.ListenerKey<?> zacs;
  
  public zah(ListenerHolder.ListenerKey<?> paramListenerKey, TaskCompletionSource<Boolean> paramTaskCompletionSource)
  {
    super(4, paramTaskCompletionSource);
    this.zacs = paramListenerKey;
  }
  
  @Nullable
  public final Feature[] zab(GoogleApiManager.zaa<?> paramzaa)
  {
    paramzaa = (zabw)paramzaa.zabk().get(this.zacs);
    if (paramzaa == null) {
      return null;
    }
    return paramzaa.zajw.getRequiredFeatures();
  }
  
  public final boolean zac(GoogleApiManager.zaa<?> paramzaa)
  {
    paramzaa = (zabw)paramzaa.zabk().get(this.zacs);
    return (paramzaa != null) && (paramzaa.zajw.shouldAutoResolveMissingFeatures());
  }
  
  public final void zad(GoogleApiManager.zaa<?> paramzaa)
    throws RemoteException
  {
    zabw localzabw = (zabw)paramzaa.zabk().remove(this.zacs);
    if (localzabw != null)
    {
      localzabw.zajx.unregisterListener(paramzaa.zaab(), this.zacm);
      localzabw.zajw.clearListener();
      return;
    }
    this.zacm.trySetResult(Boolean.FALSE);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */