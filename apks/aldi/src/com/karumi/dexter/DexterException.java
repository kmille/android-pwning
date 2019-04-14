package com.karumi.dexter;

import com.karumi.dexter.listener.DexterError;

final class DexterException
  extends IllegalStateException
{
  final DexterError error;
  
  DexterException(String paramString, DexterError paramDexterError)
  {
    super(paramString);
    this.error = paramDexterError;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/DexterException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */