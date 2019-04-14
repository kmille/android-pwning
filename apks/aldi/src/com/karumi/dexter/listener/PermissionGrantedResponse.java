package com.karumi.dexter.listener;

import android.support.annotation.NonNull;

public final class PermissionGrantedResponse
{
  private final PermissionRequest requestedPermission;
  
  public PermissionGrantedResponse(@NonNull PermissionRequest paramPermissionRequest)
  {
    this.requestedPermission = paramPermissionRequest;
  }
  
  public static PermissionGrantedResponse from(@NonNull String paramString)
  {
    return new PermissionGrantedResponse(new PermissionRequest(paramString));
  }
  
  public final String getPermissionName()
  {
    return this.requestedPermission.getName();
  }
  
  public final PermissionRequest getRequestedPermission()
  {
    return this.requestedPermission;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/listener/PermissionGrantedResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */