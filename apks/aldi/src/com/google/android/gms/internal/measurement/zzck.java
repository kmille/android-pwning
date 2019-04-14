package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzck
{
  private final Clock clock;
  private final long zzaao = 2000L;
  private final int zzaap = 60;
  private double zzaaq = this.zzaap;
  private long zzaar;
  private final Object zzaas = new Object();
  private final String zztz;
  
  private zzck(int paramInt, long paramLong, String paramString, Clock paramClock)
  {
    this.zztz = paramString;
    this.clock = paramClock;
  }
  
  public zzck(String paramString, Clock paramClock)
  {
    this(60, 2000L, paramString, paramClock);
  }
  
  public final boolean zzes()
  {
    synchronized (this.zzaas)
    {
      long l1 = this.clock.currentTimeMillis();
      if (this.zzaaq < this.zzaap)
      {
        double d1 = l1 - this.zzaar;
        long l2 = this.zzaao;
        double d2 = l2;
        Double.isNaN(d1);
        Double.isNaN(d2);
        d1 /= d2;
        if (d1 > 0.0D) {
          this.zzaaq = Math.min(this.zzaap, this.zzaaq + d1);
        }
      }
      this.zzaar = l1;
      if (this.zzaaq >= 1.0D)
      {
        this.zzaaq -= 1.0D;
        return true;
      }
      String str = this.zztz;
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 34);
      localStringBuilder.append("Excessive ");
      localStringBuilder.append(str);
      localStringBuilder.append(" detected; call ignored.");
      zzcl.zzab(localStringBuilder.toString());
      return false;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */