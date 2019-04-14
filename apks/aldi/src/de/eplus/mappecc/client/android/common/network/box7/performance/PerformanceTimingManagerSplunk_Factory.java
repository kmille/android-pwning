package de.eplus.mappecc.client.android.common.network.box7.performance;

import dagger.internal.Factory;
import de.eplus.mappecc.client.android.common.restclient.api.PerformanceTimingsApi;
import de.eplus.mappecc.client.android.common.utils.NetworkUtils;
import javax.inject.Provider;

public final class PerformanceTimingManagerSplunk_Factory
  implements Factory<PerformanceTimingManagerSplunk>
{
  private final Provider<NetworkUtils> networkUtilsProvider;
  private final Provider<PerformanceTimingsApi> performanceTimingsApiProvider;
  
  public PerformanceTimingManagerSplunk_Factory(Provider<PerformanceTimingsApi> paramProvider, Provider<NetworkUtils> paramProvider1)
  {
    this.performanceTimingsApiProvider = paramProvider;
    this.networkUtilsProvider = paramProvider1;
  }
  
  public static PerformanceTimingManagerSplunk_Factory create(Provider<PerformanceTimingsApi> paramProvider, Provider<NetworkUtils> paramProvider1)
  {
    return new PerformanceTimingManagerSplunk_Factory(paramProvider, paramProvider1);
  }
  
  public static PerformanceTimingManagerSplunk newPerformanceTimingManagerSplunk(PerformanceTimingsApi paramPerformanceTimingsApi, NetworkUtils paramNetworkUtils)
  {
    return new PerformanceTimingManagerSplunk(paramPerformanceTimingsApi, paramNetworkUtils);
  }
  
  public static PerformanceTimingManagerSplunk provideInstance(Provider<PerformanceTimingsApi> paramProvider, Provider<NetworkUtils> paramProvider1)
  {
    return new PerformanceTimingManagerSplunk((PerformanceTimingsApi)paramProvider.get(), (NetworkUtils)paramProvider1.get());
  }
  
  public final PerformanceTimingManagerSplunk get()
  {
    return provideInstance(this.performanceTimingsApiProvider, this.networkUtilsProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/performance/PerformanceTimingManagerSplunk_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */