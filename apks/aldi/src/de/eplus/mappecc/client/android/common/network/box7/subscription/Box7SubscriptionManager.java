package de.eplus.mappecc.client.android.common.network.box7.subscription;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.network.box7.IBox7ManagerCallback;
import de.eplus.mappecc.client.android.common.restclient.api.PacksApi;
import de.eplus.mappecc.client.android.common.restclient.api.SubscriptionsApi;
import de.eplus.mappecc.client.android.common.restclient.api.TopupsApi;
import de.eplus.mappecc.client.android.common.restclient.api.UsagesApi;
import de.eplus.mappecc.client.android.common.restclient.model.BalanceMonthlyOverviewModel;
import de.eplus.mappecc.client.android.common.restclient.model.ConnectionHistoryModel;
import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.ErrorModel;
import de.eplus.mappecc.client.android.common.restclient.model.PartnerPackConnector;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidMyTariffPageModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupByPaymentMethodModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupConfigurationRecordModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupConfigurationRecordModel.TypeEnum;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidVoucherModel;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionModel;
import de.eplus.mappecc.client.android.common.restclient.model.SubstitutePackModel;
import javax.inject.Inject;
import org.joda.time.DateTime;
import retrofit2.Call;

public class Box7SubscriptionManager
  implements IBox7SubscriptionManager
{
  @Inject
  Box7Cache box7Cache;
  private final PacksApi packApi;
  private final SubscriptionsApi subscriptionsApi;
  private final TopupsApi topupsApi;
  private final UsagesApi usagesApi;
  
  @Inject
  public Box7SubscriptionManager(PacksApi paramPacksApi, TopupsApi paramTopupsApi, SubscriptionsApi paramSubscriptionsApi, UsagesApi paramUsagesApi)
  {
    this.packApi = paramPacksApi;
    this.topupsApi = paramTopupsApi;
    this.subscriptionsApi = paramSubscriptionsApi;
    this.usagesApi = paramUsagesApi;
  }
  
  @Deprecated
  public void bookPack(SubstitutePackModel paramSubstitutePackModel, IBox7ManagerCallback<SubscriptionModel> paramIBox7ManagerCallback)
  {
    this.packApi.bookPackWithBrand("alditalk", this.box7Cache.getSubscriptionId(), paramSubstitutePackModel).enqueue(getSubstitutePackModelCallbackWrapper(paramIBox7ManagerCallback));
  }
  
  @Deprecated
  public void cancelPack(String paramString, IBox7ManagerCallback<SubscriptionModel> paramIBox7ManagerCallback)
  {
    this.packApi.cancelPackWithBrand("alditalk", "my_subscription_id", paramString, "cancel").enqueue(getSubstitutePackModelCallbackWrapper(paramIBox7ManagerCallback));
  }
  
  @Deprecated
  public void createPartnerPackConnector(PartnerPackConnector paramPartnerPackConnector, IBox7ManagerCallback<PartnerPackConnector> paramIBox7ManagerCallback)
  {
    this.packApi.createPartnerPackConnectorWithBrand("alditalk", this.box7Cache.getSubscriptionId(), paramPartnerPackConnector).enqueue(getPartnerPackConnectorCallbackWrapper(paramIBox7ManagerCallback));
  }
  
  public void createTopupConfigurationForMethod(PrepaidTopupConfigurationRecordModel paramPrepaidTopupConfigurationRecordModel, IBox7ManagerCallback<PrepaidTopupConfigurationRecordModel> paramIBox7ManagerCallback)
  {
    this.topupsApi.createTopupConfigurationTypeWithBrand("alditalk", this.box7Cache.getSubscriptionId(), paramPrepaidTopupConfigurationRecordModel).enqueue(getPrepaidTopupConfigurationCallbackWrapper(paramIBox7ManagerCallback));
  }
  
  public void deleteTopupConfigurationMethod(PrepaidTopupConfigurationRecordModel paramPrepaidTopupConfigurationRecordModel, IBox7ManagerCallback<EmptyModel> paramIBox7ManagerCallback)
  {
    this.topupsApi.deleteTopupConfigurationTypeWithBrand("alditalk", this.box7Cache.getSubscriptionId(), paramPrepaidTopupConfigurationRecordModel.getType().getValue()).enqueue(getTopupConfigurationCallbackWrapper(paramIBox7ManagerCallback));
  }
  
  public void getBalanceMonthlyOverview(DateTime paramDateTime, IBox7ManagerCallback<BalanceMonthlyOverviewModel> paramIBox7ManagerCallback)
  {
    this.subscriptionsApi.getSubscriptionBalanceMonthlyOverviewWithBrand("alditalk", this.box7Cache.getSubscriptionId(), paramDateTime.toString()).enqueue(getBalanceMonthlyOverviewCallbackWrapper(paramIBox7ManagerCallback));
  }
  
  @NonNull
  protected Box7CallbackWrapper<BalanceMonthlyOverviewModel> getBalanceMonthlyOverviewCallbackWrapper(IBox7ManagerCallback<BalanceMonthlyOverviewModel> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  public void getConnectionDetails(DateTime paramDateTime1, DateTime paramDateTime2, String paramString, IBox7ManagerCallback<ConnectionHistoryModel> paramIBox7ManagerCallback)
  {
    this.subscriptionsApi.getSubscriptionConnectionDetailsWithBrand("alditalk", this.box7Cache.getSubscriptionId(), paramDateTime1.toString(), paramDateTime2.toString(), paramString).enqueue(getConnectionDetailsCallbackWrapper(paramIBox7ManagerCallback));
  }
  
  @NonNull
  protected Box7CallbackWrapper<ConnectionHistoryModel> getConnectionDetailsCallbackWrapper(IBox7ManagerCallback<ConnectionHistoryModel> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  public void getMyTariffData(IBox7ManagerCallback<PrepaidMyTariffPageModel> paramIBox7ManagerCallback)
  {
    this.usagesApi.getMyTariffPageWithBrandRx("alditalk").enqueue(getMyTariffDataCallbackWrapper(paramIBox7ManagerCallback));
  }
  
  @NonNull
  protected Box7CallbackWrapper<PrepaidMyTariffPageModel> getMyTariffDataCallbackWrapper(IBox7ManagerCallback<PrepaidMyTariffPageModel> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  @NonNull
  protected Box7CallbackWrapper<PartnerPackConnector> getPartnerPackConnectorCallbackWrapper(IBox7ManagerCallback<PartnerPackConnector> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  @NonNull
  protected Box7CallbackWrapper<PrepaidTopupConfigurationRecordModel> getPrepaidTopupConfigurationCallbackWrapper(IBox7ManagerCallback<PrepaidTopupConfigurationRecordModel> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  @NonNull
  protected Box7CallbackWrapper<PrepaidVoucherModel> getPrepaidVoucherCallbackWrapper(IBox7ManagerCallback<PrepaidVoucherModel> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  @NonNull
  protected Box7SubscriptionCallbackWrapper getSubstitutePackModelCallbackWrapper(IBox7ManagerCallback<SubscriptionModel> paramIBox7ManagerCallback)
  {
    return new Box7SubscriptionCallbackWrapper(paramIBox7ManagerCallback);
  }
  
  @NonNull
  protected Box7CallbackWrapper<PrepaidTopupByPaymentMethodModel> getTopupByPaymentMethodCallbackWrapper(IBox7ManagerCallback<PrepaidTopupByPaymentMethodModel> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  @NonNull
  protected Box7CallbackWrapper<EmptyModel> getTopupConfigurationCallbackWrapper(IBox7ManagerCallback<EmptyModel> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  public void topup(PrepaidTopupByPaymentMethodModel paramPrepaidTopupByPaymentMethodModel, IBox7ManagerCallback<PrepaidTopupByPaymentMethodModel> paramIBox7ManagerCallback)
  {
    this.topupsApi.topupPaymentMethodWithBrand("alditalk", this.box7Cache.getSubscriptionId(), paramPrepaidTopupByPaymentMethodModel).enqueue(getTopupByPaymentMethodCallbackWrapper(paramIBox7ManagerCallback));
  }
  
  public void topupWithVoucher(PrepaidVoucherModel paramPrepaidVoucherModel, IBox7ManagerCallback<PrepaidVoucherModel> paramIBox7ManagerCallback)
  {
    this.topupsApi.topupVoucherWithBrand("alditalk", this.box7Cache.getSubscriptionId(), paramPrepaidVoucherModel).enqueue(getPrepaidVoucherCallbackWrapper(paramIBox7ManagerCallback));
  }
  
  class Box7SubscriptionCallbackWrapper
    extends Box7CallbackWrapper<SubscriptionModel>
  {
    public Box7SubscriptionCallbackWrapper(IBox7ManagerCallback paramIBox7ManagerCallback)
    {
      super();
    }
    
    protected void onSuccess(SubscriptionModel paramSubscriptionModel, String paramString, ErrorModel paramErrorModel)
    {
      Box7SubscriptionManager.this.box7Cache.setSubscriptionModel(paramSubscriptionModel);
      super.onSuccess(paramSubscriptionModel, paramString, paramErrorModel);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/subscription/Box7SubscriptionManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */