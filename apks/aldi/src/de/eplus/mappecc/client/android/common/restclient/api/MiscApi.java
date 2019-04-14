package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.BrandPropertyModel;
import de.eplus.mappecc.client.android.common.restclient.model.BrandTariffTypePropertyModel;
import de.eplus.mappecc.client.android.common.restclient.model.ContactNumberModel;
import de.eplus.mappecc.client.android.common.restclient.model.FeedbackModel;
import de.eplus.mappecc.client.android.common.restclient.model.IccIdConversionModel;
import de.eplus.mappecc.client.android.common.restclient.model.PlainPhoneNumberModel;
import de.eplus.mappecc.client.android.common.restclient.model.VersionModel;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public abstract interface MiscApi
{
  @POST("brands/{brand}/feedbacks")
  public abstract Call<FeedbackModel> createFeedbackWithBrand(@Path("brand") String paramString, @Body FeedbackModel paramFeedbackModel);
  
  @GET("brands/{brand}/properties")
  public abstract Call<BrandPropertyModel> getPropertiesWithBrand(@Path("brand") String paramString);
  
  @GET("brands/{brand}/tarifftype_properties")
  public abstract Call<BrandTariffTypePropertyModel> getTariffTypePropertiesWithBrand(@Path("brand") String paramString);
  
  @POST("brands/{brand}/iccid_conversion")
  public abstract Call<IccIdConversionModel> iccidConversionWithBrand(@Path("brand") String paramString, @Body IccIdConversionModel paramIccIdConversionModel);
  
  @POST("brands/{brand}/phone_number_parsing")
  public abstract Call<ContactNumberModel> parsePhoneNumbersWithBrand(@Path("brand") String paramString, @Body List<PlainPhoneNumberModel> paramList);
  
  @GET("version")
  public abstract Call<VersionModel> triggerVersion();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/MiscApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */