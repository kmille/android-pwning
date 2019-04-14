package butterknife.a;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.IdRes;
import android.util.TypedValue;
import android.view.View;

public final class b
{
  private static final TypedValue a = new TypedValue();
  
  private b()
  {
    throw new AssertionError("No instances.");
  }
  
  public static View a(View paramView, @IdRes int paramInt, String paramString)
  {
    Object localObject = paramView.findViewById(paramInt);
    if (localObject != null) {
      return (View)localObject;
    }
    paramView = a(paramView, paramInt);
    localObject = new StringBuilder("Required view '");
    ((StringBuilder)localObject).append(paramView);
    ((StringBuilder)localObject).append("' with ID ");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(" for ");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append(" was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public static <T> T a(View paramView, @IdRes int paramInt, String paramString, Class<T> paramClass)
  {
    return (T)c(paramView.findViewById(paramInt), paramInt, paramString, paramClass);
  }
  
  private static String a(View paramView, @IdRes int paramInt)
  {
    if (paramView.isInEditMode()) {
      return "<unavailable while editing>";
    }
    return paramView.getContext().getResources().getResourceEntryName(paramInt);
  }
  
  public static <T> T b(View paramView, @IdRes int paramInt, String paramString, Class<T> paramClass)
  {
    return (T)c(a(paramView, paramInt, paramString), paramInt, paramString, paramClass);
  }
  
  public static <T> T c(View paramView, @IdRes int paramInt, String paramString, Class<T> paramClass)
  {
    try
    {
      paramClass = paramClass.cast(paramView);
      return paramClass;
    }
    catch (ClassCastException paramClass)
    {
      paramView = a(paramView, paramInt);
      StringBuilder localStringBuilder = new StringBuilder("View '");
      localStringBuilder.append(paramView);
      localStringBuilder.append("' with ID ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" for ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(" was of the wrong type. See cause for more info.");
      throw new IllegalStateException(localStringBuilder.toString(), paramClass);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/butterknife/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */