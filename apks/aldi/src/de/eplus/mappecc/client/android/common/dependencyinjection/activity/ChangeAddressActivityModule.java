package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.customer.Box7CustomerManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import de.eplus.mappecc.client.android.feature.customer.ChangeAddressActivity;
import de.eplus.mappecc.client.android.feature.customer.ChangeAddressPresenter;
import de.eplus.mappecc.client.android.feature.customer.IChangeAddressView;

@Module
public abstract class ChangeAddressActivityModule
{
  @Provides
  static ChangeAddressPresenter provideChangeAddressPresenter(@NonNull IChangeAddressView paramIChangeAddressView, @NonNull IB2pView paramIB2pView, @NonNull Box7Cache paramBox7Cache, @NonNull Box7CustomerManager paramBox7CustomerManager, @NonNull Localizer paramLocalizer, @NonNull HotlineUtils paramHotlineUtils, @NonNull TrackingHelper paramTrackingHelper, @NonNull ICustomerModelRepository paramICustomerModelRepository, @NonNull ISubscriptionModelRepository paramISubscriptionModelRepository)
  {
    return new ChangeAddressPresenter(paramIChangeAddressView, paramIB2pView, paramBox7Cache, paramBox7CustomerManager, paramLocalizer, paramHotlineUtils, paramICustomerModelRepository, paramISubscriptionModelRepository, paramTrackingHelper);
  }
  
  @Binds
  public abstract IB2pView b2pView(ChangeAddressActivity paramChangeAddressActivity);
  
  @Binds
  public abstract IChangeAddressView view(ChangeAddressActivity paramChangeAddressActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/ChangeAddressActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */