package com.google.android.gms.internal.measurement;

final class zzaak
  implements zzaap
{
  private zzaap[] zzbvm;
  
  zzaak(zzaap... paramVarArgs)
  {
    this.zzbvm = paramVarArgs;
  }
  
  public final boolean zzd(Class<?> paramClass)
  {
    zzaap[] arrayOfzzaap = this.zzbvm;
    int j = arrayOfzzaap.length;
    int i = 0;
    while (i < j)
    {
      if (arrayOfzzaap[i].zzd(paramClass)) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  public final zzaao zze(Class<?> paramClass)
  {
    zzaap[] arrayOfzzaap = this.zzbvm;
    int j = arrayOfzzaap.length;
    int i = 0;
    while (i < j)
    {
      zzaap localzzaap = arrayOfzzaap[i];
      if (localzzaap.zzd(paramClass)) {
        return localzzaap.zze(paramClass);
      }
      i += 1;
    }
    paramClass = String.valueOf(paramClass.getName());
    if (paramClass.length() != 0) {
      paramClass = "No factory is available for message type: ".concat(paramClass);
    } else {
      paramClass = new String("No factory is available for message type: ");
    }
    throw new UnsupportedOperationException(paramClass);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzaak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */