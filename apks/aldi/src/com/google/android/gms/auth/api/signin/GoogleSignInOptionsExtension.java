package com.google.android.gms.auth.api.signin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import java.util.List;

public abstract interface GoogleSignInOptionsExtension
{
  @KeepForSdk
  public static final int FITNESS = 3;
  @KeepForSdk
  public static final int GAMES = 1;
  
  @KeepForSdk
  public abstract int getExtensionType();
  
  @Nullable
  @KeepForSdk
  public abstract List<Scope> getImpliedScopes();
  
  public abstract Bundle toBundle();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/GoogleSignInOptionsExtension.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */