package com.google.android.gms.common.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api.Client;

public class GoogleApiAvailabilityCache
{
  private final SparseIntArray zaor = new SparseIntArray();
  private GoogleApiAvailabilityLight zaos;
  
  public GoogleApiAvailabilityCache()
  {
    this(GoogleApiAvailability.getInstance());
  }
  
  public GoogleApiAvailabilityCache(@NonNull GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight)
  {
    Preconditions.checkNotNull(paramGoogleApiAvailabilityLight);
    this.zaos = paramGoogleApiAvailabilityLight;
  }
  
  public void flush()
  {
    this.zaor.clear();
  }
  
  public int getClientAvailability(@NonNull Context paramContext, @NonNull Api.Client paramClient)
  {
    Preconditions.checkNotNull(paramContext);
    Preconditions.checkNotNull(paramClient);
    if (!paramClient.requiresGooglePlayServices()) {
      return 0;
    }
    int m = paramClient.getMinApkVersion();
    int k = this.zaor.get(m, -1);
    if (k != -1) {
      return k;
    }
    int j = 0;
    int i;
    for (;;)
    {
      i = k;
      if (j >= this.zaor.size()) {
        break;
      }
      i = this.zaor.keyAt(j);
      if ((i > m) && (this.zaor.get(i) == 0))
      {
        i = 0;
        break;
      }
      j += 1;
    }
    j = i;
    if (i == -1) {
      j = this.zaos.isGooglePlayServicesAvailable(paramContext, m);
    }
    this.zaor.put(m, j);
    return j;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/GoogleApiAvailabilityCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */