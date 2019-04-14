package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.MailVerificationUtil;

public final class UtilsModule_ProvideMailVerificationUtilFactory
  implements Factory<MailVerificationUtil>
{
  private static final UtilsModule_ProvideMailVerificationUtilFactory INSTANCE = new UtilsModule_ProvideMailVerificationUtilFactory();
  
  public static UtilsModule_ProvideMailVerificationUtilFactory create()
  {
    return INSTANCE;
  }
  
  public static MailVerificationUtil provideInstance()
  {
    return proxyProvideMailVerificationUtil();
  }
  
  public static MailVerificationUtil proxyProvideMailVerificationUtil()
  {
    return (MailVerificationUtil)Preconditions.checkNotNull(UtilsModule.provideMailVerificationUtil(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final MailVerificationUtil get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideMailVerificationUtilFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */