package com.google.android.gms.internal.measurement;

public final class zzacf
  implements Cloneable
{
  private static final zzacg zzbzh = new zzacg();
  private int mSize;
  private boolean zzbzi = false;
  private int[] zzbzj;
  private zzacg[] zzbzk;
  
  zzacf()
  {
    this(10);
  }
  
  private zzacf(int paramInt)
  {
    paramInt = idealIntArraySize(paramInt);
    this.zzbzj = new int[paramInt];
    this.zzbzk = new zzacg[paramInt];
    this.mSize = 0;
  }
  
  private static int idealIntArraySize(int paramInt)
  {
    int j = paramInt << 2;
    paramInt = 4;
    int i;
    for (;;)
    {
      i = j;
      if (paramInt >= 32) {
        break;
      }
      i = (1 << paramInt) - 12;
      if (j <= i) {
        break;
      }
      paramInt += 1;
    }
    return i / 4;
  }
  
  private final int zzav(int paramInt)
  {
    int j = this.mSize - 1;
    int i = 0;
    while (i <= j)
    {
      int k = i + j >>> 1;
      int m = this.zzbzj[k];
      if (m < paramInt) {
        i = k + 1;
      } else if (m > paramInt) {
        j = k - 1;
      } else {
        return k;
      }
    }
    return i ^ 0xFFFFFFFF;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzacf)) {
      return false;
    }
    paramObject = (zzacf)paramObject;
    if (this.mSize != ((zzacf)paramObject).mSize) {
      return false;
    }
    Object localObject = this.zzbzj;
    int[] arrayOfInt = ((zzacf)paramObject).zzbzj;
    int j = this.mSize;
    int i = 0;
    while (i < j)
    {
      if (localObject[i] != arrayOfInt[i])
      {
        i = 0;
        break label83;
      }
      i += 1;
    }
    i = 1;
    label83:
    if (i != 0)
    {
      localObject = this.zzbzk;
      paramObject = ((zzacf)paramObject).zzbzk;
      j = this.mSize;
      i = 0;
      while (i < j)
      {
        if (!localObject[i].equals(paramObject[i]))
        {
          i = 0;
          break label137;
        }
        i += 1;
      }
      i = 1;
      label137:
      if (i != 0) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int j = 17;
    int i = 0;
    while (i < this.mSize)
    {
      j = (j * 31 + this.zzbzj[i]) * 31 + this.zzbzk[i].hashCode();
      i += 1;
    }
    return j;
  }
  
  public final boolean isEmpty()
  {
    return this.mSize == 0;
  }
  
  final int size()
  {
    return this.mSize;
  }
  
  final void zza(int paramInt, zzacg paramzzacg)
  {
    int i = zzav(paramInt);
    if (i >= 0)
    {
      this.zzbzk[i] = paramzzacg;
      return;
    }
    i ^= 0xFFFFFFFF;
    if ((i < this.mSize) && (this.zzbzk[i] == zzbzh))
    {
      this.zzbzj[i] = paramInt;
      this.zzbzk[i] = paramzzacg;
      return;
    }
    int j;
    Object localObject;
    if (this.mSize >= this.zzbzj.length)
    {
      j = idealIntArraySize(this.mSize + 1);
      localObject = new int[j];
      zzacg[] arrayOfzzacg = new zzacg[j];
      System.arraycopy(this.zzbzj, 0, localObject, 0, this.zzbzj.length);
      System.arraycopy(this.zzbzk, 0, arrayOfzzacg, 0, this.zzbzk.length);
      this.zzbzj = ((int[])localObject);
      this.zzbzk = arrayOfzzacg;
    }
    if (this.mSize - i != 0)
    {
      localObject = this.zzbzj;
      j = i + 1;
      System.arraycopy(localObject, i, localObject, j, this.mSize - i);
      localObject = this.zzbzk;
      System.arraycopy(localObject, i, localObject, j, this.mSize - i);
    }
    this.zzbzj[i] = paramInt;
    this.zzbzk[i] = paramzzacg;
    this.mSize += 1;
  }
  
  final zzacg zzat(int paramInt)
  {
    paramInt = zzav(paramInt);
    if ((paramInt >= 0) && (this.zzbzk[paramInt] != zzbzh)) {
      return this.zzbzk[paramInt];
    }
    return null;
  }
  
  final zzacg zzau(int paramInt)
  {
    return this.zzbzk[paramInt];
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzacf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */