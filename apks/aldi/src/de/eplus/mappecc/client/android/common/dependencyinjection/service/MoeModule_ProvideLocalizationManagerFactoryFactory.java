package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationInfo;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManagerFactory;
import de.eplus.mappecc.client.android.common.network.moe.LocalizerBatchOperationFactory;
import de.eplus.mappecc.client.android.common.network.moe.database.DatabaseAccessor;
import javax.inject.Provider;

public final class MoeModule_ProvideLocalizationManagerFactoryFactory
  implements Factory<LocalizationManagerFactory>
{
  private final Provider<Context> contextProvider;
  private final Provider<DatabaseAccessor> databaseAccessorProvider;
  private final Provider<LocalizationInfo> localizationInfoProvider;
  private final Provider<LocalizerBatchOperationFactory> localizerBatchOperationFactoryProvider;
  private final MoeModule module;
  
  public MoeModule_ProvideLocalizationManagerFactoryFactory(MoeModule paramMoeModule, Provider<Context> paramProvider, Provider<DatabaseAccessor> paramProvider1, Provider<LocalizationInfo> paramProvider2, Provider<LocalizerBatchOperationFactory> paramProvider3)
  {
    this.module = paramMoeModule;
    this.contextProvider = paramProvider;
    this.databaseAccessorProvider = paramProvider1;
    this.localizationInfoProvider = paramProvider2;
    this.localizerBatchOperationFactoryProvider = paramProvider3;
  }
  
  public static MoeModule_ProvideLocalizationManagerFactoryFactory create(MoeModule paramMoeModule, Provider<Context> paramProvider, Provider<DatabaseAccessor> paramProvider1, Provider<LocalizationInfo> paramProvider2, Provider<LocalizerBatchOperationFactory> paramProvider3)
  {
    return new MoeModule_ProvideLocalizationManagerFactoryFactory(paramMoeModule, paramProvider, paramProvider1, paramProvider2, paramProvider3);
  }
  
  public static LocalizationManagerFactory provideInstance(MoeModule paramMoeModule, Provider<Context> paramProvider, Provider<DatabaseAccessor> paramProvider1, Provider<LocalizationInfo> paramProvider2, Provider<LocalizerBatchOperationFactory> paramProvider3)
  {
    return proxyProvideLocalizationManagerFactory(paramMoeModule, (Context)paramProvider.get(), (DatabaseAccessor)paramProvider1.get(), (LocalizationInfo)paramProvider2.get(), (LocalizerBatchOperationFactory)paramProvider3.get());
  }
  
  public static LocalizationManagerFactory proxyProvideLocalizationManagerFactory(MoeModule paramMoeModule, Context paramContext, DatabaseAccessor paramDatabaseAccessor, LocalizationInfo paramLocalizationInfo, LocalizerBatchOperationFactory paramLocalizerBatchOperationFactory)
  {
    return (LocalizationManagerFactory)Preconditions.checkNotNull(paramMoeModule.provideLocalizationManagerFactory(paramContext, paramDatabaseAccessor, paramLocalizationInfo, paramLocalizerBatchOperationFactory), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final LocalizationManagerFactory get()
  {
    return provideInstance(this.module, this.contextProvider, this.databaseAccessorProvider, this.localizationInfoProvider, this.localizerBatchOperationFactoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/MoeModule_ProvideLocalizationManagerFactoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */