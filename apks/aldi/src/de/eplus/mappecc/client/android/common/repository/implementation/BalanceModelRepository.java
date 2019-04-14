package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.repository.NetworkCacheStorageManager;
import de.eplus.mappecc.client.android.common.restclient.api.BalancesApi;
import de.eplus.mappecc.client.android.common.restclient.model.BalanceModel;
import retrofit2.Call;

public class BalanceModelRepository
  implements IBalanceModelRepository
{
  private final BalancesApi balancesApi;
  
  public BalanceModelRepository(@NonNull BalancesApi paramBalancesApi)
  {
    this.balancesApi = paramBalancesApi;
  }
  
  public void get(@NonNull Box7Callback<BalanceModel> paramBox7Callback)
  {
    new NetworkCacheStorageManager(paramBox7Callback)
    {
      public void createCall(@NonNull Box7Callback<BalanceModel> paramAnonymousBox7Callback)
      {
        BalanceModelRepository.this.balancesApi.getBalanceModel("alditalk").enqueue(new Box7CallbackWrapper(paramAnonymousBox7Callback));
      }
    };
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/BalanceModelRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */