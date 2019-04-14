package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public final class zae<A extends BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient>>
  extends zab
{
  private final A zacn;
  
  public zae(int paramInt, A paramA)
  {
    super(paramInt);
    this.zacn = paramA;
  }
  
  public final void zaa(@NonNull Status paramStatus)
  {
    this.zacn.setFailedResult(paramStatus);
  }
  
  public final void zaa(GoogleApiManager.zaa<?> paramzaa)
    throws DeadObjectException
  {
    try
    {
      this.zacn.run(paramzaa.zaab());
      return;
    }
    catch (RuntimeException paramzaa)
    {
      zaa(paramzaa);
    }
  }
  
  public final void zaa(@NonNull zaab paramzaab, boolean paramBoolean)
  {
    paramzaab.zaa(this.zacn, paramBoolean);
  }
  
  public final void zaa(@NonNull RuntimeException paramRuntimeException)
  {
    String str = paramRuntimeException.getClass().getSimpleName();
    paramRuntimeException = paramRuntimeException.getLocalizedMessage();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(paramRuntimeException).length());
    localStringBuilder.append(str);
    localStringBuilder.append(": ");
    localStringBuilder.append(paramRuntimeException);
    paramRuntimeException = new Status(10, localStringBuilder.toString());
    this.zacn.setFailedResult(paramRuntimeException);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */