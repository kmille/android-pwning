package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public abstract class zzzb
  implements Serializable, Iterable<Byte>
{
  public static final zzzb zzbte = new zzzh(zzzw.zzbux);
  private static final zzzf zzbtf;
  private int zzbqf = 0;
  
  static
  {
    Object localObject;
    if (zzza.zztk()) {
      localObject = new zzzi(null);
    } else {
      localObject = new zzzd(null);
    }
    zzbtf = (zzzf)localObject;
  }
  
  static int zzb(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2 - paramInt1;
    if ((paramInt1 | paramInt2 | i | paramInt3 - paramInt2) < 0)
    {
      if (paramInt1 >= 0)
      {
        if (paramInt2 < paramInt1)
        {
          localStringBuilder = new StringBuilder(66);
          localStringBuilder.append("Beginning index larger than ending index: ");
          localStringBuilder.append(paramInt1);
          localStringBuilder.append(", ");
          localStringBuilder.append(paramInt2);
          throw new IndexOutOfBoundsException(localStringBuilder.toString());
        }
        localStringBuilder = new StringBuilder(37);
        localStringBuilder.append("End index: ");
        localStringBuilder.append(paramInt2);
        localStringBuilder.append(" >= ");
        localStringBuilder.append(paramInt3);
        throw new IndexOutOfBoundsException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder(32);
      localStringBuilder.append("Beginning index: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(" < 0");
      throw new IndexOutOfBoundsException(localStringBuilder.toString());
    }
    return i;
  }
  
  public static zzzb zzfn(String paramString)
  {
    return new zzzh(paramString.getBytes(zzzw.UTF_8));
  }
  
  public abstract boolean equals(Object paramObject);
  
  public final int hashCode()
  {
    int j = this.zzbqf;
    int i = j;
    if (j == 0)
    {
      i = size();
      j = zza(i, 0, i);
      i = j;
      if (j == 0) {
        i = 1;
      }
      this.zzbqf = i;
    }
    return i;
  }
  
  public abstract int size();
  
  public final String toString()
  {
    return String.format("<ByteString@%s size=%d>", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()) });
  }
  
  protected abstract int zza(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract byte zzae(int paramInt);
  
  public abstract zzzb zzb(int paramInt1, int paramInt2);
  
  protected final int zztm()
  {
    return this.zzbqf;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */