package com.karumi.dexter.listener.multi;

import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import java.util.List;

public abstract interface MultiplePermissionsListener
{
  public abstract void onPermissionRationaleShouldBeShown(List<PermissionRequest> paramList, PermissionToken paramPermissionToken);
  
  public abstract void onPermissionsChecked(MultiplePermissionsReport paramMultiplePermissionsReport);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/listener/multi/MultiplePermissionsListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */