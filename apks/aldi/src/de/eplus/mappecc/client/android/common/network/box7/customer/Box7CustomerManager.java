package de.eplus.mappecc.client.android.common.network.box7.customer;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.network.box7.IBox7ManagerCallback;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.restclient.api.AddressesApi;
import de.eplus.mappecc.client.android.common.restclient.api.CustomersApi;
import de.eplus.mappecc.client.android.common.restclient.api.SimCardsApi;
import de.eplus.mappecc.client.android.common.restclient.api.ThirdPartyApi;
import de.eplus.mappecc.client.android.common.restclient.model.AddressModel;
import de.eplus.mappecc.client.android.common.restclient.model.CustomerBaseModel;
import de.eplus.mappecc.client.android.common.restclient.model.CustomerModel;
import de.eplus.mappecc.client.android.common.restclient.model.EmailVerificationModel;
import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.ErrorModel;
import de.eplus.mappecc.client.android.common.restclient.model.SimcardBaseModel;
import de.eplus.mappecc.client.android.common.restclient.model.ThirdPartyServiceSettingsModel;
import de.eplus.mappecc.client.android.common.restclient.model.VerifiedEmailUpdateModel;
import java.util.List;
import javax.inject.Inject;
import retrofit2.Call;

public class Box7CustomerManager
  implements IBox7CustomerManager
{
  private final AddressesApi addressesApi;
  private final Box7Cache box7cache;
  private final CustomersApi customersApi;
  private final Localizer localizer;
  private final SimCardsApi simCardsApi;
  private final ThirdPartyApi thirdPartyApi;
  
  @Inject
  public Box7CustomerManager(AddressesApi paramAddressesApi, CustomersApi paramCustomersApi, ThirdPartyApi paramThirdPartyApi, SimCardsApi paramSimCardsApi, Box7Cache paramBox7Cache, Localizer paramLocalizer)
  {
    this.addressesApi = paramAddressesApi;
    this.customersApi = paramCustomersApi;
    this.thirdPartyApi = paramThirdPartyApi;
    this.simCardsApi = paramSimCardsApi;
    this.box7cache = paramBox7Cache;
    this.localizer = paramLocalizer;
  }
  
  public void getBasicSimcardInfo(IBox7ManagerCallback<List<SimcardBaseModel>> paramIBox7ManagerCallback)
  {
    this.simCardsApi.getSimcardsForSubscriptionWithBrand("alditalk", this.box7cache.getSubscriptionId()).enqueue(getBasicSimcardInfoCallback(paramIBox7ManagerCallback));
  }
  
  @NonNull
  protected Box7CallbackWrapper<List<SimcardBaseModel>> getBasicSimcardInfoCallback(IBox7ManagerCallback<List<SimcardBaseModel>> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  @NonNull
  protected Box7CallbackWrapper<List<AddressModel>> getBox7CallbackWrapper(IBox7ManagerCallback<List<AddressModel>> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  @NonNull
  protected Box7CustomerChangedCallbackWrapper<EmptyModel> getCustomerChangedCallback(IBox7ManagerCallback<EmptyModel> paramIBox7ManagerCallback)
  {
    return new Box7CustomerChangedCallbackWrapper(paramIBox7ManagerCallback);
  }
  
  @NonNull
  protected Box7CallbackWrapper<ThirdPartyServiceSettingsModel> getUpdateBarriersCallback(IBox7ManagerCallback<ThirdPartyServiceSettingsModel> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  public void resendEmailVerification(IBox7ManagerCallback<EmptyModel> paramIBox7ManagerCallback)
  {
    EmailVerificationModel localEmailVerificationModel = new EmailVerificationModel();
    localEmailVerificationModel.setBaseUrl(this.localizer.getString(2131691318));
    this.customersApi.startEmailVerification("alditalk", this.box7cache.getSubscriptionId(), localEmailVerificationModel).enqueue(getCustomerChangedCallback(paramIBox7ManagerCallback));
  }
  
  public void startEmailVerification(String paramString, IBox7ManagerCallback<EmptyModel> paramIBox7ManagerCallback)
  {
    VerifiedEmailUpdateModel localVerifiedEmailUpdateModel = new VerifiedEmailUpdateModel();
    localVerifiedEmailUpdateModel.setBaseUrl(this.localizer.getString(2131691318));
    localVerifiedEmailUpdateModel.setEmail(paramString);
    this.customersApi.startVerifiedEmailUpdate("alditalk", this.box7cache.getSubscriptionId(), localVerifiedEmailUpdateModel).enqueue(getCustomerChangedCallback(paramIBox7ManagerCallback));
  }
  
  public void updateBarriers(ThirdPartyServiceSettingsModel paramThirdPartyServiceSettingsModel, IBox7ManagerCallback<ThirdPartyServiceSettingsModel> paramIBox7ManagerCallback)
  {
    this.thirdPartyApi.updateThirdPartyServiceSettingsForSubscriptionWithBrand("alditalk", this.box7cache.getSubscriptionId(), paramThirdPartyServiceSettingsModel).enqueue(getUpdateBarriersCallback(paramIBox7ManagerCallback));
  }
  
  public void updateCustomer(CustomerModel paramCustomerModel, String paramString, IBox7ManagerCallback<CustomerBaseModel> paramIBox7ManagerCallback)
  {
    this.customersApi.maintainCustomerWithBrand("alditalk", paramString, paramCustomerModel).enqueue(new Box7CallbackWrapper(paramIBox7ManagerCallback));
  }
  
  public void updateCustomerAddress(AddressModel paramAddressModel, String paramString, IBox7ManagerCallback<AddressModel> paramIBox7ManagerCallback)
  {
    this.addressesApi.maintainCustomerAddressWithBrand("alditalk", paramString, paramAddressModel).enqueue(new Box7CustomerChangedCallbackWrapper(paramIBox7ManagerCallback));
  }
  
  public void validateAddress(AddressModel paramAddressModel, IBox7ManagerCallback<List<AddressModel>> paramIBox7ManagerCallback)
  {
    this.addressesApi.validateAddressWithBrand("alditalk", paramAddressModel.getZip(), paramAddressModel.getCity(), paramAddressModel.getStreet(), paramAddressModel.getHouseNumber(), "").enqueue(getBox7CallbackWrapper(paramIBox7ManagerCallback));
  }
  
  class Box7CustomerChangedCallbackWrapper<T>
    extends Box7CallbackWrapper<T>
  {
    public Box7CustomerChangedCallbackWrapper()
    {
      super();
    }
    
    public void onSuccess(T paramT, String paramString, ErrorModel paramErrorModel)
    {
      Box7CustomerManager.this.box7cache.setCustomerModel(null);
      super.onSuccess(paramT, paramString, paramErrorModel);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/customer/Box7CustomerManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */