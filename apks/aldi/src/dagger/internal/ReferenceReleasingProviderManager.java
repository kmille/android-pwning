package dagger.internal;

import dagger.releasablereferences.ReleasableReferenceManager;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@GwtIncompatible
public final class ReferenceReleasingProviderManager
  implements ReleasableReferenceManager
{
  private final Queue<WeakReference<ReferenceReleasingProvider<?>>> providers = new ConcurrentLinkedQueue();
  private final Class<? extends Annotation> scope;
  
  public ReferenceReleasingProviderManager(Class<? extends Annotation> paramClass)
  {
    this.scope = ((Class)Preconditions.checkNotNull(paramClass));
  }
  
  private void execute(Operation paramOperation)
  {
    Iterator localIterator = this.providers.iterator();
    while (localIterator.hasNext())
    {
      ReferenceReleasingProvider localReferenceReleasingProvider = (ReferenceReleasingProvider)((WeakReference)localIterator.next()).get();
      if (localReferenceReleasingProvider == null) {
        localIterator.remove();
      } else {
        paramOperation.execute(localReferenceReleasingProvider);
      }
    }
  }
  
  public final void addProvider(ReferenceReleasingProvider<?> paramReferenceReleasingProvider)
  {
    this.providers.add(new WeakReference(paramReferenceReleasingProvider));
  }
  
  public final void releaseStrongReferences()
  {
    execute(Operation.RELEASE);
  }
  
  public final void restoreStrongReferences()
  {
    execute(Operation.RESTORE);
  }
  
  public final Class<? extends Annotation> scope()
  {
    return this.scope;
  }
  
  static abstract enum Operation
  {
    RELEASE,  RESTORE;
    
    private Operation() {}
    
    abstract void execute(ReferenceReleasingProvider<?> paramReferenceReleasingProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/internal/ReferenceReleasingProviderManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */