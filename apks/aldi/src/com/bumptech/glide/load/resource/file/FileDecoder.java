package com.bumptech.glide.load.resource.file;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;

public class FileDecoder
  implements ResourceDecoder<File, File>
{
  public Resource<File> decode(@NonNull File paramFile, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    return new FileResource(paramFile);
  }
  
  public boolean handles(@NonNull File paramFile, @NonNull Options paramOptions)
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/file/FileDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */