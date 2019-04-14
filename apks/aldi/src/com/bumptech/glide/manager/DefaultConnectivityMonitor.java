package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.util.Log;
import com.bumptech.glide.util.Preconditions;

final class DefaultConnectivityMonitor
  implements ConnectivityMonitor
{
  private static final String TAG = "ConnectivityMonitor";
  private final BroadcastReceiver connectivityReceiver = new BroadcastReceiver()
  {
    public void onReceive(@NonNull Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      boolean bool = DefaultConnectivityMonitor.this.isConnected;
      DefaultConnectivityMonitor.this.isConnected = DefaultConnectivityMonitor.this.isConnected(paramAnonymousContext);
      if (bool != DefaultConnectivityMonitor.this.isConnected)
      {
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
          new StringBuilder("connectivity changed, isConnected: ").append(DefaultConnectivityMonitor.this.isConnected);
        }
        DefaultConnectivityMonitor.this.listener.onConnectivityChanged(DefaultConnectivityMonitor.this.isConnected);
      }
    }
  };
  private final Context context;
  boolean isConnected;
  private boolean isRegistered;
  final ConnectivityMonitor.ConnectivityListener listener;
  
  DefaultConnectivityMonitor(@NonNull Context paramContext, @NonNull ConnectivityMonitor.ConnectivityListener paramConnectivityListener)
  {
    this.context = paramContext.getApplicationContext();
    this.listener = paramConnectivityListener;
  }
  
  private void register()
  {
    if (this.isRegistered) {
      return;
    }
    this.isConnected = isConnected(this.context);
    try
    {
      this.context.registerReceiver(this.connectivityReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
      this.isRegistered = true;
      return;
    }
    catch (SecurityException localSecurityException)
    {
      for (;;) {}
    }
    Log.isLoggable("ConnectivityMonitor", 5);
  }
  
  private void unregister()
  {
    if (!this.isRegistered) {
      return;
    }
    this.context.unregisterReceiver(this.connectivityReceiver);
    this.isRegistered = false;
  }
  
  @SuppressLint({"MissingPermission"})
  final boolean isConnected(@NonNull Context paramContext)
  {
    paramContext = (ConnectivityManager)Preconditions.checkNotNull((ConnectivityManager)paramContext.getSystemService("connectivity"));
    try
    {
      paramContext = paramContext.getActiveNetworkInfo();
      return (paramContext != null) && (paramContext.isConnected());
    }
    catch (RuntimeException paramContext)
    {
      for (;;) {}
    }
    Log.isLoggable("ConnectivityMonitor", 5);
    return true;
  }
  
  public final void onDestroy() {}
  
  public final void onStart()
  {
    register();
  }
  
  public final void onStop()
  {
    unregister();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/manager/DefaultConnectivityMonitor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */