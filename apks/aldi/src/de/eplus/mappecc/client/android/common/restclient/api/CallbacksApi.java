package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.CallbackFrontendCategoriesModel;
import de.eplus.mappecc.client.android.common.restclient.model.CallbackRequestModel;
import de.eplus.mappecc.client.android.common.restclient.model.CallbackRequestsModel;
import de.eplus.mappecc.client.android.common.restclient.model.CallbackTimeSlotsModel;
import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public abstract interface CallbacksApi
{
  @POST("brands/{brand}/subscriptions/{subscriptionId}/callback_requests")
  public abstract Call<CallbackRequestModel> createCallbackRequestWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body CallbackRequestModel paramCallbackRequestModel);
  
  @DELETE("brands/{brand}/subscriptions/{subscriptionId}/callback_requests/{callbackRequestId}")
  public abstract Call<EmptyModel> deleteCallbackRequestWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Path("callbackRequestId") String paramString3);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/callback_requests/frontend_categories")
  public abstract Call<CallbackFrontendCategoriesModel> getCallbackFrontendCategoriesForSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/customers/{customerId}/callback_requests")
  public abstract Call<CallbackRequestsModel> getCallbackRequestsForCustomerWithBrand(@Path("brand") String paramString1, @Path("customerId") String paramString2);
  
  @GET("brands/{brand}/callback_requests/categories/{categoryId}/time_slots")
  public abstract Call<CallbackTimeSlotsModel> getCallbackRequestsTimeSlotsByCategoryWithBrand(@Path("brand") String paramString1, @Path("categoryId") String paramString2);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/callback_requests")
  public abstract Call<CallbackRequestsModel> getCallbackRequestsWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @PUT("brands/{brand}/subscriptions/{subscriptionId}/callback_requests/{callbackRequestId}")
  public abstract Call<CallbackRequestModel> updateCallbackRequestWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Path("callbackRequestId") String paramString3, @Body CallbackRequestModel paramCallbackRequestModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/CallbacksApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */