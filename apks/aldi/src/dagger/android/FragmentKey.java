package dagger.android;

import android.app.Fragment;
import dagger.MapKey;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Target;

@MapKey
@Documented
@Target({java.lang.annotation.ElementType.METHOD})
public @interface FragmentKey
{
  Class<? extends Fragment> value();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/FragmentKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */