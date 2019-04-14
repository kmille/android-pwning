package com.google.gson.internal.reflect;

import com.google.gson.internal.JavaVersion;
import java.lang.reflect.AccessibleObject;

public abstract class ReflectionAccessor
{
  private static final ReflectionAccessor instance;
  
  static
  {
    Object localObject;
    if (JavaVersion.getMajorJavaVersion() < 9) {
      localObject = new PreJava9ReflectionAccessor();
    } else {
      localObject = new UnsafeReflectionAccessor();
    }
    instance = (ReflectionAccessor)localObject;
  }
  
  public static ReflectionAccessor getInstance()
  {
    return instance;
  }
  
  public abstract void makeAccessible(AccessibleObject paramAccessibleObject);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/gson/internal/reflect/ReflectionAccessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */