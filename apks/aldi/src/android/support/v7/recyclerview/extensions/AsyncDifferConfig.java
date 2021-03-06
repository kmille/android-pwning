package android.support.v7.recyclerview.extensions;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.v7.util.DiffUtil.ItemCallback;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class AsyncDifferConfig<T>
{
  @NonNull
  private final Executor mBackgroundThreadExecutor;
  @NonNull
  private final DiffUtil.ItemCallback<T> mDiffCallback;
  @NonNull
  private final Executor mMainThreadExecutor;
  
  AsyncDifferConfig(@NonNull Executor paramExecutor1, @NonNull Executor paramExecutor2, @NonNull DiffUtil.ItemCallback<T> paramItemCallback)
  {
    this.mMainThreadExecutor = paramExecutor1;
    this.mBackgroundThreadExecutor = paramExecutor2;
    this.mDiffCallback = paramItemCallback;
  }
  
  @NonNull
  public final Executor getBackgroundThreadExecutor()
  {
    return this.mBackgroundThreadExecutor;
  }
  
  @NonNull
  public final DiffUtil.ItemCallback<T> getDiffCallback()
  {
    return this.mDiffCallback;
  }
  
  @NonNull
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public final Executor getMainThreadExecutor()
  {
    return this.mMainThreadExecutor;
  }
  
  public static final class Builder<T>
  {
    private static Executor sDiffExecutor = null;
    private static final Object sExecutorLock = new Object();
    private Executor mBackgroundThreadExecutor;
    private final DiffUtil.ItemCallback<T> mDiffCallback;
    private Executor mMainThreadExecutor;
    
    public Builder(@NonNull DiffUtil.ItemCallback<T> paramItemCallback)
    {
      this.mDiffCallback = paramItemCallback;
    }
    
    @NonNull
    public final AsyncDifferConfig<T> build()
    {
      if (this.mBackgroundThreadExecutor == null) {
        synchronized (sExecutorLock)
        {
          if (sDiffExecutor == null) {
            sDiffExecutor = Executors.newFixedThreadPool(2);
          }
          this.mBackgroundThreadExecutor = sDiffExecutor;
        }
      }
      return new AsyncDifferConfig(this.mMainThreadExecutor, this.mBackgroundThreadExecutor, this.mDiffCallback);
    }
    
    @NonNull
    public final Builder<T> setBackgroundThreadExecutor(Executor paramExecutor)
    {
      this.mBackgroundThreadExecutor = paramExecutor;
      return this;
    }
    
    @NonNull
    @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final Builder<T> setMainThreadExecutor(Executor paramExecutor)
    {
      this.mMainThreadExecutor = paramExecutor;
      return this;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v7/recyclerview/extensions/AsyncDifferConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */