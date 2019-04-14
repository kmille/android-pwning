package de.eplus.mappecc.client.android.common.network.moe.core;

import de.a.a.a;
import de.eplus.mappecc.client.android.common.network.moe.IMoeUpdateCallback;
import de.eplus.mappecc.client.android.common.network.moe.ImageManager;
import de.eplus.mappecc.client.android.common.network.moe.LocalizationManagerFactory;
import de.eplus.mappecc.client.android.common.utils.LogUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.NetworkPreferences;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;

public class MoeStreamingResourceTaskFactory
{
  private final ImageManager imageManager;
  private final LocalizationManagerFactory localizationManagerFactory;
  private final NetworkPreferences networkPreferences;
  
  @Inject
  public MoeStreamingResourceTaskFactory(NetworkPreferences paramNetworkPreferences, LocalizationManagerFactory paramLocalizationManagerFactory, ImageManager paramImageManager)
  {
    this.networkPreferences = paramNetworkPreferences;
    this.localizationManagerFactory = paramLocalizationManagerFactory;
    this.imageManager = paramImageManager;
  }
  
  public MoeStreamingResourceTask create(IMoeUpdateCallback paramIMoeUpdateCallback, AtomicInteger paramAtomicInteger)
  {
    return new MoeStreamingResourceTask(paramIMoeUpdateCallback, paramAtomicInteger, new a(this.networkPreferences.loadMoeUrl(), "6.2.1", "a", "alditalk", LogUtils.getLogging("MOECalls")), this.localizationManagerFactory, this.imageManager);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/core/MoeStreamingResourceTaskFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */