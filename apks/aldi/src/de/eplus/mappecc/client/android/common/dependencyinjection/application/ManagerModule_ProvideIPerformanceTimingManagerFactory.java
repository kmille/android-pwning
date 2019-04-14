package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.restclient.api.PerformanceTimingsApi;
import de.eplus.mappecc.client.android.common.utils.NetworkUtils;
import javax.inject.Provider;

public final class ManagerModule_ProvideIPerformanceTimingManagerFactory
  implements Factory<IPerformanceTimingManager>
{
  private final ManagerModule module;
  private final Provider<NetworkUtils> networkUtilsProvider;
  private final Provider<PerformanceTimingsApi> performanceTimingsApiProvider;
  
  public ManagerModule_ProvideIPerformanceTimingManagerFactory(ManagerModule paramManagerModule, Provider<PerformanceTimingsApi> paramProvider, Provider<NetworkUtils> paramProvider1)
  {
    this.module = paramManagerModule;
    this.performanceTimingsApiProvider = paramProvider;
    this.networkUtilsProvider = paramProvider1;
  }
  
  public static ManagerModule_ProvideIPerformanceTimingManagerFactory create(ManagerModule paramManagerModule, Provider<PerformanceTimingsApi> paramProvider, Provider<NetworkUtils> paramProvider1)
  {
    return new ManagerModule_ProvideIPerformanceTimingManagerFactory(paramManagerModule, paramProvider, paramProvider1);
  }
  
  public static IPerformanceTimingManager provideInstance(ManagerModule paramManagerModule, Provider<PerformanceTimingsApi> paramProvider, Provider<NetworkUtils> paramProvider1)
  {
    return proxyProvideIPerformanceTimingManager(paramManagerModule, (PerformanceTimingsApi)paramProvider.get(), (NetworkUtils)paramProvider1.get());
  }
  
  public static IPerformanceTimingManager proxyProvideIPerformanceTimingManager(ManagerModule paramManagerModule, PerformanceTimingsApi paramPerformanceTimingsApi, NetworkUtils paramNetworkUtils)
  {
    return (IPerformanceTimingManager)Preconditions.checkNotNull(paramManagerModule.provideIPerformanceTimingManager(paramPerformanceTimingsApi, paramNetworkUtils), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final IPerformanceTimingManager get()
  {
    return provideInstance(this.module, this.performanceTimingsApiProvider, this.networkUtilsProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ManagerModule_ProvideIPerformanceTimingManagerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */