package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase.Builder;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;
import android.support.annotation.NonNull;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.repository.database.B2PDatabase;
import javax.inject.Singleton;

@Module
public class DatabaseModule
{
  @Provides
  @Singleton
  @NonNull
  B2PDatabase provideB2PDatabase(@NonNull Context paramContext)
  {
    return (B2PDatabase)Room.databaseBuilder(paramContext, B2PDatabase.class, "b2pdatabase").allowMainThreadQueries().fallbackToDestructiveMigration().addMigrations(new Migration[] { B2PDatabase.MIGRATION_1_2 }).build();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/DatabaseModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */