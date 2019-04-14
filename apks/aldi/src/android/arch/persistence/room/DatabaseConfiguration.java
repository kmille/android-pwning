package android.arch.persistence.room;

import android.arch.persistence.db.SupportSQLiteOpenHelper.Factory;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import java.util.List;
import java.util.Set;

public class DatabaseConfiguration
{
  public final boolean allowMainThreadQueries;
  @Nullable
  public final List<RoomDatabase.Callback> callbacks;
  @NonNull
  public final Context context;
  public final RoomDatabase.JournalMode journalMode;
  private final Set<Integer> mMigrationNotRequiredFrom;
  @NonNull
  public final RoomDatabase.MigrationContainer migrationContainer;
  @Nullable
  public final String name;
  public final boolean requireMigration;
  @NonNull
  public final SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public DatabaseConfiguration(@NonNull Context paramContext, @Nullable String paramString, @NonNull SupportSQLiteOpenHelper.Factory paramFactory, @NonNull RoomDatabase.MigrationContainer paramMigrationContainer, @Nullable List<RoomDatabase.Callback> paramList, boolean paramBoolean1, RoomDatabase.JournalMode paramJournalMode, boolean paramBoolean2, @Nullable Set<Integer> paramSet)
  {
    this.sqliteOpenHelperFactory = paramFactory;
    this.context = paramContext;
    this.name = paramString;
    this.migrationContainer = paramMigrationContainer;
    this.callbacks = paramList;
    this.allowMainThreadQueries = paramBoolean1;
    this.journalMode = paramJournalMode;
    this.requireMigration = paramBoolean2;
    this.mMigrationNotRequiredFrom = paramSet;
  }
  
  public boolean isMigrationRequiredFrom(int paramInt)
  {
    return (this.requireMigration) && ((this.mMigrationNotRequiredFrom == null) || (!this.mMigrationNotRequiredFrom.contains(Integer.valueOf(paramInt))));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/persistence/room/DatabaseConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */