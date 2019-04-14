package com.bumptech.glide.signature;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

public final class EmptySignature
  implements Key
{
  private static final EmptySignature EMPTY_KEY = new EmptySignature();
  
  @NonNull
  public static EmptySignature obtain()
  {
    return EMPTY_KEY;
  }
  
  public final String toString()
  {
    return "EmptySignature";
  }
  
  public final void updateDiskCacheKey(@NonNull MessageDigest paramMessageDigest) {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/signature/EmptySignature.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */