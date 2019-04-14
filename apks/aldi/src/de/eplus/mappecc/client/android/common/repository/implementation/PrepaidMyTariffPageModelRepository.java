package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.NetworkCacheStorageManager;
import de.eplus.mappecc.client.android.common.restclient.api.UsagesApi;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidMyTariffPageModel;
import de.eplus.mappecc.client.android.common.utils.OfflineLightUtil;
import de.eplus.mappecc.client.android.common.utils.preferences.ModelPreferences;
import org.joda.time.DateTime;
import retrofit2.Call;

public class PrepaidMyTariffPageModelRepository
  implements IPrepaidMyTariffPageModelRepository
{
  private final Localizer localizer;
  private final ModelPreferences modelPreferences;
  private final UsagesApi usagesApi;
  
  public PrepaidMyTariffPageModelRepository(@NonNull UsagesApi paramUsagesApi, @NonNull ModelPreferences paramModelPreferences, @NonNull Localizer paramLocalizer)
  {
    this.usagesApi = paramUsagesApi;
    this.modelPreferences = paramModelPreferences;
    this.localizer = paramLocalizer;
  }
  
  public void get(@NonNull Box7Callback<PrepaidMyTariffPageModel> paramBox7Callback)
  {
    new NetworkCacheStorageManager(paramBox7Callback)
    {
      public void createCall(@NonNull Box7Callback<PrepaidMyTariffPageModel> paramAnonymousBox7Callback)
      {
        PrepaidMyTariffPageModelRepository.this.usagesApi.getMyTariffPageWithBrandRx("alditalk").enqueue(new Box7CallbackWrapper(paramAnonymousBox7Callback));
      }
      
      @Nullable
      protected PrepaidMyTariffPageModel getSavedOnDevice()
      {
        return PrepaidMyTariffPageModelRepository.this.modelPreferences.loadPrepaidMyTariffPageModel();
      }
      
      @Nullable
      public DateTime getStorageOrCacheTimeStamp()
      {
        return PrepaidMyTariffPageModelRepository.this.modelPreferences.loadPrepaidMyTariffPageModelTimeStamp();
      }
      
      public boolean isSavedOnDevice()
      {
        return (!PrepaidMyTariffPageModelRepository.this.isMaxCacheTimeExceededAndCleanCache()) && (PrepaidMyTariffPageModelRepository.this.modelPreferences.loadPrepaidMyTariffPageModel() != null);
      }
      
      protected void saveSavedOnDevice(@Nullable PrepaidMyTariffPageModel paramAnonymousPrepaidMyTariffPageModel)
      {
        PrepaidMyTariffPageModelRepository.this.modelPreferences.savePrepaidMyTariffPageModelTimeStamp(new DateTime());
        PrepaidMyTariffPageModelRepository.this.modelPreferences.savePrepaidMyTariffPageModel(paramAnonymousPrepaidMyTariffPageModel);
      }
    };
  }
  
  public DateTime getRequestTimeStamp()
  {
    return this.modelPreferences.loadPrepaidMyTariffPageModelTimeStamp();
  }
  
  protected boolean isMaxCacheTimeExceededAndCleanCache()
  {
    boolean bool = OfflineLightUtil.isEnabled(this.localizer);
    int i = OfflineLightUtil.getMaxSecondsCacheTime(this.localizer);
    DateTime localDateTime = getRequestTimeStamp();
    if ((bool) && (localDateTime != null)) {
      return localDateTime.plusSeconds(i).isBeforeNow();
    }
    this.modelPreferences.savePrepaidMyTariffPageModel(null);
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/PrepaidMyTariffPageModelRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */