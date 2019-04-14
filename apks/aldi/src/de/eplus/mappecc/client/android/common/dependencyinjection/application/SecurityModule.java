package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import android.content.Context;
import android.support.annotation.NonNull;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.utils.DeviceUtils;
import de.eplus.mappecc.client.android.common.utils.security.B2PKeyStoreImpl;
import de.eplus.mappecc.client.android.common.utils.security.crypto.AesGcmNoPaddingCrypto;
import de.eplus.mappecc.client.android.common.utils.security.crypto.ICrypto;
import javax.inject.Singleton;

@Module
class SecurityModule
{
  @Provides
  @Singleton
  @NonNull
  B2PKeyStoreImpl provideB2PKeyStoreImpl(@NonNull Context paramContext, @NonNull DeviceUtils paramDeviceUtils)
  {
    return new B2PKeyStoreImpl(paramContext, paramDeviceUtils);
  }
  
  @Provides
  @Singleton
  @NonNull
  ICrypto provideCrypto(@NonNull B2PKeyStoreImpl paramB2PKeyStoreImpl, @NonNull DeviceUtils paramDeviceUtils)
  {
    return new AesGcmNoPaddingCrypto(paramB2PKeyStoreImpl, paramDeviceUtils);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/SecurityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */