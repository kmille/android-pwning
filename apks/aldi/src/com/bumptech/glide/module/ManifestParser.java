package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Deprecated
public final class ManifestParser
{
  private static final String GLIDE_MODULE_VALUE = "GlideModule";
  private static final String TAG = "ManifestParser";
  private final Context context;
  
  public ManifestParser(Context paramContext)
  {
    this.context = paramContext;
  }
  
  private static GlideModule parseModule(String paramString)
  {
    try
    {
      Class localClass = Class.forName(paramString);
      paramString = null;
      try
      {
        Object localObject = localClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        paramString = (String)localObject;
      }
      catch (InstantiationException|IllegalAccessException|NoSuchMethodException|InvocationTargetException localInstantiationException)
      {
        throwInstantiateGlideModuleException(localClass, localInstantiationException);
      }
      if ((paramString instanceof GlideModule)) {
        return (GlideModule)paramString;
      }
      throw new RuntimeException("Expected instanceof GlideModule, but found: ".concat(String.valueOf(paramString)));
    }
    catch (ClassNotFoundException paramString)
    {
      throw new IllegalArgumentException("Unable to find GlideModule implementation", paramString);
    }
  }
  
  private static void throwInstantiateGlideModuleException(Class<?> paramClass, Exception paramException)
  {
    throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(paramClass)), paramException);
  }
  
  public final List<GlideModule> parse()
  {
    Log.isLoggable("ManifestParser", 3);
    ArrayList localArrayList = new ArrayList();
    try
    {
      ApplicationInfo localApplicationInfo = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128);
      if (localApplicationInfo.metaData == null)
      {
        Log.isLoggable("ManifestParser", 3);
        return localArrayList;
      }
      if (Log.isLoggable("ManifestParser", 2)) {
        new StringBuilder("Got app info metadata: ").append(localApplicationInfo.metaData);
      }
      Iterator localIterator = localApplicationInfo.metaData.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ("GlideModule".equals(localApplicationInfo.metaData.get(str)))
        {
          localArrayList.add(parseModule(str));
          Log.isLoggable("ManifestParser", 3);
        }
      }
      Log.isLoggable("ManifestParser", 3);
      return localArrayList;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new RuntimeException("Unable to find metadata to parse GlideModules", localNameNotFoundException);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/module/ManifestParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */