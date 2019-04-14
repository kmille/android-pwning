package dagger.releasablereferences;

import dagger.internal.GwtIncompatible;
import java.lang.annotation.Annotation;

@Deprecated
@GwtIncompatible
public abstract interface TypedReleasableReferenceManager<M extends Annotation>
  extends ReleasableReferenceManager
{
  public abstract M metadata();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/releasablereferences/TypedReleasableReferenceManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */