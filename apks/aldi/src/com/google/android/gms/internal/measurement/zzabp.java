package com.google.android.gms.internal.measurement;

public final class zzabp
{
  private static final zzabp zzbwq = new zzabp(0, new int[0], new Object[0], false);
  private int count = 0;
  private int zzbug = -1;
  private int[] zzbwr;
  private Object[] zzbws;
  private boolean zzbwt;
  
  private zzabp()
  {
    this(0, new int[8], new Object[8], true);
  }
  
  private zzabp(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    this.zzbwr = paramArrayOfInt;
    this.zzbws = paramArrayOfObject;
    this.zzbwt = paramBoolean;
  }
  
  public static zzabp zzvf()
  {
    return zzbwq;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    return (paramObject instanceof zzabp);
  }
  
  public final int hashCode()
  {
    return 506991;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzabp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */