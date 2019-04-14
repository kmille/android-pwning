package com.karumi.dexter;

import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class MultiplePermissionsReport
{
  private final List<PermissionDeniedResponse> deniedPermissionResponses = new LinkedList();
  private final List<PermissionGrantedResponse> grantedPermissionResponses = new LinkedList();
  
  final boolean addDeniedPermissionResponse(PermissionDeniedResponse paramPermissionDeniedResponse)
  {
    return this.deniedPermissionResponses.add(paramPermissionDeniedResponse);
  }
  
  final boolean addGrantedPermissionResponse(PermissionGrantedResponse paramPermissionGrantedResponse)
  {
    return this.grantedPermissionResponses.add(paramPermissionGrantedResponse);
  }
  
  public final boolean areAllPermissionsGranted()
  {
    return this.deniedPermissionResponses.isEmpty();
  }
  
  final void clear()
  {
    this.grantedPermissionResponses.clear();
    this.deniedPermissionResponses.clear();
  }
  
  public final List<PermissionDeniedResponse> getDeniedPermissionResponses()
  {
    return this.deniedPermissionResponses;
  }
  
  public final List<PermissionGrantedResponse> getGrantedPermissionResponses()
  {
    return this.grantedPermissionResponses;
  }
  
  public final boolean isAnyPermissionPermanentlyDenied()
  {
    Iterator localIterator = this.deniedPermissionResponses.iterator();
    while (localIterator.hasNext()) {
      if (((PermissionDeniedResponse)localIterator.next()).isPermanentlyDenied()) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/MultiplePermissionsReport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */