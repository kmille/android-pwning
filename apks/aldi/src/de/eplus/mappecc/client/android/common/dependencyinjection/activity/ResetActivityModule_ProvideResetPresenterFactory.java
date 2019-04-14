package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.feature.resetpassword.IResetActivityView;
import de.eplus.mappecc.client.android.feature.resetpassword.ResetPresenter;
import javax.inject.Provider;

public final class ResetActivityModule_ProvideResetPresenterFactory
  implements Factory<ResetPresenter>
{
  private final Provider<IResetActivityView> activityViewProvider;
  
  public ResetActivityModule_ProvideResetPresenterFactory(Provider<IResetActivityView> paramProvider)
  {
    this.activityViewProvider = paramProvider;
  }
  
  public static ResetActivityModule_ProvideResetPresenterFactory create(Provider<IResetActivityView> paramProvider)
  {
    return new ResetActivityModule_ProvideResetPresenterFactory(paramProvider);
  }
  
  public static ResetPresenter provideInstance(Provider<IResetActivityView> paramProvider)
  {
    return proxyProvideResetPresenter((IResetActivityView)paramProvider.get());
  }
  
  public static ResetPresenter proxyProvideResetPresenter(IResetActivityView paramIResetActivityView)
  {
    return (ResetPresenter)Preconditions.checkNotNull(ResetActivityModule.provideResetPresenter(paramIResetActivityView), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ResetPresenter get()
  {
    return provideInstance(this.activityViewProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/ResetActivityModule_ProvideResetPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */