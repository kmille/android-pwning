package dagger.internal;

import java.lang.ref.WeakReference;
import javax.inject.Provider;

@GwtIncompatible
public final class ReferenceReleasingProvider<T>
  implements Provider<T>
{
  private static final Object NULL = new Object();
  private final Provider<T> provider;
  private volatile Object strongReference;
  private volatile WeakReference<T> weakReference;
  
  private ReferenceReleasingProvider(Provider<T> paramProvider)
  {
    this.provider = paramProvider;
  }
  
  public static <T> ReferenceReleasingProvider<T> create(Provider<T> paramProvider, ReferenceReleasingProviderManager paramReferenceReleasingProviderManager)
  {
    paramProvider = new ReferenceReleasingProvider((Provider)Preconditions.checkNotNull(paramProvider));
    paramReferenceReleasingProviderManager.addProvider(paramProvider);
    return paramProvider;
  }
  
  private Object currentValue()
  {
    Object localObject = this.strongReference;
    if (localObject != null) {
      return localObject;
    }
    if (this.weakReference != null) {
      return this.weakReference.get();
    }
    return null;
  }
  
  public final T get()
  {
    Object localObject3 = currentValue();
    Object localObject1 = localObject3;
    if (localObject3 == null) {
      try
      {
        localObject3 = currentValue();
        localObject1 = localObject3;
        if (localObject3 == null)
        {
          localObject3 = this.provider.get();
          localObject1 = localObject3;
          if (localObject3 == null) {
            localObject1 = NULL;
          }
          this.strongReference = localObject1;
        }
      }
      finally {}
    }
    localObject3 = localObject2;
    if (localObject2 == NULL) {
      localObject3 = null;
    }
    return (T)localObject3;
  }
  
  public final void releaseStrongReference()
  {
    Object localObject1 = this.strongReference;
    if ((localObject1 != null) && (localObject1 != NULL)) {
      try
      {
        this.weakReference = new WeakReference(localObject1);
        this.strongReference = null;
        return;
      }
      finally {}
    }
  }
  
  public final void restoreStrongReference()
  {
    Object localObject1 = this.strongReference;
    if ((this.weakReference != null) && (localObject1 == null)) {
      try
      {
        localObject1 = this.strongReference;
        if ((this.weakReference != null) && (localObject1 == null))
        {
          localObject1 = this.weakReference.get();
          if (localObject1 != null)
          {
            this.strongReference = localObject1;
            this.weakReference = null;
          }
        }
        return;
      }
      finally {}
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/internal/ReferenceReleasingProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */