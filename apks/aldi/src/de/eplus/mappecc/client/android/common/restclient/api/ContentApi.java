package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.ConditionModel;
import de.eplus.mappecc.client.android.common.restclient.model.RequestInfo;
import de.eplus.mappecc.client.android.common.restclient.model.TooltipsModel;
import de.eplus.mappecc.client.android.common.restclient.model.UsageMonitor;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Path;

public abstract interface ContentApi
{
  @GET("pack_terms_and_conditions/{productCode}")
  public abstract Call<ConditionModel> getPackTermsAndConditions(@Path("productCode") String paramString);
  
  @GET("brands/{brand}/pack_terms_and_conditions/{productCode}")
  public abstract Call<ConditionModel> getPackTermsAndConditionsWithBrand(@Path("brand") String paramString1, @Path("productCode") String paramString2);
  
  @GET("tariff_terms_and_conditions/{productCode}")
  public abstract Call<ConditionModel> getTariffTermsAndConditions(@Path("productCode") String paramString);
  
  @GET("brands/{brand}/tariff_terms_and_conditions/{productCode}")
  public abstract Call<ConditionModel> getTariffTermsAndConditionsWithBrand(@Path("brand") String paramString1, @Path("productCode") String paramString2);
  
  @GET("apps/{app}/versions/{appVersion}/oses/{os}/tooltips/{tooltipsVersion}")
  public abstract Call<UsageMonitor> getTooltips(@Path("app") String paramString1, @Path("appVersion") String paramString2, @Path("os") String paramString3, @Path("tooltipsVersion") String paramString4);
  
  @GET("apps/{app}/versions/{appVersion}/oses/{os}/tooltips")
  public abstract Call<TooltipsModel> getTooltipsRedirect(@Path("app") String paramString1, @Path("appVersion") String paramString2, @Path("os") String paramString3, @Path("app") String paramString4, @Body RequestInfo paramRequestInfo);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/ContentApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */