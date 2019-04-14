package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.OrderInfoModel;
import de.eplus.mappecc.client.android.common.restclient.model.OrderModel;
import de.eplus.mappecc.client.android.common.restclient.model.OrderOverviewContainer;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public abstract interface OrdersApi
{
  @POST("brands/{brand}/subscriptions/{subscriptionId}/orders")
  public abstract Call<OrderModel> createNewOrder(@Path("subscriptionId") String paramString1, @Path("brand") String paramString2, @Body OrderModel paramOrderModel);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/orders/order-infos")
  public abstract Call<OrderInfoModel> showOrderInformationForOrderType(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Query("orderTypes") List<String> paramList, @Query("force") Boolean paramBoolean);
  
  @GET("brands/{brand}/subscriptions/{subscriptionId}/orders")
  public abstract Call<OrderOverviewContainer> showOrderOverview(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/OrdersApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */