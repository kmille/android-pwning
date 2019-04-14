package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.CustomerBaseModel;
import de.eplus.mappecc.client.android.common.restclient.model.CustomerModel;
import de.eplus.mappecc.client.android.common.restclient.model.EmailVerificationModel;
import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.VerifiedEmailUpdateModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public abstract interface CustomersApi
{
  @GET("brands/{brand}/customers")
  public abstract Call<CustomerModel> getCustomerByQueryParameterWithBrand(@Path("brand") String paramString1, @Query("accountScope") String paramString2);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/customers")
  public abstract Call<CustomerModel> getCustomerForSubscriptionAsyncWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Query("accountScope") String paramString3);
  
  @GET("brands/{brand}/customerinfos")
  public abstract Call<CustomerBaseModel> getCustomerWithBrand(@Path("brand") String paramString);
  
  @PUT("brands/{brand}/customers/{customerId}")
  public abstract Call<CustomerBaseModel> maintainCustomerWithBrand(@Path("brand") String paramString1, @Path("customerId") String paramString2, @Body CustomerModel paramCustomerModel);
  
  @POST("brands/{brand}/customers/{customerId}/email_verification")
  public abstract Call<EmptyModel> startEmailVerification(@Path("brand") String paramString1, @Path("customerId") String paramString2, @Body EmailVerificationModel paramEmailVerificationModel);
  
  @PUT("brands/{brand}/customers/{customerId}/verified_email")
  public abstract Call<EmptyModel> startVerifiedEmailUpdate(@Path("brand") String paramString1, @Path("customerId") String paramString2, @Body VerifiedEmailUpdateModel paramVerifiedEmailUpdateModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/CustomersApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */