package com.google.android.gms.common.api.internal;

import android.support.annotation.BinderThread;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zaj;
import java.lang.ref.WeakReference;

final class zaar
  extends zac
{
  private final WeakReference<zaak> zagj;
  
  zaar(zaak paramzaak)
  {
    this.zagj = new WeakReference(paramzaak);
  }
  
  @BinderThread
  public final void zab(zaj paramzaj)
  {
    zaak localzaak = (zaak)this.zagj.get();
    if (localzaak == null) {
      return;
    }
    zaak.zad(localzaak).zaa(new zaas(this, localzaak, localzaak, paramzaj));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */