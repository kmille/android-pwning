package de.eplus.mappecc.client.android.common.component.button;

import dagger.MembersInjector;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import javax.inject.Provider;

public final class CustomButton_MembersInjector
  implements MembersInjector<CustomButton>
{
  private final Provider<Localizer> localizerProvider;
  
  public CustomButton_MembersInjector(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static MembersInjector<CustomButton> create(Provider<Localizer> paramProvider)
  {
    return new CustomButton_MembersInjector(paramProvider);
  }
  
  public static void injectLocalizer(CustomButton paramCustomButton, Localizer paramLocalizer)
  {
    paramCustomButton.localizer = paramLocalizer;
  }
  
  public final void injectMembers(CustomButton paramCustomButton)
  {
    injectLocalizer(paramCustomButton, (Localizer)this.localizerProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/button/CustomButton_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */