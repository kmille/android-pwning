package com.google.android.gms.internal.measurement;

final class zzba
  implements Runnable
{
  zzba(zzaz paramzzaz, zzci paramzzci) {}
  
  public final void run()
  {
    if (!this.zzws.zzwo.isConnected())
    {
      this.zzws.zzwo.zzr("Connected to service after a timeout");
      zzax.zza(this.zzws.zzwo, this.zzwr);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */