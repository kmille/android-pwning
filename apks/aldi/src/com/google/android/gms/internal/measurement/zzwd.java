package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

public final class zzwd
{
  private final Clock clock;
  private String zzayt = null;
  @VisibleForTesting
  private Map<String, Object> zzbls = new HashMap();
  private final Map<String, Object> zzblt;
  private final zzwn zzboc;
  private final Context zzqx;
  
  public zzwd(Context paramContext)
  {
    this(paramContext, new HashMap(), new zzwn(paramContext), DefaultClock.getInstance());
  }
  
  @VisibleForTesting
  private zzwd(Context paramContext, Map<String, Object> paramMap, zzwn paramzzwn, Clock paramClock)
  {
    this.zzqx = paramContext;
    this.clock = paramClock;
    this.zzboc = paramzzwn;
    this.zzblt = paramMap;
  }
  
  public final void zzeu(String paramString)
  {
    this.zzayt = paramString;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzwd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */