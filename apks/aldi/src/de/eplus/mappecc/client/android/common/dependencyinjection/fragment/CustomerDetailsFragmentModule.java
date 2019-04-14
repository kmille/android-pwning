package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.customer.Box7CustomerManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISimcardModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.feature.customer.CustomerDetailsFragment;
import de.eplus.mappecc.client.android.feature.customer.CustomerDetailsFragmentPresenter;
import de.eplus.mappecc.client.android.feature.customer.ICustomerDetailsView;

@Module
public abstract class CustomerDetailsFragmentModule
{
  @Provides
  static CustomerDetailsFragmentPresenter provideCustomerDetailsFragmentPresenter(@NonNull Box7CustomerManager paramBox7CustomerManager, @NonNull Localizer paramLocalizer, @NonNull IB2pView paramIB2pView, @NonNull ISubscriptionModelRepository paramISubscriptionModelRepository, @NonNull ICustomerModelRepository paramICustomerModelRepository, @NonNull ISimcardModelRepository paramISimcardModelRepository)
  {
    return new CustomerDetailsFragmentPresenter(paramBox7CustomerManager, paramLocalizer, paramIB2pView, paramISubscriptionModelRepository, paramICustomerModelRepository, paramISimcardModelRepository);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract CustomerDetailsFragment customerDetailsFragmentInjector();
  
  @Binds
  public abstract ICustomerDetailsView view(CustomerDetailsFragment paramCustomerDetailsFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/CustomerDetailsFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */