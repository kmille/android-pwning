package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.CallSettingsModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public abstract interface CallSettingsApi
{
  @GET("brands/{brand}/subscriptions/{subscriptionId}/call_settings")
  public abstract Call<CallSettingsModel> getCallSettingsForSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @PUT("brands/{brand}/subscriptions/{subscriptionId}/call_settings")
  public abstract Call<CallSettingsModel> updateCallSettingsForSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body CallSettingsModel paramCallSettingsModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/CallSettingsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */