package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.utils.ImageUtils;
import javax.inject.Provider;

public final class UtilsModule_ProvideImageUtilsFactory
  implements Factory<ImageUtils>
{
  private final Provider<Localizer> localizerProvider;
  
  public UtilsModule_ProvideImageUtilsFactory(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static UtilsModule_ProvideImageUtilsFactory create(Provider<Localizer> paramProvider)
  {
    return new UtilsModule_ProvideImageUtilsFactory(paramProvider);
  }
  
  public static ImageUtils provideInstance(Provider<Localizer> paramProvider)
  {
    return proxyProvideImageUtils((Localizer)paramProvider.get());
  }
  
  public static ImageUtils proxyProvideImageUtils(Localizer paramLocalizer)
  {
    return (ImageUtils)Preconditions.checkNotNull(UtilsModule.provideImageUtils(paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ImageUtils get()
  {
    return provideInstance(this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideImageUtilsFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */