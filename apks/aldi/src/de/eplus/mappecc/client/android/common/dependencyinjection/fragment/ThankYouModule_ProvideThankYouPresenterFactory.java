package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.feature.rating.thankyou.ThankYouPresenter;

public final class ThankYouModule_ProvideThankYouPresenterFactory
  implements Factory<ThankYouPresenter>
{
  private static final ThankYouModule_ProvideThankYouPresenterFactory INSTANCE = new ThankYouModule_ProvideThankYouPresenterFactory();
  
  public static ThankYouModule_ProvideThankYouPresenterFactory create()
  {
    return INSTANCE;
  }
  
  public static ThankYouPresenter provideInstance()
  {
    return proxyProvideThankYouPresenter();
  }
  
  public static ThankYouPresenter proxyProvideThankYouPresenter()
  {
    return (ThankYouPresenter)Preconditions.checkNotNull(ThankYouModule.provideThankYouPresenter(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ThankYouPresenter get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/ThankYouModule_ProvideThankYouPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */