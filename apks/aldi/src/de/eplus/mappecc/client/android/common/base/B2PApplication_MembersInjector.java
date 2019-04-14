package de.eplus.mappecc.client.android.common.base;

import android.app.Activity;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import dagger.MembersInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationInfo;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManagerFactory;
import de.eplus.mappecc.client.android.common.network.moe.database.DatabaseAccessor;
import javax.inject.Provider;

public final class B2PApplication_MembersInjector
  implements MembersInjector<B2PApplication>
{
  private final Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider;
  private final Provider<DispatchingAndroidInjector<BroadcastReceiver>> broadcastReceiverInjectorProvider;
  private final Provider<DispatchingAndroidInjector<ContentProvider>> contentProviderInjectorProvider;
  private final Provider<DatabaseAccessor> databaseAccessorProvider;
  private final Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider;
  private final Provider<LocalizationInfo> localizationInfoProvider;
  private final Provider<LocalizationManagerFactory> localizationManagerFactoryProvider;
  private final Provider<DispatchingAndroidInjector<Service>> serviceInjectorProvider;
  
  public B2PApplication_MembersInjector(Provider<DispatchingAndroidInjector<Activity>> paramProvider, Provider<DispatchingAndroidInjector<BroadcastReceiver>> paramProvider1, Provider<DispatchingAndroidInjector<Fragment>> paramProvider2, Provider<DispatchingAndroidInjector<Service>> paramProvider3, Provider<DispatchingAndroidInjector<ContentProvider>> paramProvider4, Provider<LocalizationManagerFactory> paramProvider5, Provider<DatabaseAccessor> paramProvider6, Provider<LocalizationInfo> paramProvider7)
  {
    this.activityInjectorProvider = paramProvider;
    this.broadcastReceiverInjectorProvider = paramProvider1;
    this.fragmentInjectorProvider = paramProvider2;
    this.serviceInjectorProvider = paramProvider3;
    this.contentProviderInjectorProvider = paramProvider4;
    this.localizationManagerFactoryProvider = paramProvider5;
    this.databaseAccessorProvider = paramProvider6;
    this.localizationInfoProvider = paramProvider7;
  }
  
  public static MembersInjector<B2PApplication> create(Provider<DispatchingAndroidInjector<Activity>> paramProvider, Provider<DispatchingAndroidInjector<BroadcastReceiver>> paramProvider1, Provider<DispatchingAndroidInjector<Fragment>> paramProvider2, Provider<DispatchingAndroidInjector<Service>> paramProvider3, Provider<DispatchingAndroidInjector<ContentProvider>> paramProvider4, Provider<LocalizationManagerFactory> paramProvider5, Provider<DatabaseAccessor> paramProvider6, Provider<LocalizationInfo> paramProvider7)
  {
    return new B2PApplication_MembersInjector(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7);
  }
  
  public static void injectDatabaseAccessor(B2PApplication paramB2PApplication, DatabaseAccessor paramDatabaseAccessor)
  {
    paramB2PApplication.databaseAccessor = paramDatabaseAccessor;
  }
  
  public static void injectLocalizationInfo(B2PApplication paramB2PApplication, LocalizationInfo paramLocalizationInfo)
  {
    paramB2PApplication.localizationInfo = paramLocalizationInfo;
  }
  
  public static void injectLocalizationManagerFactory(B2PApplication paramB2PApplication, LocalizationManagerFactory paramLocalizationManagerFactory)
  {
    paramB2PApplication.localizationManagerFactory = paramLocalizationManagerFactory;
  }
  
  public final void injectMembers(B2PApplication paramB2PApplication)
  {
    DaggerApplication_MembersInjector.injectActivityInjector(paramB2PApplication, (DispatchingAndroidInjector)this.activityInjectorProvider.get());
    DaggerApplication_MembersInjector.injectBroadcastReceiverInjector(paramB2PApplication, (DispatchingAndroidInjector)this.broadcastReceiverInjectorProvider.get());
    DaggerApplication_MembersInjector.injectFragmentInjector(paramB2PApplication, (DispatchingAndroidInjector)this.fragmentInjectorProvider.get());
    DaggerApplication_MembersInjector.injectServiceInjector(paramB2PApplication, (DispatchingAndroidInjector)this.serviceInjectorProvider.get());
    DaggerApplication_MembersInjector.injectContentProviderInjector(paramB2PApplication, (DispatchingAndroidInjector)this.contentProviderInjectorProvider.get());
    DaggerApplication_MembersInjector.injectSetInjected(paramB2PApplication);
    injectLocalizationManagerFactory(paramB2PApplication, (LocalizationManagerFactory)this.localizationManagerFactoryProvider.get());
    injectDatabaseAccessor(paramB2PApplication, (DatabaseAccessor)this.databaseAccessorProvider.get());
    injectLocalizationInfo(paramB2PApplication, (LocalizationInfo)this.localizationInfoProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/base/B2PApplication_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */