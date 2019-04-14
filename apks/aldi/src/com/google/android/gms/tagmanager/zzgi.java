package com.google.android.gms.tagmanager;

final class zzgi
  extends Number
  implements Comparable<zzgi>
{
  private double zzbes;
  private long zzbet;
  private boolean zzbeu;
  
  private zzgi(double paramDouble)
  {
    this.zzbes = paramDouble;
    this.zzbeu = false;
  }
  
  private zzgi(long paramLong)
  {
    this.zzbet = paramLong;
    this.zzbeu = true;
  }
  
  public static zzgi zza(Double paramDouble)
  {
    return new zzgi(paramDouble.doubleValue());
  }
  
  public static zzgi zzao(long paramLong)
  {
    return new zzgi(paramLong);
  }
  
  public static zzgi zzdr(String paramString)
    throws NumberFormatException
  {
    try
    {
      localzzgi = new zzgi(Long.parseLong(paramString));
      return localzzgi;
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      zzgi localzzgi;
      label28:
      for (;;) {}
    }
    try
    {
      localzzgi = new zzgi(Double.parseDouble(paramString));
      return localzzgi;
    }
    catch (NumberFormatException localNumberFormatException2)
    {
      break label28;
    }
    throw new NumberFormatException(String.valueOf(paramString).concat(" is not a valid TypedNumber"));
  }
  
  public final byte byteValue()
  {
    return (byte)(int)longValue();
  }
  
  public final double doubleValue()
  {
    if (this.zzbeu) {
      return this.zzbet;
    }
    return this.zzbes;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof zzgi)) && (zza((zzgi)paramObject) == 0);
  }
  
  public final float floatValue()
  {
    return (float)doubleValue();
  }
  
  public final int hashCode()
  {
    return new Long(longValue()).hashCode();
  }
  
  public final int intValue()
  {
    return (int)longValue();
  }
  
  public final long longValue()
  {
    if (this.zzbeu) {
      return this.zzbet;
    }
    return this.zzbes;
  }
  
  public final short shortValue()
  {
    return (short)(int)longValue();
  }
  
  public final String toString()
  {
    if (this.zzbeu) {
      return Long.toString(this.zzbet);
    }
    return Double.toString(this.zzbes);
  }
  
  public final int zza(zzgi paramzzgi)
  {
    if ((this.zzbeu) && (paramzzgi.zzbeu)) {
      return Long.valueOf(this.zzbet).compareTo(Long.valueOf(paramzzgi.zzbet));
    }
    return Double.compare(doubleValue(), paramzzgi.doubleValue());
  }
  
  public final boolean zzpg()
  {
    return !this.zzbeu;
  }
  
  public final boolean zzph()
  {
    return this.zzbeu;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzgi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */