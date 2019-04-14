package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.LoggingsModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public abstract interface LoggingApi
{
  @POST("brands/{brand}/oses/{os}/loggings")
  public abstract Call<Void> logging(@Path("os") String paramString1, @Path("brand") String paramString2, @Body LoggingsModel paramLoggingsModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/LoggingApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */