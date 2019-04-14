package dagger.android;

import android.content.ContentProvider;
import dagger.MapKey;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Target;

@MapKey
@Documented
@Target({java.lang.annotation.ElementType.METHOD})
public @interface ContentProviderKey
{
  Class<? extends ContentProvider> value();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/ContentProviderKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */