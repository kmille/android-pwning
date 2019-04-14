package com.google.android.gms.tagmanager;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class zzbw
{
  private final long zzaak;
  private final long zzbag;
  private final long zzbah;
  private String zzbai;
  
  zzbw(long paramLong1, long paramLong2, long paramLong3)
  {
    this.zzbag = paramLong1;
    this.zzaak = paramLong2;
    this.zzbah = paramLong3;
  }
  
  final void zzdf(String paramString)
  {
    if (paramString != null)
    {
      if (TextUtils.isEmpty(paramString.trim())) {
        return;
      }
      this.zzbai = paramString;
    }
  }
  
  final long zznu()
  {
    return this.zzbag;
  }
  
  final long zznv()
  {
    return this.zzbah;
  }
  
  final String zznw()
  {
    return this.zzbai;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzbw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */