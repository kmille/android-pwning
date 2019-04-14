package de.eplus.mappecc.client.android.common.component.consent;

import dagger.MembersInjector;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import javax.inject.Provider;

public final class ConsentCheckBoxForm_MembersInjector
  implements MembersInjector<ConsentCheckBoxForm>
{
  private final Provider<Localizer> localizerProvider;
  
  public ConsentCheckBoxForm_MembersInjector(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static MembersInjector<ConsentCheckBoxForm> create(Provider<Localizer> paramProvider)
  {
    return new ConsentCheckBoxForm_MembersInjector(paramProvider);
  }
  
  public static void injectLocalizer(ConsentCheckBoxForm paramConsentCheckBoxForm, Localizer paramLocalizer)
  {
    paramConsentCheckBoxForm.localizer = paramLocalizer;
  }
  
  public final void injectMembers(ConsentCheckBoxForm paramConsentCheckBoxForm)
  {
    injectLocalizer(paramConsentCheckBoxForm, (Localizer)this.localizerProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/consent/ConsentCheckBoxForm_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */