package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Dialog;
import android.support.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

final class zan
  implements Runnable
{
  private final zam zadi;
  
  zan(zal paramzal, zam paramzam)
  {
    this.zadi = paramzam;
  }
  
  @MainThread
  public final void run()
  {
    if (!this.zadj.mStarted) {
      return;
    }
    Object localObject = this.zadi.getConnectionResult();
    if (((ConnectionResult)localObject).hasResolution())
    {
      this.zadj.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(this.zadj.getActivity(), ((ConnectionResult)localObject).getResolution(), this.zadi.zar(), false), 1);
      return;
    }
    if (this.zadj.zacc.isUserResolvableError(((ConnectionResult)localObject).getErrorCode()))
    {
      this.zadj.zacc.zaa(this.zadj.getActivity(), this.zadj.mLifecycleFragment, ((ConnectionResult)localObject).getErrorCode(), 2, this.zadj);
      return;
    }
    if (((ConnectionResult)localObject).getErrorCode() == 18)
    {
      localObject = GoogleApiAvailability.zaa(this.zadj.getActivity(), this.zadj);
      this.zadj.zacc.zaa(this.zadj.getActivity().getApplicationContext(), new zao(this, (Dialog)localObject));
      return;
    }
    this.zadj.zaa((ConnectionResult)localObject, this.zadi.zar());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */