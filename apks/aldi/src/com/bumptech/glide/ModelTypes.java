package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.CheckResult;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import java.io.File;
import java.net.URL;

abstract interface ModelTypes<T>
{
  @CheckResult
  @NonNull
  public abstract T load(@Nullable Bitmap paramBitmap);
  
  @CheckResult
  @NonNull
  public abstract T load(@Nullable Drawable paramDrawable);
  
  @CheckResult
  @NonNull
  public abstract T load(@Nullable Uri paramUri);
  
  @CheckResult
  @NonNull
  public abstract T load(@Nullable File paramFile);
  
  @CheckResult
  @NonNull
  public abstract T load(@DrawableRes @Nullable @RawRes Integer paramInteger);
  
  @CheckResult
  @NonNull
  public abstract T load(@Nullable Object paramObject);
  
  @CheckResult
  @NonNull
  public abstract T load(@Nullable String paramString);
  
  @Deprecated
  @CheckResult
  public abstract T load(@Nullable URL paramURL);
  
  @CheckResult
  @NonNull
  public abstract T load(@Nullable byte[] paramArrayOfByte);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/ModelTypes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */