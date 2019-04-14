package de.eplus.mappecc.client.android.common.network.moe.core;

import dagger.internal.Factory;
import de.eplus.mappecc.client.android.common.network.moe.ImageManager;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManagerFactory;
import de.eplus.mappecc.client.android.common.utils.preferences.NetworkPreferences;
import javax.inject.Provider;

public final class MoeStreamingResourceTaskFactory_Factory
  implements Factory<MoeStreamingResourceTaskFactory>
{
  private final Provider<ImageManager> imageManagerProvider;
  private final Provider<LocalizationManagerFactory> localizationManagerFactoryProvider;
  private final Provider<NetworkPreferences> networkPreferencesProvider;
  
  public MoeStreamingResourceTaskFactory_Factory(Provider<NetworkPreferences> paramProvider, Provider<LocalizationManagerFactory> paramProvider1, Provider<ImageManager> paramProvider2)
  {
    this.networkPreferencesProvider = paramProvider;
    this.localizationManagerFactoryProvider = paramProvider1;
    this.imageManagerProvider = paramProvider2;
  }
  
  public static MoeStreamingResourceTaskFactory_Factory create(Provider<NetworkPreferences> paramProvider, Provider<LocalizationManagerFactory> paramProvider1, Provider<ImageManager> paramProvider2)
  {
    return new MoeStreamingResourceTaskFactory_Factory(paramProvider, paramProvider1, paramProvider2);
  }
  
  public static MoeStreamingResourceTaskFactory newMoeStreamingResourceTaskFactory(NetworkPreferences paramNetworkPreferences, LocalizationManagerFactory paramLocalizationManagerFactory, ImageManager paramImageManager)
  {
    return new MoeStreamingResourceTaskFactory(paramNetworkPreferences, paramLocalizationManagerFactory, paramImageManager);
  }
  
  public static MoeStreamingResourceTaskFactory provideInstance(Provider<NetworkPreferences> paramProvider, Provider<LocalizationManagerFactory> paramProvider1, Provider<ImageManager> paramProvider2)
  {
    return new MoeStreamingResourceTaskFactory((NetworkPreferences)paramProvider.get(), (LocalizationManagerFactory)paramProvider1.get(), (ImageManager)paramProvider2.get());
  }
  
  public final MoeStreamingResourceTaskFactory get()
  {
    return provideInstance(this.networkPreferencesProvider, this.localizationManagerFactoryProvider, this.imageManagerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/core/MoeStreamingResourceTaskFactory_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */