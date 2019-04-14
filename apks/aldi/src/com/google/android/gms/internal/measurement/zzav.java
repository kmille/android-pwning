package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

public final class zzav
{
  private final Context zzwe;
  private final Context zzwf;
  
  public zzav(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    paramContext = paramContext.getApplicationContext();
    Preconditions.checkNotNull(paramContext, "Application context can't be null");
    this.zzwe = paramContext;
    this.zzwf = paramContext;
  }
  
  public final Context getApplicationContext()
  {
    return this.zzwe;
  }
  
  public final Context zzci()
  {
    return this.zzwf;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */