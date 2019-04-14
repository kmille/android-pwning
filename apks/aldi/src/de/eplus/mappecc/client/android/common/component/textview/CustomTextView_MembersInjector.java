package de.eplus.mappecc.client.android.common.component.textview;

import dagger.MembersInjector;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import javax.inject.Provider;

public final class CustomTextView_MembersInjector
  implements MembersInjector<CustomTextView>
{
  private final Provider<Localizer> localizerProvider;
  
  public CustomTextView_MembersInjector(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static MembersInjector<CustomTextView> create(Provider<Localizer> paramProvider)
  {
    return new CustomTextView_MembersInjector(paramProvider);
  }
  
  public static void injectLocalizer(CustomTextView paramCustomTextView, Localizer paramLocalizer)
  {
    paramCustomTextView.localizer = paramLocalizer;
  }
  
  public final void injectMembers(CustomTextView paramCustomTextView)
  {
    injectLocalizer(paramCustomTextView, (Localizer)this.localizerProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/textview/CustomTextView_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */