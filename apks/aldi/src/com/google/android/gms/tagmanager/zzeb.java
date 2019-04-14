package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;

@VisibleForTesting
final class zzeb
  implements zzcb
{
  private static final String zzwt = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", new Object[] { "gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time" });
  private Clock clock;
  private final zzed zzbbm;
  private volatile zzbe zzbbn;
  private final zzcc zzbbo;
  private final String zzbbp;
  private long zzbbq;
  private final int zzbbr;
  private final Context zzqx;
  
  zzeb(zzcc paramzzcc, Context paramContext)
  {
    this(paramzzcc, paramContext, "gtm_urls.db", 2000);
  }
  
  @VisibleForTesting
  private zzeb(zzcc paramzzcc, Context paramContext, String paramString, int paramInt)
  {
    this.zzqx = paramContext.getApplicationContext();
    this.zzbbp = paramString;
    this.zzbbo = paramzzcc;
    this.clock = DefaultClock.getInstance();
    this.zzbbm = new zzed(this, this.zzqx, this.zzbbp);
    this.zzbbn = new zzfu(this.zzqx, new zzec(this));
    this.zzbbq = 0L;
    this.zzbbr = 2000;
  }
  
  private final void zza(String[] paramArrayOfString)
  {
    SQLiteDatabase localSQLiteDatabase;
    String str;
    if (paramArrayOfString != null)
    {
      if (paramArrayOfString.length == 0) {
        return;
      }
      localSQLiteDatabase = zzcy("Error opening database for deleteHits.");
      if (localSQLiteDatabase == null) {
        return;
      }
      bool = true;
      str = String.format("HIT_ID in (%s)", new Object[] { TextUtils.join(",", Collections.nCopies(paramArrayOfString.length, "?")) });
    }
    try
    {
      localSQLiteDatabase.delete("gtm_hits", str, paramArrayOfString);
      paramArrayOfString = this.zzbbo;
      if (zzoh() != 0) {
        break label93;
      }
    }
    catch (SQLiteException paramArrayOfString)
    {
      for (;;)
      {
        continue;
        bool = false;
      }
    }
    paramArrayOfString.zzo(bool);
    return;
    zzdi.zzab("Error deleting hits");
  }
  
  private final void zzc(long paramLong1, long paramLong2)
  {
    Object localObject = zzcy("Error opening database for getNumStoredHits.");
    if (localObject == null) {
      return;
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("hit_first_send_time", Long.valueOf(paramLong2));
    try
    {
      ((SQLiteDatabase)localObject).update("gtm_hits", localContentValues, "hit_id=?", new String[] { String.valueOf(paramLong1) });
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;) {}
    }
    localObject = new StringBuilder(69);
    ((StringBuilder)localObject).append("Error setting HIT_FIRST_DISPATCH_TIME for hitId: ");
    ((StringBuilder)localObject).append(paramLong1);
    zzdi.zzab(((StringBuilder)localObject).toString());
    zze(paramLong1);
  }
  
  private final SQLiteDatabase zzcy(String paramString)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.zzbbm.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;) {}
    }
    zzdi.zzab(paramString);
    return null;
  }
  
  private final void zze(long paramLong)
  {
    zza(new String[] { String.valueOf(paramLong) });
  }
  
  /* Error */
  private final int zzoh()
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc -88
    //   3: invokespecial 121	com/google/android/gms/tagmanager/zzeb:zzcy	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   6: astore 7
    //   8: iconst_0
    //   9: istore_3
    //   10: iconst_0
    //   11: istore_1
    //   12: aload 7
    //   14: ifnonnull +5 -> 19
    //   17: iconst_0
    //   18: ireturn
    //   19: aconst_null
    //   20: astore 8
    //   22: aconst_null
    //   23: astore 6
    //   25: aload 7
    //   27: ldc -40
    //   29: aconst_null
    //   30: invokevirtual 220	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   33: astore 7
    //   35: aload 7
    //   37: invokeinterface 226 1 0
    //   42: ifeq +17 -> 59
    //   45: aload 7
    //   47: iconst_0
    //   48: invokeinterface 230 2 0
    //   53: lstore 4
    //   55: lload 4
    //   57: l2i
    //   58: istore_1
    //   59: iload_1
    //   60: istore_2
    //   61: aload 7
    //   63: ifnull +58 -> 121
    //   66: aload 7
    //   68: invokeinterface 233 1 0
    //   73: iload_1
    //   74: ireturn
    //   75: astore 8
    //   77: aload 7
    //   79: astore 6
    //   81: aload 8
    //   83: astore 7
    //   85: goto +38 -> 123
    //   88: goto +8 -> 96
    //   91: astore 7
    //   93: goto +30 -> 123
    //   96: aload 7
    //   98: astore 6
    //   100: ldc -21
    //   102: invokestatic 163	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   105: iload_3
    //   106: istore_2
    //   107: aload 7
    //   109: ifnull +12 -> 121
    //   112: aload 7
    //   114: invokeinterface 233 1 0
    //   119: iload_3
    //   120: istore_2
    //   121: iload_2
    //   122: ireturn
    //   123: aload 6
    //   125: ifnull +10 -> 135
    //   128: aload 6
    //   130: invokeinterface 233 1 0
    //   135: aload 7
    //   137: athrow
    //   138: astore 6
    //   140: aload 8
    //   142: astore 7
    //   144: goto -48 -> 96
    //   147: astore 6
    //   149: goto -61 -> 88
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	152	0	this	zzeb
    //   11	63	1	i	int
    //   60	62	2	j	int
    //   9	111	3	k	int
    //   53	3	4	l	long
    //   23	106	6	localObject1	Object
    //   138	1	6	localSQLiteException1	SQLiteException
    //   147	1	6	localSQLiteException2	SQLiteException
    //   6	78	7	localObject2	Object
    //   91	45	7	localObject3	Object
    //   142	1	7	localObject4	Object
    //   20	1	8	localObject5	Object
    //   75	66	8	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   35	55	75	finally
    //   25	35	91	finally
    //   100	105	91	finally
    //   25	35	138	android/database/sqlite/SQLiteException
    //   35	55	147	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  private final int zzoi()
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc -88
    //   3: invokespecial 121	com/google/android/gms/tagmanager/zzeb:zzcy	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnonnull +5 -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: aconst_null
    //   14: astore 4
    //   16: aconst_null
    //   17: astore_2
    //   18: aload_3
    //   19: ldc 30
    //   21: iconst_2
    //   22: anewarray 40	java/lang/String
    //   25: dup
    //   26: iconst_0
    //   27: ldc 32
    //   29: aastore
    //   30: dup
    //   31: iconst_1
    //   32: ldc 38
    //   34: aastore
    //   35: ldc -18
    //   37: aconst_null
    //   38: aconst_null
    //   39: aconst_null
    //   40: aconst_null
    //   41: invokevirtual 242	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   44: astore_3
    //   45: aload_3
    //   46: invokeinterface 245 1 0
    //   51: istore_1
    //   52: aload_3
    //   53: ifnull +9 -> 62
    //   56: aload_3
    //   57: invokeinterface 233 1 0
    //   62: iload_1
    //   63: ireturn
    //   64: astore 4
    //   66: aload_3
    //   67: astore_2
    //   68: aload 4
    //   70: astore_3
    //   71: goto +29 -> 100
    //   74: goto +7 -> 81
    //   77: astore_3
    //   78: goto +22 -> 100
    //   81: aload_3
    //   82: astore_2
    //   83: ldc -9
    //   85: invokestatic 163	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   88: aload_3
    //   89: ifnull +9 -> 98
    //   92: aload_3
    //   93: invokeinterface 233 1 0
    //   98: iconst_0
    //   99: ireturn
    //   100: aload_2
    //   101: ifnull +9 -> 110
    //   104: aload_2
    //   105: invokeinterface 233 1 0
    //   110: aload_3
    //   111: athrow
    //   112: astore_2
    //   113: aload 4
    //   115: astore_3
    //   116: goto -35 -> 81
    //   119: astore_2
    //   120: goto -46 -> 74
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	this	zzeb
    //   51	12	1	i	int
    //   17	88	2	localObject1	Object
    //   112	1	2	localSQLiteException1	SQLiteException
    //   119	1	2	localSQLiteException2	SQLiteException
    //   6	65	3	localObject2	Object
    //   77	34	3	localObject3	Object
    //   115	1	3	localObject4	Object
    //   14	1	4	localObject5	Object
    //   64	50	4	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   45	52	64	finally
    //   18	45	77	finally
    //   83	88	77	finally
    //   18	45	112	android/database/sqlite/SQLiteException
    //   45	52	119	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  private final List<String> zzx(int paramInt)
  {
    // Byte code:
    //   0: new 252	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 253	java/util/ArrayList:<init>	()V
    //   7: astore 7
    //   9: iload_1
    //   10: ifgt +11 -> 21
    //   13: ldc -1
    //   15: invokestatic 163	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   18: aload 7
    //   20: areturn
    //   21: aload_0
    //   22: ldc_w 257
    //   25: invokespecial 121	com/google/android/gms/tagmanager/zzeb:zzcy	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   28: astore 5
    //   30: aload 5
    //   32: ifnonnull +6 -> 38
    //   35: aload 7
    //   37: areturn
    //   38: aconst_null
    //   39: astore 6
    //   41: aconst_null
    //   42: astore 4
    //   44: aload 4
    //   46: astore_3
    //   47: ldc_w 259
    //   50: iconst_1
    //   51: anewarray 4	java/lang/Object
    //   54: dup
    //   55: iconst_0
    //   56: ldc 32
    //   58: aastore
    //   59: invokestatic 44	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   62: astore 8
    //   64: aload 4
    //   66: astore_3
    //   67: iload_1
    //   68: invokestatic 264	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   71: astore 9
    //   73: aload 4
    //   75: astore_3
    //   76: aload 5
    //   78: ldc 30
    //   80: iconst_1
    //   81: anewarray 40	java/lang/String
    //   84: dup
    //   85: iconst_0
    //   86: ldc 32
    //   88: aastore
    //   89: aconst_null
    //   90: aconst_null
    //   91: aconst_null
    //   92: aconst_null
    //   93: aload 8
    //   95: aload 9
    //   97: invokevirtual 267	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   100: astore 4
    //   102: aload 4
    //   104: invokeinterface 226 1 0
    //   109: ifeq +34 -> 143
    //   112: aload 7
    //   114: aload 4
    //   116: iconst_0
    //   117: invokeinterface 230 2 0
    //   122: invokestatic 186	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   125: invokeinterface 273 2 0
    //   130: pop
    //   131: aload 4
    //   133: invokeinterface 276 1 0
    //   138: istore_2
    //   139: iload_2
    //   140: ifne -28 -> 112
    //   143: aload 4
    //   145: ifnull +116 -> 261
    //   148: aload 4
    //   150: invokeinterface 233 1 0
    //   155: aload 7
    //   157: areturn
    //   158: astore 5
    //   160: aload 4
    //   162: astore_3
    //   163: aload 5
    //   165: astore 4
    //   167: goto +97 -> 264
    //   170: astore 5
    //   172: goto +14 -> 186
    //   175: astore 4
    //   177: goto +87 -> 264
    //   180: astore 5
    //   182: aload 6
    //   184: astore 4
    //   186: aload 4
    //   188: astore_3
    //   189: aload 5
    //   191: invokevirtual 279	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   194: invokestatic 282	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   197: astore 5
    //   199: aload 4
    //   201: astore_3
    //   202: aload 5
    //   204: invokevirtual 285	java/lang/String:length	()I
    //   207: ifeq +19 -> 226
    //   210: aload 4
    //   212: astore_3
    //   213: ldc_w 287
    //   216: aload 5
    //   218: invokevirtual 291	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   221: astore 5
    //   223: goto +18 -> 241
    //   226: aload 4
    //   228: astore_3
    //   229: new 40	java/lang/String
    //   232: dup
    //   233: ldc_w 287
    //   236: invokespecial 293	java/lang/String:<init>	(Ljava/lang/String;)V
    //   239: astore 5
    //   241: aload 4
    //   243: astore_3
    //   244: aload 5
    //   246: invokestatic 163	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   249: aload 4
    //   251: ifnull +10 -> 261
    //   254: aload 4
    //   256: invokeinterface 233 1 0
    //   261: aload 7
    //   263: areturn
    //   264: aload_3
    //   265: ifnull +9 -> 274
    //   268: aload_3
    //   269: invokeinterface 233 1 0
    //   274: aload 4
    //   276: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	277	0	this	zzeb
    //   0	277	1	paramInt	int
    //   138	2	2	bool	boolean
    //   46	223	3	localObject1	Object
    //   42	124	4	localObject2	Object
    //   175	1	4	localObject3	Object
    //   184	91	4	localObject4	Object
    //   28	49	5	localSQLiteDatabase	SQLiteDatabase
    //   158	6	5	localObject5	Object
    //   170	1	5	localSQLiteException1	SQLiteException
    //   180	10	5	localSQLiteException2	SQLiteException
    //   197	48	5	str1	String
    //   39	144	6	localObject6	Object
    //   7	255	7	localArrayList	java.util.ArrayList
    //   62	32	8	str2	String
    //   71	25	9	str3	String
    // Exception table:
    //   from	to	target	type
    //   102	112	158	finally
    //   112	139	158	finally
    //   102	112	170	android/database/sqlite/SQLiteException
    //   112	139	170	android/database/sqlite/SQLiteException
    //   47	64	175	finally
    //   67	73	175	finally
    //   76	102	175	finally
    //   189	199	175	finally
    //   202	210	175	finally
    //   213	223	175	finally
    //   229	241	175	finally
    //   244	249	175	finally
    //   47	64	180	android/database/sqlite/SQLiteException
    //   67	73	180	android/database/sqlite/SQLiteException
    //   76	102	180	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  private final List<zzbw> zzy(int paramInt)
  {
    // Byte code:
    //   0: new 252	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 253	java/util/ArrayList:<init>	()V
    //   7: astore 8
    //   9: aload_0
    //   10: ldc_w 298
    //   13: invokespecial 121	com/google/android/gms/tagmanager/zzeb:zzcy	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   16: astore 11
    //   18: aload 11
    //   20: ifnonnull +6 -> 26
    //   23: aload 8
    //   25: areturn
    //   26: aconst_null
    //   27: astore 6
    //   29: aconst_null
    //   30: astore 9
    //   32: iconst_0
    //   33: istore_2
    //   34: aload 9
    //   36: astore 7
    //   38: ldc_w 259
    //   41: iconst_1
    //   42: anewarray 4	java/lang/Object
    //   45: dup
    //   46: iconst_0
    //   47: ldc 32
    //   49: aastore
    //   50: invokestatic 44	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   53: astore 10
    //   55: aload 9
    //   57: astore 7
    //   59: bipush 40
    //   61: invokestatic 264	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   64: astore 12
    //   66: aload 9
    //   68: astore 7
    //   70: aload 11
    //   72: ldc 30
    //   74: iconst_3
    //   75: anewarray 40	java/lang/String
    //   78: dup
    //   79: iconst_0
    //   80: ldc 32
    //   82: aastore
    //   83: dup
    //   84: iconst_1
    //   85: ldc 34
    //   87: aastore
    //   88: dup
    //   89: iconst_2
    //   90: ldc 38
    //   92: aastore
    //   93: aconst_null
    //   94: aconst_null
    //   95: aconst_null
    //   96: aconst_null
    //   97: aload 10
    //   99: aload 12
    //   101: invokevirtual 267	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   104: astore 10
    //   106: aload 10
    //   108: astore 6
    //   110: new 252	java/util/ArrayList
    //   113: dup
    //   114: invokespecial 253	java/util/ArrayList:<init>	()V
    //   117: astore 9
    //   119: aload 6
    //   121: invokeinterface 226 1 0
    //   126: istore 5
    //   128: iload 5
    //   130: ifeq +85 -> 215
    //   133: aload 9
    //   135: new 300	com/google/android/gms/tagmanager/zzbw
    //   138: dup
    //   139: aload 6
    //   141: iconst_0
    //   142: invokeinterface 230 2 0
    //   147: aload 6
    //   149: iconst_1
    //   150: invokeinterface 230 2 0
    //   155: aload 6
    //   157: iconst_2
    //   158: invokeinterface 230 2 0
    //   163: invokespecial 303	com/google/android/gms/tagmanager/zzbw:<init>	(JJJ)V
    //   166: invokeinterface 273 2 0
    //   171: pop
    //   172: aload 6
    //   174: invokeinterface 276 1 0
    //   179: istore 5
    //   181: iload 5
    //   183: ifne -50 -> 133
    //   186: goto +29 -> 215
    //   189: astore 8
    //   191: aload 6
    //   193: astore 7
    //   195: aload 8
    //   197: astore 6
    //   199: goto +593 -> 792
    //   202: astore 7
    //   204: aload 9
    //   206: astore 8
    //   208: aload 7
    //   210: astore 9
    //   212: goto +497 -> 709
    //   215: aload 6
    //   217: ifnull +10 -> 227
    //   220: aload 6
    //   222: invokeinterface 233 1 0
    //   227: ldc_w 259
    //   230: iconst_1
    //   231: anewarray 4	java/lang/Object
    //   234: dup
    //   235: iconst_0
    //   236: ldc 32
    //   238: aastore
    //   239: invokestatic 44	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   242: astore 7
    //   244: bipush 40
    //   246: invokestatic 264	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   249: astore 8
    //   251: aload 11
    //   253: ldc 30
    //   255: iconst_2
    //   256: anewarray 40	java/lang/String
    //   259: dup
    //   260: iconst_0
    //   261: ldc 32
    //   263: aastore
    //   264: dup
    //   265: iconst_1
    //   266: ldc 36
    //   268: aastore
    //   269: aconst_null
    //   270: aconst_null
    //   271: aconst_null
    //   272: aconst_null
    //   273: aload 7
    //   275: aload 8
    //   277: invokevirtual 267	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   280: astore 10
    //   282: aload 10
    //   284: astore 7
    //   286: aload 10
    //   288: invokeinterface 226 1 0
    //   293: ifeq +111 -> 404
    //   296: iconst_0
    //   297: istore_1
    //   298: aload 10
    //   300: astore 7
    //   302: aload 10
    //   304: checkcast 305	android/database/sqlite/SQLiteCursor
    //   307: invokevirtual 309	android/database/sqlite/SQLiteCursor:getWindow	()Landroid/database/CursorWindow;
    //   310: invokevirtual 314	android/database/CursorWindow:getNumRows	()I
    //   313: ifle +32 -> 345
    //   316: aload 10
    //   318: astore 7
    //   320: aload 9
    //   322: iload_1
    //   323: invokeinterface 318 2 0
    //   328: checkcast 300	com/google/android/gms/tagmanager/zzbw
    //   331: aload 10
    //   333: iconst_1
    //   334: invokeinterface 321 2 0
    //   339: invokevirtual 324	com/google/android/gms/tagmanager/zzbw:zzdf	(Ljava/lang/String;)V
    //   342: goto +40 -> 382
    //   345: aload 10
    //   347: astore 7
    //   349: ldc_w 326
    //   352: iconst_1
    //   353: anewarray 4	java/lang/Object
    //   356: dup
    //   357: iconst_0
    //   358: aload 9
    //   360: iload_1
    //   361: invokeinterface 318 2 0
    //   366: checkcast 300	com/google/android/gms/tagmanager/zzbw
    //   369: invokevirtual 330	com/google/android/gms/tagmanager/zzbw:zznu	()J
    //   372: invokestatic 177	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   375: aastore
    //   376: invokestatic 44	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   379: invokestatic 163	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   382: iload_1
    //   383: iconst_1
    //   384: iadd
    //   385: istore_1
    //   386: aload 10
    //   388: astore 7
    //   390: aload 10
    //   392: invokeinterface 276 1 0
    //   397: istore 5
    //   399: iload 5
    //   401: ifne -103 -> 298
    //   404: aload 10
    //   406: ifnull +10 -> 416
    //   409: aload 10
    //   411: invokeinterface 233 1 0
    //   416: aload 9
    //   418: areturn
    //   419: astore 8
    //   421: aload 10
    //   423: astore 6
    //   425: goto +20 -> 445
    //   428: astore 7
    //   430: goto +222 -> 652
    //   433: astore 8
    //   435: goto +10 -> 445
    //   438: astore 7
    //   440: goto +212 -> 652
    //   443: astore 8
    //   445: aload 6
    //   447: astore 7
    //   449: aload 8
    //   451: invokevirtual 279	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   454: invokestatic 282	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   457: astore 8
    //   459: aload 6
    //   461: astore 7
    //   463: aload 8
    //   465: invokevirtual 285	java/lang/String:length	()I
    //   468: ifeq +20 -> 488
    //   471: aload 6
    //   473: astore 7
    //   475: ldc_w 332
    //   478: aload 8
    //   480: invokevirtual 291	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   483: astore 8
    //   485: goto +19 -> 504
    //   488: aload 6
    //   490: astore 7
    //   492: new 40	java/lang/String
    //   495: dup
    //   496: ldc_w 332
    //   499: invokespecial 293	java/lang/String:<init>	(Ljava/lang/String;)V
    //   502: astore 8
    //   504: aload 6
    //   506: astore 7
    //   508: aload 8
    //   510: invokestatic 163	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   513: aload 6
    //   515: astore 7
    //   517: new 252	java/util/ArrayList
    //   520: dup
    //   521: invokespecial 253	java/util/ArrayList:<init>	()V
    //   524: astore 8
    //   526: aload 6
    //   528: astore 7
    //   530: aload 9
    //   532: checkcast 252	java/util/ArrayList
    //   535: astore 9
    //   537: aload 6
    //   539: astore 7
    //   541: aload 9
    //   543: invokevirtual 335	java/util/ArrayList:size	()I
    //   546: istore 4
    //   548: iconst_0
    //   549: istore_1
    //   550: iload_2
    //   551: iload 4
    //   553: if_icmpge +74 -> 627
    //   556: aload 6
    //   558: astore 7
    //   560: aload 9
    //   562: iload_2
    //   563: invokevirtual 336	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   566: astore 10
    //   568: iload_2
    //   569: iconst_1
    //   570: iadd
    //   571: istore_3
    //   572: aload 6
    //   574: astore 7
    //   576: aload 10
    //   578: checkcast 300	com/google/android/gms/tagmanager/zzbw
    //   581: astore 10
    //   583: iload_1
    //   584: istore_2
    //   585: aload 6
    //   587: astore 7
    //   589: aload 10
    //   591: invokevirtual 339	com/google/android/gms/tagmanager/zzbw:zznw	()Ljava/lang/String;
    //   594: invokestatic 343	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   597: ifeq +9 -> 606
    //   600: iload_1
    //   601: ifne +26 -> 627
    //   604: iconst_1
    //   605: istore_2
    //   606: aload 6
    //   608: astore 7
    //   610: aload 8
    //   612: aload 10
    //   614: invokeinterface 273 2 0
    //   619: pop
    //   620: iload_2
    //   621: istore_1
    //   622: iload_3
    //   623: istore_2
    //   624: goto -74 -> 550
    //   627: aload 6
    //   629: ifnull +10 -> 639
    //   632: aload 6
    //   634: invokeinterface 233 1 0
    //   639: aload 8
    //   641: areturn
    //   642: astore 8
    //   644: aload 7
    //   646: astore 6
    //   648: aload 8
    //   650: astore 7
    //   652: aload 6
    //   654: ifnull +10 -> 664
    //   657: aload 6
    //   659: invokeinterface 233 1 0
    //   664: aload 7
    //   666: athrow
    //   667: astore 6
    //   669: aload 9
    //   671: astore 8
    //   673: aload 6
    //   675: astore 9
    //   677: goto +18 -> 695
    //   680: astore 8
    //   682: aload 6
    //   684: astore 7
    //   686: aload 8
    //   688: astore 6
    //   690: goto +102 -> 792
    //   693: astore 9
    //   695: aload 10
    //   697: astore 6
    //   699: goto +10 -> 709
    //   702: astore 6
    //   704: goto +88 -> 792
    //   707: astore 9
    //   709: aload 6
    //   711: astore 7
    //   713: aload 9
    //   715: invokevirtual 279	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   718: invokestatic 282	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   721: astore 9
    //   723: aload 6
    //   725: astore 7
    //   727: aload 9
    //   729: invokevirtual 285	java/lang/String:length	()I
    //   732: ifeq +20 -> 752
    //   735: aload 6
    //   737: astore 7
    //   739: ldc_w 287
    //   742: aload 9
    //   744: invokevirtual 291	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   747: astore 9
    //   749: goto +19 -> 768
    //   752: aload 6
    //   754: astore 7
    //   756: new 40	java/lang/String
    //   759: dup
    //   760: ldc_w 287
    //   763: invokespecial 293	java/lang/String:<init>	(Ljava/lang/String;)V
    //   766: astore 9
    //   768: aload 6
    //   770: astore 7
    //   772: aload 9
    //   774: invokestatic 163	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   777: aload 6
    //   779: ifnull +10 -> 789
    //   782: aload 6
    //   784: invokeinterface 233 1 0
    //   789: aload 8
    //   791: areturn
    //   792: aload 7
    //   794: ifnull +10 -> 804
    //   797: aload 7
    //   799: invokeinterface 233 1 0
    //   804: aload 6
    //   806: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	807	0	this	zzeb
    //   0	807	1	paramInt	int
    //   33	591	2	i	int
    //   571	52	3	j	int
    //   546	8	4	k	int
    //   126	274	5	bool	boolean
    //   27	631	6	localObject1	Object
    //   667	16	6	localSQLiteException1	SQLiteException
    //   688	10	6	localObject2	Object
    //   702	103	6	localObject3	Object
    //   36	158	7	localObject4	Object
    //   202	7	7	localSQLiteException2	SQLiteException
    //   242	147	7	localObject5	Object
    //   428	1	7	localObject6	Object
    //   438	1	7	localObject7	Object
    //   447	351	7	localObject8	Object
    //   7	17	8	localArrayList	java.util.ArrayList
    //   189	7	8	localObject9	Object
    //   206	70	8	localObject10	Object
    //   419	1	8	localSQLiteException3	SQLiteException
    //   433	1	8	localSQLiteException4	SQLiteException
    //   443	7	8	localSQLiteException5	SQLiteException
    //   457	183	8	localObject11	Object
    //   642	7	8	localObject12	Object
    //   671	1	8	localObject13	Object
    //   680	110	8	localList	List<zzbw>
    //   30	646	9	localObject14	Object
    //   693	1	9	localSQLiteException6	SQLiteException
    //   707	7	9	localSQLiteException7	SQLiteException
    //   721	52	9	str1	String
    //   53	643	10	localObject15	Object
    //   16	236	11	localSQLiteDatabase	SQLiteDatabase
    //   64	36	12	str2	String
    // Exception table:
    //   from	to	target	type
    //   133	181	189	finally
    //   133	181	202	android/database/sqlite/SQLiteException
    //   286	296	419	android/database/sqlite/SQLiteException
    //   302	316	419	android/database/sqlite/SQLiteException
    //   320	342	419	android/database/sqlite/SQLiteException
    //   349	382	419	android/database/sqlite/SQLiteException
    //   390	399	419	android/database/sqlite/SQLiteException
    //   251	282	428	finally
    //   251	282	433	android/database/sqlite/SQLiteException
    //   227	251	438	finally
    //   227	251	443	android/database/sqlite/SQLiteException
    //   286	296	642	finally
    //   302	316	642	finally
    //   320	342	642	finally
    //   349	382	642	finally
    //   390	399	642	finally
    //   449	459	642	finally
    //   463	471	642	finally
    //   475	485	642	finally
    //   492	504	642	finally
    //   508	513	642	finally
    //   517	526	642	finally
    //   530	537	642	finally
    //   541	548	642	finally
    //   560	568	642	finally
    //   576	583	642	finally
    //   589	600	642	finally
    //   610	620	642	finally
    //   119	128	667	android/database/sqlite/SQLiteException
    //   110	119	680	finally
    //   119	128	680	finally
    //   110	119	693	android/database/sqlite/SQLiteException
    //   38	55	702	finally
    //   59	66	702	finally
    //   70	106	702	finally
    //   713	723	702	finally
    //   727	735	702	finally
    //   739	749	702	finally
    //   756	768	702	finally
    //   772	777	702	finally
    //   38	55	707	android/database/sqlite/SQLiteException
    //   59	66	707	android/database/sqlite/SQLiteException
    //   70	106	707	android/database/sqlite/SQLiteException
  }
  
  public final void dispatch()
  {
    zzdi.v("GTM Dispatch running...");
    if (!this.zzbbn.zznl()) {
      return;
    }
    List localList = zzy(40);
    if (localList.isEmpty())
    {
      zzdi.v("...nothing to dispatch");
      this.zzbbo.zzo(true);
      return;
    }
    this.zzbbn.zze(localList);
    if (zzoi() > 0) {
      zzfn.zzpc().dispatch();
    }
  }
  
  public final void zzb(long paramLong, String paramString)
  {
    long l = this.clock.currentTimeMillis();
    if (l > this.zzbbq + 86400000L)
    {
      this.zzbbq = l;
      localObject1 = zzcy("Error opening database for deleteStaleHits.");
      if (localObject1 != null)
      {
        ((SQLiteDatabase)localObject1).delete("gtm_hits", "HIT_TIME < ?", new String[] { Long.toString(this.clock.currentTimeMillis() - 2592000000L) });
        localObject1 = this.zzbbo;
        boolean bool;
        if (zzoh() == 0) {
          bool = true;
        } else {
          bool = false;
        }
        ((zzcc)localObject1).zzo(bool);
      }
    }
    int i = zzoh() - this.zzbbr + 1;
    Object localObject2;
    if (i > 0)
    {
      localObject1 = zzx(i);
      i = ((List)localObject1).size();
      localObject2 = new StringBuilder(51);
      ((StringBuilder)localObject2).append("Store full, deleting ");
      ((StringBuilder)localObject2).append(i);
      ((StringBuilder)localObject2).append(" hits to make room.");
      zzdi.v(((StringBuilder)localObject2).toString());
      zza((String[])((List)localObject1).toArray(new String[0]));
    }
    Object localObject1 = zzcy("Error opening database for putHit");
    if (localObject1 != null)
    {
      localObject2 = new ContentValues();
      ((ContentValues)localObject2).put("hit_time", Long.valueOf(paramLong));
      ((ContentValues)localObject2).put("hit_url", paramString);
      ((ContentValues)localObject2).put("hit_first_send_time", Integer.valueOf(0));
    }
    try
    {
      ((SQLiteDatabase)localObject1).insert("gtm_hits", null, (ContentValues)localObject2);
      this.zzbbo.zzo(false);
      return;
    }
    catch (SQLiteException paramString)
    {
      for (;;) {}
    }
    zzdi.zzab("Error storing hit");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzeb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */