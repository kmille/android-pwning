package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManagerFactory;
import de.eplus.mappecc.client.android.common.network.moe.MoeUpdateManager;
import de.eplus.mappecc.client.android.common.network.moe.core.MoeTaskFactory;
import de.eplus.mappecc.client.android.common.utils.DeviceUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.NetworkPreferences;
import javax.inject.Provider;

public final class NetworkModule_ProvideMoeUpdateManagerFactory
  implements Factory<MoeUpdateManager>
{
  private final Provider<DeviceUtils> deviceUtilsProvider;
  private final Provider<LocalizationManagerFactory> localizationManagerFactoryProvider;
  private final Provider<MoeTaskFactory> moeTaskFactoryProvider;
  private final Provider<NetworkPreferences> networkPreferencesProvider;
  
  public NetworkModule_ProvideMoeUpdateManagerFactory(Provider<LocalizationManagerFactory> paramProvider, Provider<DeviceUtils> paramProvider1, Provider<NetworkPreferences> paramProvider2, Provider<MoeTaskFactory> paramProvider3)
  {
    this.localizationManagerFactoryProvider = paramProvider;
    this.deviceUtilsProvider = paramProvider1;
    this.networkPreferencesProvider = paramProvider2;
    this.moeTaskFactoryProvider = paramProvider3;
  }
  
  public static NetworkModule_ProvideMoeUpdateManagerFactory create(Provider<LocalizationManagerFactory> paramProvider, Provider<DeviceUtils> paramProvider1, Provider<NetworkPreferences> paramProvider2, Provider<MoeTaskFactory> paramProvider3)
  {
    return new NetworkModule_ProvideMoeUpdateManagerFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3);
  }
  
  public static MoeUpdateManager provideInstance(Provider<LocalizationManagerFactory> paramProvider, Provider<DeviceUtils> paramProvider1, Provider<NetworkPreferences> paramProvider2, Provider<MoeTaskFactory> paramProvider3)
  {
    return proxyProvideMoeUpdateManager((LocalizationManagerFactory)paramProvider.get(), (DeviceUtils)paramProvider1.get(), (NetworkPreferences)paramProvider2.get(), (MoeTaskFactory)paramProvider3.get());
  }
  
  public static MoeUpdateManager proxyProvideMoeUpdateManager(LocalizationManagerFactory paramLocalizationManagerFactory, DeviceUtils paramDeviceUtils, NetworkPreferences paramNetworkPreferences, MoeTaskFactory paramMoeTaskFactory)
  {
    return (MoeUpdateManager)Preconditions.checkNotNull(NetworkModule.provideMoeUpdateManager(paramLocalizationManagerFactory, paramDeviceUtils, paramNetworkPreferences, paramMoeTaskFactory), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final MoeUpdateManager get()
  {
    return provideInstance(this.localizationManagerFactoryProvider, this.deviceUtilsProvider, this.networkPreferencesProvider, this.moeTaskFactoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/NetworkModule_ProvideMoeUpdateManagerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */