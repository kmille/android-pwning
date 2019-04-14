package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;

public final class MediaStoreFileLoader
  implements ModelLoader<Uri, File>
{
  private final Context context;
  
  public MediaStoreFileLoader(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final ModelLoader.LoadData<File> buildLoadData(@NonNull Uri paramUri, int paramInt1, int paramInt2, @NonNull Options paramOptions)
  {
    return new ModelLoader.LoadData(new ObjectKey(paramUri), new FilePathFetcher(this.context, paramUri));
  }
  
  public final boolean handles(@NonNull Uri paramUri)
  {
    return MediaStoreUtil.isMediaStoreUri(paramUri);
  }
  
  public static final class Factory
    implements ModelLoaderFactory<Uri, File>
  {
    private final Context context;
    
    public Factory(Context paramContext)
    {
      this.context = paramContext;
    }
    
    @NonNull
    public final ModelLoader<Uri, File> build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
    {
      return new MediaStoreFileLoader(this.context);
    }
    
    public final void teardown() {}
  }
  
  static class FilePathFetcher
    implements DataFetcher<File>
  {
    private static final String[] PROJECTION = { "_data" };
    private final Context context;
    private final Uri uri;
    
    FilePathFetcher(Context paramContext, Uri paramUri)
    {
      this.context = paramContext;
      this.uri = paramUri;
    }
    
    public void cancel() {}
    
    public void cleanup() {}
    
    @NonNull
    public Class<File> getDataClass()
    {
      return File.class;
    }
    
    @NonNull
    public DataSource getDataSource()
    {
      return DataSource.LOCAL;
    }
    
    public void loadData(@NonNull Priority paramPriority, @NonNull DataFetcher.DataCallback<? super File> paramDataCallback)
    {
      Cursor localCursor = this.context.getContentResolver().query(this.uri, PROJECTION, null, null, null);
      paramPriority = null;
      Object localObject = null;
      if (localCursor != null) {
        paramPriority = (Priority)localObject;
      }
      try
      {
        if (localCursor.moveToFirst()) {
          paramPriority = localCursor.getString(localCursor.getColumnIndexOrThrow("_data"));
        }
        localCursor.close();
      }
      finally
      {
        localCursor.close();
      }
      paramPriority = new StringBuilder("Failed to find file path for: ");
      paramPriority.append(this.uri);
      paramDataCallback.onLoadFailed(new FileNotFoundException(paramPriority.toString()));
      return;
      paramDataCallback.onDataReady(new File(paramPriority));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/MediaStoreFileLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */