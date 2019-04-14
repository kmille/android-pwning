package com.google.android.gms.internal.gcm;

import java.util.List;

final class zzj
  extends zzg
{
  private final zzh zzdi = new zzh();
  
  public final void zzd(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    if (paramThrowable2 != paramThrowable1)
    {
      if (paramThrowable2 != null)
      {
        this.zzdi.zzd(paramThrowable1, true).add(paramThrowable2);
        return;
      }
      throw new NullPointerException("The suppressed exception cannot be null.");
    }
    throw new IllegalArgumentException("Self suppression is not allowed.", paramThrowable2);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/gcm/zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */