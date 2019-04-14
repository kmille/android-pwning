package com.google.android.gms.dynamite;

import android.content.Context;

final class zzb
  implements DynamiteModule.VersionPolicy
{
  public final DynamiteModule.VersionPolicy.zzb zza(Context paramContext, String paramString, DynamiteModule.VersionPolicy.zza paramzza)
    throws DynamiteModule.LoadingException
  {
    DynamiteModule.VersionPolicy.zzb localzzb = new DynamiteModule.VersionPolicy.zzb();
    localzzb.zzir = paramzza.zza(paramContext, paramString, true);
    if (localzzb.zzir != 0)
    {
      localzzb.zzis = 1;
      return localzzb;
    }
    localzzb.zziq = paramzza.getLocalVersion(paramContext, paramString);
    if (localzzb.zziq != 0) {
      localzzb.zzis = -1;
    }
    return localzzb;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/dynamite/zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */