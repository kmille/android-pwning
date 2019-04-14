package de.eplus.mappecc.client.android.common.network.moe;

import android.support.annotation.NonNull;
import c.a.a;
import de.eplus.mappecc.client.android.common.network.moe.core.Language;
import de.eplus.mappecc.client.android.common.network.moe.core.LocalizationProvider;
import de.eplus.mappecc.client.android.common.network.moe.database.DatabaseAccessor;
import java.util.ArrayList;
import java.util.List;

public class LocalizationManager
{
  @NonNull
  private final DatabaseAccessor accessor;
  private Language language;
  @NonNull
  private final LocalizerBatchOperationFactory localizerBatchOperationFactory;
  
  public LocalizationManager(@NonNull Language paramLanguage, @NonNull DatabaseAccessor paramDatabaseAccessor, @NonNull LocalizerBatchOperationFactory paramLocalizerBatchOperationFactory)
  {
    this.language = paramLanguage;
    this.accessor = paramDatabaseAccessor;
    this.localizerBatchOperationFactory = paramLocalizerBatchOperationFactory;
  }
  
  @NonNull
  public LocalizerBatchOperation beginLocalizationUpdate(int paramInt)
  {
    return this.localizerBatchOperationFactory.create(this.language, paramInt);
  }
  
  public ArrayList<String> getImageValues()
  {
    return this.accessor.getImagesValues(this.language);
  }
  
  public String getLanguageCode()
  {
    return this.language.getLanguageCode();
  }
  
  public LocalizationProvider getLocalizationProvider()
  {
    Object localObject = new StringBuilder("de.eplus.mappecc.client.android.localization.LocalizationProvider");
    ((StringBuilder)localObject).append(this.language.getLanguageCode().toUpperCase());
    localObject = ((StringBuilder)localObject).toString();
    try
    {
      localObject = (LocalizationProvider)Class.forName((String)localObject).newInstance();
      return (LocalizationProvider)localObject;
    }
    catch (Exception localException)
    {
      a.c(localException, "Cannot find LocalizationProvider for %s", new Object[] { this.language.getLanguageCode() });
      localException.printStackTrace();
    }
    return null;
  }
  
  @NonNull
  public List<String> getStreamingResourceKeys()
  {
    return this.accessor.getStreamingResourceKeys(this.language);
  }
  
  public int getVersion()
  {
    return this.language.getVersionNumber();
  }
  
  public void insertPreIncludeLocalizations()
  {
    LocalizationProvider localLocalizationProvider = getLocalizationProvider();
    if (localLocalizationProvider != null)
    {
      beginLocalizationUpdate(this.language.getVersionNumber()).createLocalizations(localLocalizationProvider.getStrings()).commit();
      return;
    }
    throw new UnsupportedOperationException("Brand seems to support language, but there is no LocalizationProvider for it.\nYou might need to delete src/main/assets/locale/*.");
  }
  
  public void setLanguage(Language paramLanguage)
  {
    this.language = paramLanguage;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/LocalizationManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */