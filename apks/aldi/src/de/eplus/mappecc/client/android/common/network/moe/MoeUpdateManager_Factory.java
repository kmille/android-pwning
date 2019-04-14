package de.eplus.mappecc.client.android.common.network.moe;

import dagger.internal.Factory;
import de.eplus.mappecc.client.android.common.network.moe.core.MoeTaskFactory;
import de.eplus.mappecc.client.android.common.utils.DeviceUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.NetworkPreferences;
import javax.inject.Provider;

public final class MoeUpdateManager_Factory
  implements Factory<MoeUpdateManager>
{
  private final Provider<DeviceUtils> deviceUtilsProvider;
  private final Provider<LocalizationManagerFactory> localizationManagerFactoryProvider;
  private final Provider<MoeTaskFactory> moeTaskFactoryProvider;
  private final Provider<NetworkPreferences> networkPreferencesProvider;
  
  public MoeUpdateManager_Factory(Provider<LocalizationManagerFactory> paramProvider, Provider<DeviceUtils> paramProvider1, Provider<NetworkPreferences> paramProvider2, Provider<MoeTaskFactory> paramProvider3)
  {
    this.localizationManagerFactoryProvider = paramProvider;
    this.deviceUtilsProvider = paramProvider1;
    this.networkPreferencesProvider = paramProvider2;
    this.moeTaskFactoryProvider = paramProvider3;
  }
  
  public static MoeUpdateManager_Factory create(Provider<LocalizationManagerFactory> paramProvider, Provider<DeviceUtils> paramProvider1, Provider<NetworkPreferences> paramProvider2, Provider<MoeTaskFactory> paramProvider3)
  {
    return new MoeUpdateManager_Factory(paramProvider, paramProvider1, paramProvider2, paramProvider3);
  }
  
  public static MoeUpdateManager newMoeUpdateManager(LocalizationManagerFactory paramLocalizationManagerFactory, DeviceUtils paramDeviceUtils, NetworkPreferences paramNetworkPreferences, MoeTaskFactory paramMoeTaskFactory)
  {
    return new MoeUpdateManager(paramLocalizationManagerFactory, paramDeviceUtils, paramNetworkPreferences, paramMoeTaskFactory);
  }
  
  public static MoeUpdateManager provideInstance(Provider<LocalizationManagerFactory> paramProvider, Provider<DeviceUtils> paramProvider1, Provider<NetworkPreferences> paramProvider2, Provider<MoeTaskFactory> paramProvider3)
  {
    return new MoeUpdateManager((LocalizationManagerFactory)paramProvider.get(), (DeviceUtils)paramProvider1.get(), (NetworkPreferences)paramProvider2.get(), (MoeTaskFactory)paramProvider3.get());
  }
  
  public final MoeUpdateManager get()
  {
    return provideInstance(this.localizationManagerFactoryProvider, this.deviceUtilsProvider, this.networkPreferencesProvider, this.moeTaskFactoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/MoeUpdateManager_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */