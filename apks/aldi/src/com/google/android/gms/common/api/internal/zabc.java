package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

final class zabc
  extends zabr
{
  private WeakReference<zaaw> zahl;
  
  zabc(zaaw paramzaaw)
  {
    this.zahl = new WeakReference(paramzaaw);
  }
  
  public final void zas()
  {
    zaaw localzaaw = (zaaw)this.zahl.get();
    if (localzaaw == null) {
      return;
    }
    zaaw.zaa(localzaaw);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zabc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */