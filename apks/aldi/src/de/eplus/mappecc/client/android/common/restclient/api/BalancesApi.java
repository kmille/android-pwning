package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.BalanceModel;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Path;

public abstract interface BalancesApi
{
  @POST("brands/{brand}/balances")
  public abstract Call<BalanceModel> getBalanceModel(@Path("brand") String paramString);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/BalancesApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */