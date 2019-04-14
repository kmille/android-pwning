package de.eplus.mappecc.client.android.common.component.tabbar;

import dagger.MembersInjector;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import javax.inject.Provider;

public final class TabBarView_MembersInjector
  implements MembersInjector<TabBarView>
{
  private final Provider<Localizer> localizerProvider;
  private final Provider<IPerformanceTimingManager> performanceTimingManagerProvider;
  
  public TabBarView_MembersInjector(Provider<Localizer> paramProvider, Provider<IPerformanceTimingManager> paramProvider1)
  {
    this.localizerProvider = paramProvider;
    this.performanceTimingManagerProvider = paramProvider1;
  }
  
  public static MembersInjector<TabBarView> create(Provider<Localizer> paramProvider, Provider<IPerformanceTimingManager> paramProvider1)
  {
    return new TabBarView_MembersInjector(paramProvider, paramProvider1);
  }
  
  public static void injectLocalizer(TabBarView paramTabBarView, Localizer paramLocalizer)
  {
    paramTabBarView.localizer = paramLocalizer;
  }
  
  public static void injectPerformanceTimingManager(TabBarView paramTabBarView, IPerformanceTimingManager paramIPerformanceTimingManager)
  {
    paramTabBarView.performanceTimingManager = paramIPerformanceTimingManager;
  }
  
  public final void injectMembers(TabBarView paramTabBarView)
  {
    injectLocalizer(paramTabBarView, (Localizer)this.localizerProvider.get());
    injectPerformanceTimingManager(paramTabBarView, (IPerformanceTimingManager)this.performanceTimingManagerProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/tabbar/TabBarView_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */