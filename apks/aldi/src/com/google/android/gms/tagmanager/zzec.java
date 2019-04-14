package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class zzec
  implements zzfw
{
  zzec(zzeb paramzzeb) {}
  
  public final void zza(zzbw paramzzbw)
  {
    zzeb.zza(this.zzbbs, paramzzbw.zznu());
  }
  
  public final void zzb(zzbw paramzzbw)
  {
    zzeb.zza(this.zzbbs, paramzzbw.zznu());
    long l = paramzzbw.zznu();
    paramzzbw = new StringBuilder(57);
    paramzzbw.append("Permanent failure dispatching hitId: ");
    paramzzbw.append(l);
    zzdi.v(paramzzbw.toString());
  }
  
  public final void zzc(zzbw paramzzbw)
  {
    long l = paramzzbw.zznv();
    if (l == 0L)
    {
      zzeb.zza(this.zzbbs, paramzzbw.zznu(), zzeb.zza(this.zzbbs).currentTimeMillis());
      return;
    }
    if (l + 14400000L < zzeb.zza(this.zzbbs).currentTimeMillis())
    {
      zzeb.zza(this.zzbbs, paramzzbw.zznu());
      l = paramzzbw.zznu();
      paramzzbw = new StringBuilder(47);
      paramzzbw.append("Giving up on failed hitId: ");
      paramzzbw.append(l);
      zzdi.v(paramzzbw.toString());
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */