package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;

final class zzaai
  implements zzabb
{
  private static final zzaap zzbvl = new zzaaj();
  private final zzaap zzbvk;
  
  public zzaai()
  {
    this(new zzaak(new zzaap[] { zzzu.zzua(), zzuh() }));
  }
  
  private zzaai(zzaap paramzzaap)
  {
    this.zzbvk = ((zzaap)zzzw.zza(paramzzaap, "messageInfoFactory"));
  }
  
  private static boolean zza(zzaao paramzzaao)
  {
    return paramzzaao.zzul() == zzzv.zzb.zzbur;
  }
  
  private static zzaap zzuh()
  {
    try
    {
      zzaap localzzaap = (zzaap)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
      return localzzaap;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return zzbvl;
  }
  
  public final <T> zzaba<T> zzg(Class<T> paramClass)
  {
    zzabc.zzh(paramClass);
    zzaao localzzaao = this.zzbvk.zze(paramClass);
    if (localzzaao.zzum())
    {
      if (zzzv.class.isAssignableFrom(paramClass)) {
        return zzaau.zza(zzabc.zzuv(), zzzq.zztv(), localzzaao.zzun());
      }
      return zzaau.zza(zzabc.zzut(), zzzq.zztw(), localzzaao.zzun());
    }
    if (zzzv.class.isAssignableFrom(paramClass))
    {
      if (zza(localzzaao)) {
        return zzaat.zza(paramClass, localzzaao, zzaax.zzuq(), zzaae.zzug(), zzabc.zzuv(), zzzq.zztv(), zzaan.zzuj());
      }
      return zzaat.zza(paramClass, localzzaao, zzaax.zzuq(), zzaae.zzug(), zzabc.zzuv(), null, zzaan.zzuj());
    }
    if (zza(localzzaao)) {
      return zzaat.zza(paramClass, localzzaao, zzaax.zzup(), zzaae.zzuf(), zzabc.zzut(), zzzq.zztw(), zzaan.zzui());
    }
    return zzaat.zza(paramClass, localzzaao, zzaax.zzup(), zzaae.zzuf(), zzabc.zzuu(), null, zzaan.zzui());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzaai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */