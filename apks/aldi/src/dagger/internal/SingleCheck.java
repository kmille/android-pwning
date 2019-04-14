package dagger.internal;

import javax.inject.Provider;

public final class SingleCheck<T>
  implements Provider<T>
{
  private static final Object UNINITIALIZED = new Object();
  private volatile Object instance = UNINITIALIZED;
  private volatile Provider<T> provider;
  
  private SingleCheck(Provider<T> paramProvider)
  {
    this.provider = paramProvider;
  }
  
  public static <P extends Provider<T>, T> Provider<T> provider(P paramP)
  {
    if (!(paramP instanceof SingleCheck))
    {
      if ((paramP instanceof DoubleCheck)) {
        return paramP;
      }
      return new SingleCheck((Provider)Preconditions.checkNotNull(paramP));
    }
    return paramP;
  }
  
  public final T get()
  {
    Object localObject2 = this.instance;
    Object localObject1 = localObject2;
    if (localObject2 == UNINITIALIZED)
    {
      localObject1 = this.provider;
      if (localObject1 == null) {
        return (T)this.instance;
      }
      localObject1 = ((Provider)localObject1).get();
      this.instance = localObject1;
      this.provider = null;
    }
    return (T)localObject1;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/internal/SingleCheck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */