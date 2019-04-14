package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public final class PendingResults
{
  public static PendingResult<Status> canceledPendingResult()
  {
    StatusPendingResult localStatusPendingResult = new StatusPendingResult(Looper.getMainLooper());
    localStatusPendingResult.cancel();
    return localStatusPendingResult;
  }
  
  public static <R extends Result> PendingResult<R> canceledPendingResult(R paramR)
  {
    Preconditions.checkNotNull(paramR, "Result must not be null");
    boolean bool;
    if (paramR.getStatus().getStatusCode() == 16) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "Status code must be CommonStatusCodes.CANCELED");
    paramR = new zaa(paramR);
    paramR.cancel();
    return paramR;
  }
  
  @KeepForSdk
  public static <R extends Result> PendingResult<R> immediateFailedResult(R paramR, GoogleApiClient paramGoogleApiClient)
  {
    Preconditions.checkNotNull(paramR, "Result must not be null");
    Preconditions.checkArgument(paramR.getStatus().isSuccess() ^ true, "Status code must not be SUCCESS");
    paramGoogleApiClient = new zab(paramGoogleApiClient, paramR);
    paramGoogleApiClient.setResult(paramR);
    return paramGoogleApiClient;
  }
  
  @KeepForSdk
  public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R paramR)
  {
    Preconditions.checkNotNull(paramR, "Result must not be null");
    zac localzac = new zac(null);
    localzac.setResult(paramR);
    return new OptionalPendingResultImpl(localzac);
  }
  
  @KeepForSdk
  public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R paramR, GoogleApiClient paramGoogleApiClient)
  {
    Preconditions.checkNotNull(paramR, "Result must not be null");
    paramGoogleApiClient = new zac(paramGoogleApiClient);
    paramGoogleApiClient.setResult(paramR);
    return new OptionalPendingResultImpl(paramGoogleApiClient);
  }
  
  @KeepForSdk
  public static PendingResult<Status> immediatePendingResult(Status paramStatus)
  {
    Preconditions.checkNotNull(paramStatus, "Result must not be null");
    StatusPendingResult localStatusPendingResult = new StatusPendingResult(Looper.getMainLooper());
    localStatusPendingResult.setResult(paramStatus);
    return localStatusPendingResult;
  }
  
  @KeepForSdk
  public static PendingResult<Status> immediatePendingResult(Status paramStatus, GoogleApiClient paramGoogleApiClient)
  {
    Preconditions.checkNotNull(paramStatus, "Result must not be null");
    paramGoogleApiClient = new StatusPendingResult(paramGoogleApiClient);
    paramGoogleApiClient.setResult(paramStatus);
    return paramGoogleApiClient;
  }
  
  static final class zaa<R extends Result>
    extends BasePendingResult<R>
  {
    private final R zach;
    
    public zaa(R paramR)
    {
      super();
      this.zach = paramR;
    }
    
    public final R createFailedResult(Status paramStatus)
    {
      if (paramStatus.getStatusCode() == this.zach.getStatus().getStatusCode()) {
        return this.zach;
      }
      throw new UnsupportedOperationException("Creating failed results is not supported");
    }
  }
  
  static final class zab<R extends Result>
    extends BasePendingResult<R>
  {
    private final R zaci;
    
    public zab(GoogleApiClient paramGoogleApiClient, R paramR)
    {
      super();
      this.zaci = paramR;
    }
    
    public final R createFailedResult(Status paramStatus)
    {
      return this.zaci;
    }
  }
  
  static final class zac<R extends Result>
    extends BasePendingResult<R>
  {
    public zac(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }
    
    public final R createFailedResult(Status paramStatus)
    {
      throw new UnsupportedOperationException("Creating failed results is not supported");
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/PendingResults.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */