package de.eplus.mappecc.client.android.common.base;

import android.app.Application;
import android.support.v4.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import de.eplus.mappecc.client.android.common.network.moe.ViewSetterFactory;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import javax.inject.Provider;

public final class B2PFragment_MembersInjector<T extends IPresenter>
  implements MembersInjector<B2PFragment<T>>
{
  private final Provider<Application> applicationProvider;
  private final Provider<MainThreadBus> busProvider;
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<T> presenterProvider;
  private final Provider<ViewSetterFactory> viewSetterFactoryProvider;
  
  public B2PFragment_MembersInjector(Provider<DispatchingAndroidInjector<Fragment>> paramProvider, Provider<Application> paramProvider1, Provider<Localizer> paramProvider2, Provider<ViewSetterFactory> paramProvider3, Provider<MainThreadBus> paramProvider4, Provider<T> paramProvider5)
  {
    this.childFragmentInjectorProvider = paramProvider;
    this.applicationProvider = paramProvider1;
    this.localizerProvider = paramProvider2;
    this.viewSetterFactoryProvider = paramProvider3;
    this.busProvider = paramProvider4;
    this.presenterProvider = paramProvider5;
  }
  
  public static <T extends IPresenter> MembersInjector<B2PFragment<T>> create(Provider<DispatchingAndroidInjector<Fragment>> paramProvider, Provider<Application> paramProvider1, Provider<Localizer> paramProvider2, Provider<ViewSetterFactory> paramProvider3, Provider<MainThreadBus> paramProvider4, Provider<T> paramProvider5)
  {
    return new B2PFragment_MembersInjector(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5);
  }
  
  public static <T extends IPresenter> void injectApplication(B2PFragment<T> paramB2PFragment, Application paramApplication)
  {
    paramB2PFragment.application = paramApplication;
  }
  
  public static <T extends IPresenter> void injectBus(B2PFragment<T> paramB2PFragment, MainThreadBus paramMainThreadBus)
  {
    paramB2PFragment.bus = paramMainThreadBus;
  }
  
  public static <T extends IPresenter> void injectLocalizer(B2PFragment<T> paramB2PFragment, Localizer paramLocalizer)
  {
    paramB2PFragment.localizer = paramLocalizer;
  }
  
  public static <T extends IPresenter> void injectSetPresenter(B2PFragment<T> paramB2PFragment, T paramT)
  {
    paramB2PFragment.setPresenter(paramT);
  }
  
  public static <T extends IPresenter> void injectViewSetterFactory(B2PFragment<T> paramB2PFragment, ViewSetterFactory paramViewSetterFactory)
  {
    paramB2PFragment.viewSetterFactory = paramViewSetterFactory;
  }
  
  public final void injectMembers(B2PFragment<T> paramB2PFragment)
  {
    DaggerFragment_MembersInjector.injectChildFragmentInjector(paramB2PFragment, (DispatchingAndroidInjector)this.childFragmentInjectorProvider.get());
    injectApplication(paramB2PFragment, (Application)this.applicationProvider.get());
    injectLocalizer(paramB2PFragment, (Localizer)this.localizerProvider.get());
    injectViewSetterFactory(paramB2PFragment, (ViewSetterFactory)this.viewSetterFactoryProvider.get());
    injectBus(paramB2PFragment, (MainThreadBus)this.busProvider.get());
    injectSetPresenter(paramB2PFragment, (IPresenter)this.presenterProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/base/B2PFragment_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */