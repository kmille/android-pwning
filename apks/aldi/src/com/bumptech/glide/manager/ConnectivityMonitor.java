package com.bumptech.glide.manager;

public abstract interface ConnectivityMonitor
  extends LifecycleListener
{
  public static abstract interface ConnectivityListener
  {
    public abstract void onConnectivityChanged(boolean paramBoolean);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/manager/ConnectivityMonitor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */