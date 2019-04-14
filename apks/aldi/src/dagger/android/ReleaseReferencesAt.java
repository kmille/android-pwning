package dagger.android;

import dagger.internal.GwtIncompatible;
import dagger.releasablereferences.CanReleaseReferences;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Target;

@Deprecated
@Documented
@Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@GwtIncompatible
@CanReleaseReferences
public @interface ReleaseReferencesAt
{
  int value();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/ReleaseReferencesAt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */