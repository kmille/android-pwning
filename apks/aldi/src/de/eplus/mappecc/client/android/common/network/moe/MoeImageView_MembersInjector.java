package de.eplus.mappecc.client.android.common.network.moe;

import dagger.MembersInjector;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import javax.inject.Provider;

public final class MoeImageView_MembersInjector
  implements MembersInjector<MoeImageView>
{
  private final Provider<Localizer> localizerProvider;
  
  public MoeImageView_MembersInjector(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static MembersInjector<MoeImageView> create(Provider<Localizer> paramProvider)
  {
    return new MoeImageView_MembersInjector(paramProvider);
  }
  
  public static void injectLocalizer(MoeImageView paramMoeImageView, Localizer paramLocalizer)
  {
    paramMoeImageView.localizer = paramLocalizer;
  }
  
  public final void injectMembers(MoeImageView paramMoeImageView)
  {
    injectLocalizer(paramMoeImageView, (Localizer)this.localizerProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/MoeImageView_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */