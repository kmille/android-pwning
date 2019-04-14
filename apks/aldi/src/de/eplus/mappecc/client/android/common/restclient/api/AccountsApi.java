package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.AccountModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public abstract interface AccountsApi
{
  @DELETE("brands/{brand}/accounts/{accountId}/payment_method_registrations/{paymentMethod}")
  public abstract Call<AccountModel> createPaymentMethodDeregistrationForAccountWithBrand(@Path("brand") String paramString1, @Path("accountId") String paramString2, @Path("paymentMethod") String paramString3);
  
  @GET("brands/{brand}/accounts")
  public abstract Call<AccountModel> getAccountWithBrand(@Path("brand") String paramString);
  
  @PUT("brands/{brand}/accounts/{accountId}")
  public abstract Call<AccountModel> maintainAccountWithBrand(@Path("brand") String paramString1, @Path("accountId") String paramString2, @Body AccountModel paramAccountModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/AccountsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */