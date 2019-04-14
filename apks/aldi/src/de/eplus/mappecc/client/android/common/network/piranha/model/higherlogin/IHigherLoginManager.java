package de.eplus.mappecc.client.android.common.network.piranha.model.higherlogin;

import android.support.annotation.NonNull;

public abstract interface IHigherLoginManager
{
  public abstract void doLogin(@NonNull String paramString, @NonNull HigherLoginCallback paramHigherLoginCallback);
  
  public abstract boolean isHigherLoginValid();
  
  public abstract void resetHigherLoginState();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/model/higherlogin/IHigherLoginManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */