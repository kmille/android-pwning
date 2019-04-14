package com.karumi.dexter;

final class PermissionRationaleToken
  implements PermissionToken
{
  private final DexterInstance dexterInstance;
  private boolean isTokenResolved = false;
  
  PermissionRationaleToken(DexterInstance paramDexterInstance)
  {
    this.dexterInstance = paramDexterInstance;
  }
  
  public final void cancelPermissionRequest()
  {
    if (!this.isTokenResolved)
    {
      this.dexterInstance.onCancelPermissionRequest();
      this.isTokenResolved = true;
    }
  }
  
  public final void continuePermissionRequest()
  {
    if (!this.isTokenResolved)
    {
      this.dexterInstance.onContinuePermissionRequest();
      this.isTokenResolved = true;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/PermissionRationaleToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */