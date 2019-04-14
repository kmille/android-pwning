package de.eplus.mappecc.client.android.common.network.moe;

import dagger.internal.Factory;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import javax.inject.Provider;

public final class ViewSetterFactory_Factory
  implements Factory<ViewSetterFactory>
{
  private final Provider<Localizer> localizerProvider;
  
  public ViewSetterFactory_Factory(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static ViewSetterFactory_Factory create(Provider<Localizer> paramProvider)
  {
    return new ViewSetterFactory_Factory(paramProvider);
  }
  
  public static ViewSetterFactory newViewSetterFactory(Localizer paramLocalizer)
  {
    return new ViewSetterFactory(paramLocalizer);
  }
  
  public static ViewSetterFactory provideInstance(Provider<Localizer> paramProvider)
  {
    return new ViewSetterFactory((Localizer)paramProvider.get());
  }
  
  public final ViewSetterFactory get()
  {
    return provideInstance(this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/ViewSetterFactory_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */