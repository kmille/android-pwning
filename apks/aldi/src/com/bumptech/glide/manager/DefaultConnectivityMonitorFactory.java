package com.bumptech.glide.manager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.util.Log;

public class DefaultConnectivityMonitorFactory
  implements ConnectivityMonitorFactory
{
  private static final String NETWORK_PERMISSION = "android.permission.ACCESS_NETWORK_STATE";
  private static final String TAG = "ConnectivityMonitor";
  
  @NonNull
  public ConnectivityMonitor build(@NonNull Context paramContext, @NonNull ConnectivityMonitor.ConnectivityListener paramConnectivityListener)
  {
    int i;
    if (ContextCompat.checkSelfPermission(paramContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
      i = 1;
    } else {
      i = 0;
    }
    Log.isLoggable("ConnectivityMonitor", 3);
    if (i != 0) {
      return new DefaultConnectivityMonitor(paramContext, paramConnectivityListener);
    }
    return new NullConnectivityMonitor();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/manager/DefaultConnectivityMonitorFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */