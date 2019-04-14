package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

final class zzat
  implements DataLayer.zzc
{
  private static final String zzazg = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[] { "datalayer", "ID", "key", "value", "expires" });
  private Clock clock;
  private final Executor zzazh;
  private zzax zzazi;
  private int zzazj;
  private final Context zzqx;
  
  public zzat(Context paramContext)
  {
    this(paramContext, DefaultClock.getInstance(), "google_tagmanager.db", 2000, Executors.newSingleThreadExecutor());
  }
  
  @VisibleForTesting
  private zzat(Context paramContext, Clock paramClock, String paramString, int paramInt, Executor paramExecutor)
  {
    this.zzqx = paramContext;
    this.clock = paramClock;
    this.zzazj = 2000;
    this.zzazh = paramExecutor;
    this.zzazi = new zzax(this, this.zzqx, paramString);
  }
  
  private final void zzan(long paramLong)
  {
    Object localObject = zzcy("Error opening database for deleteOlderThan.");
    if (localObject == null) {
      return;
    }
    try
    {
      int i = ((SQLiteDatabase)localObject).delete("datalayer", "expires <= ?", new String[] { Long.toString(paramLong) });
      localObject = new StringBuilder(33);
      ((StringBuilder)localObject).append("Deleted ");
      ((StringBuilder)localObject).append(i);
      ((StringBuilder)localObject).append(" expired items");
      zzdi.v(((StringBuilder)localObject).toString());
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;) {}
    }
    zzdi.zzab("Error deleting old entries.");
  }
  
  private final void zzb(List<zzay> paramList, long paramLong)
  {
    for (;;)
    {
      try
      {
        l = this.clock.currentTimeMillis();
        zzan(l);
        int i = paramList.size();
        i = zzni() - this.zzazj + i;
        if (i > 0)
        {
          localObject1 = zzs(i);
          i = ((List)localObject1).size();
          localObject2 = new StringBuilder(64);
          ((StringBuilder)localObject2).append("DataLayer store full, deleting ");
          ((StringBuilder)localObject2).append(i);
          ((StringBuilder)localObject2).append(" entries to make room.");
          zzdi.zzcz(((StringBuilder)localObject2).toString());
          localObject1 = (String[])((List)localObject1).toArray(new String[0]);
          if ((localObject1 != null) && (localObject1.length != 0))
          {
            localObject2 = zzcy("Error opening database for deleteEntries.");
            if (localObject2 != null) {
              localObject3 = String.format("%s in (%s)", new Object[] { "ID", TextUtils.join(",", Collections.nCopies(localObject1.length, "?")) });
            }
          }
        }
      }
      finally
      {
        try
        {
          long l;
          Object localObject1;
          Object localObject2;
          Object localObject3;
          zznj();
          return;
        }
        finally {}
        paramList = finally;
        zznj();
      }
      try
      {
        ((SQLiteDatabase)localObject2).delete("datalayer", (String)localObject3, (String[])localObject1);
      }
      catch (SQLiteException localSQLiteException) {}
    }
    localObject1 = String.valueOf(Arrays.toString((Object[])localObject1));
    if (((String)localObject1).length() != 0) {
      localObject1 = "Error deleting entries ".concat((String)localObject1);
    } else {
      localObject1 = new String("Error deleting entries ");
    }
    zzdi.zzab((String)localObject1);
    localObject1 = zzcy("Error opening database for writeEntryToDatabase.");
    if (localObject1 != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localObject2 = (zzay)paramList.next();
        localObject3 = new ContentValues();
        ((ContentValues)localObject3).put("expires", Long.valueOf(l + paramLong));
        ((ContentValues)localObject3).put("key", ((zzay)localObject2).zzny);
        ((ContentValues)localObject3).put("value", ((zzay)localObject2).zzazp);
        ((SQLiteDatabase)localObject1).insert("datalayer", null, (ContentValues)localObject3);
      }
    }
  }
  
  /* Error */
  private final void zzcx(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 275
    //   4: invokespecial 105	com/google/android/gms/tagmanager/zzat:zzcy	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   7: astore_3
    //   8: aload_3
    //   9: ifnonnull +4 -> 13
    //   12: return
    //   13: aload_3
    //   14: ldc 24
    //   16: ldc_w 277
    //   19: iconst_2
    //   20: anewarray 34	java/lang/String
    //   23: dup
    //   24: iconst_0
    //   25: aload_1
    //   26: aastore
    //   27: dup
    //   28: iconst_1
    //   29: aload_1
    //   30: invokestatic 212	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   33: ldc_w 279
    //   36: invokevirtual 221	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   39: aastore
    //   40: invokevirtual 119	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   43: istore_2
    //   44: new 121	java/lang/StringBuilder
    //   47: dup
    //   48: bipush 25
    //   50: invokespecial 124	java/lang/StringBuilder:<init>	(I)V
    //   53: astore_3
    //   54: aload_3
    //   55: ldc_w 281
    //   58: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload_3
    //   63: iload_2
    //   64: invokevirtual 133	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aload_3
    //   69: ldc_w 283
    //   72: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload_3
    //   77: invokevirtual 138	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: invokestatic 143	com/google/android/gms/tagmanager/zzdi:v	(Ljava/lang/String;)V
    //   83: aload_0
    //   84: invokespecial 271	com/google/android/gms/tagmanager/zzat:zznj	()V
    //   87: return
    //   88: astore_1
    //   89: goto +90 -> 179
    //   92: astore_3
    //   93: aload_3
    //   94: invokestatic 212	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   97: astore_3
    //   98: new 121	java/lang/StringBuilder
    //   101: dup
    //   102: aload_1
    //   103: invokestatic 212	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   106: invokevirtual 215	java/lang/String:length	()I
    //   109: bipush 44
    //   111: iadd
    //   112: aload_3
    //   113: invokestatic 212	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   116: invokevirtual 215	java/lang/String:length	()I
    //   119: iadd
    //   120: invokespecial 124	java/lang/StringBuilder:<init>	(I)V
    //   123: astore 4
    //   125: aload 4
    //   127: ldc_w 285
    //   130: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: pop
    //   134: aload 4
    //   136: aload_1
    //   137: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload 4
    //   143: ldc_w 287
    //   146: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: pop
    //   150: aload 4
    //   152: aload_3
    //   153: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: aload 4
    //   159: ldc_w 289
    //   162: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: aload 4
    //   168: invokevirtual 138	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokestatic 148	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   174: aload_0
    //   175: invokespecial 271	com/google/android/gms/tagmanager/zzat:zznj	()V
    //   178: return
    //   179: aload_0
    //   180: invokespecial 271	com/google/android/gms/tagmanager/zzat:zznj	()V
    //   183: aload_1
    //   184: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	185	0	this	zzat
    //   0	185	1	paramString	String
    //   43	21	2	i	int
    //   7	70	3	localObject	Object
    //   92	2	3	localSQLiteException	SQLiteException
    //   97	56	3	str	String
    //   123	44	4	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   13	83	88	finally
    //   93	174	88	finally
    //   13	83	92	android/database/sqlite/SQLiteException
  }
  
  private final SQLiteDatabase zzcy(String paramString)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.zzazi.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;) {}
    }
    zzdi.zzab(paramString);
    return null;
  }
  
  /* Error */
  private static Object zzd(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 301	java/io/ByteArrayInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 304	java/io/ByteArrayInputStream:<init>	([B)V
    //   8: astore_3
    //   9: aconst_null
    //   10: astore_2
    //   11: new 306	java/io/ObjectInputStream
    //   14: dup
    //   15: aload_3
    //   16: invokespecial 309	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   19: astore_0
    //   20: aload_0
    //   21: invokevirtual 312	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   24: astore_1
    //   25: aload_0
    //   26: invokevirtual 315	java/io/ObjectInputStream:close	()V
    //   29: aload_3
    //   30: invokevirtual 316	java/io/ByteArrayInputStream:close	()V
    //   33: aload_1
    //   34: areturn
    //   35: astore_1
    //   36: aload_0
    //   37: astore_2
    //   38: aload_1
    //   39: astore_0
    //   40: goto +4 -> 44
    //   43: astore_0
    //   44: aload_2
    //   45: ifnull +7 -> 52
    //   48: aload_2
    //   49: invokevirtual 315	java/io/ObjectInputStream:close	()V
    //   52: aload_3
    //   53: invokevirtual 316	java/io/ByteArrayInputStream:close	()V
    //   56: aload_0
    //   57: athrow
    //   58: aconst_null
    //   59: astore_0
    //   60: aload_0
    //   61: ifnull +7 -> 68
    //   64: aload_0
    //   65: invokevirtual 315	java/io/ObjectInputStream:close	()V
    //   68: aload_3
    //   69: invokevirtual 316	java/io/ByteArrayInputStream:close	()V
    //   72: aconst_null
    //   73: areturn
    //   74: aconst_null
    //   75: astore_0
    //   76: aload_0
    //   77: ifnull +7 -> 84
    //   80: aload_0
    //   81: invokevirtual 315	java/io/ObjectInputStream:close	()V
    //   84: aload_3
    //   85: invokevirtual 316	java/io/ByteArrayInputStream:close	()V
    //   88: aconst_null
    //   89: areturn
    //   90: astore_0
    //   91: goto -17 -> 74
    //   94: astore_0
    //   95: goto -37 -> 58
    //   98: astore_1
    //   99: goto -23 -> 76
    //   102: astore_1
    //   103: goto -43 -> 60
    //   106: astore_0
    //   107: aload_1
    //   108: areturn
    //   109: astore_1
    //   110: goto -54 -> 56
    //   113: astore_0
    //   114: aconst_null
    //   115: areturn
    //   116: astore_0
    //   117: aconst_null
    //   118: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	paramArrayOfByte	byte[]
    //   24	10	1	localObject1	Object
    //   35	4	1	localObject2	Object
    //   98	1	1	localIOException1	java.io.IOException
    //   102	6	1	localClassNotFoundException	ClassNotFoundException
    //   109	1	1	localIOException2	java.io.IOException
    //   10	39	2	arrayOfByte	byte[]
    //   8	77	3	localByteArrayInputStream	java.io.ByteArrayInputStream
    // Exception table:
    //   from	to	target	type
    //   20	25	35	finally
    //   11	20	43	finally
    //   11	20	90	java/io/IOException
    //   11	20	94	java/lang/ClassNotFoundException
    //   20	25	98	java/io/IOException
    //   20	25	102	java/lang/ClassNotFoundException
    //   25	33	106	java/io/IOException
    //   48	52	109	java/io/IOException
    //   52	56	109	java/io/IOException
    //   64	68	113	java/io/IOException
    //   68	72	113	java/io/IOException
    //   80	84	116	java/io/IOException
    //   84	88	116	java/io/IOException
  }
  
  /* Error */
  private static byte[] zzg(Object paramObject)
  {
    // Byte code:
    //   0: new 320	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 321	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_3
    //   8: aconst_null
    //   9: astore_2
    //   10: new 323	java/io/ObjectOutputStream
    //   13: dup
    //   14: aload_3
    //   15: invokespecial 326	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   18: astore_1
    //   19: aload_1
    //   20: aload_0
    //   21: invokevirtual 330	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   24: aload_3
    //   25: invokevirtual 334	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   28: astore_0
    //   29: aload_1
    //   30: invokevirtual 335	java/io/ObjectOutputStream:close	()V
    //   33: aload_3
    //   34: invokevirtual 336	java/io/ByteArrayOutputStream:close	()V
    //   37: aload_0
    //   38: areturn
    //   39: astore_0
    //   40: goto +6 -> 46
    //   43: astore_0
    //   44: aload_2
    //   45: astore_1
    //   46: aload_1
    //   47: ifnull +7 -> 54
    //   50: aload_1
    //   51: invokevirtual 335	java/io/ObjectOutputStream:close	()V
    //   54: aload_3
    //   55: invokevirtual 336	java/io/ByteArrayOutputStream:close	()V
    //   58: aload_0
    //   59: athrow
    //   60: aconst_null
    //   61: astore_1
    //   62: aload_1
    //   63: ifnull +7 -> 70
    //   66: aload_1
    //   67: invokevirtual 335	java/io/ObjectOutputStream:close	()V
    //   70: aload_3
    //   71: invokevirtual 336	java/io/ByteArrayOutputStream:close	()V
    //   74: aconst_null
    //   75: areturn
    //   76: astore_0
    //   77: goto -17 -> 60
    //   80: astore_0
    //   81: goto -19 -> 62
    //   84: astore_1
    //   85: aload_0
    //   86: areturn
    //   87: astore_1
    //   88: goto -30 -> 58
    //   91: astore_0
    //   92: aconst_null
    //   93: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	paramObject	Object
    //   18	49	1	localObject1	Object
    //   84	1	1	localIOException1	java.io.IOException
    //   87	1	1	localIOException2	java.io.IOException
    //   9	36	2	localObject2	Object
    //   7	64	3	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   19	29	39	finally
    //   10	19	43	finally
    //   10	19	76	java/io/IOException
    //   19	29	80	java/io/IOException
    //   29	37	84	java/io/IOException
    //   50	54	87	java/io/IOException
    //   54	58	87	java/io/IOException
    //   66	70	91	java/io/IOException
    //   70	74	91	java/io/IOException
  }
  
  private final List<DataLayer.zza> zzng()
  {
    try
    {
      zzan(this.clock.currentTimeMillis());
      Object localObject2 = zznh();
      ArrayList localArrayList = new ArrayList();
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        zzay localzzay = (zzay)((Iterator)localObject2).next();
        localArrayList.add(new DataLayer.zza(localzzay.zzny, zzd(localzzay.zzazp)));
      }
      return localArrayList;
    }
    finally
    {
      zznj();
    }
  }
  
  private final List<zzay> zznh()
  {
    Object localObject2 = zzcy("Error opening database for loadSerialized.");
    ArrayList localArrayList = new ArrayList();
    if (localObject2 == null) {
      return localArrayList;
    }
    localObject2 = ((SQLiteDatabase)localObject2).query("datalayer", new String[] { "key", "value" }, null, null, null, null, "ID", null);
    try
    {
      while (((Cursor)localObject2).moveToNext()) {
        localArrayList.add(new zzay(((Cursor)localObject2).getString(0), ((Cursor)localObject2).getBlob(1)));
      }
      return localArrayList;
    }
    finally
    {
      ((Cursor)localObject2).close();
    }
  }
  
  /* Error */
  private final int zzni()
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 379
    //   4: invokespecial 105	com/google/android/gms/tagmanager/zzat:zzcy	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   7: astore 7
    //   9: iconst_0
    //   10: istore_3
    //   11: iconst_0
    //   12: istore_1
    //   13: aload 7
    //   15: ifnonnull +5 -> 20
    //   18: iconst_0
    //   19: ireturn
    //   20: aconst_null
    //   21: astore 8
    //   23: aconst_null
    //   24: astore 6
    //   26: aload 7
    //   28: ldc_w 381
    //   31: aconst_null
    //   32: invokevirtual 385	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   35: astore 7
    //   37: aload 7
    //   39: invokeinterface 388 1 0
    //   44: ifeq +17 -> 61
    //   47: aload 7
    //   49: iconst_0
    //   50: invokeinterface 392 2 0
    //   55: lstore 4
    //   57: lload 4
    //   59: l2i
    //   60: istore_1
    //   61: iload_1
    //   62: istore_2
    //   63: aload 7
    //   65: ifnull +59 -> 124
    //   68: aload 7
    //   70: invokeinterface 376 1 0
    //   75: iload_1
    //   76: ireturn
    //   77: astore 8
    //   79: aload 7
    //   81: astore 6
    //   83: aload 8
    //   85: astore 7
    //   87: goto +39 -> 126
    //   90: goto +8 -> 98
    //   93: astore 7
    //   95: goto +31 -> 126
    //   98: aload 7
    //   100: astore 6
    //   102: ldc_w 394
    //   105: invokestatic 148	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   108: iload_3
    //   109: istore_2
    //   110: aload 7
    //   112: ifnull +12 -> 124
    //   115: aload 7
    //   117: invokeinterface 376 1 0
    //   122: iload_3
    //   123: istore_2
    //   124: iload_2
    //   125: ireturn
    //   126: aload 6
    //   128: ifnull +10 -> 138
    //   131: aload 6
    //   133: invokeinterface 376 1 0
    //   138: aload 7
    //   140: athrow
    //   141: astore 6
    //   143: aload 8
    //   145: astore 7
    //   147: goto -49 -> 98
    //   150: astore 6
    //   152: goto -62 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	155	0	this	zzat
    //   12	64	1	i	int
    //   62	63	2	j	int
    //   10	113	3	k	int
    //   55	3	4	l	long
    //   24	108	6	localObject1	Object
    //   141	1	6	localSQLiteException1	SQLiteException
    //   150	1	6	localSQLiteException2	SQLiteException
    //   7	79	7	localObject2	Object
    //   93	46	7	localObject3	Object
    //   145	1	7	localObject4	Object
    //   21	1	8	localObject5	Object
    //   77	67	8	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   37	57	77	finally
    //   26	37	93	finally
    //   102	108	93	finally
    //   26	37	141	android/database/sqlite/SQLiteException
    //   37	57	150	android/database/sqlite/SQLiteException
  }
  
  private final void zznj()
  {
    try
    {
      this.zzazi.close();
      return;
    }
    catch (SQLiteException localSQLiteException) {}
  }
  
  /* Error */
  private final List<String> zzs(int paramInt)
  {
    // Byte code:
    //   0: new 341	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 342	java/util/ArrayList:<init>	()V
    //   7: astore 7
    //   9: iload_1
    //   10: ifgt +12 -> 22
    //   13: ldc_w 398
    //   16: invokestatic 148	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   19: aload 7
    //   21: areturn
    //   22: aload_0
    //   23: ldc_w 400
    //   26: invokespecial 105	com/google/android/gms/tagmanager/zzat:zzcy	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   29: astore 5
    //   31: aload 5
    //   33: ifnonnull +6 -> 39
    //   36: aload 7
    //   38: areturn
    //   39: aconst_null
    //   40: astore 6
    //   42: aconst_null
    //   43: astore 4
    //   45: aload 4
    //   47: astore_3
    //   48: ldc_w 402
    //   51: iconst_1
    //   52: anewarray 4	java/lang/Object
    //   55: dup
    //   56: iconst_0
    //   57: ldc 26
    //   59: aastore
    //   60: invokestatic 38	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   63: astore 8
    //   65: aload 4
    //   67: astore_3
    //   68: iload_1
    //   69: invokestatic 406	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   72: astore 9
    //   74: aload 4
    //   76: astore_3
    //   77: aload 5
    //   79: ldc 24
    //   81: iconst_1
    //   82: anewarray 34	java/lang/String
    //   85: dup
    //   86: iconst_0
    //   87: ldc 26
    //   89: aastore
    //   90: aconst_null
    //   91: aconst_null
    //   92: aconst_null
    //   93: aconst_null
    //   94: aload 8
    //   96: aload 9
    //   98: invokevirtual 360	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   101: astore 4
    //   103: aload 4
    //   105: invokeinterface 388 1 0
    //   110: ifeq +34 -> 144
    //   113: aload 7
    //   115: aload 4
    //   117: iconst_0
    //   118: invokeinterface 392 2 0
    //   123: invokestatic 408	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   126: invokeinterface 353 2 0
    //   131: pop
    //   132: aload 4
    //   134: invokeinterface 365 1 0
    //   139: istore_2
    //   140: iload_2
    //   141: ifne -28 -> 113
    //   144: aload 4
    //   146: ifnull +116 -> 262
    //   149: aload 4
    //   151: invokeinterface 376 1 0
    //   156: aload 7
    //   158: areturn
    //   159: astore 5
    //   161: aload 4
    //   163: astore_3
    //   164: aload 5
    //   166: astore 4
    //   168: goto +97 -> 265
    //   171: astore 5
    //   173: goto +14 -> 187
    //   176: astore 4
    //   178: goto +87 -> 265
    //   181: astore 5
    //   183: aload 6
    //   185: astore 4
    //   187: aload 4
    //   189: astore_3
    //   190: aload 5
    //   192: invokevirtual 411	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   195: invokestatic 212	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   198: astore 5
    //   200: aload 4
    //   202: astore_3
    //   203: aload 5
    //   205: invokevirtual 215	java/lang/String:length	()I
    //   208: ifeq +19 -> 227
    //   211: aload 4
    //   213: astore_3
    //   214: ldc_w 413
    //   217: aload 5
    //   219: invokevirtual 221	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   222: astore 5
    //   224: goto +18 -> 242
    //   227: aload 4
    //   229: astore_3
    //   230: new 34	java/lang/String
    //   233: dup
    //   234: ldc_w 413
    //   237: invokespecial 223	java/lang/String:<init>	(Ljava/lang/String;)V
    //   240: astore 5
    //   242: aload 4
    //   244: astore_3
    //   245: aload 5
    //   247: invokestatic 148	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   250: aload 4
    //   252: ifnull +10 -> 262
    //   255: aload 4
    //   257: invokeinterface 376 1 0
    //   262: aload 7
    //   264: areturn
    //   265: aload_3
    //   266: ifnull +9 -> 275
    //   269: aload_3
    //   270: invokeinterface 376 1 0
    //   275: aload 4
    //   277: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	278	0	this	zzat
    //   0	278	1	paramInt	int
    //   139	2	2	bool	boolean
    //   47	223	3	localObject1	Object
    //   43	124	4	localObject2	Object
    //   176	1	4	localObject3	Object
    //   185	91	4	localObject4	Object
    //   29	49	5	localSQLiteDatabase	SQLiteDatabase
    //   159	6	5	localObject5	Object
    //   171	1	5	localSQLiteException1	SQLiteException
    //   181	10	5	localSQLiteException2	SQLiteException
    //   198	48	5	str1	String
    //   40	144	6	localObject6	Object
    //   7	256	7	localArrayList	ArrayList
    //   63	32	8	str2	String
    //   72	25	9	str3	String
    // Exception table:
    //   from	to	target	type
    //   103	113	159	finally
    //   113	140	159	finally
    //   103	113	171	android/database/sqlite/SQLiteException
    //   113	140	171	android/database/sqlite/SQLiteException
    //   48	65	176	finally
    //   68	74	176	finally
    //   77	103	176	finally
    //   190	200	176	finally
    //   203	211	176	finally
    //   214	224	176	finally
    //   230	242	176	finally
    //   245	250	176	finally
    //   48	65	181	android/database/sqlite/SQLiteException
    //   68	74	181	android/database/sqlite/SQLiteException
    //   77	103	181	android/database/sqlite/SQLiteException
  }
  
  public final void zza(zzaq paramzzaq)
  {
    this.zzazh.execute(new zzav(this, paramzzaq));
  }
  
  public final void zza(List<DataLayer.zza> paramList, long paramLong)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      DataLayer.zza localzza = (DataLayer.zza)paramList.next();
      localArrayList.add(new zzay(localzza.mKey, zzg(localzza.mValue)));
    }
    this.zzazh.execute(new zzau(this, localArrayList, paramLong));
  }
  
  public final void zzcw(String paramString)
  {
    this.zzazh.execute(new zzaw(this, paramString));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */