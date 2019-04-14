package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.BankDataValidationModel;
import de.eplus.mappecc.client.android.common.restclient.model.BankValidationResult;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public abstract interface BankaccountsApi
{
  @POST("brands/{brand}/bank_account_validations")
  public abstract Call<BankValidationResult> createBankAccountValidationWithBrand(@Path("brand") String paramString, @Body BankDataValidationModel paramBankDataValidationModel);
  
  @GET("validatebanks")
  public abstract Call<List<BankDataValidationModel>> validateBankAccount(@Query("bankroutingno") String paramString1, @Query("bankaccountno") String paramString2, @Query("iban") String paramString3, @Query("bic") String paramString4, @Query("bankname") String paramString5);
  
  @GET("brands/{brand}/validatebanks")
  public abstract Call<List<BankDataValidationModel>> validateBankAccountWithBrand(@Path("brand") String paramString1, @Query("bankroutingno") String paramString2, @Query("bankaccountno") String paramString3, @Query("iban") String paramString4, @Query("bic") String paramString5, @Query("bankname") String paramString6);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/BankaccountsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */