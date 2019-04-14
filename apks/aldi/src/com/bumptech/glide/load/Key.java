package com.bumptech.glide.load;

import android.support.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public abstract interface Key
{
  public static final Charset CHARSET = Charset.forName("UTF-8");
  public static final String STRING_CHARSET_NAME = "UTF-8";
  
  public abstract boolean equals(Object paramObject);
  
  public abstract int hashCode();
  
  public abstract void updateDiskCacheKey(@NonNull MessageDigest paramMessageDigest);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/Key.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */