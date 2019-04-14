package com.bumptech.glide.load;

import android.support.annotation.NonNull;
import java.io.File;

public abstract interface Encoder<T>
{
  public abstract boolean encode(@NonNull T paramT, @NonNull File paramFile, @NonNull Options paramOptions);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/Encoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */