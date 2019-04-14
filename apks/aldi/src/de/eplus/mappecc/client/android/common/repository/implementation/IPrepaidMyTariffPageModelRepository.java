package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidMyTariffPageModel;
import org.joda.time.DateTime;

public abstract interface IPrepaidMyTariffPageModelRepository
{
  public abstract void get(@NonNull Box7Callback<PrepaidMyTariffPageModel> paramBox7Callback);
  
  public abstract DateTime getRequestTimeStamp();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/IPrepaidMyTariffPageModelRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */