package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.support.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class AssetFileDescriptorLocalUriFetcher
  extends LocalUriFetcher<AssetFileDescriptor>
{
  public AssetFileDescriptorLocalUriFetcher(ContentResolver paramContentResolver, Uri paramUri)
  {
    super(paramContentResolver, paramUri);
  }
  
  protected final void close(AssetFileDescriptor paramAssetFileDescriptor)
    throws IOException
  {
    paramAssetFileDescriptor.close();
  }
  
  @NonNull
  public final Class<AssetFileDescriptor> getDataClass()
  {
    return AssetFileDescriptor.class;
  }
  
  protected final AssetFileDescriptor loadResource(Uri paramUri, ContentResolver paramContentResolver)
    throws FileNotFoundException
  {
    paramContentResolver = paramContentResolver.openAssetFileDescriptor(paramUri, "r");
    if (paramContentResolver != null) {
      return paramContentResolver;
    }
    throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(paramUri)));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/data/AssetFileDescriptorLocalUriFetcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */