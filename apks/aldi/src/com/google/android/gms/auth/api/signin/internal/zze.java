package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class zze
  extends AsyncTaskLoader<Void>
  implements SignInConnectionListener
{
  private Semaphore zzbg = new Semaphore(0);
  private Set<GoogleApiClient> zzbh;
  
  public zze(Context paramContext, Set<GoogleApiClient> paramSet)
  {
    super(paramContext);
    this.zzbh = paramSet;
  }
  
  private final Void zzf()
  {
    Iterator localIterator = this.zzbh.iterator();
    int i = 0;
    while (localIterator.hasNext()) {
      if (((GoogleApiClient)localIterator.next()).maybeSignIn(this)) {
        i += 1;
      }
    }
    try
    {
      this.zzbg.tryAcquire(i, 5L, TimeUnit.SECONDS);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    Thread.currentThread().interrupt();
    return null;
  }
  
  public final void onComplete()
  {
    this.zzbg.release();
  }
  
  public final void onStartLoading()
  {
    this.zzbg.drainPermits();
    forceLoad();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */