package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.restclient.api.PacksApi;
import de.eplus.mappecc.client.android.common.restclient.model.ChangePackModel;
import de.eplus.mappecc.client.android.common.restclient.model.PartnerPackConnector;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionModel;
import de.eplus.mappecc.client.android.common.restclient.model.SubstitutePackModel;
import retrofit2.Call;

public class PacksRepository
  implements IPacksRepository
{
  private final Box7Cache box7Cache;
  private final PacksApi packsApi;
  
  public PacksRepository(@NonNull PacksApi paramPacksApi, @NonNull Box7Cache paramBox7Cache)
  {
    this.packsApi = paramPacksApi;
    this.box7Cache = paramBox7Cache;
  }
  
  public void bookPack(@NonNull SubstitutePackModel paramSubstitutePackModel, @NonNull Box7Callback<SubscriptionModel> paramBox7Callback)
  {
    this.packsApi.bookPackWithBrand("alditalk", this.box7Cache.getSubscriptionId(), paramSubstitutePackModel).enqueue(new Box7CallbackWrapper(paramBox7Callback));
  }
  
  public void cancelPack(@NonNull String paramString, @NonNull Box7Callback<SubscriptionModel> paramBox7Callback)
  {
    this.packsApi.cancelPackWithBrand("alditalk", "my_subscription_id", paramString, "cancel").enqueue(new Box7CallbackWrapper(paramBox7Callback));
  }
  
  public void changeBookedPack(@NonNull ChangePackModel paramChangePackModel, @NonNull Box7Callback<SubscriptionModel> paramBox7Callback)
  {
    this.packsApi.changeBookedPackWithBrand("alditalk", this.box7Cache.getSubscriptionId(), paramChangePackModel).enqueue(new Box7CallbackWrapper(paramBox7Callback));
  }
  
  public void createPartnerPackConnector(@NonNull PartnerPackConnector paramPartnerPackConnector, @NonNull Box7Callback<PartnerPackConnector> paramBox7Callback)
  {
    this.packsApi.createPartnerPackConnectorWithBrand("alditalk", this.box7Cache.getSubscriptionId(), paramPartnerPackConnector).enqueue(new Box7CallbackWrapper(paramBox7Callback));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/PacksRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */