package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.helper.TEFPasswordHelper;

public final class UtilsModule_TefPasswordHelperFactory
  implements Factory<TEFPasswordHelper>
{
  private static final UtilsModule_TefPasswordHelperFactory INSTANCE = new UtilsModule_TefPasswordHelperFactory();
  
  public static UtilsModule_TefPasswordHelperFactory create()
  {
    return INSTANCE;
  }
  
  public static TEFPasswordHelper provideInstance()
  {
    return proxyTefPasswordHelper();
  }
  
  public static TEFPasswordHelper proxyTefPasswordHelper()
  {
    return (TEFPasswordHelper)Preconditions.checkNotNull(UtilsModule.tefPasswordHelper(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final TEFPasswordHelper get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_TefPasswordHelperFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */