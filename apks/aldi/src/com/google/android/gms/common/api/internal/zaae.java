package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.v4.util.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

public class zaae
  extends zal
{
  private GoogleApiManager zabm;
  private final ArraySet<zai<?>> zafo = new ArraySet();
  
  private zaae(LifecycleFragment paramLifecycleFragment)
  {
    super(paramLifecycleFragment);
    this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
  }
  
  public static void zaa(Activity paramActivity, GoogleApiManager paramGoogleApiManager, zai<?> paramzai)
  {
    LifecycleFragment localLifecycleFragment = getFragment(paramActivity);
    zaae localzaae = (zaae)localLifecycleFragment.getCallbackOrNull("ConnectionlessLifecycleHelper", zaae.class);
    paramActivity = localzaae;
    if (localzaae == null) {
      paramActivity = new zaae(localLifecycleFragment);
    }
    paramActivity.zabm = paramGoogleApiManager;
    Preconditions.checkNotNull(paramzai, "ApiKey cannot be null");
    paramActivity.zafo.add(paramzai);
    paramGoogleApiManager.zaa(paramActivity);
  }
  
  private final void zaak()
  {
    if (!this.zafo.isEmpty()) {
      this.zabm.zaa(this);
    }
  }
  
  public void onResume()
  {
    super.onResume();
    zaak();
  }
  
  public void onStart()
  {
    super.onStart();
    zaak();
  }
  
  public void onStop()
  {
    super.onStop();
    this.zabm.zab(this);
  }
  
  protected final void zaa(ConnectionResult paramConnectionResult, int paramInt)
  {
    this.zabm.zaa(paramConnectionResult, paramInt);
  }
  
  final ArraySet<zai<?>> zaaj()
  {
    return this.zafo;
  }
  
  protected final void zao()
  {
    this.zabm.zao();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */