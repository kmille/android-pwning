package dagger.internal;

import dagger.Lazy;

public final class InstanceFactory<T>
  implements Lazy<T>, Factory<T>
{
  private static final InstanceFactory<Object> NULL_INSTANCE_FACTORY = new InstanceFactory(null);
  private final T instance;
  
  private InstanceFactory(T paramT)
  {
    this.instance = paramT;
  }
  
  public static <T> Factory<T> create(T paramT)
  {
    return new InstanceFactory(Preconditions.checkNotNull(paramT, "instance cannot be null"));
  }
  
  public static <T> Factory<T> createNullable(T paramT)
  {
    if (paramT == null) {
      return nullInstanceFactory();
    }
    return new InstanceFactory(paramT);
  }
  
  private static <T> InstanceFactory<T> nullInstanceFactory()
  {
    return NULL_INSTANCE_FACTORY;
  }
  
  public final T get()
  {
    return (T)this.instance;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/internal/InstanceFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */