package de.eplus.mappecc.client.android.common.repository.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import de.eplus.mappecc.client.android.common.repository.database.ModelDatabaseEntity;
import java.util.List;

@Dao
public abstract interface ModelDatabaseEntityDao
  extends BaseDao<ModelDatabaseEntity>
{
  @Query("select * from ModelDatabaseEntity")
  public abstract List<ModelDatabaseEntity> getModelDatabaseEntities();
  
  @Query("select * from ModelDatabaseEntity where id = :id")
  public abstract List<ModelDatabaseEntity> getModelDatabaseEntities(String paramString);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/database/dao/ModelDatabaseEntityDao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */