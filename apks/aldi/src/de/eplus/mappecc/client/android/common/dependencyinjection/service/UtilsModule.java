package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import android.content.Context;
import android.support.annotation.NonNull;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.component.dialog.olddialog.DialogUtils;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.BrandUtils;
import de.eplus.mappecc.client.android.common.utils.CallExternalAppsUtils;
import de.eplus.mappecc.client.android.common.utils.DeviceUtils;
import de.eplus.mappecc.client.android.common.utils.ErrorUtils;
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import de.eplus.mappecc.client.android.common.utils.ImageUtils;
import de.eplus.mappecc.client.android.common.utils.JsonUtil;
import de.eplus.mappecc.client.android.common.utils.MailVerificationUtil;
import de.eplus.mappecc.client.android.common.utils.PermissionUtils;
import de.eplus.mappecc.client.android.common.utils.SimUtils;
import de.eplus.mappecc.client.android.common.utils.Timer;
import de.eplus.mappecc.client.android.common.utils.UiUtils;
import de.eplus.mappecc.client.android.common.utils.bank.BankUtils;
import de.eplus.mappecc.client.android.common.utils.helper.TEFPasswordHelper;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.ModelPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.NetworkPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.Preferences;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.UserPreferences;
import de.eplus.mappecc.client.android.common.utils.security.crypto.ICrypto;
import de.eplus.mappecc.client.android.feature.rating.RatingPreferences;
import javax.inject.Singleton;

@Module
public class UtilsModule
{
  @Provides
  @Singleton
  static BankUtils provideBankUtils(Localizer paramLocalizer)
  {
    return new BankUtils(paramLocalizer);
  }
  
  @Provides
  @Singleton
  static BrandUtils provideBrandUtils()
  {
    return new BrandUtils();
  }
  
  @Provides
  @Singleton
  static CallExternalAppsUtils provideCallExternalAppsUtils()
  {
    return new CallExternalAppsUtils(B2PApplication.getApplicationContextGlobal());
  }
  
  @Provides
  @Singleton
  static DeviceUtils provideDeviceUtils()
  {
    return new DeviceUtils(B2PApplication.getApplicationContextGlobal());
  }
  
  @Provides
  @Singleton
  static DialogUtils provideDialogUtils()
  {
    return new DialogUtils();
  }
  
  @Provides
  @Singleton
  static ErrorUtils provideErrorUtils()
  {
    return new ErrorUtils();
  }
  
  @Provides
  @Singleton
  static RatingPreferences provideFeedbackPreferences(Preferences paramPreferences)
  {
    return new RatingPreferences(paramPreferences);
  }
  
  @Provides
  @Singleton
  static HotlineUtils provideHotlineUtils(Localizer paramLocalizer)
  {
    return new HotlineUtils(paramLocalizer);
  }
  
  @Provides
  @Singleton
  static ImageUtils provideImageUtils(Localizer paramLocalizer)
  {
    return new ImageUtils(paramLocalizer);
  }
  
  @Provides
  @Singleton
  static JsonUtil provideJsonUtils()
  {
    return new JsonUtil();
  }
  
  @Provides
  @Singleton
  static LoginPreferences provideLoginPreferences(Preferences paramPreferences)
  {
    return new LoginPreferences(paramPreferences);
  }
  
  @Provides
  @Singleton
  static MailVerificationUtil provideMailVerificationUtil()
  {
    return new MailVerificationUtil();
  }
  
  @Provides
  @Singleton
  static ModelPreferences provideModelPreferences(Preferences paramPreferences)
  {
    return new ModelPreferences(paramPreferences);
  }
  
  @Provides
  @Singleton
  static NetworkPreferences provideNetworkPrefernces(Preferences paramPreferences)
  {
    return new NetworkPreferences(paramPreferences);
  }
  
  @Provides
  @Singleton
  static PermissionUtils providePermissionsUtils()
  {
    return new PermissionUtils(B2PApplication.getApplicationContextGlobal());
  }
  
  @Provides
  @Singleton
  static Preferences providePreferences(@NonNull ICrypto paramICrypto)
  {
    return new Preferences(B2PApplication.getApplicationContextGlobal(), paramICrypto);
  }
  
  @Provides
  @Singleton
  static SimUtils provideSimUtils()
  {
    return new SimUtils(B2PApplication.getApplicationContextGlobal());
  }
  
  @Provides
  @Singleton
  static TimeoutPreferences provideTimeOutPreferences(Preferences paramPreferences, Localizer paramLocalizer)
  {
    return new TimeoutPreferences(paramPreferences, paramLocalizer);
  }
  
  @Provides
  @Singleton
  static Timer provideTimer()
  {
    return new Timer(B2PApplication.getApplicationContextGlobal());
  }
  
  @Provides
  @Singleton
  static TrackingHelper provideTrackingHelper(Context paramContext, UserPreferences paramUserPreferences)
  {
    return new TrackingHelper(paramContext, paramUserPreferences);
  }
  
  @Provides
  @Singleton
  static UiUtils provideUiUtils()
  {
    return new UiUtils(B2PApplication.getApplicationContextGlobal());
  }
  
  @Provides
  @Singleton
  static UserPreferences provideUserPreferences(Preferences paramPreferences)
  {
    return new UserPreferences(paramPreferences);
  }
  
  @Provides
  @Singleton
  static TEFPasswordHelper tefPasswordHelper()
  {
    return new TEFPasswordHelper();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */