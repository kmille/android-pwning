package android.support.transition;

import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(18)
class ViewGroupUtilsApi18
{
  private static final String TAG = "ViewUtilsApi18";
  private static Method sSuppressLayoutMethod;
  private static boolean sSuppressLayoutMethodFetched;
  
  private static void fetchSuppressLayoutMethod()
  {
    if (!sSuppressLayoutMethodFetched) {}
    try
    {
      Method localMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[] { Boolean.TYPE });
      sSuppressLayoutMethod = localMethod;
      localMethod.setAccessible(true);
      sSuppressLayoutMethodFetched = true;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  static void suppressLayout(@NonNull ViewGroup paramViewGroup, boolean paramBoolean)
  {
    
    if (sSuppressLayoutMethod != null) {}
    try
    {
      sSuppressLayoutMethod.invoke(paramViewGroup, new Object[] { Boolean.valueOf(paramBoolean) });
      return;
    }
    catch (IllegalAccessException|InvocationTargetException paramViewGroup) {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/transition/ViewGroupUtilsApi18.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */