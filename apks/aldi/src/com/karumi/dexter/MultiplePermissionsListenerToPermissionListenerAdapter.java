package com.karumi.dexter;

import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.List;

final class MultiplePermissionsListenerToPermissionListenerAdapter
  implements MultiplePermissionsListener
{
  private final PermissionListener listener;
  
  MultiplePermissionsListenerToPermissionListenerAdapter(PermissionListener paramPermissionListener)
  {
    this.listener = paramPermissionListener;
  }
  
  public final void onPermissionRationaleShouldBeShown(List<PermissionRequest> paramList, PermissionToken paramPermissionToken)
  {
    paramList = (PermissionRequest)paramList.get(0);
    this.listener.onPermissionRationaleShouldBeShown(paramList, paramPermissionToken);
  }
  
  public final void onPermissionsChecked(MultiplePermissionsReport paramMultiplePermissionsReport)
  {
    List localList = paramMultiplePermissionsReport.getDeniedPermissionResponses();
    paramMultiplePermissionsReport = paramMultiplePermissionsReport.getGrantedPermissionResponses();
    if (!localList.isEmpty())
    {
      paramMultiplePermissionsReport = (PermissionDeniedResponse)localList.get(0);
      this.listener.onPermissionDenied(paramMultiplePermissionsReport);
      return;
    }
    paramMultiplePermissionsReport = (PermissionGrantedResponse)paramMultiplePermissionsReport.get(0);
    this.listener.onPermissionGranted(paramMultiplePermissionsReport);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/MultiplePermissionsListenerToPermissionListenerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */