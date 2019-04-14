package de.eplus.mappecc.client.android.common.network.piranha;

import android.support.annotation.NonNull;

public abstract interface ILoginManager
{
  public abstract void doAutomaticLogin(@NonNull ILoginCallback paramILoginCallback);
  
  public abstract void doLogin(String paramString1, String paramString2, boolean paramBoolean, @NonNull ILoginCallback paramILoginCallback);
  
  public abstract void doLogout(@NonNull ILogoutCallback paramILogoutCallback);
  
  public abstract void doSMSLogin(@NonNull ILoginCallback paramILoginCallback);
  
  public abstract boolean isCookieLoginPossible();
  
  public abstract void saveUserIccid();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/ILoginManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */