package de.eplus.mappecc.client.android.common.network.moe.core;

import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.text.Spanned;
import java.util.Map;

public abstract interface Localizer
{
  @Deprecated
  public abstract boolean getBoolean(@StringRes int paramInt);
  
  public abstract boolean getBoolean(@StringRes int paramInt, boolean paramBoolean);
  
  @ColorInt
  public abstract int getColorOrDefault(@StringRes int paramInt1, int paramInt2);
  
  @NonNull
  public abstract Spanned getHtmlString(int paramInt);
  
  @NonNull
  public abstract Spanned getHtmlString(@StringRes int paramInt, @Nullable Map<String, String> paramMap);
  
  @NonNull
  public abstract Spanned getHtmlString(@NonNull String paramString, @Nullable Map<String, String> paramMap);
  
  public abstract int getInteger(@StringRes int paramInt1, int paramInt2);
  
  @Deprecated
  @Nullable
  public abstract Integer getInteger(@StringRes int paramInt);
  
  public abstract long getLong(@StringRes int paramInt, long paramLong);
  
  public abstract String getNonHtmlString(@StringRes int paramInt);
  
  @NonNull
  public abstract String getNonHtmlString(@StringRes int paramInt, @Nullable Map<String, String> paramMap);
  
  public abstract String getNonHtmlString(@Nullable String paramString);
  
  @NonNull
  public abstract String getNonHtmlString(@Nullable String paramString, @Nullable Map<String, String> paramMap);
  
  @NonNull
  public abstract String getString(@StringRes int paramInt);
  
  public abstract String getString(@StringRes int paramInt, @Nullable Map<String, String> paramMap);
  
  @NonNull
  public abstract String getString(@Nullable String paramString);
  
  @Nullable
  public abstract String getString(@NonNull String paramString, @Nullable Map<String, String> paramMap);
  
  @NonNull
  public abstract String getStringOrDefault(@Nullable String paramString);
  
  @NonNull
  public abstract String getStringOrDefault(@Nullable String paramString1, @NonNull String paramString2);
  
  @NonNull
  public abstract String getStringOrDefault(@NonNull String paramString1, @NonNull String paramString2, @Nullable Map<String, String> paramMap);
  
  @NonNull
  public abstract String getStringOrDefault(@Nullable String paramString, @Nullable Map<String, String> paramMap);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/core/Localizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */