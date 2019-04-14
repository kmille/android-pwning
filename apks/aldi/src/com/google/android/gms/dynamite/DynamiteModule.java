package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public final class DynamiteModule
{
  @KeepForSdk
  public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzd();
  @KeepForSdk
  public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zze();
  @KeepForSdk
  public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzf();
  @KeepForSdk
  public static final VersionPolicy PREFER_REMOTE;
  @GuardedBy("DynamiteModule.class")
  private static Boolean zzid;
  @GuardedBy("DynamiteModule.class")
  private static zzi zzie;
  @GuardedBy("DynamiteModule.class")
  private static zzk zzif;
  @GuardedBy("DynamiteModule.class")
  private static String zzig;
  @GuardedBy("DynamiteModule.class")
  private static int zzih = -1;
  private static final ThreadLocal<zza> zzii = new ThreadLocal();
  private static final DynamiteModule.VersionPolicy.zza zzij = new zza();
  private static final VersionPolicy zzik;
  private static final VersionPolicy zzil = new zzg();
  private final Context zzim;
  
  static
  {
    PREFER_REMOTE = new zzb();
    zzik = new zzc();
  }
  
  private DynamiteModule(Context paramContext)
  {
    this.zzim = ((Context)Preconditions.checkNotNull(paramContext));
  }
  
  @KeepForSdk
  public static int getLocalVersion(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getApplicationContext().getClassLoader();
      Object localObject = new StringBuilder(String.valueOf(paramString).length() + 61);
      ((StringBuilder)localObject).append("com.google.android.gms.dynamite.descriptors.");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(".ModuleDescriptor");
      localObject = paramContext.loadClass(((StringBuilder)localObject).toString());
      paramContext = ((Class)localObject).getDeclaredField("MODULE_ID");
      localObject = ((Class)localObject).getDeclaredField("MODULE_VERSION");
      if (!paramContext.get(null).equals(paramString))
      {
        paramContext = String.valueOf(paramContext.get(null));
        localObject = new StringBuilder(String.valueOf(paramContext).length() + 51 + String.valueOf(paramString).length());
        ((StringBuilder)localObject).append("Module descriptor id '");
        ((StringBuilder)localObject).append(paramContext);
        ((StringBuilder)localObject).append("' didn't match expected id '");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append("'");
        Log.e("DynamiteModule", ((StringBuilder)localObject).toString());
        return 0;
      }
      int i = ((Field)localObject).getInt(null);
      return i;
    }
    catch (Exception paramContext)
    {
      paramContext = String.valueOf(paramContext.getMessage());
      if (paramContext.length() != 0) {
        paramContext = "Failed to load module descriptor class: ".concat(paramContext);
      } else {
        paramContext = new String("Failed to load module descriptor class: ");
      }
      Log.e("DynamiteModule", paramContext);
      return 0;
      paramContext = new StringBuilder(String.valueOf(paramString).length() + 45);
      paramContext.append("Local module descriptor class for ");
      paramContext.append(paramString);
      paramContext.append(" not found.");
      return 0;
    }
    catch (ClassNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
  
  @KeepForSdk
  public static int getRemoteVersion(Context paramContext, String paramString)
  {
    return zza(paramContext, paramString, false);
  }
  
  @KeepForSdk
  public static DynamiteModule load(Context paramContext, VersionPolicy paramVersionPolicy, String paramString)
    throws DynamiteModule.LoadingException
  {
    zza localzza1 = (zza)zzii.get();
    zza localzza2 = new zza(null);
    zzii.set(localzza2);
    try
    {
      DynamiteModule.VersionPolicy.zzb localzzb = paramVersionPolicy.zza(paramContext, paramString, zzij);
      int i = localzzb.zziq;
      int j = localzzb.zzir;
      Object localObject = new StringBuilder(String.valueOf(paramString).length() + 68 + String.valueOf(paramString).length());
      ((StringBuilder)localObject).append("Considering local module ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(":");
      ((StringBuilder)localObject).append(i);
      ((StringBuilder)localObject).append(" and remote module ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(":");
      ((StringBuilder)localObject).append(j);
      if ((localzzb.zzis != 0) && ((localzzb.zzis != -1) || (localzzb.zziq != 0)) && ((localzzb.zzis != 1) || (localzzb.zzir != 0)))
      {
        if (localzzb.zzis == -1)
        {
          paramVersionPolicy = zze(paramContext, paramString);
          paramContext = paramVersionPolicy;
          if (localzza2.zzin != null) {
            paramContext = paramVersionPolicy;
          }
        }
        for (;;)
        {
          localzza2.zzin.close();
          label222:
          zzii.set(localzza1);
          return paramContext;
          i = localzzb.zzis;
          if (i == 1) {
            try
            {
              localObject = zza(paramContext, paramString, localzzb.zzir);
              return (DynamiteModule)localObject;
            }
            catch (LoadingException localLoadingException)
            {
              String str = String.valueOf(localLoadingException.getMessage());
              if (str.length() != 0) {
                "Failed to load remote module: ".concat(str);
              } else {
                new String("Failed to load remote module: ");
              }
              if ((localzzb.zziq != 0) && (paramVersionPolicy.zza(paramContext, paramString, new zzb(localzzb.zziq, 0)).zzis == -1))
              {
                paramVersionPolicy = zze(paramContext, paramString);
                paramContext = paramVersionPolicy;
                if (localzza2.zzin == null) {
                  break label222;
                }
                paramContext = paramVersionPolicy;
              }
              else
              {
                throw new LoadingException("Remote load failed. No local fallback found.", localLoadingException, null);
              }
            }
          }
        }
        i = localzzb.zzis;
        paramContext = new StringBuilder(47);
        paramContext.append("VersionPolicy returned invalid code:");
        paramContext.append(i);
        throw new LoadingException(paramContext.toString(), null);
      }
      i = localzzb.zziq;
      j = localzzb.zzir;
      paramContext = new StringBuilder(91);
      paramContext.append("No acceptable module found. Local version is ");
      paramContext.append(i);
      paramContext.append(" and remote version is ");
      paramContext.append(j);
      paramContext.append(".");
      throw new LoadingException(paramContext.toString(), null);
    }
    finally
    {
      if (localzza2.zzin != null) {
        localzza2.zzin.close();
      }
      zzii.set(localzza1);
    }
  }
  
  /* Error */
  public static int zza(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 294	com/google/android/gms/dynamite/DynamiteModule:zzid	Ljava/lang/Boolean;
    //   6: astore 6
    //   8: aload 6
    //   10: astore 5
    //   12: aload 6
    //   14: ifnonnull +263 -> 277
    //   17: aload_0
    //   18: invokevirtual 119	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   21: invokevirtual 123	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   24: ldc 6
    //   26: invokevirtual 297	java/lang/Class:getName	()Ljava/lang/String;
    //   29: invokevirtual 156	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   32: astore 6
    //   34: aload 6
    //   36: ldc_w 299
    //   39: invokevirtual 164	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   42: astore 5
    //   44: aload 6
    //   46: monitorenter
    //   47: aload 5
    //   49: aconst_null
    //   50: invokevirtual 171	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   53: checkcast 152	java/lang/ClassLoader
    //   56: astore 7
    //   58: aload 7
    //   60: ifnull +32 -> 92
    //   63: aload 7
    //   65: invokestatic 302	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   68: if_acmpne +11 -> 79
    //   71: getstatic 307	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   74: astore 5
    //   76: goto +131 -> 207
    //   79: aload 7
    //   81: invokestatic 310	com/google/android/gms/dynamite/DynamiteModule:zza	(Ljava/lang/ClassLoader;)V
    //   84: getstatic 313	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   87: astore 5
    //   89: goto +118 -> 207
    //   92: ldc_w 315
    //   95: aload_0
    //   96: invokevirtual 119	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   99: invokevirtual 318	android/content/Context:getPackageName	()Ljava/lang/String;
    //   102: invokevirtual 319	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   105: ifeq +15 -> 120
    //   108: aload 5
    //   110: aconst_null
    //   111: invokestatic 302	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   114: invokevirtual 322	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   117: goto -46 -> 71
    //   120: aload_0
    //   121: aload_1
    //   122: iload_2
    //   123: invokestatic 325	com/google/android/gms/dynamite/DynamiteModule:zzc	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   126: istore_3
    //   127: getstatic 327	com/google/android/gms/dynamite/DynamiteModule:zzig	Ljava/lang/String;
    //   130: ifnull +57 -> 187
    //   133: getstatic 327	com/google/android/gms/dynamite/DynamiteModule:zzig	Ljava/lang/String;
    //   136: invokevirtual 331	java/lang/String:isEmpty	()Z
    //   139: ifeq +6 -> 145
    //   142: goto +45 -> 187
    //   145: new 333	com/google/android/gms/dynamite/zzh
    //   148: dup
    //   149: getstatic 327	com/google/android/gms/dynamite/DynamiteModule:zzig	Ljava/lang/String;
    //   152: invokestatic 302	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   155: invokespecial 336	com/google/android/gms/dynamite/zzh:<init>	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   158: astore 7
    //   160: aload 7
    //   162: invokestatic 310	com/google/android/gms/dynamite/DynamiteModule:zza	(Ljava/lang/ClassLoader;)V
    //   165: aload 5
    //   167: aconst_null
    //   168: aload 7
    //   170: invokevirtual 322	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   173: getstatic 313	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   176: putstatic 294	com/google/android/gms/dynamite/DynamiteModule:zzid	Ljava/lang/Boolean;
    //   179: aload 6
    //   181: monitorexit
    //   182: ldc 2
    //   184: monitorexit
    //   185: iload_3
    //   186: ireturn
    //   187: aload 6
    //   189: monitorexit
    //   190: ldc 2
    //   192: monitorexit
    //   193: iload_3
    //   194: ireturn
    //   195: aload 5
    //   197: aconst_null
    //   198: invokestatic 302	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   201: invokevirtual 322	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   204: goto -133 -> 71
    //   207: aload 6
    //   209: monitorexit
    //   210: goto +62 -> 272
    //   213: astore 5
    //   215: aload 6
    //   217: monitorexit
    //   218: aload 5
    //   220: athrow
    //   221: astore 5
    //   223: aload 5
    //   225: invokestatic 131	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   228: astore 5
    //   230: new 125	java/lang/StringBuilder
    //   233: dup
    //   234: aload 5
    //   236: invokestatic 131	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   239: invokevirtual 135	java/lang/String:length	()I
    //   242: bipush 30
    //   244: iadd
    //   245: invokespecial 138	java/lang/StringBuilder:<init>	(I)V
    //   248: astore 6
    //   250: aload 6
    //   252: ldc_w 338
    //   255: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: pop
    //   259: aload 6
    //   261: aload 5
    //   263: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: pop
    //   267: getstatic 307	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   270: astore 5
    //   272: aload 5
    //   274: putstatic 294	com/google/android/gms/dynamite/DynamiteModule:zzid	Ljava/lang/Boolean;
    //   277: ldc 2
    //   279: monitorexit
    //   280: aload 5
    //   282: invokevirtual 341	java/lang/Boolean:booleanValue	()Z
    //   285: istore 4
    //   287: iload 4
    //   289: ifeq +53 -> 342
    //   292: aload_0
    //   293: aload_1
    //   294: iload_2
    //   295: invokestatic 325	com/google/android/gms/dynamite/DynamiteModule:zzc	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   298: istore_3
    //   299: iload_3
    //   300: ireturn
    //   301: astore_1
    //   302: aload_1
    //   303: invokevirtual 264	com/google/android/gms/dynamite/DynamiteModule$LoadingException:getMessage	()Ljava/lang/String;
    //   306: invokestatic 131	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   309: astore_1
    //   310: aload_1
    //   311: invokevirtual 135	java/lang/String:length	()I
    //   314: ifeq +14 -> 328
    //   317: ldc_w 343
    //   320: aload_1
    //   321: invokevirtual 202	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   324: pop
    //   325: goto +51 -> 376
    //   328: new 127	java/lang/String
    //   331: dup
    //   332: ldc_w 343
    //   335: invokespecial 205	java/lang/String:<init>	(Ljava/lang/String;)V
    //   338: pop
    //   339: goto +37 -> 376
    //   342: aload_0
    //   343: aload_1
    //   344: iload_2
    //   345: invokestatic 345	com/google/android/gms/dynamite/DynamiteModule:zzb	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   348: istore_3
    //   349: iload_3
    //   350: ireturn
    //   351: astore_1
    //   352: ldc 2
    //   354: monitorexit
    //   355: aload_1
    //   356: athrow
    //   357: astore_1
    //   358: aload_0
    //   359: aload_1
    //   360: invokestatic 351	com/google/android/gms/common/util/CrashUtils:addDynamiteErrorToDropBox	(Landroid/content/Context;Ljava/lang/Throwable;)Z
    //   363: pop
    //   364: aload_1
    //   365: athrow
    //   366: astore 5
    //   368: goto -284 -> 84
    //   371: astore 7
    //   373: goto -178 -> 195
    //   376: iconst_0
    //   377: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	378	0	paramContext	Context
    //   0	378	1	paramString	String
    //   0	378	2	paramBoolean	boolean
    //   126	224	3	i	int
    //   285	3	4	bool	boolean
    //   10	186	5	localObject1	Object
    //   213	6	5	localObject2	Object
    //   221	3	5	localClassNotFoundException	ClassNotFoundException
    //   228	53	5	localObject3	Object
    //   366	1	5	localLoadingException1	LoadingException
    //   6	254	6	localObject4	Object
    //   56	113	7	localObject5	Object
    //   371	1	7	localLoadingException2	LoadingException
    // Exception table:
    //   from	to	target	type
    //   47	58	213	finally
    //   63	71	213	finally
    //   71	76	213	finally
    //   79	84	213	finally
    //   84	89	213	finally
    //   92	117	213	finally
    //   120	142	213	finally
    //   145	179	213	finally
    //   179	182	213	finally
    //   187	190	213	finally
    //   195	204	213	finally
    //   207	210	213	finally
    //   215	218	213	finally
    //   17	47	221	java/lang/ClassNotFoundException
    //   17	47	221	java/lang/IllegalAccessException
    //   17	47	221	java/lang/NoSuchFieldException
    //   218	221	221	java/lang/ClassNotFoundException
    //   218	221	221	java/lang/IllegalAccessException
    //   218	221	221	java/lang/NoSuchFieldException
    //   292	299	301	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   3	8	351	finally
    //   17	47	351	finally
    //   182	185	351	finally
    //   190	193	351	finally
    //   218	221	351	finally
    //   223	272	351	finally
    //   272	277	351	finally
    //   277	280	351	finally
    //   352	355	351	finally
    //   0	3	357	java/lang/Throwable
    //   280	287	357	java/lang/Throwable
    //   292	299	357	java/lang/Throwable
    //   302	325	357	java/lang/Throwable
    //   328	339	357	java/lang/Throwable
    //   342	349	357	java/lang/Throwable
    //   355	357	357	java/lang/Throwable
    //   79	84	366	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   120	142	371	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   145	179	371	com/google/android/gms/dynamite/DynamiteModule$LoadingException
  }
  
  private static Context zza(Context paramContext, String paramString, int paramInt, Cursor paramCursor, zzk paramzzk)
  {
    try
    {
      ObjectWrapper.wrap(null);
      if (zzai().booleanValue()) {
        paramContext = paramzzk.zzb(ObjectWrapper.wrap(paramContext), paramString, paramInt, ObjectWrapper.wrap(paramCursor));
      } else {
        paramContext = paramzzk.zza(ObjectWrapper.wrap(paramContext), paramString, paramInt, ObjectWrapper.wrap(paramCursor));
      }
      paramContext = (Context)ObjectWrapper.unwrap(paramContext);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramContext = String.valueOf(paramContext.toString());
      if (paramContext.length() != 0) {
        paramContext = "Failed to load DynamiteLoader: ".concat(paramContext);
      } else {
        paramContext = new String("Failed to load DynamiteLoader: ");
      }
      Log.e("DynamiteModule", paramContext);
    }
    return null;
  }
  
  /* Error */
  private static DynamiteModule zza(Context paramContext, String paramString, int paramInt)
    throws DynamiteModule.LoadingException
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 294	com/google/android/gms/dynamite/DynamiteModule:zzid	Ljava/lang/Boolean;
    //   6: astore_3
    //   7: ldc 2
    //   9: monitorexit
    //   10: aload_3
    //   11: ifnull +24 -> 35
    //   14: aload_3
    //   15: invokevirtual 341	java/lang/Boolean:booleanValue	()Z
    //   18: ifeq +10 -> 28
    //   21: aload_0
    //   22: aload_1
    //   23: iload_2
    //   24: invokestatic 378	com/google/android/gms/dynamite/DynamiteModule:zzc	(Landroid/content/Context;Ljava/lang/String;I)Lcom/google/android/gms/dynamite/DynamiteModule;
    //   27: areturn
    //   28: aload_0
    //   29: aload_1
    //   30: iload_2
    //   31: invokestatic 380	com/google/android/gms/dynamite/DynamiteModule:zzb	(Landroid/content/Context;Ljava/lang/String;I)Lcom/google/android/gms/dynamite/DynamiteModule;
    //   34: areturn
    //   35: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   38: dup
    //   39: ldc_w 382
    //   42: aconst_null
    //   43: invokespecial 279	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/zza;)V
    //   46: athrow
    //   47: astore_1
    //   48: ldc 2
    //   50: monitorexit
    //   51: aload_1
    //   52: athrow
    //   53: astore_1
    //   54: aload_0
    //   55: aload_1
    //   56: invokestatic 351	com/google/android/gms/common/util/CrashUtils:addDynamiteErrorToDropBox	(Landroid/content/Context;Ljava/lang/Throwable;)Z
    //   59: pop
    //   60: aload_1
    //   61: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	paramContext	Context
    //   0	62	1	paramString	String
    //   0	62	2	paramInt	int
    //   6	9	3	localBoolean	Boolean
    // Exception table:
    //   from	to	target	type
    //   3	10	47	finally
    //   48	51	47	finally
    //   0	3	53	java/lang/Throwable
    //   14	28	53	java/lang/Throwable
    //   28	35	53	java/lang/Throwable
    //   35	47	53	java/lang/Throwable
    //   51	53	53	java/lang/Throwable
  }
  
  @GuardedBy("DynamiteModule.class")
  private static void zza(ClassLoader paramClassLoader)
    throws DynamiteModule.LoadingException
  {
    try
    {
      paramClassLoader = (IBinder)paramClassLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
      if (paramClassLoader == null)
      {
        paramClassLoader = null;
      }
      else
      {
        IInterface localIInterface = paramClassLoader.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
        if ((localIInterface instanceof zzk)) {
          paramClassLoader = (zzk)localIInterface;
        } else {
          paramClassLoader = new zzl(paramClassLoader);
        }
      }
      zzif = paramClassLoader;
      return;
    }
    catch (ClassNotFoundException|IllegalAccessException|InstantiationException|InvocationTargetException|NoSuchMethodException paramClassLoader)
    {
      throw new LoadingException("Failed to instantiate dynamite loader", paramClassLoader, null);
    }
  }
  
  private static Boolean zzai()
  {
    for (;;)
    {
      try
      {
        if (zzih >= 2)
        {
          bool = true;
          return Boolean.valueOf(bool);
        }
      }
      finally {}
      boolean bool = false;
    }
  }
  
  private static int zzb(Context paramContext, String paramString, boolean paramBoolean)
  {
    zzi localzzi = zzj(paramContext);
    if (localzzi == null) {
      return 0;
    }
    try
    {
      if (localzzi.zzaj() >= 2) {
        return localzzi.zzb(ObjectWrapper.wrap(paramContext), paramString, paramBoolean);
      }
      int i = localzzi.zza(ObjectWrapper.wrap(paramContext), paramString, paramBoolean);
      return i;
    }
    catch (RemoteException paramContext)
    {
      paramContext = String.valueOf(paramContext.getMessage());
      if (paramContext.length() != 0)
      {
        "Failed to retrieve remote module version: ".concat(paramContext);
        return 0;
      }
      new String("Failed to retrieve remote module version: ");
    }
    return 0;
  }
  
  private static DynamiteModule zzb(Context paramContext, String paramString, int paramInt)
    throws DynamiteModule.LoadingException
  {
    Object localObject = new StringBuilder(String.valueOf(paramString).length() + 51);
    ((StringBuilder)localObject).append("Selected remote version of ");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append(", version >= ");
    ((StringBuilder)localObject).append(paramInt);
    localObject = zzj(paramContext);
    if (localObject != null) {
      try
      {
        if (((zzi)localObject).zzaj() >= 2) {
          paramContext = ((zzi)localObject).zzb(ObjectWrapper.wrap(paramContext), paramString, paramInt);
        } else {
          paramContext = ((zzi)localObject).zza(ObjectWrapper.wrap(paramContext), paramString, paramInt);
        }
        if (ObjectWrapper.unwrap(paramContext) != null) {
          return new DynamiteModule((Context)ObjectWrapper.unwrap(paramContext));
        }
        throw new LoadingException("Failed to load remote module.", null);
      }
      catch (RemoteException paramContext)
      {
        throw new LoadingException("Failed to load remote module.", paramContext, null);
      }
    }
    throw new LoadingException("Failed to create IDynamiteLoader.", null);
  }
  
  /* Error */
  private static int zzc(Context paramContext, String paramString, boolean paramBoolean)
    throws DynamiteModule.LoadingException
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_0
    //   4: invokevirtual 458	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   7: astore 6
    //   9: iload_2
    //   10: ifeq +279 -> 289
    //   13: ldc_w 460
    //   16: astore_0
    //   17: goto +3 -> 20
    //   20: new 125	java/lang/StringBuilder
    //   23: dup
    //   24: aload_0
    //   25: invokestatic 131	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   28: invokevirtual 135	java/lang/String:length	()I
    //   31: bipush 42
    //   33: iadd
    //   34: aload_1
    //   35: invokestatic 131	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   38: invokevirtual 135	java/lang/String:length	()I
    //   41: iadd
    //   42: invokespecial 138	java/lang/StringBuilder:<init>	(I)V
    //   45: astore 7
    //   47: aload 7
    //   49: ldc_w 462
    //   52: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: aload 7
    //   58: aload_0
    //   59: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: aload 7
    //   65: ldc_w 464
    //   68: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload 7
    //   74: aload_1
    //   75: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: aload 6
    //   81: aload 7
    //   83: invokevirtual 150	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: invokestatic 470	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   89: aconst_null
    //   90: aconst_null
    //   91: aconst_null
    //   92: aconst_null
    //   93: invokevirtual 476	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   96: astore_0
    //   97: aload_0
    //   98: ifnull +134 -> 232
    //   101: aload_0
    //   102: invokeinterface 479 1 0
    //   107: ifeq +125 -> 232
    //   110: aload_0
    //   111: iconst_0
    //   112: invokeinterface 482 2 0
    //   117: istore_3
    //   118: aload_0
    //   119: astore_1
    //   120: iload_3
    //   121: ifle +91 -> 212
    //   124: ldc 2
    //   126: monitorenter
    //   127: aload_0
    //   128: iconst_2
    //   129: invokeinterface 486 2 0
    //   134: putstatic 327	com/google/android/gms/dynamite/DynamiteModule:zzig	Ljava/lang/String;
    //   137: aload_0
    //   138: ldc_w 488
    //   141: invokeinterface 492 2 0
    //   146: istore 4
    //   148: iload 4
    //   150: iflt +14 -> 164
    //   153: aload_0
    //   154: iload 4
    //   156: invokeinterface 482 2 0
    //   161: putstatic 419	com/google/android/gms/dynamite/DynamiteModule:zzih	I
    //   164: ldc 2
    //   166: monitorexit
    //   167: getstatic 61	com/google/android/gms/dynamite/DynamiteModule:zzii	Ljava/lang/ThreadLocal;
    //   170: invokevirtual 219	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   173: checkcast 21	com/google/android/gms/dynamite/DynamiteModule$zza
    //   176: astore 5
    //   178: aload_0
    //   179: astore_1
    //   180: aload 5
    //   182: ifnull +30 -> 212
    //   185: aload_0
    //   186: astore_1
    //   187: aload 5
    //   189: getfield 255	com/google/android/gms/dynamite/DynamiteModule$zza:zzin	Landroid/database/Cursor;
    //   192: ifnonnull +20 -> 212
    //   195: aload 5
    //   197: aload_0
    //   198: putfield 255	com/google/android/gms/dynamite/DynamiteModule$zza:zzin	Landroid/database/Cursor;
    //   201: aconst_null
    //   202: astore_1
    //   203: goto +9 -> 212
    //   206: astore_1
    //   207: ldc 2
    //   209: monitorexit
    //   210: aload_1
    //   211: athrow
    //   212: aload_1
    //   213: ifnull +9 -> 222
    //   216: aload_1
    //   217: invokeinterface 260 1 0
    //   222: iload_3
    //   223: ireturn
    //   224: astore_1
    //   225: goto +52 -> 277
    //   228: astore_1
    //   229: goto +25 -> 254
    //   232: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   235: dup
    //   236: ldc_w 494
    //   239: aconst_null
    //   240: invokespecial 279	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/zza;)V
    //   243: athrow
    //   244: astore_1
    //   245: aload 5
    //   247: astore_0
    //   248: goto +29 -> 277
    //   251: astore_1
    //   252: aconst_null
    //   253: astore_0
    //   254: aload_1
    //   255: instanceof 9
    //   258: ifeq +5 -> 263
    //   261: aload_1
    //   262: athrow
    //   263: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   266: dup
    //   267: ldc_w 496
    //   270: aload_1
    //   271: aconst_null
    //   272: invokespecial 274	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/zza;)V
    //   275: athrow
    //   276: astore_1
    //   277: aload_0
    //   278: ifnull +9 -> 287
    //   281: aload_0
    //   282: invokeinterface 260 1 0
    //   287: aload_1
    //   288: athrow
    //   289: ldc_w 498
    //   292: astore_0
    //   293: goto -273 -> 20
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	296	0	paramContext	Context
    //   0	296	1	paramString	String
    //   0	296	2	paramBoolean	boolean
    //   117	106	3	i	int
    //   146	9	4	j	int
    //   1	245	5	localzza	zza
    //   7	73	6	localContentResolver	android.content.ContentResolver
    //   45	37	7	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   127	148	206	finally
    //   153	164	206	finally
    //   164	167	206	finally
    //   207	210	206	finally
    //   101	118	224	finally
    //   124	127	224	finally
    //   167	178	224	finally
    //   187	201	224	finally
    //   210	212	224	finally
    //   232	244	224	finally
    //   101	118	228	java/lang/Exception
    //   124	127	228	java/lang/Exception
    //   167	178	228	java/lang/Exception
    //   187	201	228	java/lang/Exception
    //   210	212	228	java/lang/Exception
    //   232	244	228	java/lang/Exception
    //   3	9	244	finally
    //   20	97	244	finally
    //   3	9	251	java/lang/Exception
    //   20	97	251	java/lang/Exception
    //   254	263	276	finally
    //   263	276	276	finally
  }
  
  private static DynamiteModule zzc(Context paramContext, String paramString, int paramInt)
    throws DynamiteModule.LoadingException
  {
    Object localObject = new StringBuilder(String.valueOf(paramString).length() + 51);
    ((StringBuilder)localObject).append("Selected remote version of ");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append(", version >= ");
    ((StringBuilder)localObject).append(paramInt);
    try
    {
      localObject = zzif;
      if (localObject != null)
      {
        zza localzza = (zza)zzii.get();
        if ((localzza != null) && (localzza.zzin != null))
        {
          paramContext = zza(paramContext.getApplicationContext(), paramString, paramInt, localzza.zzin, (zzk)localObject);
          if (paramContext != null) {
            return new DynamiteModule(paramContext);
          }
          throw new LoadingException("Failed to get module context", null);
        }
        throw new LoadingException("No result cursor", null);
      }
      throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
    }
    finally {}
  }
  
  private static DynamiteModule zze(Context paramContext, String paramString)
  {
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      "Selected local version of ".concat(paramString);
    } else {
      new String("Selected local version of ");
    }
    return new DynamiteModule(paramContext.getApplicationContext());
  }
  
  /* Error */
  private static zzi zzj(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 510	com/google/android/gms/dynamite/DynamiteModule:zzie	Lcom/google/android/gms/dynamite/zzi;
    //   6: ifnull +12 -> 18
    //   9: getstatic 510	com/google/android/gms/dynamite/DynamiteModule:zzie	Lcom/google/android/gms/dynamite/zzi;
    //   12: astore_0
    //   13: ldc 2
    //   15: monitorexit
    //   16: aload_0
    //   17: areturn
    //   18: invokestatic 516	com/google/android/gms/common/GoogleApiAvailabilityLight:getInstance	()Lcom/google/android/gms/common/GoogleApiAvailabilityLight;
    //   21: aload_0
    //   22: invokevirtual 520	com/google/android/gms/common/GoogleApiAvailabilityLight:isGooglePlayServicesAvailable	(Landroid/content/Context;)I
    //   25: ifeq +8 -> 33
    //   28: ldc 2
    //   30: monitorexit
    //   31: aconst_null
    //   32: areturn
    //   33: aload_0
    //   34: ldc_w 315
    //   37: iconst_3
    //   38: invokevirtual 524	android/content/Context:createPackageContext	(Ljava/lang/String;I)Landroid/content/Context;
    //   41: invokevirtual 123	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   44: ldc_w 526
    //   47: invokevirtual 156	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   50: invokevirtual 528	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   53: checkcast 402	android/os/IBinder
    //   56: astore_0
    //   57: aload_0
    //   58: ifnonnull +8 -> 66
    //   61: aconst_null
    //   62: astore_0
    //   63: goto +37 -> 100
    //   66: aload_0
    //   67: ldc_w 530
    //   70: invokeinterface 408 2 0
    //   75: astore_1
    //   76: aload_1
    //   77: instanceof 430
    //   80: ifeq +11 -> 91
    //   83: aload_1
    //   84: checkcast 430	com/google/android/gms/dynamite/zzi
    //   87: astore_0
    //   88: goto +12 -> 100
    //   91: new 532	com/google/android/gms/dynamite/zzj
    //   94: dup
    //   95: aload_0
    //   96: invokespecial 533	com/google/android/gms/dynamite/zzj:<init>	(Landroid/os/IBinder;)V
    //   99: astore_0
    //   100: aload_0
    //   101: ifnull +57 -> 158
    //   104: aload_0
    //   105: putstatic 510	com/google/android/gms/dynamite/DynamiteModule:zzie	Lcom/google/android/gms/dynamite/zzi;
    //   108: ldc 2
    //   110: monitorexit
    //   111: aload_0
    //   112: areturn
    //   113: astore_0
    //   114: aload_0
    //   115: invokevirtual 196	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   118: invokestatic 131	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   121: astore_0
    //   122: aload_0
    //   123: invokevirtual 135	java/lang/String:length	()I
    //   126: ifeq +14 -> 140
    //   129: ldc_w 535
    //   132: aload_0
    //   133: invokevirtual 202	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   136: astore_0
    //   137: goto +14 -> 151
    //   140: new 127	java/lang/String
    //   143: dup
    //   144: ldc_w 535
    //   147: invokespecial 205	java/lang/String:<init>	(Ljava/lang/String;)V
    //   150: astore_0
    //   151: ldc -73
    //   153: aload_0
    //   154: invokestatic 189	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   157: pop
    //   158: ldc 2
    //   160: monitorexit
    //   161: aconst_null
    //   162: areturn
    //   163: astore_0
    //   164: ldc 2
    //   166: monitorexit
    //   167: aload_0
    //   168: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	paramContext	Context
    //   75	9	1	localIInterface	IInterface
    // Exception table:
    //   from	to	target	type
    //   33	57	113	java/lang/Exception
    //   66	88	113	java/lang/Exception
    //   91	100	113	java/lang/Exception
    //   104	108	113	java/lang/Exception
    //   3	16	163	finally
    //   18	31	163	finally
    //   33	57	163	finally
    //   66	88	163	finally
    //   91	100	163	finally
    //   104	108	163	finally
    //   108	111	163	finally
    //   114	137	163	finally
    //   140	151	163	finally
    //   151	158	163	finally
    //   158	161	163	finally
    //   164	167	163	finally
  }
  
  @KeepForSdk
  public final Context getModuleContext()
  {
    return this.zzim;
  }
  
  @KeepForSdk
  public final IBinder instantiate(String paramString)
    throws DynamiteModule.LoadingException
  {
    try
    {
      IBinder localIBinder = (IBinder)this.zzim.getClassLoader().loadClass(paramString).newInstance();
      return localIBinder;
    }
    catch (ClassNotFoundException|InstantiationException|IllegalAccessException localClassNotFoundException)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Failed to instantiate module class: ".concat(paramString);
      } else {
        paramString = new String("Failed to instantiate module class: ");
      }
      throw new LoadingException(paramString, localClassNotFoundException, null);
    }
  }
  
  @DynamiteApi
  public static class DynamiteLoaderClassLoader
  {
    @GuardedBy("DynamiteLoaderClassLoader.class")
    public static ClassLoader sClassLoader;
  }
  
  @KeepForSdk
  public static class LoadingException
    extends Exception
  {
    private LoadingException(String paramString)
    {
      super();
    }
    
    private LoadingException(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
  
  public static abstract interface VersionPolicy
  {
    public abstract zzb zza(Context paramContext, String paramString, zza paramzza)
      throws DynamiteModule.LoadingException;
    
    public static abstract interface zza
    {
      public abstract int getLocalVersion(Context paramContext, String paramString);
      
      public abstract int zza(Context paramContext, String paramString, boolean paramBoolean)
        throws DynamiteModule.LoadingException;
    }
    
    public static final class zzb
    {
      public int zziq = 0;
      public int zzir = 0;
      public int zzis = 0;
    }
  }
  
  static final class zza
  {
    public Cursor zzin;
  }
  
  static final class zzb
    implements DynamiteModule.VersionPolicy.zza
  {
    private final int zzio;
    private final int zzip;
    
    public zzb(int paramInt1, int paramInt2)
    {
      this.zzio = paramInt1;
      this.zzip = 0;
    }
    
    public final int getLocalVersion(Context paramContext, String paramString)
    {
      return this.zzio;
    }
    
    public final int zza(Context paramContext, String paramString, boolean paramBoolean)
    {
      return 0;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/dynamite/DynamiteModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */