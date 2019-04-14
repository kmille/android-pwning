package com.google.android.gms.internal.measurement;

final class zzze
  extends zzzh
{
  private final int zzbth;
  private final int zzbti;
  
  zzze(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    zzb(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    this.zzbth = paramInt1;
    this.zzbti = paramInt2;
  }
  
  public final int size()
  {
    return this.zzbti;
  }
  
  public final byte zzae(int paramInt)
  {
    int i = size();
    if ((i - (paramInt + 1) | paramInt) < 0)
    {
      if (paramInt < 0)
      {
        localStringBuilder = new StringBuilder(22);
        localStringBuilder.append("Index < 0: ");
        localStringBuilder.append(paramInt);
        throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder(40);
      localStringBuilder.append("Index > length: ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(", ");
      localStringBuilder.append(i);
      throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
    }
    return this.zzbtj[(this.zzbth + paramInt)];
  }
  
  protected final int zztn()
  {
    return this.zzbth;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */