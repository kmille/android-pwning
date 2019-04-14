package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.customer.Box7CustomerManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.IThirdPartyServiceSettingsModelRepository;
import de.eplus.mappecc.client.android.feature.customer.thirdparty.BarrierActivity;
import de.eplus.mappecc.client.android.feature.customer.thirdparty.BarrierPresenter;
import de.eplus.mappecc.client.android.feature.customer.thirdparty.IBarrierView;

@Module
public abstract class BarrierActivityModule
{
  @Provides
  static BarrierPresenter provideBarrierPresenter(IBarrierView paramIBarrierView, IB2pView paramIB2pView, Localizer paramLocalizer, Box7CustomerManager paramBox7CustomerManager, IThirdPartyServiceSettingsModelRepository paramIThirdPartyServiceSettingsModelRepository)
  {
    return new BarrierPresenter(paramIBarrierView, paramIB2pView, paramLocalizer, paramBox7CustomerManager, paramIThirdPartyServiceSettingsModelRepository);
  }
  
  @Binds
  public abstract IB2pView b2pView(BarrierActivity paramBarrierActivity);
  
  @Binds
  public abstract IBarrierView view(BarrierActivity paramBarrierActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/BarrierActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */