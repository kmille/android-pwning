package de.eplus.mappecc.client.android.common.network.box7.misc;

import dagger.internal.Factory;
import de.eplus.mappecc.client.android.common.restclient.api.MiscApi;
import de.eplus.mappecc.client.android.common.utils.SimUtils;
import javax.inject.Provider;

public final class Box7MiscManager_Factory
  implements Factory<Box7MiscManager>
{
  private final Provider<MiscApi> miscApiProvider;
  private final Provider<SimUtils> simUtilsProvider;
  
  public Box7MiscManager_Factory(Provider<MiscApi> paramProvider, Provider<SimUtils> paramProvider1)
  {
    this.miscApiProvider = paramProvider;
    this.simUtilsProvider = paramProvider1;
  }
  
  public static Box7MiscManager_Factory create(Provider<MiscApi> paramProvider, Provider<SimUtils> paramProvider1)
  {
    return new Box7MiscManager_Factory(paramProvider, paramProvider1);
  }
  
  public static Box7MiscManager newBox7MiscManager(MiscApi paramMiscApi, SimUtils paramSimUtils)
  {
    return new Box7MiscManager(paramMiscApi, paramSimUtils);
  }
  
  public static Box7MiscManager provideInstance(Provider<MiscApi> paramProvider, Provider<SimUtils> paramProvider1)
  {
    return new Box7MiscManager((MiscApi)paramProvider.get(), (SimUtils)paramProvider1.get());
  }
  
  public final Box7MiscManager get()
  {
    return provideInstance(this.miscApiProvider, this.simUtilsProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/misc/Box7MiscManager_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */