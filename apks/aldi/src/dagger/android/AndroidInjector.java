package dagger.android;

import dagger.BindsInstance;

public abstract interface AndroidInjector<T>
{
  public abstract void inject(T paramT);
  
  public static abstract class Builder<T>
    implements AndroidInjector.Factory<T>
  {
    public abstract AndroidInjector<T> build();
    
    public final AndroidInjector<T> create(T paramT)
    {
      seedInstance(paramT);
      return build();
    }
    
    @BindsInstance
    public abstract void seedInstance(T paramT);
  }
  
  public static abstract interface Factory<T>
  {
    public abstract AndroidInjector<T> create(T paramT);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/AndroidInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */