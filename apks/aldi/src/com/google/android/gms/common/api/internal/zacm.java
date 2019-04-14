package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import javax.annotation.concurrent.GuardedBy;

public final class zacm<R extends Result>
  extends TransformedResult<R>
  implements ResultCallback<R>
{
  private final Object zadn = new Object();
  private final WeakReference<GoogleApiClient> zadp;
  private ResultTransform<? super R, ? extends Result> zakn = null;
  private zacm<? extends Result> zako = null;
  private volatile ResultCallbacks<? super R> zakp = null;
  private PendingResult<R> zakq = null;
  private Status zakr = null;
  private final zaco zaks;
  private boolean zakt = false;
  
  public zacm(WeakReference<GoogleApiClient> paramWeakReference)
  {
    Preconditions.checkNotNull(paramWeakReference, "GoogleApiClient reference must not be null");
    this.zadp = paramWeakReference;
    paramWeakReference = (GoogleApiClient)this.zadp.get();
    if (paramWeakReference != null) {
      paramWeakReference = paramWeakReference.getLooper();
    } else {
      paramWeakReference = Looper.getMainLooper();
    }
    this.zaks = new zaco(this, paramWeakReference);
  }
  
  private static void zab(Result paramResult)
  {
    if ((paramResult instanceof Releasable)) {}
    try
    {
      ((Releasable)paramResult).release();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      StringBuilder localStringBuilder;
      for (;;) {}
    }
    paramResult = String.valueOf(paramResult);
    localStringBuilder = new StringBuilder(String.valueOf(paramResult).length() + 18);
    localStringBuilder.append("Unable to release ");
    localStringBuilder.append(paramResult);
  }
  
  @GuardedBy("mSyncToken")
  private final void zabu()
  {
    if ((this.zakn == null) && (this.zakp == null)) {
      return;
    }
    GoogleApiClient localGoogleApiClient = (GoogleApiClient)this.zadp.get();
    if ((!this.zakt) && (this.zakn != null) && (localGoogleApiClient != null))
    {
      localGoogleApiClient.zaa(this);
      this.zakt = true;
    }
    if (this.zakr != null)
    {
      zae(this.zakr);
      return;
    }
    if (this.zakq != null) {
      this.zakq.setResultCallback(this);
    }
  }
  
  @GuardedBy("mSyncToken")
  private final boolean zabw()
  {
    GoogleApiClient localGoogleApiClient = (GoogleApiClient)this.zadp.get();
    return (this.zakp != null) && (localGoogleApiClient != null);
  }
  
  private final void zad(Status paramStatus)
  {
    synchronized (this.zadn)
    {
      this.zakr = paramStatus;
      zae(this.zakr);
      return;
    }
  }
  
  private final void zae(Status paramStatus)
  {
    synchronized (this.zadn)
    {
      if (this.zakn != null)
      {
        paramStatus = this.zakn.onFailure(paramStatus);
        Preconditions.checkNotNull(paramStatus, "onFailure must not return null");
        this.zako.zad(paramStatus);
      }
      else if (zabw())
      {
        this.zakp.onFailure(paramStatus);
      }
      return;
    }
  }
  
  public final void andFinally(@NonNull ResultCallbacks<? super R> paramResultCallbacks)
  {
    for (;;)
    {
      synchronized (this.zadn)
      {
        ResultCallbacks localResultCallbacks = this.zakp;
        boolean bool2 = false;
        if (localResultCallbacks == null)
        {
          bool1 = true;
          Preconditions.checkState(bool1, "Cannot call andFinally() twice.");
          bool1 = bool2;
          if (this.zakn == null) {
            bool1 = true;
          }
          Preconditions.checkState(bool1, "Cannot call then() and andFinally() on the same TransformedResult.");
          this.zakp = paramResultCallbacks;
          zabu();
          return;
        }
      }
      boolean bool1 = false;
    }
  }
  
  public final void onResult(R paramR)
  {
    synchronized (this.zadn)
    {
      if (paramR.getStatus().isSuccess())
      {
        if (this.zakn != null) {
          zacc.zabb().submit(new zacn(this, paramR));
        } else if (zabw()) {
          this.zakp.onSuccess(paramR);
        }
      }
      else
      {
        zad(paramR.getStatus());
        zab(paramR);
      }
      return;
    }
  }
  
  @NonNull
  public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> paramResultTransform)
  {
    for (;;)
    {
      synchronized (this.zadn)
      {
        ResultTransform localResultTransform = this.zakn;
        boolean bool2 = false;
        if (localResultTransform == null)
        {
          bool1 = true;
          Preconditions.checkState(bool1, "Cannot call then() twice.");
          bool1 = bool2;
          if (this.zakp == null) {
            bool1 = true;
          }
          Preconditions.checkState(bool1, "Cannot call then() and andFinally() on the same TransformedResult.");
          this.zakn = paramResultTransform;
          paramResultTransform = new zacm(this.zadp);
          this.zako = paramResultTransform;
          zabu();
          return paramResultTransform;
        }
      }
      boolean bool1 = false;
    }
  }
  
  public final void zaa(PendingResult<?> paramPendingResult)
  {
    synchronized (this.zadn)
    {
      this.zakq = paramPendingResult;
      zabu();
      return;
    }
  }
  
  final void zabv()
  {
    this.zakp = null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zacm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */