package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.repository.NetworkCacheStorageManager;
import de.eplus.mappecc.client.android.common.restclient.api.ConsentsApi;
import de.eplus.mappecc.client.android.common.restclient.model.ConsentGroupModel;
import de.eplus.mappecc.client.android.common.restclient.model.ConsentModel;
import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.RevokeConsentModel;
import retrofit2.Call;

public class ConsentRepository
  implements IConsentRepository
{
  private final Box7Cache box7Cache;
  private final ConsentsApi consentsApi;
  
  public ConsentRepository(@NonNull ConsentsApi paramConsentsApi, @NonNull Box7Cache paramBox7Cache)
  {
    this.consentsApi = paramConsentsApi;
    this.box7Cache = paramBox7Cache;
  }
  
  public void get(@NonNull Box7Callback<ConsentGroupModel> paramBox7Callback)
  {
    new NetworkCacheStorageManager(paramBox7Callback)
    {
      public void createCall(@NonNull Box7Callback<ConsentGroupModel> paramAnonymousBox7Callback)
      {
        ConsentRepository.this.consentsApi.getConsentsForCustomerWithBrand(ConsentRepository.this.box7Cache.getSubscriptionId(), "alditalk").enqueue(new Box7CallbackWrapper(paramAnonymousBox7Callback));
      }
    };
  }
  
  public void save(@NonNull ConsentModel paramConsentModel, @NonNull Box7Callback<EmptyModel> paramBox7Callback)
  {
    this.consentsApi.putConsentsForCustomerWithBrand(this.box7Cache.getSubscriptionId(), "alditalk", paramConsentModel).enqueue(new Box7CallbackWrapper(paramBox7Callback));
  }
  
  public void saveWithdrawal(@NonNull RevokeConsentModel paramRevokeConsentModel, @NonNull Box7Callback<EmptyModel> paramBox7Callback)
  {
    this.consentsApi.putConsentsRevokeForCustomerWithBrand(this.box7Cache.getSubscriptionId(), "alditalk", paramRevokeConsentModel).enqueue(new Box7CallbackWrapper(paramBox7Callback));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/ConsentRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */