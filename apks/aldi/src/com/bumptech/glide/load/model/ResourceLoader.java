package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.bumptech.glide.load.Options;
import java.io.InputStream;

public class ResourceLoader<Data>
  implements ModelLoader<Integer, Data>
{
  private static final String TAG = "ResourceLoader";
  private final Resources resources;
  private final ModelLoader<Uri, Data> uriLoader;
  
  public ResourceLoader(Resources paramResources, ModelLoader<Uri, Data> paramModelLoader)
  {
    this.resources = paramResources;
    this.uriLoader = paramModelLoader;
  }
  
  @Nullable
  private Uri getResourceUri(Integer paramInteger)
  {
    try
    {
      Object localObject = new StringBuilder("android.resource://");
      ((StringBuilder)localObject).append(this.resources.getResourcePackageName(paramInteger.intValue()));
      ((StringBuilder)localObject).append('/');
      ((StringBuilder)localObject).append(this.resources.getResourceTypeName(paramInteger.intValue()));
      ((StringBuilder)localObject).append('/');
      ((StringBuilder)localObject).append(this.resources.getResourceEntryName(paramInteger.intValue()));
      localObject = Uri.parse(((StringBuilder)localObject).toString());
      return (Uri)localObject;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      for (;;) {}
    }
    if (Log.isLoggable("ResourceLoader", 5)) {
      new StringBuilder("Received invalid resource id: ").append(paramInteger);
    }
    return null;
  }
  
  public ModelLoader.LoadData<Data> buildLoadData(@NonNull Integer paramInteger, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    paramInteger = getResourceUri(paramInteger);
    if (paramInteger == null) {
      return null;
    }
    return this.uriLoader.buildLoadData(paramInteger, paramInt1, paramInt2, paramOptions);
  }
  
  public boolean handles(@NonNull Integer paramInteger)
  {
    return true;
  }
  
  public static final class AssetFileDescriptorFactory
    implements ModelLoaderFactory<Integer, AssetFileDescriptor>
  {
    private final Resources resources;
    
    public AssetFileDescriptorFactory(Resources paramResources)
    {
      this.resources = paramResources;
    }
    
    public final ModelLoader<Integer, AssetFileDescriptor> build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new ResourceLoader(this.resources, paramMultiModelLoaderFactory.build(Uri.class, AssetFileDescriptor.class));
    }
    
    public final void teardown() {}
  }
  
  public static class FileDescriptorFactory
    implements ModelLoaderFactory<Integer, ParcelFileDescriptor>
  {
    private final Resources resources;
    
    public FileDescriptorFactory(Resources paramResources)
    {
      this.resources = paramResources;
    }
    
    @NonNull
    public ModelLoader<Integer, ParcelFileDescriptor> build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new ResourceLoader(this.resources, paramMultiModelLoaderFactory.build(Uri.class, ParcelFileDescriptor.class));
    }
    
    public void teardown() {}
  }
  
  public static class StreamFactory
    implements ModelLoaderFactory<Integer, InputStream>
  {
    private final Resources resources;
    
    public StreamFactory(Resources paramResources)
    {
      this.resources = paramResources;
    }
    
    @NonNull
    public ModelLoader<Integer, InputStream> build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new ResourceLoader(this.resources, paramMultiModelLoaderFactory.build(Uri.class, InputStream.class));
    }
    
    public void teardown() {}
  }
  
  public static class UriFactory
    implements ModelLoaderFactory<Integer, Uri>
  {
    private final Resources resources;
    
    public UriFactory(Resources paramResources)
    {
      this.resources = paramResources;
    }
    
    @NonNull
    public ModelLoader<Integer, Uri> build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new ResourceLoader(this.resources, UnitModelLoader.getInstance());
    }
    
    public void teardown() {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/ResourceLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */