package de.eplus.mappecc.client.android.common.base;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatDelegate;
import c.a.a;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent.Builder;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.DaggerAppComponent;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationInfo;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManagerFactory;
import de.eplus.mappecc.client.android.common.network.moe.database.DatabaseAccessor;
import de.eplus.mappecc.client.android.common.utils.DebugLogingLinde;
import de.eplus.mappecc.client.android.common.utils.migration.ResetApplicationUtil;
import javax.inject.Inject;

public class B2PApplication
  extends DaggerApplication
{
  public static B2PActivity activity;
  private static Context applicationContext;
  public static AppComponent component;
  @Inject
  DatabaseAccessor databaseAccessor;
  @Inject
  LocalizationInfo localizationInfo;
  @Inject
  LocalizationManagerFactory localizationManagerFactory;
  
  public static Context getApplicationContextGlobal()
  {
    return applicationContext;
  }
  
  public AndroidInjector<? extends DaggerApplication> applicationInjector()
  {
    AppComponent localAppComponent = DaggerAppComponent.builder().application(this).build();
    component = localAppComponent;
    localAppComponent.inject(this);
    return component;
  }
  
  protected void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
    MultiDex.install(this);
  }
  
  public void onCreate()
  {
    super.onCreate();
    applicationContext = getApplicationContext();
    a.a(new DebugLogingLinde());
    AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    new ResetApplicationUtil().resetIfNecessary(getApplicationContext());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/base/B2PApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */