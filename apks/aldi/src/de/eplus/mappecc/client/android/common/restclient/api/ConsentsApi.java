package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.ConsentGroupModel;
import de.eplus.mappecc.client.android.common.restclient.model.ConsentModel;
import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.RevokeConsentModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public abstract interface ConsentsApi
{
  @GET("brands/{brand}/subscriptions/{subscriptionId}/consents")
  public abstract Call<ConsentGroupModel> getConsentsForCustomerWithBrand(@Path("subscriptionId") String paramString1, @Path("brand") String paramString2);
  
  @PUT("brands/{brand}/subscriptions/{subscriptionId}/consents")
  public abstract Call<EmptyModel> putConsentsForCustomerWithBrand(@Path("subscriptionId") String paramString1, @Path("brand") String paramString2, @Body ConsentModel paramConsentModel);
  
  @PUT("brands/{brand}/subscriptions/{subscriptionId}/revoke-consents")
  public abstract Call<EmptyModel> putConsentsRevokeForCustomerWithBrand(@Path("subscriptionId") String paramString1, @Path("brand") String paramString2, @Body RevokeConsentModel paramRevokeConsentModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/ConsentsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */