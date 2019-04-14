package android.arch.persistence.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public abstract interface SupportSQLiteOpenHelper
{
  public abstract void close();
  
  public abstract String getDatabaseName();
  
  public abstract SupportSQLiteDatabase getReadableDatabase();
  
  public abstract SupportSQLiteDatabase getWritableDatabase();
  
  @RequiresApi(api=16)
  public abstract void setWriteAheadLoggingEnabled(boolean paramBoolean);
  
  public static abstract class Callback
  {
    private static final String TAG = "SupportSQLite";
    public final int version;
    
    public Callback(int paramInt)
    {
      this.version = paramInt;
    }
    
    private void deleteDatabaseFile(String paramString)
    {
      if (!paramString.equalsIgnoreCase(":memory:")) {
        if (paramString.trim().length() == 0) {
          return;
        }
      }
      try
      {
        if (Build.VERSION.SDK_INT >= 16)
        {
          SQLiteDatabase.deleteDatabase(new File(paramString));
          return;
        }
        try
        {
          if (!new File(paramString).delete()) {
            Log.e("SupportSQLite", "Could not delete the database file ".concat(String.valueOf(paramString)));
          }
          return;
        }
        catch (Exception paramString)
        {
          Log.e("SupportSQLite", "error while deleting corrupted database file", paramString);
        }
        return;
      }
      catch (Exception paramString) {}
    }
    
    public void onConfigure(SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
    
    public void onCorruption(SupportSQLiteDatabase paramSupportSQLiteDatabase)
    {
      Object localObject1 = new StringBuilder("Corruption reported by sqlite on database: ");
      ((StringBuilder)localObject1).append(paramSupportSQLiteDatabase.getPath());
      Log.e("SupportSQLite", ((StringBuilder)localObject1).toString());
      if (!paramSupportSQLiteDatabase.isOpen()) {}
      label84:
      do
      {
        deleteDatabaseFile(paramSupportSQLiteDatabase.getPath());
        return;
        localObject1 = null;
        Object localObject3 = null;
        try
        {
          try
          {
            List localList = paramSupportSQLiteDatabase.getAttachedDbs();
            localObject1 = localList;
          }
          finally
          {
            break label84;
          }
        }
        catch (SQLiteException localSQLiteException)
        {
          for (;;) {}
        }
        localObject3 = localObject2;
        try
        {
          paramSupportSQLiteDatabase.close();
        }
        catch (IOException localIOException)
        {
          continue;
        }
        if (localObject3 != null) {
          paramSupportSQLiteDatabase = ((List)localObject3).iterator();
        }
        for (;;)
        {
          if (paramSupportSQLiteDatabase.hasNext())
          {
            deleteDatabaseFile((String)((Pair)paramSupportSQLiteDatabase.next()).second);
            continue;
            deleteDatabaseFile(paramSupportSQLiteDatabase.getPath());
          }
          else
          {
            throw ((Throwable)localObject2);
          }
        }
      } while (localObject2 == null);
      paramSupportSQLiteDatabase = ((List)localObject2).iterator();
      while (paramSupportSQLiteDatabase.hasNext()) {
        deleteDatabaseFile((String)((Pair)paramSupportSQLiteDatabase.next()).second);
      }
    }
    
    public abstract void onCreate(SupportSQLiteDatabase paramSupportSQLiteDatabase);
    
    public void onDowngrade(SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt1, int paramInt2)
    {
      paramSupportSQLiteDatabase = new StringBuilder("Can't downgrade database from version ");
      paramSupportSQLiteDatabase.append(paramInt1);
      paramSupportSQLiteDatabase.append(" to ");
      paramSupportSQLiteDatabase.append(paramInt2);
      throw new SQLiteException(paramSupportSQLiteDatabase.toString());
    }
    
    public void onOpen(SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
    
    public abstract void onUpgrade(SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt1, int paramInt2);
  }
  
  public static class Configuration
  {
    @NonNull
    public final SupportSQLiteOpenHelper.Callback callback;
    @NonNull
    public final Context context;
    @Nullable
    public final String name;
    
    Configuration(@NonNull Context paramContext, @Nullable String paramString, @NonNull SupportSQLiteOpenHelper.Callback paramCallback)
    {
      this.context = paramContext;
      this.name = paramString;
      this.callback = paramCallback;
    }
    
    public static Builder builder(Context paramContext)
    {
      return new Builder(paramContext);
    }
    
    public static class Builder
    {
      SupportSQLiteOpenHelper.Callback mCallback;
      Context mContext;
      String mName;
      
      Builder(@NonNull Context paramContext)
      {
        this.mContext = paramContext;
      }
      
      public SupportSQLiteOpenHelper.Configuration build()
      {
        if (this.mCallback != null)
        {
          if (this.mContext != null) {
            return new SupportSQLiteOpenHelper.Configuration(this.mContext, this.mName, this.mCallback);
          }
          throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
      }
      
      public Builder callback(@NonNull SupportSQLiteOpenHelper.Callback paramCallback)
      {
        this.mCallback = paramCallback;
        return this;
      }
      
      public Builder name(@Nullable String paramString)
      {
        this.mName = paramString;
        return this;
      }
    }
  }
  
  public static abstract interface Factory
  {
    public abstract SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration paramConfiguration);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/persistence/db/SupportSQLiteOpenHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */