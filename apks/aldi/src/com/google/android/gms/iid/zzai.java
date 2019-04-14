package com.google.android.gms.iid;

import javax.annotation.concurrent.GuardedBy;

abstract class zzai
{
  @GuardedBy("SdkFlagFactory.class")
  private static zzai zzcy;
  
  static zzai zzw()
  {
    try
    {
      if (zzcy == null) {
        zzcy = new zzac();
      }
      zzai localzzai = zzcy;
      return localzzai;
    }
    finally {}
  }
  
  abstract zzaj<Boolean> zzd(String paramString, boolean paramBoolean);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */