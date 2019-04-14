package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.MailTemplateModel;
import de.eplus.mappecc.client.android.common.restclient.model.ServiceHotlineModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public abstract interface HotlineApi
{
  @GET("brands/{brand}/templates/{template}")
  public abstract Call<MailTemplateModel> getEmailTemplateForType(@Path("brand") String paramString1, @Path("template") String paramString2, @Query("templateContentType") String paramString3, @Query("subscriptionId") String paramString4);
  
  @GET("brands/{brand}/service_hotline_infos")
  public abstract Call<ServiceHotlineModel> getServiceHotlineModelsWithBrand(@Path("brand") String paramString1, @Query("subscriptionId") String paramString2);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/HotlineApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */