package android.support.transition;

import android.annotation.SuppressLint;
import android.support.annotation.RequiresApi;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(22)
class ViewUtilsApi22
  extends ViewUtilsApi21
{
  private static final String TAG = "ViewUtilsApi22";
  private static Method sSetLeftTopRightBottomMethod;
  private static boolean sSetLeftTopRightBottomMethodFetched;
  
  @SuppressLint({"PrivateApi"})
  private void fetchSetLeftTopRightBottomMethod()
  {
    if (!sSetLeftTopRightBottomMethodFetched) {}
    try
    {
      Method localMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", new Class[] { Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE });
      sSetLeftTopRightBottomMethod = localMethod;
      localMethod.setAccessible(true);
      sSetLeftTopRightBottomMethodFetched = true;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  public void setLeftTopRightBottom(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    fetchSetLeftTopRightBottomMethod();
    if (sSetLeftTopRightBottomMethod != null) {}
    try
    {
      sSetLeftTopRightBottomMethod.invoke(paramView, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      return;
    }
    catch (InvocationTargetException paramView)
    {
      throw new RuntimeException(paramView.getCause());
      return;
    }
    catch (IllegalAccessException paramView) {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/transition/ViewUtilsApi22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */