package de.eplus.mappecc.client.android.common.repository;

import android.os.AsyncTask;
import android.support.annotation.NonNull;

class NetworkCacheStorageManagerTask<T>
  extends AsyncTask<Void, Void, T>
{
  private final NetworkCacheStorageManager<T> networkCacheStorageManager;
  
  NetworkCacheStorageManagerTask(@NonNull NetworkCacheStorageManager<T> paramNetworkCacheStorageManager)
  {
    this.networkCacheStorageManager = paramNetworkCacheStorageManager;
  }
  
  protected T doInBackground(Void... paramVarArgs)
  {
    if (this.networkCacheStorageManager.isCached()) {
      return (T)this.networkCacheStorageManager.getFromCache();
    }
    if (this.networkCacheStorageManager.isSavedOnDevice())
    {
      paramVarArgs = this.networkCacheStorageManager.getSavedOnDevice();
      this.networkCacheStorageManager.saveInCache(paramVarArgs);
      return paramVarArgs;
    }
    return null;
  }
  
  protected void onPostExecute(T paramT)
  {
    super.onPostExecute(paramT);
    if (paramT == null)
    {
      this.networkCacheStorageManager.createCall();
      return;
    }
    this.networkCacheStorageManager.returnCachedOrStoragedData(paramT);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/NetworkCacheStorageManagerTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */