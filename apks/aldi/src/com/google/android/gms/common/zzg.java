package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class zzg
  extends zze
{
  private static final WeakReference<byte[]> zzw = new WeakReference(null);
  private WeakReference<byte[]> zzv = zzw;
  
  zzg(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
  }
  
  final byte[] getBytes()
  {
    try
    {
      byte[] arrayOfByte2 = (byte[])this.zzv.get();
      byte[] arrayOfByte1 = arrayOfByte2;
      if (arrayOfByte2 == null)
      {
        arrayOfByte1 = zzd();
        this.zzv = new WeakReference(arrayOfByte1);
      }
      return arrayOfByte1;
    }
    finally {}
  }
  
  protected abstract byte[] zzd();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */