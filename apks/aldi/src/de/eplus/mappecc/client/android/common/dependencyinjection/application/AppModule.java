package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import android.app.Application;
import android.content.Context;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class AppModule
{
  @Binds
  abstract Context bindContext(Application paramApplication);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/AppModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */