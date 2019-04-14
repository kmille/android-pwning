package b.f.b;

import b.c;
import b.t;
import java.util.Arrays;
import java.util.List;

public class j
{
  public static int a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2) {
      return -1;
    }
    if (paramInt1 == paramInt2) {
      return 0;
    }
    return 1;
  }
  
  private static <T extends Throwable> T a(T paramT)
  {
    return a(paramT, j.class.getName());
  }
  
  static <T extends Throwable> T a(T paramT, String paramString)
  {
    StackTraceElement[] arrayOfStackTraceElement = paramT.getStackTrace();
    int k = arrayOfStackTraceElement.length;
    int j = -1;
    int i = 0;
    while (i < k)
    {
      if (paramString.equals(arrayOfStackTraceElement[i].getClassName())) {
        j = i;
      }
      i += 1;
    }
    paramString = Arrays.asList(arrayOfStackTraceElement).subList(j + 1, k);
    paramT.setStackTrace((StackTraceElement[])paramString.toArray(new StackTraceElement[paramString.size()]));
    return paramT;
  }
  
  public static void a()
  {
    throw ((c)a(new c()));
  }
  
  public static void a(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return;
    }
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append(paramString);
    ((StringBuilder)paramObject).append(" must not be null");
    throw ((IllegalStateException)a(new IllegalStateException(((StringBuilder)paramObject).toString())));
  }
  
  public static void a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder("lateinit property ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" has not been initialized");
    throw ((t)a(new t(localStringBuilder.toString())));
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
  }
  
  public static void b(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return;
    }
    Object localObject = Thread.currentThread().getStackTrace()[3];
    paramObject = ((StackTraceElement)localObject).getClassName();
    localObject = ((StackTraceElement)localObject).getMethodName();
    StringBuilder localStringBuilder = new StringBuilder("Parameter specified as non-null is null: method ");
    localStringBuilder.append((String)paramObject);
    localStringBuilder.append(".");
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(", parameter ");
    localStringBuilder.append(paramString);
    throw ((IllegalArgumentException)a(new IllegalArgumentException(localStringBuilder.toString())));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/f/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */