package de.eplus.mappecc.client.android.common.restclient.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public abstract interface DownloadFileMockApi
{
  @GET
  @Streaming
  public abstract Call<ResponseBody> downloadFileWithDynamicUrlSync(@Url String paramString);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/DownloadFileMockApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */