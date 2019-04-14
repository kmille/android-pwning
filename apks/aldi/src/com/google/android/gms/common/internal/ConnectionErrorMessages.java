package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.SimpleArrayMap;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.concurrent.GuardedBy;

public final class ConnectionErrorMessages
{
  @GuardedBy("sCache")
  private static final SimpleArrayMap<String, String> zaof = new SimpleArrayMap();
  
  public static String getAppName(Context paramContext)
  {
    String str1 = paramContext.getPackageName();
    try
    {
      String str2 = Wrappers.packageManager(paramContext).getApplicationLabel(str1).toString();
      return str2;
    }
    catch (PackageManager.NameNotFoundException|NullPointerException localNameNotFoundException)
    {
      for (;;) {}
    }
    paramContext = paramContext.getApplicationInfo().name;
    if (TextUtils.isEmpty(paramContext)) {
      return str1;
    }
    return paramContext;
  }
  
  public static String getDefaultNotificationChannelName(Context paramContext)
  {
    return paramContext.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
  }
  
  @NonNull
  public static String getErrorDialogButtonMessage(Context paramContext, int paramInt)
  {
    paramContext = paramContext.getResources();
    switch (paramInt)
    {
    default: 
      paramInt = 17039370;
    }
    for (;;)
    {
      return paramContext.getString(paramInt);
      paramInt = com.google.android.gms.base.R.string.common_google_play_services_enable_button;
      continue;
      paramInt = com.google.android.gms.base.R.string.common_google_play_services_update_button;
      continue;
      paramInt = com.google.android.gms.base.R.string.common_google_play_services_install_button;
    }
  }
  
  @NonNull
  public static String getErrorMessage(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    String str = getAppName(paramContext);
    if (paramInt != 5)
    {
      if (paramInt != 7)
      {
        if (paramInt != 9)
        {
          if (paramInt != 20)
          {
            switch (paramInt)
            {
            default: 
              switch (paramInt)
              {
              default: 
                return localResources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, new Object[] { str });
              case 18: 
                return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_updating_text, new Object[] { str });
              case 17: 
                return zaa(paramContext, "common_google_play_services_sign_in_failed_text", str);
              }
              return zaa(paramContext, "common_google_play_services_api_unavailable_text", str);
            case 3: 
              return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_text, new Object[] { str });
            case 2: 
              if (DeviceProperties.isWearableWithoutPlayStore(paramContext)) {
                return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_wear_update_text);
              }
              return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_text, new Object[] { str });
            }
            return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_text, new Object[] { str });
          }
          return zaa(paramContext, "common_google_play_services_restricted_profile_text", str);
        }
        return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_unsupported_text, new Object[] { str });
      }
      return zaa(paramContext, "common_google_play_services_network_error_text", str);
    }
    return zaa(paramContext, "common_google_play_services_invalid_account_text", str);
  }
  
  @NonNull
  public static String getErrorNotificationMessage(Context paramContext, int paramInt)
  {
    if (paramInt == 6) {
      return zaa(paramContext, "common_google_play_services_resolution_required_text", getAppName(paramContext));
    }
    return getErrorMessage(paramContext, paramInt);
  }
  
  @NonNull
  public static String getErrorNotificationTitle(Context paramContext, int paramInt)
  {
    String str1;
    if (paramInt == 6) {
      str1 = zaa(paramContext, "common_google_play_services_resolution_required_title");
    } else {
      str1 = getErrorTitle(paramContext, paramInt);
    }
    String str2 = str1;
    if (str1 == null) {
      str2 = paramContext.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker);
    }
    return str2;
  }
  
  @Nullable
  public static String getErrorTitle(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    if (paramInt != 20)
    {
      switch (paramInt)
      {
      default: 
        switch (paramInt)
        {
        default: 
          paramContext = new StringBuilder(33);
          paramContext.append("Unexpected error code ");
          paramContext.append(paramInt);
          paramContext = paramContext.toString();
        }
      case 11: 
      case 10: 
      case 9: 
      case 8: 
        for (;;)
        {
          Log.e("GoogleApiAvailability", paramContext);
          return null;
          Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
          return zaa(paramContext, "common_google_play_services_sign_in_failed_title");
          paramContext = "One of the API components you attempted to connect to is not available.";
          continue;
          paramContext = "The application is not licensed to the user.";
          continue;
          paramContext = "Developer error occurred. Please see logs for detailed information";
          continue;
          paramContext = "Google Play services is invalid. Cannot recover.";
          continue;
          paramContext = "Internal error occurred. Please see logs for detailed information";
        }
      case 7: 
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        return zaa(paramContext, "common_google_play_services_network_error_title");
      case 5: 
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        return zaa(paramContext, "common_google_play_services_invalid_account_title");
      case 4: 
      case 6: 
        return null;
      case 3: 
        return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
      case 2: 
        return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
      }
      return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
    }
    Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
    return zaa(paramContext, "common_google_play_services_restricted_profile_title");
  }
  
  @Nullable
  private static String zaa(Context paramContext, String paramString)
  {
    synchronized (zaof)
    {
      String str = (String)zaof.get(paramString);
      if (str != null) {
        return str;
      }
      paramContext = GooglePlayServicesUtil.getRemoteResource(paramContext);
      if (paramContext == null) {
        return null;
      }
      int i = paramContext.getIdentifier(paramString, "string", "com.google.android.gms");
      if (i == 0)
      {
        paramContext = String.valueOf(paramString);
        if (paramContext.length() != 0) {
          "Missing resource: ".concat(paramContext);
        } else {
          new String("Missing resource: ");
        }
        return null;
      }
      paramContext = paramContext.getString(i);
      if (TextUtils.isEmpty(paramContext))
      {
        paramContext = String.valueOf(paramString);
        if (paramContext.length() != 0) {
          "Got empty resource: ".concat(paramContext);
        } else {
          new String("Got empty resource: ");
        }
        return null;
      }
      zaof.put(paramString, paramContext);
      return paramContext;
    }
  }
  
  private static String zaa(Context paramContext, String paramString1, String paramString2)
  {
    Resources localResources = paramContext.getResources();
    paramString1 = zaa(paramContext, paramString1);
    paramContext = paramString1;
    if (paramString1 == null) {
      paramContext = localResources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
    }
    return String.format(localResources.getConfiguration().locale, paramContext, new Object[] { paramString2 });
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/ConnectionErrorMessages.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */