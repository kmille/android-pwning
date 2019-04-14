package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class zzdg
  implements zzej
{
  private final Clock clock;
  private final long zzaao = 900000L;
  private final int zzaap = 5;
  private double zzaaq = Math.min(1, 5);
  private long zzaar;
  private final Object zzaas = new Object();
  private final long zzbbi = 5000L;
  private final String zztz;
  
  public zzdg(int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString, Clock paramClock)
  {
    this.zztz = paramString;
    this.clock = paramClock;
  }
  
  public final boolean zzes()
  {
    synchronized (this.zzaas)
    {
      long l1 = this.clock.currentTimeMillis();
      if (l1 - this.zzaar < this.zzbbi)
      {
        str = this.zztz;
        localStringBuilder = new StringBuilder(String.valueOf(str).length() + 34);
        localStringBuilder.append("Excessive ");
        localStringBuilder.append(str);
        localStringBuilder.append(" detected; call ignored.");
        zzdi.zzab(localStringBuilder.toString());
        return false;
      }
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
      zzdi.zzab(localStringBuilder.toString());
      return false;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzdg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */