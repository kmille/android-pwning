package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.NotActivatedSimcardsModel;
import de.eplus.mappecc.client.android.common.restclient.model.PendingSimcardModel;
import de.eplus.mappecc.client.android.common.restclient.model.SimcardBaseModel;
import de.eplus.mappecc.client.android.common.restclient.model.SimcardModel;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public abstract interface SimCardsApi
{
  @POST("brands/{brand}/subscriptions/{subscriptionId}/simcards/activations")
  public abstract Call<EmptyModel> activateSimcards(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Query("oldIccId") String paramString3, @Body PendingSimcardModel paramPendingSimcardModel);
  
  @DELETE("brands/{brand}/subscriptions/{subscriptionId}/simcards/{iccId}")
  public abstract Call<EmptyModel> deactivateSimcard(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Path("iccId") String paramString3);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/extended_simcards")
  public abstract Call<List<SimcardModel>> getExtendedSimcardsForSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/simcards/not_activated")
  public abstract Call<NotActivatedSimcardsModel> getNotActivatedSimcardsWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Query("iccId") String paramString3);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/simcards")
  public abstract Call<List<SimcardBaseModel>> getSimcardsForSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @PUT("brands/{brand}/subscriptions/{subscriptionId}/simcards")
  public abstract Call<List<SimcardBaseModel>> updateSimCardSettings(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body List<SimcardBaseModel> paramList);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/SimCardsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */