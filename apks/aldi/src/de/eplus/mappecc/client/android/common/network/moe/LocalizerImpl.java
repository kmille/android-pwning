package de.eplus.mappecc.client.android.common.network.moe;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.text.Spanned;
import c.a.a;
import de.eplus.mappecc.client.android.common.network.moe.core.Language;
import de.eplus.mappecc.client.android.common.network.moe.core.Localization;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.network.moe.database.DatabaseAccessor;
import de.eplus.mappecc.client.android.common.utils.StringHelper;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.inject.Singleton;
import org.apache.a.c.h;

@Singleton
public class LocalizerImpl
  implements Localizer
{
  private final Context context;
  private final DatabaseAccessor databaseAccessor;
  private Language language;
  private final LocalizationInfo localizationInfo;
  
  public LocalizerImpl(@NonNull Context paramContext, @Nullable DatabaseAccessor paramDatabaseAccessor, @Nullable LocalizationInfo paramLocalizationInfo)
  {
    this.context = paramContext;
    this.databaseAccessor = paramDatabaseAccessor;
    this.localizationInfo = paramLocalizationInfo;
    if (this.databaseAccessor != null) {
      if (paramLocalizationInfo != null) {
        paramContext = paramLocalizationInfo.getSupportedLanguageCode(Locale.getDefault().getLanguage());
      } else {
        paramContext = Locale.getDefault().getLanguage();
      }
    }
    for (paramContext = this.databaseAccessor.getLanguage(paramContext);; paramContext = null)
    {
      this.language = paramContext;
      return;
    }
  }
  
  private String getDefault(@Nullable String paramString)
  {
    if (paramString == null) {
      return "";
    }
    try
    {
      int i = this.context.getResources().getIdentifier(paramString, "string", this.context.getPackageName());
      paramString = this.context.getString(i);
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;) {}
    }
    return "";
  }
  
  private String getKeyAsString(@StringRes int paramInt)
  {
    try
    {
      String str = this.context.getResources().getResourceEntryName(paramInt);
      return str;
    }
    catch (Exception localException)
    {
      a.c(localException, "Can not parse from R.string.xxx to String", new Object[0]);
    }
    return null;
  }
  
  private String performReplacements(@NonNull String paramString, @Nullable Map<String, String> paramMap)
  {
    if (paramMap == null) {
      return paramString;
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      paramString = paramString.replaceAll(String.format("\\$\\{%s[^\\}]*\\}", new Object[] { localEntry.getKey() }), ((String)localEntry.getValue()).replace("$", "\\$"));
    }
    return paramString;
  }
  
  @Deprecated
  public boolean getBoolean(int paramInt)
  {
    return Boolean.parseBoolean(getString(paramInt));
  }
  
  public boolean getBoolean(int paramInt, boolean paramBoolean)
  {
    String str = getString(paramInt);
    if (str.equalsIgnoreCase("true")) {
      return true;
    }
    if (str.equalsIgnoreCase("false")) {
      return false;
    }
    return paramBoolean;
  }
  
  public int getColorOrDefault(int paramInt1, int paramInt2)
  {
    String str = getString(paramInt1);
    if (h.c(str)) {
      return paramInt2;
    }
    try
    {
      paramInt1 = Color.parseColor(str);
      return paramInt1;
    }
    catch (IllegalArgumentException localIllegalArgumentException) {}
    return paramInt2;
  }
  
  @NonNull
  public Spanned getHtmlString(int paramInt)
  {
    return getHtmlString(paramInt, null);
  }
  
  @NonNull
  public Spanned getHtmlString(int paramInt, @Nullable Map<String, String> paramMap)
  {
    String str = getKeyAsString(paramInt);
    return StringHelper.fromHtml(getStringOrDefault(str, getDefault(str), paramMap));
  }
  
  @NonNull
  public Spanned getHtmlString(@NonNull String paramString, @Nullable Map<String, String> paramMap)
  {
    return StringHelper.fromHtml(getStringOrDefault(paramString, getDefault(paramString), paramMap));
  }
  
  public int getInteger(int paramInt1, int paramInt2)
  {
    String str = getString(paramInt1);
    try
    {
      paramInt1 = Integer.parseInt(str);
      return paramInt1;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return paramInt2;
  }
  
  @Deprecated
  @Nullable
  public Integer getInteger(int paramInt)
  {
    String str = getString(paramInt);
    try
    {
      paramInt = Integer.parseInt(str);
      return Integer.valueOf(paramInt);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;) {}
    }
    return null;
  }
  
  public long getLong(int paramInt, long paramLong)
  {
    String str = getString(paramInt);
    try
    {
      long l = Long.parseLong(str);
      return l;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return paramLong;
  }
  
  public String getNonHtmlString(int paramInt)
  {
    return getNonHtmlString(paramInt, null);
  }
  
  @NonNull
  public String getNonHtmlString(int paramInt, @Nullable Map<String, String> paramMap)
  {
    return getNonHtmlString(getKeyAsString(paramInt), paramMap);
  }
  
  public String getNonHtmlString(@Nullable String paramString)
  {
    return getNonHtmlString(paramString, null);
  }
  
  @NonNull
  public String getNonHtmlString(@Nullable String paramString, @Nullable Map<String, String> paramMap)
  {
    return TextViewHtmlAdapter.removeHtml(getStringOrDefault(paramString, getDefault(paramString), paramMap));
  }
  
  @NonNull
  public String getString(int paramInt)
  {
    String str = getKeyAsString(paramInt);
    return getStringOrDefault(str, getDefault(str), null);
  }
  
  public String getString(int paramInt, @Nullable Map<String, String> paramMap)
  {
    String str = getKeyAsString(paramInt);
    return getStringOrDefault(str, getDefault(str), paramMap);
  }
  
  @NonNull
  public String getString(@Nullable String paramString)
  {
    return getStringOrDefault(paramString, getDefault(paramString), null);
  }
  
  @Nullable
  public String getString(@NonNull String paramString, @Nullable Map<String, String> paramMap)
  {
    return getStringOrDefault(paramString, getDefault(paramString), paramMap);
  }
  
  @NonNull
  public String getStringOrDefault(@Nullable String paramString)
  {
    return getStringOrDefault(paramString, getDefault(paramString), null);
  }
  
  @NonNull
  public String getStringOrDefault(@Nullable String paramString1, @NonNull String paramString2)
  {
    return getStringOrDefault(paramString1, paramString2, null);
  }
  
  @NonNull
  public String getStringOrDefault(@Nullable String paramString1, @NonNull String paramString2, @Nullable Map<String, String> paramMap)
  {
    if ((this.databaseAccessor != null) && (paramString1 != null))
    {
      this.language = this.databaseAccessor.getLanguage(this.localizationInfo.getSupportedLanguageCode(Locale.getDefault().getLanguage()));
      paramString1 = this.databaseAccessor.getLocalization(paramString1, this.language);
      if ((paramString1 != null) && (paramString1.getValue().startsWith("@StreamingResource@"))) {
        a.f("StreamingResource?!", new Object[0]);
      }
      if (paramString1 != null) {
        return performReplacements(paramString1.getValue(), paramMap);
      }
      return performReplacements(paramString2, paramMap);
    }
    return "";
  }
  
  @NonNull
  public String getStringOrDefault(@Nullable String paramString, @Nullable Map<String, String> paramMap)
  {
    return getStringOrDefault(paramString, getDefault(paramString), paramMap);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/LocalizerImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */