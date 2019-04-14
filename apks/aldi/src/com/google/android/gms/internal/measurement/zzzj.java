package com.google.android.gms.internal.measurement;

public abstract class zzzj
{
  private static volatile boolean zzbtn = false;
  int zzbtk = 100;
  private int zzbtl = Integer.MAX_VALUE;
  private boolean zzbtm = false;
  
  static zzzj zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    paramArrayOfByte = new zzzl(paramArrayOfByte, paramInt1, paramInt2, false, null);
    try
    {
      paramArrayOfByte.zzaf(paramInt2);
      return paramArrayOfByte;
    }
    catch (zzzy paramArrayOfByte)
    {
      throw new IllegalArgumentException(paramArrayOfByte);
    }
  }
  
  public abstract int zzto();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */