package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzbe
  extends zzar
{
  private final zzu zzse = new zzu();
  
  zzbe(zzat paramzzat)
  {
    super(paramzzat);
  }
  
  protected final void zzac()
  {
    zzbw().zzz().zza(this.zzse);
    Object localObject = zzca();
    String str = ((zzde)localObject).zzaf();
    if (str != null) {
      this.zzse.setAppName(str);
    }
    localObject = ((zzde)localObject).zzag();
    if (localObject != null) {
      this.zzse.setAppVersion((String)localObject);
    }
  }
  
  public final zzu zzdb()
  {
    zzch();
    return this.zzse;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzbe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */