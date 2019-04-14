package com.google.common.base;

import java.lang.reflect.Method;
import javax.annotation.Nullable;

public final class l
{
  @Nullable
  private static final Object a;
  @Nullable
  private static final Method b;
  @Nullable
  private static final Method c;
  
  static
  {
    Object localObject1 = a();
    a = localObject1;
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = a("getStackTraceElement", new Class[] { Throwable.class, Integer.TYPE });
    }
    b = (Method)localObject1;
    if (a == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = a("getStackTraceDepth", new Class[] { Throwable.class });
    }
    c = (Method)localObject1;
  }
  
  @Nullable
  private static Object a()
  {
    try
    {
      Object localObject = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
      return localObject;
    }
    catch (ThreadDeath localThreadDeath)
    {
      throw localThreadDeath;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  @Nullable
  private static Method a(String paramString, Class<?>... paramVarArgs)
    throws ThreadDeath
  {
    try
    {
      paramString = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(paramString, paramVarArgs);
      return paramString;
    }
    catch (ThreadDeath paramString)
    {
      throw paramString;
    }
    catch (Throwable paramString) {}
    return null;
  }
  
  public static void a(Throwable paramThrowable)
  {
    j.a(paramThrowable);
    if (!(paramThrowable instanceof RuntimeException))
    {
      if (!(paramThrowable instanceof Error)) {
        return;
      }
      throw ((Error)paramThrowable);
    }
    throw ((RuntimeException)paramThrowable);
  }
  
  public static <X extends Throwable> void a(@Nullable Throwable paramThrowable, Class<X> paramClass)
    throws Throwable
  {
    if (paramThrowable != null)
    {
      j.a(paramThrowable);
      if (paramClass.isInstance(paramThrowable)) {
        throw ((Throwable)paramClass.cast(paramThrowable));
      }
    }
    if (paramThrowable != null) {
      a(paramThrowable);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/base/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */