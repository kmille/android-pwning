package com.google.android.gms.internal.measurement;

import java.io.IOException;

public abstract class zzacj
{
  protected volatile int zzbzo = -1;
  
  public static final <T extends zzacj> T zza(T paramT, byte[] paramArrayOfByte)
    throws zzaci
  {
    return zzb(paramT, paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static final void zza(zzacj paramzzacj, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      paramArrayOfByte = zzacb.zzb(paramArrayOfByte, 0, paramInt2);
      paramzzacj.zza(paramArrayOfByte);
      paramArrayOfByte.zzvt();
      return;
    }
    catch (IOException paramzzacj)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", paramzzacj);
    }
  }
  
  private static final <T extends zzacj> T zzb(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws zzaci
  {
    try
    {
      paramArrayOfByte = zzaca.zza(paramArrayOfByte, 0, paramInt2);
      paramT.zzb(paramArrayOfByte);
      paramArrayOfByte.zzaj(0);
      return paramT;
    }
    catch (IOException paramT)
    {
      throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", paramT);
    }
    catch (zzaci paramT)
    {
      throw paramT;
    }
  }
  
  public String toString()
  {
    return zzack.zzc(this);
  }
  
  protected int zza()
  {
    return 0;
  }
  
  public void zza(zzacb paramzzacb)
    throws IOException
  {}
  
  public abstract zzacj zzb(zzaca paramzzaca)
    throws IOException;
  
  public zzacj zzvu()
    throws CloneNotSupportedException
  {
    return (zzacj)super.clone();
  }
  
  public final int zzwa()
  {
    if (this.zzbzo < 0) {
      zzwb();
    }
    return this.zzbzo;
  }
  
  public final int zzwb()
  {
    int i = zza();
    this.zzbzo = i;
    return i;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzacj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */