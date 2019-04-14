package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import android.content.Context;
import android.support.annotation.NonNull;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationInfo;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManagerFactory;
import de.eplus.mappecc.client.android.common.network.moe.LocalizerBatchOperationFactory;
import de.eplus.mappecc.client.android.common.network.moe.LocalizerImpl;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.network.moe.database.DatabaseAccessor;
import de.eplus.mappecc.client.android.common.network.moe.database.sqlite.SQLiteDatabaseAccessor;
import de.eplus.mappecc.client.android.common.network.moe.database.sqlite.SQLiteDatabaseHelper;
import javax.inject.Singleton;

@Module
public class MoeModule
{
  @Provides
  @Singleton
  @NonNull
  DatabaseAccessor provideDatabaseAccessor(SQLiteDatabaseHelper paramSQLiteDatabaseHelper)
  {
    return new SQLiteDatabaseAccessor(paramSQLiteDatabaseHelper);
  }
  
  @Provides
  @Singleton
  @NonNull
  LocalizationInfo provideLocalizationInfo(@NonNull Context paramContext)
  {
    return new LocalizationInfo(paramContext);
  }
  
  @Provides
  @Singleton
  @NonNull
  LocalizationManagerFactory provideLocalizationManagerFactory(@NonNull Context paramContext, @NonNull DatabaseAccessor paramDatabaseAccessor, @NonNull LocalizationInfo paramLocalizationInfo, @NonNull LocalizerBatchOperationFactory paramLocalizerBatchOperationFactory)
  {
    return new LocalizationManagerFactory(paramContext, paramDatabaseAccessor, paramLocalizationInfo, paramLocalizerBatchOperationFactory);
  }
  
  @Provides
  @Singleton
  @NonNull
  Localizer provideLocalizer(@NonNull Context paramContext, @NonNull DatabaseAccessor paramDatabaseAccessor, @NonNull LocalizationInfo paramLocalizationInfo)
  {
    return new LocalizerImpl(paramContext, paramDatabaseAccessor, paramLocalizationInfo);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/MoeModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */