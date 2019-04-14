package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.ThirdPartyServicePaymentsModel;
import de.eplus.mappecc.client.android.common.restclient.model.ThirdPartyServiceSettingsModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public abstract interface ThirdPartyApi
{
  @GET("brands/{brand}/subscriptions/{subscriptionId}/third_party_service_payments")
  public abstract Call<ThirdPartyServicePaymentsModel> getThirdPartyServicePaymentsForSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/third_party_service_settings")
  public abstract Call<ThirdPartyServiceSettingsModel> getThirdPartyServiceSettingsForSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @PUT("brands/{brand}/subscriptions/{subscriptionId}/third_party_service_settings")
  public abstract Call<ThirdPartyServiceSettingsModel> updateThirdPartyServiceSettingsForSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body ThirdPartyServiceSettingsModel paramThirdPartyServiceSettingsModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/ThirdPartyApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */