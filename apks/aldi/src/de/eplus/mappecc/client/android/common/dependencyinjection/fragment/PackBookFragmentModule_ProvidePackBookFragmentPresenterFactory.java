package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.pack.book.PackBookFragmentPresenter;
import javax.inject.Provider;

public final class PackBookFragmentModule_ProvidePackBookFragmentPresenterFactory
  implements Factory<PackBookFragmentPresenter>
{
  private final Provider<Localizer> localizerProvider;
  
  public PackBookFragmentModule_ProvidePackBookFragmentPresenterFactory(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static PackBookFragmentModule_ProvidePackBookFragmentPresenterFactory create(Provider<Localizer> paramProvider)
  {
    return new PackBookFragmentModule_ProvidePackBookFragmentPresenterFactory(paramProvider);
  }
  
  public static PackBookFragmentPresenter provideInstance(Provider<Localizer> paramProvider)
  {
    return proxyProvidePackBookFragmentPresenter((Localizer)paramProvider.get());
  }
  
  public static PackBookFragmentPresenter proxyProvidePackBookFragmentPresenter(Localizer paramLocalizer)
  {
    return (PackBookFragmentPresenter)Preconditions.checkNotNull(PackBookFragmentModule.providePackBookFragmentPresenter(paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final PackBookFragmentPresenter get()
  {
    return provideInstance(this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/PackBookFragmentModule_ProvidePackBookFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */