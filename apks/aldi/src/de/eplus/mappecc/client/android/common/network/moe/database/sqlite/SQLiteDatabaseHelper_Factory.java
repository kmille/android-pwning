package de.eplus.mappecc.client.android.common.network.moe.database.sqlite;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SQLiteDatabaseHelper_Factory
  implements Factory<SQLiteDatabaseHelper>
{
  private final Provider<Context> contextProvider;
  
  public SQLiteDatabaseHelper_Factory(Provider<Context> paramProvider)
  {
    this.contextProvider = paramProvider;
  }
  
  public static SQLiteDatabaseHelper_Factory create(Provider<Context> paramProvider)
  {
    return new SQLiteDatabaseHelper_Factory(paramProvider);
  }
  
  public static SQLiteDatabaseHelper newSQLiteDatabaseHelper(Context paramContext)
  {
    return new SQLiteDatabaseHelper(paramContext);
  }
  
  public static SQLiteDatabaseHelper provideInstance(Provider<Context> paramProvider)
  {
    return new SQLiteDatabaseHelper((Context)paramProvider.get());
  }
  
  public final SQLiteDatabaseHelper get()
  {
    return provideInstance(this.contextProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/database/sqlite/SQLiteDatabaseHelper_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */