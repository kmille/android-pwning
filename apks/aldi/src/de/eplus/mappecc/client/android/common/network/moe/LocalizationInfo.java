package de.eplus.mappecc.client.android.common.network.moe;

import android.content.Context;
import android.content.res.AssetManager;
import android.support.annotation.NonNull;
import java.io.IOException;
import javax.inject.Inject;

public class LocalizationInfo
{
  private static String[] assetList;
  private final Context context;
  
  @Inject
  public LocalizationInfo(@NonNull Context paramContext)
  {
    this.context = paramContext;
  }
  
  @NonNull
  public String getSupportedLanguageCode(@NonNull String paramString)
  {
    String str = paramString;
    if (!verifyLanguageIsSupported(paramString))
    {
      c.a.a.e("Device has unsupported language", new Object[0]);
      str = this.context.getString(2131691325);
    }
    return str;
  }
  
  public boolean verifyLanguageIsSupported(@NonNull String paramString)
  {
    try
    {
      if (assetList == null) {
        assetList = this.context.getAssets().list("locale");
      }
      String[] arrayOfString = assetList;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append("_moe_version");
      boolean bool = org.apache.a.c.a.a(arrayOfString, localStringBuilder.toString());
      return bool;
    }
    catch (IOException paramString)
    {
      for (;;) {}
    }
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/LocalizationInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */