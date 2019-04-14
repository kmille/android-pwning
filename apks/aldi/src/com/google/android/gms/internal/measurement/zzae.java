package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@VisibleForTesting
public final class zzae
  extends zzi<zzae>
{
  private String zzuk;
  private int zzul;
  private int zzum;
  private String zzun;
  private String zzuo;
  private boolean zzup;
  private boolean zzuq;
  
  public zzae()
  {
    this(false);
  }
  
  private zzae(boolean paramBoolean)
  {
    this(false, i);
  }
  
  @VisibleForTesting
  private zzae(boolean paramBoolean, int paramInt)
  {
    Preconditions.checkNotZero(paramInt);
    this.zzul = paramInt;
    this.zzuq = false;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("screenName", this.zzuk);
    localHashMap.put("interstitial", Boolean.valueOf(this.zzup));
    localHashMap.put("automatic", Boolean.valueOf(this.zzuq));
    localHashMap.put("screenId", Integer.valueOf(this.zzul));
    localHashMap.put("referrerScreenId", Integer.valueOf(this.zzum));
    localHashMap.put("referrerScreenName", this.zzun);
    localHashMap.put("referrerUri", this.zzuo);
    return zza(localHashMap);
  }
  
  public final String zzbg()
  {
    return this.zzuk;
  }
  
  public final int zzbh()
  {
    return this.zzul;
  }
  
  public final String zzbi()
  {
    return this.zzuo;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */