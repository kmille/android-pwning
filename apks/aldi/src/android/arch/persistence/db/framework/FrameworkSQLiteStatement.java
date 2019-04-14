package android.arch.persistence.db.framework;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.database.sqlite.SQLiteStatement;

class FrameworkSQLiteStatement
  extends FrameworkSQLiteProgram
  implements SupportSQLiteStatement
{
  private final SQLiteStatement mDelegate;
  
  FrameworkSQLiteStatement(SQLiteStatement paramSQLiteStatement)
  {
    super(paramSQLiteStatement);
    this.mDelegate = paramSQLiteStatement;
  }
  
  public void execute()
  {
    this.mDelegate.execute();
  }
  
  public long executeInsert()
  {
    return this.mDelegate.executeInsert();
  }
  
  public int executeUpdateDelete()
  {
    return this.mDelegate.executeUpdateDelete();
  }
  
  public long simpleQueryForLong()
  {
    return this.mDelegate.simpleQueryForLong();
  }
  
  public String simpleQueryForString()
  {
    return this.mDelegate.simpleQueryForString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/persistence/db/framework/FrameworkSQLiteStatement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */