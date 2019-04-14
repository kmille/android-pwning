package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzp
{
  private static zzp zzbn;
  @VisibleForTesting
  private Storage zzbo;
  @VisibleForTesting
  private GoogleSignInAccount zzbp;
  @VisibleForTesting
  private GoogleSignInOptions zzbq;
  
  private zzp(Context paramContext)
  {
    this.zzbo = Storage.getInstance(paramContext);
    this.zzbp = this.zzbo.getSavedDefaultGoogleSignInAccount();
    this.zzbq = this.zzbo.getSavedDefaultGoogleSignInOptions();
  }
  
  public static zzp zzd(@NonNull Context paramContext)
  {
    try
    {
      paramContext = zze(paramContext.getApplicationContext());
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  private static zzp zze(Context paramContext)
  {
    try
    {
      if (zzbn == null) {
        zzbn = new zzp(paramContext);
      }
      paramContext = zzbn;
      return paramContext;
    }
    finally {}
  }
  
  public final void clear()
  {
    try
    {
      this.zzbo.clear();
      this.zzbp = null;
      this.zzbq = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzc(GoogleSignInOptions paramGoogleSignInOptions, GoogleSignInAccount paramGoogleSignInAccount)
  {
    try
    {
      this.zzbo.saveDefaultGoogleSignInAccount(paramGoogleSignInAccount, paramGoogleSignInOptions);
      this.zzbp = paramGoogleSignInAccount;
      this.zzbq = paramGoogleSignInOptions;
      return;
    }
    finally
    {
      paramGoogleSignInOptions = finally;
      throw paramGoogleSignInOptions;
    }
  }
  
  public final GoogleSignInAccount zzh()
  {
    try
    {
      GoogleSignInAccount localGoogleSignInAccount = this.zzbp;
      return localGoogleSignInAccount;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final GoogleSignInOptions zzi()
  {
    try
    {
      GoogleSignInOptions localGoogleSignInOptions = this.zzbq;
      return localGoogleSignInOptions;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */