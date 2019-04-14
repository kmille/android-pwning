package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.pack.overview.PackDataModelFactory;
import javax.inject.Provider;

public final class FactoryModule_ProvidePackDataModelFactoryFactory
  implements Factory<PackDataModelFactory>
{
  private final Provider<Localizer> localizerProvider;
  
  public FactoryModule_ProvidePackDataModelFactoryFactory(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static FactoryModule_ProvidePackDataModelFactoryFactory create(Provider<Localizer> paramProvider)
  {
    return new FactoryModule_ProvidePackDataModelFactoryFactory(paramProvider);
  }
  
  public static PackDataModelFactory provideInstance(Provider<Localizer> paramProvider)
  {
    return proxyProvidePackDataModelFactory((Localizer)paramProvider.get());
  }
  
  public static PackDataModelFactory proxyProvidePackDataModelFactory(Localizer paramLocalizer)
  {
    return (PackDataModelFactory)Preconditions.checkNotNull(FactoryModule.providePackDataModelFactory(paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final PackDataModelFactory get()
  {
    return provideInstance(this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/FactoryModule_ProvidePackDataModelFactoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */