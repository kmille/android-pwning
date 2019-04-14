package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionsAuthorized;

public abstract interface ISubscriptionsAuthorizedRepository
{
  public abstract void clearStoragedData();
  
  public abstract void get(@NonNull Box7Callback<SubscriptionsAuthorized> paramBox7Callback);
  
  public abstract void getForceNewForUnverifiedEmail(@NonNull Box7Callback<SubscriptionsAuthorized> paramBox7Callback);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/ISubscriptionsAuthorizedRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */