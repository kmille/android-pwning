package android.support.v4.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.WindowManager;
import java.util.WeakHashMap;

public final class DisplayManagerCompat
{
  public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
  private static final WeakHashMap<Context, DisplayManagerCompat> sInstances = new WeakHashMap();
  private final Context mContext;
  
  private DisplayManagerCompat(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  @NonNull
  public static DisplayManagerCompat getInstance(@NonNull Context paramContext)
  {
    synchronized (sInstances)
    {
      DisplayManagerCompat localDisplayManagerCompat2 = (DisplayManagerCompat)sInstances.get(paramContext);
      DisplayManagerCompat localDisplayManagerCompat1 = localDisplayManagerCompat2;
      if (localDisplayManagerCompat2 == null)
      {
        localDisplayManagerCompat1 = new DisplayManagerCompat(paramContext);
        sInstances.put(paramContext, localDisplayManagerCompat1);
      }
      return localDisplayManagerCompat1;
    }
  }
  
  @Nullable
  public final Display getDisplay(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return ((DisplayManager)this.mContext.getSystemService("display")).getDisplay(paramInt);
    }
    Display localDisplay = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay();
    if (localDisplay.getDisplayId() == paramInt) {
      return localDisplay;
    }
    return null;
  }
  
  @NonNull
  public final Display[] getDisplays()
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return ((DisplayManager)this.mContext.getSystemService("display")).getDisplays();
    }
    return new Display[] { ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay() };
  }
  
  @NonNull
  public final Display[] getDisplays(@Nullable String paramString)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return ((DisplayManager)this.mContext.getSystemService("display")).getDisplays(paramString);
    }
    if (paramString == null) {
      return new Display[0];
    }
    return new Display[] { ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay() };
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/hardware/display/DisplayManagerCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */