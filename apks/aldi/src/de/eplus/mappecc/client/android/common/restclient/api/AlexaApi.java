package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.ResponseEnvelope;
import retrofit2.Call;
import retrofit2.http.POST;

public abstract interface AlexaApi
{
  @POST("brands/{brand}/alexa")
  public abstract Call<ResponseEnvelope> alexa();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/AlexaApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */