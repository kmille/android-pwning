package android.arch.persistence.db.framework;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.RequiresApi;

class FrameworkSQLiteOpenHelper
  implements SupportSQLiteOpenHelper
{
  private final OpenHelper mDelegate = createDelegate(paramContext, paramString, paramCallback);
  
  FrameworkSQLiteOpenHelper(Context paramContext, String paramString, SupportSQLiteOpenHelper.Callback paramCallback) {}
  
  private OpenHelper createDelegate(Context paramContext, String paramString, SupportSQLiteOpenHelper.Callback paramCallback)
  {
    return new OpenHelper(paramContext, paramString, new FrameworkSQLiteDatabase[1], paramCallback);
  }
  
  public void close()
  {
    this.mDelegate.close();
  }
  
  public String getDatabaseName()
  {
    return this.mDelegate.getDatabaseName();
  }
  
  public SupportSQLiteDatabase getReadableDatabase()
  {
    return this.mDelegate.getReadableSupportDatabase();
  }
  
  public SupportSQLiteDatabase getWritableDatabase()
  {
    return this.mDelegate.getWritableSupportDatabase();
  }
  
  @RequiresApi(api=16)
  public void setWriteAheadLoggingEnabled(boolean paramBoolean)
  {
    this.mDelegate.setWriteAheadLoggingEnabled(paramBoolean);
  }
  
  static class OpenHelper
    extends SQLiteOpenHelper
  {
    final SupportSQLiteOpenHelper.Callback mCallback;
    final FrameworkSQLiteDatabase[] mDbRef;
    private boolean mMigrated;
    
    OpenHelper(Context paramContext, String paramString, FrameworkSQLiteDatabase[] paramArrayOfFrameworkSQLiteDatabase, final SupportSQLiteOpenHelper.Callback paramCallback)
    {
      super(paramString, null, paramCallback.version, new DatabaseErrorHandler()
      {
        public void onCorruption(SQLiteDatabase paramAnonymousSQLiteDatabase)
        {
          paramAnonymousSQLiteDatabase = FrameworkSQLiteOpenHelper.OpenHelper.this[0];
          if (paramAnonymousSQLiteDatabase != null) {
            paramCallback.onCorruption(paramAnonymousSQLiteDatabase);
          }
        }
      });
      this.mCallback = paramCallback;
      this.mDbRef = paramArrayOfFrameworkSQLiteDatabase;
    }
    
    public void close()
    {
      try
      {
        super.close();
        this.mDbRef[0] = null;
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    SupportSQLiteDatabase getReadableSupportDatabase()
    {
      try
      {
        this.mMigrated = false;
        Object localObject1 = super.getReadableDatabase();
        if (this.mMigrated)
        {
          close();
          localObject1 = getReadableSupportDatabase();
          return (SupportSQLiteDatabase)localObject1;
        }
        localObject1 = getWrappedDb((SQLiteDatabase)localObject1);
        return (SupportSQLiteDatabase)localObject1;
      }
      finally {}
    }
    
    FrameworkSQLiteDatabase getWrappedDb(SQLiteDatabase paramSQLiteDatabase)
    {
      if (this.mDbRef[0] == null)
      {
        paramSQLiteDatabase = new FrameworkSQLiteDatabase(paramSQLiteDatabase);
        this.mDbRef[0] = paramSQLiteDatabase;
      }
      return this.mDbRef[0];
    }
    
    SupportSQLiteDatabase getWritableSupportDatabase()
    {
      try
      {
        this.mMigrated = false;
        Object localObject1 = super.getWritableDatabase();
        if (this.mMigrated)
        {
          close();
          localObject1 = getWritableSupportDatabase();
          return (SupportSQLiteDatabase)localObject1;
        }
        localObject1 = getWrappedDb((SQLiteDatabase)localObject1);
        return (SupportSQLiteDatabase)localObject1;
      }
      finally {}
    }
    
    public void onConfigure(SQLiteDatabase paramSQLiteDatabase)
    {
      this.mCallback.onConfigure(getWrappedDb(paramSQLiteDatabase));
    }
    
    public void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      this.mCallback.onCreate(getWrappedDb(paramSQLiteDatabase));
    }
    
    public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      this.mMigrated = true;
      this.mCallback.onDowngrade(getWrappedDb(paramSQLiteDatabase), paramInt1, paramInt2);
    }
    
    public void onOpen(SQLiteDatabase paramSQLiteDatabase)
    {
      if (!this.mMigrated) {
        this.mCallback.onOpen(getWrappedDb(paramSQLiteDatabase));
      }
    }
    
    public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      this.mMigrated = true;
      this.mCallback.onUpgrade(getWrappedDb(paramSQLiteDatabase), paramInt1, paramInt2);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/persistence/db/framework/FrameworkSQLiteOpenHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */