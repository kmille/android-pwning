package butterknife;

import android.app.Activity;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ButterKnife
{
  @VisibleForTesting
  static final Map<Class<?>, Constructor<? extends Unbinder>> a = new LinkedHashMap();
  private static boolean b = false;
  
  private ButterKnife()
  {
    throw new AssertionError("No instances.");
  }
  
  @NonNull
  @UiThread
  public static Unbinder a(@NonNull Activity paramActivity)
  {
    return b(paramActivity, paramActivity.getWindow().getDecorView());
  }
  
  @NonNull
  @UiThread
  public static Unbinder a(@NonNull View paramView)
  {
    return b(paramView, paramView);
  }
  
  @NonNull
  @UiThread
  public static Unbinder a(@NonNull Object paramObject, @NonNull View paramView)
  {
    return b(paramObject, paramView);
  }
  
  @CheckResult
  @Nullable
  @UiThread
  private static Constructor<? extends Unbinder> a(Class<?> paramClass)
  {
    Object localObject = (Constructor)a.get(paramClass);
    if (localObject != null) {
      return (Constructor<? extends Unbinder>)localObject;
    }
    String str = paramClass.getName();
    if ((!str.startsWith("android.")) && (!str.startsWith("java."))) {}
    try
    {
      try
      {
        localObject = paramClass.getClassLoader();
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(str);
        localStringBuilder.append("_ViewBinding");
        localObject = ((ClassLoader)localObject).loadClass(localStringBuilder.toString()).getConstructor(new Class[] { paramClass, View.class });
      }
      catch (NoSuchMethodException paramClass)
      {
        throw new RuntimeException("Unable to find binding constructor for ".concat(String.valueOf(str)), paramClass);
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
    if (b) {
      new StringBuilder("Not found. Trying superclass ").append(paramClass.getSuperclass().getName());
    }
    localObject = a(paramClass.getSuperclass());
    a.put(paramClass, localObject);
    return (Constructor<? extends Unbinder>)localObject;
    return null;
  }
  
  private static Unbinder b(@NonNull Object paramObject, @NonNull View paramView)
  {
    Object localObject = paramObject.getClass();
    if (b) {
      new StringBuilder("Looking up binding for ").append(((Class)localObject).getName());
    }
    localObject = a((Class)localObject);
    if (localObject == null) {
      return Unbinder.a;
    }
    try
    {
      paramObject = (Unbinder)((Constructor)localObject).newInstance(new Object[] { paramObject, paramView });
      return (Unbinder)paramObject;
    }
    catch (InvocationTargetException paramObject)
    {
      paramObject = ((InvocationTargetException)paramObject).getCause();
      if (!(paramObject instanceof RuntimeException))
      {
        if ((paramObject instanceof Error)) {
          throw ((Error)paramObject);
        }
        throw new RuntimeException("Unable to create binding instance.", (Throwable)paramObject);
      }
      throw ((RuntimeException)paramObject);
    }
    catch (InstantiationException paramObject)
    {
      throw new RuntimeException("Unable to invoke ".concat(String.valueOf(localObject)), (Throwable)paramObject);
    }
    catch (IllegalAccessException paramObject)
    {
      throw new RuntimeException("Unable to invoke ".concat(String.valueOf(localObject)), (Throwable)paramObject);
    }
  }
  
  public static abstract interface Action<T extends View> {}
  
  public static abstract interface Setter<T extends View, V> {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/butterknife/ButterKnife.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */