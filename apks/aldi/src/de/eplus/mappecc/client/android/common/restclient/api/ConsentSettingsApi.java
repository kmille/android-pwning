package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.ConsentSettingModel;
import de.eplus.mappecc.client.android.common.restclient.model.ConsentSettingsReminderModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public abstract interface ConsentSettingsApi
{
  @GET("brands/{brand}/subscriptions/{subscriptionId}/consent_settings")
  public abstract Call<ConsentSettingModel> getConsentSettingsForCustomerWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2);
  
  @PUT("brands/{brand}/subscriptions/{subscriptionId}/consent_settings")
  public abstract Call<ConsentSettingModel> putConsentSettingsForCustomerWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body ConsentSettingModel paramConsentSettingModel);
  
  @PUT("brands/{brand}/subscriptions/{subscriptionId}/consent_settings_reminder")
  public abstract Call<ConsentSettingsReminderModel> putConsentSettingsReminderForCustomerWithBrand(@Path("brand") String paramString1, @Path("subscriptionId") String paramString2, @Body ConsentSettingsReminderModel paramConsentSettingsReminderModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/ConsentSettingsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */