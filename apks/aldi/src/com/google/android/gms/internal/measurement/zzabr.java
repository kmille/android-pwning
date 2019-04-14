package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzabr
{
  private static final Logger logger = Logger.getLogger(zzabr.class.getName());
  private static final Class<?> zzbtc;
  private static final Unsafe zzbvq = zzvg();
  private static final boolean zzbwu;
  private static final boolean zzbwv;
  private static final zzd zzbww;
  private static final boolean zzbwx;
  private static final boolean zzbwy;
  private static final long zzbwz;
  private static final long zzbxa;
  private static final long zzbxb;
  private static final long zzbxc;
  private static final long zzbxd;
  private static final long zzbxe;
  private static final long zzbxf;
  private static final long zzbxg;
  private static final long zzbxh;
  private static final long zzbxi;
  private static final long zzbxj;
  private static final long zzbxk;
  private static final long zzbxl;
  private static final long zzbxm;
  private static final long zzbxn;
  private static final boolean zzbxo;
  
  static
  {
    zzbtc = zzza.zztl();
    zzbwu = zzk(Long.TYPE);
    zzbwv = zzk(Integer.TYPE);
    if (zzbvq == null) {}
    do
    {
      localObject = null;
      break label109;
      if (!zzza.zztk()) {
        break;
      }
      if (zzbwu)
      {
        localObject = new zzb(zzbvq);
        break label109;
      }
    } while (!zzbwv);
    Object localObject = new zza(zzbvq);
    break label109;
    localObject = new zzc(zzbvq);
    label109:
    zzbww = (zzd)localObject;
    zzbwx = zzvi();
    zzbwy = zzvh();
    zzbwz = zzi(byte[].class);
    zzbxa = zzi(boolean[].class);
    zzbxb = zzj(boolean[].class);
    zzbxc = zzi(int[].class);
    zzbxd = zzj(int[].class);
    zzbxe = zzi(long[].class);
    zzbxf = zzj(long[].class);
    zzbxg = zzi(float[].class);
    zzbxh = zzj(float[].class);
    zzbxi = zzi(double[].class);
    zzbxj = zzj(double[].class);
    zzbxk = zzi(Object[].class);
    zzbxl = zzj(Object[].class);
    zzbxm = zza(zzvj());
    localObject = zza(String.class, "value");
    if ((localObject == null) || (((Field)localObject).getType() != char[].class)) {
      localObject = null;
    }
    zzbxn = zza((Field)localObject);
    boolean bool;
    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
      bool = true;
    } else {
      bool = false;
    }
    zzbxo = bool;
  }
  
  private static long zza(Field paramField)
  {
    if ((paramField != null) && (zzbww != null)) {
      return zzbww.zzbxp.objectFieldOffset(paramField);
    }
    return -1L;
  }
  
  private static Field zza(Class<?> paramClass, String paramString)
  {
    try
    {
      paramClass = paramClass.getDeclaredField(paramString);
      paramClass.setAccessible(true);
      return paramClass;
    }
    catch (Throwable paramClass)
    {
      for (;;) {}
    }
    return null;
  }
  
  private static int zzi(Class<?> paramClass)
  {
    if (zzbwy) {
      return zzbww.zzbxp.arrayBaseOffset(paramClass);
    }
    return -1;
  }
  
  private static int zzj(Class<?> paramClass)
  {
    if (zzbwy) {
      return zzbww.zzbxp.arrayIndexScale(paramClass);
    }
    return -1;
  }
  
  private static boolean zzk(Class<?> paramClass)
  {
    if (!zzza.zztk()) {
      return false;
    }
    try
    {
      Class localClass = zzbtc;
      localClass.getMethod("peekLong", new Class[] { paramClass, Boolean.TYPE });
      localClass.getMethod("pokeLong", new Class[] { paramClass, Long.TYPE, Boolean.TYPE });
      localClass.getMethod("pokeInt", new Class[] { paramClass, Integer.TYPE, Boolean.TYPE });
      localClass.getMethod("peekInt", new Class[] { paramClass, Boolean.TYPE });
      localClass.getMethod("pokeByte", new Class[] { paramClass, Byte.TYPE });
      localClass.getMethod("peekByte", new Class[] { paramClass });
      localClass.getMethod("pokeByteArray", new Class[] { paramClass, byte[].class, Integer.TYPE, Integer.TYPE });
      localClass.getMethod("peekByteArray", new Class[] { paramClass, byte[].class, Integer.TYPE, Integer.TYPE });
      return true;
    }
    catch (Throwable paramClass) {}
    return false;
  }
  
  static Unsafe zzvg()
  {
    try
    {
      Unsafe localUnsafe = (Unsafe)AccessController.doPrivileged(new zzabs());
      return localUnsafe;
    }
    catch (Throwable localThrowable)
    {
      for (;;) {}
    }
    return null;
  }
  
  private static boolean zzvh()
  {
    if (zzbvq == null) {
      return false;
    }
    try
    {
      localObject = zzbvq.getClass();
      ((Class)localObject).getMethod("objectFieldOffset", new Class[] { Field.class });
      ((Class)localObject).getMethod("arrayBaseOffset", new Class[] { Class.class });
      ((Class)localObject).getMethod("arrayIndexScale", new Class[] { Class.class });
      ((Class)localObject).getMethod("getInt", new Class[] { Object.class, Long.TYPE });
      ((Class)localObject).getMethod("putInt", new Class[] { Object.class, Long.TYPE, Integer.TYPE });
      ((Class)localObject).getMethod("getLong", new Class[] { Object.class, Long.TYPE });
      ((Class)localObject).getMethod("putLong", new Class[] { Object.class, Long.TYPE, Long.TYPE });
      ((Class)localObject).getMethod("getObject", new Class[] { Object.class, Long.TYPE });
      ((Class)localObject).getMethod("putObject", new Class[] { Object.class, Long.TYPE, Object.class });
      if (zzza.zztk()) {
        return true;
      }
      ((Class)localObject).getMethod("getByte", new Class[] { Object.class, Long.TYPE });
      ((Class)localObject).getMethod("putByte", new Class[] { Object.class, Long.TYPE, Byte.TYPE });
      ((Class)localObject).getMethod("getBoolean", new Class[] { Object.class, Long.TYPE });
      ((Class)localObject).getMethod("putBoolean", new Class[] { Object.class, Long.TYPE, Boolean.TYPE });
      ((Class)localObject).getMethod("getFloat", new Class[] { Object.class, Long.TYPE });
      ((Class)localObject).getMethod("putFloat", new Class[] { Object.class, Long.TYPE, Float.TYPE });
      ((Class)localObject).getMethod("getDouble", new Class[] { Object.class, Long.TYPE });
      ((Class)localObject).getMethod("putDouble", new Class[] { Object.class, Long.TYPE, Double.TYPE });
      return true;
    }
    catch (Throwable localThrowable)
    {
      Object localObject = logger;
      Level localLevel = Level.WARNING;
      String str = String.valueOf(localThrowable);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 71);
      localStringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
      localStringBuilder.append(str);
      ((Logger)localObject).logp(localLevel, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", localStringBuilder.toString());
    }
    return false;
  }
  
  private static boolean zzvi()
  {
    if (zzbvq == null) {
      return false;
    }
    try
    {
      localObject = zzbvq.getClass();
      ((Class)localObject).getMethod("objectFieldOffset", new Class[] { Field.class });
      ((Class)localObject).getMethod("getLong", new Class[] { Object.class, Long.TYPE });
      if (zzvj() == null) {
        return false;
      }
      if (zzza.zztk()) {
        return true;
      }
      ((Class)localObject).getMethod("getByte", new Class[] { Long.TYPE });
      ((Class)localObject).getMethod("putByte", new Class[] { Long.TYPE, Byte.TYPE });
      ((Class)localObject).getMethod("getInt", new Class[] { Long.TYPE });
      ((Class)localObject).getMethod("putInt", new Class[] { Long.TYPE, Integer.TYPE });
      ((Class)localObject).getMethod("getLong", new Class[] { Long.TYPE });
      ((Class)localObject).getMethod("putLong", new Class[] { Long.TYPE, Long.TYPE });
      ((Class)localObject).getMethod("copyMemory", new Class[] { Long.TYPE, Long.TYPE, Long.TYPE });
      ((Class)localObject).getMethod("copyMemory", new Class[] { Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE });
      return true;
    }
    catch (Throwable localThrowable)
    {
      Object localObject = logger;
      Level localLevel = Level.WARNING;
      String str = String.valueOf(localThrowable);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 71);
      localStringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
      localStringBuilder.append(str);
      ((Logger)localObject).logp(localLevel, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", localStringBuilder.toString());
    }
    return false;
  }
  
  private static Field zzvj()
  {
    if (zzza.zztk())
    {
      localField = zza(Buffer.class, "effectiveDirectAddress");
      if (localField != null) {
        return localField;
      }
    }
    Field localField = zza(Buffer.class, "address");
    if ((localField != null) && (localField.getType() == Long.TYPE)) {
      return localField;
    }
    return null;
  }
  
  static final class zza
    extends zzabr.zzd
  {
    zza(Unsafe paramUnsafe)
    {
      super();
    }
  }
  
  static final class zzb
    extends zzabr.zzd
  {
    zzb(Unsafe paramUnsafe)
    {
      super();
    }
  }
  
  static final class zzc
    extends zzabr.zzd
  {
    zzc(Unsafe paramUnsafe)
    {
      super();
    }
  }
  
  static abstract class zzd
  {
    Unsafe zzbxp;
    
    zzd(Unsafe paramUnsafe)
    {
      this.zzbxp = paramUnsafe;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzabr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */