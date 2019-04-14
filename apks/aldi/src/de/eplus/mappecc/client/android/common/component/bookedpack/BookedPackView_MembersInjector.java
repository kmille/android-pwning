package de.eplus.mappecc.client.android.common.component.bookedpack;

import dagger.MembersInjector;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.utils.UiUtils;
import javax.inject.Provider;

public final class BookedPackView_MembersInjector
  implements MembersInjector<BookedPackView>
{
  private final Provider<Localizer> localizerProvider;
  private final Provider<UiUtils> uiUtilsProvider;
  
  public BookedPackView_MembersInjector(Provider<UiUtils> paramProvider, Provider<Localizer> paramProvider1)
  {
    this.uiUtilsProvider = paramProvider;
    this.localizerProvider = paramProvider1;
  }
  
  public static MembersInjector<BookedPackView> create(Provider<UiUtils> paramProvider, Provider<Localizer> paramProvider1)
  {
    return new BookedPackView_MembersInjector(paramProvider, paramProvider1);
  }
  
  public static void injectLocalizer(BookedPackView paramBookedPackView, Localizer paramLocalizer)
  {
    paramBookedPackView.localizer = paramLocalizer;
  }
  
  public static void injectUiUtils(BookedPackView paramBookedPackView, UiUtils paramUiUtils)
  {
    paramBookedPackView.uiUtils = paramUiUtils;
  }
  
  public final void injectMembers(BookedPackView paramBookedPackView)
  {
    injectUiUtils(paramBookedPackView, (UiUtils)this.uiUtilsProvider.get());
    injectLocalizer(paramBookedPackView, (Localizer)this.localizerProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/bookedpack/BookedPackView_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */