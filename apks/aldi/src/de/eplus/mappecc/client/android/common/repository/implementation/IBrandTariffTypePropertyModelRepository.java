package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.restclient.model.BrandTariffTypePropertyModel;

public abstract interface IBrandTariffTypePropertyModelRepository
{
  public abstract void get(@NonNull Box7Callback<BrandTariffTypePropertyModel> paramBox7Callback);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/IBrandTariffTypePropertyModelRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */