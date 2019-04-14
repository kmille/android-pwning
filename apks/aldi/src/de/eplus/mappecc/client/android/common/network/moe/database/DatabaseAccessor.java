package de.eplus.mappecc.client.android.common.network.moe.database;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import de.eplus.mappecc.client.android.common.network.moe.core.Language;
import de.eplus.mappecc.client.android.common.network.moe.core.Localization;
import java.util.ArrayList;
import java.util.List;

public abstract interface DatabaseAccessor
{
  public abstract void beginTransaction();
  
  public abstract void clearLocalizationDatabase();
  
  public abstract void close();
  
  public abstract void commitTransaction();
  
  @NonNull
  public abstract Language createLanguage(String paramString, int paramInt);
  
  public abstract void createLocalization(Language paramLanguage, String paramString1, String paramString2, boolean paramBoolean);
  
  @NonNull
  public abstract ArrayList<String> getImagesValues(Language paramLanguage);
  
  @Nullable
  public abstract Language getLanguage(String paramString);
  
  @Nullable
  public abstract Localization getLocalization(String paramString, Language paramLanguage);
  
  @NonNull
  public abstract List<String> getStreamingResourceKeys(Language paramLanguage);
  
  public abstract void updateLanguageVersion(Language paramLanguage, int paramInt);
  
  public abstract void updateLocalization(Localization paramLocalization, String paramString, boolean paramBoolean);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/database/DatabaseAccessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */