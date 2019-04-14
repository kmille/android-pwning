package dagger.android;

import dagger.internal.Factory;
import dagger.internal.GwtIncompatible;
import dagger.releasablereferences.TypedReleasableReferenceManager;
import java.util.Set;
import javax.inject.Provider;

@GwtIncompatible
public final class AndroidMemorySensitiveReferenceManager_Factory
  implements Factory<AndroidMemorySensitiveReferenceManager>
{
  private final Provider<Set<TypedReleasableReferenceManager<ReleaseReferencesAt>>> managersProvider;
  
  public AndroidMemorySensitiveReferenceManager_Factory(Provider<Set<TypedReleasableReferenceManager<ReleaseReferencesAt>>> paramProvider)
  {
    this.managersProvider = paramProvider;
  }
  
  public static AndroidMemorySensitiveReferenceManager_Factory create(Provider<Set<TypedReleasableReferenceManager<ReleaseReferencesAt>>> paramProvider)
  {
    return new AndroidMemorySensitiveReferenceManager_Factory(paramProvider);
  }
  
  public static AndroidMemorySensitiveReferenceManager newAndroidMemorySensitiveReferenceManager(Set<TypedReleasableReferenceManager<ReleaseReferencesAt>> paramSet)
  {
    return new AndroidMemorySensitiveReferenceManager(paramSet);
  }
  
  public static AndroidMemorySensitiveReferenceManager provideInstance(Provider<Set<TypedReleasableReferenceManager<ReleaseReferencesAt>>> paramProvider)
  {
    return new AndroidMemorySensitiveReferenceManager((Set)paramProvider.get());
  }
  
  public final AndroidMemorySensitiveReferenceManager get()
  {
    return provideInstance(this.managersProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/AndroidMemorySensitiveReferenceManager_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */