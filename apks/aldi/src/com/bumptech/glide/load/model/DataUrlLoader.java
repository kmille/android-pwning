package com.bumptech.glide.load.model;

import android.support.annotation.NonNull;
import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.signature.ObjectKey;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class DataUrlLoader<Model, Data>
  implements ModelLoader<Model, Data>
{
  private static final String BASE64_TAG = ";base64";
  private static final String DATA_SCHEME_IMAGE = "data:image";
  private final DataDecoder<Data> dataDecoder;
  
  public DataUrlLoader(DataDecoder<Data> paramDataDecoder)
  {
    this.dataDecoder = paramDataDecoder;
  }
  
  public final ModelLoader.LoadData<Data> buildLoadData(@NonNull Model paramModel, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    return new ModelLoader.LoadData(new ObjectKey(paramModel), new DataUriFetcher(paramModel.toString(), this.dataDecoder));
  }
  
  public final boolean handles(@NonNull Model paramModel)
  {
    return paramModel.toString().startsWith("data:image");
  }
  
  public static abstract interface DataDecoder<Data>
  {
    public abstract void close(Data paramData)
      throws IOException;
    
    public abstract Data decode(String paramString)
      throws IllegalArgumentException;
    
    public abstract Class<Data> getDataClass();
  }
  
  static final class DataUriFetcher<Data>
    implements DataFetcher<Data>
  {
    private Data data;
    private final String dataUri;
    private final DataUrlLoader.DataDecoder<Data> reader;
    
    DataUriFetcher(String paramString, DataUrlLoader.DataDecoder<Data> paramDataDecoder)
    {
      this.dataUri = paramString;
      this.reader = paramDataDecoder;
    }
    
    public final void cancel() {}
    
    public final void cleanup()
    {
      try
      {
        this.reader.close(this.data);
        return;
      }
      catch (IOException localIOException) {}
    }
    
    @NonNull
    public final Class<Data> getDataClass()
    {
      return this.reader.getDataClass();
    }
    
    @NonNull
    public final DataSource getDataSource()
    {
      return DataSource.LOCAL;
    }
    
    public final void loadData(@NonNull Priority paramPriority, @NonNull DataFetcher.DataCallback<? super Data> paramDataCallback)
    {
      try
      {
        this.data = this.reader.decode(this.dataUri);
        paramDataCallback.onDataReady(this.data);
        return;
      }
      catch (IllegalArgumentException paramPriority)
      {
        paramDataCallback.onLoadFailed(paramPriority);
      }
    }
  }
  
  public static final class StreamFactory<Model>
    implements ModelLoaderFactory<Model, InputStream>
  {
    private final DataUrlLoader.DataDecoder<InputStream> opener = new DataUrlLoader.DataDecoder()
    {
      public void close(InputStream paramAnonymousInputStream)
        throws IOException
      {
        paramAnonymousInputStream.close();
      }
      
      public InputStream decode(String paramAnonymousString)
      {
        if (paramAnonymousString.startsWith("data:image"))
        {
          int i = paramAnonymousString.indexOf(',');
          if (i != -1)
          {
            if (paramAnonymousString.substring(0, i).endsWith(";base64")) {
              return new ByteArrayInputStream(Base64.decode(paramAnonymousString.substring(i + 1), 0));
            }
            throw new IllegalArgumentException("Not a base64 image data URL.");
          }
          throw new IllegalArgumentException("Missing comma in data URL.");
        }
        throw new IllegalArgumentException("Not a valid image data URL.");
      }
      
      public Class<InputStream> getDataClass()
      {
        return InputStream.class;
      }
    };
    
    @NonNull
    public final ModelLoader<Model, InputStream> build(@NonNull MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new DataUrlLoader(this.opener);
    }
    
    public final void teardown() {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/DataUrlLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */