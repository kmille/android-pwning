package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.HttpUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzbc
  extends zzar
  implements Closeable
{
  private static final String zzwt = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] { "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id" });
  private static final String zzwu = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[] { "hit_time", "hits2" });
  private final zzbd zzwv;
  private final zzcz zzww = new zzcz(zzbt());
  private final zzcz zzwx = new zzcz(zzbt());
  
  zzbc(zzat paramzzat)
  {
    super(paramzzat);
    this.zzwv = new zzbd(this, paramzzat.getContext(), "google_analytics_v4.db");
  }
  
  /* Error */
  private final long zza(String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 87	com/google/android/gms/internal/measurement/zzbc:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore_2
    //   5: aload_2
    //   6: aload_1
    //   7: aconst_null
    //   8: invokevirtual 93	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   11: astore 5
    //   13: aload 5
    //   15: astore_2
    //   16: aload 5
    //   18: invokeinterface 99 1 0
    //   23: ifeq +29 -> 52
    //   26: aload 5
    //   28: astore_2
    //   29: aload 5
    //   31: iconst_0
    //   32: invokeinterface 103 2 0
    //   37: lstore_3
    //   38: aload 5
    //   40: ifnull +10 -> 50
    //   43: aload 5
    //   45: invokeinterface 106 1 0
    //   50: lload_3
    //   51: lreturn
    //   52: aload 5
    //   54: astore_2
    //   55: new 83	android/database/sqlite/SQLiteException
    //   58: dup
    //   59: ldc 108
    //   61: invokespecial 111	android/database/sqlite/SQLiteException:<init>	(Ljava/lang/String;)V
    //   64: athrow
    //   65: astore_1
    //   66: goto +37 -> 103
    //   69: astore 6
    //   71: goto +14 -> 85
    //   74: astore_1
    //   75: aconst_null
    //   76: astore_2
    //   77: goto +26 -> 103
    //   80: astore 6
    //   82: aconst_null
    //   83: astore 5
    //   85: aload 5
    //   87: astore_2
    //   88: aload_0
    //   89: ldc 113
    //   91: aload_1
    //   92: aload 6
    //   94: invokevirtual 117	com/google/android/gms/internal/measurement/zzaq:zzd	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   97: aload 5
    //   99: astore_2
    //   100: aload 6
    //   102: athrow
    //   103: aload_2
    //   104: ifnull +9 -> 113
    //   107: aload_2
    //   108: invokeinterface 106 1 0
    //   113: aload_1
    //   114: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	zzbc
    //   0	115	1	paramString	String
    //   0	115	2	paramArrayOfString	String[]
    //   37	14	3	l	long
    //   11	87	5	localCursor	android.database.Cursor
    //   69	1	6	localSQLiteException1	SQLiteException
    //   80	21	6	localSQLiteException2	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   16	26	65	finally
    //   29	38	65	finally
    //   55	65	65	finally
    //   88	97	65	finally
    //   100	103	65	finally
    //   16	26	69	android/database/sqlite/SQLiteException
    //   29	38	69	android/database/sqlite/SQLiteException
    //   55	65	69	android/database/sqlite/SQLiteException
    //   5	13	74	finally
    //   5	13	80	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  private final long zza(String paramString, String[] paramArrayOfString, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 87	com/google/android/gms/internal/measurement/zzbc:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore 7
    //   6: aconst_null
    //   7: astore 6
    //   9: aconst_null
    //   10: astore 5
    //   12: aload 7
    //   14: aload_1
    //   15: aload_2
    //   16: invokevirtual 93	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   19: astore_2
    //   20: aload_2
    //   21: invokeinterface 99 1 0
    //   26: ifeq +23 -> 49
    //   29: aload_2
    //   30: iconst_0
    //   31: invokeinterface 103 2 0
    //   36: lstore_3
    //   37: aload_2
    //   38: ifnull +9 -> 47
    //   41: aload_2
    //   42: invokeinterface 106 1 0
    //   47: lload_3
    //   48: lreturn
    //   49: aload_2
    //   50: ifnull +9 -> 59
    //   53: aload_2
    //   54: invokeinterface 106 1 0
    //   59: lconst_0
    //   60: lreturn
    //   61: astore_1
    //   62: goto +42 -> 104
    //   65: astore 6
    //   67: goto +19 -> 86
    //   70: astore_1
    //   71: aload 5
    //   73: astore_2
    //   74: goto +30 -> 104
    //   77: astore 5
    //   79: aload 6
    //   81: astore_2
    //   82: aload 5
    //   84: astore 6
    //   86: aload_2
    //   87: astore 5
    //   89: aload_0
    //   90: ldc 113
    //   92: aload_1
    //   93: aload 6
    //   95: invokevirtual 117	com/google/android/gms/internal/measurement/zzaq:zzd	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   98: aload_2
    //   99: astore 5
    //   101: aload 6
    //   103: athrow
    //   104: aload_2
    //   105: ifnull +9 -> 114
    //   108: aload_2
    //   109: invokeinterface 106 1 0
    //   114: aload_1
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	zzbc
    //   0	116	1	paramString	String
    //   0	116	2	paramArrayOfString	String[]
    //   0	116	3	paramLong	long
    //   10	62	5	localObject1	Object
    //   77	6	5	localSQLiteException1	SQLiteException
    //   87	13	5	arrayOfString	String[]
    //   7	1	6	localObject2	Object
    //   65	15	6	localSQLiteException2	SQLiteException
    //   84	18	6	localObject3	Object
    //   4	9	7	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   20	37	61	finally
    //   20	37	65	android/database/sqlite/SQLiteException
    //   12	20	70	finally
    //   89	98	70	finally
    //   101	104	70	finally
    //   12	20	77	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  private final List<Long> zzc(long paramLong)
  {
    // Byte code:
    //   0: invokestatic 132	com/google/android/gms/analytics/zzk:zzab	()V
    //   3: aload_0
    //   4: invokevirtual 135	com/google/android/gms/internal/measurement/zzar:zzch	()V
    //   7: lload_1
    //   8: lconst_0
    //   9: lcmp
    //   10: ifgt +7 -> 17
    //   13: invokestatic 141	java/util/Collections:emptyList	()Ljava/util/List;
    //   16: areturn
    //   17: aload_0
    //   18: invokevirtual 87	com/google/android/gms/internal/measurement/zzbc:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   21: astore 6
    //   23: new 143	java/util/ArrayList
    //   26: dup
    //   27: invokespecial 145	java/util/ArrayList:<init>	()V
    //   30: astore 8
    //   32: aconst_null
    //   33: astore 7
    //   35: aconst_null
    //   36: astore 5
    //   38: aload 5
    //   40: astore 4
    //   42: ldc -109
    //   44: iconst_1
    //   45: anewarray 20	java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: ldc 24
    //   52: aastore
    //   53: invokestatic 38	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   56: astore 9
    //   58: aload 5
    //   60: astore 4
    //   62: lload_1
    //   63: invokestatic 153	java/lang/Long:toString	(J)Ljava/lang/String;
    //   66: astore 10
    //   68: aload 5
    //   70: astore 4
    //   72: aload 6
    //   74: ldc 22
    //   76: iconst_1
    //   77: anewarray 34	java/lang/String
    //   80: dup
    //   81: iconst_0
    //   82: ldc 24
    //   84: aastore
    //   85: aconst_null
    //   86: aconst_null
    //   87: aconst_null
    //   88: aconst_null
    //   89: aload 9
    //   91: aload 10
    //   93: invokevirtual 157	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   96: astore 5
    //   98: aload 5
    //   100: invokeinterface 99 1 0
    //   105: ifeq +34 -> 139
    //   108: aload 8
    //   110: aload 5
    //   112: iconst_0
    //   113: invokeinterface 103 2 0
    //   118: invokestatic 161	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   121: invokeinterface 167 2 0
    //   126: pop
    //   127: aload 5
    //   129: invokeinterface 170 1 0
    //   134: istore_3
    //   135: iload_3
    //   136: ifne -28 -> 108
    //   139: aload 5
    //   141: ifnull +66 -> 207
    //   144: aload 5
    //   146: invokeinterface 106 1 0
    //   151: aload 8
    //   153: areturn
    //   154: astore 6
    //   156: aload 5
    //   158: astore 4
    //   160: aload 6
    //   162: astore 5
    //   164: goto +46 -> 210
    //   167: astore 6
    //   169: goto +14 -> 183
    //   172: astore 5
    //   174: goto +36 -> 210
    //   177: astore 6
    //   179: aload 7
    //   181: astore 5
    //   183: aload 5
    //   185: astore 4
    //   187: aload_0
    //   188: ldc -84
    //   190: aload 6
    //   192: invokevirtual 175	com/google/android/gms/internal/measurement/zzaq:zzd	(Ljava/lang/String;Ljava/lang/Object;)V
    //   195: aload 5
    //   197: ifnull +10 -> 207
    //   200: aload 5
    //   202: invokeinterface 106 1 0
    //   207: aload 8
    //   209: areturn
    //   210: aload 4
    //   212: ifnull +10 -> 222
    //   215: aload 4
    //   217: invokeinterface 106 1 0
    //   222: aload 5
    //   224: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	225	0	this	zzbc
    //   0	225	1	paramLong	long
    //   134	2	3	bool	boolean
    //   40	176	4	localObject1	Object
    //   36	127	5	localObject2	Object
    //   172	1	5	localObject3	Object
    //   181	42	5	localObject4	Object
    //   21	52	6	localSQLiteDatabase	SQLiteDatabase
    //   154	7	6	localObject5	Object
    //   167	1	6	localSQLiteException1	SQLiteException
    //   177	14	6	localSQLiteException2	SQLiteException
    //   33	147	7	localObject6	Object
    //   30	178	8	localArrayList	ArrayList
    //   56	34	9	str1	String
    //   66	26	10	str2	String
    // Exception table:
    //   from	to	target	type
    //   98	108	154	finally
    //   108	135	154	finally
    //   98	108	167	android/database/sqlite/SQLiteException
    //   108	135	167	android/database/sqlite/SQLiteException
    //   42	58	172	finally
    //   62	68	172	finally
    //   72	98	172	finally
    //   187	195	172	finally
    //   42	58	177	android/database/sqlite/SQLiteException
    //   62	68	177	android/database/sqlite/SQLiteException
    //   72	98	177	android/database/sqlite/SQLiteException
  }
  
  private final long zzcr()
  {
    zzk.zzab();
    zzch();
    return zza("SELECT COUNT(*) FROM hits2", null);
  }
  
  private static String zzcz()
  {
    return "google_analytics_v4.db";
  }
  
  @VisibleForTesting
  private final Map<String, String> zzv(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return new HashMap(0);
    }
    try
    {
      if (!paramString.startsWith("?"))
      {
        paramString = String.valueOf(paramString);
        if (paramString.length() != 0) {
          paramString = "?".concat(paramString);
        } else {
          paramString = new String("?");
        }
      }
      paramString = HttpUtils.parse(new URI(paramString), "UTF-8");
      return paramString;
    }
    catch (URISyntaxException paramString)
    {
      zze("Error parsing hit parameters", paramString);
    }
    return new HashMap(0);
  }
  
  @VisibleForTesting
  private final Map<String, String> zzw(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return new HashMap(0);
    }
    try
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "?".concat(paramString);
      } else {
        paramString = new String("?");
      }
      paramString = HttpUtils.parse(new URI(paramString), "UTF-8");
      return paramString;
    }
    catch (URISyntaxException paramString)
    {
      zze("Error parsing property parameters", paramString);
    }
    return new HashMap(0);
  }
  
  public final void beginTransaction()
  {
    zzch();
    getWritableDatabase().beginTransaction();
  }
  
  public final void close()
  {
    try
    {
      this.zzwv.close();
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      str = "Error closing database";
      zze(str, localIllegalStateException);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        String str = "Sql error closing database";
      }
    }
  }
  
  public final void endTransaction()
  {
    zzch();
    getWritableDatabase().endTransaction();
  }
  
  @VisibleForTesting
  final SQLiteDatabase getWritableDatabase()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.zzwv.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      zzd("Error opening database", localSQLiteException);
      throw localSQLiteException;
    }
  }
  
  final boolean isEmpty()
  {
    return zzcr() == 0L;
  }
  
  public final void setTransactionSuccessful()
  {
    zzch();
    getWritableDatabase().setTransactionSuccessful();
  }
  
  public final long zza(long paramLong, String paramString1, String paramString2)
  {
    Preconditions.checkNotEmpty(paramString1);
    Preconditions.checkNotEmpty(paramString2);
    zzch();
    zzk.zzab();
    return zza("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[] { String.valueOf(paramLong), paramString1, paramString2 }, 0L);
  }
  
  public final void zza(List<Long> paramList)
  {
    Preconditions.checkNotNull(paramList);
    zzk.zzab();
    zzch();
    if (paramList.isEmpty()) {
      return;
    }
    Object localObject1 = new StringBuilder("hit_id");
    ((StringBuilder)localObject1).append(" in (");
    int i = 0;
    Object localObject2;
    while (i < paramList.size())
    {
      localObject2 = (Long)paramList.get(i);
      if ((localObject2 != null) && (((Long)localObject2).longValue() != 0L))
      {
        if (i > 0) {
          ((StringBuilder)localObject1).append(",");
        }
        ((StringBuilder)localObject1).append(localObject2);
        i += 1;
      }
      else
      {
        throw new SQLiteException("Invalid hit id");
      }
    }
    ((StringBuilder)localObject1).append(")");
    localObject1 = ((StringBuilder)localObject1).toString();
    try
    {
      localObject2 = getWritableDatabase();
      zza("Deleting dispatched hits. count", Integer.valueOf(paramList.size()));
      i = ((SQLiteDatabase)localObject2).delete("hits2", (String)localObject1, null);
      if (i != paramList.size()) {
        zzb("Deleted fewer hits then expected", Integer.valueOf(paramList.size()), Integer.valueOf(i), localObject1);
      }
      return;
    }
    catch (SQLiteException paramList)
    {
      zze("Error deleting hits", paramList);
      throw paramList;
    }
  }
  
  protected final void zzac() {}
  
  public final void zzc(zzch paramzzch)
  {
    Preconditions.checkNotNull(paramzzch);
    zzk.zzab();
    zzch();
    Preconditions.checkNotNull(paramzzch);
    Object localObject1 = new Uri.Builder();
    Object localObject2 = paramzzch.zzcs().entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      String str = (String)((Map.Entry)localObject3).getKey();
      if ((!"ht".equals(str)) && (!"qt".equals(str)) && (!"AppUID".equals(str))) {
        ((Uri.Builder)localObject1).appendQueryParameter(str, (String)((Map.Entry)localObject3).getValue());
      }
    }
    localObject2 = ((Uri.Builder)localObject1).build().getEncodedQuery();
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = "";
    }
    if (((String)localObject1).length() > 8192)
    {
      zzbu().zza(paramzzch, "Hit length exceeds the maximum allowed size");
      return;
    }
    int i = ((Integer)zzcc.zzyo.get()).intValue();
    long l = zzcr();
    if (l > i - 1)
    {
      localObject2 = zzc(l - i + 1L);
      zzd("Store full, deleting hits to make room, count", Integer.valueOf(((List)localObject2).size()));
      zza((List)localObject2);
    }
    localObject2 = getWritableDatabase();
    Object localObject3 = new ContentValues();
    ((ContentValues)localObject3).put("hit_string", (String)localObject1);
    ((ContentValues)localObject3).put("hit_time", Long.valueOf(paramzzch.zzen()));
    ((ContentValues)localObject3).put("hit_app_id", Integer.valueOf(paramzzch.zzel()));
    if (paramzzch.zzep()) {
      localObject1 = zzbu.zzdz();
    } else {
      localObject1 = zzbu.zzea();
    }
    ((ContentValues)localObject3).put("hit_url", (String)localObject1);
    try
    {
      l = ((SQLiteDatabase)localObject2).insert("hits2", null, (ContentValues)localObject3);
      if (l == -1L)
      {
        zzu("Failed to insert a hit (got -1)");
        return;
      }
      zzb("Hit saved to database. db-id, hit", Long.valueOf(l), paramzzch);
      return;
    }
    catch (SQLiteException paramzzch)
    {
      zze("Error storing a hit", paramzzch);
    }
  }
  
  public final int zzcx()
  {
    zzk.zzab();
    zzch();
    if (!this.zzww.zzj(86400000L)) {
      return 0;
    }
    this.zzww.start();
    zzq("Deleting stale hits (if any)");
    int i = getWritableDatabase().delete("hits2", "hit_time < ?", new String[] { Long.toString(zzbt().currentTimeMillis() - 2592000000L) });
    zza("Deleted stale hits, count", Integer.valueOf(i));
    return i;
  }
  
  public final long zzcy()
  {
    zzk.zzab();
    zzch();
    return zza(zzwu, null, 0L);
  }
  
  /* Error */
  public final List<zzch> zzd(long paramLong)
  {
    // Byte code:
    //   0: lload_1
    //   1: lconst_0
    //   2: lcmp
    //   3: iflt +9 -> 12
    //   6: iconst_1
    //   7: istore 6
    //   9: goto +6 -> 15
    //   12: iconst_0
    //   13: istore 6
    //   15: iload 6
    //   17: invokestatic 502	com/google/android/gms/common/internal/Preconditions:checkArgument	(Z)V
    //   20: invokestatic 132	com/google/android/gms/analytics/zzk:zzab	()V
    //   23: aload_0
    //   24: invokevirtual 135	com/google/android/gms/internal/measurement/zzar:zzch	()V
    //   27: aload_0
    //   28: invokevirtual 87	com/google/android/gms/internal/measurement/zzbc:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   31: astore 10
    //   33: aconst_null
    //   34: astore 9
    //   36: aconst_null
    //   37: astore 8
    //   39: aload 8
    //   41: astore 7
    //   43: ldc -109
    //   45: iconst_1
    //   46: anewarray 20	java/lang/Object
    //   49: dup
    //   50: iconst_0
    //   51: ldc 24
    //   53: aastore
    //   54: invokestatic 38	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   57: astore 11
    //   59: aload 8
    //   61: astore 7
    //   63: lload_1
    //   64: invokestatic 153	java/lang/Long:toString	(J)Ljava/lang/String;
    //   67: astore 12
    //   69: aload 8
    //   71: astore 7
    //   73: aload 10
    //   75: ldc 22
    //   77: iconst_5
    //   78: anewarray 34	java/lang/String
    //   81: dup
    //   82: iconst_0
    //   83: ldc 24
    //   85: aastore
    //   86: dup
    //   87: iconst_1
    //   88: ldc 26
    //   90: aastore
    //   91: dup
    //   92: iconst_2
    //   93: ldc 30
    //   95: aastore
    //   96: dup
    //   97: iconst_3
    //   98: ldc 28
    //   100: aastore
    //   101: dup
    //   102: iconst_4
    //   103: ldc 32
    //   105: aastore
    //   106: aconst_null
    //   107: aconst_null
    //   108: aconst_null
    //   109: aconst_null
    //   110: aload 11
    //   112: aload 12
    //   114: invokevirtual 157	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   117: astore 8
    //   119: new 143	java/util/ArrayList
    //   122: dup
    //   123: invokespecial 145	java/util/ArrayList:<init>	()V
    //   126: astore 7
    //   128: aload 8
    //   130: invokeinterface 99 1 0
    //   135: ifeq +102 -> 237
    //   138: aload 8
    //   140: iconst_0
    //   141: invokeinterface 103 2 0
    //   146: lstore_1
    //   147: aload 8
    //   149: iconst_1
    //   150: invokeinterface 103 2 0
    //   155: lstore 4
    //   157: aload 8
    //   159: iconst_2
    //   160: invokeinterface 506 2 0
    //   165: astore 9
    //   167: aload 8
    //   169: iconst_3
    //   170: invokeinterface 506 2 0
    //   175: astore 10
    //   177: aload 8
    //   179: iconst_4
    //   180: invokeinterface 510 2 0
    //   185: istore_3
    //   186: aload 7
    //   188: new 337	com/google/android/gms/internal/measurement/zzch
    //   191: dup
    //   192: aload_0
    //   193: aload_0
    //   194: aload 9
    //   196: invokespecial 512	com/google/android/gms/internal/measurement/zzbc:zzv	(Ljava/lang/String;)Ljava/util/Map;
    //   199: lload 4
    //   201: aload 10
    //   203: invokestatic 517	com/google/android/gms/internal/measurement/zzdd:zzah	(Ljava/lang/String;)Z
    //   206: lload_1
    //   207: iload_3
    //   208: invokespecial 520	com/google/android/gms/internal/measurement/zzch:<init>	(Lcom/google/android/gms/internal/measurement/zzaq;Ljava/util/Map;JZJI)V
    //   211: invokeinterface 167 2 0
    //   216: pop
    //   217: aload 8
    //   219: invokeinterface 170 1 0
    //   224: istore 6
    //   226: iload 6
    //   228: ifne +6 -> 234
    //   231: goto +6 -> 237
    //   234: goto -96 -> 138
    //   237: aload 8
    //   239: ifnull +10 -> 249
    //   242: aload 8
    //   244: invokeinterface 106 1 0
    //   249: aload 7
    //   251: areturn
    //   252: astore 9
    //   254: aload 8
    //   256: astore 7
    //   258: aload 9
    //   260: astore 8
    //   262: goto +43 -> 305
    //   265: astore 9
    //   267: goto +18 -> 285
    //   270: astore 8
    //   272: goto +33 -> 305
    //   275: astore 7
    //   277: aload 9
    //   279: astore 8
    //   281: aload 7
    //   283: astore 9
    //   285: aload 8
    //   287: astore 7
    //   289: aload_0
    //   290: ldc_w 522
    //   293: aload 9
    //   295: invokevirtual 234	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   298: aload 8
    //   300: astore 7
    //   302: aload 9
    //   304: athrow
    //   305: aload 7
    //   307: ifnull +10 -> 317
    //   310: aload 7
    //   312: invokeinterface 106 1 0
    //   317: aload 8
    //   319: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	320	0	this	zzbc
    //   0	320	1	paramLong	long
    //   185	23	3	i	int
    //   155	45	4	l	long
    //   7	220	6	bool	boolean
    //   41	216	7	localObject1	Object
    //   275	7	7	localSQLiteException1	SQLiteException
    //   287	24	7	localSQLiteException2	SQLiteException
    //   37	224	8	localObject2	Object
    //   270	1	8	localObject3	Object
    //   279	39	8	localSQLiteException3	SQLiteException
    //   34	161	9	str1	String
    //   252	7	9	localObject4	Object
    //   265	13	9	localSQLiteException4	SQLiteException
    //   283	20	9	localObject5	Object
    //   31	171	10	localObject6	Object
    //   57	54	11	str2	String
    //   67	46	12	str3	String
    // Exception table:
    //   from	to	target	type
    //   119	138	252	finally
    //   138	226	252	finally
    //   119	138	265	android/database/sqlite/SQLiteException
    //   138	226	265	android/database/sqlite/SQLiteException
    //   43	59	270	finally
    //   63	69	270	finally
    //   73	119	270	finally
    //   289	298	270	finally
    //   302	305	270	finally
    //   43	59	275	android/database/sqlite/SQLiteException
    //   63	69	275	android/database/sqlite/SQLiteException
    //   73	119	275	android/database/sqlite/SQLiteException
  }
  
  public final void zze(long paramLong)
  {
    zzk.zzab();
    zzch();
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(Long.valueOf(paramLong));
    zza("Deleting hit, id", Long.valueOf(paramLong));
    zza(localArrayList);
  }
  
  /* Error */
  public final List<zzaw> zzf(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 135	com/google/android/gms/internal/measurement/zzar:zzch	()V
    //   4: invokestatic 132	com/google/android/gms/analytics/zzk:zzab	()V
    //   7: aload_0
    //   8: invokevirtual 87	com/google/android/gms/internal/measurement/zzbc:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   11: astore 5
    //   13: getstatic 531	com/google/android/gms/internal/measurement/zzcc:zzyq	Lcom/google/android/gms/internal/measurement/zzcd;
    //   16: invokevirtual 415	com/google/android/gms/internal/measurement/zzcd:get	()Ljava/lang/Object;
    //   19: checkcast 313	java/lang/Integer
    //   22: invokevirtual 418	java/lang/Integer:intValue	()I
    //   25: istore_3
    //   26: aload 5
    //   28: ldc_w 533
    //   31: iconst_5
    //   32: anewarray 34	java/lang/String
    //   35: dup
    //   36: iconst_0
    //   37: ldc_w 535
    //   40: aastore
    //   41: dup
    //   42: iconst_1
    //   43: ldc_w 537
    //   46: aastore
    //   47: dup
    //   48: iconst_2
    //   49: ldc_w 539
    //   52: aastore
    //   53: dup
    //   54: iconst_3
    //   55: ldc_w 541
    //   58: aastore
    //   59: dup
    //   60: iconst_4
    //   61: ldc_w 543
    //   64: aastore
    //   65: ldc_w 545
    //   68: iconst_1
    //   69: anewarray 34	java/lang/String
    //   72: dup
    //   73: iconst_0
    //   74: ldc_w 547
    //   77: aastore
    //   78: aconst_null
    //   79: aconst_null
    //   80: aconst_null
    //   81: iload_3
    //   82: invokestatic 549	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   85: invokevirtual 157	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   88: astore 5
    //   90: new 143	java/util/ArrayList
    //   93: dup
    //   94: invokespecial 145	java/util/ArrayList:<init>	()V
    //   97: astore 6
    //   99: aload 5
    //   101: invokeinterface 99 1 0
    //   106: ifeq +132 -> 238
    //   109: aload 5
    //   111: iconst_0
    //   112: invokeinterface 506 2 0
    //   117: astore 7
    //   119: aload 5
    //   121: iconst_1
    //   122: invokeinterface 506 2 0
    //   127: astore 8
    //   129: aload 5
    //   131: iconst_2
    //   132: invokeinterface 510 2 0
    //   137: ifeq +202 -> 339
    //   140: iconst_1
    //   141: istore 4
    //   143: goto +3 -> 146
    //   146: aload 5
    //   148: iconst_3
    //   149: invokeinterface 510 2 0
    //   154: i2l
    //   155: lstore_1
    //   156: aload_0
    //   157: aload 5
    //   159: iconst_4
    //   160: invokeinterface 506 2 0
    //   165: invokespecial 551	com/google/android/gms/internal/measurement/zzbc:zzw	(Ljava/lang/String;)Ljava/util/Map;
    //   168: astore 9
    //   170: aload 7
    //   172: invokestatic 195	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   175: ifne +42 -> 217
    //   178: aload 8
    //   180: invokestatic 195	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   183: ifeq +6 -> 189
    //   186: goto +31 -> 217
    //   189: aload 6
    //   191: new 553	com/google/android/gms/internal/measurement/zzaw
    //   194: dup
    //   195: lconst_0
    //   196: aload 7
    //   198: aload 8
    //   200: iload 4
    //   202: lload_1
    //   203: aload 9
    //   205: invokespecial 556	com/google/android/gms/internal/measurement/zzaw:<init>	(JLjava/lang/String;Ljava/lang/String;ZJLjava/util/Map;)V
    //   208: invokeinterface 167 2 0
    //   213: pop
    //   214: goto +14 -> 228
    //   217: aload_0
    //   218: ldc_w 558
    //   221: aload 7
    //   223: aload 8
    //   225: invokevirtual 560	com/google/android/gms/internal/measurement/zzaq:zzc	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   228: aload 5
    //   230: invokeinterface 170 1 0
    //   235: ifne -126 -> 109
    //   238: aload 6
    //   240: invokeinterface 291 1 0
    //   245: iload_3
    //   246: if_icmplt +10 -> 256
    //   249: aload_0
    //   250: ldc_w 562
    //   253: invokevirtual 565	com/google/android/gms/internal/measurement/zzaq:zzt	(Ljava/lang/String;)V
    //   256: aload 5
    //   258: ifnull +10 -> 268
    //   261: aload 5
    //   263: invokeinterface 106 1 0
    //   268: aload 6
    //   270: areturn
    //   271: astore 7
    //   273: aload 5
    //   275: astore 6
    //   277: aload 7
    //   279: astore 5
    //   281: goto +43 -> 324
    //   284: astore 6
    //   286: goto +16 -> 302
    //   289: astore 5
    //   291: aconst_null
    //   292: astore 6
    //   294: goto +30 -> 324
    //   297: astore 6
    //   299: aconst_null
    //   300: astore 5
    //   302: aload_0
    //   303: ldc_w 522
    //   306: aload 6
    //   308: invokevirtual 234	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   311: aload 6
    //   313: athrow
    //   314: astore 7
    //   316: aload 5
    //   318: astore 6
    //   320: aload 7
    //   322: astore 5
    //   324: aload 6
    //   326: ifnull +10 -> 336
    //   329: aload 6
    //   331: invokeinterface 106 1 0
    //   336: aload 5
    //   338: athrow
    //   339: iconst_0
    //   340: istore 4
    //   342: goto -196 -> 146
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	345	0	this	zzbc
    //   0	345	1	paramLong	long
    //   25	222	3	i	int
    //   141	200	4	bool	boolean
    //   11	269	5	localObject1	Object
    //   289	1	5	localObject2	Object
    //   300	37	5	localObject3	Object
    //   97	179	6	localObject4	Object
    //   284	1	6	localSQLiteException1	SQLiteException
    //   292	1	6	localObject5	Object
    //   297	15	6	localSQLiteException2	SQLiteException
    //   318	12	6	localObject6	Object
    //   117	105	7	str1	String
    //   271	7	7	localObject7	Object
    //   314	7	7	localObject8	Object
    //   127	97	8	str2	String
    //   168	36	9	localMap	Map
    // Exception table:
    //   from	to	target	type
    //   90	109	271	finally
    //   109	140	271	finally
    //   146	186	271	finally
    //   189	214	271	finally
    //   217	228	271	finally
    //   228	238	271	finally
    //   238	256	271	finally
    //   90	109	284	android/database/sqlite/SQLiteException
    //   109	140	284	android/database/sqlite/SQLiteException
    //   146	186	284	android/database/sqlite/SQLiteException
    //   189	214	284	android/database/sqlite/SQLiteException
    //   217	228	284	android/database/sqlite/SQLiteException
    //   228	238	284	android/database/sqlite/SQLiteException
    //   238	256	284	android/database/sqlite/SQLiteException
    //   13	90	289	finally
    //   13	90	297	android/database/sqlite/SQLiteException
    //   302	314	314	finally
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzbc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */