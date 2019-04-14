package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import android.support.annotation.NonNull;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.database.B2PDatabase;
import de.eplus.mappecc.client.android.common.repository.implementation.BalanceModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.BrandTariffTypePropertyModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ConsentRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.CustomerModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.IBalanceModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.IBrandTariffTypePropertyModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.IConsentRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.IInvoiceOverviewModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ILoginAccountModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.IPacksRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.IPrepaidMyTariffPageModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.IPrepaidTopupConfigurationModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISimcardModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionsAuthorizedRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.IThirdPartyServiceSettingsModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.InvoicesOverviewModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.LoginAccountModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.PacksRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.PrepaidMyTariffPageModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.PrepaidTopupConfigurationModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.SimCardModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.SubscriptionModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.SubscriptionsAuthorizedRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ThirdPartyServiceSettingsModelRepository;
import de.eplus.mappecc.client.android.common.restclient.api.BalancesApi;
import de.eplus.mappecc.client.android.common.restclient.api.BillingsApi;
import de.eplus.mappecc.client.android.common.restclient.api.ConsentsApi;
import de.eplus.mappecc.client.android.common.restclient.api.CustomersApi;
import de.eplus.mappecc.client.android.common.restclient.api.LoginAccountsApi;
import de.eplus.mappecc.client.android.common.restclient.api.MiscApi;
import de.eplus.mappecc.client.android.common.restclient.api.PacksApi;
import de.eplus.mappecc.client.android.common.restclient.api.SimCardsApi;
import de.eplus.mappecc.client.android.common.restclient.api.SubscriptionsApi;
import de.eplus.mappecc.client.android.common.restclient.api.ThirdPartyApi;
import de.eplus.mappecc.client.android.common.restclient.api.TopupsApi;
import de.eplus.mappecc.client.android.common.restclient.api.UsagesApi;
import de.eplus.mappecc.client.android.common.utils.preferences.ModelPreferences;
import javax.inject.Singleton;

@Module
public class RepositoryModule
{
  @Provides
  @Singleton
  @NonNull
  IBalanceModelRepository provideIBalanceModelRepository(@NonNull BalancesApi paramBalancesApi)
  {
    return new BalanceModelRepository(paramBalancesApi);
  }
  
  @Provides
  @Singleton
  @NonNull
  IBrandTariffTypePropertyModelRepository provideIBrandTariffTypePropertyModelRepository(@NonNull Box7Cache paramBox7Cache, @NonNull MiscApi paramMiscApi)
  {
    return new BrandTariffTypePropertyModelRepository(paramBox7Cache, paramMiscApi);
  }
  
  @Provides
  @Singleton
  @NonNull
  IConsentRepository provideIConsentRepository(@NonNull ConsentsApi paramConsentsApi, @NonNull Box7Cache paramBox7Cache)
  {
    return new ConsentRepository(paramConsentsApi, paramBox7Cache);
  }
  
  @Provides
  @Singleton
  @NonNull
  ICustomerModelRepository provideICustomerModelRepository(@NonNull Box7Cache paramBox7Cache, @NonNull CustomersApi paramCustomersApi)
  {
    return new CustomerModelRepository(paramBox7Cache, paramCustomersApi);
  }
  
  @Provides
  @Singleton
  @NonNull
  IInvoiceOverviewModelRepository provideIInvoiceOverviewModelRepository(@NonNull BillingsApi paramBillingsApi, @NonNull Box7Cache paramBox7Cache)
  {
    return new InvoicesOverviewModelRepository(paramBillingsApi, paramBox7Cache);
  }
  
  @Provides
  @Singleton
  @NonNull
  ILoginAccountModelRepository provideILoginAccountModelRepository(@NonNull LoginAccountsApi paramLoginAccountsApi)
  {
    return new LoginAccountModelRepository(paramLoginAccountsApi);
  }
  
  @Provides
  @Singleton
  @NonNull
  IPacksRepository provideIPacksRepository(@NonNull PacksApi paramPacksApi, @NonNull Box7Cache paramBox7Cache)
  {
    return new PacksRepository(paramPacksApi, paramBox7Cache);
  }
  
  @Provides
  @Singleton
  @NonNull
  IPrepaidMyTariffPageModelRepository provideIPrepaidMyTariffPageModelRepository(@NonNull UsagesApi paramUsagesApi, @NonNull ModelPreferences paramModelPreferences, @NonNull Localizer paramLocalizer)
  {
    return new PrepaidMyTariffPageModelRepository(paramUsagesApi, paramModelPreferences, paramLocalizer);
  }
  
  @Provides
  @Singleton
  @NonNull
  IPrepaidTopupConfigurationModelRepository provideIPrepaidTopupConfigurationModelRepository(@NonNull Box7Cache paramBox7Cache, @NonNull TopupsApi paramTopupsApi)
  {
    return new PrepaidTopupConfigurationModelRepository(paramBox7Cache, paramTopupsApi);
  }
  
  @Provides
  @Singleton
  @NonNull
  ISimcardModelRepository provideISimCardModelRepository(@NonNull Box7Cache paramBox7Cache, @NonNull SimCardsApi paramSimCardsApi)
  {
    return new SimCardModelRepository(paramBox7Cache, paramSimCardsApi);
  }
  
  @Provides
  @Singleton
  @NonNull
  ISubscriptionModelRepository provideISubscriptionModelRepository(@NonNull Box7Cache paramBox7Cache, @NonNull SubscriptionsApi paramSubscriptionsApi)
  {
    return new SubscriptionModelRepository(paramBox7Cache, paramSubscriptionsApi);
  }
  
  @Provides
  @Singleton
  @NonNull
  ISubscriptionsAuthorizedRepository provideISubscriptionsAuthorizedRepository(@NonNull Box7Cache paramBox7Cache, @NonNull SubscriptionsApi paramSubscriptionsApi, @NonNull B2PDatabase paramB2PDatabase)
  {
    return new SubscriptionsAuthorizedRepository(paramBox7Cache, paramSubscriptionsApi, paramB2PDatabase);
  }
  
  @Provides
  @Singleton
  @NonNull
  IThirdPartyServiceSettingsModelRepository provideIThirdPartyServiceSettingsModelRepository(@NonNull Box7Cache paramBox7Cache, @NonNull ThirdPartyApi paramThirdPartyApi)
  {
    return new ThirdPartyServiceSettingsModelRepository(paramBox7Cache, paramThirdPartyApi);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/RepositoryModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */