package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.repository.NetworkCacheStorageManager;
import de.eplus.mappecc.client.android.common.restclient.api.ThirdPartyApi;
import de.eplus.mappecc.client.android.common.restclient.model.ThirdPartyServiceSettingsModel;
import retrofit2.Call;

public class ThirdPartyServiceSettingsModelRepository
  implements IThirdPartyServiceSettingsModelRepository
{
  private final Box7Cache box7Cache;
  private final ThirdPartyApi thirdPartyApi;
  
  public ThirdPartyServiceSettingsModelRepository(@NonNull Box7Cache paramBox7Cache, ThirdPartyApi paramThirdPartyApi)
  {
    this.box7Cache = paramBox7Cache;
    this.thirdPartyApi = paramThirdPartyApi;
  }
  
  public void get(@NonNull Box7Callback<ThirdPartyServiceSettingsModel> paramBox7Callback)
  {
    new NetworkCacheStorageManager(paramBox7Callback)
    {
      public void createCall(@NonNull Box7Callback<ThirdPartyServiceSettingsModel> paramAnonymousBox7Callback)
      {
        ThirdPartyServiceSettingsModelRepository.this.thirdPartyApi.getThirdPartyServiceSettingsForSubscriptionWithBrand("alditalk", ThirdPartyServiceSettingsModelRepository.this.box7Cache.getSubscriptionId()).enqueue(new Box7CallbackWrapper(paramAnonymousBox7Callback));
      }
      
      protected ThirdPartyServiceSettingsModel getFromCache()
      {
        return ThirdPartyServiceSettingsModelRepository.this.box7Cache.getThirdPartyServiceSettingsModel();
      }
      
      public boolean isCached()
      {
        return ThirdPartyServiceSettingsModelRepository.this.box7Cache.getThirdPartyServiceSettingsModel() != null;
      }
      
      protected void saveInCache(@Nullable ThirdPartyServiceSettingsModel paramAnonymousThirdPartyServiceSettingsModel)
      {
        ThirdPartyServiceSettingsModelRepository.this.box7Cache.setThirdPartyServiceSettingsModel(paramAnonymousThirdPartyServiceSettingsModel);
      }
    };
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/ThirdPartyServiceSettingsModelRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */