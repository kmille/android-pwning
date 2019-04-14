package dagger.android.support;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.Log;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

public final class AndroidSupportInjection
{
  private static final String TAG = "dagger.android.support";
  
  private static HasSupportFragmentInjector findHasFragmentInjector(Fragment paramFragment)
  {
    Object localObject = paramFragment;
    Fragment localFragment;
    do
    {
      localFragment = ((Fragment)localObject).getParentFragment();
      if (localFragment == null) {
        break;
      }
      localObject = localFragment;
    } while (!(localFragment instanceof HasSupportFragmentInjector));
    return (HasSupportFragmentInjector)localFragment;
    localObject = paramFragment.getActivity();
    if ((localObject instanceof HasSupportFragmentInjector)) {
      return (HasSupportFragmentInjector)localObject;
    }
    if ((((Activity)localObject).getApplication() instanceof HasSupportFragmentInjector)) {
      return (HasSupportFragmentInjector)((Activity)localObject).getApplication();
    }
    throw new IllegalArgumentException(String.format("No injector was found for %s", new Object[] { paramFragment.getClass().getCanonicalName() }));
  }
  
  public static void inject(Fragment paramFragment)
  {
    Preconditions.checkNotNull(paramFragment, "fragment");
    HasSupportFragmentInjector localHasSupportFragmentInjector = findHasFragmentInjector(paramFragment);
    if (Log.isLoggable("dagger.android.support", 3)) {
      String.format("An injector for %s was found in %s", new Object[] { paramFragment.getClass().getCanonicalName(), localHasSupportFragmentInjector.getClass().getCanonicalName() });
    }
    AndroidInjector localAndroidInjector = localHasSupportFragmentInjector.supportFragmentInjector();
    Preconditions.checkNotNull(localAndroidInjector, "%s.supportFragmentInjector() returned null", localHasSupportFragmentInjector.getClass());
    localAndroidInjector.inject(paramFragment);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/support/AndroidSupportInjection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */