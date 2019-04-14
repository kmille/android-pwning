package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R.string;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
@KeepForSdk
public final class GoogleServices
{
  private static final Object sLock = new Object();
  @GuardedBy("sLock")
  private static GoogleServices zzax;
  private final String zzay;
  private final Status zzaz;
  private final boolean zzba;
  private final boolean zzbb;
  
  @KeepForSdk
  @VisibleForTesting
  GoogleServices(Context paramContext)
  {
    Object localObject = paramContext.getResources();
    int i = ((Resources)localObject).getIdentifier("google_app_measurement_enable", "integer", ((Resources)localObject).getResourcePackageName(R.string.common_google_play_services_unknown_issue));
    boolean bool2 = true;
    boolean bool1 = true;
    if (i != 0)
    {
      if (((Resources)localObject).getInteger(i) == 0) {
        bool1 = false;
      }
      this.zzbb = (bool1 ^ true);
    }
    else
    {
      this.zzbb = false;
      bool1 = bool2;
    }
    this.zzba = bool1;
    String str = zzp.zzc(paramContext);
    localObject = str;
    if (str == null) {
      localObject = new StringResourceValueReader(paramContext).getString("google_app_id");
    }
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      this.zzaz = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
      this.zzay = null;
      return;
    }
    this.zzay = ((String)localObject);
    this.zzaz = Status.RESULT_SUCCESS;
  }
  
  @KeepForSdk
  @VisibleForTesting
  GoogleServices(String paramString, boolean paramBoolean)
  {
    this.zzay = paramString;
    this.zzaz = Status.RESULT_SUCCESS;
    this.zzba = paramBoolean;
    this.zzbb = (paramBoolean ^ true);
  }
  
  @KeepForSdk
  private static GoogleServices checkInitialized(String paramString)
  {
    synchronized (sLock)
    {
      if (zzax != null)
      {
        paramString = zzax;
        return paramString;
      }
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 34);
      localStringBuilder.append("Initialize must be called before ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(".");
      throw new IllegalStateException(localStringBuilder.toString());
    }
  }
  
  @KeepForSdk
  @VisibleForTesting
  static void clearInstanceForTest()
  {
    synchronized (sLock)
    {
      zzax = null;
      return;
    }
  }
  
  @KeepForSdk
  public static String getGoogleAppId()
  {
    return checkInitialized("getGoogleAppId").zzay;
  }
  
  @KeepForSdk
  public static Status initialize(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext, "Context must not be null.");
    synchronized (sLock)
    {
      if (zzax == null) {
        zzax = new GoogleServices(paramContext);
      }
      paramContext = zzax.zzaz;
      return paramContext;
    }
  }
  
  @KeepForSdk
  public static Status initialize(Context arg0, String paramString, boolean paramBoolean)
  {
    Preconditions.checkNotNull(???, "Context must not be null.");
    Preconditions.checkNotEmpty(paramString, "App ID must be nonempty.");
    synchronized (sLock)
    {
      if (zzax != null)
      {
        paramString = zzax.checkGoogleAppId(paramString);
        return paramString;
      }
      paramString = new GoogleServices(paramString, paramBoolean);
      zzax = paramString;
      paramString = paramString.zzaz;
      return paramString;
    }
  }
  
  @KeepForSdk
  public static boolean isMeasurementEnabled()
  {
    GoogleServices localGoogleServices = checkInitialized("isMeasurementEnabled");
    return (localGoogleServices.zzaz.isSuccess()) && (localGoogleServices.zzba);
  }
  
  @KeepForSdk
  public static boolean isMeasurementExplicitlyDisabled()
  {
    return checkInitialized("isMeasurementExplicitlyDisabled").zzbb;
  }
  
  @KeepForSdk
  @VisibleForTesting
  final Status checkGoogleAppId(String paramString)
  {
    if ((this.zzay != null) && (!this.zzay.equals(paramString)))
    {
      paramString = this.zzay;
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 97);
      localStringBuilder.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
      localStringBuilder.append(paramString);
      localStringBuilder.append("'.");
      return new Status(10, localStringBuilder.toString());
    }
    return Status.RESULT_SUCCESS;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/GoogleServices.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */