package de.eplus.mappecc.client.android.common.repository.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.migration.Migration;
import android.support.annotation.NonNull;
import com.google.gson.Gson;
import de.eplus.mappecc.client.android.common.repository.database.dao.ModelDatabaseEntityDao;
import de.eplus.mappecc.client.android.common.restclient.json.JSONModelType;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionsAuthorized;
import java.util.List;
import org.joda.time.DateTime;

@Database(entities={ModelDatabaseEntity.class}, exportSchema=false, version=1)
public abstract class B2PDatabase
  extends RoomDatabase
{
  public static final Migration MIGRATION_1_2 = new Migration(1, 2)
  {
    public final void migrate(SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase) {}
  };
  
  private Object getModelFromString(@NonNull String paramString, @NonNull Class<? extends JSONModelType> paramClass)
  {
    return new Gson().fromJson(paramString, paramClass);
  }
  
  private String getStringFromModel(@NonNull Object paramObject)
  {
    return new Gson().toJson(paramObject);
  }
  
  public <T extends JSONModelType> T getModelFromDb(MODEL_DB_KEYS paramMODEL_DB_KEYS)
  {
    Object localObject = paramMODEL_DB_KEYS.getDbID();
    localObject = modelDatabaseEntityDao().getModelDatabaseEntities((String)localObject);
    if ((localObject != null) && (!((List)localObject).isEmpty()) && (((List)localObject).get(0) != null)) {
      return (JSONModelType)getModelFromString(((ModelDatabaseEntity)((List)localObject).get(0)).getModel(), paramMODEL_DB_KEYS.className);
    }
    return null;
  }
  
  public abstract ModelDatabaseEntityDao modelDatabaseEntityDao();
  
  public <T extends JSONModelType> void storeModelToDb(MODEL_DB_KEYS paramMODEL_DB_KEYS, T paramT)
  {
    paramMODEL_DB_KEYS = paramMODEL_DB_KEYS.getDbID();
    paramT = getStringFromModel(paramT);
    paramMODEL_DB_KEYS = new ModelDatabaseEntity(paramMODEL_DB_KEYS, new DateTime().getMillis(), paramT);
    modelDatabaseEntityDao().insert(paramMODEL_DB_KEYS);
  }
  
  public static enum MODEL_DB_KEYS
  {
    SUBSCRIPTIONS_AUTHORIZED(SubscriptionsAuthorized.class);
    
    Class<? extends JSONModelType> className;
    
    private MODEL_DB_KEYS(Class<? extends JSONModelType> paramClass)
    {
      this.className = paramClass;
    }
    
    public final String getDbID()
    {
      return this.className.toString();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/database/B2PDatabase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */