package com.google.android.gms.common.internal;

import android.content.Intent;
import android.support.v4.app.Fragment;

final class zad
  extends DialogRedirect
{
  zad(Intent paramIntent, Fragment paramFragment, int paramInt) {}
  
  public final void redirect()
  {
    if (this.zaog != null) {
      this.val$fragment.startActivityForResult(this.zaog, this.val$requestCode);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/zad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */