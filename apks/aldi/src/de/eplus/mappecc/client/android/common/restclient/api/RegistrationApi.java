package de.eplus.mappecc.client.android.common.restclient.api;

import de.eplus.mappecc.client.android.common.restclient.model.EmailValidationRequestModel;
import de.eplus.mappecc.client.android.common.restclient.model.EmailValidationResponseModel;
import de.eplus.mappecc.client.android.common.restclient.model.EmailVerificationRequestModel;
import de.eplus.mappecc.client.android.common.restclient.model.PasswordValidationRequestModel;
import de.eplus.mappecc.client.android.common.restclient.model.PasswordValidationResponseModel;
import de.eplus.mappecc.client.android.common.restclient.model.PiranhaVerificationEmailTokenResponseModel;
import de.eplus.mappecc.client.android.common.restclient.model.SendEmailVerificationRequestModel;
import de.eplus.mappecc.client.android.common.restclient.model.SendEmailVerificationResponseModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public abstract interface RegistrationApi
{
  @POST("brands/{brand}/registration/email-verification")
  public abstract Call<PiranhaVerificationEmailTokenResponseModel> finalEmailValidationToken(@Path("brand") String paramString, @Body EmailVerificationRequestModel paramEmailVerificationRequestModel);
  
  @POST("brands/{brand}/registration/send-email")
  public abstract Call<SendEmailVerificationResponseModel> sendVerificationEmail(@Path("brand") String paramString, @Body SendEmailVerificationRequestModel paramSendEmailVerificationRequestModel);
  
  @POST("brands/{brand}/registration/verify-email")
  public abstract Call<EmailValidationResponseModel> validateEmailToken(@Path("brand") String paramString, @Body EmailValidationRequestModel paramEmailValidationRequestModel);
  
  @POST("brands/{brand}/registration/validate-password")
  public abstract Call<PasswordValidationResponseModel> validatePasswordToken(@Path("brand") String paramString, @Body PasswordValidationRequestModel paramPasswordValidationRequestModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/api/RegistrationApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */