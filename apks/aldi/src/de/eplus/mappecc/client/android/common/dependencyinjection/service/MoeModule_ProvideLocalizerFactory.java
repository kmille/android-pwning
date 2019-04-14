package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationInfo;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.network.moe.database.DatabaseAccessor;
import javax.inject.Provider;

public final class MoeModule_ProvideLocalizerFactory
  implements Factory<Localizer>
{
  private final Provider<Context> contextProvider;
  private final Provider<DatabaseAccessor> databaseAccessorProvider;
  private final Provider<LocalizationInfo> localizationInfoProvider;
  private final MoeModule module;
  
  public MoeModule_ProvideLocalizerFactory(MoeModule paramMoeModule, Provider<Context> paramProvider, Provider<DatabaseAccessor> paramProvider1, Provider<LocalizationInfo> paramProvider2)
  {
    this.module = paramMoeModule;
    this.contextProvider = paramProvider;
    this.databaseAccessorProvider = paramProvider1;
    this.localizationInfoProvider = paramProvider2;
  }
  
  public static MoeModule_ProvideLocalizerFactory create(MoeModule paramMoeModule, Provider<Context> paramProvider, Provider<DatabaseAccessor> paramProvider1, Provider<LocalizationInfo> paramProvider2)
  {
    return new MoeModule_ProvideLocalizerFactory(paramMoeModule, paramProvider, paramProvider1, paramProvider2);
  }
  
  public static Localizer provideInstance(MoeModule paramMoeModule, Provider<Context> paramProvider, Provider<DatabaseAccessor> paramProvider1, Provider<LocalizationInfo> paramProvider2)
  {
    return proxyProvideLocalizer(paramMoeModule, (Context)paramProvider.get(), (DatabaseAccessor)paramProvider1.get(), (LocalizationInfo)paramProvider2.get());
  }
  
  public static Localizer proxyProvideLocalizer(MoeModule paramMoeModule, Context paramContext, DatabaseAccessor paramDatabaseAccessor, LocalizationInfo paramLocalizationInfo)
  {
    return (Localizer)Preconditions.checkNotNull(paramMoeModule.provideLocalizer(paramContext, paramDatabaseAccessor, paramLocalizationInfo), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final Localizer get()
  {
    return provideInstance(this.module, this.contextProvider, this.databaseAccessorProvider, this.localizationInfoProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/MoeModule_ProvideLocalizerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */