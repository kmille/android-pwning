package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.feature.directdebit.bankaccountchange.DirectDebitActivity;
import de.eplus.mappecc.client.android.feature.directdebit.bankaccountchange.DirectDebitActivityPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.bankaccountchange.IDirectDebitActivityView;

@Module
public abstract class DirectDebitActivityModule
{
  @Provides
  static DirectDebitActivityPresenter provideDirectDebitActivityPresenter(IDirectDebitActivityView paramIDirectDebitActivityView, IB2pView paramIB2pView)
  {
    return new DirectDebitActivityPresenter(paramIDirectDebitActivityView, paramIB2pView);
  }
  
  @Binds
  public abstract IB2pView b2pView(DirectDebitActivity paramDirectDebitActivity);
  
  @Binds
  public abstract IDirectDebitActivityView directDebitActivityView(DirectDebitActivity paramDirectDebitActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/DirectDebitActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */