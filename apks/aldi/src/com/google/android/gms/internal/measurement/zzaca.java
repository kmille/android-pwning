package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzaca
{
  private final byte[] buffer;
  private int zzbtk = 64;
  private int zzbtl = 67108864;
  private int zzbtp;
  private int zzbtr = Integer.MAX_VALUE;
  private final int zzbyw;
  private final int zzbyx;
  private int zzbyy;
  private int zzbyz;
  private int zzbza;
  private int zzbzb;
  
  private zzaca(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.buffer = paramArrayOfByte;
    this.zzbyw = paramInt1;
    paramInt2 += paramInt1;
    this.zzbyy = paramInt2;
    this.zzbyx = paramInt2;
    this.zzbyz = paramInt1;
  }
  
  public static zzaca zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new zzaca(paramArrayOfByte, 0, paramInt2);
  }
  
  private final void zzan(int paramInt)
    throws IOException
  {
    if (paramInt >= 0)
    {
      if (this.zzbyz + paramInt <= this.zzbtr)
      {
        if (paramInt <= this.zzbyy - this.zzbyz)
        {
          this.zzbyz += paramInt;
          return;
        }
        throw zzaci.zzvw();
      }
      zzan(this.zzbtr - this.zzbyz);
      throw zzaci.zzvw();
    }
    throw zzaci.zzvx();
  }
  
  public static zzaca zzi(byte[] paramArrayOfByte)
  {
    return zza(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  private final void zztp()
  {
    this.zzbyy += this.zzbtp;
    int i = this.zzbyy;
    if (i > this.zzbtr)
    {
      this.zzbtp = (i - this.zzbtr);
      this.zzbyy -= this.zzbtp;
      return;
    }
    this.zzbtp = 0;
  }
  
  private final byte zzvs()
    throws IOException
  {
    if (this.zzbyz != this.zzbyy)
    {
      byte[] arrayOfByte = this.buffer;
      int i = this.zzbyz;
      this.zzbyz = (i + 1);
      return arrayOfByte[i];
    }
    throw zzaci.zzvw();
  }
  
  public final int getPosition()
  {
    return this.zzbyz - this.zzbyw;
  }
  
  public final String readString()
    throws IOException
  {
    int i = zzvn();
    if (i >= 0)
    {
      if (i <= this.zzbyy - this.zzbyz)
      {
        String str = new String(this.buffer, this.zzbyz, i, zzach.UTF_8);
        this.zzbyz += i;
        return str;
      }
      throw zzaci.zzvw();
    }
    throw zzaci.zzvx();
  }
  
  public final void zza(zzacj paramzzacj)
    throws IOException
  {
    int i = zzvn();
    if (this.zzbzb < this.zzbtk)
    {
      i = zzaf(i);
      this.zzbzb += 1;
      paramzzacj.zzb(this);
      zzaj(0);
      this.zzbzb -= 1;
      zzal(i);
      return;
    }
    throw zzaci.zzvz();
  }
  
  public final void zza(zzacj paramzzacj, int paramInt)
    throws IOException
  {
    if (this.zzbzb < this.zzbtk)
    {
      this.zzbzb += 1;
      paramzzacj.zzb(this);
      zzaj(paramInt << 3 | 0x4);
      this.zzbzb -= 1;
      return;
    }
    throw zzaci.zzvz();
  }
  
  public final int zzaf(int paramInt)
    throws zzaci
  {
    if (paramInt >= 0)
    {
      paramInt += this.zzbyz;
      int i = this.zzbtr;
      if (paramInt <= i)
      {
        this.zzbtr = paramInt;
        zztp();
        return i;
      }
      throw zzaci.zzvw();
    }
    throw zzaci.zzvx();
  }
  
  public final void zzaj(int paramInt)
    throws zzaci
  {
    if (this.zzbza == paramInt) {
      return;
    }
    throw new zzaci("Protocol message end-group tag did not match expected tag.");
  }
  
  public final boolean zzak(int paramInt)
    throws IOException
  {
    switch (paramInt & 0x7)
    {
    default: 
      throw new zzaci("Protocol message tag had invalid wire type.");
    case 5: 
      zzvp();
      return true;
    case 4: 
      return false;
    case 3: 
      int i;
      do
      {
        i = zzvl();
      } while ((i != 0) && (zzak(i)));
      zzaj(paramInt >>> 3 << 3 | 0x4);
      return true;
    case 2: 
      zzan(zzvn());
      return true;
    case 1: 
      zzvq();
      return true;
    }
    zzvn();
    return true;
  }
  
  public final void zzal(int paramInt)
  {
    this.zzbtr = paramInt;
    zztp();
  }
  
  public final void zzam(int paramInt)
  {
    zzd(paramInt, this.zzbza);
  }
  
  public final byte[] zzc(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return zzacm.zzbzz;
    }
    byte[] arrayOfByte = new byte[paramInt2];
    int i = this.zzbyw;
    System.arraycopy(this.buffer, i + paramInt1, arrayOfByte, 0, paramInt2);
    return arrayOfByte;
  }
  
  final void zzd(int paramInt1, int paramInt2)
  {
    if (paramInt1 <= this.zzbyz - this.zzbyw)
    {
      if (paramInt1 >= 0)
      {
        this.zzbyz = (this.zzbyw + paramInt1);
        this.zzbza = paramInt2;
        return;
      }
      localStringBuilder = new StringBuilder(24);
      localStringBuilder.append("Bad position ");
      localStringBuilder.append(paramInt1);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    paramInt2 = this.zzbyz;
    int i = this.zzbyw;
    StringBuilder localStringBuilder = new StringBuilder(50);
    localStringBuilder.append("Position ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(" is beyond current ");
    localStringBuilder.append(paramInt2 - i);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public final int zzvl()
    throws IOException
  {
    if (this.zzbyz == this.zzbyy)
    {
      this.zzbza = 0;
      return 0;
    }
    this.zzbza = zzvn();
    if (this.zzbza != 0) {
      return this.zzbza;
    }
    throw new zzaci("Protocol message contained an invalid tag (zero).");
  }
  
  public final boolean zzvm()
    throws IOException
  {
    return zzvn() != 0;
  }
  
  public final int zzvn()
    throws IOException
  {
    int i = zzvs();
    if (i >= 0) {
      return i;
    }
    i &= 0x7F;
    int j = zzvs();
    if (j >= 0) {
      j <<= 7;
    }
    for (;;)
    {
      return i | j;
      i |= (j & 0x7F) << 7;
      j = zzvs();
      if (j >= 0)
      {
        j <<= 14;
      }
      else
      {
        i |= (j & 0x7F) << 14;
        j = zzvs();
        if (j < 0) {
          break;
        }
        j <<= 21;
      }
    }
    int k = zzvs();
    j = i | (j & 0x7F) << 21 | k << 28;
    if (k < 0)
    {
      i = 0;
      while (i < 5)
      {
        if (zzvs() >= 0) {
          return j;
        }
        i += 1;
      }
      throw zzaci.zzvy();
    }
    return j;
  }
  
  public final long zzvo()
    throws IOException
  {
    int i = 0;
    long l = 0L;
    while (i < 64)
    {
      int j = zzvs();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0) {
        return l;
      }
      i += 7;
    }
    throw zzaci.zzvy();
  }
  
  public final int zzvp()
    throws IOException
  {
    return zzvs() & 0xFF | (zzvs() & 0xFF) << 8 | (zzvs() & 0xFF) << 16 | (zzvs() & 0xFF) << 24;
  }
  
  public final long zzvq()
    throws IOException
  {
    int i = zzvs();
    int j = zzvs();
    int k = zzvs();
    int m = zzvs();
    int n = zzvs();
    int i1 = zzvs();
    int i2 = zzvs();
    int i3 = zzvs();
    long l = i;
    return (j & 0xFF) << 8 | l & 0xFF | (k & 0xFF) << 16 | (m & 0xFF) << 24 | (n & 0xFF) << 32 | (i1 & 0xFF) << 40 | (i2 & 0xFF) << 48 | (i3 & 0xFF) << 56;
  }
  
  public final int zzvr()
  {
    if (this.zzbtr == Integer.MAX_VALUE) {
      return -1;
    }
    int i = this.zzbyz;
    return this.zzbtr - i;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzaca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */