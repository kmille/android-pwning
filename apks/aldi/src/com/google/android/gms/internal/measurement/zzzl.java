package com.google.android.gms.internal.measurement;

final class zzzl
  extends zzzj
{
  private final byte[] buffer;
  private int limit;
  private int pos;
  private final boolean zzbto;
  private int zzbtp;
  private int zzbtq;
  private int zzbtr = Integer.MAX_VALUE;
  
  private zzzl(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(null);
    this.buffer = paramArrayOfByte;
    this.limit = (paramInt2 + paramInt1);
    this.pos = paramInt1;
    this.zzbtq = this.pos;
    this.zzbto = paramBoolean;
  }
  
  private final void zztp()
  {
    this.limit += this.zzbtp;
    int i = this.limit - this.zzbtq;
    if (i > this.zzbtr)
    {
      this.zzbtp = (i - this.zzbtr);
      this.limit -= this.zzbtp;
      return;
    }
    this.zzbtp = 0;
  }
  
  public final int zzaf(int paramInt)
    throws zzzy
  {
    if (paramInt >= 0)
    {
      paramInt += zzto();
      int i = this.zzbtr;
      if (paramInt <= i)
      {
        this.zzbtr = paramInt;
        zztp();
        return i;
      }
      throw zzzy.zzub();
    }
    throw zzzy.zzuc();
  }
  
  public final int zzto()
  {
    return this.pos - this.zzbtq;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */