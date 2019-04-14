package com.bumptech.glide.load.model;

import android.support.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.signature.ObjectKey;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class ByteArrayLoader<Data>
  implements ModelLoader<byte[], Data>
{
  private final Converter<Data> converter;
  
  public ByteArrayLoader(Converter<Data> paramConverter)
  {
    this.converter = paramConverter;
  }
  
  public ModelLoader.LoadData<Data> buildLoadData(@NonNull byte[] paramArrayOfByte, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    return new ModelLoader.LoadData(new ObjectKey(paramArrayOfByte), new Fetcher(paramArrayOfByte, this.converter));
  }
  
  public boolean handles(@NonNull byte[] paramArrayOfByte)
  {
    return true;
  }
  
  public static class ByteBufferFactory
    implements ModelLoaderFactory<byte[], ByteBuffer>
  {
    @NonNull
    public ModelLoader<byte[], ByteBuffer> build(@NonNull MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      new ByteArrayLoader(new ByteArrayLoader.Converter()
      {
        public ByteBuffer convert(byte[] paramAnonymousArrayOfByte)
        {
          return ByteBuffer.wrap(paramAnonymousArrayOfByte);
        }
        
        public Class<ByteBuffer> getDataClass()
        {
          return ByteBuffer.class;
        }
      });
    }
    
    public void teardown() {}
  }
  
  public static abstract interface Converter<Data>
  {
    public abstract Data convert(byte[] paramArrayOfByte);
    
    public abstract Class<Data> getDataClass();
  }
  
  static class Fetcher<Data>
    implements DataFetcher<Data>
  {
    private final ByteArrayLoader.Converter<Data> converter;
    private final byte[] model;
    
    Fetcher(byte[] paramArrayOfByte, ByteArrayLoader.Converter<Data> paramConverter)
    {
      this.model = paramArrayOfByte;
      this.converter = paramConverter;
    }
    
    public void cancel() {}
    
    public void cleanup() {}
    
    @NonNull
    public Class<Data> getDataClass()
    {
      return this.converter.getDataClass();
    }
    
    @NonNull
    public DataSource getDataSource()
    {
      return DataSource.LOCAL;
    }
    
    public void loadData(@NonNull Priority paramPriority, @NonNull DataFetcher.DataCallback<? super Data> paramDataCallback)
    {
      paramDataCallback.onDataReady(this.converter.convert(this.model));
    }
  }
  
  public static class StreamFactory
    implements ModelLoaderFactory<byte[], InputStream>
  {
    @NonNull
    public ModelLoader<byte[], InputStream> build(@NonNull MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      new ByteArrayLoader(new ByteArrayLoader.Converter()
      {
        public InputStream convert(byte[] paramAnonymousArrayOfByte)
        {
          return new ByteArrayInputStream(paramAnonymousArrayOfByte);
        }
        
        public Class<InputStream> getDataClass()
        {
          return InputStream.class;
        }
      });
    }
    
    public void teardown() {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/ByteArrayLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */