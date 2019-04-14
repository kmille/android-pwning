package de.eplus.mappecc.client.android.common.base;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;

public abstract interface ReloginActions
{
  public abstract void doActionsForForbidden();
  
  public abstract void doActionsForUnauthorized(@NonNull Box7Callback paramBox7Callback);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/base/ReloginActions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */