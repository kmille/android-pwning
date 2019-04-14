package de.eplus.mappecc.client.android.common.repository.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration.Builder;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Factory;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomDatabase.Callback;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.database.Cursor;
import de.eplus.mappecc.client.android.common.repository.database.dao.ModelDatabaseEntityDao;
import de.eplus.mappecc.client.android.common.repository.database.dao.ModelDatabaseEntityDao_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class B2PDatabase_Impl
  extends B2PDatabase
{
  private volatile ModelDatabaseEntityDao _modelDatabaseEntityDao;
  
  public void clearAllTables()
  {
    super.assertNotMainThread();
    SupportSQLiteDatabase localSupportSQLiteDatabase = super.getOpenHelper().getWritableDatabase();
    try
    {
      super.beginTransaction();
      localSupportSQLiteDatabase.execSQL("DELETE FROM `ModelDatabaseEntity`");
      super.setTransactionSuccessful();
      return;
    }
    finally
    {
      super.endTransaction();
      localSupportSQLiteDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!localSupportSQLiteDatabase.inTransaction()) {
        localSupportSQLiteDatabase.execSQL("VACUUM");
      }
    }
  }
  
  public InvalidationTracker createInvalidationTracker()
  {
    return new InvalidationTracker(this, new String[] { "ModelDatabaseEntity" });
  }
  
  public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration paramDatabaseConfiguration)
  {
    Object localObject = new RoomOpenHelper(paramDatabaseConfiguration, new RoomOpenHelper.Delegate(1)
    {
      public void createAllTables(SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
      {
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `ModelDatabaseEntity` (`id` TEXT NOT NULL, `datetime` INTEGER NOT NULL, `model` TEXT NOT NULL, PRIMARY KEY(`id`))");
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        paramAnonymousSupportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"6873330567196ce70e91e4671f29b9b0\")");
      }
      
      public void dropAllTables(SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
      {
        paramAnonymousSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `ModelDatabaseEntity`");
      }
      
      public void onCreate(SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
      {
        if (B2PDatabase_Impl.this.mCallbacks != null)
        {
          int i = 0;
          int j = B2PDatabase_Impl.this.mCallbacks.size();
          while (i < j)
          {
            ((RoomDatabase.Callback)B2PDatabase_Impl.this.mCallbacks.get(i)).onCreate(paramAnonymousSupportSQLiteDatabase);
            i += 1;
          }
        }
      }
      
      public void onOpen(SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
      {
        B2PDatabase_Impl.access$302(B2PDatabase_Impl.this, paramAnonymousSupportSQLiteDatabase);
        B2PDatabase_Impl.this.internalInitInvalidationTracker(paramAnonymousSupportSQLiteDatabase);
        if (B2PDatabase_Impl.this.mCallbacks != null)
        {
          int i = 0;
          int j = B2PDatabase_Impl.this.mCallbacks.size();
          while (i < j)
          {
            ((RoomDatabase.Callback)B2PDatabase_Impl.this.mCallbacks.get(i)).onOpen(paramAnonymousSupportSQLiteDatabase);
            i += 1;
          }
        }
      }
      
      public void validateMigration(SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
      {
        Object localObject = new HashMap(3);
        ((HashMap)localObject).put("id", new TableInfo.Column("id", "TEXT", true, 1));
        ((HashMap)localObject).put("datetime", new TableInfo.Column("datetime", "INTEGER", true, 0));
        ((HashMap)localObject).put("model", new TableInfo.Column("model", "TEXT", true, 0));
        localObject = new TableInfo("ModelDatabaseEntity", (Map)localObject, new HashSet(0), new HashSet(0));
        paramAnonymousSupportSQLiteDatabase = TableInfo.read(paramAnonymousSupportSQLiteDatabase, "ModelDatabaseEntity");
        if (((TableInfo)localObject).equals(paramAnonymousSupportSQLiteDatabase)) {
          return;
        }
        StringBuilder localStringBuilder = new StringBuilder("Migration didn't properly handle ModelDatabaseEntity(de.eplus.mappecc.client.android.common.repository.database.ModelDatabaseEntity).\n Expected:\n");
        localStringBuilder.append(localObject);
        localStringBuilder.append("\n Found:\n");
        localStringBuilder.append(paramAnonymousSupportSQLiteDatabase);
        throw new IllegalStateException(localStringBuilder.toString());
      }
    }, "6873330567196ce70e91e4671f29b9b0", "91add9a2768cb9e36a68e194be29144c");
    localObject = SupportSQLiteOpenHelper.Configuration.builder(paramDatabaseConfiguration.context).name(paramDatabaseConfiguration.name).callback((SupportSQLiteOpenHelper.Callback)localObject).build();
    return paramDatabaseConfiguration.sqliteOpenHelperFactory.create((SupportSQLiteOpenHelper.Configuration)localObject);
  }
  
  public ModelDatabaseEntityDao modelDatabaseEntityDao()
  {
    if (this._modelDatabaseEntityDao != null) {
      return this._modelDatabaseEntityDao;
    }
    try
    {
      if (this._modelDatabaseEntityDao == null) {
        this._modelDatabaseEntityDao = new ModelDatabaseEntityDao_Impl(this);
      }
      ModelDatabaseEntityDao localModelDatabaseEntityDao = this._modelDatabaseEntityDao;
      return localModelDatabaseEntityDao;
    }
    finally {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/database/B2PDatabase_Impl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */