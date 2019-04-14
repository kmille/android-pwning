package de.eplus.mappecc.client.android.common.network.moe;

import dagger.internal.Factory;
import de.eplus.mappecc.client.android.common.network.moe.database.DatabaseAccessor;
import javax.inject.Provider;

public final class LocalizerBatchOperationFactory_Factory
  implements Factory<LocalizerBatchOperationFactory>
{
  private final Provider<DatabaseAccessor> databaseAccessorProvider;
  
  public LocalizerBatchOperationFactory_Factory(Provider<DatabaseAccessor> paramProvider)
  {
    this.databaseAccessorProvider = paramProvider;
  }
  
  public static LocalizerBatchOperationFactory_Factory create(Provider<DatabaseAccessor> paramProvider)
  {
    return new LocalizerBatchOperationFactory_Factory(paramProvider);
  }
  
  public static LocalizerBatchOperationFactory newLocalizerBatchOperationFactory(DatabaseAccessor paramDatabaseAccessor)
  {
    return new LocalizerBatchOperationFactory(paramDatabaseAccessor);
  }
  
  public static LocalizerBatchOperationFactory provideInstance(Provider<DatabaseAccessor> paramProvider)
  {
    return new LocalizerBatchOperationFactory((DatabaseAccessor)paramProvider.get());
  }
  
  public final LocalizerBatchOperationFactory get()
  {
    return provideInstance(this.databaseAccessorProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/LocalizerBatchOperationFactory_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */