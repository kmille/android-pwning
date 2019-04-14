package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
public class Wrappers
{
  private static Wrappers zzhx = new Wrappers();
  private PackageManagerWrapper zzhw = null;
  
  @KeepForSdk
  public static PackageManagerWrapper packageManager(Context paramContext)
  {
    return zzhx.zzi(paramContext);
  }
  
  @VisibleForTesting
  private final PackageManagerWrapper zzi(Context paramContext)
  {
    try
    {
      if (this.zzhw == null)
      {
        if (paramContext.getApplicationContext() != null) {
          paramContext = paramContext.getApplicationContext();
        }
        this.zzhw = new PackageManagerWrapper(paramContext);
      }
      paramContext = this.zzhw;
      return paramContext;
    }
    finally {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/wrappers/Wrappers.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */