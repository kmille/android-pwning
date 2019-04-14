package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.feature.topup.TopUpActivityPresenter;

public final class TopUpActivityModule_ProvideTopUpActivityPresenterFactory
  implements Factory<TopUpActivityPresenter>
{
  private static final TopUpActivityModule_ProvideTopUpActivityPresenterFactory INSTANCE = new TopUpActivityModule_ProvideTopUpActivityPresenterFactory();
  
  public static TopUpActivityModule_ProvideTopUpActivityPresenterFactory create()
  {
    return INSTANCE;
  }
  
  public static TopUpActivityPresenter provideInstance()
  {
    return proxyProvideTopUpActivityPresenter();
  }
  
  public static TopUpActivityPresenter proxyProvideTopUpActivityPresenter()
  {
    return (TopUpActivityPresenter)Preconditions.checkNotNull(TopUpActivityModule.provideTopUpActivityPresenter(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final TopUpActivityPresenter get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/TopUpActivityModule_ProvideTopUpActivityPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */