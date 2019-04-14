package de.eplus.mappecc.client.android.common.component.consent;

import dagger.MembersInjector;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import javax.inject.Provider;

public final class EditConsentItemModelView_MembersInjector
  implements MembersInjector<EditConsentItemModelView>
{
  private final Provider<Localizer> localizerProvider;
  
  public EditConsentItemModelView_MembersInjector(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static MembersInjector<EditConsentItemModelView> create(Provider<Localizer> paramProvider)
  {
    return new EditConsentItemModelView_MembersInjector(paramProvider);
  }
  
  public static void injectLocalizer(EditConsentItemModelView paramEditConsentItemModelView, Localizer paramLocalizer)
  {
    paramEditConsentItemModelView.localizer = paramLocalizer;
  }
  
  public final void injectMembers(EditConsentItemModelView paramEditConsentItemModelView)
  {
    injectLocalizer(paramEditConsentItemModelView, (Localizer)this.localizerProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/consent/EditConsentItemModelView_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */