package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.repository.NetworkCacheStorageManager;
import de.eplus.mappecc.client.android.common.restclient.api.CustomersApi;
import de.eplus.mappecc.client.android.common.restclient.model.CustomerModel;
import retrofit2.Call;

public class CustomerModelRepository
  implements ICustomerModelRepository
{
  private final Box7Cache box7Cache;
  private final CustomersApi customersApi;
  
  public CustomerModelRepository(@NonNull Box7Cache paramBox7Cache, @NonNull CustomersApi paramCustomersApi)
  {
    this.box7Cache = paramBox7Cache;
    this.customersApi = paramCustomersApi;
  }
  
  public void clearStoragedData()
  {
    this.box7Cache.clearCustomerModel();
  }
  
  public void get(@NonNull Box7Callback<CustomerModel> paramBox7Callback)
  {
    new NetworkCacheStorageManager(paramBox7Callback)
    {
      public void createCall(@NonNull Box7Callback<CustomerModel> paramAnonymousBox7Callback)
      {
        CustomerModelRepository.this.customersApi.getCustomerForSubscriptionAsyncWithBrand("alditalk", CustomerModelRepository.this.box7Cache.getSubscriptionId(), null).enqueue(new Box7CallbackWrapper(paramAnonymousBox7Callback));
      }
      
      protected CustomerModel getFromCache()
      {
        return CustomerModelRepository.this.box7Cache.getCustomerModel();
      }
      
      public boolean isCached()
      {
        return CustomerModelRepository.this.box7Cache.getCustomerModel() != null;
      }
      
      protected void saveInCache(@Nullable CustomerModel paramAnonymousCustomerModel)
      {
        CustomerModelRepository.this.box7Cache.setCustomerModel(paramAnonymousCustomerModel);
      }
    };
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/CustomerModelRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */