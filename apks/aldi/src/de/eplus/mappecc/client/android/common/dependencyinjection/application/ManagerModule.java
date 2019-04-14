package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import android.support.annotation.NonNull;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.box7.performance.PerformanceTimingManagerSplunk;
import de.eplus.mappecc.client.android.common.restclient.api.PerformanceTimingsApi;
import de.eplus.mappecc.client.android.common.utils.NetworkUtils;
import javax.inject.Singleton;

@Module
public class ManagerModule
{
  @Provides
  @Singleton
  @NonNull
  IPerformanceTimingManager provideIPerformanceTimingManager(@NonNull PerformanceTimingsApi paramPerformanceTimingsApi, @NonNull NetworkUtils paramNetworkUtils)
  {
    return new PerformanceTimingManagerSplunk(paramPerformanceTimingsApi, paramNetworkUtils);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/ManagerModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */