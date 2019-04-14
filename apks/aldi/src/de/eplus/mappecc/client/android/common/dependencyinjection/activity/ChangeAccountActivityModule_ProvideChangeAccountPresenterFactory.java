package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.customer.Box7CustomerManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.utils.MailVerificationUtil;
import de.eplus.mappecc.client.android.feature.customer.IChangeAccountView;
import de.eplus.mappecc.client.android.feature.customer.changeaccount.ChangeAccountPresenter;
import javax.inject.Provider;

public final class ChangeAccountActivityModule_ProvideChangeAccountPresenterFactory
  implements Factory<ChangeAccountPresenter>
{
  private final Provider<Box7CustomerManager> box7CustomerManagerProvider;
  private final Provider<IChangeAccountView> changeAccountViewProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<MailVerificationUtil> mailVerificationUtilProvider;
  
  public ChangeAccountActivityModule_ProvideChangeAccountPresenterFactory(Provider<IChangeAccountView> paramProvider, Provider<Box7CustomerManager> paramProvider1, Provider<Localizer> paramProvider2, Provider<MailVerificationUtil> paramProvider3)
  {
    this.changeAccountViewProvider = paramProvider;
    this.box7CustomerManagerProvider = paramProvider1;
    this.localizerProvider = paramProvider2;
    this.mailVerificationUtilProvider = paramProvider3;
  }
  
  public static ChangeAccountActivityModule_ProvideChangeAccountPresenterFactory create(Provider<IChangeAccountView> paramProvider, Provider<Box7CustomerManager> paramProvider1, Provider<Localizer> paramProvider2, Provider<MailVerificationUtil> paramProvider3)
  {
    return new ChangeAccountActivityModule_ProvideChangeAccountPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3);
  }
  
  public static ChangeAccountPresenter provideInstance(Provider<IChangeAccountView> paramProvider, Provider<Box7CustomerManager> paramProvider1, Provider<Localizer> paramProvider2, Provider<MailVerificationUtil> paramProvider3)
  {
    return proxyProvideChangeAccountPresenter((IChangeAccountView)paramProvider.get(), (Box7CustomerManager)paramProvider1.get(), (Localizer)paramProvider2.get(), (MailVerificationUtil)paramProvider3.get());
  }
  
  public static ChangeAccountPresenter proxyProvideChangeAccountPresenter(IChangeAccountView paramIChangeAccountView, Box7CustomerManager paramBox7CustomerManager, Localizer paramLocalizer, MailVerificationUtil paramMailVerificationUtil)
  {
    return (ChangeAccountPresenter)Preconditions.checkNotNull(ChangeAccountActivityModule.provideChangeAccountPresenter(paramIChangeAccountView, paramBox7CustomerManager, paramLocalizer, paramMailVerificationUtil), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ChangeAccountPresenter get()
  {
    return provideInstance(this.changeAccountViewProvider, this.box7CustomerManagerProvider, this.localizerProvider, this.mailVerificationUtilProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/ChangeAccountActivityModule_ProvideChangeAccountPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */