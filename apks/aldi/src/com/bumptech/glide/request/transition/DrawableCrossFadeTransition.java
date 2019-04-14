package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

public class DrawableCrossFadeTransition
  implements Transition<Drawable>
{
  private final int duration;
  private final boolean isCrossFadeEnabled;
  
  public DrawableCrossFadeTransition(int paramInt, boolean paramBoolean)
  {
    this.duration = paramInt;
    this.isCrossFadeEnabled = paramBoolean;
  }
  
  public boolean transition(Drawable paramDrawable, Transition.ViewAdapter paramViewAdapter)
  {
    Drawable localDrawable = paramViewAdapter.getCurrentDrawable();
    Object localObject = localDrawable;
    if (localDrawable == null) {
      localObject = new ColorDrawable(0);
    }
    paramDrawable = new TransitionDrawable(new Drawable[] { localObject, paramDrawable });
    paramDrawable.setCrossFadeEnabled(this.isCrossFadeEnabled);
    paramDrawable.startTransition(this.duration);
    paramViewAdapter.setDrawable(paramDrawable);
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/transition/DrawableCrossFadeTransition.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */