package android.arch.persistence.room;

import android.arch.persistence.db.SimpleSQLiteQuery;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.room.migration.Migration;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import java.util.Iterator;
import java.util.List;

@RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class RoomOpenHelper
  extends SupportSQLiteOpenHelper.Callback
{
  @Nullable
  private DatabaseConfiguration mConfiguration;
  @NonNull
  private final Delegate mDelegate;
  @NonNull
  private final String mIdentityHash;
  @NonNull
  private final String mLegacyHash;
  
  public RoomOpenHelper(@NonNull DatabaseConfiguration paramDatabaseConfiguration, @NonNull Delegate paramDelegate, @NonNull String paramString)
  {
    this(paramDatabaseConfiguration, paramDelegate, "", paramString);
  }
  
  public RoomOpenHelper(@NonNull DatabaseConfiguration paramDatabaseConfiguration, @NonNull Delegate paramDelegate, @NonNull String paramString1, @NonNull String paramString2)
  {
    super(paramDelegate.version);
    this.mConfiguration = paramDatabaseConfiguration;
    this.mDelegate = paramDelegate;
    this.mIdentityHash = paramString1;
    this.mLegacyHash = paramString2;
  }
  
  private void checkIdentity(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    boolean bool = hasRoomMasterTable(paramSupportSQLiteDatabase);
    Object localObject1 = null;
    Object localObject2 = null;
    if (bool)
    {
      localObject1 = paramSupportSQLiteDatabase.query(new SimpleSQLiteQuery("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
      paramSupportSQLiteDatabase = (SupportSQLiteDatabase)localObject2;
    }
    try
    {
      if (((Cursor)localObject1).moveToFirst()) {
        paramSupportSQLiteDatabase = ((Cursor)localObject1).getString(0);
      }
      ((Cursor)localObject1).close();
      localObject1 = paramSupportSQLiteDatabase;
    }
    finally
    {
      ((Cursor)localObject1).close();
    }
    if (this.mLegacyHash.equals(localObject1)) {
      return;
    }
    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
  }
  
  private void createMasterTableIfNotExists(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    paramSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
  }
  
  private static boolean hasRoomMasterTable(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    paramSupportSQLiteDatabase = paramSupportSQLiteDatabase.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
    try
    {
      boolean bool3 = paramSupportSQLiteDatabase.moveToFirst();
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool3)
      {
        int i = paramSupportSQLiteDatabase.getInt(0);
        bool1 = bool2;
        if (i != 0) {
          bool1 = true;
        }
      }
      return bool1;
    }
    finally
    {
      paramSupportSQLiteDatabase.close();
    }
  }
  
  private void updateIdentity(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    createMasterTableIfNotExists(paramSupportSQLiteDatabase);
    paramSupportSQLiteDatabase.execSQL(RoomMasterTable.createInsertQuery(this.mIdentityHash));
  }
  
  public void onConfigure(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    super.onConfigure(paramSupportSQLiteDatabase);
  }
  
  public void onCreate(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    updateIdentity(paramSupportSQLiteDatabase);
    this.mDelegate.createAllTables(paramSupportSQLiteDatabase);
    this.mDelegate.onCreate(paramSupportSQLiteDatabase);
  }
  
  public void onDowngrade(SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt1, int paramInt2)
  {
    onUpgrade(paramSupportSQLiteDatabase, paramInt1, paramInt2);
  }
  
  public void onOpen(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    super.onOpen(paramSupportSQLiteDatabase);
    checkIdentity(paramSupportSQLiteDatabase);
    this.mDelegate.onOpen(paramSupportSQLiteDatabase);
    this.mConfiguration = null;
  }
  
  public void onUpgrade(SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (this.mConfiguration != null)
    {
      Object localObject = this.mConfiguration.migrationContainer.findMigrationPath(paramInt1, paramInt2);
      if (localObject != null)
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          ((Migration)((Iterator)localObject).next()).migrate(paramSupportSQLiteDatabase);
        }
        this.mDelegate.validateMigration(paramSupportSQLiteDatabase);
        updateIdentity(paramSupportSQLiteDatabase);
        i = 1;
        break label84;
      }
    }
    int i = 0;
    label84:
    if (i == 0)
    {
      if ((this.mConfiguration != null) && (!this.mConfiguration.isMigrationRequiredFrom(paramInt1)))
      {
        this.mDelegate.dropAllTables(paramSupportSQLiteDatabase);
        this.mDelegate.createAllTables(paramSupportSQLiteDatabase);
        return;
      }
      paramSupportSQLiteDatabase = new StringBuilder("A migration from ");
      paramSupportSQLiteDatabase.append(paramInt1);
      paramSupportSQLiteDatabase.append(" to ");
      paramSupportSQLiteDatabase.append(paramInt2);
      paramSupportSQLiteDatabase.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
      throw new IllegalStateException(paramSupportSQLiteDatabase.toString());
    }
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static abstract class Delegate
  {
    public final int version;
    
    public Delegate(int paramInt)
    {
      this.version = paramInt;
    }
    
    protected abstract void createAllTables(SupportSQLiteDatabase paramSupportSQLiteDatabase);
    
    protected abstract void dropAllTables(SupportSQLiteDatabase paramSupportSQLiteDatabase);
    
    protected abstract void onCreate(SupportSQLiteDatabase paramSupportSQLiteDatabase);
    
    protected abstract void onOpen(SupportSQLiteDatabase paramSupportSQLiteDatabase);
    
    protected abstract void validateMigration(SupportSQLiteDatabase paramSupportSQLiteDatabase);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/persistence/room/RoomOpenHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */