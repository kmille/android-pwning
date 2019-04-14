package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.ReserveCancellationConfigModel;
import de.eplus.mappecc.client.android.common.restclient.model.ReserveCancellationReasonModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public abstract interface SubscriptionsCancellationApi
{
  @GET("brands/{brand}/subscriptions/{subscriptionId}/reserveCancellation/config")
  public abstract Call<ReserveCancellationConfigModel> getConfigurationsForReserveCancellation(@Path("subscriptionId") String paramString);
  
  @POST("brands/{brand}/subscriptions/{subscriptionId}/reserveCancellation")
  public abstract Call<ReserveCancellationReasonModel> reserveCancellation(@Path("subscriptionId") String paramString, @Body ReserveCancellationReasonModel paramReserveCancellationReasonModel);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/reserveCancellation/confirmation")
  public abstract Call<Void> reserveCancellationPdf(@Path("subscriptionId") String paramString);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/SubscriptionsCancellationApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */