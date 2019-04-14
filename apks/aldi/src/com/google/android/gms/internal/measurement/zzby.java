package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzby
  extends zzar
{
  @VisibleForTesting
  zzby(zzat paramzzat)
  {
    super(paramzzat);
  }
  
  protected final void zzac() {}
  
  public final zzz zzeg()
  {
    zzch();
    return zzbw().zzaa();
  }
  
  public final String zzeh()
  {
    zzch();
    Object localObject = zzeg();
    int i = ((zzz)localObject).zztv;
    int j = ((zzz)localObject).zztw;
    localObject = new StringBuilder(23);
    ((StringBuilder)localObject).append(i);
    ((StringBuilder)localObject).append("x");
    ((StringBuilder)localObject).append(j);
    return ((StringBuilder)localObject).toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */