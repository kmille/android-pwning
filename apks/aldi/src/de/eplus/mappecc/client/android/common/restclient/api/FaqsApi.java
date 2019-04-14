package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.FaqModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public abstract interface FaqsApi
{
  @GET("apps/{app}/versions/{appVersion}/oses/{os}/subscriptions/{subscriptionId}/faqs")
  public abstract Call<FaqModel> getFaqsForSubscription(@Path("appVersion") String paramString1, @Path("os") String paramString2, @Path("subscriptionId") String paramString3, @Path("app") String paramString4, @Path("appVersion") String paramString5, @Path("os") String paramString6);
  
  @GET("apps/{app}/versions/{appVersion}/oses/{os}/faqs")
  public abstract Call<FaqModel> getGeneralFaqs(@Path("appVersion") String paramString1, @Path("os") String paramString2, @Path("app") String paramString3, @Path("appVersion") String paramString4, @Path("os") String paramString5);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/FaqsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */