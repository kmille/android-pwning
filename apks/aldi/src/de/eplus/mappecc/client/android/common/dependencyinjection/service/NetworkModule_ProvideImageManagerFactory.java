package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.ImageManager;
import de.eplus.mappecc.client.android.common.utils.UiUtils;
import javax.inject.Provider;

public final class NetworkModule_ProvideImageManagerFactory
  implements Factory<ImageManager>
{
  private final Provider<UiUtils> uiUtilsProvider;
  
  public NetworkModule_ProvideImageManagerFactory(Provider<UiUtils> paramProvider)
  {
    this.uiUtilsProvider = paramProvider;
  }
  
  public static NetworkModule_ProvideImageManagerFactory create(Provider<UiUtils> paramProvider)
  {
    return new NetworkModule_ProvideImageManagerFactory(paramProvider);
  }
  
  public static ImageManager provideInstance(Provider<UiUtils> paramProvider)
  {
    return proxyProvideImageManager((UiUtils)paramProvider.get());
  }
  
  public static ImageManager proxyProvideImageManager(UiUtils paramUiUtils)
  {
    return (ImageManager)Preconditions.checkNotNull(NetworkModule.provideImageManager(paramUiUtils), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ImageManager get()
  {
    return provideInstance(this.uiUtilsProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/NetworkModule_ProvideImageManagerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */