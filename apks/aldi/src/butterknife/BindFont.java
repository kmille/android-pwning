package butterknife;

import android.support.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface BindFont
{
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface TypefaceStyle {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/butterknife/BindFont.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */