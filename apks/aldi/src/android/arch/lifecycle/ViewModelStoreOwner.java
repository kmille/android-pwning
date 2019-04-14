package android.arch.lifecycle;

import android.support.annotation.NonNull;

public abstract interface ViewModelStoreOwner
{
  @NonNull
  public abstract ViewModelStore getViewModelStore();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/arch/lifecycle/ViewModelStoreOwner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */