package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.database.DatabaseAccessor;
import de.eplus.mappecc.client.android.common.network.moe.database.sqlite.SQLiteDatabaseHelper;
import javax.inject.Provider;

public final class MoeModule_ProvideDatabaseAccessorFactory
  implements Factory<DatabaseAccessor>
{
  private final MoeModule module;
  private final Provider<SQLiteDatabaseHelper> sqLiteDatabaseHelperProvider;
  
  public MoeModule_ProvideDatabaseAccessorFactory(MoeModule paramMoeModule, Provider<SQLiteDatabaseHelper> paramProvider)
  {
    this.module = paramMoeModule;
    this.sqLiteDatabaseHelperProvider = paramProvider;
  }
  
  public static MoeModule_ProvideDatabaseAccessorFactory create(MoeModule paramMoeModule, Provider<SQLiteDatabaseHelper> paramProvider)
  {
    return new MoeModule_ProvideDatabaseAccessorFactory(paramMoeModule, paramProvider);
  }
  
  public static DatabaseAccessor provideInstance(MoeModule paramMoeModule, Provider<SQLiteDatabaseHelper> paramProvider)
  {
    return proxyProvideDatabaseAccessor(paramMoeModule, (SQLiteDatabaseHelper)paramProvider.get());
  }
  
  public static DatabaseAccessor proxyProvideDatabaseAccessor(MoeModule paramMoeModule, SQLiteDatabaseHelper paramSQLiteDatabaseHelper)
  {
    return (DatabaseAccessor)Preconditions.checkNotNull(paramMoeModule.provideDatabaseAccessor(paramSQLiteDatabaseHelper), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final DatabaseAccessor get()
  {
    return provideInstance(this.module, this.sqLiteDatabaseHelperProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/MoeModule_ProvideDatabaseAccessorFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */