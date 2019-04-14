package com.google.android.gms.internal.auth;

public enum zzay
{
  private final String zzek;
  
  private zzay(String paramString)
  {
    this.zzek = paramString;
  }
  
  public static boolean zza(zzay paramzzay)
  {
    return (zzcr.equals(paramzzay)) || (zzda.equals(paramzzay)) || (zzdd.equals(paramzzay)) || (zzde.equals(paramzzay)) || (zzcv.equals(paramzzay)) || (zzdg.equals(paramzzay)) || (zzck.equals(paramzzay)) || (zzdl.equals(paramzzay)) || (zzdm.equals(paramzzay)) || (zzdn.equals(paramzzay)) || (zzdo.equals(paramzzay)) || (zzdp.equals(paramzzay)) || (zzdq.equals(paramzzay)) || (zzds.equals(paramzzay)) || (zzdk.equals(paramzzay)) || (zzdr.equals(paramzzay));
  }
  
  public static final zzay zzc(String paramString)
  {
    zzay[] arrayOfzzay = values();
    int j = arrayOfzzay.length;
    Object localObject = null;
    int i = 0;
    while (i < j)
    {
      zzay localzzay = arrayOfzzay[i];
      if (localzzay.zzek.equals(paramString)) {
        localObject = localzzay;
      }
      i += 1;
    }
    return (zzay)localObject;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */