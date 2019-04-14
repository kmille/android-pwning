package android.support.transition;

import android.animation.LayoutTransition;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ViewGroupUtilsApi14
{
  private static final int LAYOUT_TRANSITION_CHANGING = 4;
  private static final String TAG = "ViewGroupUtilsApi14";
  private static Method sCancelMethod;
  private static boolean sCancelMethodFetched;
  private static LayoutTransition sEmptyLayoutTransition;
  private static Field sLayoutSuppressedField;
  private static boolean sLayoutSuppressedFieldFetched;
  
  private static void cancelLayoutTransition(LayoutTransition paramLayoutTransition)
  {
    if (!sCancelMethodFetched) {}
    try
    {
      Method localMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
      sCancelMethod = localMethod;
      localMethod.setAccessible(true);
      sCancelMethodFetched = true;
      if (sCancelMethod == null) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        try
        {
          sCancelMethod.invoke(paramLayoutTransition, new Object[0]);
          return;
        }
        catch (IllegalAccessException|InvocationTargetException paramLayoutTransition) {}
        localNoSuchMethodException = localNoSuchMethodException;
      }
    }
  }
  
  static void suppressLayout(@NonNull ViewGroup paramViewGroup, boolean paramBoolean)
  {
    Object localObject = sEmptyLayoutTransition;
    boolean bool = false;
    if (localObject == null)
    {
      localObject = new LayoutTransition()
      {
        public final boolean isChangingLayout()
        {
          return true;
        }
      };
      sEmptyLayoutTransition = (LayoutTransition)localObject;
      ((LayoutTransition)localObject).setAnimator(2, null);
      sEmptyLayoutTransition.setAnimator(0, null);
      sEmptyLayoutTransition.setAnimator(1, null);
      sEmptyLayoutTransition.setAnimator(3, null);
      sEmptyLayoutTransition.setAnimator(4, null);
    }
    if (paramBoolean)
    {
      localObject = paramViewGroup.getLayoutTransition();
      if (localObject != null)
      {
        if (((LayoutTransition)localObject).isRunning()) {
          cancelLayoutTransition((LayoutTransition)localObject);
        }
        if (localObject != sEmptyLayoutTransition) {
          paramViewGroup.setTag(R.id.transition_layout_save, localObject);
        }
      }
      paramViewGroup.setLayoutTransition(sEmptyLayoutTransition);
      return;
    }
    paramViewGroup.setLayoutTransition(null);
    if (!sLayoutSuppressedFieldFetched) {}
    try
    {
      localObject = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
      sLayoutSuppressedField = (Field)localObject;
      ((Field)localObject).setAccessible(true);
      sLayoutSuppressedFieldFetched = true;
      paramBoolean = bool;
      if (sLayoutSuppressedField == null) {}
    }
    catch (NoSuchFieldException localIllegalAccessException1)
    {
      try
      {
        paramBoolean = sLayoutSuppressedField.getBoolean(paramViewGroup);
        if (!paramBoolean) {}
      }
      catch (IllegalAccessException localIllegalAccessException1)
      {
        try
        {
          sLayoutSuppressedField.setBoolean(paramViewGroup, false);
          for (;;)
          {
            if (paramBoolean) {
              paramViewGroup.requestLayout();
            }
            localObject = (LayoutTransition)paramViewGroup.getTag(R.id.transition_layout_save);
            if (localObject != null)
            {
              paramViewGroup.setTag(R.id.transition_layout_save, null);
              paramViewGroup.setLayoutTransition((LayoutTransition)localObject);
            }
            return;
            localNoSuchFieldException = localNoSuchFieldException;
            break;
            localIllegalAccessException1 = localIllegalAccessException1;
            paramBoolean = bool;
          }
        }
        catch (IllegalAccessException localIllegalAccessException2)
        {
          for (;;) {}
        }
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/transition/ViewGroupUtilsApi14.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */