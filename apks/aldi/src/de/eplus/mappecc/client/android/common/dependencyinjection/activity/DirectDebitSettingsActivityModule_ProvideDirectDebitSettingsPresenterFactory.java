package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.feature.directdebit.setting.DirectDebitSettingsPresenter;

public final class DirectDebitSettingsActivityModule_ProvideDirectDebitSettingsPresenterFactory
  implements Factory<DirectDebitSettingsPresenter>
{
  private static final DirectDebitSettingsActivityModule_ProvideDirectDebitSettingsPresenterFactory INSTANCE = new DirectDebitSettingsActivityModule_ProvideDirectDebitSettingsPresenterFactory();
  
  public static DirectDebitSettingsActivityModule_ProvideDirectDebitSettingsPresenterFactory create()
  {
    return INSTANCE;
  }
  
  public static DirectDebitSettingsPresenter provideInstance()
  {
    return proxyProvideDirectDebitSettingsPresenter();
  }
  
  public static DirectDebitSettingsPresenter proxyProvideDirectDebitSettingsPresenter()
  {
    return (DirectDebitSettingsPresenter)Preconditions.checkNotNull(DirectDebitSettingsActivityModule.provideDirectDebitSettingsPresenter(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final DirectDebitSettingsPresenter get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/DirectDebitSettingsActivityModule_ProvideDirectDebitSettingsPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */