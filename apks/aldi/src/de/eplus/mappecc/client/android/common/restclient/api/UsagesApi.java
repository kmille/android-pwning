package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.DSLUsageBandwidthHistory;
import de.eplus.mappecc.client.android.common.restclient.model.DeferredResultResponseEntityPrepaidBalanceAndCounters;
import de.eplus.mappecc.client.android.common.restclient.model.DeferredResultResponseEntityPrepaidMyTariffPageModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidBalanceAndCounters;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidMyTariffPageModel;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionInclusiveVolumeModel;
import de.eplus.mappecc.client.android.common.restclient.model.UsageMonitor;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public abstract interface UsagesApi
{
  @GET("brands/{brand}/balance_counters/{subscriptionId}")
  public abstract Call<DeferredResultResponseEntityPrepaidBalanceAndCounters> getBalanceAndCountersWithBrandAndSubscriptionRx(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/balance_counters")
  public abstract Call<PrepaidBalanceAndCounters> getBalanceAndCountersWithBrandRx(@Path("brand") String paramString);
  
  @GET("brands/{brand}/dsl_usage_bandwidth_history/{subscriptionId}")
  public abstract Call<DSLUsageBandwidthHistory> getDslUsageBandwidthHistoryForSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/inclusive_volume/{subscriptionId}")
  public abstract Call<SubscriptionInclusiveVolumeModel> getInclusiveVolumeForSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/my_tariff_page/{subscriptionId}")
  public abstract Call<DeferredResultResponseEntityPrepaidMyTariffPageModel> getMyTariffPageWithBrandAndSubscriptionRx(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/my_tariff_page")
  public abstract Call<PrepaidMyTariffPageModel> getMyTariffPageWithBrandRx(@Path("brand") String paramString);
  
  @GET("brands/{brand}/outstanding_usagemonitors_rt")
  public abstract Call<UsageMonitor> getOutstandingUsageMonitorRtWithBrand(@Path("brand") String paramString);
  
  @GET("brands/{brand}/outstanding_usagemonitors")
  public abstract Call<UsageMonitor> getOutstandingUsageMonitorWithBrand(@Path("brand") String paramString);
  
  @GET("brands/{brand}/usagemonitors/{subscriptionId}")
  public abstract Call<UsageMonitor> getUsageMonitorForSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @GET("brands/{brand}/usagemonitors_rt/{subscriptionId}")
  public abstract Call<UsageMonitor> getUsageMonitorRtForSubscriptionWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Header("X-Box7-ClientId") String paramString3);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/UsagesApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */