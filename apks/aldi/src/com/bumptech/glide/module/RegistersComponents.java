package com.bumptech.glide.module;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;

@Deprecated
public abstract interface RegistersComponents
{
  public abstract void registerComponents(@NonNull Context paramContext, @NonNull Glide paramGlide, @NonNull Registry paramRegistry);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/module/RegistersComponents.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */