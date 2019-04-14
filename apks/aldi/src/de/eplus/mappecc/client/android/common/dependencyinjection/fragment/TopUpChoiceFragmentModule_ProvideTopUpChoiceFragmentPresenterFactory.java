package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.topup.choice.TopUpChoiceFragmentPresenter;
import javax.inject.Provider;

public final class TopUpChoiceFragmentModule_ProvideTopUpChoiceFragmentPresenterFactory
  implements Factory<TopUpChoiceFragmentPresenter>
{
  private final Provider<Localizer> localizerProvider;
  
  public TopUpChoiceFragmentModule_ProvideTopUpChoiceFragmentPresenterFactory(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static TopUpChoiceFragmentModule_ProvideTopUpChoiceFragmentPresenterFactory create(Provider<Localizer> paramProvider)
  {
    return new TopUpChoiceFragmentModule_ProvideTopUpChoiceFragmentPresenterFactory(paramProvider);
  }
  
  public static TopUpChoiceFragmentPresenter provideInstance(Provider<Localizer> paramProvider)
  {
    return proxyProvideTopUpChoiceFragmentPresenter((Localizer)paramProvider.get());
  }
  
  public static TopUpChoiceFragmentPresenter proxyProvideTopUpChoiceFragmentPresenter(Localizer paramLocalizer)
  {
    return (TopUpChoiceFragmentPresenter)Preconditions.checkNotNull(TopUpChoiceFragmentModule.provideTopUpChoiceFragmentPresenter(paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final TopUpChoiceFragmentPresenter get()
  {
    return provideInstance(this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/TopUpChoiceFragmentModule_ProvideTopUpChoiceFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */