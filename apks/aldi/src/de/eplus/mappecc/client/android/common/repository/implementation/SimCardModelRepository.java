package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.repository.NetworkCacheStorageManager;
import de.eplus.mappecc.client.android.common.restclient.api.SimCardsApi;
import de.eplus.mappecc.client.android.common.restclient.model.SimcardModel;
import java.util.List;
import retrofit2.Call;

public class SimCardModelRepository
  implements ISimcardModelRepository
{
  private final Box7Cache box7Cache;
  private final SimCardsApi simCardsApi;
  
  public SimCardModelRepository(@NonNull Box7Cache paramBox7Cache, @NonNull SimCardsApi paramSimCardsApi)
  {
    this.box7Cache = paramBox7Cache;
    this.simCardsApi = paramSimCardsApi;
  }
  
  public void get(@NonNull Box7Callback<List<SimcardModel>> paramBox7Callback)
  {
    new NetworkCacheStorageManager(paramBox7Callback)
    {
      public void createCall(@NonNull Box7Callback<List<SimcardModel>> paramAnonymousBox7Callback)
      {
        SimCardModelRepository.this.simCardsApi.getExtendedSimcardsForSubscriptionWithBrand("alditalk", SimCardModelRepository.this.box7Cache.getSubscriptionId()).enqueue(new Box7CallbackWrapper(paramAnonymousBox7Callback));
      }
    };
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/SimCardModelRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */