package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.IConsentRepository;
import de.eplus.mappecc.client.android.feature.customer.consents.ConsentsActivity;
import de.eplus.mappecc.client.android.feature.customer.consents.ConsentsPresenter;
import de.eplus.mappecc.client.android.feature.customer.consents.IConsentsView;
import lombok.NonNull;

@Module
public abstract class ConsentsActivityModule
{
  @Provides
  static ConsentsPresenter provideConsentsPresenter(@NonNull IConsentsView paramIConsentsView, @NonNull Localizer paramLocalizer, @NonNull IConsentRepository paramIConsentRepository)
  {
    if (paramIConsentsView != null)
    {
      if (paramLocalizer != null)
      {
        if (paramIConsentRepository != null) {
          return new ConsentsPresenter(paramIConsentsView, paramLocalizer, paramIConsentRepository);
        }
        throw new NullPointerException("consentRepository");
      }
      throw new NullPointerException("localizer");
    }
    throw new NullPointerException("consentsView");
  }
  
  @Binds
  public abstract IConsentsView view(ConsentsActivity paramConsentsActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/ConsentsActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */