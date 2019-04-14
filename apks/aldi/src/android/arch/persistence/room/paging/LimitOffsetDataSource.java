package android.arch.persistence.room.paging;

import android.arch.paging.PositionalDataSource;
import android.arch.paging.PositionalDataSource.LoadInitialCallback;
import android.arch.paging.PositionalDataSource.LoadInitialParams;
import android.arch.paging.PositionalDataSource.LoadRangeCallback;
import android.arch.paging.PositionalDataSource.LoadRangeParams;
import android.arch.persistence.db.SupportSQLiteQuery;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.InvalidationTracker.Observer;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract class LimitOffsetDataSource<T>
  extends PositionalDataSource<T>
{
  private final String mCountQuery;
  private final RoomDatabase mDb;
  private final boolean mInTransaction;
  private final String mLimitOffsetQuery;
  private final InvalidationTracker.Observer mObserver;
  private final RoomSQLiteQuery mSourceQuery;
  
  protected LimitOffsetDataSource(RoomDatabase paramRoomDatabase, SupportSQLiteQuery paramSupportSQLiteQuery, boolean paramBoolean, String... paramVarArgs)
  {
    this(paramRoomDatabase, RoomSQLiteQuery.copyFrom(paramSupportSQLiteQuery), paramBoolean, paramVarArgs);
  }
  
  protected LimitOffsetDataSource(RoomDatabase paramRoomDatabase, RoomSQLiteQuery paramRoomSQLiteQuery, boolean paramBoolean, String... paramVarArgs)
  {
    this.mDb = paramRoomDatabase;
    this.mSourceQuery = paramRoomSQLiteQuery;
    this.mInTransaction = paramBoolean;
    paramRoomSQLiteQuery = new StringBuilder("SELECT COUNT(*) FROM ( ");
    paramRoomSQLiteQuery.append(this.mSourceQuery.getSql());
    paramRoomSQLiteQuery.append(" )");
    this.mCountQuery = paramRoomSQLiteQuery.toString();
    paramRoomSQLiteQuery = new StringBuilder("SELECT * FROM ( ");
    paramRoomSQLiteQuery.append(this.mSourceQuery.getSql());
    paramRoomSQLiteQuery.append(" ) LIMIT ? OFFSET ?");
    this.mLimitOffsetQuery = paramRoomSQLiteQuery.toString();
    this.mObserver = new InvalidationTracker.Observer(paramVarArgs)
    {
      public void onInvalidated(@NonNull Set<String> paramAnonymousSet)
      {
        LimitOffsetDataSource.this.invalidate();
      }
    };
    paramRoomDatabase.getInvalidationTracker().addWeakObserver(this.mObserver);
  }
  
  protected abstract List<T> convertRows(Cursor paramCursor);
  
  public int countItems()
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire(this.mCountQuery, this.mSourceQuery.getArgCount());
    localRoomSQLiteQuery.copyArgumentsFrom(this.mSourceQuery);
    Cursor localCursor = this.mDb.query(localRoomSQLiteQuery);
    try
    {
      if (localCursor.moveToFirst())
      {
        int i = localCursor.getInt(0);
        return i;
      }
      return 0;
    }
    finally
    {
      localCursor.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public boolean isInvalid()
  {
    this.mDb.getInvalidationTracker().refreshVersionsSync();
    return super.isInvalid();
  }
  
  public void loadInitial(@NonNull PositionalDataSource.LoadInitialParams paramLoadInitialParams, @NonNull PositionalDataSource.LoadInitialCallback<T> paramLoadInitialCallback)
  {
    int i = countItems();
    if (i == 0)
    {
      paramLoadInitialCallback.onResult(Collections.emptyList(), 0, 0);
      return;
    }
    int j = computeInitialLoadPosition(paramLoadInitialParams, i);
    int k = computeInitialLoadSize(paramLoadInitialParams, j, i);
    paramLoadInitialParams = loadRange(j, k);
    if ((paramLoadInitialParams != null) && (paramLoadInitialParams.size() == k))
    {
      paramLoadInitialCallback.onResult(paramLoadInitialParams, j, i);
      return;
    }
    invalidate();
  }
  
  /* Error */
  @android.support.annotation.Nullable
  public List<T> loadRange(int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 71	android/arch/persistence/room/paging/LimitOffsetDataSource:mLimitOffsetQuery	Ljava/lang/String;
    //   4: aload_0
    //   5: getfield 41	android/arch/persistence/room/paging/LimitOffsetDataSource:mSourceQuery	Landroid/arch/persistence/room/RoomSQLiteQuery;
    //   8: invokevirtual 95	android/arch/persistence/room/RoomSQLiteQuery:getArgCount	()I
    //   11: iconst_2
    //   12: iadd
    //   13: invokestatic 99	android/arch/persistence/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroid/arch/persistence/room/RoomSQLiteQuery;
    //   16: astore 5
    //   18: aload 5
    //   20: aload_0
    //   21: getfield 41	android/arch/persistence/room/paging/LimitOffsetDataSource:mSourceQuery	Landroid/arch/persistence/room/RoomSQLiteQuery;
    //   24: invokevirtual 103	android/arch/persistence/room/RoomSQLiteQuery:copyArgumentsFrom	(Landroid/arch/persistence/room/RoomSQLiteQuery;)V
    //   27: aload 5
    //   29: aload 5
    //   31: invokevirtual 95	android/arch/persistence/room/RoomSQLiteQuery:getArgCount	()I
    //   34: iconst_1
    //   35: isub
    //   36: iload_2
    //   37: i2l
    //   38: invokevirtual 174	android/arch/persistence/room/RoomSQLiteQuery:bindLong	(IJ)V
    //   41: aload 5
    //   43: aload 5
    //   45: invokevirtual 95	android/arch/persistence/room/RoomSQLiteQuery:getArgCount	()I
    //   48: iload_1
    //   49: i2l
    //   50: invokevirtual 174	android/arch/persistence/room/RoomSQLiteQuery:bindLong	(IJ)V
    //   53: aload_0
    //   54: getfield 43	android/arch/persistence/room/paging/LimitOffsetDataSource:mInTransaction	Z
    //   57: ifeq +95 -> 152
    //   60: aload_0
    //   61: getfield 39	android/arch/persistence/room/paging/LimitOffsetDataSource:mDb	Landroid/arch/persistence/room/RoomDatabase;
    //   64: invokevirtual 177	android/arch/persistence/room/RoomDatabase:beginTransaction	()V
    //   67: aload_0
    //   68: getfield 39	android/arch/persistence/room/paging/LimitOffsetDataSource:mDb	Landroid/arch/persistence/room/RoomDatabase;
    //   71: aload 5
    //   73: invokevirtual 107	android/arch/persistence/room/RoomDatabase:query	(Landroid/arch/persistence/db/SupportSQLiteQuery;)Landroid/database/Cursor;
    //   76: astore 4
    //   78: aload_0
    //   79: aload 4
    //   81: invokevirtual 179	android/arch/persistence/room/paging/LimitOffsetDataSource:convertRows	(Landroid/database/Cursor;)Ljava/util/List;
    //   84: astore_3
    //   85: aload_0
    //   86: getfield 39	android/arch/persistence/room/paging/LimitOffsetDataSource:mDb	Landroid/arch/persistence/room/RoomDatabase;
    //   89: invokevirtual 182	android/arch/persistence/room/RoomDatabase:setTransactionSuccessful	()V
    //   92: aload 4
    //   94: ifnull +10 -> 104
    //   97: aload 4
    //   99: invokeinterface 120 1 0
    //   104: aload_0
    //   105: getfield 39	android/arch/persistence/room/paging/LimitOffsetDataSource:mDb	Landroid/arch/persistence/room/RoomDatabase;
    //   108: invokevirtual 185	android/arch/persistence/room/RoomDatabase:endTransaction	()V
    //   111: aload 5
    //   113: invokevirtual 123	android/arch/persistence/room/RoomSQLiteQuery:release	()V
    //   116: aload_3
    //   117: areturn
    //   118: astore_3
    //   119: goto +7 -> 126
    //   122: astore_3
    //   123: aconst_null
    //   124: astore 4
    //   126: aload 4
    //   128: ifnull +10 -> 138
    //   131: aload 4
    //   133: invokeinterface 120 1 0
    //   138: aload_0
    //   139: getfield 39	android/arch/persistence/room/paging/LimitOffsetDataSource:mDb	Landroid/arch/persistence/room/RoomDatabase;
    //   142: invokevirtual 185	android/arch/persistence/room/RoomDatabase:endTransaction	()V
    //   145: aload 5
    //   147: invokevirtual 123	android/arch/persistence/room/RoomSQLiteQuery:release	()V
    //   150: aload_3
    //   151: athrow
    //   152: aload_0
    //   153: getfield 39	android/arch/persistence/room/paging/LimitOffsetDataSource:mDb	Landroid/arch/persistence/room/RoomDatabase;
    //   156: aload 5
    //   158: invokevirtual 107	android/arch/persistence/room/RoomDatabase:query	(Landroid/arch/persistence/db/SupportSQLiteQuery;)Landroid/database/Cursor;
    //   161: astore_3
    //   162: aload_0
    //   163: aload_3
    //   164: invokevirtual 179	android/arch/persistence/room/paging/LimitOffsetDataSource:convertRows	(Landroid/database/Cursor;)Ljava/util/List;
    //   167: astore 4
    //   169: aload_3
    //   170: invokeinterface 120 1 0
    //   175: aload 5
    //   177: invokevirtual 123	android/arch/persistence/room/RoomSQLiteQuery:release	()V
    //   180: aload 4
    //   182: areturn
    //   183: astore 4
    //   185: aload_3
    //   186: invokeinterface 120 1 0
    //   191: aload 5
    //   193: invokevirtual 123	android/arch/persistence/room/RoomSQLiteQuery:release	()V
    //   196: aload 4
    //   198: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	199	0	this	LimitOffsetDataSource
    //   0	199	1	paramInt1	int
    //   0	199	2	paramInt2	int
    //   84	33	3	localList	List
    //   118	1	3	localObject1	Object
    //   122	29	3	localObject2	Object
    //   161	25	3	localCursor	Cursor
    //   76	105	4	localObject3	Object
    //   183	14	4	localObject4	Object
    //   16	176	5	localRoomSQLiteQuery	RoomSQLiteQuery
    // Exception table:
    //   from	to	target	type
    //   78	92	118	finally
    //   67	78	122	finally
    //   162	169	183	finally
  }
  
  public void loadRange(@NonNull PositionalDataSource.LoadRangeParams paramLoadRangeParams, @NonNull PositionalDataSource.LoadRangeCallback<T> paramLoadRangeCallback)
  {
    paramLoadRangeParams = loadRange(paramLoadRangeParams.startPosition, paramLoadRangeParams.loadSize);
    if (paramLoadRangeParams != null)
    {
      paramLoadRangeCallback.onResult(paramLoadRangeParams);
      return;
    }
    invalidate();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/persistence/room/paging/LimitOffsetDataSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */