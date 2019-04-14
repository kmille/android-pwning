package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.repository.database.B2PDatabase;
import javax.inject.Provider;

public final class DatabaseModule_ProvideB2PDatabaseFactory
  implements Factory<B2PDatabase>
{
  private final Provider<Context> contextProvider;
  private final DatabaseModule module;
  
  public DatabaseModule_ProvideB2PDatabaseFactory(DatabaseModule paramDatabaseModule, Provider<Context> paramProvider)
  {
    this.module = paramDatabaseModule;
    this.contextProvider = paramProvider;
  }
  
  public static DatabaseModule_ProvideB2PDatabaseFactory create(DatabaseModule paramDatabaseModule, Provider<Context> paramProvider)
  {
    return new DatabaseModule_ProvideB2PDatabaseFactory(paramDatabaseModule, paramProvider);
  }
  
  public static B2PDatabase provideInstance(DatabaseModule paramDatabaseModule, Provider<Context> paramProvider)
  {
    return proxyProvideB2PDatabase(paramDatabaseModule, (Context)paramProvider.get());
  }
  
  public static B2PDatabase proxyProvideB2PDatabase(DatabaseModule paramDatabaseModule, Context paramContext)
  {
    return (B2PDatabase)Preconditions.checkNotNull(paramDatabaseModule.provideB2PDatabase(paramContext), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final B2PDatabase get()
  {
    return provideInstance(this.module, this.contextProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/DatabaseModule_ProvideB2PDatabaseFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */