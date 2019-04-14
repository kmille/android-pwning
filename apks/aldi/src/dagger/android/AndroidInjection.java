package dagger.android;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.util.Log;
import dagger.internal.Preconditions;

public final class AndroidInjection
{
  private static final String TAG = "dagger.android";
  
  private static HasFragmentInjector findHasFragmentInjector(Fragment paramFragment)
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
    } while (!(localFragment instanceof HasFragmentInjector));
    return (HasFragmentInjector)localFragment;
    localObject = paramFragment.getActivity();
    if ((localObject instanceof HasFragmentInjector)) {
      return (HasFragmentInjector)localObject;
    }
    if ((((Activity)localObject).getApplication() instanceof HasFragmentInjector)) {
      return (HasFragmentInjector)((Activity)localObject).getApplication();
    }
    throw new IllegalArgumentException(String.format("No injector was found for %s", new Object[] { paramFragment.getClass().getCanonicalName() }));
  }
  
  public static void inject(Activity paramActivity)
  {
    Preconditions.checkNotNull(paramActivity, "activity");
    Application localApplication = paramActivity.getApplication();
    if ((localApplication instanceof HasActivityInjector))
    {
      AndroidInjector localAndroidInjector = ((HasActivityInjector)localApplication).activityInjector();
      Preconditions.checkNotNull(localAndroidInjector, "%s.activityInjector() returned null", localApplication.getClass());
      localAndroidInjector.inject(paramActivity);
      return;
    }
    throw new RuntimeException(String.format("%s does not implement %s", new Object[] { localApplication.getClass().getCanonicalName(), HasActivityInjector.class.getCanonicalName() }));
  }
  
  public static void inject(Fragment paramFragment)
  {
    Preconditions.checkNotNull(paramFragment, "fragment");
    HasFragmentInjector localHasFragmentInjector = findHasFragmentInjector(paramFragment);
    if (Log.isLoggable("dagger.android", 3)) {
      String.format("An injector for %s was found in %s", new Object[] { paramFragment.getClass().getCanonicalName(), localHasFragmentInjector.getClass().getCanonicalName() });
    }
    AndroidInjector localAndroidInjector = localHasFragmentInjector.fragmentInjector();
    Preconditions.checkNotNull(localAndroidInjector, "%s.fragmentInjector() returned null", localHasFragmentInjector.getClass());
    localAndroidInjector.inject(paramFragment);
  }
  
  public static void inject(Service paramService)
  {
    Preconditions.checkNotNull(paramService, "service");
    Application localApplication = paramService.getApplication();
    if ((localApplication instanceof HasServiceInjector))
    {
      AndroidInjector localAndroidInjector = ((HasServiceInjector)localApplication).serviceInjector();
      Preconditions.checkNotNull(localAndroidInjector, "%s.serviceInjector() returned null", localApplication.getClass());
      localAndroidInjector.inject(paramService);
      return;
    }
    throw new RuntimeException(String.format("%s does not implement %s", new Object[] { localApplication.getClass().getCanonicalName(), HasServiceInjector.class.getCanonicalName() }));
  }
  
  public static void inject(BroadcastReceiver paramBroadcastReceiver, Context paramContext)
  {
    Preconditions.checkNotNull(paramBroadcastReceiver, "broadcastReceiver");
    Preconditions.checkNotNull(paramContext, "context");
    paramContext = (Application)paramContext.getApplicationContext();
    if ((paramContext instanceof HasBroadcastReceiverInjector))
    {
      AndroidInjector localAndroidInjector = ((HasBroadcastReceiverInjector)paramContext).broadcastReceiverInjector();
      Preconditions.checkNotNull(localAndroidInjector, "%s.broadcastReceiverInjector() returned null", paramContext.getClass());
      localAndroidInjector.inject(paramBroadcastReceiver);
      return;
    }
    throw new RuntimeException(String.format("%s does not implement %s", new Object[] { paramContext.getClass().getCanonicalName(), HasBroadcastReceiverInjector.class.getCanonicalName() }));
  }
  
  public static void inject(ContentProvider paramContentProvider)
  {
    Preconditions.checkNotNull(paramContentProvider, "contentProvider");
    Application localApplication = (Application)paramContentProvider.getContext().getApplicationContext();
    if ((localApplication instanceof HasContentProviderInjector))
    {
      AndroidInjector localAndroidInjector = ((HasContentProviderInjector)localApplication).contentProviderInjector();
      Preconditions.checkNotNull(localAndroidInjector, "%s.contentProviderInjector() returned null", localApplication.getClass());
      localAndroidInjector.inject(paramContentProvider);
      return;
    }
    throw new RuntimeException(String.format("%s does not implement %s", new Object[] { localApplication.getClass().getCanonicalName(), HasContentProviderInjector.class.getCanonicalName() }));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/dagger/android/AndroidInjection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */