package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.PerFragment;
import de.eplus.mappecc.client.android.common.network.box7.customer.Box7CustomerManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.utils.MailVerificationUtil;
import de.eplus.mappecc.client.android.feature.customer.ChangeAccountActivity;
import de.eplus.mappecc.client.android.feature.customer.IChangeAccountView;
import de.eplus.mappecc.client.android.feature.customer.changeaccount.ChangeAccountPresenter;

@Module
public abstract class ChangeAccountActivityModule
{
  @Provides
  static ChangeAccountPresenter provideChangeAccountPresenter(@NonNull IChangeAccountView paramIChangeAccountView, @NonNull Box7CustomerManager paramBox7CustomerManager, @NonNull Localizer paramLocalizer, @NonNull MailVerificationUtil paramMailVerificationUtil)
  {
    return new ChangeAccountPresenter(paramIChangeAccountView, paramBox7CustomerManager, paramLocalizer, paramMailVerificationUtil);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract ChangeAccountActivity directDebitFragmentInjector();
  
  @Binds
  public abstract IChangeAccountView view(ChangeAccountActivity paramChangeAccountActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/ChangeAccountActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */