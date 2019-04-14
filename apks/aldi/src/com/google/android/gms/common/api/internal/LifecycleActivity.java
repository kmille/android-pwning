package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public class LifecycleActivity
{
  private final Object zzbc;
  
  public LifecycleActivity(Activity paramActivity)
  {
    Preconditions.checkNotNull(paramActivity, "Activity must not be null");
    this.zzbc = paramActivity;
  }
  
  @KeepForSdk
  public LifecycleActivity(ContextWrapper paramContextWrapper)
  {
    throw new UnsupportedOperationException();
  }
  
  @KeepForSdk
  public Activity asActivity()
  {
    return (Activity)this.zzbc;
  }
  
  @KeepForSdk
  public FragmentActivity asFragmentActivity()
  {
    return (FragmentActivity)this.zzbc;
  }
  
  @KeepForSdk
  public Object asObject()
  {
    return this.zzbc;
  }
  
  @KeepForSdk
  public boolean isChimera()
  {
    return false;
  }
  
  @KeepForSdk
  public boolean isSupport()
  {
    return this.zzbc instanceof FragmentActivity;
  }
  
  public final boolean zzh()
  {
    return this.zzbc instanceof Activity;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/LifecycleActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */