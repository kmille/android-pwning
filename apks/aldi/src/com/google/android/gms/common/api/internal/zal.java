package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zal
  extends LifecycleCallback
  implements DialogInterface.OnCancelListener
{
  protected volatile boolean mStarted;
  protected final GoogleApiAvailability zacc;
  protected final AtomicReference<zam> zade = new AtomicReference(null);
  private final Handler zadf = new com.google.android.gms.internal.base.zal(Looper.getMainLooper());
  
  protected zal(LifecycleFragment paramLifecycleFragment)
  {
    this(paramLifecycleFragment, GoogleApiAvailability.getInstance());
  }
  
  @VisibleForTesting
  private zal(LifecycleFragment paramLifecycleFragment, GoogleApiAvailability paramGoogleApiAvailability)
  {
    super(paramLifecycleFragment);
    this.zacc = paramGoogleApiAvailability;
  }
  
  private static int zaa(@Nullable zam paramzam)
  {
    if (paramzam == null) {
      return -1;
    }
    return paramzam.zar();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    zam localzam2 = (zam)this.zade.get();
    int j = 1;
    int i = 1;
    zam localzam1;
    switch (paramInt1)
    {
    default: 
      localzam1 = localzam2;
      break;
    case 2: 
      j = this.zacc.isGooglePlayServicesAvailable(getActivity());
      if (j == 0) {
        paramInt1 = i;
      } else {
        paramInt1 = 0;
      }
      if (localzam2 == null) {
        return;
      }
      localzam1 = localzam2;
      paramInt2 = paramInt1;
      if (localzam2.getConnectionResult().getErrorCode() != 18) {
        break label185;
      }
      localzam1 = localzam2;
      paramInt2 = paramInt1;
      if (j != 18) {
        break label185;
      }
      return;
    case 1: 
      if (paramInt2 == -1)
      {
        localzam1 = localzam2;
        paramInt2 = j;
        break label185;
      }
      localzam1 = localzam2;
      if (paramInt2 == 0)
      {
        paramInt1 = 13;
        if (paramIntent != null) {
          paramInt1 = paramIntent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
        }
        localzam1 = new zam(new ConnectionResult(paramInt1, null), zaa(localzam2));
        this.zade.set(localzam1);
      }
      break;
    }
    paramInt2 = 0;
    label185:
    if (paramInt2 != 0)
    {
      zaq();
      return;
    }
    if (localzam1 != null) {
      zaa(localzam1.getConnectionResult(), localzam1.zar());
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    zaa(new ConnectionResult(13, null), zaa((zam)this.zade.get()));
    zaq();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      AtomicReference localAtomicReference = this.zade;
      if (paramBundle.getBoolean("resolving_error", false)) {
        paramBundle = new zam(new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution")), paramBundle.getInt("failed_client_id", -1));
      } else {
        paramBundle = null;
      }
      localAtomicReference.set(paramBundle);
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    zam localzam = (zam)this.zade.get();
    if (localzam != null)
    {
      paramBundle.putBoolean("resolving_error", true);
      paramBundle.putInt("failed_client_id", localzam.zar());
      paramBundle.putInt("failed_status", localzam.getConnectionResult().getErrorCode());
      paramBundle.putParcelable("failed_resolution", localzam.getConnectionResult().getResolution());
    }
  }
  
  public void onStart()
  {
    super.onStart();
    this.mStarted = true;
  }
  
  public void onStop()
  {
    super.onStop();
    this.mStarted = false;
  }
  
  protected abstract void zaa(ConnectionResult paramConnectionResult, int paramInt);
  
  public final void zab(ConnectionResult paramConnectionResult, int paramInt)
  {
    paramConnectionResult = new zam(paramConnectionResult, paramInt);
    if (this.zade.compareAndSet(null, paramConnectionResult)) {
      this.zadf.post(new zan(this, paramConnectionResult));
    }
  }
  
  protected abstract void zao();
  
  protected final void zaq()
  {
    this.zade.set(null);
    zao();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */