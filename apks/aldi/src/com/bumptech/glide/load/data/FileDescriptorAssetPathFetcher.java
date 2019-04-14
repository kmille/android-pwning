package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import java.io.IOException;

public class FileDescriptorAssetPathFetcher
  extends AssetPathFetcher<ParcelFileDescriptor>
{
  public FileDescriptorAssetPathFetcher(AssetManager paramAssetManager, String paramString)
  {
    super(paramAssetManager, paramString);
  }
  
  protected void close(ParcelFileDescriptor paramParcelFileDescriptor)
    throws IOException
  {
    paramParcelFileDescriptor.close();
  }
  
  @NonNull
  public Class<ParcelFileDescriptor> getDataClass()
  {
    return ParcelFileDescriptor.class;
  }
  
  protected ParcelFileDescriptor loadResource(AssetManager paramAssetManager, String paramString)
    throws IOException
  {
    return paramAssetManager.openFd(paramString).getParcelFileDescriptor();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/data/FileDescriptorAssetPathFetcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */