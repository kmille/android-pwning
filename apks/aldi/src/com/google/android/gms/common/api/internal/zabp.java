package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;

public final class zabp<O extends Api.ApiOptions>
  extends zaag
{
  private final GoogleApi<O> zajg;
  
  public zabp(GoogleApi<O> paramGoogleApi)
  {
    super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    this.zajg = paramGoogleApi;
  }
  
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T paramT)
  {
    return this.zajg.doRead(paramT);
  }
  
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T paramT)
  {
    return this.zajg.doWrite(paramT);
  }
  
  public final Context getContext()
  {
    return this.zajg.getApplicationContext();
  }
  
  public final Looper getLooper()
  {
    return this.zajg.getLooper();
  }
  
  public final void zaa(zacm paramzacm) {}
  
  public final void zab(zacm paramzacm) {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zabp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */