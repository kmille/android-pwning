package dagger.android;

import dagger.internal.GwtIncompatible;
import dagger.releasablereferences.TypedReleasableReferenceManager;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;

@Deprecated
@GwtIncompatible
public final class AndroidMemorySensitiveReferenceManager
{
  private final Set<TypedReleasableReferenceManager<ReleaseReferencesAt>> managers;
  
  @Inject
  AndroidMemorySensitiveReferenceManager(Set<TypedReleasableReferenceManager<ReleaseReferencesAt>> paramSet)
  {
    this.managers = paramSet;
  }
  
  public final void onTrimMemory(int paramInt)
  {
    Iterator localIterator = this.managers.iterator();
    while (localIterator.hasNext())
    {
      TypedReleasableReferenceManager localTypedReleasableReferenceManager = (TypedReleasableReferenceManager)localIterator.next();
      if (paramInt >= ((ReleaseReferencesAt)localTypedReleasableReferenceManager.metadata()).value()) {
        localTypedReleasableReferenceManager.releaseStrongReferences();
      } else {
        localTypedReleasableReferenceManager.restoreStrongReferences();
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/AndroidMemorySensitiveReferenceManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */