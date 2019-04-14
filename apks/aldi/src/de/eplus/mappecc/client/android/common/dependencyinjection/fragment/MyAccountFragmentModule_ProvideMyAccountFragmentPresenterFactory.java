package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.feature.customer.MyAccountFragmentPresenter;

public final class MyAccountFragmentModule_ProvideMyAccountFragmentPresenterFactory
  implements Factory<MyAccountFragmentPresenter>
{
  private static final MyAccountFragmentModule_ProvideMyAccountFragmentPresenterFactory INSTANCE = new MyAccountFragmentModule_ProvideMyAccountFragmentPresenterFactory();
  
  public static MyAccountFragmentModule_ProvideMyAccountFragmentPresenterFactory create()
  {
    return INSTANCE;
  }
  
  public static MyAccountFragmentPresenter provideInstance()
  {
    return proxyProvideMyAccountFragmentPresenter();
  }
  
  public static MyAccountFragmentPresenter proxyProvideMyAccountFragmentPresenter()
  {
    return (MyAccountFragmentPresenter)Preconditions.checkNotNull(MyAccountFragmentModule.provideMyAccountFragmentPresenter(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final MyAccountFragmentPresenter get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/MyAccountFragmentModule_ProvideMyAccountFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */