package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorAssetPathFetcher;
import com.bumptech.glide.load.data.StreamAssetPathFetcher;
import com.bumptech.glide.signature.ObjectKey;
import java.io.InputStream;
import java.util.List;

public class AssetUriLoader<Data>
  implements ModelLoader<Uri, Data>
{
  private static final String ASSET_PATH_SEGMENT = "android_asset";
  private static final String ASSET_PREFIX = "file:///android_asset/";
  private static final int ASSET_PREFIX_LENGTH = 22;
  private final AssetManager assetManager;
  private final AssetFetcherFactory<Data> factory;
  
  public AssetUriLoader(AssetManager paramAssetManager, AssetFetcherFactory<Data> paramAssetFetcherFactory)
  {
    this.assetManager = paramAssetManager;
    this.factory = paramAssetFetcherFactory;
  }
  
  public ModelLoader.LoadData<Data> buildLoadData(@NonNull Uri paramUri, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    paramOptions = paramUri.toString().substring(ASSET_PREFIX_LENGTH);
    return new ModelLoader.LoadData(new ObjectKey(paramUri), this.factory.buildFetcher(this.assetManager, paramOptions));
  }
  
  public boolean handles(@NonNull Uri paramUri)
  {
    return ("file".equals(paramUri.getScheme())) && (!paramUri.getPathSegments().isEmpty()) && ("android_asset".equals(paramUri.getPathSegments().get(0)));
  }
  
  public static abstract interface AssetFetcherFactory<Data>
  {
    public abstract DataFetcher<Data> buildFetcher(AssetManager paramAssetManager, String paramString);
  }
  
  public static class FileDescriptorFactory
    implements AssetUriLoader.AssetFetcherFactory<ParcelFileDescriptor>, ModelLoaderFactory<Uri, ParcelFileDescriptor>
  {
    private final AssetManager assetManager;
    
    public FileDescriptorFactory(AssetManager paramAssetManager)
    {
      this.assetManager = paramAssetManager;
    }
    
    @NonNull
    public ModelLoader<Uri, ParcelFileDescriptor> build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new AssetUriLoader(this.assetManager, this);
    }
    
    public DataFetcher<ParcelFileDescriptor> buildFetcher(AssetManager paramAssetManager, String paramString)
    {
      return new FileDescriptorAssetPathFetcher(paramAssetManager, paramString);
    }
    
    public void teardown() {}
  }
  
  public static class StreamFactory
    implements AssetUriLoader.AssetFetcherFactory<InputStream>, ModelLoaderFactory<Uri, InputStream>
  {
    private final AssetManager assetManager;
    
    public StreamFactory(AssetManager paramAssetManager)
    {
      this.assetManager = paramAssetManager;
    }
    
    @NonNull
    public ModelLoader<Uri, InputStream> build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new AssetUriLoader(this.assetManager, this);
    }
    
    public DataFetcher<InputStream> buildFetcher(AssetManager paramAssetManager, String paramString)
    {
      return new StreamAssetPathFetcher(paramAssetManager, paramString);
    }
    
    public void teardown() {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/AssetUriLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */