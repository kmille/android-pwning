package com.google.android.gms.common;

import java.util.concurrent.Callable;

final class zzo
  extends zzm
{
  private final Callable<String> zzae;
  
  private zzo(Callable<String> paramCallable)
  {
    super(false, null, null);
    this.zzae = paramCallable;
  }
  
  final String getErrorMessage()
  {
    try
    {
      String str = (String)this.zzae.call();
      return str;
    }
    catch (Exception localException)
    {
      throw new RuntimeException(localException);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */