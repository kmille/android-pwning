package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionModel;

public abstract interface ISubscriptionModelRepository
{
  public abstract void clearStoragedData();
  
  public abstract void get(@NonNull Box7Callback<SubscriptionModel> paramBox7Callback);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/ISubscriptionModelRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */