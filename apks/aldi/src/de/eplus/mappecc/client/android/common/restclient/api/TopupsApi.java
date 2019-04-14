package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupByPaymentMethodModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupConfigurationModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupConfigurationRecordModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupHistoryModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidVoucherModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public abstract interface TopupsApi
{
  @POST("brands/{brand}/subscriptions/{subscriptionId}/topups/configurations/records")
  public abstract Call<PrepaidTopupConfigurationRecordModel> createTopupConfigurationTypeWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body PrepaidTopupConfigurationRecordModel paramPrepaidTopupConfigurationRecordModel);
  
  @DELETE("brands/{brand}/subscriptions/{subscriptionId}/topups/configurations/records/{configurationType}")
  public abstract Call<EmptyModel> deleteTopupConfigurationTypeWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Path("configurationType") String paramString3);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/topups")
  public abstract Call<PrepaidTopupHistoryModel> getSubscriptionTopupsWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/topups_documents")
  public abstract Call<Void> getSubscriptionTopupsWithBrandAsPdf(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/topups/configurations")
  public abstract Call<PrepaidTopupConfigurationModel> topupConfigurationTypeWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @POST("brands/{brand}/subscriptions/{subscriptionId}/topups/direct_debits")
  public abstract Call<PrepaidTopupByPaymentMethodModel> topupDirectDebitWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body PrepaidTopupByPaymentMethodModel paramPrepaidTopupByPaymentMethodModel);
  
  @POST("brands/{brand}/subscriptions/{subscriptionId}/topups/payment_methods/active")
  public abstract Call<PrepaidTopupByPaymentMethodModel> topupPaymentMethodWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body PrepaidTopupByPaymentMethodModel paramPrepaidTopupByPaymentMethodModel);
  
  @POST("brands/{brand}/subscriptions/{subscriptionId}/topup_voucher")
  public abstract Call<PrepaidVoucherModel> topupVoucherWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body PrepaidVoucherModel paramPrepaidVoucherModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/TopupsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */