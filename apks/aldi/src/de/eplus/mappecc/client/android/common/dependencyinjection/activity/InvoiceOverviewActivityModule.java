package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.repository.implementation.IInvoiceOverviewModelRepository;
import de.eplus.mappecc.client.android.feature.customer.invoice.IInvoiceOverviewView;
import de.eplus.mappecc.client.android.feature.customer.invoice.InvoiceOverviewActivity;
import de.eplus.mappecc.client.android.feature.customer.invoice.InvoiceOverviewPresenter;

@Module
public abstract class InvoiceOverviewActivityModule
{
  @Provides
  static InvoiceOverviewPresenter provideInvoiceOverviewPresenter(@NonNull IInvoiceOverviewView paramIInvoiceOverviewView, @NonNull IInvoiceOverviewModelRepository paramIInvoiceOverviewModelRepository)
  {
    return new InvoiceOverviewPresenter(paramIInvoiceOverviewView, paramIInvoiceOverviewModelRepository);
  }
  
  @Binds
  public abstract IInvoiceOverviewView view(InvoiceOverviewActivity paramInvoiceOverviewActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/InvoiceOverviewActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */