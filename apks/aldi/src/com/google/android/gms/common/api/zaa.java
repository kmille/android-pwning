package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

final class zaa
  implements PendingResult.StatusListener
{
  zaa(Batch paramBatch) {}
  
  public final void onComplete(Status paramStatus)
  {
    synchronized (Batch.zaa(this.zabd))
    {
      if (this.zabd.isCanceled()) {
        return;
      }
      if (paramStatus.isCanceled()) {
        Batch.zaa(this.zabd, true);
      } else if (!paramStatus.isSuccess()) {
        Batch.zab(this.zabd, true);
      }
      Batch.zab(this.zabd);
      if (Batch.zac(this.zabd) == 0) {
        if (Batch.zad(this.zabd))
        {
          Batch.zae(this.zabd);
        }
        else
        {
          if (Batch.zaf(this.zabd)) {
            paramStatus = new Status(13);
          } else {
            paramStatus = Status.RESULT_SUCCESS;
          }
          this.zabd.setResult(new BatchResult(paramStatus, Batch.zag(this.zabd)));
        }
      }
      return;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/zaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */