package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.restclient.model.ChangePackModel;
import de.eplus.mappecc.client.android.common.restclient.model.PartnerPackConnector;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionModel;
import de.eplus.mappecc.client.android.common.restclient.model.SubstitutePackModel;

public abstract interface IPacksRepository
{
  public abstract void bookPack(@NonNull SubstitutePackModel paramSubstitutePackModel, @NonNull Box7Callback<SubscriptionModel> paramBox7Callback);
  
  public abstract void cancelPack(@NonNull String paramString, @NonNull Box7Callback<SubscriptionModel> paramBox7Callback);
  
  public abstract void changeBookedPack(@NonNull ChangePackModel paramChangePackModel, @NonNull Box7Callback<SubscriptionModel> paramBox7Callback);
  
  public abstract void createPartnerPackConnector(@NonNull PartnerPackConnector paramPartnerPackConnector, @NonNull Box7Callback<PartnerPackConnector> paramBox7Callback);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/IPacksRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */