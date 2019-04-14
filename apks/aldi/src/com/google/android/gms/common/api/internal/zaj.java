package com.google.android.gms.common.api.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicReference;

public class zaj
  extends zal
{
  private final SparseArray<zaa> zacv = new SparseArray();
  
  private zaj(LifecycleFragment paramLifecycleFragment)
  {
    super(paramLifecycleFragment);
    this.mLifecycleFragment.addCallback("AutoManageHelper", this);
  }
  
  public static zaj zaa(LifecycleActivity paramLifecycleActivity)
  {
    paramLifecycleActivity = getFragment(paramLifecycleActivity);
    zaj localzaj = (zaj)paramLifecycleActivity.getCallbackOrNull("AutoManageHelper", zaj.class);
    if (localzaj != null) {
      return localzaj;
    }
    return new zaj(paramLifecycleActivity);
  }
  
  @Nullable
  private final zaa zab(int paramInt)
  {
    if (this.zacv.size() <= paramInt) {
      return null;
    }
    return (zaa)this.zacv.get(this.zacv.keyAt(paramInt));
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = 0;
    while (i < this.zacv.size())
    {
      zaa localzaa = zab(i);
      if (localzaa != null)
      {
        paramPrintWriter.append(paramString).append("GoogleApiClient #").print(localzaa.zacw);
        paramPrintWriter.println(":");
        localzaa.zacx.dump(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
      i += 1;
    }
  }
  
  public void onStart()
  {
    super.onStart();
    boolean bool = this.mStarted;
    Object localObject = String.valueOf(this.zacv);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject).length() + 14);
    localStringBuilder.append("onStart ");
    localStringBuilder.append(bool);
    localStringBuilder.append(" ");
    localStringBuilder.append((String)localObject);
    if (this.zade.get() == null)
    {
      int i = 0;
      while (i < this.zacv.size())
      {
        localObject = zab(i);
        if (localObject != null) {
          ((zaa)localObject).zacx.connect();
        }
        i += 1;
      }
    }
  }
  
  public void onStop()
  {
    super.onStop();
    int i = 0;
    while (i < this.zacv.size())
    {
      zaa localzaa = zab(i);
      if (localzaa != null) {
        localzaa.zacx.disconnect();
      }
      i += 1;
    }
  }
  
  public final void zaa(int paramInt)
  {
    zaa localzaa = (zaa)this.zacv.get(paramInt);
    this.zacv.remove(paramInt);
    if (localzaa != null)
    {
      localzaa.zacx.unregisterConnectionFailedListener(localzaa);
      localzaa.zacx.disconnect();
    }
  }
  
  public final void zaa(int paramInt, GoogleApiClient paramGoogleApiClient, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    Preconditions.checkNotNull(paramGoogleApiClient, "GoogleApiClient instance cannot be null");
    if (this.zacv.indexOfKey(paramInt) < 0) {
      bool = true;
    } else {
      bool = false;
    }
    Object localObject = new StringBuilder(54);
    ((StringBuilder)localObject).append("Already managing a GoogleApiClient with id ");
    ((StringBuilder)localObject).append(paramInt);
    Preconditions.checkState(bool, ((StringBuilder)localObject).toString());
    localObject = (zam)this.zade.get();
    boolean bool = this.mStarted;
    String str = String.valueOf(localObject);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 49);
    localStringBuilder.append("starting AutoManage for client ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" ");
    localStringBuilder.append(bool);
    localStringBuilder.append(" ");
    localStringBuilder.append(str);
    paramOnConnectionFailedListener = new zaa(paramInt, paramGoogleApiClient, paramOnConnectionFailedListener);
    this.zacv.put(paramInt, paramOnConnectionFailedListener);
    if ((this.mStarted) && (localObject == null))
    {
      paramOnConnectionFailedListener = String.valueOf(paramGoogleApiClient);
      localObject = new StringBuilder(String.valueOf(paramOnConnectionFailedListener).length() + 11);
      ((StringBuilder)localObject).append("connecting ");
      ((StringBuilder)localObject).append(paramOnConnectionFailedListener);
      paramGoogleApiClient.connect();
    }
  }
  
  protected final void zaa(ConnectionResult paramConnectionResult, int paramInt)
  {
    if (paramInt < 0)
    {
      Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
      return;
    }
    Object localObject = (zaa)this.zacv.get(paramInt);
    if (localObject != null)
    {
      zaa(paramInt);
      localObject = ((zaa)localObject).zacy;
      if (localObject != null) {
        ((GoogleApiClient.OnConnectionFailedListener)localObject).onConnectionFailed(paramConnectionResult);
      }
    }
  }
  
  protected final void zao()
  {
    int i = 0;
    while (i < this.zacv.size())
    {
      zaa localzaa = zab(i);
      if (localzaa != null) {
        localzaa.zacx.connect();
      }
      i += 1;
    }
  }
  
  final class zaa
    implements GoogleApiClient.OnConnectionFailedListener
  {
    public final int zacw;
    public final GoogleApiClient zacx;
    public final GoogleApiClient.OnConnectionFailedListener zacy;
    
    public zaa(int paramInt, GoogleApiClient paramGoogleApiClient, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      this.zacw = paramInt;
      this.zacx = paramGoogleApiClient;
      this.zacy = paramOnConnectionFailedListener;
      paramGoogleApiClient.registerConnectionFailedListener(this);
    }
    
    public final void onConnectionFailed(@NonNull ConnectionResult paramConnectionResult)
    {
      String str = String.valueOf(paramConnectionResult);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 27);
      localStringBuilder.append("beginFailureResolution for ");
      localStringBuilder.append(str);
      zaj.this.zab(paramConnectionResult, this.zacw);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */