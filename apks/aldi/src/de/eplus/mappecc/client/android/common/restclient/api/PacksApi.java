package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.ChangePackModel;
import de.eplus.mappecc.client.android.common.restclient.model.PartnerPackConnector;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionModel;
import de.eplus.mappecc.client.android.common.restclient.model.SubstitutePackModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public abstract interface PacksApi
{
  @POST("brands/{brand}/subscriptions/{subscriptionId}/packs")
  public abstract Call<SubscriptionModel> bookPackWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body SubstitutePackModel paramSubstitutePackModel);
  
  @DELETE("brands/{brand}/subscriptions/{subscriptionId}/packs/{serviceItemCode}")
  public abstract Call<SubscriptionModel> cancelPackWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Path("serviceItemCode") String paramString3, @Query("operation") String paramString4);
  
  @PUT("brands/{brand}/subscriptions/{subscriptionId}/packs")
  public abstract Call<SubscriptionModel> changeBookedPackWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body ChangePackModel paramChangePackModel);
  
  @POST("brands/{brand}/subscriptions/{subscriptionId}/partner_pack_connectors")
  public abstract Call<PartnerPackConnector> createPartnerPackConnectorWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body PartnerPackConnector paramPartnerPackConnector);
  
  @POST("brands/{brand}/subscriptions/{subscriptionId}/pack_substitution")
  public abstract Call<SubscriptionModel> substitutePacksWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body SubstitutePackModel paramSubstitutePackModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/PacksApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */