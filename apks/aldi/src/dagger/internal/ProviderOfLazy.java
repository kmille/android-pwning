package dagger.internal;

import dagger.Lazy;
import javax.inject.Provider;

public final class ProviderOfLazy<T>
  implements Provider<Lazy<T>>
{
  private final Provider<T> provider;
  
  private ProviderOfLazy(Provider<T> paramProvider)
  {
    this.provider = paramProvider;
  }
  
  public static <T> Provider<Lazy<T>> create(Provider<T> paramProvider)
  {
    return new ProviderOfLazy((Provider)Preconditions.checkNotNull(paramProvider));
  }
  
  public final Lazy<T> get()
  {
    return DoubleCheck.lazy(this.provider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/internal/ProviderOfLazy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */