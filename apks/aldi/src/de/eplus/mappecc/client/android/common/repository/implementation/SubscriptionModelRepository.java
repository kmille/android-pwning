package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.repository.NetworkCacheStorageManager;
import de.eplus.mappecc.client.android.common.restclient.api.SubscriptionsApi;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionModel;
import retrofit2.Call;

public class SubscriptionModelRepository
  implements ISubscriptionModelRepository
{
  private final Box7Cache box7Cache;
  private final SubscriptionsApi subscriptionsApi;
  
  public SubscriptionModelRepository(@NonNull Box7Cache paramBox7Cache, @NonNull SubscriptionsApi paramSubscriptionsApi)
  {
    this.box7Cache = paramBox7Cache;
    this.subscriptionsApi = paramSubscriptionsApi;
  }
  
  public void clearStoragedData()
  {
    this.box7Cache.clearSubscptionModel();
  }
  
  public void get(@NonNull Box7Callback<SubscriptionModel> paramBox7Callback)
  {
    new NetworkCacheStorageManager(paramBox7Callback)
    {
      public void createCall(@NonNull Box7Callback<SubscriptionModel> paramAnonymousBox7Callback)
      {
        SubscriptionModelRepository.this.subscriptionsApi.getSubscriptionWithBrand("alditalk", SubscriptionModelRepository.this.box7Cache.getSubscriptionId()).enqueue(new Box7CallbackWrapper(paramAnonymousBox7Callback));
      }
      
      protected SubscriptionModel getFromCache()
      {
        return SubscriptionModelRepository.this.box7Cache.getSubscriptionModel();
      }
      
      public boolean isCached()
      {
        return SubscriptionModelRepository.this.box7Cache.getSubscriptionModel() != null;
      }
      
      protected void saveInCache(SubscriptionModel paramAnonymousSubscriptionModel)
      {
        SubscriptionModelRepository.this.box7Cache.setSubscriptionModel(paramAnonymousSubscriptionModel);
      }
    };
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/SubscriptionModelRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */