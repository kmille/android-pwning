package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import java.io.File;

final class zzbr
{
  private static int version()
  {
    try
    {
      int i = Integer.parseInt(Build.VERSION.SDK);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      String str;
      for (;;) {}
    }
    str = String.valueOf(Build.VERSION.SDK);
    if (str.length() != 0) {
      str = "Invalid version number: ".concat(str);
    } else {
      str = new String("Invalid version number: ");
    }
    zzdi.e(str);
    return 0;
  }
  
  @TargetApi(9)
  static boolean zzde(String paramString)
  {
    if (version() < 9) {
      return false;
    }
    paramString = new File(paramString);
    paramString.setReadable(false, false);
    paramString.setWritable(false, false);
    paramString.setReadable(true, true);
    paramString.setWritable(true, true);
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzbr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */