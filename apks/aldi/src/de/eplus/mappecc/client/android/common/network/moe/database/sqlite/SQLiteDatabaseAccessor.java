package de.eplus.mappecc.client.android.common.network.moe.database.sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import c.a.a;
import de.eplus.mappecc.client.android.common.network.moe.core.Language;
import de.eplus.mappecc.client.android.common.network.moe.core.Localization;
import de.eplus.mappecc.client.android.common.network.moe.database.DatabaseAccessor;

public class SQLiteDatabaseAccessor
  implements DatabaseAccessor
{
  private SQLiteDatabase database;
  private final SQLiteDatabaseHelper sqLiteDatabaseHelper;
  
  public SQLiteDatabaseAccessor(SQLiteDatabaseHelper paramSQLiteDatabaseHelper)
  {
    this.sqLiteDatabaseHelper = paramSQLiteDatabaseHelper;
    this.database = this.sqLiteDatabaseHelper.getWritableDatabase();
  }
  
  public void beginTransaction()
  {
    this.database.beginTransaction();
  }
  
  public void clearLocalizationDatabase()
  {
    this.sqLiteDatabaseHelper.clearLocalization(this.database);
  }
  
  public void close()
  {
    this.database.close();
  }
  
  public void commitTransaction()
  {
    this.database.setTransactionSuccessful();
    this.database.endTransaction();
  }
  
  @NonNull
  public Language createLanguage(String paramString, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("code", paramString);
    localContentValues.put("version", Integer.valueOf(paramInt));
    return new SQLiteLanguage(this.database.insert("language", null, localContentValues), paramString, paramInt);
  }
  
  public void createLocalization(Language paramLanguage, String paramString1, String paramString2, boolean paramBoolean)
  {
    paramLanguage = (SQLiteLanguage)paramLanguage;
    Object localObject = new ContentValues();
    if ((paramBoolean) || (paramString1.equals("doc_auth.terms_of_use"))) {
      a.b("It's a Streaming Resource!", new Object[0]);
    }
    ((ContentValues)localObject).put("languageId", Long.valueOf(paramLanguage.getId()));
    ((ContentValues)localObject).put("key", paramString1);
    ((ContentValues)localObject).put("value", paramString2);
    ((ContentValues)localObject).put("isStreamingResource", Boolean.valueOf(paramBoolean));
    if (this.database.insert("localization", null, (ContentValues)localObject) != -1L) {
      return;
    }
    localObject = new StringBuilder("Something went wrong while inserting into the database:\n(\n   languageId: ");
    ((StringBuilder)localObject).append(String.valueOf(paramLanguage.getId()));
    ((StringBuilder)localObject).append(",\n   key: ");
    ((StringBuilder)localObject).append(paramString1);
    ((StringBuilder)localObject).append(",\n   value: ");
    ((StringBuilder)localObject).append(paramString2);
    ((StringBuilder)localObject).append(",\n   isStreamingResource: ");
    ((StringBuilder)localObject).append(String.valueOf(paramBoolean));
    ((StringBuilder)localObject).append("\n)");
    throw new UnsupportedOperationException(((StringBuilder)localObject).toString());
  }
  
  protected void finalize()
    throws Throwable
  {
    this.database.close();
    super.finalize();
  }
  
  /* Error */
  public java.util.ArrayList<String> getImagesValues(Language paramLanguage)
  {
    // Byte code:
    //   0: aload_1
    //   1: checkcast 71	de/eplus/mappecc/client/android/common/network/moe/database/sqlite/SQLiteLanguage
    //   4: invokevirtual 105	de/eplus/mappecc/client/android/common/network/moe/database/sqlite/SQLiteLanguage:getId	()J
    //   7: lstore_2
    //   8: aload_0
    //   9: getfield 25	de/eplus/mappecc/client/android/common/network/moe/database/sqlite/SQLiteDatabaseAccessor:database	Landroid/database/sqlite/SQLiteDatabase;
    //   12: ldc -127
    //   14: getstatic 177	de/eplus/mappecc/client/android/common/network/moe/database/sqlite/SQLiteDatabaseHelper:LOCALIZATION_PROJECTION	[Ljava/lang/String;
    //   17: ldc -77
    //   19: iconst_1
    //   20: anewarray 87	java/lang/String
    //   23: dup
    //   24: iconst_0
    //   25: lload_2
    //   26: invokestatic 141	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   29: aastore
    //   30: aconst_null
    //   31: aconst_null
    //   32: aconst_null
    //   33: invokevirtual 183	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   36: astore_1
    //   37: new 185	java/util/ArrayList
    //   40: dup
    //   41: invokespecial 186	java/util/ArrayList:<init>	()V
    //   44: astore 4
    //   46: aload_1
    //   47: invokeinterface 192 1 0
    //   52: ifeq +26 -> 78
    //   55: aload 4
    //   57: aload_1
    //   58: aload_1
    //   59: ldc 117
    //   61: invokeinterface 196 2 0
    //   66: invokeinterface 200 2 0
    //   71: invokevirtual 203	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   74: pop
    //   75: goto -29 -> 46
    //   78: aload_1
    //   79: ifnull +18 -> 97
    //   82: aload_1
    //   83: invokeinterface 206 1 0
    //   88: ifne +9 -> 97
    //   91: aload_1
    //   92: invokeinterface 207 1 0
    //   97: aload 4
    //   99: areturn
    //   100: astore 4
    //   102: goto +31 -> 133
    //   105: astore 4
    //   107: aload 4
    //   109: invokestatic 210	c/a/a:b	(Ljava/lang/Throwable;)V
    //   112: aload_1
    //   113: ifnull +18 -> 131
    //   116: aload_1
    //   117: invokeinterface 206 1 0
    //   122: ifne +9 -> 131
    //   125: aload_1
    //   126: invokeinterface 207 1 0
    //   131: aconst_null
    //   132: areturn
    //   133: aload_1
    //   134: ifnull +18 -> 152
    //   137: aload_1
    //   138: invokeinterface 206 1 0
    //   143: ifne +9 -> 152
    //   146: aload_1
    //   147: invokeinterface 207 1 0
    //   152: aload 4
    //   154: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	155	0	this	SQLiteDatabaseAccessor
    //   0	155	1	paramLanguage	Language
    //   7	19	2	l	long
    //   44	54	4	localArrayList	java.util.ArrayList
    //   100	1	4	localObject	Object
    //   105	48	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   37	46	100	finally
    //   46	75	100	finally
    //   107	112	100	finally
    //   37	46	105	java/lang/Exception
    //   46	75	105	java/lang/Exception
  }
  
  @Nullable
  public Language getLanguage(String paramString)
  {
    paramString = this.database.query("language", SQLiteDatabaseHelper.LANGUAGE_PROJECTION, "code = ?", new String[] { paramString }, null, null, null);
    try
    {
      boolean bool = paramString.moveToFirst();
      if (!bool) {
        return null;
      }
      SQLiteLanguage localSQLiteLanguage = new SQLiteLanguage(paramString.getLong(paramString.getColumnIndexOrThrow("_id")), paramString.getString(paramString.getColumnIndexOrThrow("code")), paramString.getInt(paramString.getColumnIndexOrThrow("version")));
      return localSQLiteLanguage;
    }
    finally
    {
      paramString.close();
    }
  }
  
  @Nullable
  public Localization getLocalization(String paramString, Language paramLanguage)
  {
    long l = ((SQLiteLanguage)paramLanguage).getId();
    paramString = this.database.query("localization", SQLiteDatabaseHelper.LOCALIZATION_PROJECTION, "languageId = ? AND key = ?", new String[] { String.valueOf(l), paramString }, null, null, null);
    for (;;)
    {
      try
      {
        bool = paramString.moveToFirst();
        if (!bool) {
          return null;
        }
        l = paramString.getLong(paramString.getColumnIndexOrThrow("_id"));
        paramLanguage = paramString.getString(paramString.getColumnIndexOrThrow("key"));
        String str = paramString.getString(paramString.getColumnIndexOrThrow("value"));
        if (paramString.getInt(paramString.getColumnIndexOrThrow("isStreamingResource")) == 1)
        {
          bool = true;
          paramLanguage = new SQLiteLocalization(l, paramLanguage, str, bool);
          return paramLanguage;
        }
      }
      finally
      {
        paramString.close();
      }
      boolean bool = false;
    }
  }
  
  /* Error */
  public java.util.List<String> getStreamingResourceKeys(Language paramLanguage)
  {
    // Byte code:
    //   0: aload_1
    //   1: checkcast 71	de/eplus/mappecc/client/android/common/network/moe/database/sqlite/SQLiteLanguage
    //   4: invokevirtual 105	de/eplus/mappecc/client/android/common/network/moe/database/sqlite/SQLiteLanguage:getId	()J
    //   7: lstore_2
    //   8: aload_0
    //   9: getfield 25	de/eplus/mappecc/client/android/common/network/moe/database/sqlite/SQLiteDatabaseAccessor:database	Landroid/database/sqlite/SQLiteDatabase;
    //   12: ldc -127
    //   14: getstatic 177	de/eplus/mappecc/client/android/common/network/moe/database/sqlite/SQLiteDatabaseHelper:LOCALIZATION_PROJECTION	[Ljava/lang/String;
    //   17: ldc -10
    //   19: iconst_1
    //   20: anewarray 87	java/lang/String
    //   23: dup
    //   24: iconst_0
    //   25: lload_2
    //   26: invokestatic 141	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   29: aastore
    //   30: aconst_null
    //   31: aconst_null
    //   32: aconst_null
    //   33: invokevirtual 183	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   36: astore_1
    //   37: new 248	java/util/LinkedList
    //   40: dup
    //   41: invokespecial 249	java/util/LinkedList:<init>	()V
    //   44: astore 4
    //   46: aload_1
    //   47: invokeinterface 192 1 0
    //   52: ifeq +25 -> 77
    //   55: aload 4
    //   57: aload_1
    //   58: aload_1
    //   59: ldc 115
    //   61: invokeinterface 196 2 0
    //   66: invokeinterface 200 2 0
    //   71: invokevirtual 253	java/util/LinkedList:push	(Ljava/lang/Object;)V
    //   74: goto -28 -> 46
    //   77: aload_1
    //   78: invokeinterface 207 1 0
    //   83: aload 4
    //   85: areturn
    //   86: astore 4
    //   88: goto +18 -> 106
    //   91: astore 4
    //   93: aload 4
    //   95: invokestatic 256	c/a/a:c	(Ljava/lang/Throwable;)V
    //   98: aload_1
    //   99: invokeinterface 207 1 0
    //   104: aconst_null
    //   105: areturn
    //   106: aload_1
    //   107: invokeinterface 207 1 0
    //   112: aload 4
    //   114: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	SQLiteDatabaseAccessor
    //   0	115	1	paramLanguage	Language
    //   7	19	2	l	long
    //   44	40	4	localLinkedList	java.util.LinkedList
    //   86	1	4	localObject	Object
    //   91	22	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   37	46	86	finally
    //   46	74	86	finally
    //   93	98	86	finally
    //   37	46	91	java/lang/Exception
    //   46	74	91	java/lang/Exception
  }
  
  public void updateLanguageVersion(Language paramLanguage, int paramInt)
  {
    paramLanguage = (SQLiteLanguage)paramLanguage;
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("version", Integer.valueOf(paramInt));
    long l = paramLanguage.getId();
    if (this.database.update("language", localContentValues, "_id = ?", new String[] { String.valueOf(l) }) != 0) {
      return;
    }
    throw new IllegalArgumentException("language parameter seems to be invalid");
  }
  
  public void updateLocalization(Localization paramLocalization, String paramString, boolean paramBoolean)
  {
    paramLocalization = (SQLiteLocalization)paramLocalization;
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("value", paramString);
    localContentValues.put("isStreamingResource", Boolean.valueOf(paramBoolean));
    long l = paramLocalization.getId();
    if (this.database.update("localization", localContentValues, "_id = ?", new String[] { String.valueOf(l) }) != 0) {
      return;
    }
    throw new IllegalArgumentException("localization parameter seems to be invalid");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/database/sqlite/SQLiteDatabaseAccessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */