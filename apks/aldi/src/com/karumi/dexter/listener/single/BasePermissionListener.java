package com.karumi.dexter.listener.single;

import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;

public class BasePermissionListener
  implements PermissionListener
{
  public void onPermissionDenied(PermissionDeniedResponse paramPermissionDeniedResponse) {}
  
  public void onPermissionGranted(PermissionGrantedResponse paramPermissionGrantedResponse) {}
  
  public void onPermissionRationaleShouldBeShown(PermissionRequest paramPermissionRequest, PermissionToken paramPermissionToken)
  {
    paramPermissionToken.continuePermissionRequest();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/listener/single/BasePermissionListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */