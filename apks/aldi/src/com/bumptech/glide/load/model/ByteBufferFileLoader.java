package com.bumptech.glide.load.model;

import android.support.annotation.NonNull;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ByteBufferFileLoader
  implements ModelLoader<File, ByteBuffer>
{
  private static final String TAG = "ByteBufferFileLoader";
  
  public ModelLoader.LoadData<ByteBuffer> buildLoadData(@NonNull File paramFile, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    return new ModelLoader.LoadData(new ObjectKey(paramFile), new ByteBufferFetcher(paramFile));
  }
  
  public boolean handles(@NonNull File paramFile)
  {
    return true;
  }
  
  static final class ByteBufferFetcher
    implements DataFetcher<ByteBuffer>
  {
    private final File file;
    
    ByteBufferFetcher(File paramFile)
    {
      this.file = paramFile;
    }
    
    public final void cancel() {}
    
    public final void cleanup() {}
    
    @NonNull
    public final Class<ByteBuffer> getDataClass()
    {
      return ByteBuffer.class;
    }
    
    @NonNull
    public final DataSource getDataSource()
    {
      return DataSource.LOCAL;
    }
    
    public final void loadData(@NonNull Priority paramPriority, @NonNull DataFetcher.DataCallback<? super ByteBuffer> paramDataCallback)
    {
      try
      {
        paramPriority = ByteBufferUtil.fromFile(this.file);
        paramDataCallback.onDataReady(paramPriority);
        return;
      }
      catch (IOException paramPriority)
      {
        Log.isLoggable("ByteBufferFileLoader", 3);
        paramDataCallback.onLoadFailed(paramPriority);
      }
    }
  }
  
  public static class Factory
    implements ModelLoaderFactory<File, ByteBuffer>
  {
    @NonNull
    public ModelLoader<File, ByteBuffer> build(@NonNull MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new ByteBufferFileLoader();
    }
    
    public void teardown() {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/ByteBufferFileLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */