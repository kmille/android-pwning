package com.karumi.dexter.listener.single;

import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;

public abstract interface PermissionListener
{
  public abstract void onPermissionDenied(PermissionDeniedResponse paramPermissionDeniedResponse);
  
  public abstract void onPermissionGranted(PermissionGrantedResponse paramPermissionGrantedResponse);
  
  public abstract void onPermissionRationaleShouldBeShown(PermissionRequest paramPermissionRequest, PermissionToken paramPermissionToken);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/listener/single/PermissionListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */