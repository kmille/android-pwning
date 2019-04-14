package de.eplus.mappecc.client.android.common.component.checkbox;

import dagger.MembersInjector;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import javax.inject.Provider;

public final class CheckBoxForm_MembersInjector
  implements MembersInjector<CheckBoxForm>
{
  private final Provider<Localizer> localizerProvider;
  
  public CheckBoxForm_MembersInjector(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static MembersInjector<CheckBoxForm> create(Provider<Localizer> paramProvider)
  {
    return new CheckBoxForm_MembersInjector(paramProvider);
  }
  
  public static void injectLocalizer(CheckBoxForm paramCheckBoxForm, Localizer paramLocalizer)
  {
    paramCheckBoxForm.localizer = paramLocalizer;
  }
  
  public final void injectMembers(CheckBoxForm paramCheckBoxForm)
  {
    injectLocalizer(paramCheckBoxForm, (Localizer)this.localizerProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/checkbox/CheckBoxForm_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */