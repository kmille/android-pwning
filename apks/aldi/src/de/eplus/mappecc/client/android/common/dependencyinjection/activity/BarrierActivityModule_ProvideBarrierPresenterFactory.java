package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.customer.Box7CustomerManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.IThirdPartyServiceSettingsModelRepository;
import de.eplus.mappecc.client.android.feature.customer.thirdparty.BarrierPresenter;
import de.eplus.mappecc.client.android.feature.customer.thirdparty.IBarrierView;
import javax.inject.Provider;

public final class BarrierActivityModule_ProvideBarrierPresenterFactory
  implements Factory<BarrierPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<IBarrierView> barrierViewProvider;
  private final Provider<Box7CustomerManager> customerManagerProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<IThirdPartyServiceSettingsModelRepository> thirdPartyServiceSettingsModelRepositoryProvider;
  
  public BarrierActivityModule_ProvideBarrierPresenterFactory(Provider<IBarrierView> paramProvider, Provider<IB2pView> paramProvider1, Provider<Localizer> paramProvider2, Provider<Box7CustomerManager> paramProvider3, Provider<IThirdPartyServiceSettingsModelRepository> paramProvider4)
  {
    this.barrierViewProvider = paramProvider;
    this.b2pViewProvider = paramProvider1;
    this.localizerProvider = paramProvider2;
    this.customerManagerProvider = paramProvider3;
    this.thirdPartyServiceSettingsModelRepositoryProvider = paramProvider4;
  }
  
  public static BarrierActivityModule_ProvideBarrierPresenterFactory create(Provider<IBarrierView> paramProvider, Provider<IB2pView> paramProvider1, Provider<Localizer> paramProvider2, Provider<Box7CustomerManager> paramProvider3, Provider<IThirdPartyServiceSettingsModelRepository> paramProvider4)
  {
    return new BarrierActivityModule_ProvideBarrierPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4);
  }
  
  public static BarrierPresenter provideInstance(Provider<IBarrierView> paramProvider, Provider<IB2pView> paramProvider1, Provider<Localizer> paramProvider2, Provider<Box7CustomerManager> paramProvider3, Provider<IThirdPartyServiceSettingsModelRepository> paramProvider4)
  {
    return proxyProvideBarrierPresenter((IBarrierView)paramProvider.get(), (IB2pView)paramProvider1.get(), (Localizer)paramProvider2.get(), (Box7CustomerManager)paramProvider3.get(), (IThirdPartyServiceSettingsModelRepository)paramProvider4.get());
  }
  
  public static BarrierPresenter proxyProvideBarrierPresenter(IBarrierView paramIBarrierView, IB2pView paramIB2pView, Localizer paramLocalizer, Box7CustomerManager paramBox7CustomerManager, IThirdPartyServiceSettingsModelRepository paramIThirdPartyServiceSettingsModelRepository)
  {
    return (BarrierPresenter)Preconditions.checkNotNull(BarrierActivityModule.provideBarrierPresenter(paramIBarrierView, paramIB2pView, paramLocalizer, paramBox7CustomerManager, paramIThirdPartyServiceSettingsModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final BarrierPresenter get()
  {
    return provideInstance(this.barrierViewProvider, this.b2pViewProvider, this.localizerProvider, this.customerManagerProvider, this.thirdPartyServiceSettingsModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/BarrierActivityModule_ProvideBarrierPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */