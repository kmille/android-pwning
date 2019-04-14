package com.bumptech.glide.load.data.mediastore;

import java.io.File;

class FileService
{
  public boolean exists(File paramFile)
  {
    return paramFile.exists();
  }
  
  public File get(String paramString)
  {
    return new File(paramString);
  }
  
  public long length(File paramFile)
  {
    return paramFile.length();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/data/mediastore/FileService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */