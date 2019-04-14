package de.eplus.mappecc.client.android.common.repository.database.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import de.eplus.mappecc.client.android.common.repository.database.ModelDatabaseEntity;
import java.util.ArrayList;
import java.util.List;

public class ModelDatabaseEntityDao_Impl
  implements ModelDatabaseEntityDao
{
  private final RoomDatabase __db;
  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfModelDatabaseEntity;
  private final EntityInsertionAdapter __insertionAdapterOfModelDatabaseEntity;
  private final EntityDeletionOrUpdateAdapter __updateAdapterOfModelDatabaseEntity;
  
  public ModelDatabaseEntityDao_Impl(RoomDatabase paramRoomDatabase)
  {
    this.__db = paramRoomDatabase;
    this.__insertionAdapterOfModelDatabaseEntity = new EntityInsertionAdapter(paramRoomDatabase)
    {
      public void bind(SupportSQLiteStatement paramAnonymousSupportSQLiteStatement, ModelDatabaseEntity paramAnonymousModelDatabaseEntity)
      {
        if (paramAnonymousModelDatabaseEntity.getId() == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(1);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(1, paramAnonymousModelDatabaseEntity.getId());
        }
        paramAnonymousSupportSQLiteStatement.bindLong(2, paramAnonymousModelDatabaseEntity.getDatetime());
        if (paramAnonymousModelDatabaseEntity.getModel() == null)
        {
          paramAnonymousSupportSQLiteStatement.bindNull(3);
          return;
        }
        paramAnonymousSupportSQLiteStatement.bindString(3, paramAnonymousModelDatabaseEntity.getModel());
      }
      
      public String createQuery()
      {
        return "INSERT OR REPLACE INTO `ModelDatabaseEntity`(`id`,`datetime`,`model`) VALUES (?,?,?)";
      }
    };
    this.__deletionAdapterOfModelDatabaseEntity = new EntityDeletionOrUpdateAdapter(paramRoomDatabase)
    {
      public void bind(SupportSQLiteStatement paramAnonymousSupportSQLiteStatement, ModelDatabaseEntity paramAnonymousModelDatabaseEntity)
      {
        if (paramAnonymousModelDatabaseEntity.getId() == null)
        {
          paramAnonymousSupportSQLiteStatement.bindNull(1);
          return;
        }
        paramAnonymousSupportSQLiteStatement.bindString(1, paramAnonymousModelDatabaseEntity.getId());
      }
      
      public String createQuery()
      {
        return "DELETE FROM `ModelDatabaseEntity` WHERE `id` = ?";
      }
    };
    this.__updateAdapterOfModelDatabaseEntity = new EntityDeletionOrUpdateAdapter(paramRoomDatabase)
    {
      public void bind(SupportSQLiteStatement paramAnonymousSupportSQLiteStatement, ModelDatabaseEntity paramAnonymousModelDatabaseEntity)
      {
        if (paramAnonymousModelDatabaseEntity.getId() == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(1);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(1, paramAnonymousModelDatabaseEntity.getId());
        }
        paramAnonymousSupportSQLiteStatement.bindLong(2, paramAnonymousModelDatabaseEntity.getDatetime());
        if (paramAnonymousModelDatabaseEntity.getModel() == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(3);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(3, paramAnonymousModelDatabaseEntity.getModel());
        }
        if (paramAnonymousModelDatabaseEntity.getId() == null)
        {
          paramAnonymousSupportSQLiteStatement.bindNull(4);
          return;
        }
        paramAnonymousSupportSQLiteStatement.bindString(4, paramAnonymousModelDatabaseEntity.getId());
      }
      
      public String createQuery()
      {
        return "UPDATE OR REPLACE `ModelDatabaseEntity` SET `id` = ?,`datetime` = ?,`model` = ? WHERE `id` = ?";
      }
    };
  }
  
  public void delete(ModelDatabaseEntity paramModelDatabaseEntity)
  {
    this.__db.beginTransaction();
    try
    {
      this.__deletionAdapterOfModelDatabaseEntity.handle(paramModelDatabaseEntity);
      this.__db.setTransactionSuccessful();
      return;
    }
    finally
    {
      this.__db.endTransaction();
    }
  }
  
  public List<ModelDatabaseEntity> getModelDatabaseEntities()
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("select * from ModelDatabaseEntity", 0);
    Cursor localCursor = this.__db.query(localRoomSQLiteQuery);
    try
    {
      int i = localCursor.getColumnIndexOrThrow("id");
      int j = localCursor.getColumnIndexOrThrow("datetime");
      int k = localCursor.getColumnIndexOrThrow("model");
      ArrayList localArrayList = new ArrayList(localCursor.getCount());
      while (localCursor.moveToNext()) {
        localArrayList.add(new ModelDatabaseEntity(localCursor.getString(i), localCursor.getLong(j), localCursor.getString(k)));
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public List<ModelDatabaseEntity> getModelDatabaseEntities(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("select * from ModelDatabaseEntity where id = ?", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    paramString = this.__db.query(localRoomSQLiteQuery);
    try
    {
      int i = paramString.getColumnIndexOrThrow("id");
      int j = paramString.getColumnIndexOrThrow("datetime");
      int k = paramString.getColumnIndexOrThrow("model");
      ArrayList localArrayList = new ArrayList(paramString.getCount());
      while (paramString.moveToNext()) {
        localArrayList.add(new ModelDatabaseEntity(paramString.getString(i), paramString.getLong(j), paramString.getString(k)));
      }
      return localArrayList;
    }
    finally
    {
      paramString.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public void insert(ModelDatabaseEntity paramModelDatabaseEntity)
  {
    this.__db.beginTransaction();
    try
    {
      this.__insertionAdapterOfModelDatabaseEntity.insert(paramModelDatabaseEntity);
      this.__db.setTransactionSuccessful();
      return;
    }
    finally
    {
      this.__db.endTransaction();
    }
  }
  
  public void insert(ModelDatabaseEntity... paramVarArgs)
  {
    this.__db.beginTransaction();
    try
    {
      this.__insertionAdapterOfModelDatabaseEntity.insert(paramVarArgs);
      this.__db.setTransactionSuccessful();
      return;
    }
    finally
    {
      this.__db.endTransaction();
    }
  }
  
  public void update(ModelDatabaseEntity paramModelDatabaseEntity)
  {
    this.__db.beginTransaction();
    try
    {
      this.__updateAdapterOfModelDatabaseEntity.handle(paramModelDatabaseEntity);
      this.__db.setTransactionSuccessful();
      return;
    }
    finally
    {
      this.__db.endTransaction();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/database/dao/ModelDatabaseEntityDao_Impl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */