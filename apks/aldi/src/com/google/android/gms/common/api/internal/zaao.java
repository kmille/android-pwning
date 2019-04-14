package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

final class zaao
  extends zabf
{
  zaao(zaan paramzaan, zabd paramzabd, ConnectionResult paramConnectionResult)
  {
    super(paramzabd);
  }
  
  @GuardedBy("mLock")
  public final void zaan()
  {
    zaak.zaa(this.zagm.zagi, this.zagl);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */