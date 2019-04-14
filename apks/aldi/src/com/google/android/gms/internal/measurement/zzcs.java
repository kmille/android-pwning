package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.UUID;

public final class zzcs
{
  private final String name;
  private final long zzabi;
  
  private zzcs(zzcq paramzzcq, String paramString, long paramLong)
  {
    Preconditions.checkNotEmpty(paramString);
    boolean bool;
    if (paramLong > 0L) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    this.name = paramString;
    this.zzabi = paramLong;
  }
  
  private final void zzfh()
  {
    long l = this.zzabj.zzbt().currentTimeMillis();
    SharedPreferences.Editor localEditor = zzcq.zza(this.zzabj).edit();
    localEditor.remove(zzfl());
    localEditor.remove(zzfm());
    localEditor.putLong(zzfk(), l);
    localEditor.commit();
  }
  
  private final long zzfj()
  {
    return zzcq.zza(this.zzabj).getLong(zzfk(), 0L);
  }
  
  private final String zzfk()
  {
    return String.valueOf(this.name).concat(":start");
  }
  
  private final String zzfl()
  {
    return String.valueOf(this.name).concat(":count");
  }
  
  @VisibleForTesting
  private final String zzfm()
  {
    return String.valueOf(this.name).concat(":value");
  }
  
  public final void zzad(String paramString)
  {
    if (zzfj() == 0L) {
      zzfh();
    }
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    for (;;)
    {
      try
      {
        long l2 = zzcq.zza(this.zzabj).getLong(zzfl(), 0L);
        if (l2 <= 0L)
        {
          paramString = zzcq.zza(this.zzabj).edit();
          paramString.putString(zzfm(), str);
          paramString.putLong(zzfl(), 1L);
          paramString.apply();
          return;
        }
        long l1 = UUID.randomUUID().getLeastSignificantBits();
        l2 += 1L;
        if ((l1 & 0x7FFFFFFFFFFFFFFF) < Long.MAX_VALUE / l2)
        {
          i = 1;
          paramString = zzcq.zza(this.zzabj).edit();
          if (i != 0) {
            paramString.putString(zzfm(), str);
          }
          paramString.putLong(zzfl(), l2);
          paramString.apply();
          return;
        }
      }
      finally {}
      int i = 0;
    }
  }
  
  public final Pair<String, Long> zzfi()
  {
    long l = zzfj();
    if (l == 0L) {
      l = 0L;
    } else {
      l = Math.abs(l - this.zzabj.zzbt().currentTimeMillis());
    }
    if (l < this.zzabi) {
      return null;
    }
    if (l > this.zzabi << 1)
    {
      zzfh();
      return null;
    }
    String str = zzcq.zza(this.zzabj).getString(zzfm(), null);
    l = zzcq.zza(this.zzabj).getLong(zzfl(), 0L);
    zzfh();
    if (str != null)
    {
      if (l <= 0L) {
        return null;
      }
      return new Pair(str, Long.valueOf(l));
    }
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */