package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.InvoiceOverviewModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupConfigurationModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupPackBookingOptions;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Streaming;

public abstract interface BillingsApi
{
  @GET("brands/{brand}/subscriptions/{subscriptionId}/billings/{documentId}/{type}")
  @Streaming
  public abstract Call<ResponseBody> getBillingDocumentPartWithBrandForSubscription(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Path("documentId") String paramString3, @Path("type") String paramString4);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/invoice_overviews/{year}.pdf")
  public abstract Call<Void> getInvoiceOverviewPdfWithBrandForSubscription(@Path("brand") String paramString1, @Path("year") String paramString2, @Path("subscriptionId") String paramString3);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/invoices")
  public abstract Call<InvoiceOverviewModel> getInvoicesWithBrandForSubscriptionRx(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/topups/configurations")
  public abstract Call<PrepaidTopupConfigurationModel> getTopupConfigurationTypeWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @PUT("brands/{brand}/subscriptions/{subscriptionId}/topups/configurations/options")
  public abstract Call<EmptyModel> updateTopupConfigurationOptions(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body PrepaidTopupPackBookingOptions paramPrepaidTopupPackBookingOptions);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/BillingsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */