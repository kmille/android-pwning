package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.PushNotificationSetup;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public abstract interface PushNotificationSetupsApi
{
  @Headers({"Content-Type:application/json"})
  @POST("apps/{app}/oses/{osId}/push_notification_setups")
  public abstract Call<PushNotificationSetup> createPushNotificationSetupWithApp(@Path("osId") Long paramLong, @Path("app") String paramString, @Body PushNotificationSetup paramPushNotificationSetup);
  
  @DELETE("apps/{app}/oses/{osId}/push_notification_setups/{deviceToken}")
  public abstract Call<EmptyModel> deletePushNotificationSetupWithApp(@Path("osId") Long paramLong, @Path("deviceToken") String paramString1, @Path("app") String paramString2);
  
  @GET("apps/{app}/oses/{osId}/push_notification_setups/{deviceToken}")
  public abstract Call<PushNotificationSetup> getPushNotificationSetupWithApp(@Path("app") String paramString1, @Path("osId") Long paramLong, @Path("deviceToken") String paramString2);
  
  @Headers({"Content-Type:application/json"})
  @PUT("apps/{app}/oses/{osId}/push_notification_setups/{deviceToken}")
  public abstract Call<PushNotificationSetup> maintainPushNotificationSetupWithApp(@Path("osId") Long paramLong, @Path("deviceToken") String paramString1, @Path("app") String paramString2, @Body PushNotificationSetup paramPushNotificationSetup);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/PushNotificationSetupsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */