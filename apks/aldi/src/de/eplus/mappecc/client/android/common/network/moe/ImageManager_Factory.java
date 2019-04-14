package de.eplus.mappecc.client.android.common.network.moe;

import dagger.internal.Factory;
import de.eplus.mappecc.client.android.common.utils.UiUtils;
import javax.inject.Provider;

public final class ImageManager_Factory
  implements Factory<ImageManager>
{
  private final Provider<UiUtils> uiUtilsProvider;
  
  public ImageManager_Factory(Provider<UiUtils> paramProvider)
  {
    this.uiUtilsProvider = paramProvider;
  }
  
  public static ImageManager_Factory create(Provider<UiUtils> paramProvider)
  {
    return new ImageManager_Factory(paramProvider);
  }
  
  public static ImageManager newImageManager(UiUtils paramUiUtils)
  {
    return new ImageManager(paramUiUtils);
  }
  
  public static ImageManager provideInstance(Provider<UiUtils> paramProvider)
  {
    return new ImageManager((UiUtils)paramProvider.get());
  }
  
  public final ImageManager get()
  {
    return provideInstance(this.uiUtilsProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/ImageManager_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */