package de.eplus.mappecc.client.android.common.network.moe.core;

import de.a.a.a;
import de.eplus.mappecc.client.android.common.network.moe.IMoeUpdateCallback;
import de.eplus.mappecc.client.android.common.network.moe.ImageManager;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManagerFactory;
import de.eplus.mappecc.client.android.common.utils.LogUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.NetworkPreferences;
import javax.inject.Inject;

public class MoeTaskFactory
{
  private final ImageManager imageManager;
  private final LocalizationManagerFactory localizationManagerFactory;
  private final MoeStreamingResourceTaskFactory moeStreamingResourceTaskFactory;
  private final NetworkPreferences networkPreferences;
  
  @Inject
  public MoeTaskFactory(NetworkPreferences paramNetworkPreferences, LocalizationManagerFactory paramLocalizationManagerFactory, MoeStreamingResourceTaskFactory paramMoeStreamingResourceTaskFactory, ImageManager paramImageManager)
  {
    this.networkPreferences = paramNetworkPreferences;
    this.localizationManagerFactory = paramLocalizationManagerFactory;
    this.moeStreamingResourceTaskFactory = paramMoeStreamingResourceTaskFactory;
    this.imageManager = paramImageManager;
  }
  
  public MoeTask create(String paramString, IMoeUpdateCallback paramIMoeUpdateCallback)
  {
    return new MoeTask(paramString, paramIMoeUpdateCallback, this.localizationManagerFactory, this, this.moeStreamingResourceTaskFactory, new a(this.networkPreferences.loadMoeUrl(), "6.2.1", "a", "alditalk", LogUtils.getLogging("MOECalls")), this.networkPreferences, this.imageManager);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/core/MoeTaskFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */