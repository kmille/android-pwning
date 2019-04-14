package android.arch.persistence.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.arch.core.executor.ArchTaskExecutor;
import android.arch.persistence.db.SimpleSQLiteQuery;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Factory;
import android.arch.persistence.db.SupportSQLiteQuery;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.db.framework.FrameworkSQLiteOpenHelperFactory;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.WorkerThread;
import android.support.v4.app.ActivityManagerCompat;
import android.support.v4.util.SparseArrayCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class RoomDatabase
{
  private static final String DB_IMPL_SUFFIX = "_Impl";
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static final int MAX_BIND_PARAMETER_CNT = 999;
  private boolean mAllowMainThreadQueries;
  @Nullable
  public List<Callback> mCallbacks;
  private final ReentrantLock mCloseLock = new ReentrantLock();
  public volatile SupportSQLiteDatabase mDatabase;
  private final InvalidationTracker mInvalidationTracker = createInvalidationTracker();
  private SupportSQLiteOpenHelper mOpenHelper;
  boolean mWriteAheadLoggingEnabled;
  
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void assertNotMainThread()
  {
    if (this.mAllowMainThreadQueries) {
      return;
    }
    if (!ArchTaskExecutor.getInstance().isMainThread()) {
      return;
    }
    throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
  }
  
  public void beginTransaction()
  {
    assertNotMainThread();
    SupportSQLiteDatabase localSupportSQLiteDatabase = this.mOpenHelper.getWritableDatabase();
    this.mInvalidationTracker.syncTriggers(localSupportSQLiteDatabase);
    localSupportSQLiteDatabase.beginTransaction();
  }
  
  @WorkerThread
  public abstract void clearAllTables();
  
  public void close()
  {
    if (isOpen()) {
      try
      {
        this.mCloseLock.lock();
        this.mOpenHelper.close();
        return;
      }
      finally
      {
        this.mCloseLock.unlock();
      }
    }
  }
  
  public SupportSQLiteStatement compileStatement(@NonNull String paramString)
  {
    assertNotMainThread();
    return this.mOpenHelper.getWritableDatabase().compileStatement(paramString);
  }
  
  @NonNull
  protected abstract InvalidationTracker createInvalidationTracker();
  
  @NonNull
  protected abstract SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration paramDatabaseConfiguration);
  
  public void endTransaction()
  {
    this.mOpenHelper.getWritableDatabase().endTransaction();
    if (!inTransaction()) {
      this.mInvalidationTracker.refreshVersionsAsync();
    }
  }
  
  Lock getCloseLock()
  {
    return this.mCloseLock;
  }
  
  @NonNull
  public InvalidationTracker getInvalidationTracker()
  {
    return this.mInvalidationTracker;
  }
  
  @NonNull
  public SupportSQLiteOpenHelper getOpenHelper()
  {
    return this.mOpenHelper;
  }
  
  public boolean inTransaction()
  {
    return this.mOpenHelper.getWritableDatabase().inTransaction();
  }
  
  @CallSuper
  public void init(@NonNull DatabaseConfiguration paramDatabaseConfiguration)
  {
    this.mOpenHelper = createOpenHelper(paramDatabaseConfiguration);
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    boolean bool2 = false;
    if (i >= 16)
    {
      bool1 = bool2;
      if (paramDatabaseConfiguration.journalMode == JournalMode.WRITE_AHEAD_LOGGING) {
        bool1 = true;
      }
      this.mOpenHelper.setWriteAheadLoggingEnabled(bool1);
    }
    this.mCallbacks = paramDatabaseConfiguration.callbacks;
    this.mAllowMainThreadQueries = paramDatabaseConfiguration.allowMainThreadQueries;
    this.mWriteAheadLoggingEnabled = bool1;
  }
  
  public void internalInitInvalidationTracker(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    this.mInvalidationTracker.internalInit(paramSupportSQLiteDatabase);
  }
  
  public boolean isOpen()
  {
    SupportSQLiteDatabase localSupportSQLiteDatabase = this.mDatabase;
    return (localSupportSQLiteDatabase != null) && (localSupportSQLiteDatabase.isOpen());
  }
  
  public Cursor query(SupportSQLiteQuery paramSupportSQLiteQuery)
  {
    assertNotMainThread();
    return this.mOpenHelper.getWritableDatabase().query(paramSupportSQLiteQuery);
  }
  
  public Cursor query(String paramString, @Nullable Object[] paramArrayOfObject)
  {
    return this.mOpenHelper.getWritableDatabase().query(new SimpleSQLiteQuery(paramString, paramArrayOfObject));
  }
  
  /* Error */
  public <V> V runInTransaction(@NonNull java.util.concurrent.Callable<V> paramCallable)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 194	android/arch/persistence/room/RoomDatabase:beginTransaction	()V
    //   4: aload_1
    //   5: invokeinterface 200 1 0
    //   10: astore_1
    //   11: aload_0
    //   12: invokevirtual 203	android/arch/persistence/room/RoomDatabase:setTransactionSuccessful	()V
    //   15: aload_0
    //   16: invokevirtual 204	android/arch/persistence/room/RoomDatabase:endTransaction	()V
    //   19: aload_1
    //   20: areturn
    //   21: astore_1
    //   22: goto +18 -> 40
    //   25: astore_1
    //   26: new 191	java/lang/RuntimeException
    //   29: dup
    //   30: ldc -50
    //   32: aload_1
    //   33: invokespecial 209	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   36: athrow
    //   37: astore_1
    //   38: aload_1
    //   39: athrow
    //   40: aload_0
    //   41: invokevirtual 204	android/arch/persistence/room/RoomDatabase:endTransaction	()V
    //   44: aload_1
    //   45: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	this	RoomDatabase
    //   0	46	1	paramCallable	java.util.concurrent.Callable<V>
    // Exception table:
    //   from	to	target	type
    //   4	15	21	finally
    //   26	37	21	finally
    //   38	40	21	finally
    //   4	15	25	java/lang/Exception
    //   4	15	37	java/lang/RuntimeException
  }
  
  public void runInTransaction(@NonNull Runnable paramRunnable)
  {
    beginTransaction();
    try
    {
      paramRunnable.run();
      setTransactionSuccessful();
      return;
    }
    finally
    {
      endTransaction();
    }
  }
  
  public void setTransactionSuccessful()
  {
    this.mOpenHelper.getWritableDatabase().setTransactionSuccessful();
  }
  
  public static class Builder<T extends RoomDatabase>
  {
    private boolean mAllowMainThreadQueries;
    private ArrayList<RoomDatabase.Callback> mCallbacks;
    private final Context mContext;
    private final Class<T> mDatabaseClass;
    private SupportSQLiteOpenHelper.Factory mFactory;
    private RoomDatabase.JournalMode mJournalMode;
    private final RoomDatabase.MigrationContainer mMigrationContainer;
    private Set<Integer> mMigrationStartAndEndVersions;
    private Set<Integer> mMigrationsNotRequiredFrom;
    private final String mName;
    private boolean mRequireMigration;
    
    Builder(@NonNull Context paramContext, @NonNull Class<T> paramClass, @Nullable String paramString)
    {
      this.mContext = paramContext;
      this.mDatabaseClass = paramClass;
      this.mName = paramString;
      this.mJournalMode = RoomDatabase.JournalMode.AUTOMATIC;
      this.mRequireMigration = true;
      this.mMigrationContainer = new RoomDatabase.MigrationContainer();
    }
    
    @NonNull
    public Builder<T> addCallback(@NonNull RoomDatabase.Callback paramCallback)
    {
      if (this.mCallbacks == null) {
        this.mCallbacks = new ArrayList();
      }
      this.mCallbacks.add(paramCallback);
      return this;
    }
    
    @NonNull
    public Builder<T> addMigrations(@NonNull Migration... paramVarArgs)
    {
      if (this.mMigrationStartAndEndVersions == null) {
        this.mMigrationStartAndEndVersions = new HashSet();
      }
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        Migration localMigration = paramVarArgs[i];
        this.mMigrationStartAndEndVersions.add(Integer.valueOf(localMigration.startVersion));
        this.mMigrationStartAndEndVersions.add(Integer.valueOf(localMigration.endVersion));
        i += 1;
      }
      this.mMigrationContainer.addMigrations(paramVarArgs);
      return this;
    }
    
    @NonNull
    public Builder<T> allowMainThreadQueries()
    {
      this.mAllowMainThreadQueries = true;
      return this;
    }
    
    @NonNull
    public T build()
    {
      if (this.mContext != null)
      {
        if (this.mDatabaseClass != null)
        {
          if ((this.mMigrationStartAndEndVersions != null) && (this.mMigrationsNotRequiredFrom != null))
          {
            localObject1 = this.mMigrationStartAndEndVersions.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = (Integer)((Iterator)localObject1).next();
              if (this.mMigrationsNotRequiredFrom.contains(localObject2)) {
                throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ".concat(String.valueOf(localObject2)));
              }
            }
          }
          if (this.mFactory == null) {
            this.mFactory = new FrameworkSQLiteOpenHelperFactory();
          }
          Object localObject1 = new DatabaseConfiguration(this.mContext, this.mName, this.mFactory, this.mMigrationContainer, this.mCallbacks, this.mAllowMainThreadQueries, this.mJournalMode.resolve(this.mContext), this.mRequireMigration, this.mMigrationsNotRequiredFrom);
          Object localObject2 = (RoomDatabase)Room.getGeneratedImplementation(this.mDatabaseClass, "_Impl");
          ((RoomDatabase)localObject2).init((DatabaseConfiguration)localObject1);
          return (T)localObject2;
        }
        throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
      }
      throw new IllegalArgumentException("Cannot provide null context for the database.");
    }
    
    @NonNull
    public Builder<T> fallbackToDestructiveMigration()
    {
      this.mRequireMigration = false;
      return this;
    }
    
    @NonNull
    public Builder<T> fallbackToDestructiveMigrationFrom(int... paramVarArgs)
    {
      if (this.mMigrationsNotRequiredFrom == null) {
        this.mMigrationsNotRequiredFrom = new HashSet(paramVarArgs.length);
      }
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        int k = paramVarArgs[i];
        this.mMigrationsNotRequiredFrom.add(Integer.valueOf(k));
        i += 1;
      }
      return this;
    }
    
    @NonNull
    public Builder<T> openHelperFactory(@Nullable SupportSQLiteOpenHelper.Factory paramFactory)
    {
      this.mFactory = paramFactory;
      return this;
    }
    
    @NonNull
    public Builder<T> setJournalMode(@NonNull RoomDatabase.JournalMode paramJournalMode)
    {
      this.mJournalMode = paramJournalMode;
      return this;
    }
  }
  
  public static abstract class Callback
  {
    public void onCreate(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
    
    public void onOpen(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
  }
  
  public static enum JournalMode
  {
    AUTOMATIC,  TRUNCATE,  WRITE_AHEAD_LOGGING;
    
    private JournalMode() {}
    
    @SuppressLint({"NewApi"})
    final JournalMode resolve(Context paramContext)
    {
      if (this != AUTOMATIC) {
        return this;
      }
      if (Build.VERSION.SDK_INT >= 16)
      {
        paramContext = (ActivityManager)paramContext.getSystemService("activity");
        if ((paramContext != null) && (!ActivityManagerCompat.isLowRamDevice(paramContext))) {
          return WRITE_AHEAD_LOGGING;
        }
      }
      return TRUNCATE;
    }
  }
  
  public static class MigrationContainer
  {
    private SparseArrayCompat<SparseArrayCompat<Migration>> mMigrations = new SparseArrayCompat();
    
    private void addMigration(Migration paramMigration)
    {
      int i = paramMigration.startVersion;
      int j = paramMigration.endVersion;
      Object localObject2 = (SparseArrayCompat)this.mMigrations.get(i);
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new SparseArrayCompat();
        this.mMigrations.put(i, localObject1);
      }
      localObject2 = (Migration)((SparseArrayCompat)localObject1).get(j);
      if (localObject2 != null)
      {
        StringBuilder localStringBuilder = new StringBuilder("Overriding migration ");
        localStringBuilder.append(localObject2);
        localStringBuilder.append(" with ");
        localStringBuilder.append(paramMigration);
      }
      ((SparseArrayCompat)localObject1).append(j, paramMigration);
    }
    
    private List<Migration> findUpMigrationPath(List<Migration> paramList, boolean paramBoolean, int paramInt1, int paramInt2)
    {
      int i;
      int j;
      if (paramBoolean)
      {
        i = -1;
        j = paramInt1;
      }
      else
      {
        i = 1;
        j = paramInt1;
      }
      while (paramBoolean ? j < paramInt2 : j > paramInt2)
      {
        SparseArrayCompat localSparseArrayCompat = (SparseArrayCompat)this.mMigrations.get(j);
        if (localSparseArrayCompat == null) {
          return null;
        }
        int k = localSparseArrayCompat.size();
        int i1 = 0;
        if (paramBoolean)
        {
          paramInt1 = k - 1;
          k = -1;
        }
        else
        {
          paramInt1 = 0;
        }
        int m;
        int n;
        for (;;)
        {
          m = i1;
          n = j;
          if (paramInt1 == k) {
            break;
          }
          n = localSparseArrayCompat.keyAt(paramInt1);
          if (paramBoolean) {
            if ((n > paramInt2) || (n <= j)) {}
          }
          for (;;)
          {
            m = 1;
            break;
            do
            {
              m = 0;
              break;
            } while ((n < paramInt2) || (n >= j));
          }
          if (m != 0)
          {
            paramList.add(localSparseArrayCompat.valueAt(paramInt1));
            m = 1;
            break;
          }
          paramInt1 += i;
        }
        j = n;
        if (m == 0) {
          return null;
        }
      }
      return paramList;
    }
    
    public void addMigrations(@NonNull Migration... paramVarArgs)
    {
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        addMigration(paramVarArgs[i]);
        i += 1;
      }
    }
    
    @Nullable
    public List<Migration> findMigrationPath(int paramInt1, int paramInt2)
    {
      if (paramInt1 == paramInt2) {
        return Collections.emptyList();
      }
      boolean bool;
      if (paramInt2 > paramInt1) {
        bool = true;
      } else {
        bool = false;
      }
      return findUpMigrationPath(new ArrayList(), bool, paramInt1, paramInt2);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/persistence/room/RoomDatabase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */