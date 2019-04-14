package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import java.io.File;

final class HardwareConfigState
{
  private static final File FD_SIZE_LIST = new File("/proc/self/fd");
  private static final int MAXIMUM_FDS_FOR_HARDWARE_CONFIGS = 700;
  private static final int MINIMUM_DECODES_BETWEEN_FD_CHECKS = 50;
  private static final int MIN_HARDWARE_DIMENSION = 128;
  private static volatile HardwareConfigState instance;
  private volatile int decodesSinceLastFdCheck;
  private volatile boolean isHardwareConfigAllowed = true;
  
  static HardwareConfigState getInstance()
  {
    if (instance == null) {
      try
      {
        if (instance == null) {
          instance = new HardwareConfigState();
        }
      }
      finally {}
    }
    return instance;
  }
  
  private boolean isFdSizeBelowHardwareLimit()
  {
    try
    {
      int i = this.decodesSinceLastFdCheck + 1;
      this.decodesSinceLastFdCheck = i;
      if (i >= 50)
      {
        bool = false;
        this.decodesSinceLastFdCheck = 0;
        i = FD_SIZE_LIST.list().length;
        if (i < 700) {
          bool = true;
        }
        this.isHardwareConfigAllowed = bool;
        if ((!this.isHardwareConfigAllowed) && (Log.isLoggable("Downsampler", 5)))
        {
          StringBuilder localStringBuilder = new StringBuilder("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
          localStringBuilder.append(i);
          localStringBuilder.append(", limit 700");
        }
      }
      boolean bool = this.isHardwareConfigAllowed;
      return bool;
    }
    finally {}
  }
  
  @TargetApi(26)
  final boolean setHardwareConfigIfAllowed(int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, DecodeFormat paramDecodeFormat, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (Build.VERSION.SDK_INT >= 26))
    {
      if (paramBoolean2) {
        return false;
      }
      if ((paramInt1 >= 128) && (paramInt2 >= 128) && (isFdSizeBelowHardwareLimit())) {
        paramBoolean1 = true;
      } else {
        paramBoolean1 = false;
      }
      if (paramBoolean1)
      {
        paramOptions.inPreferredConfig = Bitmap.Config.HARDWARE;
        paramOptions.inMutable = false;
      }
      return paramBoolean1;
    }
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/HardwareConfigState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */