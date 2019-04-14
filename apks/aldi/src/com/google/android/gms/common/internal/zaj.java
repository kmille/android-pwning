package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

final class zaj
  implements PendingResult.StatusListener
{
  zaj(PendingResult paramPendingResult, TaskCompletionSource paramTaskCompletionSource, PendingResultUtil.ResultConverter paramResultConverter, PendingResultUtil.zaa paramzaa) {}
  
  public final void onComplete(Status paramStatus)
  {
    if (paramStatus.isSuccess())
    {
      paramStatus = this.zaou.await(0L, TimeUnit.MILLISECONDS);
      this.zaov.setResult(this.zaow.convert(paramStatus));
      return;
    }
    this.zaov.setException(this.zaox.zaf(paramStatus));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/zaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */