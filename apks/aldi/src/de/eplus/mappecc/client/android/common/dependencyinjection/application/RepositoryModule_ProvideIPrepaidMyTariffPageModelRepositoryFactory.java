package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.IPrepaidMyTariffPageModelRepository;
import de.eplus.mappecc.client.android.common.restclient.api.UsagesApi;
import de.eplus.mappecc.client.android.common.utils.preferences.ModelPreferences;
import javax.inject.Provider;

public final class RepositoryModule_ProvideIPrepaidMyTariffPageModelRepositoryFactory
  implements Factory<IPrepaidMyTariffPageModelRepository>
{
  private final Provider<Localizer> localizerProvider;
  private final Provider<ModelPreferences> modelPreferencesProvider;
  private final RepositoryModule module;
  private final Provider<UsagesApi> usagesApiProvider;
  
  public RepositoryModule_ProvideIPrepaidMyTariffPageModelRepositoryFactory(RepositoryModule paramRepositoryModule, Provider<UsagesApi> paramProvider, Provider<ModelPreferences> paramProvider1, Provider<Localizer> paramProvider2)
  {
    this.module = paramRepositoryModule;
    this.usagesApiProvider = paramProvider;
    this.modelPreferencesProvider = paramProvider1;
    this.localizerProvider = paramProvider2;
  }
  
  public static RepositoryModule_ProvideIPrepaidMyTariffPageModelRepositoryFactory create(RepositoryModule paramRepositoryModule, Provider<UsagesApi> paramProvider, Provider<ModelPreferences> paramProvider1, Provider<Localizer> paramProvider2)
  {
    return new RepositoryModule_ProvideIPrepaidMyTariffPageModelRepositoryFactory(paramRepositoryModule, paramProvider, paramProvider1, paramProvider2);
  }
  
  public static IPrepaidMyTariffPageModelRepository provideInstance(RepositoryModule paramRepositoryModule, Provider<UsagesApi> paramProvider, Provider<ModelPreferences> paramProvider1, Provider<Localizer> paramProvider2)
  {
    return proxyProvideIPrepaidMyTariffPageModelRepository(paramRepositoryModule, (UsagesApi)paramProvider.get(), (ModelPreferences)paramProvider1.get(), (Localizer)paramProvider2.get());
  }
  
  public static IPrepaidMyTariffPageModelRepository proxyProvideIPrepaidMyTariffPageModelRepository(RepositoryModule paramRepositoryModule, UsagesApi paramUsagesApi, ModelPreferences paramModelPreferences, Localizer paramLocalizer)
  {
    return (IPrepaidMyTariffPageModelRepository)Preconditions.checkNotNull(paramRepositoryModule.provideIPrepaidMyTariffPageModelRepository(paramUsagesApi, paramModelPreferences, paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final IPrepaidMyTariffPageModelRepository get()
  {
    return provideInstance(this.module, this.usagesApiProvider, this.modelPreferencesProvider, this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/RepositoryModule_ProvideIPrepaidMyTariffPageModelRepositoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */