package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.util.Clock;

public final class zzcq
  extends zzar
{
  private SharedPreferences zzabe;
  private long zzabf;
  private long zzabg = -1L;
  private final zzcs zzabh = new zzcs(this, "monitoring", ((Long)zzcc.zzzy.get()).longValue(), null);
  
  protected zzcq(zzat paramzzat)
  {
    super(paramzzat);
  }
  
  protected final void zzac()
  {
    this.zzabe = getContext().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
  }
  
  public final void zzac(String paramString)
  {
    zzk.zzab();
    zzch();
    SharedPreferences.Editor localEditor = this.zzabe.edit();
    if (TextUtils.isEmpty(paramString)) {
      localEditor.remove("installation_campaign");
    } else {
      localEditor.putString("installation_campaign", paramString);
    }
    if (!localEditor.commit()) {
      zzt("Failed to commit campaign data");
    }
  }
  
  public final long zzfb()
  {
    zzk.zzab();
    zzch();
    if (this.zzabf == 0L)
    {
      long l1 = this.zzabe.getLong("first_run", 0L);
      if (l1 != 0L) {}
      for (;;)
      {
        this.zzabf = l1;
        break;
        long l2 = zzbt().currentTimeMillis();
        SharedPreferences.Editor localEditor = this.zzabe.edit();
        localEditor.putLong("first_run", l2);
        l1 = l2;
        if (!localEditor.commit())
        {
          zzt("Failed to commit first run time");
          l1 = l2;
        }
      }
    }
    return this.zzabf;
  }
  
  public final zzcz zzfc()
  {
    return new zzcz(zzbt(), zzfb());
  }
  
  public final long zzfd()
  {
    zzk.zzab();
    zzch();
    if (this.zzabg == -1L) {
      this.zzabg = this.zzabe.getLong("last_dispatch", 0L);
    }
    return this.zzabg;
  }
  
  public final void zzfe()
  {
    zzk.zzab();
    zzch();
    long l = zzbt().currentTimeMillis();
    SharedPreferences.Editor localEditor = this.zzabe.edit();
    localEditor.putLong("last_dispatch", l);
    localEditor.apply();
    this.zzabg = l;
  }
  
  public final String zzff()
  {
    zzk.zzab();
    zzch();
    String str = this.zzabe.getString("installation_campaign", null);
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    return str;
  }
  
  public final zzcs zzfg()
  {
    return this.zzabh;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzcq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */