package android.arch.lifecycle;

import android.arch.core.util.Function;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class Transformations
{
  @MainThread
  public static <X, Y> LiveData<Y> map(@NonNull LiveData<X> paramLiveData, @NonNull final Function<X, Y> paramFunction)
  {
    MediatorLiveData localMediatorLiveData = new MediatorLiveData();
    localMediatorLiveData.addSource(paramLiveData, new Observer()
    {
      public final void onChanged(@Nullable X paramAnonymousX)
      {
        this.val$result.setValue(paramFunction.apply(paramAnonymousX));
      }
    });
    return localMediatorLiveData;
  }
  
  @MainThread
  public static <X, Y> LiveData<Y> switchMap(@NonNull LiveData<X> paramLiveData, @NonNull Function<X, LiveData<Y>> paramFunction)
  {
    final MediatorLiveData localMediatorLiveData = new MediatorLiveData();
    localMediatorLiveData.addSource(paramLiveData, new Observer()
    {
      LiveData<Y> mSource;
      
      public final void onChanged(@Nullable X paramAnonymousX)
      {
        paramAnonymousX = (LiveData)this.val$func.apply(paramAnonymousX);
        if (this.mSource == paramAnonymousX) {
          return;
        }
        if (this.mSource != null) {
          localMediatorLiveData.removeSource(this.mSource);
        }
        this.mSource = paramAnonymousX;
        if (this.mSource != null) {
          localMediatorLiveData.addSource(this.mSource, new Observer()
          {
            public void onChanged(@Nullable Y paramAnonymous2Y)
            {
              Transformations.2.this.val$result.setValue(paramAnonymous2Y);
            }
          });
        }
      }
    });
    return localMediatorLiveData;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/lifecycle/Transformations.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */