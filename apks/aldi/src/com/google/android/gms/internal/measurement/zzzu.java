package com.google.android.gms.internal.measurement;

final class zzzu
  implements zzaap
{
  private static final zzzu zzbue = new zzzu();
  
  public static zzzu zzua()
  {
    return zzbue;
  }
  
  public final boolean zzd(Class<?> paramClass)
  {
    return zzzv.class.isAssignableFrom(paramClass);
  }
  
  public final zzaao zze(Class<?> paramClass)
  {
    if (!zzzv.class.isAssignableFrom(paramClass))
    {
      paramClass = String.valueOf(paramClass.getName());
      if (paramClass.length() != 0) {
        paramClass = "Unsupported message type: ".concat(paramClass);
      } else {
        paramClass = new String("Unsupported message type: ");
      }
      throw new IllegalArgumentException(paramClass);
    }
    try
    {
      zzaao localzzaao = (zzaao)zzzv.zzf(paramClass.asSubclass(zzzv.class)).zza(3, null, null);
      return localzzaao;
    }
    catch (Exception localException)
    {
      paramClass = String.valueOf(paramClass.getName());
      if (paramClass.length() != 0) {
        paramClass = "Unable to get message info for ".concat(paramClass);
      } else {
        paramClass = new String("Unable to get message info for ");
      }
      throw new RuntimeException(paramClass, localException);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzzu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */