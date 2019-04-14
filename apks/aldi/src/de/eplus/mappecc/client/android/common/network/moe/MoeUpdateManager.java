package de.eplus.mappecc.client.android.common.network.moe;

import android.os.AsyncTask.Status;
import c.a.a;
import de.eplus.mappecc.client.android.common.network.moe.core.MoeTask;
import de.eplus.mappecc.client.android.common.network.moe.core.MoeTaskFactory;
import de.eplus.mappecc.client.android.common.utils.DeviceUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.NetworkPreferences;
import javax.inject.Inject;

public class MoeUpdateManager
  implements IMoeUpdateManager
{
  private final DeviceUtils deviceUtils;
  private final LocalizationManagerFactory localizationManagerFactory;
  private MoeTask moeTask;
  private final MoeTaskFactory moeTaskFactory;
  private final NetworkPreferences networkPreferences;
  
  @Inject
  public MoeUpdateManager(LocalizationManagerFactory paramLocalizationManagerFactory, DeviceUtils paramDeviceUtils, NetworkPreferences paramNetworkPreferences, MoeTaskFactory paramMoeTaskFactory)
  {
    this.localizationManagerFactory = paramLocalizationManagerFactory;
    this.deviceUtils = paramDeviceUtils;
    this.networkPreferences = paramNetworkPreferences;
    this.moeTaskFactory = paramMoeTaskFactory;
  }
  
  public void updateMoe(IMoeUpdateCallback paramIMoeUpdateCallback)
  {
    if ((this.moeTask == null) || (this.moeTask.getStatus() != AsyncTask.Status.RUNNING))
    {
      a.b("updateMoe(): starting Moe Update...", new Object[0]);
      Object localObject = this.deviceUtils.getLanguage();
      localObject = this.localizationManagerFactory.create((String)localObject);
      this.moeTask = this.moeTaskFactory.create(((LocalizationManager)localObject).getLanguageCode(), paramIMoeUpdateCallback);
      this.moeTask.execute(new String[] { String.valueOf(((LocalizationManager)localObject).getVersion()) });
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/moe/MoeUpdateManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */