package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;

public abstract interface Resource<Z>
{
  @NonNull
  public abstract Z get();
  
  @NonNull
  public abstract Class<Z> getResourceClass();
  
  public abstract int getSize();
  
  public abstract void recycle();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/Resource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */