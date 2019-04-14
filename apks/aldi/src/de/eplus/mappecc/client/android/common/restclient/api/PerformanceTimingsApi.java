package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.PerformanceTimingModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public abstract interface PerformanceTimingsApi
{
  @POST("brands/{brand}/performance_timings")
  public abstract Call<EmptyModel> createPerformanceTimings(@Path("brand") String paramString, @Body PerformanceTimingModel paramPerformanceTimingModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/PerformanceTimingsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */