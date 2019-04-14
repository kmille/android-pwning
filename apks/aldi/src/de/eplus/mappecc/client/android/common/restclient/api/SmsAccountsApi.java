package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.SmsAccountModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public abstract interface SmsAccountsApi
{
  @GET("brands/{brand}/sms_accounts")
  public abstract Call<SmsAccountModel> getSmsAccountWithBrand(@Path("brand") String paramString);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/SmsAccountsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */