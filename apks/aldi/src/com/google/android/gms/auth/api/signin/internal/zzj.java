package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Status;

final class zzj
  extends zzc
{
  zzj(zzi paramzzi) {}
  
  public final void zzc(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus)
    throws RemoteException
  {
    if (paramGoogleSignInAccount != null) {
      zzp.zzd(this.zzbk.val$context).zzc(this.zzbk.zzbj, paramGoogleSignInAccount);
    }
    this.zzbk.setResult(new GoogleSignInResult(paramGoogleSignInAccount, paramStatus));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */