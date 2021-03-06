package android.support.transition;

import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.view.ViewGroup;

class ViewGroupUtils
{
  static ViewGroupOverlayImpl getOverlay(@NonNull ViewGroup paramViewGroup)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      return new ViewGroupOverlayApi18(paramViewGroup);
    }
    return ViewGroupOverlayApi14.createFrom(paramViewGroup);
  }
  
  static void suppressLayout(@NonNull ViewGroup paramViewGroup, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 18)
    {
      ViewGroupUtilsApi18.suppressLayout(paramViewGroup, paramBoolean);
      return;
    }
    ViewGroupUtilsApi14.suppressLayout(paramViewGroup, paramBoolean);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/transition/ViewGroupUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */