package com.google.android.gms.common.util;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;

@KeepForSdk
@VisibleForTesting
public class Strings
{
  private static final Pattern zzhf = Pattern.compile("\\$\\{(.*?)\\}");
  
  @Nullable
  @KeepForSdk
  public static String emptyToNull(@Nullable String paramString)
  {
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = null;
    }
    return str;
  }
  
  @KeepForSdk
  public static boolean isEmptyOrWhitespace(@Nullable String paramString)
  {
    return (paramString == null) || (paramString.trim().isEmpty());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/util/Strings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */