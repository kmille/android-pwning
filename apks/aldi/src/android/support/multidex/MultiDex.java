package android.support.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

public final class MultiDex
{
  private static final String CODE_CACHE_NAME = "code_cache";
  private static final String CODE_CACHE_SECONDARY_FOLDER_NAME = "secondary-dexes";
  private static final boolean IS_VM_MULTIDEX_CAPABLE = isVMMultidexCapable(System.getProperty("java.vm.version"));
  private static final int MAX_SUPPORTED_SDK_VERSION = 20;
  private static final int MIN_SDK_VERSION = 4;
  private static final String NO_KEY_PREFIX = "";
  private static final String OLD_SECONDARY_FOLDER_NAME = "secondary-dexes";
  static final String TAG = "MultiDex";
  private static final int VM_WITH_MULTIDEX_VERSION_MAJOR = 2;
  private static final int VM_WITH_MULTIDEX_VERSION_MINOR = 1;
  private static final Set<File> installedApk = new HashSet();
  
  private static void clearOldDexDir(Context paramContext)
    throws Exception
  {
    File localFile = new File(paramContext.getFilesDir(), "secondary-dexes");
    if (localFile.isDirectory())
    {
      paramContext = new StringBuilder("Clearing old secondary dex dir (");
      paramContext.append(localFile.getPath());
      paramContext.append(").");
      Object localObject1 = localFile.listFiles();
      if (localObject1 == null)
      {
        localObject1 = new StringBuilder("Failed to list secondary dex dir content (");
        ((StringBuilder)localObject1).append(localFile.getPath());
      }
      for (paramContext = ").";; paramContext = localFile.getPath())
      {
        ((StringBuilder)localObject1).append(paramContext);
        return;
        int j = localObject1.length;
        int i = 0;
        while (i < j)
        {
          Object localObject2 = localObject1[i];
          paramContext = new StringBuilder("Trying to delete old file ");
          paramContext.append(((File)localObject2).getPath());
          paramContext.append(" of size ");
          paramContext.append(((File)localObject2).length());
          if (!((File)localObject2).delete()) {}
          for (paramContext = new StringBuilder("Failed to delete old file ");; paramContext = new StringBuilder("Deleted old file "))
          {
            paramContext.append(((File)localObject2).getPath());
            break;
          }
          i += 1;
        }
        if (localFile.delete()) {
          break;
        }
        localObject1 = new StringBuilder("Failed to delete secondary dex dir ");
      }
      new StringBuilder("Deleted old secondary dex dir ").append(localFile.getPath());
    }
  }
  
  /* Error */
  private static void doInstallation(Context paramContext, File paramFile1, File paramFile2, String paramString1, String paramString2, boolean paramBoolean)
    throws IOException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException
  {
    // Byte code:
    //   0: getstatic 62	android/support/multidex/MultiDex:installedApk	Ljava/util/Set;
    //   3: astore 6
    //   5: aload 6
    //   7: monitorenter
    //   8: getstatic 62	android/support/multidex/MultiDex:installedApk	Ljava/util/Set;
    //   11: aload_1
    //   12: invokeinterface 188 2 0
    //   17: ifeq +7 -> 24
    //   20: aload 6
    //   22: monitorexit
    //   23: return
    //   24: getstatic 62	android/support/multidex/MultiDex:installedApk	Ljava/util/Set;
    //   27: aload_1
    //   28: invokeinterface 191 2 0
    //   33: pop
    //   34: getstatic 196	android/os/Build$VERSION:SDK_INT	I
    //   37: bipush 20
    //   39: if_icmple +50 -> 89
    //   42: new 123	java/lang/StringBuilder
    //   45: dup
    //   46: ldc -58
    //   48: invokespecial 128	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   51: astore 7
    //   53: aload 7
    //   55: getstatic 196	android/os/Build$VERSION:SDK_INT	I
    //   58: invokevirtual 201	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload 7
    //   64: ldc -53
    //   66: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload 7
    //   72: ldc 64
    //   74: invokestatic 70	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   77: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: aload 7
    //   83: ldc -51
    //   85: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload_0
    //   90: invokevirtual 209	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   93: astore 7
    //   95: aload 7
    //   97: ifnonnull +15 -> 112
    //   100: ldc 46
    //   102: ldc -45
    //   104: invokestatic 217	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   107: pop
    //   108: aload 6
    //   110: monitorexit
    //   111: return
    //   112: aload_0
    //   113: invokestatic 219	android/support/multidex/MultiDex:clearOldDexDir	(Landroid/content/Context;)V
    //   116: aload_0
    //   117: aload_2
    //   118: aload_3
    //   119: invokestatic 223	android/support/multidex/MultiDex:getDexDir	(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    //   122: astore_2
    //   123: new 225	android/support/multidex/MultiDexExtractor
    //   126: dup
    //   127: aload_1
    //   128: aload_2
    //   129: invokespecial 228	android/support/multidex/MultiDexExtractor:<init>	(Ljava/io/File;Ljava/io/File;)V
    //   132: astore_3
    //   133: aconst_null
    //   134: astore_1
    //   135: aload_3
    //   136: aload_0
    //   137: aload 4
    //   139: iconst_0
    //   140: invokevirtual 232	android/support/multidex/MultiDexExtractor:load	(Landroid/content/Context;Ljava/lang/String;Z)Ljava/util/List;
    //   143: astore 8
    //   145: aload 7
    //   147: aload_2
    //   148: aload 8
    //   150: invokestatic 236	android/support/multidex/MultiDex:installSecondaryDexes	(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/util/List;)V
    //   153: goto +24 -> 177
    //   156: astore 8
    //   158: iload 5
    //   160: ifeq +37 -> 197
    //   163: aload 7
    //   165: aload_2
    //   166: aload_3
    //   167: aload_0
    //   168: aload 4
    //   170: iconst_1
    //   171: invokevirtual 232	android/support/multidex/MultiDexExtractor:load	(Landroid/content/Context;Ljava/lang/String;Z)Ljava/util/List;
    //   174: invokestatic 236	android/support/multidex/MultiDex:installSecondaryDexes	(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/util/List;)V
    //   177: aload_3
    //   178: invokevirtual 239	android/support/multidex/MultiDexExtractor:close	()V
    //   181: aload_1
    //   182: astore_0
    //   183: goto +4 -> 187
    //   186: astore_0
    //   187: aload_0
    //   188: ifnonnull +7 -> 195
    //   191: aload 6
    //   193: monitorexit
    //   194: return
    //   195: aload_0
    //   196: athrow
    //   197: aload 8
    //   199: athrow
    //   200: astore_0
    //   201: aload_3
    //   202: invokevirtual 239	android/support/multidex/MultiDexExtractor:close	()V
    //   205: aload_0
    //   206: athrow
    //   207: aload 6
    //   209: monitorexit
    //   210: return
    //   211: astore_0
    //   212: aload 6
    //   214: monitorexit
    //   215: aload_0
    //   216: athrow
    //   217: astore_0
    //   218: goto -11 -> 207
    //   221: astore 8
    //   223: goto -107 -> 116
    //   226: astore_1
    //   227: goto -22 -> 205
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	230	0	paramContext	Context
    //   0	230	1	paramFile1	File
    //   0	230	2	paramFile2	File
    //   0	230	3	paramString1	String
    //   0	230	4	paramString2	String
    //   0	230	5	paramBoolean	boolean
    //   3	210	6	localSet	Set
    //   51	113	7	localObject	Object
    //   143	6	8	localList	List
    //   156	42	8	localIOException	IOException
    //   221	1	8	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   145	153	156	java/io/IOException
    //   177	181	186	java/io/IOException
    //   135	145	200	finally
    //   145	153	200	finally
    //   163	177	200	finally
    //   197	200	200	finally
    //   8	23	211	finally
    //   24	89	211	finally
    //   89	95	211	finally
    //   100	111	211	finally
    //   112	116	211	finally
    //   116	133	211	finally
    //   177	181	211	finally
    //   191	194	211	finally
    //   195	197	211	finally
    //   201	205	211	finally
    //   205	207	211	finally
    //   207	210	211	finally
    //   212	215	211	finally
    //   89	95	217	java/lang/RuntimeException
    //   112	116	221	java/lang/Throwable
    //   201	205	226	java/io/IOException
  }
  
  private static void expandFieldArray(Object paramObject, String paramString, Object[] paramArrayOfObject)
    throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
  {
    paramString = findField(paramObject, paramString);
    Object[] arrayOfObject1 = (Object[])paramString.get(paramObject);
    Object[] arrayOfObject2 = (Object[])Array.newInstance(arrayOfObject1.getClass().getComponentType(), arrayOfObject1.length + paramArrayOfObject.length);
    System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, arrayOfObject1.length);
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject2, arrayOfObject1.length, paramArrayOfObject.length);
    paramString.set(paramObject, arrayOfObject2);
  }
  
  private static Field findField(Object paramObject, String paramString)
    throws NoSuchFieldException
  {
    for (Object localObject = paramObject.getClass(); localObject != null; localObject = ((Class)localObject).getSuperclass()) {
      try
      {
        Field localField = ((Class)localObject).getDeclaredField(paramString);
        if (!localField.isAccessible()) {
          localField.setAccessible(true);
        }
        return localField;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        for (;;) {}
      }
    }
    localObject = new StringBuilder("Field ");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append(" not found in ");
    ((StringBuilder)localObject).append(paramObject.getClass());
    throw new NoSuchFieldException(((StringBuilder)localObject).toString());
  }
  
  private static Method findMethod(Object paramObject, String paramString, Class<?>... paramVarArgs)
    throws NoSuchMethodException
  {
    for (Object localObject = paramObject.getClass(); localObject != null; localObject = ((Class)localObject).getSuperclass()) {
      try
      {
        Method localMethod = ((Class)localObject).getDeclaredMethod(paramString, paramVarArgs);
        if (!localMethod.isAccessible()) {
          localMethod.setAccessible(true);
        }
        return localMethod;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;) {}
      }
    }
    localObject = new StringBuilder("Method ");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append(" with parameters ");
    ((StringBuilder)localObject).append(Arrays.asList(paramVarArgs));
    ((StringBuilder)localObject).append(" not found in ");
    ((StringBuilder)localObject).append(paramObject.getClass());
    throw new NoSuchMethodException(((StringBuilder)localObject).toString());
  }
  
  private static ApplicationInfo getApplicationInfo(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getApplicationInfo();
      return paramContext;
    }
    catch (RuntimeException paramContext)
    {
      for (;;) {}
    }
    return null;
  }
  
  private static File getDexDir(Context paramContext, File paramFile, String paramString)
    throws IOException
  {
    paramFile = new File(paramFile, "code_cache");
    try
    {
      mkdirChecked(paramFile);
      paramContext = paramFile;
    }
    catch (IOException paramFile)
    {
      for (;;) {}
    }
    paramContext = new File(paramContext.getFilesDir(), "code_cache");
    mkdirChecked(paramContext);
    paramContext = new File(paramContext, paramString);
    mkdirChecked(paramContext);
    return paramContext;
  }
  
  public static void install(Context paramContext)
  {
    if (IS_VM_MULTIDEX_CAPABLE) {
      return;
    }
    if (Build.VERSION.SDK_INT >= 4) {
      try
      {
        localObject = getApplicationInfo(paramContext);
        if (localObject == null) {
          return;
        }
        doInstallation(paramContext, new File(((ApplicationInfo)localObject).sourceDir), new File(((ApplicationInfo)localObject).dataDir), "secondary-dexes", "", true);
        return;
      }
      catch (Exception paramContext)
      {
        Log.e("MultiDex", "MultiDex installation failure", paramContext);
        Object localObject = new StringBuilder("MultiDex installation failed (");
        ((StringBuilder)localObject).append(paramContext.getMessage());
        ((StringBuilder)localObject).append(").");
        throw new RuntimeException(((StringBuilder)localObject).toString());
      }
    }
    paramContext = new StringBuilder("MultiDex installation failed. SDK ");
    paramContext.append(Build.VERSION.SDK_INT);
    paramContext.append(" is unsupported. Min SDK version is 4.");
    throw new RuntimeException(paramContext.toString());
  }
  
  public static void installInstrumentation(Context paramContext1, Context paramContext2)
  {
    if (IS_VM_MULTIDEX_CAPABLE) {
      return;
    }
    if (Build.VERSION.SDK_INT >= 4) {
      try
      {
        Object localObject1 = getApplicationInfo(paramContext1);
        if (localObject1 == null) {
          return;
        }
        ApplicationInfo localApplicationInfo = getApplicationInfo(paramContext2);
        if (localApplicationInfo == null) {
          return;
        }
        Object localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(paramContext1.getPackageName());
        ((StringBuilder)localObject2).append(".");
        paramContext1 = ((StringBuilder)localObject2).toString();
        localObject2 = new File(localApplicationInfo.dataDir);
        localObject1 = new File(((ApplicationInfo)localObject1).sourceDir);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(paramContext1);
        localStringBuilder.append("secondary-dexes");
        doInstallation(paramContext2, (File)localObject1, (File)localObject2, localStringBuilder.toString(), paramContext1, false);
        doInstallation(paramContext2, new File(localApplicationInfo.sourceDir), (File)localObject2, "secondary-dexes", "", false);
        return;
      }
      catch (Exception paramContext1)
      {
        Log.e("MultiDex", "MultiDex installation failure", paramContext1);
        paramContext2 = new StringBuilder("MultiDex installation failed (");
        paramContext2.append(paramContext1.getMessage());
        paramContext2.append(").");
        throw new RuntimeException(paramContext2.toString());
      }
    }
    paramContext1 = new StringBuilder("MultiDex installation failed. SDK ");
    paramContext1.append(Build.VERSION.SDK_INT);
    paramContext1.append(" is unsupported. Min SDK version is 4.");
    throw new RuntimeException(paramContext1.toString());
  }
  
  private static void installSecondaryDexes(ClassLoader paramClassLoader, File paramFile, List<? extends File> paramList)
    throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException
  {
    if (!paramList.isEmpty())
    {
      if (Build.VERSION.SDK_INT >= 19)
      {
        V19.install(paramClassLoader, paramList, paramFile);
        return;
      }
      if (Build.VERSION.SDK_INT >= 14)
      {
        V14.install(paramClassLoader, paramList);
        return;
      }
      V4.install(paramClassLoader, paramList);
    }
  }
  
  static boolean isVMMultidexCapable(String paramString)
  {
    bool2 = false;
    bool1 = bool2;
    if (paramString != null)
    {
      localObject = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(paramString);
      bool1 = bool2;
      if (!((Matcher)localObject).matches()) {}
    }
    try
    {
      int i = Integer.parseInt(((Matcher)localObject).group(1));
      int j = Integer.parseInt(((Matcher)localObject).group(2));
      if (i <= 2)
      {
        bool1 = bool2;
        if (i == 2)
        {
          bool1 = bool2;
          if (j <= 0) {}
        }
      }
      else
      {
        bool1 = true;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        bool1 = bool2;
      }
    }
    Object localObject = new StringBuilder("VM with version ");
    ((StringBuilder)localObject).append(paramString);
    if (bool1) {
      paramString = " has multidex support";
    } else {
      paramString = " does not have multidex support";
    }
    ((StringBuilder)localObject).append(paramString);
    return bool1;
  }
  
  private static void mkdirChecked(File paramFile)
    throws IOException
  {
    paramFile.mkdir();
    if (!paramFile.isDirectory())
    {
      Object localObject = paramFile.getParentFile();
      if (localObject == null)
      {
        localObject = new StringBuilder("Failed to create dir ");
        ((StringBuilder)localObject).append(paramFile.getPath());
        ((StringBuilder)localObject).append(". Parent file is null.");
      }
      StringBuilder localStringBuilder;
      for (localObject = ((StringBuilder)localObject).toString();; localObject = localStringBuilder.toString())
      {
        Log.e("MultiDex", (String)localObject);
        break;
        localStringBuilder = new StringBuilder("Failed to create dir ");
        localStringBuilder.append(paramFile.getPath());
        localStringBuilder.append(". parent file is a dir ");
        localStringBuilder.append(((File)localObject).isDirectory());
        localStringBuilder.append(", a file ");
        localStringBuilder.append(((File)localObject).isFile());
        localStringBuilder.append(", exists ");
        localStringBuilder.append(((File)localObject).exists());
        localStringBuilder.append(", readable ");
        localStringBuilder.append(((File)localObject).canRead());
        localStringBuilder.append(", writable ");
        localStringBuilder.append(((File)localObject).canWrite());
      }
      localObject = new StringBuilder("Failed to create directory ");
      ((StringBuilder)localObject).append(paramFile.getPath());
      throw new IOException(((StringBuilder)localObject).toString());
    }
  }
  
  static final class V14
  {
    private static final int EXTRACTED_SUFFIX_LENGTH = 4;
    private final ElementConstructor elementConstructor;
    
    private V14()
      throws ClassNotFoundException, SecurityException, NoSuchMethodException
    {
      Class localClass = Class.forName("dalvik.system.DexPathList$Element");
      for (;;)
      {
        try
        {
          localObject = new ICSElementConstructor(localClass);
        }
        catch (NoSuchMethodException localNoSuchMethodException1)
        {
          Object localObject;
          continue;
        }
        try
        {
          localObject = new JBMR11ElementConstructor(localClass);
        }
        catch (NoSuchMethodException localNoSuchMethodException2) {}
      }
      localObject = new JBMR2ElementConstructor(localClass);
      this.elementConstructor = ((ElementConstructor)localObject);
    }
    
    static void install(ClassLoader paramClassLoader, List<? extends File> paramList)
      throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException
    {
      paramClassLoader = MultiDex.findField(paramClassLoader, "pathList").get(paramClassLoader);
      paramList = new V14().makeDexElements(paramList);
      try
      {
        MultiDex.expandFieldArray(paramClassLoader, "dexElements", paramList);
        return;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        for (;;) {}
      }
      MultiDex.expandFieldArray(paramClassLoader, "pathElements", paramList);
    }
    
    private Object[] makeDexElements(List<? extends File> paramList)
      throws IOException, SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException
    {
      Object[] arrayOfObject = new Object[paramList.size()];
      int i = 0;
      while (i < arrayOfObject.length)
      {
        File localFile = (File)paramList.get(i);
        arrayOfObject[i] = this.elementConstructor.newInstance(localFile, DexFile.loadDex(localFile.getPath(), optimizedPathFor(localFile), 0));
        i += 1;
      }
      return arrayOfObject;
    }
    
    private static String optimizedPathFor(File paramFile)
    {
      File localFile = paramFile.getParentFile();
      paramFile = paramFile.getName();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramFile.substring(0, paramFile.length() - EXTRACTED_SUFFIX_LENGTH));
      localStringBuilder.append(".dex");
      return new File(localFile, localStringBuilder.toString()).getPath();
    }
    
    static abstract interface ElementConstructor
    {
      public abstract Object newInstance(File paramFile, DexFile paramDexFile)
        throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
    }
    
    static class ICSElementConstructor
      implements MultiDex.V14.ElementConstructor
    {
      private final Constructor<?> elementConstructor;
      
      ICSElementConstructor(Class<?> paramClass)
        throws SecurityException, NoSuchMethodException
      {
        this.elementConstructor = paramClass.getConstructor(new Class[] { File.class, ZipFile.class, DexFile.class });
        this.elementConstructor.setAccessible(true);
      }
      
      public Object newInstance(File paramFile, DexFile paramDexFile)
        throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException
      {
        return this.elementConstructor.newInstance(new Object[] { paramFile, new ZipFile(paramFile), paramDexFile });
      }
    }
    
    static class JBMR11ElementConstructor
      implements MultiDex.V14.ElementConstructor
    {
      private final Constructor<?> elementConstructor;
      
      JBMR11ElementConstructor(Class<?> paramClass)
        throws SecurityException, NoSuchMethodException
      {
        this.elementConstructor = paramClass.getConstructor(new Class[] { File.class, File.class, DexFile.class });
        this.elementConstructor.setAccessible(true);
      }
      
      public Object newInstance(File paramFile, DexFile paramDexFile)
        throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException
      {
        return this.elementConstructor.newInstance(new Object[] { paramFile, paramFile, paramDexFile });
      }
    }
    
    static class JBMR2ElementConstructor
      implements MultiDex.V14.ElementConstructor
    {
      private final Constructor<?> elementConstructor;
      
      JBMR2ElementConstructor(Class<?> paramClass)
        throws SecurityException, NoSuchMethodException
      {
        this.elementConstructor = paramClass.getConstructor(new Class[] { File.class, Boolean.TYPE, File.class, DexFile.class });
        this.elementConstructor.setAccessible(true);
      }
      
      public Object newInstance(File paramFile, DexFile paramDexFile)
        throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException
      {
        return this.elementConstructor.newInstance(new Object[] { paramFile, Boolean.FALSE, paramFile, paramDexFile });
      }
    }
  }
  
  static final class V19
  {
    static void install(ClassLoader paramClassLoader, List<? extends File> paramList, File paramFile)
      throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException
    {
      Object localObject = MultiDex.findField(paramClassLoader, "pathList").get(paramClassLoader);
      ArrayList localArrayList = new ArrayList();
      MultiDex.expandFieldArray(localObject, "dexElements", makeDexElements(localObject, new ArrayList(paramList), paramFile, localArrayList));
      if (localArrayList.size() > 0)
      {
        paramClassLoader = localArrayList.iterator();
        while (paramClassLoader.hasNext()) {
          paramClassLoader.next();
        }
        paramList = MultiDex.findField(localObject, "dexElementsSuppressedExceptions");
        paramFile = (IOException[])paramList.get(localObject);
        if (paramFile == null)
        {
          paramClassLoader = (IOException[])localArrayList.toArray(new IOException[localArrayList.size()]);
        }
        else
        {
          paramClassLoader = new IOException[localArrayList.size() + paramFile.length];
          localArrayList.toArray(paramClassLoader);
          System.arraycopy(paramFile, 0, paramClassLoader, localArrayList.size(), paramFile.length);
        }
        paramList.set(localObject, paramClassLoader);
        paramClassLoader = new IOException("I/O exception during makeDexElement");
        paramClassLoader.initCause((Throwable)localArrayList.get(0));
        throw paramClassLoader;
      }
    }
    
    private static Object[] makeDexElements(Object paramObject, ArrayList<File> paramArrayList, File paramFile, ArrayList<IOException> paramArrayList1)
      throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
      return (Object[])MultiDex.findMethod(paramObject, "makeDexElements", new Class[] { ArrayList.class, File.class, ArrayList.class }).invoke(paramObject, new Object[] { paramArrayList, paramFile, paramArrayList1 });
    }
  }
  
  static final class V4
  {
    static void install(ClassLoader paramClassLoader, List<? extends File> paramList)
      throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException
    {
      int i = paramList.size();
      Field localField = MultiDex.findField(paramClassLoader, "path");
      StringBuilder localStringBuilder = new StringBuilder((String)localField.get(paramClassLoader));
      String[] arrayOfString = new String[i];
      File[] arrayOfFile = new File[i];
      ZipFile[] arrayOfZipFile = new ZipFile[i];
      DexFile[] arrayOfDexFile = new DexFile[i];
      paramList = paramList.listIterator();
      while (paramList.hasNext())
      {
        Object localObject = (File)paramList.next();
        String str = ((File)localObject).getAbsolutePath();
        localStringBuilder.append(':');
        localStringBuilder.append(str);
        i = paramList.previousIndex();
        arrayOfString[i] = str;
        arrayOfFile[i] = localObject;
        arrayOfZipFile[i] = new ZipFile((File)localObject);
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(str);
        ((StringBuilder)localObject).append(".dex");
        arrayOfDexFile[i] = DexFile.loadDex(str, ((StringBuilder)localObject).toString(), 0);
      }
      localField.set(paramClassLoader, localStringBuilder.toString());
      MultiDex.expandFieldArray(paramClassLoader, "mPaths", arrayOfString);
      MultiDex.expandFieldArray(paramClassLoader, "mFiles", arrayOfFile);
      MultiDex.expandFieldArray(paramClassLoader, "mZips", arrayOfZipFile);
      MultiDex.expandFieldArray(paramClassLoader, "mDexs", arrayOfDexFile);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/multidex/MultiDex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */