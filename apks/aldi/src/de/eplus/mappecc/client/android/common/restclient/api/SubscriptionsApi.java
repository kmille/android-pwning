package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.BalanceMonthlyOverviewModel;
import de.eplus.mappecc.client.android.common.restclient.model.ConnectionDetailsSubscriptionSettingsModel;
import de.eplus.mappecc.client.android.common.restclient.model.ConnectionHistoryModel;
import de.eplus.mappecc.client.android.common.restclient.model.DataAutomaticUpdateModel;
import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.IndividualOfferBookingModel;
import de.eplus.mappecc.client.android.common.restclient.model.MyHandyBillingReportModel;
import de.eplus.mappecc.client.android.common.restclient.model.OrderStatusInfosModel;
import de.eplus.mappecc.client.android.common.restclient.model.PossibleTariffModel;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionModel;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionsAuthorized;
import de.eplus.mappecc.client.android.common.restclient.model.SubstitutePackModel;
import de.eplus.mappecc.client.android.common.restclient.model.TaCoModel;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public abstract interface SubscriptionsApi
{
  @POST("brands/{brand}/subscriptions/{subscriptionId}/individual_offers")
  public abstract Call<SubscriptionModel> bookIndividualOfferWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body IndividualOfferBookingModel paramIndividualOfferBookingModel);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/order_status_infos")
  public abstract Call<OrderStatusInfosModel> getOrderInfosForSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Query("filter") String paramString3);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/balance_monthly_overview")
  public abstract Call<BalanceMonthlyOverviewModel> getSubscriptionBalanceMonthlyOverviewWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Query("datetime") String paramString3);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/billing_reports")
  public abstract Call<MyHandyBillingReportModel> getSubscriptionBillingReportsWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/connection_details")
  public abstract Call<ConnectionHistoryModel> getSubscriptionConnectionDetailsWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Query("historystartat") String paramString3, @Query("historyendat") String paramString4, @Query("filter") String paramString5);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/connection_details_documents")
  public abstract Call<Void> getSubscriptionConnectionDetailsWithBrandAsPdf(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Query("historystartat") String paramString3, @Query("historyendat") String paramString4, @Query("filter") String paramString5);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/possible_tariffs")
  public abstract Call<List<PossibleTariffModel>> getSubscriptionPossibleTariffsWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/tariff_details")
  public abstract Call<TaCoModel> getSubscriptionTariffDetailsWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}")
  public abstract Call<SubscriptionModel> getSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/subscriptions_authorized")
  public abstract Call<SubscriptionsAuthorized> getSubscriptionsAuthorizedWithBrandAsync(@Path("brand") String paramString);
  
  @POST("brands/{brand}/subscriptions/{subscriptionId}/billing_reports/termination-order")
  public abstract Call<MyHandyBillingReportModel> myHandyterminationOrder(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Header("X-Box7-ClientId") String paramString3);
  
  @PUT("brands/{brand}/subscriptions/{subscriptionId}/connection_details_settings")
  public abstract Call<ConnectionDetailsSubscriptionSettingsModel> putConnectionDetailsSettingsForSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body ConnectionDetailsSubscriptionSettingsModel paramConnectionDetailsSubscriptionSettingsModel);
  
  @PUT("brands/{brand}/subscriptions/{subscriptionId}/data_automatic_settings")
  public abstract Call<DataAutomaticUpdateModel> putDataAutomaticSettingsForSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body DataAutomaticUpdateModel paramDataAutomaticUpdateModel);
  
  @POST("brands/{brand}/subscriptions/{subscriptionId}/tariff_substitution")
  public abstract Call<EmptyModel> substituteTariffWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body SubstitutePackModel paramSubstitutePackModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/SubscriptionsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */