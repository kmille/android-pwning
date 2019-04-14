package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.feature.customer.history.ConsumeOverviewFragmentPresenter;

public final class ConsumeOverviewFragmentModule_ProvideConsumeOverviewFragmentPresenterFactory
  implements Factory<ConsumeOverviewFragmentPresenter>
{
  private static final ConsumeOverviewFragmentModule_ProvideConsumeOverviewFragmentPresenterFactory INSTANCE = new ConsumeOverviewFragmentModule_ProvideConsumeOverviewFragmentPresenterFactory();
  
  public static ConsumeOverviewFragmentModule_ProvideConsumeOverviewFragmentPresenterFactory create()
  {
    return INSTANCE;
  }
  
  public static ConsumeOverviewFragmentPresenter provideInstance()
  {
    return proxyProvideConsumeOverviewFragmentPresenter();
  }
  
  public static ConsumeOverviewFragmentPresenter proxyProvideConsumeOverviewFragmentPresenter()
  {
    return (ConsumeOverviewFragmentPresenter)Preconditions.checkNotNull(ConsumeOverviewFragmentModule.provideConsumeOverviewFragmentPresenter(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ConsumeOverviewFragmentPresenter get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/ConsumeOverviewFragmentModule_ProvideConsumeOverviewFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */