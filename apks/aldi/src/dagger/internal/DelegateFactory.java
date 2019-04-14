package dagger.internal;

import javax.inject.Provider;

public final class DelegateFactory<T>
  implements Factory<T>
{
  private Provider<T> delegate;
  
  public final T get()
  {
    if (this.delegate != null) {
      return (T)this.delegate.get();
    }
    throw new IllegalStateException();
  }
  
  public final void setDelegatedProvider(Provider<T> paramProvider)
  {
    if (paramProvider != null)
    {
      if (this.delegate == null)
      {
        this.delegate = paramProvider;
        return;
      }
      throw new IllegalStateException();
    }
    throw new IllegalArgumentException();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/internal/DelegateFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */