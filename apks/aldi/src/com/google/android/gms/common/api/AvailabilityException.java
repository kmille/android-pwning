package com.google.android.gms.common.api;

import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AvailabilityException
  extends Exception
{
  private final ArrayMap<zai<?>, ConnectionResult> zaay;
  
  public AvailabilityException(ArrayMap<zai<?>, ConnectionResult> paramArrayMap)
  {
    this.zaay = paramArrayMap;
  }
  
  public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> paramGoogleApi)
  {
    paramGoogleApi = paramGoogleApi.zak();
    boolean bool;
    if (this.zaay.get(paramGoogleApi) != null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "The given API was not part of the availability request.");
    return (ConnectionResult)this.zaay.get(paramGoogleApi);
  }
  
  public String getMessage()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = this.zaay.keySet().iterator();
    int i = 1;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zai)((Iterator)localObject1).next();
      Object localObject3 = (ConnectionResult)this.zaay.get(localObject2);
      if (((ConnectionResult)localObject3).isSuccess()) {
        i = 0;
      }
      localObject2 = ((zai)localObject2).zan();
      localObject3 = String.valueOf(localObject3);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject2).length() + 2 + String.valueOf(localObject3).length());
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append(": ");
      localStringBuilder.append((String)localObject3);
      localArrayList.add(localStringBuilder.toString());
    }
    Object localObject2 = new StringBuilder();
    if (i != 0) {}
    for (localObject1 = "None of the queried APIs are available. ";; localObject1 = "Some of the queried APIs are unavailable. ")
    {
      ((StringBuilder)localObject2).append((String)localObject1);
      break;
    }
    ((StringBuilder)localObject2).append(TextUtils.join("; ", localArrayList));
    return ((StringBuilder)localObject2).toString();
  }
  
  public final ArrayMap<zai<?>, ConnectionResult> zaj()
  {
    return this.zaay;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/AvailabilityException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */