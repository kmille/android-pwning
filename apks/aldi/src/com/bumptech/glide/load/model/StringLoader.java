package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bumptech.glide.load.Options;
import java.io.File;
import java.io.InputStream;

public class StringLoader<Data>
  implements ModelLoader<String, Data>
{
  private final ModelLoader<Uri, Data> uriLoader;
  
  public StringLoader(ModelLoader<Uri, Data> paramModelLoader)
  {
    this.uriLoader = paramModelLoader;
  }
  
  @Nullable
  private static Uri parseUri(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    if (paramString.charAt(0) == '/') {}
    Uri localUri;
    do
    {
      return toFileUri(paramString);
      localUri = Uri.parse(paramString);
    } while (localUri.getScheme() == null);
    return localUri;
  }
  
  private static Uri toFileUri(String paramString)
  {
    return Uri.fromFile(new File(paramString));
  }
  
  public ModelLoader.LoadData<Data> buildLoadData(@NonNull String paramString, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    paramString = parseUri(paramString);
    if ((paramString != null) && (this.uriLoader.handles(paramString))) {
      return this.uriLoader.buildLoadData(paramString, paramInt1, paramInt2, paramOptions);
    }
    return null;
  }
  
  public boolean handles(@NonNull String paramString)
  {
    return true;
  }
  
  public static final class AssetFileDescriptorFactory
    implements ModelLoaderFactory<String, AssetFileDescriptor>
  {
    public final ModelLoader<String, AssetFileDescriptor> build(@NonNull MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new StringLoader(paramMultiModelLoaderFactory.build(Uri.class, AssetFileDescriptor.class));
    }
    
    public final void teardown() {}
  }
  
  public static class FileDescriptorFactory
    implements ModelLoaderFactory<String, ParcelFileDescriptor>
  {
    @NonNull
    public ModelLoader<String, ParcelFileDescriptor> build(@NonNull MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new StringLoader(paramMultiModelLoaderFactory.build(Uri.class, ParcelFileDescriptor.class));
    }
    
    public void teardown() {}
  }
  
  public static class StreamFactory
    implements ModelLoaderFactory<String, InputStream>
  {
    @NonNull
    public ModelLoader<String, InputStream> build(@NonNull MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new StringLoader(paramMultiModelLoaderFactory.build(Uri.class, InputStream.class));
    }
    
    public void teardown() {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/StringLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */