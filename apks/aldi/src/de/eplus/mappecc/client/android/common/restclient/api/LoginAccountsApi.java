package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.LoginAccountModel;
import de.eplus.mappecc.client.android.common.restclient.model.UpdateMainMsisdnRequestModel;
import de.eplus.mappecc.client.android.common.restclient.model.VerifyNewMainMsisdnRequestModel;
import de.eplus.mappecc.client.android.common.restclient.model.VerifyNewMainMsisdnResponseModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public abstract interface LoginAccountsApi
{
  @POST("brands/{brand}/login_accounts")
  public abstract Call<LoginAccountModel> createLoginAccountWithBrand(@Path("brand") String paramString, @Body LoginAccountModel paramLoginAccountModel);
  
  @GET("brands/{brand}/login_accounts/{login}")
  public abstract Call<LoginAccountModel> getLoginAccountForLoginWithBrand(@Path("brand") String paramString1, @Path("login") String paramString2);
  
  @GET("brands/{brand}/login_accounts")
  public abstract Call<LoginAccountModel> getLoginAccountsWithBrand(@Path("brand") String paramString);
  
  @GET("brands/{brand}/login_accounts/{login}/main_msisdns")
  public abstract Call<LoginAccountModel> getPossibleMainMsisdns(@Path("brand") String paramString1, @Path("login") String paramString2);
  
  @PUT("brands/{brand}/login_accounts/{login}")
  public abstract Call<LoginAccountModel> updateLoginAccountForLoginWithBrand(@Path("brand") String paramString1, @Path("login") String paramString2, @Body LoginAccountModel paramLoginAccountModel);
  
  @PUT("brands/{brand}/login_accounts/{login}/main_msisdns")
  public abstract Call<EmptyModel> updateMainMsisdnForLoginAccount(@Path("brand") String paramString1, @Path("login") String paramString2, @Body UpdateMainMsisdnRequestModel paramUpdateMainMsisdnRequestModel);
  
  @POST("brands/{brand}/login_accounts/{login}")
  public abstract Call<LoginAccountModel> updateMlavNoPutLoginAccountForLoginWithBrand(@Path("brand") String paramString1, @Path("login") String paramString2, @Body LoginAccountModel paramLoginAccountModel);
  
  @POST("brands/{brand}/login_accounts/{login}/main_msisdns/verify")
  public abstract Call<VerifyNewMainMsisdnResponseModel> verifyNewMainMsisdn(@Path("brand") String paramString1, @Path("login") String paramString2, @Body VerifyNewMainMsisdnRequestModel paramVerifyNewMainMsisdnRequestModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/LoginAccountsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */