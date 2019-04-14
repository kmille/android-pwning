package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.PopupContentsModel;
import de.eplus.mappecc.client.android.common.restclient.model.RequestInfo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Path;

public abstract interface PopupContentsApi
{
  @GET("apps/{app}/versions/{appVersion}/oses/{os}/subscriptions/{subscriptionId}/popup_contents/{popup_contentsVersion}")
  public abstract Call<PopupContentsModel> getPopupContents(@Path("appVersion") String paramString1, @Path("os") String paramString2, @Path("subscriptionId") String paramString3, @Path("popup_contentsVersion") String paramString4, @Path("app") String paramString5, @Path("os") String paramString6, @Body RequestInfo paramRequestInfo);
  
  @GET("apps/{app}/versions/{appVersion}/oses/{os}/subscriptions/{subscriptionId}/popup_contents")
  public abstract Call<PopupContentsModel> getPopupContentsRedirect(@Path("appVersion") String paramString1, @Path("os") String paramString2, @Path("subscriptionId") String paramString3, @Path("app") String paramString4, @Path("os") String paramString5, @Body RequestInfo paramRequestInfo);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/PopupContentsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */