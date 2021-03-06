package dagger.android;

import android.content.BroadcastReceiver;
import dagger.MapKey;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Target;

@MapKey
@Documented
@Target({java.lang.annotation.ElementType.METHOD})
public @interface BroadcastReceiverKey
{
  Class<? extends BroadcastReceiver> value();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/BroadcastReceiverKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */