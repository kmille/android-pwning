package android.arch.lifecycle;

import android.support.annotation.Nullable;

public abstract interface Observer<T>
{
  public abstract void onChanged(@Nullable T paramT);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/lifecycle/Observer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */