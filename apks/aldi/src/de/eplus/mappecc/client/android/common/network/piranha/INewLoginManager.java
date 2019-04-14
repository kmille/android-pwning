package de.eplus.mappecc.client.android.common.network.piranha;

import android.support.annotation.NonNull;

public abstract interface INewLoginManager
{
  public abstract void doLogin(@NonNull ILoginCallback paramILoginCallback);
  
  public abstract boolean isLoginPossible();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/INewLoginManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */