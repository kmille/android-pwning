package com.bumptech.glide.load.model;

import android.support.annotation.NonNull;

public abstract interface ModelLoaderFactory<T, Y>
{
  @NonNull
  public abstract ModelLoader<T, Y> build(@NonNull MultiModelLoaderFactory paramMultiModelLoaderFactory);
  
  public abstract void teardown();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/ModelLoaderFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */