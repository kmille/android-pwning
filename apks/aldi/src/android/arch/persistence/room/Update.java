package android.arch.persistence.room;

import java.lang.annotation.Annotation;

public @interface Update
{
  int onConflict() default 3;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/persistence/room/Update.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */