package com.google.android.gms.internal.measurement;

final class zzcf
  implements zzbt<zzcg>
{
  private final zzcg zzaac;
  private final zzat zzvm;
  
  public zzcf(zzat paramzzat)
  {
    this.zzvm = paramzzat;
    this.zzaac = new zzcg();
  }
  
  public final void zza(String paramString, boolean paramBoolean)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void zzb(String paramString, int paramInt)
  {
    if ("ga_dispatchPeriod".equals(paramString))
    {
      this.zzaac.zzaag = paramInt;
      return;
    }
    this.zzvm.zzbu().zzd("Int xml configuration name not recognized", paramString);
  }
  
  public final void zzb(String paramString1, String paramString2) {}
  
  public final void zzc(String paramString1, String paramString2)
  {
    if ("ga_appName".equals(paramString1))
    {
      this.zzaac.zzaad = paramString2;
      return;
    }
    if ("ga_appVersion".equals(paramString1))
    {
      this.zzaac.zzaae = paramString2;
      return;
    }
    if ("ga_logLevel".equals(paramString1))
    {
      this.zzaac.zzaaf = paramString2;
      return;
    }
    this.zzvm.zzbu().zzd("String xml configuration name not recognized", paramString1);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzcf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */