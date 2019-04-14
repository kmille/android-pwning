package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzzv<MessageType extends zzzv<MessageType, BuilderType>, BuilderType>
  extends zzyz<MessageType, BuilderType>
{
  private static Map<Object, zzzv<?, ?>> zzbuh = new ConcurrentHashMap();
  protected zzabp zzbuf = zzabp.zzvf();
  private int zzbug = -1;
  
  static Object zza(Method paramMethod, Object paramObject, Object... paramVarArgs)
  {
    try
    {
      paramMethod = paramMethod.invoke(paramObject, paramVarArgs);
      return paramMethod;
    }
    catch (InvocationTargetException paramMethod)
    {
      paramMethod = paramMethod.getCause();
      if (!(paramMethod instanceof RuntimeException))
      {
        if ((paramMethod instanceof Error)) {
          throw ((Error)paramMethod);
        }
        throw new RuntimeException("Unexpected exception thrown by generated accessor method.", paramMethod);
      }
      throw ((RuntimeException)paramMethod);
    }
    catch (IllegalAccessException paramMethod)
    {
      throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", paramMethod);
    }
  }
  
  static <T extends zzzv<?, ?>> T zzf(Class<T> paramClass)
  {
    zzzv localzzzv2 = (zzzv)zzbuh.get(paramClass);
    zzzv localzzzv1 = localzzzv2;
    if (localzzzv2 == null) {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localzzzv1 = (zzzv)zzbuh.get(paramClass);
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new IllegalStateException("Class initialization cannot fail.", paramClass);
      }
    }
    if (localzzzv1 == null)
    {
      paramClass = String.valueOf(paramClass.getName());
      if (paramClass.length() != 0) {
        paramClass = "Unable to get default instance for: ".concat(paramClass);
      } else {
        paramClass = new String("Unable to get default instance for: ");
      }
      throw new IllegalStateException(paramClass);
    }
    return localzzzv1;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!((zzzv)zza(6, null, null)).getClass().isInstance(paramObject)) {
      return false;
    }
    return zzaay.zzus().zzt(this).equals(this, (zzzv)paramObject);
  }
  
  public int hashCode()
  {
    if (this.zzbta != 0) {
      return this.zzbta;
    }
    this.zzbta = zzaay.zzus().zzt(this).hashCode(this);
    return this.zzbta;
  }
  
  public String toString()
  {
    return zzaas.zza(this, super.toString());
  }
  
  protected abstract Object zza(int paramInt, Object paramObject1, Object paramObject2);
  
  public static abstract class zza<MessageType extends zza<MessageType, BuilderType>, BuilderType>
    extends zzzv<MessageType, BuilderType>
    implements zzaar
  {
    protected zzzr<Object> zzbui = zzzr.zztx();
  }
  
  public static enum zzb {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */