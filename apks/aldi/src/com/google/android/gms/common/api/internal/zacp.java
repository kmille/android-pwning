package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class zacp
{
  public static final Status zakw = new Status(8, "The connection to Google Play services was lost");
  private static final BasePendingResult<?>[] zakx = new BasePendingResult[0];
  private final Map<Api.AnyClientKey<?>, Api.Client> zagy;
  @VisibleForTesting
  final Set<BasePendingResult<?>> zaky = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
  private final zacs zakz = new zacq(this);
  
  public zacp(Map<Api.AnyClientKey<?>, Api.Client> paramMap)
  {
    this.zagy = paramMap;
  }
  
  public final void release()
  {
    BasePendingResult[] arrayOfBasePendingResult = (BasePendingResult[])this.zaky.toArray(zakx);
    int j = arrayOfBasePendingResult.length;
    int i = 0;
    while (i < j)
    {
      BasePendingResult localBasePendingResult = arrayOfBasePendingResult[i];
      localBasePendingResult.zaa(null);
      if (localBasePendingResult.zam() == null) {
        if (!localBasePendingResult.zat()) {
          break label196;
        }
      }
      for (;;)
      {
        this.zaky.remove(localBasePendingResult);
        break label196;
        localBasePendingResult.setResultCallback(null);
        IBinder localIBinder = ((Api.Client)this.zagy.get(((BaseImplementation.ApiMethodImpl)localBasePendingResult).getClientKey())).getServiceBrokerBinder();
        zacr localzacr;
        if (localBasePendingResult.isReady())
        {
          localBasePendingResult.zaa(new zacr(localBasePendingResult, null, localIBinder, null));
        }
        else if ((localIBinder != null) && (localIBinder.isBinderAlive()))
        {
          localzacr = new zacr(localBasePendingResult, null, localIBinder, null);
          localBasePendingResult.zaa(localzacr);
        }
        try
        {
          localIBinder.linkToDeath(localzacr, 0);
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
      localBasePendingResult.zaa(null);
      localBasePendingResult.cancel();
      localBasePendingResult.zam().intValue();
      throw new NullPointerException();
      label196:
      i += 1;
    }
  }
  
  final void zab(BasePendingResult<? extends Result> paramBasePendingResult)
  {
    this.zaky.add(paramBasePendingResult);
    paramBasePendingResult.zaa(this.zakz);
  }
  
  public final void zabx()
  {
    BasePendingResult[] arrayOfBasePendingResult = (BasePendingResult[])this.zaky.toArray(zakx);
    int j = arrayOfBasePendingResult.length;
    int i = 0;
    while (i < j)
    {
      arrayOfBasePendingResult[i].zab(zakw);
      i += 1;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zacp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */