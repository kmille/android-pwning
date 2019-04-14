package de.eplus.mappecc.client.android.common.network.moe;

import android.content.Context;
import dagger.internal.Factory;
import de.eplus.mappecc.client.android.common.network.moe.database.DatabaseAccessor;
import javax.inject.Provider;

public final class LocalizationManagerFactory_Factory
  implements Factory<LocalizationManagerFactory>
{
  private final Provider<Context> contextProvider;
  private final Provider<DatabaseAccessor> databaseAccessorProvider;
  private final Provider<LocalizationInfo> localizationInfoProvider;
  private final Provider<LocalizerBatchOperationFactory> localizerBatchOperationFactoryProvider;
  
  public LocalizationManagerFactory_Factory(Provider<Context> paramProvider, Provider<DatabaseAccessor> paramProvider1, Provider<LocalizationInfo> paramProvider2, Provider<LocalizerBatchOperationFactory> paramProvider3)
  {
    this.contextProvider = paramProvider;
    this.databaseAccessorProvider = paramProvider1;
    this.localizationInfoProvider = paramProvider2;
    this.localizerBatchOperationFactoryProvider = paramProvider3;
  }
  
  public static LocalizationManagerFactory_Factory create(Provider<Context> paramProvider, Provider<DatabaseAccessor> paramProvider1, Provider<LocalizationInfo> paramProvider2, Provider<LocalizerBatchOperationFactory> paramProvider3)
  {
    return new LocalizationManagerFactory_Factory(paramProvider, paramProvider1, paramProvider2, paramProvider3);
  }
  
  public static LocalizationManagerFactory newLocalizationManagerFactory(Context paramContext, DatabaseAccessor paramDatabaseAccessor, LocalizationInfo paramLocalizationInfo, LocalizerBatchOperationFactory paramLocalizerBatchOperationFactory)
  {
    return new LocalizationManagerFactory(paramContext, paramDatabaseAccessor, paramLocalizationInfo, paramLocalizerBatchOperationFactory);
  }
  
  public static LocalizationManagerFactory provideInstance(Provider<Context> paramProvider, Provider<DatabaseAccessor> paramProvider1, Provider<LocalizationInfo> paramProvider2, Provider<LocalizerBatchOperationFactory> paramProvider3)
  {
    return new LocalizationManagerFactory((Context)paramProvider.get(), (DatabaseAccessor)paramProvider1.get(), (LocalizationInfo)paramProvider2.get(), (LocalizerBatchOperationFactory)paramProvider3.get());
  }
  
  public final LocalizationManagerFactory get()
  {
    return provideInstance(this.contextProvider, this.databaseAccessorProvider, this.localizationInfoProvider, this.localizerBatchOperationFactoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/LocalizationManagerFactory_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */