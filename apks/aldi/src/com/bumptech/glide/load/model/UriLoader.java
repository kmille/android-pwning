package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.AssetFileDescriptorLocalUriFetcher;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorLocalUriFetcher;
import com.bumptech.glide.load.data.StreamLocalUriFetcher;
import com.bumptech.glide.signature.ObjectKey;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UriLoader<Data>
  implements ModelLoader<Uri, Data>
{
  private static final Set<String> SCHEMES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "file", "android.resource", "content" })));
  private final LocalUriFetcherFactory<Data> factory;
  
  public UriLoader(LocalUriFetcherFactory<Data> paramLocalUriFetcherFactory)
  {
    this.factory = paramLocalUriFetcherFactory;
  }
  
  public ModelLoader.LoadData<Data> buildLoadData(@NonNull Uri paramUri, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    return new ModelLoader.LoadData(new ObjectKey(paramUri), this.factory.build(paramUri));
  }
  
  public boolean handles(@NonNull Uri paramUri)
  {
    return SCHEMES.contains(paramUri.getScheme());
  }
  
  public static final class AssetFileDescriptorFactory
    implements ModelLoaderFactory<Uri, AssetFileDescriptor>, UriLoader.LocalUriFetcherFactory<AssetFileDescriptor>
  {
    private final ContentResolver contentResolver;
    
    public AssetFileDescriptorFactory(ContentResolver paramContentResolver)
    {
      this.contentResolver = paramContentResolver;
    }
    
    public final DataFetcher<AssetFileDescriptor> build(Uri paramUri)
    {
      return new AssetFileDescriptorLocalUriFetcher(this.contentResolver, paramUri);
    }
    
    public final ModelLoader<Uri, AssetFileDescriptor> build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new UriLoader(this);
    }
    
    public final void teardown() {}
  }
  
  public static class FileDescriptorFactory
    implements ModelLoaderFactory<Uri, ParcelFileDescriptor>, UriLoader.LocalUriFetcherFactory<ParcelFileDescriptor>
  {
    private final ContentResolver contentResolver;
    
    public FileDescriptorFactory(ContentResolver paramContentResolver)
    {
      this.contentResolver = paramContentResolver;
    }
    
    public DataFetcher<ParcelFileDescriptor> build(Uri paramUri)
    {
      return new FileDescriptorLocalUriFetcher(this.contentResolver, paramUri);
    }
    
    @NonNull
    public ModelLoader<Uri, ParcelFileDescriptor> build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new UriLoader(this);
    }
    
    public void teardown() {}
  }
  
  public static abstract interface LocalUriFetcherFactory<Data>
  {
    public abstract DataFetcher<Data> build(Uri paramUri);
  }
  
  public static class StreamFactory
    implements ModelLoaderFactory<Uri, InputStream>, UriLoader.LocalUriFetcherFactory<InputStream>
  {
    private final ContentResolver contentResolver;
    
    public StreamFactory(ContentResolver paramContentResolver)
    {
      this.contentResolver = paramContentResolver;
    }
    
    public DataFetcher<InputStream> build(Uri paramUri)
    {
      return new StreamLocalUriFetcher(this.contentResolver, paramUri);
    }
    
    @NonNull
    public ModelLoader<Uri, InputStream> build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new UriLoader(this);
    }
    
    public void teardown() {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/UriLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */