package de.eplus.mappecc.client.android.common.network.moe.database.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import javax.inject.Inject;

public class SQLiteDatabaseHelper
  extends SQLiteOpenHelper
{
  public static final String DATABASE_NAME = "texts.db";
  public static final int DATABASE_VERSION = 62010;
  public static final String[] LANGUAGE_PROJECTION = { "_id", "code", "version" };
  public static final String[] LOCALIZATION_KEY_PROJECTION = { "key" };
  public static final String[] LOCALIZATION_PROJECTION = { "_id", "key", "value", "isStreamingResource" };
  private static final String SQL_CREATE_LANGUAGE_ENTITY = "CREATE TABLE language (_id INTEGER PRIMARY KEY, code TEXT, version INTEGER);";
  private static final String SQL_CREATE_LOCALIZATION_ENTITY = "CREATE TABLE localization (_id INTEGER PRIMARY KEY, languageId INTEGER, key TEXT, value TEXT, isStreamingResource INTEGER, FOREIGN KEY(languageId) REFERENCES language(_id));";
  private static final String SQL_DROP_LANGUAGE_ENTITY = "DROP TABLE IF EXISTS language";
  private static final String SQL_DROP_LOCALIZATION_ENTITY = "DROP TABLE IF EXISTS localization";
  
  @Inject
  public SQLiteDatabaseHelper(Context paramContext)
  {
    super(paramContext, "texts.db", null, 62010);
  }
  
  public void clearLocalization(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS localization");
    paramSQLiteDatabase.execSQL("CREATE TABLE localization (_id INTEGER PRIMARY KEY, languageId INTEGER, key TEXT, value TEXT, isStreamingResource INTEGER, FOREIGN KEY(languageId) REFERENCES language(_id));");
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE language (_id INTEGER PRIMARY KEY, code TEXT, version INTEGER);");
    paramSQLiteDatabase.execSQL("CREATE TABLE localization (_id INTEGER PRIMARY KEY, languageId INTEGER, key TEXT, value TEXT, isStreamingResource INTEGER, FOREIGN KEY(languageId) REFERENCES language(_id));");
  }
  
  public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS localization");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS language");
    onCreate(paramSQLiteDatabase);
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS localization");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS language");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/database/sqlite/SQLiteDatabaseHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */