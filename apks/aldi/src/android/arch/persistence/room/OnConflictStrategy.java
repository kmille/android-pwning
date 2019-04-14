package android.arch.persistence.room;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface OnConflictStrategy
{
  public static final int ABORT = 3;
  public static final int FAIL = 4;
  public static final int IGNORE = 5;
  public static final int REPLACE = 1;
  public static final int ROLLBACK = 2;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/persistence/room/OnConflictStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */