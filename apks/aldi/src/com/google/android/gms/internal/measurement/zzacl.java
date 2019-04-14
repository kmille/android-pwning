package com.google.android.gms.internal.measurement;

import java.util.Arrays;

final class zzacl
{
  final int tag;
  final byte[] zzbtj;
  
  zzacl(int paramInt, byte[] paramArrayOfByte)
  {
    this.tag = paramInt;
    this.zzbtj = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzacl)) {
      return false;
    }
    paramObject = (zzacl)paramObject;
    return (this.tag == ((zzacl)paramObject).tag) && (Arrays.equals(this.zzbtj, ((zzacl)paramObject).zzbtj));
  }
  
  public final int hashCode()
  {
    return (this.tag + 527) * 31 + Arrays.hashCode(this.zzbtj);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzacl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */