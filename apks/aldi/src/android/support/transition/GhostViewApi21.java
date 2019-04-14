package android.support.transition;

import android.graphics.Matrix;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(21)
class GhostViewApi21
  implements GhostViewImpl
{
  private static final String TAG = "GhostViewApi21";
  private static Method sAddGhostMethod;
  private static boolean sAddGhostMethodFetched;
  private static Class<?> sGhostViewClass;
  private static boolean sGhostViewClassFetched;
  private static Method sRemoveGhostMethod;
  private static boolean sRemoveGhostMethodFetched;
  private final View mGhostView;
  
  private GhostViewApi21(@NonNull View paramView)
  {
    this.mGhostView = paramView;
  }
  
  static GhostViewImpl addGhost(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix)
  {
    
    if (sAddGhostMethod != null) {}
    try
    {
      paramView = new GhostViewApi21((View)sAddGhostMethod.invoke(null, new Object[] { paramView, paramViewGroup, paramMatrix }));
      return paramView;
    }
    catch (InvocationTargetException paramView)
    {
      throw new RuntimeException(paramView.getCause());
      return null;
    }
    catch (IllegalAccessException paramView) {}
    return null;
  }
  
  private static void fetchAddGhostMethod()
  {
    if (!sAddGhostMethodFetched) {}
    try
    {
      fetchGhostViewClass();
      Method localMethod = sGhostViewClass.getDeclaredMethod("addGhost", new Class[] { View.class, ViewGroup.class, Matrix.class });
      sAddGhostMethod = localMethod;
      localMethod.setAccessible(true);
      sAddGhostMethodFetched = true;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  private static void fetchGhostViewClass()
  {
    if (!sGhostViewClassFetched) {}
    try
    {
      sGhostViewClass = Class.forName("android.view.GhostView");
      sGhostViewClassFetched = true;
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
  }
  
  private static void fetchRemoveGhostMethod()
  {
    if (!sRemoveGhostMethodFetched) {}
    try
    {
      fetchGhostViewClass();
      Method localMethod = sGhostViewClass.getDeclaredMethod("removeGhost", new Class[] { View.class });
      sRemoveGhostMethod = localMethod;
      localMethod.setAccessible(true);
      sRemoveGhostMethodFetched = true;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  static void removeGhost(View paramView)
  {
    
    if (sRemoveGhostMethod != null) {}
    try
    {
      sRemoveGhostMethod.invoke(null, new Object[] { paramView });
      return;
    }
    catch (InvocationTargetException paramView)
    {
      throw new RuntimeException(paramView.getCause());
      return;
    }
    catch (IllegalAccessException paramView) {}
  }
  
  public void reserveEndViewTransition(ViewGroup paramViewGroup, View paramView) {}
  
  public void setVisibility(int paramInt)
  {
    this.mGhostView.setVisibility(paramInt);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/transition/GhostViewApi21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */