package android.arch.persistence.room.migration;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.support.annotation.NonNull;

public abstract class Migration
{
  public final int endVersion;
  public final int startVersion;
  
  public Migration(int paramInt1, int paramInt2)
  {
    this.startVersion = paramInt1;
    this.endVersion = paramInt2;
  }
  
  public abstract void migrate(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/persistence/room/migration/Migration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */