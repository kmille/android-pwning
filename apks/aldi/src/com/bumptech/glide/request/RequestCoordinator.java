package com.bumptech.glide.request;

public abstract interface RequestCoordinator
{
  public abstract boolean canNotifyCleared(Request paramRequest);
  
  public abstract boolean canNotifyStatusChanged(Request paramRequest);
  
  public abstract boolean canSetImage(Request paramRequest);
  
  public abstract boolean isAnyResourceSet();
  
  public abstract void onRequestFailed(Request paramRequest);
  
  public abstract void onRequestSuccess(Request paramRequest);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/RequestCoordinator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */