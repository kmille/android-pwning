package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.restclient.model.ConsentGroupModel;
import de.eplus.mappecc.client.android.common.restclient.model.ConsentModel;
import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.RevokeConsentModel;

public abstract interface IConsentRepository
{
  public abstract void get(@NonNull Box7Callback<ConsentGroupModel> paramBox7Callback);
  
  public abstract void save(@NonNull ConsentModel paramConsentModel, @NonNull Box7Callback<EmptyModel> paramBox7Callback);
  
  public abstract void saveWithdrawal(@NonNull RevokeConsentModel paramRevokeConsentModel, @NonNull Box7Callback<EmptyModel> paramBox7Callback);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/IConsentRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */