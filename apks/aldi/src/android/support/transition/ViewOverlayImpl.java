package android.support.transition;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;

abstract interface ViewOverlayImpl
{
  public abstract void add(@NonNull Drawable paramDrawable);
  
  public abstract void clear();
  
  public abstract void remove(@NonNull Drawable paramDrawable);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/transition/ViewOverlayImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */