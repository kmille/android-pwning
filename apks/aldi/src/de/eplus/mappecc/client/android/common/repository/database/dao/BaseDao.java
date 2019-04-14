package de.eplus.mappecc.client.android.common.repository.database.dao;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

public abstract interface BaseDao<T>
{
  @Delete
  public abstract void delete(T paramT);
  
  @Insert(onConflict=1)
  public abstract void insert(T paramT);
  
  @Insert(onConflict=1)
  public abstract void insert(T... paramVarArgs);
  
  @Update(onConflict=1)
  public abstract void update(T paramT);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/database/dao/BaseDao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */