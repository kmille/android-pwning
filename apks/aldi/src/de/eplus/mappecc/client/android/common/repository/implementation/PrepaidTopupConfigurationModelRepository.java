package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.repository.NetworkCacheStorageManager;
import de.eplus.mappecc.client.android.common.restclient.api.TopupsApi;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupConfigurationModel;
import retrofit2.Call;

public class PrepaidTopupConfigurationModelRepository
  implements IPrepaidTopupConfigurationModelRepository
{
  private final Box7Cache box7Cache;
  private final TopupsApi topupsApi;
  
  public PrepaidTopupConfigurationModelRepository(@NonNull Box7Cache paramBox7Cache, @NonNull TopupsApi paramTopupsApi)
  {
    this.box7Cache = paramBox7Cache;
    this.topupsApi = paramTopupsApi;
  }
  
  public void get(@NonNull Box7Callback<PrepaidTopupConfigurationModel> paramBox7Callback)
  {
    new NetworkCacheStorageManager(paramBox7Callback)
    {
      public void createCall(@NonNull Box7Callback<PrepaidTopupConfigurationModel> paramAnonymousBox7Callback)
      {
        PrepaidTopupConfigurationModelRepository.this.topupsApi.topupConfigurationTypeWithBrand("alditalk", PrepaidTopupConfigurationModelRepository.this.box7Cache.getSubscriptionId()).enqueue(new Box7CallbackWrapper(paramAnonymousBox7Callback));
      }
      
      protected PrepaidTopupConfigurationModel getFromCache()
      {
        return PrepaidTopupConfigurationModelRepository.this.box7Cache.getPrepaidTopupConfigurationModel();
      }
      
      public boolean isCached()
      {
        return PrepaidTopupConfigurationModelRepository.this.box7Cache.getPrepaidTopupConfigurationModel() != null;
      }
      
      protected void saveInCache(@Nullable PrepaidTopupConfigurationModel paramAnonymousPrepaidTopupConfigurationModel)
      {
        PrepaidTopupConfigurationModelRepository.this.box7Cache.setPrepaidTopupConfigurationModel(paramAnonymousPrepaidTopupConfigurationModel);
      }
    };
  }
  
  public void getForceNew(@NonNull Box7Callback<PrepaidTopupConfigurationModel> paramBox7Callback)
  {
    new NetworkCacheStorageManager(paramBox7Callback)
    {
      public void createCall(@NonNull Box7Callback<PrepaidTopupConfigurationModel> paramAnonymousBox7Callback)
      {
        PrepaidTopupConfigurationModelRepository.this.topupsApi.topupConfigurationTypeWithBrand("alditalk", PrepaidTopupConfigurationModelRepository.this.box7Cache.getSubscriptionId()).enqueue(new Box7CallbackWrapper(paramAnonymousBox7Callback));
      }
      
      public boolean isCached()
      {
        return false;
      }
      
      protected void saveInCache(@Nullable PrepaidTopupConfigurationModel paramAnonymousPrepaidTopupConfigurationModel)
      {
        PrepaidTopupConfigurationModelRepository.this.box7Cache.setPrepaidTopupConfigurationModel(paramAnonymousPrepaidTopupConfigurationModel);
      }
    };
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/PrepaidTopupConfigurationModelRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */