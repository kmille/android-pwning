package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import javax.inject.Provider;

public final class UtilsModule_ProvideHotlineUtilsFactory
  implements Factory<HotlineUtils>
{
  private final Provider<Localizer> localizerProvider;
  
  public UtilsModule_ProvideHotlineUtilsFactory(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static UtilsModule_ProvideHotlineUtilsFactory create(Provider<Localizer> paramProvider)
  {
    return new UtilsModule_ProvideHotlineUtilsFactory(paramProvider);
  }
  
  public static HotlineUtils provideInstance(Provider<Localizer> paramProvider)
  {
    return proxyProvideHotlineUtils((Localizer)paramProvider.get());
  }
  
  public static HotlineUtils proxyProvideHotlineUtils(Localizer paramLocalizer)
  {
    return (HotlineUtils)Preconditions.checkNotNull(UtilsModule.provideHotlineUtils(paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final HotlineUtils get()
  {
    return provideInstance(this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideHotlineUtilsFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */