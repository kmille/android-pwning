package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

@VisibleForTesting
final class zzbd
  extends SQLiteOpenHelper
{
  zzbd(zzbc paramzzbc, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  /* Error */
  private final boolean zza(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 4
    //   6: aload_1
    //   7: ldc 21
    //   9: iconst_1
    //   10: anewarray 23	java/lang/String
    //   13: dup
    //   14: iconst_0
    //   15: ldc 25
    //   17: aastore
    //   18: ldc 27
    //   20: iconst_1
    //   21: anewarray 23	java/lang/String
    //   24: dup
    //   25: iconst_0
    //   26: aload_2
    //   27: aastore
    //   28: aconst_null
    //   29: aconst_null
    //   30: aconst_null
    //   31: invokevirtual 33	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   34: astore_1
    //   35: aload_1
    //   36: invokeinterface 39 1 0
    //   41: istore_3
    //   42: aload_1
    //   43: ifnull +9 -> 52
    //   46: aload_1
    //   47: invokeinterface 43 1 0
    //   52: iload_3
    //   53: ireturn
    //   54: astore_2
    //   55: aload_1
    //   56: astore 4
    //   58: aload_2
    //   59: astore_1
    //   60: goto +44 -> 104
    //   63: astore 5
    //   65: goto +12 -> 77
    //   68: astore_1
    //   69: goto +35 -> 104
    //   72: astore 5
    //   74: aload 6
    //   76: astore_1
    //   77: aload_1
    //   78: astore 4
    //   80: aload_0
    //   81: getfield 11	com/google/android/gms/internal/measurement/zzbd:zzwy	Lcom/google/android/gms/internal/measurement/zzbc;
    //   84: ldc 45
    //   86: aload_2
    //   87: aload 5
    //   89: invokevirtual 51	com/google/android/gms/internal/measurement/zzaq:zzc	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   92: aload_1
    //   93: ifnull +9 -> 102
    //   96: aload_1
    //   97: invokeinterface 43 1 0
    //   102: iconst_0
    //   103: ireturn
    //   104: aload 4
    //   106: ifnull +10 -> 116
    //   109: aload 4
    //   111: invokeinterface 43 1 0
    //   116: aload_1
    //   117: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	this	zzbd
    //   0	118	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	118	2	paramString	String
    //   41	12	3	bool	boolean
    //   4	106	4	localSQLiteDatabase	SQLiteDatabase
    //   63	1	5	localSQLiteException1	SQLiteException
    //   72	16	5	localSQLiteException2	SQLiteException
    //   1	74	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   35	42	54	finally
    //   35	42	63	android/database/sqlite/SQLiteException
    //   6	35	68	finally
    //   80	92	68	finally
    //   6	35	72	android/database/sqlite/SQLiteException
  }
  
  private static Set<String> zzb(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    HashSet localHashSet = new HashSet();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 22);
    localStringBuilder.append("SELECT * FROM ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" LIMIT 0");
    paramSQLiteDatabase = paramSQLiteDatabase.rawQuery(localStringBuilder.toString(), null);
    try
    {
      paramString = paramSQLiteDatabase.getColumnNames();
      int i = 0;
      while (i < paramString.length)
      {
        localHashSet.add(paramString[i]);
        i += 1;
      }
      return localHashSet;
    }
    finally
    {
      paramSQLiteDatabase.close();
    }
  }
  
  public final SQLiteDatabase getWritableDatabase()
  {
    if (zzbc.zza(this.zzwy).zzj(3600000L)) {}
    try
    {
      localObject = super.getWritableDatabase();
      return (SQLiteDatabase)localObject;
    }
    catch (SQLiteException localSQLiteException2)
    {
      Object localObject;
      for (;;) {}
    }
    zzbc.zza(this.zzwy).start();
    this.zzwy.zzu("Opening the database failed, dropping the table and recreating it");
    localObject = zzbc.zzb(this.zzwy);
    this.zzwy.getContext().getDatabasePath((String)localObject).delete();
    try
    {
      localObject = super.getWritableDatabase();
      zzbc.zza(this.zzwy).clear();
      return (SQLiteDatabase)localObject;
    }
    catch (SQLiteException localSQLiteException1)
    {
      this.zzwy.zze("Failed to open freshly created database", localSQLiteException1);
      throw localSQLiteException1;
    }
    throw new SQLiteException("Database open failed");
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase = paramSQLiteDatabase.getPath();
    if (zzcb.version() >= 9)
    {
      paramSQLiteDatabase = new File(paramSQLiteDatabase);
      paramSQLiteDatabase.setReadable(false, false);
      paramSQLiteDatabase.setWritable(false, false);
      paramSQLiteDatabase.setReadable(true, true);
      paramSQLiteDatabase.setWritable(true, true);
    }
  }
  
  public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    if (Build.VERSION.SDK_INT < 15) {
      localObject = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
    }
    boolean bool;
    try
    {
      ((Cursor)localObject).moveToFirst();
      ((Cursor)localObject).close();
    }
    finally
    {
      ((Cursor)localObject).close();
    }
    int j = 0;
    if (!bool) {}
    for (Object localObject = zzbc.zzda();; localObject = "ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER")
    {
      paramSQLiteDatabase.execSQL((String)localObject);
      break;
      localObject = zzb(paramSQLiteDatabase, "hits2");
      i = 0;
      while (i < 4)
      {
        String str = new String[] { "hit_id", "hit_string", "hit_time", "hit_url" }[i];
        if (!((Set)localObject).remove(str))
        {
          paramSQLiteDatabase = String.valueOf(str);
          if (paramSQLiteDatabase.length() != 0) {
            paramSQLiteDatabase = "Database hits2 is missing required column: ".concat(paramSQLiteDatabase);
          } else {
            paramSQLiteDatabase = new String("Database hits2 is missing required column: ");
          }
          throw new SQLiteException(paramSQLiteDatabase);
        }
        i += 1;
      }
      bool = ((Set)localObject).remove("hit_app_id");
      if (!((Set)localObject).isEmpty()) {
        break label365;
      }
      if (!(bool ^ true)) {
        break;
      }
    }
    if (!zza(paramSQLiteDatabase, "properties"))
    {
      paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
      return;
    }
    paramSQLiteDatabase = zzb(paramSQLiteDatabase, "properties");
    int i = j;
    while (i < 6)
    {
      localObject = new String[] { "app_uid", "cid", "tid", "params", "adid", "hits_count" }[i];
      if (!paramSQLiteDatabase.remove(localObject))
      {
        paramSQLiteDatabase = String.valueOf(localObject);
        if (paramSQLiteDatabase.length() != 0) {
          paramSQLiteDatabase = "Database properties is missing required column: ".concat(paramSQLiteDatabase);
        } else {
          paramSQLiteDatabase = new String("Database properties is missing required column: ");
        }
        throw new SQLiteException(paramSQLiteDatabase);
      }
      i += 1;
    }
    if (paramSQLiteDatabase.isEmpty()) {
      return;
    }
    throw new SQLiteException("Database properties table has extra columns");
    label365:
    throw new SQLiteException("Database hits2 has extra columns");
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */