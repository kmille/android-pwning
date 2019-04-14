package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

final class zzcz
{
  private final Clock clock;
  private long startTime;
  
  public zzcz(Clock paramClock)
  {
    Preconditions.checkNotNull(paramClock);
    this.clock = paramClock;
  }
  
  public zzcz(Clock paramClock, long paramLong)
  {
    Preconditions.checkNotNull(paramClock);
    this.clock = paramClock;
    this.startTime = paramLong;
  }
  
  public final void clear()
  {
    this.startTime = 0L;
  }
  
  public final void start()
  {
    this.startTime = this.clock.elapsedRealtime();
  }
  
  public final boolean zzj(long paramLong)
  {
    if (this.startTime == 0L) {
      return true;
    }
    return this.clock.elapsedRealtime() - this.startTime > paramLong;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzcz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */