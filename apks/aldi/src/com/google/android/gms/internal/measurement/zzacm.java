package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzacm
{
  public static final int[] zzbvp = new int[0];
  private static final int zzbzp = 11;
  private static final int zzbzq = 12;
  private static final int zzbzr = 16;
  private static final int zzbzs = 26;
  public static final long[] zzbzt = new long[0];
  private static final float[] zzbzu = new float[0];
  private static final double[] zzbzv = new double[0];
  private static final boolean[] zzbzw = new boolean[0];
  public static final String[] zzbzx = new String[0];
  private static final byte[][] zzbzy = new byte[0][];
  public static final byte[] zzbzz = new byte[0];
  
  public static final int zzb(zzaca paramzzaca, int paramInt)
    throws IOException
  {
    int j = paramzzaca.getPosition();
    paramzzaca.zzak(paramInt);
    int i = 1;
    while (paramzzaca.zzvl() == paramInt)
    {
      paramzzaca.zzak(paramInt);
      i += 1;
    }
    paramzzaca.zzd(j, paramInt);
    return i;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzacm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */