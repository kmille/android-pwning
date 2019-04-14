package de.eplus.mappecc.client.android.common.network.moe;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LocalizationInfo_Factory
  implements Factory<LocalizationInfo>
{
  private final Provider<Context> contextProvider;
  
  public LocalizationInfo_Factory(Provider<Context> paramProvider)
  {
    this.contextProvider = paramProvider;
  }
  
  public static LocalizationInfo_Factory create(Provider<Context> paramProvider)
  {
    return new LocalizationInfo_Factory(paramProvider);
  }
  
  public static LocalizationInfo newLocalizationInfo(Context paramContext)
  {
    return new LocalizationInfo(paramContext);
  }
  
  public static LocalizationInfo provideInstance(Provider<Context> paramProvider)
  {
    return new LocalizationInfo((Context)paramProvider.get());
  }
  
  public final LocalizationInfo get()
  {
    return provideInstance(this.contextProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/LocalizationInfo_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */