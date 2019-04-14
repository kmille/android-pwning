package com.karumi.dexter.listener;

import android.support.annotation.NonNull;

public final class PermissionDeniedResponse
{
  private final boolean permanentlyDenied;
  private final PermissionRequest requestedPermission;
  
  public PermissionDeniedResponse(@NonNull PermissionRequest paramPermissionRequest, boolean paramBoolean)
  {
    this.requestedPermission = paramPermissionRequest;
    this.permanentlyDenied = paramBoolean;
  }
  
  public static PermissionDeniedResponse from(@NonNull String paramString, boolean paramBoolean)
  {
    return new PermissionDeniedResponse(new PermissionRequest(paramString), paramBoolean);
  }
  
  public final String getPermissionName()
  {
    return this.requestedPermission.getName();
  }
  
  public final PermissionRequest getRequestedPermission()
  {
    return this.requestedPermission;
  }
  
  public final boolean isPermanentlyDenied()
  {
    return this.permanentlyDenied;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/listener/PermissionDeniedResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */