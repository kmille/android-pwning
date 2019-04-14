package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.PhoneNumberPortingModel;
import de.eplus.mappecc.client.android.common.restclient.model.PhoneNumberPrefixModels;
import de.eplus.mappecc.client.android.common.restclient.model.ProviderModels;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public abstract interface PhonenumberPortingApi
{
  @GET("brands/{brand}/subscriptions/{subscriptionId}/phoneNumberPorting/config/phoneNumberPrefix")
  public abstract Call<PhoneNumberPrefixModels> getPossiblePhoneNumberPrefix(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/phoneNumberPorting/config/providers")
  public abstract Call<ProviderModels> getPossibleProviders(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Query("filter") String paramString3);
  
  @POST("brands/{brand}/subscriptions/{subscriptionId}/phoneNumberPorting")
  public abstract Call<PhoneNumberPortingModel> phoneNumberPorting(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body PhoneNumberPortingModel paramPhoneNumberPortingModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/PhonenumberPortingApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */