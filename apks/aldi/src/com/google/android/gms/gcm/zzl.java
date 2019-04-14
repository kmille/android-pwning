package com.google.android.gms.gcm;

import android.os.Bundle;

public final class zzl
{
  public static final zzl zzao = new zzl(0, 30, 3600);
  private static final zzl zzap = new zzl(1, 30, 3600);
  private final int zzaq;
  private final int zzar;
  private final int zzas;
  
  private zzl(int paramInt1, int paramInt2, int paramInt3)
  {
    this.zzaq = paramInt1;
    this.zzar = 30;
    this.zzas = 3600;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzl)) {
      return false;
    }
    paramObject = (zzl)paramObject;
    return (((zzl)paramObject).zzaq == this.zzaq) && (((zzl)paramObject).zzar == this.zzar) && (((zzl)paramObject).zzas == this.zzas);
  }
  
  public final int hashCode()
  {
    return ((this.zzaq + 1 ^ 0xF4243) * 1000003 ^ this.zzar) * 1000003 ^ this.zzas;
  }
  
  public final String toString()
  {
    int i = this.zzaq;
    int j = this.zzar;
    int k = this.zzas;
    StringBuilder localStringBuilder = new StringBuilder(74);
    localStringBuilder.append("policy=");
    localStringBuilder.append(i);
    localStringBuilder.append(" initial_backoff=");
    localStringBuilder.append(j);
    localStringBuilder.append(" maximum_backoff=");
    localStringBuilder.append(k);
    return localStringBuilder.toString();
  }
  
  public final Bundle zzf(Bundle paramBundle)
  {
    paramBundle.putInt("retry_policy", this.zzaq);
    paramBundle.putInt("initial_backoff_seconds", this.zzar);
    paramBundle.putInt("maximum_backoff_seconds", this.zzas);
    return paramBundle;
  }
  
  public final int zzh()
  {
    return this.zzaq;
  }
  
  public final int zzi()
  {
    return this.zzar;
  }
  
  public final int zzj()
  {
    return this.zzas;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/gcm/zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */