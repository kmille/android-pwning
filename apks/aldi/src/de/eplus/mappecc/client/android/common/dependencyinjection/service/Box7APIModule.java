package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.BuildConfig;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.model.Box7ClientConfig;
import de.eplus.mappecc.client.android.common.network.piranha.LoginManager;
import de.eplus.mappecc.client.android.common.restclient.Box7RestApiLib;
import de.eplus.mappecc.client.android.common.restclient.api.AccountsApi;
import de.eplus.mappecc.client.android.common.restclient.api.AddressesApi;
import de.eplus.mappecc.client.android.common.restclient.api.BalancesApi;
import de.eplus.mappecc.client.android.common.restclient.api.BankaccountsApi;
import de.eplus.mappecc.client.android.common.restclient.api.BillingsApi;
import de.eplus.mappecc.client.android.common.restclient.api.ConsentSettingsApi;
import de.eplus.mappecc.client.android.common.restclient.api.ConsentsApi;
import de.eplus.mappecc.client.android.common.restclient.api.CustomersApi;
import de.eplus.mappecc.client.android.common.restclient.api.LoginAccountsApi;
import de.eplus.mappecc.client.android.common.restclient.api.MiscApi;
import de.eplus.mappecc.client.android.common.restclient.api.PacksApi;
import de.eplus.mappecc.client.android.common.restclient.api.PerformanceTimingsApi;
import de.eplus.mappecc.client.android.common.restclient.api.PushNotificationSetupsApi;
import de.eplus.mappecc.client.android.common.restclient.api.ShortMessagesApi;
import de.eplus.mappecc.client.android.common.restclient.api.SimCardsApi;
import de.eplus.mappecc.client.android.common.restclient.api.SmsAccountsApi;
import de.eplus.mappecc.client.android.common.restclient.api.SubscriptionsApi;
import de.eplus.mappecc.client.android.common.restclient.api.ThirdPartyApi;
import de.eplus.mappecc.client.android.common.restclient.api.TopupsApi;
import de.eplus.mappecc.client.android.common.restclient.api.UsagesApi;
import de.eplus.mappecc.client.android.common.restclient.config.ConfigObject;
import de.eplus.mappecc.client.android.common.restclient.endpoint.LoginEndpoint;
import de.eplus.mappecc.client.android.common.restclient.endpoint.ServiceEndpoint;
import de.eplus.mappecc.client.android.common.utils.preferences.NetworkPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.Preferences;
import de.eplus.mappecc.client.android.common.utils.preferences.UserPreferences;
import de.eplus.mappecc.client.android.feature.splashscreen.endpoint.EndpointManager;
import javax.inject.Singleton;

@Module
public class Box7APIModule
{
  @Provides
  BalancesApi provideBalancesApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (BalancesApi)paramBox7RestApiLib.createService(BalancesApi.class);
  }
  
  @Provides
  Box7RestApiLib provideBox7RestApiLib(@NonNull Box7ClientConfig paramBox7ClientConfig)
  {
    paramBox7ClientConfig = new Box7RestApiLib(paramBox7ClientConfig)
    {
      public SharedPreferences getUserSharedPreferences()
      {
        return B2PApplication.getApplicationContextGlobal().getSharedPreferences("IO", 0);
      }
    };
    paramBox7ClientConfig.configure();
    return paramBox7ClientConfig;
  }
  
  @Provides
  @Singleton
  EndpointManager provideEndpointManager(@NonNull LoginManager paramLoginManager, @NonNull Box7RestApiLib paramBox7RestApiLib, @NonNull Preferences paramPreferences, @NonNull NetworkPreferences paramNetworkPreferences, @NonNull UserPreferences paramUserPreferences, @NonNull Box7Cache paramBox7Cache)
  {
    return new EndpointManager(paramLoginManager, paramBox7RestApiLib, paramPreferences, paramNetworkPreferences, paramUserPreferences, paramBox7Cache);
  }
  
  @Provides
  AccountsApi providesAccountsApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (AccountsApi)paramBox7RestApiLib.createService(AccountsApi.class);
  }
  
  @Provides
  AddressesApi providesAddressesApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (AddressesApi)paramBox7RestApiLib.createService(AddressesApi.class);
  }
  
  @Provides
  BankaccountsApi providesBankaccountsApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (BankaccountsApi)paramBox7RestApiLib.createService(BankaccountsApi.class);
  }
  
  @Provides
  BillingsApi providesBillingsApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (BillingsApi)paramBox7RestApiLib.createService(BillingsApi.class);
  }
  
  @Provides
  @Singleton
  @NonNull
  Box7ClientConfig providesBox7ClientConfig(LoginEndpoint paramLoginEndpoint, ServiceEndpoint paramServiceEndpoint)
  {
    return Box7ClientConfig.fromBuildConfig(paramLoginEndpoint, paramServiceEndpoint);
  }
  
  @Provides
  ConsentsApi providesConsentsApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (ConsentsApi)paramBox7RestApiLib.createService(ConsentsApi.class);
  }
  
  @Provides
  ConsentSettingsApi providesConsentsettingsApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (ConsentSettingsApi)paramBox7RestApiLib.createService(ConsentSettingsApi.class);
  }
  
  @Provides
  CustomersApi providesCustomersApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (CustomersApi)paramBox7RestApiLib.createService(CustomersApi.class);
  }
  
  @Provides
  LoginAccountsApi providesLoginAccountsApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (LoginAccountsApi)paramBox7RestApiLib.createService(LoginAccountsApi.class);
  }
  
  @Provides
  @Singleton
  LoginEndpoint providesLoginEndpoint()
  {
    return BuildConfig.LOGIN_ENDPOINT;
  }
  
  @Provides
  MiscApi providesMiscApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (MiscApi)paramBox7RestApiLib.createService(MiscApi.class);
  }
  
  @Provides
  PacksApi providesPacksApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (PacksApi)paramBox7RestApiLib.createService(PacksApi.class);
  }
  
  @Provides
  PerformanceTimingsApi providesPerformanceTimingsApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (PerformanceTimingsApi)paramBox7RestApiLib.createService(PerformanceTimingsApi.class);
  }
  
  @Provides
  PushNotificationSetupsApi providesPushnotificationsetupsApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (PushNotificationSetupsApi)paramBox7RestApiLib.createService(PushNotificationSetupsApi.class);
  }
  
  @Provides
  @Singleton
  ServiceEndpoint providesServiceEndpoint()
  {
    return BuildConfig.SERVICE_ENDPOINT;
  }
  
  @Provides
  ShortMessagesApi providesShortmessagesApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (ShortMessagesApi)paramBox7RestApiLib.createService(ShortMessagesApi.class);
  }
  
  @Provides
  SimCardsApi providesSimCardsApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (SimCardsApi)paramBox7RestApiLib.createService(SimCardsApi.class);
  }
  
  @Provides
  SmsAccountsApi providesSmsaccountsApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (SmsAccountsApi)paramBox7RestApiLib.createService(SmsAccountsApi.class);
  }
  
  @Provides
  SubscriptionsApi providesSubscriptionsApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (SubscriptionsApi)paramBox7RestApiLib.createService(SubscriptionsApi.class);
  }
  
  @Provides
  ThirdPartyApi providesThirdPartyApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (ThirdPartyApi)paramBox7RestApiLib.createService(ThirdPartyApi.class);
  }
  
  @Provides
  TopupsApi providesTopupsApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (TopupsApi)paramBox7RestApiLib.createService(TopupsApi.class);
  }
  
  @Provides
  UsagesApi providesUsagesApi(@NonNull Box7RestApiLib paramBox7RestApiLib)
  {
    return (UsagesApi)paramBox7RestApiLib.createService(UsagesApi.class);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/Box7APIModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */