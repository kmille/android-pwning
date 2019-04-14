package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

public abstract interface TransitionFactory<R>
{
  public abstract Transition<R> build(DataSource paramDataSource, boolean paramBoolean);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/transition/TransitionFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */