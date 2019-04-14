package dagger.releasablereferences;

import dagger.internal.GwtIncompatible;
import java.lang.annotation.Annotation;

@Deprecated
@GwtIncompatible
public abstract interface ReleasableReferenceManager
{
  public abstract void releaseStrongReferences();
  
  public abstract void restoreStrongReferences();
  
  public abstract Class<? extends Annotation> scope();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/releasablereferences/ReleasableReferenceManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */