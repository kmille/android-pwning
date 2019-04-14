package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

public final class zzgf
{
  private Tracker zzqw;
  private Context zzqx;
  private GoogleAnalytics zzqz;
  
  public zzgf(Context paramContext)
  {
    this.zzqx = paramContext;
  }
  
  private final void zzdq(String paramString)
  {
    try
    {
      if (this.zzqz == null)
      {
        this.zzqz = GoogleAnalytics.getInstance(this.zzqx);
        this.zzqz.setLogger(new zzgg());
        this.zzqw = this.zzqz.newTracker(paramString);
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final Tracker zzdp(String paramString)
  {
    zzdq(paramString);
    return this.zzqw;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzgf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */