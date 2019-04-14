package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract interface LifecycleDelegate
{
  @KeepForSdk
  public abstract void onCreate(Bundle paramBundle);
  
  @KeepForSdk
  public abstract View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle);
  
  @KeepForSdk
  public abstract void onDestroy();
  
  @KeepForSdk
  public abstract void onDestroyView();
  
  @KeepForSdk
  public abstract void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2);
  
  @KeepForSdk
  public abstract void onLowMemory();
  
  @KeepForSdk
  public abstract void onPause();
  
  @KeepForSdk
  public abstract void onResume();
  
  @KeepForSdk
  public abstract void onSaveInstanceState(Bundle paramBundle);
  
  @KeepForSdk
  public abstract void onStart();
  
  @KeepForSdk
  public abstract void onStop();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/dynamic/LifecycleDelegate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */