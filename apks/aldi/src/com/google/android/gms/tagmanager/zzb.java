package com.google.android.gms.tagmanager;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

final class zzb
  implements zzd
{
  zzb(zza paramzza) {}
  
  public final AdvertisingIdClient.Info zzmi()
  {
    String str;
    try
    {
      AdvertisingIdClient.Info localInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza.zza(this.zzaxc));
      return localInfo;
    }
    catch (Exception localException)
    {
      str = "Unknown exception. Could not get the Advertising Id Info.";
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      this.zzaxc.close();
      str = "GooglePlayServicesNotAvailableException getting Advertising Id Info";
    }
    catch (IOException localIOException)
    {
      str = "IOException getting Ad Id Info";
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
    {
      str = "GooglePlayServicesRepairableException getting Advertising Id Info";
    }
    catch (IllegalStateException localIllegalStateException)
    {
      str = "IllegalStateException getting Advertising Id Info";
    }
    zzdi.zzb(str, localIllegalStateException);
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */