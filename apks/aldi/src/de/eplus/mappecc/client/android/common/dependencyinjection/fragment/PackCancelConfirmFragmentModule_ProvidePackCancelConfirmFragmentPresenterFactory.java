package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.ErrorUtils;
import de.eplus.mappecc.client.android.feature.pack.cancelconfirm.PackCancelConfirmFragmentPresenter;
import javax.inject.Provider;

public final class PackCancelConfirmFragmentModule_ProvidePackCancelConfirmFragmentPresenterFactory
  implements Factory<PackCancelConfirmFragmentPresenter>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<Box7SubscriptionManager> box7SubscriptionManagerProvider;
  private final Provider<ErrorUtils> errorUtilsProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public PackCancelConfirmFragmentModule_ProvidePackCancelConfirmFragmentPresenterFactory(Provider<Box7SubscriptionManager> paramProvider, Provider<TrackingHelper> paramProvider1, Provider<Box7Cache> paramProvider2, Provider<ErrorUtils> paramProvider3)
  {
    this.box7SubscriptionManagerProvider = paramProvider;
    this.trackingHelperProvider = paramProvider1;
    this.box7CacheProvider = paramProvider2;
    this.errorUtilsProvider = paramProvider3;
  }
  
  public static PackCancelConfirmFragmentModule_ProvidePackCancelConfirmFragmentPresenterFactory create(Provider<Box7SubscriptionManager> paramProvider, Provider<TrackingHelper> paramProvider1, Provider<Box7Cache> paramProvider2, Provider<ErrorUtils> paramProvider3)
  {
    return new PackCancelConfirmFragmentModule_ProvidePackCancelConfirmFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3);
  }
  
  public static PackCancelConfirmFragmentPresenter provideInstance(Provider<Box7SubscriptionManager> paramProvider, Provider<TrackingHelper> paramProvider1, Provider<Box7Cache> paramProvider2, Provider<ErrorUtils> paramProvider3)
  {
    return proxyProvidePackCancelConfirmFragmentPresenter((Box7SubscriptionManager)paramProvider.get(), (TrackingHelper)paramProvider1.get(), (Box7Cache)paramProvider2.get(), (ErrorUtils)paramProvider3.get());
  }
  
  public static PackCancelConfirmFragmentPresenter proxyProvidePackCancelConfirmFragmentPresenter(Box7SubscriptionManager paramBox7SubscriptionManager, TrackingHelper paramTrackingHelper, Box7Cache paramBox7Cache, ErrorUtils paramErrorUtils)
  {
    return (PackCancelConfirmFragmentPresenter)Preconditions.checkNotNull(PackCancelConfirmFragmentModule.providePackCancelConfirmFragmentPresenter(paramBox7SubscriptionManager, paramTrackingHelper, paramBox7Cache, paramErrorUtils), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final PackCancelConfirmFragmentPresenter get()
  {
    return provideInstance(this.box7SubscriptionManagerProvider, this.trackingHelperProvider, this.box7CacheProvider, this.errorUtilsProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/PackCancelConfirmFragmentModule_ProvidePackCancelConfirmFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */