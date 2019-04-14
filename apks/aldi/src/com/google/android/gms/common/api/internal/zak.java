package com.google.android.gms.common.api.internal;

import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zak
{
  private final ArrayMap<zai<?>, ConnectionResult> zaay = new ArrayMap();
  private final ArrayMap<zai<?>, String> zada = new ArrayMap();
  private final TaskCompletionSource<Map<zai<?>, String>> zadb = new TaskCompletionSource();
  private int zadc;
  private boolean zadd = false;
  
  public zak(Iterable<? extends GoogleApi<?>> paramIterable)
  {
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      GoogleApi localGoogleApi = (GoogleApi)paramIterable.next();
      this.zaay.put(localGoogleApi.zak(), null);
    }
    this.zadc = this.zaay.keySet().size();
  }
  
  public final Task<Map<zai<?>, String>> getTask()
  {
    return this.zadb.getTask();
  }
  
  public final void zaa(zai<?> paramzai, ConnectionResult paramConnectionResult, @Nullable String paramString)
  {
    this.zaay.put(paramzai, paramConnectionResult);
    this.zada.put(paramzai, paramString);
    this.zadc -= 1;
    if (!paramConnectionResult.isSuccess()) {
      this.zadd = true;
    }
    if (this.zadc == 0)
    {
      if (this.zadd)
      {
        paramzai = new AvailabilityException(this.zaay);
        this.zadb.setException(paramzai);
        return;
      }
      this.zadb.setResult(this.zada);
    }
  }
  
  public final Set<zai<?>> zap()
  {
    return this.zaay.keySet();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */