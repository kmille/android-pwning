package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.component.dialog.olddialog.DialogUtils;

public final class UtilsModule_ProvideDialogUtilsFactory
  implements Factory<DialogUtils>
{
  private static final UtilsModule_ProvideDialogUtilsFactory INSTANCE = new UtilsModule_ProvideDialogUtilsFactory();
  
  public static UtilsModule_ProvideDialogUtilsFactory create()
  {
    return INSTANCE;
  }
  
  public static DialogUtils provideInstance()
  {
    return proxyProvideDialogUtils();
  }
  
  public static DialogUtils proxyProvideDialogUtils()
  {
    return (DialogUtils)Preconditions.checkNotNull(UtilsModule.provideDialogUtils(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final DialogUtils get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideDialogUtilsFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */