package com.google.android.gms.tagmanager;

import java.util.Arrays;

final class zzay
{
  final byte[] zzazp;
  final String zzny;
  
  zzay(String paramString, byte[] paramArrayOfByte)
  {
    this.zzny = paramString;
    this.zzazp = paramArrayOfByte;
  }
  
  public final String toString()
  {
    String str = this.zzny;
    int i = Arrays.hashCode(this.zzazp);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 54);
    localStringBuilder.append("KeyAndSerialized: key = ");
    localStringBuilder.append(str);
    localStringBuilder.append(" serialized hash = ");
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */