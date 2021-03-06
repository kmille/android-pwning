package android.support.v4.database;

import android.database.CursorWindow;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public final class CursorWindowCompat
{
  @NonNull
  public static CursorWindow create(@Nullable String paramString, long paramLong)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return new CursorWindow(paramString, paramLong);
    }
    if (Build.VERSION.SDK_INT >= 15) {
      return new CursorWindow(paramString);
    }
    return new CursorWindow(false);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/database/CursorWindowCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */