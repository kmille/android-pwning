package com.google.android.gms.internal.measurement;

class zzzh
  extends zzzg
{
  protected final byte[] zzbtj;
  
  zzzh(byte[] paramArrayOfByte)
  {
    this.zzbtj = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzzb)) {
      return false;
    }
    if (size() != ((zzzb)paramObject).size()) {
      return false;
    }
    if (size() == 0) {
      return true;
    }
    if ((paramObject instanceof zzzh))
    {
      paramObject = (zzzh)paramObject;
      int i = zztm();
      int j = ((zzzb)paramObject).zztm();
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      return zza((zzzb)paramObject, 0, size());
    }
    return paramObject.equals(this);
  }
  
  public int size()
  {
    return this.zzbtj.length;
  }
  
  protected final int zza(int paramInt1, int paramInt2, int paramInt3)
  {
    return zzzw.zza(paramInt1, this.zzbtj, zztn(), paramInt3);
  }
  
  final boolean zza(zzzb paramzzzb, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramzzzb.size())
    {
      if (paramInt2 <= paramzzzb.size())
      {
        if ((paramzzzb instanceof zzzh))
        {
          paramzzzb = (zzzh)paramzzzb;
          byte[] arrayOfByte1 = this.zzbtj;
          byte[] arrayOfByte2 = paramzzzb.zzbtj;
          int j = zztn();
          int i = zztn();
          paramInt1 = paramzzzb.zztn();
          while (i < j + paramInt2)
          {
            if (arrayOfByte1[i] != arrayOfByte2[paramInt1]) {
              return false;
            }
            i += 1;
            paramInt1 += 1;
          }
          return true;
        }
        return paramzzzb.zzb(0, paramInt2).equals(zzb(0, paramInt2));
      }
      paramInt1 = paramzzzb.size();
      paramzzzb = new StringBuilder(59);
      paramzzzb.append("Ran off end of other: 0, ");
      paramzzzb.append(paramInt2);
      paramzzzb.append(", ");
      paramzzzb.append(paramInt1);
      throw new IllegalArgumentException(paramzzzb.toString());
    }
    paramInt1 = size();
    paramzzzb = new StringBuilder(40);
    paramzzzb.append("Length too large: ");
    paramzzzb.append(paramInt2);
    paramzzzb.append(paramInt1);
    throw new IllegalArgumentException(paramzzzb.toString());
  }
  
  public byte zzae(int paramInt)
  {
    return this.zzbtj[paramInt];
  }
  
  public final zzzb zzb(int paramInt1, int paramInt2)
  {
    paramInt1 = zzb(0, paramInt2, size());
    if (paramInt1 == 0) {
      return zzzb.zzbte;
    }
    return new zzze(this.zzbtj, zztn(), paramInt1);
  }
  
  protected int zztn()
  {
    return 0;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */