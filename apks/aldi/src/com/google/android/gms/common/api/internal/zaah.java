package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zaah
  implements zabd
{
  private final zabe zafs;
  private boolean zaft = false;
  
  public zaah(zabe paramzabe)
  {
    this.zafs = paramzabe;
  }
  
  public final void begin() {}
  
  public final void connect()
  {
    if (this.zaft)
    {
      this.zaft = false;
      this.zafs.zaa(new zaaj(this, this));
    }
  }
  
  public final boolean disconnect()
  {
    if (this.zaft) {
      return false;
    }
    if (this.zafs.zaed.zaax())
    {
      this.zaft = true;
      Iterator localIterator = this.zafs.zaed.zahd.iterator();
      while (localIterator.hasNext()) {
        ((zacm)localIterator.next()).zabv();
      }
      return false;
    }
    this.zafs.zaf(null);
    return true;
  }
  
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T paramT)
  {
    return execute(paramT);
  }
  
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T paramT)
  {
    try
    {
      this.zafs.zaed.zahe.zab(paramT);
      Object localObject1 = this.zafs.zaed;
      Object localObject2 = paramT.getClientKey();
      localObject2 = (Api.Client)((zaaw)localObject1).zagy.get(localObject2);
      Preconditions.checkNotNull(localObject2, "Appropriate Api was not requested.");
      if ((!((Api.Client)localObject2).isConnected()) && (this.zafs.zaho.containsKey(paramT.getClientKey())))
      {
        paramT.setFailedResult(new Status(17));
        return paramT;
      }
      localObject1 = localObject2;
      if ((localObject2 instanceof SimpleClientAdapter)) {
        localObject1 = ((SimpleClientAdapter)localObject2).getClient();
      }
      paramT.run((Api.AnyClient)localObject1);
      return paramT;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      for (;;) {}
    }
    this.zafs.zaa(new zaai(this, this));
    return paramT;
  }
  
  public final void onConnected(Bundle paramBundle) {}
  
  public final void onConnectionSuspended(int paramInt)
  {
    this.zafs.zaf(null);
    this.zafs.zahs.zab(paramInt, this.zaft);
  }
  
  public final void zaa(ConnectionResult paramConnectionResult, Api<?> paramApi, boolean paramBoolean) {}
  
  final void zaam()
  {
    if (this.zaft)
    {
      this.zaft = false;
      this.zafs.zaed.zahe.release();
      disconnect();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */