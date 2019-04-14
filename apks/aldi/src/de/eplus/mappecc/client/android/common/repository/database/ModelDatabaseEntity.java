package de.eplus.mappecc.client.android.common.repository.database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class ModelDatabaseEntity
{
  @NonNull
  private long datetime;
  @PrimaryKey
  @NonNull
  private String id;
  @NonNull
  private String model;
  
  public ModelDatabaseEntity(@NonNull String paramString1, @NonNull long paramLong, @NonNull String paramString2)
  {
    this.id = paramString1;
    this.model = paramString2;
    this.datetime = paramLong;
  }
  
  public long getDatetime()
  {
    return this.datetime;
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public String getModel()
  {
    return this.model;
  }
  
  public void setDatetime(long paramLong)
  {
    this.datetime = paramLong;
  }
  
  public void setId(String paramString)
  {
    this.id = paramString;
  }
  
  public void setModel(String paramString)
  {
    this.model = paramString;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/database/ModelDatabaseEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */