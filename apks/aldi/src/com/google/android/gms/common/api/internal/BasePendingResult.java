package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
@KeepName
public abstract class BasePendingResult<R extends Result>
  extends PendingResult<R>
{
  static final ThreadLocal<Boolean> zadm = new zap();
  @KeepName
  private zaa mResultGuardian;
  private Status mStatus;
  private R zaci;
  private final Object zadn = new Object();
  private final CallbackHandler<R> zado;
  private final WeakReference<GoogleApiClient> zadp;
  private final CountDownLatch zadq = new CountDownLatch(1);
  private final ArrayList<PendingResult.StatusListener> zadr = new ArrayList();
  private ResultCallback<? super R> zads;
  private final AtomicReference<zacs> zadt = new AtomicReference();
  private volatile boolean zadu;
  private boolean zadv;
  private boolean zadw;
  private ICancelToken zadx;
  private volatile zacm<R> zady;
  private boolean zadz = false;
  
  @Deprecated
  BasePendingResult()
  {
    this.zado = new CallbackHandler(Looper.getMainLooper());
    this.zadp = new WeakReference(null);
  }
  
  @Deprecated
  @KeepForSdk
  protected BasePendingResult(Looper paramLooper)
  {
    this.zado = new CallbackHandler(paramLooper);
    this.zadp = new WeakReference(null);
  }
  
  @KeepForSdk
  protected BasePendingResult(GoogleApiClient paramGoogleApiClient)
  {
    Looper localLooper;
    if (paramGoogleApiClient != null) {
      localLooper = paramGoogleApiClient.getLooper();
    } else {
      localLooper = Looper.getMainLooper();
    }
    this.zado = new CallbackHandler(localLooper);
    this.zadp = new WeakReference(paramGoogleApiClient);
  }
  
  @KeepForSdk
  @VisibleForTesting
  protected BasePendingResult(@NonNull CallbackHandler<R> paramCallbackHandler)
  {
    this.zado = ((CallbackHandler)Preconditions.checkNotNull(paramCallbackHandler, "CallbackHandler must not be null"));
    this.zadp = new WeakReference(null);
  }
  
  private final R get()
  {
    synchronized (this.zadn)
    {
      Preconditions.checkState(this.zadu ^ true, "Result has already been consumed.");
      Preconditions.checkState(isReady(), "Result is not ready.");
      Result localResult = this.zaci;
      this.zaci = null;
      this.zads = null;
      this.zadu = true;
      ??? = (zacs)this.zadt.getAndSet(null);
      if (??? != null) {
        ((zacs)???).zac(this);
      }
      return localResult;
    }
  }
  
  private final void zaa(R paramR)
  {
    this.zaci = paramR;
    this.zadx = null;
    this.zadq.countDown();
    this.mStatus = this.zaci.getStatus();
    if (this.zadv)
    {
      this.zads = null;
    }
    else if (this.zads == null)
    {
      if ((this.zaci instanceof Releasable)) {
        this.mResultGuardian = new zaa(null);
      }
    }
    else
    {
      this.zado.removeMessages(2);
      this.zado.zaa(this.zads, get());
    }
    paramR = (ArrayList)this.zadr;
    int j = paramR.size();
    int i = 0;
    while (i < j)
    {
      Object localObject = paramR.get(i);
      i += 1;
      ((PendingResult.StatusListener)localObject).onComplete(this.mStatus);
    }
    this.zadr.clear();
  }
  
  public static void zab(Result paramResult)
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
  
  public final void addStatusListener(PendingResult.StatusListener paramStatusListener)
  {
    boolean bool;
    if (paramStatusListener != null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "Callback cannot be null.");
    synchronized (this.zadn)
    {
      if (isReady()) {
        paramStatusListener.onComplete(this.mStatus);
      } else {
        this.zadr.add(paramStatusListener);
      }
      return;
    }
  }
  
  public final R await()
  {
    Preconditions.checkNotMainThread("await must not be called on the UI thread");
    boolean bool2 = this.zadu;
    boolean bool1 = true;
    Preconditions.checkState(bool2 ^ true, "Result has already been consumed");
    if (this.zady != null) {
      bool1 = false;
    }
    Preconditions.checkState(bool1, "Cannot await if then() has been called.");
    try
    {
      this.zadq.await();
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    zab(Status.RESULT_INTERRUPTED);
    Preconditions.checkState(isReady(), "Result is not ready.");
    return get();
  }
  
  public final R await(long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramLong > 0L) {
      Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
    }
    boolean bool2 = this.zadu;
    boolean bool1 = true;
    Preconditions.checkState(bool2 ^ true, "Result has already been consumed.");
    if (this.zady != null) {
      bool1 = false;
    }
    Preconditions.checkState(bool1, "Cannot await if then() has been called.");
    try
    {
      if (this.zadq.await(paramLong, paramTimeUnit)) {
        break label80;
      }
      zab(Status.RESULT_TIMEOUT);
    }
    catch (InterruptedException paramTimeUnit)
    {
      for (;;) {}
    }
    zab(Status.RESULT_INTERRUPTED);
    label80:
    Preconditions.checkState(isReady(), "Result is not ready.");
    return get();
  }
  
  @KeepForSdk
  public void cancel()
  {
    synchronized (this.zadn)
    {
      if ((!this.zadv) && (!this.zadu))
      {
        ICancelToken localICancelToken = this.zadx;
        if (localICancelToken == null) {}
      }
    }
    try
    {
      this.zadx.cancel();
      zab(this.zaci);
      this.zadv = true;
      zaa(createFailedResult(Status.RESULT_CANCELED));
      return;
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  @NonNull
  @KeepForSdk
  protected abstract R createFailedResult(Status paramStatus);
  
  public boolean isCanceled()
  {
    synchronized (this.zadn)
    {
      boolean bool = this.zadv;
      return bool;
    }
  }
  
  @KeepForSdk
  public final boolean isReady()
  {
    return this.zadq.getCount() == 0L;
  }
  
  @KeepForSdk
  protected final void setCancelToken(ICancelToken paramICancelToken)
  {
    synchronized (this.zadn)
    {
      this.zadx = paramICancelToken;
      return;
    }
  }
  
  @KeepForSdk
  public final void setResult(R paramR)
  {
    synchronized (this.zadn)
    {
      if ((!this.zadw) && (!this.zadv))
      {
        isReady();
        Preconditions.checkState(isReady() ^ true, "Results have already been set");
        Preconditions.checkState(this.zadu ^ true, "Result has already been consumed");
        zaa(paramR);
        return;
      }
      zab(paramR);
      return;
    }
  }
  
  @KeepForSdk
  public final void setResultCallback(ResultCallback<? super R> paramResultCallback)
  {
    Object localObject = this.zadn;
    if (paramResultCallback == null) {}
    try
    {
      this.zads = null;
      return;
    }
    finally
    {
      for (;;)
      {
        boolean bool2;
        continue;
        boolean bool1 = false;
      }
    }
    bool2 = this.zadu;
    bool1 = true;
    Preconditions.checkState(bool2 ^ true, "Result has already been consumed.");
    if (this.zady == null)
    {
      Preconditions.checkState(bool1, "Cannot set callbacks if then() has been called.");
      if (isCanceled()) {
        return;
      }
      if (isReady()) {
        this.zado.zaa(paramResultCallback, get());
      } else {
        this.zads = paramResultCallback;
      }
      return;
      throw paramResultCallback;
    }
  }
  
  @KeepForSdk
  public final void setResultCallback(ResultCallback<? super R> paramResultCallback, long paramLong, TimeUnit paramTimeUnit)
  {
    Object localObject = this.zadn;
    if (paramResultCallback == null) {}
    try
    {
      this.zads = null;
      return;
    }
    finally
    {
      for (;;)
      {
        boolean bool2;
        continue;
        boolean bool1 = false;
      }
    }
    bool2 = this.zadu;
    bool1 = true;
    Preconditions.checkState(bool2 ^ true, "Result has already been consumed.");
    if (this.zady == null)
    {
      Preconditions.checkState(bool1, "Cannot set callbacks if then() has been called.");
      if (isCanceled()) {
        return;
      }
      if (isReady())
      {
        this.zado.zaa(paramResultCallback, get());
      }
      else
      {
        this.zads = paramResultCallback;
        paramResultCallback = this.zado;
        paramLong = paramTimeUnit.toMillis(paramLong);
        paramResultCallback.sendMessageDelayed(paramResultCallback.obtainMessage(2, this), paramLong);
      }
      return;
      throw paramResultCallback;
    }
  }
  
  public <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> paramResultTransform)
  {
    Preconditions.checkState(this.zadu ^ true, "Result has already been consumed.");
    for (;;)
    {
      synchronized (this.zadn)
      {
        zacm localzacm = this.zady;
        boolean bool2 = false;
        if (localzacm == null)
        {
          bool1 = true;
          Preconditions.checkState(bool1, "Cannot call then() twice.");
          bool1 = bool2;
          if (this.zads == null) {
            bool1 = true;
          }
          Preconditions.checkState(bool1, "Cannot call then() if callbacks are set.");
          Preconditions.checkState(this.zadv ^ true, "Cannot call then() if result was canceled.");
          this.zadz = true;
          this.zady = new zacm(this.zadp);
          paramResultTransform = this.zady.then(paramResultTransform);
          if (isReady()) {
            this.zado.zaa(this.zady, get());
          } else {
            this.zads = this.zady;
          }
          return paramResultTransform;
        }
      }
      boolean bool1 = false;
    }
  }
  
  public final void zaa(zacs paramzacs)
  {
    this.zadt.set(paramzacs);
  }
  
  public final void zab(Status paramStatus)
  {
    synchronized (this.zadn)
    {
      if (!isReady())
      {
        setResult(createFailedResult(paramStatus));
        this.zadw = true;
      }
      return;
    }
  }
  
  public final Integer zam()
  {
    return null;
  }
  
  public final boolean zat()
  {
    synchronized (this.zadn)
    {
      if (((GoogleApiClient)this.zadp.get() == null) || (!this.zadz)) {
        cancel();
      }
      boolean bool = isCanceled();
      return bool;
    }
  }
  
  public final void zau()
  {
    boolean bool;
    if ((!this.zadz) && (!((Boolean)zadm.get()).booleanValue())) {
      bool = false;
    } else {
      bool = true;
    }
    this.zadz = bool;
  }
  
  @VisibleForTesting
  public static class CallbackHandler<R extends Result>
    extends zal
  {
    public CallbackHandler()
    {
      this(Looper.getMainLooper());
    }
    
    public CallbackHandler(Looper paramLooper)
    {
      super();
    }
    
    public void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default: 
        int i = paramMessage.what;
        paramMessage = new StringBuilder(45);
        paramMessage.append("Don't know how to handle message: ");
        paramMessage.append(i);
        Log.wtf("BasePendingResult", paramMessage.toString(), new Exception());
        return;
      case 2: 
        ((BasePendingResult)paramMessage.obj).zab(Status.RESULT_TIMEOUT);
        return;
      }
      Object localObject = (Pair)paramMessage.obj;
      paramMessage = (ResultCallback)((Pair)localObject).first;
      localObject = (Result)((Pair)localObject).second;
      try
      {
        paramMessage.onResult((Result)localObject);
        return;
      }
      catch (RuntimeException paramMessage)
      {
        BasePendingResult.zab((Result)localObject);
        throw paramMessage;
      }
    }
    
    public final void zaa(ResultCallback<? super R> paramResultCallback, R paramR)
    {
      sendMessage(obtainMessage(1, new Pair(paramResultCallback, paramR)));
    }
  }
  
  final class zaa
  {
    private zaa() {}
    
    protected final void finalize()
      throws Throwable
    {
      BasePendingResult.zab(BasePendingResult.zaa(BasePendingResult.this));
      super.finalize();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/BasePendingResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */