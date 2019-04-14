package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationInfo;
import javax.inject.Provider;

public final class MoeModule_ProvideLocalizationInfoFactory
  implements Factory<LocalizationInfo>
{
  private final Provider<Context> contextProvider;
  private final MoeModule module;
  
  public MoeModule_ProvideLocalizationInfoFactory(MoeModule paramMoeModule, Provider<Context> paramProvider)
  {
    this.module = paramMoeModule;
    this.contextProvider = paramProvider;
  }
  
  public static MoeModule_ProvideLocalizationInfoFactory create(MoeModule paramMoeModule, Provider<Context> paramProvider)
  {
    return new MoeModule_ProvideLocalizationInfoFactory(paramMoeModule, paramProvider);
  }
  
  public static LocalizationInfo provideInstance(MoeModule paramMoeModule, Provider<Context> paramProvider)
  {
    return proxyProvideLocalizationInfo(paramMoeModule, (Context)paramProvider.get());
  }
  
  public static LocalizationInfo proxyProvideLocalizationInfo(MoeModule paramMoeModule, Context paramContext)
  {
    return (LocalizationInfo)Preconditions.checkNotNull(paramMoeModule.provideLocalizationInfo(paramContext), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final LocalizationInfo get()
  {
    return provideInstance(this.module, this.contextProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/MoeModule_ProvideLocalizationInfoFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */