package de.eplus.mappecc.client.android.common.network.box7.subscription;

import de.eplus.mappecc.client.android.common.network.box7.IBox7ManagerCallback;
import de.eplus.mappecc.client.android.common.restclient.model.BalanceMonthlyOverviewModel;
import de.eplus.mappecc.client.android.common.restclient.model.ConnectionHistoryModel;
import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.PartnerPackConnector;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidMyTariffPageModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupByPaymentMethodModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupConfigurationRecordModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidVoucherModel;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionModel;
import de.eplus.mappecc.client.android.common.restclient.model.SubstitutePackModel;
import org.joda.time.DateTime;

public abstract interface IBox7SubscriptionManager
{
  public abstract void bookPack(SubstitutePackModel paramSubstitutePackModel, IBox7ManagerCallback<SubscriptionModel> paramIBox7ManagerCallback);
  
  public abstract void cancelPack(String paramString, IBox7ManagerCallback<SubscriptionModel> paramIBox7ManagerCallback);
  
  public abstract void createPartnerPackConnector(PartnerPackConnector paramPartnerPackConnector, IBox7ManagerCallback<PartnerPackConnector> paramIBox7ManagerCallback);
  
  public abstract void createTopupConfigurationForMethod(PrepaidTopupConfigurationRecordModel paramPrepaidTopupConfigurationRecordModel, IBox7ManagerCallback<PrepaidTopupConfigurationRecordModel> paramIBox7ManagerCallback);
  
  public abstract void deleteTopupConfigurationMethod(PrepaidTopupConfigurationRecordModel paramPrepaidTopupConfigurationRecordModel, IBox7ManagerCallback<EmptyModel> paramIBox7ManagerCallback);
  
  public abstract void getBalanceMonthlyOverview(DateTime paramDateTime, IBox7ManagerCallback<BalanceMonthlyOverviewModel> paramIBox7ManagerCallback);
  
  public abstract void getConnectionDetails(DateTime paramDateTime1, DateTime paramDateTime2, String paramString, IBox7ManagerCallback<ConnectionHistoryModel> paramIBox7ManagerCallback);
  
  public abstract void getMyTariffData(IBox7ManagerCallback<PrepaidMyTariffPageModel> paramIBox7ManagerCallback);
  
  public abstract void topup(PrepaidTopupByPaymentMethodModel paramPrepaidTopupByPaymentMethodModel, IBox7ManagerCallback<PrepaidTopupByPaymentMethodModel> paramIBox7ManagerCallback);
  
  public abstract void topupWithVoucher(PrepaidVoucherModel paramPrepaidVoucherModel, IBox7ManagerCallback<PrepaidVoucherModel> paramIBox7ManagerCallback);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/subscription/IBox7SubscriptionManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */