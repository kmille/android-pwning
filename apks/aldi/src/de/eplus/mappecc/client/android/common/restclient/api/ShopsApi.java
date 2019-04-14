package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.ShopFinderShopsModel;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public abstract interface ShopsApi
{
  @GET("brands/{brand}/shop-finder")
  public abstract Call<ShopFinderShopsModel> getShopsForLatitudeAndLongitudeRx(@Path("brand") String paramString, @Query("latitude") Double paramDouble1, @Query("longitude") Double paramDouble2, @Query("skills") List<String> paramList);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/ShopsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */