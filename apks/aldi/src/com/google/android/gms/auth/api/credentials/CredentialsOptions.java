package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;
import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder;

public final class CredentialsOptions
  extends Auth.AuthCredentialsOptions
{
  public static final CredentialsOptions DEFAULT = (CredentialsOptions)new Builder().zzc();
  
  private CredentialsOptions(Builder paramBuilder)
  {
    super(paramBuilder);
  }
  
  public static final class Builder
    extends Auth.AuthCredentialsOptions.Builder
  {
    public final CredentialsOptions build()
    {
      return new CredentialsOptions(this, null);
    }
    
    public final Builder forceEnableSaveDialog()
    {
      this.zzn = Boolean.TRUE;
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/credentials/CredentialsOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */