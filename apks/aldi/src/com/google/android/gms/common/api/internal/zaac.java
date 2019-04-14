package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Status;
import java.util.Map;

final class zaac
  implements PendingResult.StatusListener
{
  zaac(zaab paramzaab, BasePendingResult paramBasePendingResult) {}
  
  public final void onComplete(Status paramStatus)
  {
    zaab.zaa(this.zafm).remove(this.zafl);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */