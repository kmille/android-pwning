package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.support.annotation.NonNull;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

public abstract class AssetPathFetcher<T>
  implements DataFetcher<T>
{
  private static final String TAG = "AssetPathFetcher";
  private final AssetManager assetManager;
  private final String assetPath;
  private T data;
  
  public AssetPathFetcher(AssetManager paramAssetManager, String paramString)
  {
    this.assetManager = paramAssetManager;
    this.assetPath = paramString;
  }
  
  public void cancel() {}
  
  public void cleanup()
  {
    if (this.data == null) {
      return;
    }
    try
    {
      close(this.data);
      return;
    }
    catch (IOException localIOException) {}
  }
  
  protected abstract void close(T paramT)
    throws IOException;
  
  @NonNull
  public DataSource getDataSource()
  {
    return DataSource.LOCAL;
  }
  
  public void loadData(@NonNull Priority paramPriority, @NonNull DataFetcher.DataCallback<? super T> paramDataCallback)
  {
    try
    {
      this.data = loadResource(this.assetManager, this.assetPath);
      paramDataCallback.onDataReady(this.data);
      return;
    }
    catch (IOException paramPriority)
    {
      Log.isLoggable("AssetPathFetcher", 3);
      paramDataCallback.onLoadFailed(paramPriority);
    }
  }
  
  protected abstract T loadResource(AssetManager paramAssetManager, String paramString)
    throws IOException;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/data/AssetPathFetcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */