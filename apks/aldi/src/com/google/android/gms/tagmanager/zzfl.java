package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

final class zzfl
  implements zzej
{
  private final Clock clock = DefaultClock.getInstance();
  private final long zzaao = 2000L;
  private final int zzaap = 60;
  private double zzaaq = this.zzaap;
  private final Object zzaas = new Object();
  private long zzbdt;
  
  public zzfl()
  {
    this(60, 2000L);
  }
  
  private zzfl(int paramInt, long paramLong) {}
  
  public final boolean zzes()
  {
    synchronized (this.zzaas)
    {
      long l1 = this.clock.currentTimeMillis();
      if (this.zzaaq < this.zzaap)
      {
        double d1 = l1 - this.zzbdt;
        long l2 = this.zzaao;
        double d2 = l2;
        Double.isNaN(d1);
        Double.isNaN(d2);
        d1 /= d2;
        if (d1 > 0.0D) {
          this.zzaaq = Math.min(this.zzaap, this.zzaaq + d1);
        }
      }
      this.zzbdt = l1;
      if (this.zzaaq >= 1.0D)
      {
        this.zzaaq -= 1.0D;
        return true;
      }
      zzdi.zzab("No more tokens available.");
      return false;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzfl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */