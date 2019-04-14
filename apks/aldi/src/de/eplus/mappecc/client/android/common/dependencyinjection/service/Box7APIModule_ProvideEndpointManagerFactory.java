package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.piranha.LoginManager;
import de.eplus.mappecc.client.android.common.restclient.Box7RestApiLib;
import de.eplus.mappecc.client.android.common.utils.preferences.NetworkPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.Preferences;
import de.eplus.mappecc.client.android.common.utils.preferences.UserPreferences;
import de.eplus.mappecc.client.android.feature.splashscreen.endpoint.EndpointManager;
import javax.inject.Provider;

public final class Box7APIModule_ProvideEndpointManagerFactory
  implements Factory<EndpointManager>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<Box7RestApiLib> box7RestApiLibProvider;
  private final Provider<LoginManager> loginManagerProvider;
  private final Box7APIModule module;
  private final Provider<NetworkPreferences> networkPreferencesProvider;
  private final Provider<Preferences> preferencesProvider;
  private final Provider<UserPreferences> userPreferencesProvider;
  
  public Box7APIModule_ProvideEndpointManagerFactory(Box7APIModule paramBox7APIModule, Provider<LoginManager> paramProvider, Provider<Box7RestApiLib> paramProvider1, Provider<Preferences> paramProvider2, Provider<NetworkPreferences> paramProvider3, Provider<UserPreferences> paramProvider4, Provider<Box7Cache> paramProvider5)
  {
    this.module = paramBox7APIModule;
    this.loginManagerProvider = paramProvider;
    this.box7RestApiLibProvider = paramProvider1;
    this.preferencesProvider = paramProvider2;
    this.networkPreferencesProvider = paramProvider3;
    this.userPreferencesProvider = paramProvider4;
    this.box7CacheProvider = paramProvider5;
  }
  
  public static Box7APIModule_ProvideEndpointManagerFactory create(Box7APIModule paramBox7APIModule, Provider<LoginManager> paramProvider, Provider<Box7RestApiLib> paramProvider1, Provider<Preferences> paramProvider2, Provider<NetworkPreferences> paramProvider3, Provider<UserPreferences> paramProvider4, Provider<Box7Cache> paramProvider5)
  {
    return new Box7APIModule_ProvideEndpointManagerFactory(paramBox7APIModule, paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5);
  }
  
  public static EndpointManager provideInstance(Box7APIModule paramBox7APIModule, Provider<LoginManager> paramProvider, Provider<Box7RestApiLib> paramProvider1, Provider<Preferences> paramProvider2, Provider<NetworkPreferences> paramProvider3, Provider<UserPreferences> paramProvider4, Provider<Box7Cache> paramProvider5)
  {
    return proxyProvideEndpointManager(paramBox7APIModule, (LoginManager)paramProvider.get(), (Box7RestApiLib)paramProvider1.get(), (Preferences)paramProvider2.get(), (NetworkPreferences)paramProvider3.get(), (UserPreferences)paramProvider4.get(), (Box7Cache)paramProvider5.get());
  }
  
  public static EndpointManager proxyProvideEndpointManager(Box7APIModule paramBox7APIModule, LoginManager paramLoginManager, Box7RestApiLib paramBox7RestApiLib, Preferences paramPreferences, NetworkPreferences paramNetworkPreferences, UserPreferences paramUserPreferences, Box7Cache paramBox7Cache)
  {
    return (EndpointManager)Preconditions.checkNotNull(paramBox7APIModule.provideEndpointManager(paramLoginManager, paramBox7RestApiLib, paramPreferences, paramNetworkPreferences, paramUserPreferences, paramBox7Cache), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final EndpointManager get()
  {
    return provideInstance(this.module, this.loginManagerProvider, this.box7RestApiLibProvider, this.preferencesProvider, this.networkPreferencesProvider, this.userPreferencesProvider, this.box7CacheProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/Box7APIModule_ProvideEndpointManagerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */