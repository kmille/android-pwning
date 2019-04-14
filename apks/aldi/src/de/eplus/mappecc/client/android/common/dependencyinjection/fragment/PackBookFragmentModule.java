package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.pack.book.IPackBookView;
import de.eplus.mappecc.client.android.feature.pack.book.PackBookFragment;
import de.eplus.mappecc.client.android.feature.pack.book.PackBookFragmentPresenter;

@Module
public abstract class PackBookFragmentModule
{
  @Provides
  static PackBookFragmentPresenter providePackBookFragmentPresenter(Localizer paramLocalizer)
  {
    return new PackBookFragmentPresenter(paramLocalizer);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract PackBookFragment PackBookFragmentInjector();
  
  @Binds
  public abstract IPackBookView view(PackBookFragment paramPackBookFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/PackBookFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */