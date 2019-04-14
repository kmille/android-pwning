package de.eplus.mappecc.client.android.common.repository;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.box7.Box7Result;
import de.eplus.mappecc.client.android.common.utils.DateUtils;
import org.joda.time.DateTime;

public abstract class NetworkCacheStorageManager<T>
{
  @NonNull
  private final Box7Callback<T> box7Callback;
  
  public NetworkCacheStorageManager(@NonNull Box7Callback<T> paramBox7Callback)
  {
    this.box7Callback = paramBox7Callback;
    init();
  }
  
  private String getStorageOrCacheTimeStampAsString()
  {
    DateTime localDateTime = getStorageOrCacheTimeStamp();
    if (localDateTime == null) {
      return null;
    }
    return DateUtils.parseDateToPatternStr(localDateTime.toDate());
  }
  
  private void init()
  {
    new NetworkCacheStorageManagerTask(this).execute(new Void[0]);
  }
  
  public void createCall()
  {
    createCall(new Box7Callback(null)
    {
      public void onFailure(@NonNull Box7Result<T> paramAnonymousBox7Result)
      {
        NetworkCacheStorageManager.this.box7Callback.onFailure(paramAnonymousBox7Result);
      }
      
      public void onForbidden()
      {
        NetworkCacheStorageManager.this.box7Callback.onForbidden();
      }
      
      public void onMaintenanceMode()
      {
        NetworkCacheStorageManager.this.box7Callback.onMaintenanceMode();
      }
      
      public void onNoInternet()
      {
        NetworkCacheStorageManager.this.box7Callback.onNoInternet();
      }
      
      public void onNonFatalFailure(@NonNull Box7Result<T> paramAnonymousBox7Result)
      {
        NetworkCacheStorageManager.this.box7Callback.onNonFatalFailure(paramAnonymousBox7Result);
      }
      
      public void onRequestHandled(@NonNull Box7Result<T> paramAnonymousBox7Result, @Nullable T paramAnonymousT)
      {
        NetworkCacheStorageManager.this.box7Callback.onRequestHandled(paramAnonymousBox7Result, paramAnonymousT);
      }
      
      public void onServerError(@NonNull Box7Result<T> paramAnonymousBox7Result)
      {
        NetworkCacheStorageManager.this.box7Callback.onServerError(paramAnonymousBox7Result);
      }
      
      public void onSuccess(@NonNull Box7Result<T> paramAnonymousBox7Result, @Nullable T paramAnonymousT)
      {
        NetworkCacheStorageManager.this.saveInCache(paramAnonymousT);
        NetworkCacheStorageManager.this.saveSavedOnDevice(paramAnonymousT);
        NetworkCacheStorageManager.this.box7Callback.onSuccess(paramAnonymousBox7Result, paramAnonymousT);
      }
      
      public void onUnauthorized()
      {
        NetworkCacheStorageManager.this.box7Callback.onUnauthorized();
      }
      
      public void restartRequest()
      {
        NetworkCacheStorageManager.this.box7Callback.restartRequest();
      }
      
      public void showGenericError()
      {
        NetworkCacheStorageManager.this.box7Callback.showGenericError();
      }
    });
  }
  
  protected abstract void createCall(@NonNull Box7Callback<T> paramBox7Callback);
  
  protected T getFromCache()
  {
    return null;
  }
  
  @Nullable
  protected T getSavedOnDevice()
  {
    return null;
  }
  
  @Nullable
  protected DateTime getStorageOrCacheTimeStamp()
  {
    return null;
  }
  
  protected boolean isCached()
  {
    return false;
  }
  
  protected boolean isSavedOnDevice()
  {
    return false;
  }
  
  public final void returnCachedOrStoragedData(T paramT)
  {
    this.box7Callback.onBox7Result(Box7Result.BOX7_SUCCESS().withTimeStamp(getStorageOrCacheTimeStampAsString()).setIsFromCacheOrDiveStorage(), paramT);
  }
  
  protected void saveInCache(@Nullable T paramT) {}
  
  public void saveSavedOnDevice(@Nullable T paramT) {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/NetworkCacheStorageManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */