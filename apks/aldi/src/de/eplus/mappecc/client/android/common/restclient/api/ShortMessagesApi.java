package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.SmsBatchModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public abstract interface ShortMessagesApi
{
  @POST("brands/{brand}/batch_short_message_validations")
  public abstract Call<SmsBatchModel> sendBatchShortMessageValidationWithBrand(@Path("brand") String paramString, @Body SmsBatchModel paramSmsBatchModel);
  
  @POST("brands/{brand}/batch_short_messages")
  public abstract Call<SmsBatchModel> sendBatchShortMessageWithBrand(@Path("brand") String paramString, @Body SmsBatchModel paramSmsBatchModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/ShortMessagesApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */