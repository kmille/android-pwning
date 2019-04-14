package dagger.android;

import java.lang.annotation.Annotation;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.METHOD})
public @interface ContributesAndroidInjector
{
  Class<?>[] modules() default {};
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/ContributesAndroidInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */