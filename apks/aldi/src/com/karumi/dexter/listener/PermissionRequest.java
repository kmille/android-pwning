package com.karumi.dexter.listener;

import android.support.annotation.NonNull;

public final class PermissionRequest
{
  private final String name;
  
  public PermissionRequest(@NonNull String paramString)
  {
    this.name = paramString;
  }
  
  public final String getName()
  {
    return this.name;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Permission name: ");
    localStringBuilder.append(this.name);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/listener/PermissionRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */