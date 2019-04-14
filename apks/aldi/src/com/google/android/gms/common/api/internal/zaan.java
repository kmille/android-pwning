package com.google.android.gms.common.api.internal;

import android.support.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import com.google.android.gms.signin.zad;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zaan
  extends zaau
{
  private final Map<Api.Client, zaam> zagk;
  
  public zaan(Map<Api.Client, zaam> paramMap)
  {
    super(paramMap, null);
    Map localMap;
    this.zagk = localMap;
  }
  
  @WorkerThread
  public final void zaan()
  {
    Object localObject1 = new GoogleApiAvailabilityCache(zaak.zab(this.zagi));
    Object localObject2 = new ArrayList();
    Object localObject3 = new ArrayList();
    Object localObject4 = this.zagk.keySet().iterator();
    while (((Iterator)localObject4).hasNext())
    {
      Api.Client localClient = (Api.Client)((Iterator)localObject4).next();
      if ((localClient.requiresGooglePlayServices()) && (!zaam.zaa((zaam)this.zagk.get(localClient)))) {
        ((List)localObject2).add(localClient);
      } else {
        ((List)localObject3).add(localClient);
      }
    }
    int i = -1;
    boolean bool = ((List)localObject2).isEmpty();
    int k = 0;
    int j = 0;
    int m;
    if (bool)
    {
      localObject2 = (ArrayList)localObject3;
      m = ((ArrayList)localObject2).size();
      do
      {
        if (j >= m) {
          break;
        }
        localObject3 = ((ArrayList)localObject2).get(j);
        j += 1;
        localObject3 = (Api.Client)localObject3;
        k = ((GoogleApiAvailabilityCache)localObject1).getClientAvailability(zaak.zaa(this.zagi), (Api.Client)localObject3);
        i = k;
      } while (k != 0);
      i = k;
    }
    else
    {
      localObject2 = (ArrayList)localObject2;
      m = ((ArrayList)localObject2).size();
      j = k;
      while (j < m)
      {
        localObject3 = ((ArrayList)localObject2).get(j);
        j += 1;
        localObject3 = (Api.Client)localObject3;
        k = ((GoogleApiAvailabilityCache)localObject1).getClientAvailability(zaak.zaa(this.zagi), (Api.Client)localObject3);
        i = k;
        if (k != 0) {
          i = k;
        }
      }
    }
    if (i != 0)
    {
      localObject1 = new ConnectionResult(i, null);
      zaak.zad(this.zagi).zaa(new zaao(this, this.zagi, (ConnectionResult)localObject1));
      return;
    }
    if (zaak.zae(this.zagi)) {
      zaak.zaf(this.zagi).connect();
    }
    localObject2 = this.zagk.keySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Api.Client)((Iterator)localObject2).next();
      localObject4 = (BaseGmsClient.ConnectionProgressReportCallbacks)this.zagk.get(localObject3);
      if ((((Api.Client)localObject3).requiresGooglePlayServices()) && (((GoogleApiAvailabilityCache)localObject1).getClientAvailability(zaak.zaa(this.zagi), (Api.Client)localObject3) != 0)) {
        zaak.zad(this.zagi).zaa(new zaap(this, this.zagi, (BaseGmsClient.ConnectionProgressReportCallbacks)localObject4));
      } else {
        ((Api.Client)localObject3).connect((BaseGmsClient.ConnectionProgressReportCallbacks)localObject4);
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */