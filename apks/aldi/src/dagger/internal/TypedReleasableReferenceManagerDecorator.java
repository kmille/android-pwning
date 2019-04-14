package dagger.internal;

import dagger.releasablereferences.ReleasableReferenceManager;
import dagger.releasablereferences.TypedReleasableReferenceManager;
import java.lang.annotation.Annotation;

@GwtIncompatible
public final class TypedReleasableReferenceManagerDecorator<M extends Annotation>
  implements TypedReleasableReferenceManager<M>
{
  private final ReleasableReferenceManager delegate;
  private final M metadata;
  
  public TypedReleasableReferenceManagerDecorator(ReleasableReferenceManager paramReleasableReferenceManager, M paramM)
  {
    this.delegate = ((ReleasableReferenceManager)Preconditions.checkNotNull(paramReleasableReferenceManager));
    this.metadata = ((Annotation)Preconditions.checkNotNull(paramM));
  }
  
  public final M metadata()
  {
    return this.metadata;
  }
  
  public final void releaseStrongReferences()
  {
    this.delegate.releaseStrongReferences();
  }
  
  public final void restoreStrongReferences()
  {
    this.delegate.restoreStrongReferences();
  }
  
  public final Class<? extends Annotation> scope()
  {
    return this.delegate.scope();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/internal/TypedReleasableReferenceManagerDecorator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */