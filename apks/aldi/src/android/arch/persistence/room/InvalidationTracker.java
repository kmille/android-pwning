package android.arch.persistence.room;

import android.arch.core.executor.ArchTaskExecutor;
import android.arch.core.internal.SafeIterableMap;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.ArraySet;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

public class InvalidationTracker
{
  @VisibleForTesting
  static final String CLEANUP_SQL = "DELETE FROM room_table_modification_log WHERE version NOT IN( SELECT MAX(version) FROM room_table_modification_log GROUP BY table_id)";
  private static final String CREATE_VERSION_TABLE_SQL = "CREATE TEMP TABLE room_table_modification_log(version INTEGER PRIMARY KEY AUTOINCREMENT, table_id INTEGER)";
  @VisibleForTesting
  static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE version  > ? ORDER BY version ASC;";
  private static final String TABLE_ID_COLUMN_NAME = "table_id";
  private static final String[] TRIGGERS = { "UPDATE", "DELETE", "INSERT" };
  private static final String UPDATE_TABLE_NAME = "room_table_modification_log";
  private static final String VERSION_COLUMN_NAME = "version";
  private volatile SupportSQLiteStatement mCleanupStatement;
  private final RoomDatabase mDatabase;
  private volatile boolean mInitialized;
  private long mMaxVersion = 0L;
  private ObservedTableTracker mObservedTableTracker;
  @VisibleForTesting
  final SafeIterableMap<Observer, ObserverWrapper> mObserverMap;
  AtomicBoolean mPendingRefresh;
  private Object[] mQueryArgs = new Object[1];
  @VisibleForTesting
  Runnable mRefreshRunnable;
  @NonNull
  @VisibleForTesting
  ArrayMap<String, Integer> mTableIdLookup;
  private String[] mTableNames;
  @NonNull
  @VisibleForTesting
  long[] mTableVersions;
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public InvalidationTracker(RoomDatabase paramRoomDatabase, String... paramVarArgs)
  {
    int i = 0;
    this.mPendingRefresh = new AtomicBoolean(false);
    this.mInitialized = false;
    this.mObserverMap = new SafeIterableMap();
    this.mRefreshRunnable = new Runnable()
    {
      private boolean checkUpdatedTable()
      {
        Cursor localCursor = InvalidationTracker.this.mDatabase.query("SELECT * FROM room_table_modification_log WHERE version  > ? ORDER BY version ASC;", InvalidationTracker.this.mQueryArgs);
        boolean bool = false;
        try
        {
          while (localCursor.moveToNext())
          {
            long l = localCursor.getLong(0);
            int i = localCursor.getInt(1);
            InvalidationTracker.this.mTableVersions[i] = l;
            InvalidationTracker.access$402(InvalidationTracker.this, l);
            bool = true;
          }
          return bool;
        }
        finally
        {
          localCursor.close();
        }
      }
      
      /* Error */
      public void run()
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 14	android/arch/persistence/room/InvalidationTracker$1:this$0	Landroid/arch/persistence/room/InvalidationTracker;
        //   4: invokestatic 24	android/arch/persistence/room/InvalidationTracker:access$000	(Landroid/arch/persistence/room/InvalidationTracker;)Landroid/arch/persistence/room/RoomDatabase;
        //   7: invokevirtual 69	android/arch/persistence/room/RoomDatabase:getCloseLock	()Ljava/util/concurrent/locks/Lock;
        //   10: astore 4
        //   12: iconst_0
        //   13: istore_2
        //   14: aload 4
        //   16: invokeinterface 74 1 0
        //   21: aload_0
        //   22: getfield 14	android/arch/persistence/room/InvalidationTracker$1:this$0	Landroid/arch/persistence/room/InvalidationTracker;
        //   25: invokestatic 78	android/arch/persistence/room/InvalidationTracker:access$100	(Landroid/arch/persistence/room/InvalidationTracker;)Z
        //   28: istore_1
        //   29: iload_1
        //   30: ifne +11 -> 41
        //   33: aload 4
        //   35: invokeinterface 81 1 0
        //   40: return
        //   41: aload_0
        //   42: getfield 14	android/arch/persistence/room/InvalidationTracker$1:this$0	Landroid/arch/persistence/room/InvalidationTracker;
        //   45: getfield 85	android/arch/persistence/room/InvalidationTracker:mPendingRefresh	Ljava/util/concurrent/atomic/AtomicBoolean;
        //   48: iconst_1
        //   49: iconst_0
        //   50: invokevirtual 91	java/util/concurrent/atomic/AtomicBoolean:compareAndSet	(ZZ)Z
        //   53: istore_1
        //   54: iload_1
        //   55: ifne +11 -> 66
        //   58: aload 4
        //   60: invokeinterface 81 1 0
        //   65: return
        //   66: aload_0
        //   67: getfield 14	android/arch/persistence/room/InvalidationTracker$1:this$0	Landroid/arch/persistence/room/InvalidationTracker;
        //   70: invokestatic 24	android/arch/persistence/room/InvalidationTracker:access$000	(Landroid/arch/persistence/room/InvalidationTracker;)Landroid/arch/persistence/room/RoomDatabase;
        //   73: invokevirtual 94	android/arch/persistence/room/RoomDatabase:inTransaction	()Z
        //   76: istore_1
        //   77: iload_1
        //   78: ifeq +11 -> 89
        //   81: aload 4
        //   83: invokeinterface 81 1 0
        //   88: return
        //   89: aload_0
        //   90: getfield 14	android/arch/persistence/room/InvalidationTracker$1:this$0	Landroid/arch/persistence/room/InvalidationTracker;
        //   93: invokestatic 98	android/arch/persistence/room/InvalidationTracker:access$200	(Landroid/arch/persistence/room/InvalidationTracker;)Landroid/arch/persistence/db/SupportSQLiteStatement;
        //   96: invokeinterface 104 1 0
        //   101: pop
        //   102: aload_0
        //   103: getfield 14	android/arch/persistence/room/InvalidationTracker$1:this$0	Landroid/arch/persistence/room/InvalidationTracker;
        //   106: invokestatic 30	android/arch/persistence/room/InvalidationTracker:access$300	(Landroid/arch/persistence/room/InvalidationTracker;)[Ljava/lang/Object;
        //   109: iconst_0
        //   110: aload_0
        //   111: getfield 14	android/arch/persistence/room/InvalidationTracker$1:this$0	Landroid/arch/persistence/room/InvalidationTracker;
        //   114: invokestatic 108	android/arch/persistence/room/InvalidationTracker:access$400	(Landroid/arch/persistence/room/InvalidationTracker;)J
        //   117: invokestatic 114	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   120: aastore
        //   121: aload_0
        //   122: getfield 14	android/arch/persistence/room/InvalidationTracker$1:this$0	Landroid/arch/persistence/room/InvalidationTracker;
        //   125: invokestatic 24	android/arch/persistence/room/InvalidationTracker:access$000	(Landroid/arch/persistence/room/InvalidationTracker;)Landroid/arch/persistence/room/RoomDatabase;
        //   128: getfield 118	android/arch/persistence/room/RoomDatabase:mWriteAheadLoggingEnabled	Z
        //   131: ifeq +73 -> 204
        //   134: aload_0
        //   135: getfield 14	android/arch/persistence/room/InvalidationTracker$1:this$0	Landroid/arch/persistence/room/InvalidationTracker;
        //   138: invokestatic 24	android/arch/persistence/room/InvalidationTracker:access$000	(Landroid/arch/persistence/room/InvalidationTracker;)Landroid/arch/persistence/room/RoomDatabase;
        //   141: invokevirtual 122	android/arch/persistence/room/RoomDatabase:getOpenHelper	()Landroid/arch/persistence/db/SupportSQLiteOpenHelper;
        //   144: invokeinterface 128 1 0
        //   149: astore 5
        //   151: aload 5
        //   153: invokeinterface 133 1 0
        //   158: aload_0
        //   159: invokespecial 135	android/arch/persistence/room/InvalidationTracker$1:checkUpdatedTable	()Z
        //   162: istore_1
        //   163: aload 5
        //   165: invokeinterface 138 1 0
        //   170: aload 5
        //   172: invokeinterface 141 1 0
        //   177: goto +51 -> 228
        //   180: astore_3
        //   181: goto +38 -> 219
        //   184: astore_3
        //   185: goto +6 -> 191
        //   188: astore_3
        //   189: iload_2
        //   190: istore_1
        //   191: aload 5
        //   193: invokeinterface 141 1 0
        //   198: aload_3
        //   199: athrow
        //   200: astore_3
        //   201: goto +18 -> 219
        //   204: aload_0
        //   205: invokespecial 135	android/arch/persistence/room/InvalidationTracker$1:checkUpdatedTable	()Z
        //   208: istore_1
        //   209: goto +19 -> 228
        //   212: astore_3
        //   213: goto +100 -> 313
        //   216: astore_3
        //   217: iconst_0
        //   218: istore_1
        //   219: ldc -113
        //   221: ldc -111
        //   223: aload_3
        //   224: invokestatic 151	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   227: pop
        //   228: aload 4
        //   230: invokeinterface 81 1 0
        //   235: iload_1
        //   236: ifeq +76 -> 312
        //   239: aload_0
        //   240: getfield 14	android/arch/persistence/room/InvalidationTracker$1:this$0	Landroid/arch/persistence/room/InvalidationTracker;
        //   243: getfield 155	android/arch/persistence/room/InvalidationTracker:mObserverMap	Landroid/arch/core/internal/SafeIterableMap;
        //   246: astore_3
        //   247: aload_3
        //   248: monitorenter
        //   249: aload_0
        //   250: getfield 14	android/arch/persistence/room/InvalidationTracker$1:this$0	Landroid/arch/persistence/room/InvalidationTracker;
        //   253: getfield 155	android/arch/persistence/room/InvalidationTracker:mObserverMap	Landroid/arch/core/internal/SafeIterableMap;
        //   256: invokevirtual 161	android/arch/core/internal/SafeIterableMap:iterator	()Ljava/util/Iterator;
        //   259: astore 4
        //   261: aload 4
        //   263: invokeinterface 166 1 0
        //   268: ifeq +34 -> 302
        //   271: aload 4
        //   273: invokeinterface 170 1 0
        //   278: checkcast 172	java/util/Map$Entry
        //   281: invokeinterface 175 1 0
        //   286: checkcast 177	android/arch/persistence/room/InvalidationTracker$ObserverWrapper
        //   289: aload_0
        //   290: getfield 14	android/arch/persistence/room/InvalidationTracker$1:this$0	Landroid/arch/persistence/room/InvalidationTracker;
        //   293: getfield 53	android/arch/persistence/room/InvalidationTracker:mTableVersions	[J
        //   296: invokevirtual 181	android/arch/persistence/room/InvalidationTracker$ObserverWrapper:checkForInvalidation	([J)V
        //   299: goto -38 -> 261
        //   302: aload_3
        //   303: monitorexit
        //   304: return
        //   305: astore 4
        //   307: aload_3
        //   308: monitorexit
        //   309: aload 4
        //   311: athrow
        //   312: return
        //   313: aload 4
        //   315: invokeinterface 81 1 0
        //   320: aload_3
        //   321: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	322	0	this	1
        //   28	208	1	bool1	boolean
        //   13	177	2	bool2	boolean
        //   180	1	3	localIllegalStateException1	IllegalStateException
        //   184	1	3	localObject1	Object
        //   188	11	3	localObject2	Object
        //   200	1	3	localIllegalStateException2	IllegalStateException
        //   212	1	3	localObject3	Object
        //   216	8	3	localIllegalStateException3	IllegalStateException
        //   246	75	3	localSafeIterableMap	SafeIterableMap
        //   10	262	4	localObject4	Object
        //   305	9	4	localObject5	Object
        //   149	43	5	localSupportSQLiteDatabase	SupportSQLiteDatabase
        // Exception table:
        //   from	to	target	type
        //   170	177	180	java/lang/IllegalStateException
        //   170	177	180	android/database/sqlite/SQLiteException
        //   163	170	184	finally
        //   151	163	188	finally
        //   191	200	200	java/lang/IllegalStateException
        //   191	200	200	android/database/sqlite/SQLiteException
        //   14	29	212	finally
        //   41	54	212	finally
        //   66	77	212	finally
        //   89	151	212	finally
        //   170	177	212	finally
        //   191	200	212	finally
        //   204	209	212	finally
        //   219	228	212	finally
        //   14	29	216	java/lang/IllegalStateException
        //   14	29	216	android/database/sqlite/SQLiteException
        //   41	54	216	java/lang/IllegalStateException
        //   41	54	216	android/database/sqlite/SQLiteException
        //   66	77	216	java/lang/IllegalStateException
        //   66	77	216	android/database/sqlite/SQLiteException
        //   89	151	216	java/lang/IllegalStateException
        //   89	151	216	android/database/sqlite/SQLiteException
        //   204	209	216	java/lang/IllegalStateException
        //   204	209	216	android/database/sqlite/SQLiteException
        //   249	261	305	finally
        //   261	299	305	finally
        //   302	304	305	finally
        //   307	309	305	finally
      }
    };
    this.mDatabase = paramRoomDatabase;
    this.mObservedTableTracker = new ObservedTableTracker(paramVarArgs.length);
    this.mTableIdLookup = new ArrayMap();
    int j = paramVarArgs.length;
    this.mTableNames = new String[j];
    while (i < j)
    {
      paramRoomDatabase = paramVarArgs[i].toLowerCase(Locale.US);
      this.mTableIdLookup.put(paramRoomDatabase, Integer.valueOf(i));
      this.mTableNames[i] = paramRoomDatabase;
      i += 1;
    }
    this.mTableVersions = new long[paramVarArgs.length];
    Arrays.fill(this.mTableVersions, 0L);
  }
  
  private static void appendTriggerName(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    paramStringBuilder.append("`room_table_modification_trigger_");
    paramStringBuilder.append(paramString1);
    paramStringBuilder.append("_");
    paramStringBuilder.append(paramString2);
    paramStringBuilder.append("`");
  }
  
  private boolean ensureInitialization()
  {
    if (!this.mDatabase.isOpen()) {
      return false;
    }
    if (!this.mInitialized) {
      this.mDatabase.getOpenHelper().getWritableDatabase();
    }
    if (!this.mInitialized)
    {
      Log.e("ROOM", "database is not initialized even though it is open");
      return false;
    }
    return true;
  }
  
  private void startTrackingTable(SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt)
  {
    String str1 = this.mTableNames[paramInt];
    StringBuilder localStringBuilder = new StringBuilder();
    String[] arrayOfString = TRIGGERS;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str2 = arrayOfString[i];
      localStringBuilder.setLength(0);
      localStringBuilder.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
      appendTriggerName(localStringBuilder, str1, str2);
      localStringBuilder.append(" AFTER ");
      localStringBuilder.append(str2);
      localStringBuilder.append(" ON `");
      localStringBuilder.append(str1);
      localStringBuilder.append("` BEGIN INSERT OR REPLACE INTO room_table_modification_log VALUES(null, ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append("); END");
      paramSupportSQLiteDatabase.execSQL(localStringBuilder.toString());
      i += 1;
    }
  }
  
  private void stopTrackingTable(SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt)
  {
    String str1 = this.mTableNames[paramInt];
    StringBuilder localStringBuilder = new StringBuilder();
    String[] arrayOfString = TRIGGERS;
    int i = arrayOfString.length;
    paramInt = 0;
    while (paramInt < i)
    {
      String str2 = arrayOfString[paramInt];
      localStringBuilder.setLength(0);
      localStringBuilder.append("DROP TRIGGER IF EXISTS ");
      appendTriggerName(localStringBuilder, str1, str2);
      paramSupportSQLiteDatabase.execSQL(localStringBuilder.toString());
      paramInt += 1;
    }
  }
  
  @WorkerThread
  public void addObserver(@NonNull Observer paramObserver)
  {
    ??? = paramObserver.mTables;
    int[] arrayOfInt = new int[???.length];
    int j = ???.length;
    Object localObject2 = new long[???.length];
    int i = 0;
    while (i < j)
    {
      Integer localInteger = (Integer)this.mTableIdLookup.get(???[i].toLowerCase(Locale.US));
      if (localInteger != null)
      {
        arrayOfInt[i] = localInteger.intValue();
        localObject2[i] = this.mMaxVersion;
        i += 1;
      }
      else
      {
        paramObserver = new StringBuilder("There is no table with name ");
        paramObserver.append(???[i]);
        throw new IllegalArgumentException(paramObserver.toString());
      }
    }
    localObject2 = new ObserverWrapper(paramObserver, arrayOfInt, (String[])???, (long[])localObject2);
    synchronized (this.mObserverMap)
    {
      paramObserver = (ObserverWrapper)this.mObserverMap.putIfAbsent(paramObserver, localObject2);
      if ((paramObserver == null) && (this.mObservedTableTracker.onAdded(arrayOfInt))) {
        syncTriggers();
      }
      return;
    }
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void addWeakObserver(Observer paramObserver)
  {
    addObserver(new WeakObserver(this, paramObserver));
  }
  
  /* Error */
  void internalInit(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 100	android/arch/persistence/room/InvalidationTracker:mInitialized	Z
    //   6: ifeq +15 -> 21
    //   9: ldc -54
    //   11: ldc_w 289
    //   14: invokestatic 210	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   17: pop
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: aload_1
    //   22: invokeinterface 292 1 0
    //   27: aload_1
    //   28: ldc_w 294
    //   31: invokeinterface 241 2 0
    //   36: aload_1
    //   37: ldc_w 296
    //   40: invokeinterface 241 2 0
    //   45: aload_1
    //   46: ldc 26
    //   48: invokeinterface 241 2 0
    //   53: aload_1
    //   54: invokeinterface 299 1 0
    //   59: aload_1
    //   60: invokeinterface 302 1 0
    //   65: aload_0
    //   66: aload_1
    //   67: invokevirtual 304	android/arch/persistence/room/InvalidationTracker:syncTriggers	(Landroid/arch/persistence/db/SupportSQLiteDatabase;)V
    //   70: aload_0
    //   71: aload_1
    //   72: ldc 22
    //   74: invokeinterface 308 2 0
    //   79: putfield 165	android/arch/persistence/room/InvalidationTracker:mCleanupStatement	Landroid/arch/persistence/db/SupportSQLiteStatement;
    //   82: aload_0
    //   83: iconst_1
    //   84: putfield 100	android/arch/persistence/room/InvalidationTracker:mInitialized	Z
    //   87: aload_0
    //   88: monitorexit
    //   89: return
    //   90: astore_2
    //   91: aload_1
    //   92: invokeinterface 302 1 0
    //   97: aload_2
    //   98: athrow
    //   99: astore_1
    //   100: aload_0
    //   101: monitorexit
    //   102: aload_1
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	InvalidationTracker
    //   0	104	1	paramSupportSQLiteDatabase	SupportSQLiteDatabase
    //   90	8	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   27	59	90	finally
    //   2	20	99	finally
    //   21	27	99	finally
    //   59	89	99	finally
    //   91	99	99	finally
    //   100	102	99	finally
  }
  
  public void refreshVersionsAsync()
  {
    if (this.mPendingRefresh.compareAndSet(false, true)) {
      ArchTaskExecutor.getInstance().executeOnDiskIO(this.mRefreshRunnable);
    }
  }
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  @WorkerThread
  public void refreshVersionsSync()
  {
    syncTriggers();
    this.mRefreshRunnable.run();
  }
  
  @WorkerThread
  public void removeObserver(@NonNull Observer paramObserver)
  {
    synchronized (this.mObserverMap)
    {
      paramObserver = (ObserverWrapper)this.mObserverMap.remove(paramObserver);
      if ((paramObserver != null) && (this.mObservedTableTracker.onRemoved(paramObserver.mTableIds))) {
        syncTriggers();
      }
      return;
    }
  }
  
  void syncTriggers()
  {
    if (!this.mDatabase.isOpen()) {
      return;
    }
    syncTriggers(this.mDatabase.getOpenHelper().getWritableDatabase());
  }
  
  void syncTriggers(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    if (paramSupportSQLiteDatabase.inTransaction()) {
      return;
    }
    for (;;)
    {
      int j;
      int i;
      try
      {
        localLock = this.mDatabase.getCloseLock();
        localLock.lock();
        try
        {
          int[] arrayOfInt = this.mObservedTableTracker.getTablesToSync();
          if (arrayOfInt == null) {
            return;
          }
          j = arrayOfInt.length;
          try
          {
            paramSupportSQLiteDatabase.beginTransaction();
            i = 0;
          }
          finally {}
          stopTrackingTable(paramSupportSQLiteDatabase, i);
        }
        finally
        {
          localLock.unlock();
        }
        startTrackingTable(paramSupportSQLiteDatabase, i);
      }
      catch (IllegalStateException|SQLiteException paramSupportSQLiteDatabase)
      {
        Lock localLock;
        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", paramSupportSQLiteDatabase);
        return;
      }
      paramSupportSQLiteDatabase.setTransactionSuccessful();
      paramSupportSQLiteDatabase.endTransaction();
      this.mObservedTableTracker.onSyncCompleted();
      localLock.unlock();
      continue;
      while (i < j)
      {
        switch (localObject[i])
        {
        }
        i += 1;
      }
    }
  }
  
  static class ObservedTableTracker
  {
    static final int ADD = 1;
    static final int NO_OP = 0;
    static final int REMOVE = 2;
    boolean mNeedsSync;
    boolean mPendingSync;
    final long[] mTableObservers;
    final int[] mTriggerStateChanges;
    final boolean[] mTriggerStates;
    
    ObservedTableTracker(int paramInt)
    {
      this.mTableObservers = new long[paramInt];
      this.mTriggerStates = new boolean[paramInt];
      this.mTriggerStateChanges = new int[paramInt];
      Arrays.fill(this.mTableObservers, 0L);
      Arrays.fill(this.mTriggerStates, false);
    }
    
    @Nullable
    int[] getTablesToSync()
    {
      for (;;)
      {
        int i;
        try
        {
          if ((this.mNeedsSync) && (!this.mPendingSync))
          {
            int k = this.mTableObservers.length;
            i = 0;
            j = 1;
            int[] arrayOfInt;
            if (i < k)
            {
              if (this.mTableObservers[i] > 0L)
              {
                m = 1;
                if (m != this.mTriggerStates[i])
                {
                  arrayOfInt = this.mTriggerStateChanges;
                  if (m == 0) {
                    break label136;
                  }
                  break label138;
                }
                this.mTriggerStateChanges[i] = 0;
                this.mTriggerStates[i] = m;
                i += 1;
              }
            }
            else
            {
              this.mPendingSync = true;
              this.mNeedsSync = false;
              arrayOfInt = this.mTriggerStateChanges;
              return arrayOfInt;
            }
          }
          else
          {
            return null;
          }
        }
        finally {}
        int m = 0;
        continue;
        label136:
        int j = 2;
        label138:
        localObject[i] = j;
      }
    }
    
    boolean onAdded(int... paramVarArgs)
    {
      for (;;)
      {
        int i;
        try
        {
          int j = paramVarArgs.length;
          i = 0;
          boolean bool = false;
          if (i < j)
          {
            int k = paramVarArgs[i];
            long l = this.mTableObservers[k];
            this.mTableObservers[k] = (1L + l);
            if (l == 0L)
            {
              this.mNeedsSync = true;
              bool = true;
            }
          }
          else
          {
            return bool;
          }
        }
        finally {}
        i += 1;
      }
    }
    
    boolean onRemoved(int... paramVarArgs)
    {
      for (;;)
      {
        int i;
        try
        {
          int j = paramVarArgs.length;
          i = 0;
          boolean bool = false;
          if (i < j)
          {
            int k = paramVarArgs[i];
            long l = this.mTableObservers[k];
            this.mTableObservers[k] = (l - 1L);
            if (l == 1L)
            {
              this.mNeedsSync = true;
              bool = true;
            }
          }
          else
          {
            return bool;
          }
        }
        finally {}
        i += 1;
      }
    }
    
    void onSyncCompleted()
    {
      try
      {
        this.mPendingSync = false;
        return;
      }
      finally {}
    }
  }
  
  public static abstract class Observer
  {
    final String[] mTables;
    
    protected Observer(@NonNull String paramString, String... paramVarArgs)
    {
      this.mTables = ((String[])Arrays.copyOf(paramVarArgs, paramVarArgs.length + 1));
      this.mTables[paramVarArgs.length] = paramString;
    }
    
    public Observer(@NonNull String[] paramArrayOfString)
    {
      this.mTables = ((String[])Arrays.copyOf(paramArrayOfString, paramArrayOfString.length));
    }
    
    public abstract void onInvalidated(@NonNull Set<String> paramSet);
  }
  
  static class ObserverWrapper
  {
    final InvalidationTracker.Observer mObserver;
    private final Set<String> mSingleTableSet;
    final int[] mTableIds;
    private final String[] mTableNames;
    private final long[] mVersions;
    
    ObserverWrapper(InvalidationTracker.Observer paramObserver, int[] paramArrayOfInt, String[] paramArrayOfString, long[] paramArrayOfLong)
    {
      this.mObserver = paramObserver;
      this.mTableIds = paramArrayOfInt;
      this.mTableNames = paramArrayOfString;
      this.mVersions = paramArrayOfLong;
      if (paramArrayOfInt.length == 1)
      {
        paramObserver = new ArraySet();
        paramObserver.add(this.mTableNames[0]);
      }
      for (paramObserver = Collections.unmodifiableSet(paramObserver);; paramObserver = null)
      {
        this.mSingleTableSet = paramObserver;
        return;
      }
    }
    
    void checkForInvalidation(long[] paramArrayOfLong)
    {
      int j = this.mTableIds.length;
      Object localObject1 = null;
      int i = 0;
      while (i < j)
      {
        long l = paramArrayOfLong[this.mTableIds[i]];
        Object localObject2 = localObject1;
        if (this.mVersions[i] < l)
        {
          this.mVersions[i] = l;
          if (j == 1)
          {
            localObject2 = this.mSingleTableSet;
          }
          else
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new ArraySet(j);
            }
            ((Set)localObject2).add(this.mTableNames[i]);
          }
        }
        i += 1;
        localObject1 = localObject2;
      }
      if (localObject1 != null) {
        this.mObserver.onInvalidated((Set)localObject1);
      }
    }
  }
  
  static class WeakObserver
    extends InvalidationTracker.Observer
  {
    final WeakReference<InvalidationTracker.Observer> mDelegateRef;
    final InvalidationTracker mTracker;
    
    WeakObserver(InvalidationTracker paramInvalidationTracker, InvalidationTracker.Observer paramObserver)
    {
      super();
      this.mTracker = paramInvalidationTracker;
      this.mDelegateRef = new WeakReference(paramObserver);
    }
    
    public void onInvalidated(@NonNull Set<String> paramSet)
    {
      InvalidationTracker.Observer localObserver = (InvalidationTracker.Observer)this.mDelegateRef.get();
      if (localObserver == null)
      {
        this.mTracker.removeObserver(this);
        return;
      }
      localObserver.onInvalidated(paramSet);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/persistence/room/InvalidationTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */