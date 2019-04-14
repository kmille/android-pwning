package android.support.v4.app;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProvider.Factory;
import android.arch.lifecycle.ViewModelStore;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.Loader;
import android.support.v4.content.Loader.OnLoadCompleteListener;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class LoaderManagerImpl
  extends LoaderManager
{
  static boolean DEBUG = false;
  static final String TAG = "LoaderManager";
  @NonNull
  private final LifecycleOwner mLifecycleOwner;
  @NonNull
  private final LoaderViewModel mLoaderViewModel;
  
  LoaderManagerImpl(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull ViewModelStore paramViewModelStore)
  {
    this.mLifecycleOwner = paramLifecycleOwner;
    this.mLoaderViewModel = LoaderViewModel.getInstance(paramViewModelStore);
  }
  
  @MainThread
  @NonNull
  private <D> Loader<D> createAndInstallLoader(int paramInt, @Nullable Bundle paramBundle, @NonNull LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks, @Nullable Loader<D> paramLoader)
  {
    try
    {
      this.mLoaderViewModel.startCreatingLoader();
      Loader localLoader = paramLoaderCallbacks.onCreateLoader(paramInt, paramBundle);
      if (localLoader != null)
      {
        if ((localLoader.getClass().isMemberClass()) && (!Modifier.isStatic(localLoader.getClass().getModifiers()))) {
          throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: ".concat(String.valueOf(localLoader)));
        }
        paramBundle = new LoaderInfo(paramInt, paramBundle, localLoader, paramLoader);
        if (DEBUG) {
          new StringBuilder("  Created new loader ").append(paramBundle);
        }
        this.mLoaderViewModel.putLoader(paramInt, paramBundle);
        return paramBundle.setCallback(this.mLifecycleOwner, paramLoaderCallbacks);
      }
      throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
    }
    finally
    {
      this.mLoaderViewModel.finishCreatingLoader();
    }
  }
  
  @MainThread
  public void destroyLoader(int paramInt)
  {
    if (!this.mLoaderViewModel.isCreatingLoader())
    {
      if (Looper.getMainLooper() == Looper.myLooper())
      {
        if (DEBUG)
        {
          localObject = new StringBuilder("destroyLoader in ");
          ((StringBuilder)localObject).append(this);
          ((StringBuilder)localObject).append(" of ");
          ((StringBuilder)localObject).append(paramInt);
        }
        Object localObject = this.mLoaderViewModel.getLoader(paramInt);
        if (localObject != null)
        {
          ((LoaderInfo)localObject).destroy(true);
          this.mLoaderViewModel.removeLoader(paramInt);
        }
        return;
      }
      throw new IllegalStateException("destroyLoader must be called on the main thread");
    }
    throw new IllegalStateException("Called while creating a loader");
  }
  
  @Deprecated
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.mLoaderViewModel.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  @Nullable
  public <D> Loader<D> getLoader(int paramInt)
  {
    if (!this.mLoaderViewModel.isCreatingLoader())
    {
      LoaderInfo localLoaderInfo = this.mLoaderViewModel.getLoader(paramInt);
      if (localLoaderInfo != null) {
        return localLoaderInfo.getLoader();
      }
      return null;
    }
    throw new IllegalStateException("Called while creating a loader");
  }
  
  public boolean hasRunningLoaders()
  {
    return this.mLoaderViewModel.hasRunningLoaders();
  }
  
  @MainThread
  @NonNull
  public <D> Loader<D> initLoader(int paramInt, @Nullable Bundle paramBundle, @NonNull LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
  {
    if (!this.mLoaderViewModel.isCreatingLoader())
    {
      if (Looper.getMainLooper() == Looper.myLooper())
      {
        LoaderInfo localLoaderInfo = this.mLoaderViewModel.getLoader(paramInt);
        if (DEBUG)
        {
          StringBuilder localStringBuilder = new StringBuilder("initLoader in ");
          localStringBuilder.append(this);
          localStringBuilder.append(": args=");
          localStringBuilder.append(paramBundle);
        }
        if (localLoaderInfo == null) {
          return createAndInstallLoader(paramInt, paramBundle, paramLoaderCallbacks, null);
        }
        if (DEBUG) {
          new StringBuilder("  Re-using existing loader ").append(localLoaderInfo);
        }
        return localLoaderInfo.setCallback(this.mLifecycleOwner, paramLoaderCallbacks);
      }
      throw new IllegalStateException("initLoader must be called on the main thread");
    }
    throw new IllegalStateException("Called while creating a loader");
  }
  
  public void markForRedelivery()
  {
    this.mLoaderViewModel.markForRedelivery();
  }
  
  @MainThread
  @NonNull
  public <D> Loader<D> restartLoader(int paramInt, @Nullable Bundle paramBundle, @NonNull LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
  {
    if (!this.mLoaderViewModel.isCreatingLoader())
    {
      if (Looper.getMainLooper() == Looper.myLooper())
      {
        if (DEBUG)
        {
          localObject = new StringBuilder("restartLoader in ");
          ((StringBuilder)localObject).append(this);
          ((StringBuilder)localObject).append(": args=");
          ((StringBuilder)localObject).append(paramBundle);
        }
        LoaderInfo localLoaderInfo = this.mLoaderViewModel.getLoader(paramInt);
        Object localObject = null;
        if (localLoaderInfo != null) {
          localObject = localLoaderInfo.destroy(false);
        }
        return createAndInstallLoader(paramInt, paramBundle, paramLoaderCallbacks, (Loader)localObject);
      }
      throw new IllegalStateException("restartLoader must be called on the main thread");
    }
    throw new IllegalStateException("Called while creating a loader");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    DebugUtils.buildShortClassTag(this.mLifecycleOwner, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  public static class LoaderInfo<D>
    extends MutableLiveData<D>
    implements Loader.OnLoadCompleteListener<D>
  {
    @Nullable
    private final Bundle mArgs;
    private final int mId;
    private LifecycleOwner mLifecycleOwner;
    @NonNull
    private final Loader<D> mLoader;
    private LoaderManagerImpl.LoaderObserver<D> mObserver;
    private Loader<D> mPriorLoader;
    
    LoaderInfo(int paramInt, @Nullable Bundle paramBundle, @NonNull Loader<D> paramLoader1, @Nullable Loader<D> paramLoader2)
    {
      this.mId = paramInt;
      this.mArgs = paramBundle;
      this.mLoader = paramLoader1;
      this.mPriorLoader = paramLoader2;
      this.mLoader.registerListener(paramInt, this);
    }
    
    @MainThread
    Loader<D> destroy(boolean paramBoolean)
    {
      if (LoaderManagerImpl.DEBUG) {
        new StringBuilder("  Destroying: ").append(this);
      }
      this.mLoader.cancelLoad();
      this.mLoader.abandon();
      LoaderManagerImpl.LoaderObserver localLoaderObserver = this.mObserver;
      if (localLoaderObserver != null)
      {
        removeObserver(localLoaderObserver);
        if (paramBoolean) {
          localLoaderObserver.reset();
        }
      }
      this.mLoader.unregisterListener(this);
      if (((localLoaderObserver != null) && (!localLoaderObserver.hasDeliveredData())) || (paramBoolean))
      {
        this.mLoader.reset();
        return this.mPriorLoader;
      }
      return this.mLoader;
    }
    
    public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mId=");
      paramPrintWriter.print(this.mId);
      paramPrintWriter.print(" mArgs=");
      paramPrintWriter.println(this.mArgs);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mLoader=");
      paramPrintWriter.println(this.mLoader);
      Loader localLoader = this.mLoader;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append("  ");
      localLoader.dump(localStringBuilder.toString(), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      if (this.mObserver != null)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mCallbacks=");
        paramPrintWriter.println(this.mObserver);
        paramFileDescriptor = this.mObserver;
        paramArrayOfString = new StringBuilder();
        paramArrayOfString.append(paramString);
        paramArrayOfString.append("  ");
        paramFileDescriptor.dump(paramArrayOfString.toString(), paramPrintWriter);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mData=");
      paramPrintWriter.println(getLoader().dataToString(getValue()));
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.println(hasActiveObservers());
    }
    
    @NonNull
    Loader<D> getLoader()
    {
      return this.mLoader;
    }
    
    boolean isCallbackWaitingForData()
    {
      if (!hasActiveObservers()) {
        return false;
      }
      return (this.mObserver != null) && (!this.mObserver.hasDeliveredData());
    }
    
    void markForRedelivery()
    {
      LifecycleOwner localLifecycleOwner = this.mLifecycleOwner;
      LoaderManagerImpl.LoaderObserver localLoaderObserver = this.mObserver;
      if ((localLifecycleOwner != null) && (localLoaderObserver != null))
      {
        super.removeObserver(localLoaderObserver);
        observe(localLifecycleOwner, localLoaderObserver);
      }
    }
    
    public void onActive()
    {
      if (LoaderManagerImpl.DEBUG) {
        new StringBuilder("  Starting: ").append(this);
      }
      this.mLoader.startLoading();
    }
    
    public void onInactive()
    {
      if (LoaderManagerImpl.DEBUG) {
        new StringBuilder("  Stopping: ").append(this);
      }
      this.mLoader.stopLoading();
    }
    
    public void onLoadComplete(@NonNull Loader<D> paramLoader, @Nullable D paramD)
    {
      if (LoaderManagerImpl.DEBUG) {
        new StringBuilder("onLoadComplete: ").append(this);
      }
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        setValue(paramD);
        return;
      }
      boolean bool = LoaderManagerImpl.DEBUG;
      postValue(paramD);
    }
    
    public void removeObserver(@NonNull Observer<? super D> paramObserver)
    {
      super.removeObserver(paramObserver);
      this.mLifecycleOwner = null;
      this.mObserver = null;
    }
    
    @MainThread
    @NonNull
    Loader<D> setCallback(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
    {
      paramLoaderCallbacks = new LoaderManagerImpl.LoaderObserver(this.mLoader, paramLoaderCallbacks);
      observe(paramLifecycleOwner, paramLoaderCallbacks);
      if (this.mObserver != null) {
        removeObserver(this.mObserver);
      }
      this.mLifecycleOwner = paramLifecycleOwner;
      this.mObserver = paramLoaderCallbacks;
      return this.mLoader;
    }
    
    public void setValue(D paramD)
    {
      super.setValue(paramD);
      if (this.mPriorLoader != null)
      {
        this.mPriorLoader.reset();
        this.mPriorLoader = null;
      }
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(64);
      localStringBuilder.append("LoaderInfo{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" #");
      localStringBuilder.append(this.mId);
      localStringBuilder.append(" : ");
      DebugUtils.buildShortClassTag(this.mLoader, localStringBuilder);
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
    }
  }
  
  static class LoaderObserver<D>
    implements Observer<D>
  {
    @NonNull
    private final LoaderManager.LoaderCallbacks<D> mCallback;
    private boolean mDeliveredData = false;
    @NonNull
    private final Loader<D> mLoader;
    
    LoaderObserver(@NonNull Loader<D> paramLoader, @NonNull LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
    {
      this.mLoader = paramLoader;
      this.mCallback = paramLoaderCallbacks;
    }
    
    public void dump(String paramString, PrintWriter paramPrintWriter)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mDeliveredData=");
      paramPrintWriter.println(this.mDeliveredData);
    }
    
    boolean hasDeliveredData()
    {
      return this.mDeliveredData;
    }
    
    public void onChanged(@Nullable D paramD)
    {
      if (LoaderManagerImpl.DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder("  onLoadFinished in ");
        localStringBuilder.append(this.mLoader);
        localStringBuilder.append(": ");
        localStringBuilder.append(this.mLoader.dataToString(paramD));
      }
      this.mCallback.onLoadFinished(this.mLoader, paramD);
      this.mDeliveredData = true;
    }
    
    @MainThread
    void reset()
    {
      if (this.mDeliveredData)
      {
        if (LoaderManagerImpl.DEBUG) {
          new StringBuilder("  Resetting: ").append(this.mLoader);
        }
        this.mCallback.onLoaderReset(this.mLoader);
      }
    }
    
    public String toString()
    {
      return this.mCallback.toString();
    }
  }
  
  static class LoaderViewModel
    extends ViewModel
  {
    private static final ViewModelProvider.Factory FACTORY = new ViewModelProvider.Factory()
    {
      @NonNull
      public final <T extends ViewModel> T create(@NonNull Class<T> paramAnonymousClass)
      {
        return new LoaderManagerImpl.LoaderViewModel();
      }
    };
    private boolean mCreatingLoader = false;
    private SparseArrayCompat<LoaderManagerImpl.LoaderInfo> mLoaders = new SparseArrayCompat();
    
    @NonNull
    static LoaderViewModel getInstance(ViewModelStore paramViewModelStore)
    {
      return (LoaderViewModel)new ViewModelProvider(paramViewModelStore, FACTORY).get(LoaderViewModel.class);
    }
    
    public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      if (this.mLoaders.size() > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Loaders:");
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append("    ");
        localObject = ((StringBuilder)localObject).toString();
        int i = 0;
        while (i < this.mLoaders.size())
        {
          LoaderManagerImpl.LoaderInfo localLoaderInfo = (LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(this.mLoaders.keyAt(i));
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localLoaderInfo.toString());
          localLoaderInfo.dump((String)localObject, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          i += 1;
        }
      }
    }
    
    void finishCreatingLoader()
    {
      this.mCreatingLoader = false;
    }
    
    <D> LoaderManagerImpl.LoaderInfo<D> getLoader(int paramInt)
    {
      return (LoaderManagerImpl.LoaderInfo)this.mLoaders.get(paramInt);
    }
    
    boolean hasRunningLoaders()
    {
      int j = this.mLoaders.size();
      int i = 0;
      while (i < j)
      {
        if (((LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(i)).isCallbackWaitingForData()) {
          return true;
        }
        i += 1;
      }
      return false;
    }
    
    boolean isCreatingLoader()
    {
      return this.mCreatingLoader;
    }
    
    void markForRedelivery()
    {
      int j = this.mLoaders.size();
      int i = 0;
      while (i < j)
      {
        ((LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(i)).markForRedelivery();
        i += 1;
      }
    }
    
    public void onCleared()
    {
      super.onCleared();
      int j = this.mLoaders.size();
      int i = 0;
      while (i < j)
      {
        ((LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(i)).destroy(true);
        i += 1;
      }
      this.mLoaders.clear();
    }
    
    void putLoader(int paramInt, @NonNull LoaderManagerImpl.LoaderInfo paramLoaderInfo)
    {
      this.mLoaders.put(paramInt, paramLoaderInfo);
    }
    
    void removeLoader(int paramInt)
    {
      this.mLoaders.remove(paramInt);
    }
    
    void startCreatingLoader()
    {
      this.mCreatingLoader = true;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/app/LoaderManagerImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */