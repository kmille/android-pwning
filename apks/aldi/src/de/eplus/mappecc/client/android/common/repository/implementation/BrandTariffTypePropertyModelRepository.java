package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.repository.NetworkCacheStorageManager;
import de.eplus.mappecc.client.android.common.restclient.api.MiscApi;
import de.eplus.mappecc.client.android.common.restclient.model.BrandTariffTypePropertyModel;
import javax.inject.Inject;
import javax.inject.Singleton;
import retrofit2.Call;

@Singleton
public class BrandTariffTypePropertyModelRepository
  implements IBrandTariffTypePropertyModelRepository
{
  private final Box7Cache box7Cache;
  private final MiscApi miscApi;
  
  @Inject
  public BrandTariffTypePropertyModelRepository(@NonNull Box7Cache paramBox7Cache, @NonNull MiscApi paramMiscApi)
  {
    this.box7Cache = paramBox7Cache;
    this.miscApi = paramMiscApi;
  }
  
  public void get(@NonNull Box7Callback<BrandTariffTypePropertyModel> paramBox7Callback)
  {
    new NetworkCacheStorageManager(paramBox7Callback)
    {
      public void createCall(@NonNull Box7Callback<BrandTariffTypePropertyModel> paramAnonymousBox7Callback)
      {
        BrandTariffTypePropertyModelRepository.this.miscApi.getTariffTypePropertiesWithBrand("alditalk").enqueue(new Box7CallbackWrapper(paramAnonymousBox7Callback));
      }
      
      protected BrandTariffTypePropertyModel getFromCache()
      {
        return BrandTariffTypePropertyModelRepository.this.box7Cache.getBrandTariffTypePropertyModel();
      }
      
      public boolean isCached()
      {
        return BrandTariffTypePropertyModelRepository.this.box7Cache.getBrandTariffTypePropertyModel() != null;
      }
      
      protected void saveInCache(BrandTariffTypePropertyModel paramAnonymousBrandTariffTypePropertyModel)
      {
        BrandTariffTypePropertyModelRepository.this.box7Cache.setBrandTariffTypePropertyModel(paramAnonymousBrandTariffTypePropertyModel);
      }
    };
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/BrandTariffTypePropertyModelRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */