package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.AddressModel;
import de.eplus.mappecc.client.android.common.restclient.model.AddressValidationResult;
import de.eplus.mappecc.client.android.common.restclient.model.BillingAddressModel;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public abstract interface AddressesApi
{
  @POST("brands/{brand}/accounts/{accountId}/addresses")
  public abstract Call<BillingAddressModel> createAccountAddressWithBrand(@Path("brand") String paramString1, @Path("accountId") String paramString2, @Body BillingAddressModel paramBillingAddressModel);
  
  @POST("brands/{brand}/address_validations")
  public abstract Call<AddressValidationResult> createAddressValidationWithBrand(@Path("brand") String paramString, @Body AddressModel paramAddressModel);
  
  @POST("brands/{brand}/customeraddresses/")
  public abstract Call<AddressModel> createCustomerAddressWithBrand(@Path("brand") String paramString, @Body AddressModel paramAddressModel);
  
  @PUT("brands/{brand}/customeraddresses/{addressId}")
  public abstract Call<AddressModel> maintainCustomerAddressWithBrand(@Path("brand") String paramString1, @Path("addressId") String paramString2, @Body AddressModel paramAddressModel);
  
  @PUT("brands/{brand}/accounts/{accountId}/addresses/{addressId}")
  public abstract Call<BillingAddressModel> updateAccountAddressWithBrand(@Path("brand") String paramString1, @Path("accountId") String paramString2, @Path("addressId") String paramString3, @Body BillingAddressModel paramBillingAddressModel);
  
  @GET("validateaddresses")
  public abstract Call<List<AddressModel>> validateAddress(@Query("zip") String paramString1, @Query("city") String paramString2, @Query("street") String paramString3, @Query("houseno") String paramString4, @Query("pobox") String paramString5);
  
  @GET("brands/{brand}/validateaddresses")
  public abstract Call<List<AddressModel>> validateAddressWithBrand(@Path("brand") String paramString1, @Query("zip") String paramString2, @Query("city") String paramString3, @Query("street") String paramString4, @Query("houseno") String paramString5, @Query("pobox") String paramString6);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/AddressesApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */