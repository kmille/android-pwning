package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.view.View;

public abstract interface Transition<R>
{
  public abstract boolean transition(R paramR, ViewAdapter paramViewAdapter);
  
  public static abstract interface ViewAdapter
  {
    @Nullable
    public abstract Drawable getCurrentDrawable();
    
    public abstract View getView();
    
    public abstract void setDrawable(Drawable paramDrawable);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/transition/Transition.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */