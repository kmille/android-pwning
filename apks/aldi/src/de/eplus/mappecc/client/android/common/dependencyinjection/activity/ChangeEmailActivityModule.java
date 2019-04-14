package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.customer.Box7CustomerManager;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import de.eplus.mappecc.client.android.common.utils.MailVerificationUtil;
import de.eplus.mappecc.client.android.feature.customer.ChangeEmailActivity;
import de.eplus.mappecc.client.android.feature.customer.ChangeEmailPresenter;
import de.eplus.mappecc.client.android.feature.customer.IChangeEmailView;

@Module
public abstract class ChangeEmailActivityModule
{
  @Provides
  static ChangeEmailPresenter provideChangeEmailPresenter(@NonNull IChangeEmailView paramIChangeEmailView, @NonNull IB2pView paramIB2pView, @NonNull HotlineUtils paramHotlineUtils, @NonNull Box7Cache paramBox7Cache, @NonNull Box7CustomerManager paramBox7CustomerManager, @NonNull Localizer paramLocalizer, @NonNull Box7SubscriptionManager paramBox7SubscriptionManager, @NonNull MailVerificationUtil paramMailVerificationUtil, @NonNull TrackingHelper paramTrackingHelper, @NonNull ISubscriptionModelRepository paramISubscriptionModelRepository, @NonNull ICustomerModelRepository paramICustomerModelRepository)
  {
    return new ChangeEmailPresenter(paramIChangeEmailView, paramIB2pView, paramHotlineUtils, paramBox7Cache, paramBox7CustomerManager, paramLocalizer, paramMailVerificationUtil, paramTrackingHelper, paramISubscriptionModelRepository, paramICustomerModelRepository);
  }
  
  @Binds
  public abstract IB2pView b2pView(ChangeEmailActivity paramChangeEmailActivity);
  
  @Binds
  public abstract IChangeEmailView view(ChangeEmailActivity paramChangeEmailActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/ChangeEmailActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */