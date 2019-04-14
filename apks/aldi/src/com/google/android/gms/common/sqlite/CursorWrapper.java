package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class CursorWrapper
  extends android.database.CursorWrapper
  implements CrossProcessCursor
{
  private AbstractWindowedCursor zzez;
  
  @KeepForSdk
  public CursorWrapper(Cursor paramCursor)
  {
    super(paramCursor);
    int i = 0;
    while ((i < 10) && ((paramCursor instanceof android.database.CursorWrapper)))
    {
      paramCursor = ((android.database.CursorWrapper)paramCursor).getWrappedCursor();
      i += 1;
    }
    if (!(paramCursor instanceof AbstractWindowedCursor))
    {
      paramCursor = String.valueOf(paramCursor.getClass().getName());
      if (paramCursor.length() != 0) {
        paramCursor = "Unknown type: ".concat(paramCursor);
      } else {
        paramCursor = new String("Unknown type: ");
      }
      throw new IllegalArgumentException(paramCursor);
    }
    this.zzez = ((AbstractWindowedCursor)paramCursor);
  }
  
  @KeepForSdk
  public void fillWindow(int paramInt, CursorWindow paramCursorWindow)
  {
    this.zzez.fillWindow(paramInt, paramCursorWindow);
  }
  
  @KeepForSdk
  public CursorWindow getWindow()
  {
    return this.zzez.getWindow();
  }
  
  public boolean onMove(int paramInt1, int paramInt2)
  {
    return this.zzez.onMove(paramInt1, paramInt2);
  }
  
  @KeepForSdk
  public void setWindow(CursorWindow paramCursorWindow)
  {
    this.zzez.setWindow(paramCursorWindow);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/sqlite/CursorWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */