package de.eplus.mappecc.client.android.common.network.moe.core;

import dagger.internal.Factory;
import de.eplus.mappecc.client.android.common.network.moe.ImageManager;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManagerFactory;
import de.eplus.mappecc.client.android.common.utils.preferences.NetworkPreferences;
import javax.inject.Provider;

public final class MoeTaskFactory_Factory
  implements Factory<MoeTaskFactory>
{
  private final Provider<ImageManager> imageManagerProvider;
  private final Provider<LocalizationManagerFactory> localizationManagerFactoryProvider;
  private final Provider<MoeStreamingResourceTaskFactory> moeStreamingResourceTaskFactoryProvider;
  private final Provider<NetworkPreferences> networkPreferencesProvider;
  
  public MoeTaskFactory_Factory(Provider<NetworkPreferences> paramProvider, Provider<LocalizationManagerFactory> paramProvider1, Provider<MoeStreamingResourceTaskFactory> paramProvider2, Provider<ImageManager> paramProvider3)
  {
    this.networkPreferencesProvider = paramProvider;
    this.localizationManagerFactoryProvider = paramProvider1;
    this.moeStreamingResourceTaskFactoryProvider = paramProvider2;
    this.imageManagerProvider = paramProvider3;
  }
  
  public static MoeTaskFactory_Factory create(Provider<NetworkPreferences> paramProvider, Provider<LocalizationManagerFactory> paramProvider1, Provider<MoeStreamingResourceTaskFactory> paramProvider2, Provider<ImageManager> paramProvider3)
  {
    return new MoeTaskFactory_Factory(paramProvider, paramProvider1, paramProvider2, paramProvider3);
  }
  
  public static MoeTaskFactory newMoeTaskFactory(NetworkPreferences paramNetworkPreferences, LocalizationManagerFactory paramLocalizationManagerFactory, MoeStreamingResourceTaskFactory paramMoeStreamingResourceTaskFactory, ImageManager paramImageManager)
  {
    return new MoeTaskFactory(paramNetworkPreferences, paramLocalizationManagerFactory, paramMoeStreamingResourceTaskFactory, paramImageManager);
  }
  
  public static MoeTaskFactory provideInstance(Provider<NetworkPreferences> paramProvider, Provider<LocalizationManagerFactory> paramProvider1, Provider<MoeStreamingResourceTaskFactory> paramProvider2, Provider<ImageManager> paramProvider3)
  {
    return new MoeTaskFactory((NetworkPreferences)paramProvider.get(), (LocalizationManagerFactory)paramProvider1.get(), (MoeStreamingResourceTaskFactory)paramProvider2.get(), (ImageManager)paramProvider3.get());
  }
  
  public final MoeTaskFactory get()
  {
    return provideInstance(this.networkPreferencesProvider, this.localizationManagerFactoryProvider, this.moeStreamingResourceTaskFactoryProvider, this.imageManagerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/core/MoeTaskFactory_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */