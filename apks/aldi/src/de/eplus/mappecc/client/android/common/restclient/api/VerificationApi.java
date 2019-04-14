package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.ChangeNameVerificationModel;
import de.eplus.mappecc.client.android.common.restclient.model.SohoVerificationModel;
import de.eplus.mappecc.client.android.common.restclient.model.VerificationChangePhoneNumberModel;
import de.eplus.mappecc.client.android.common.restclient.model.VerificationConfigModel;
import de.eplus.mappecc.client.android.common.restclient.model.YoungPeopleVerificationModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public abstract interface VerificationApi
{
  @POST("brands/{brand}/subscriptions/{subscriptionId}/verifications/change-phone-number")
  public abstract Call<VerificationChangePhoneNumberModel> changePhoneNumber(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body VerificationChangePhoneNumberModel paramVerificationChangePhoneNumberModel);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/verifications/soho/config")
  public abstract Call<VerificationConfigModel> getVerificationConfigSoho(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/verifications/youngPeople/config")
  public abstract Call<VerificationConfigModel> getVerificationConfigYoungPeople(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @POST("brands/{brand}/subscriptions/{subscriptionId}/verifications/nameChange")
  public abstract Call<ChangeNameVerificationModel> nameChangeVerification(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Query("file") Object paramObject);
  
  @POST("brands/{brand}/subscriptions/{subscriptionId}/verifications/soho")
  public abstract Call<SohoVerificationModel> sohoVerification(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Query("file") Object paramObject);
  
  @POST("brands/{brand}/subscriptions/{subscriptionId}/verifications/youngPeople")
  public abstract Call<YoungPeopleVerificationModel> youngPeopleVerification(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Query("file") Object paramObject);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/VerificationApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */