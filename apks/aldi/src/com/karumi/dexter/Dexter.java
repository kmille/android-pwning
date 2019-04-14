package com.karumi.dexter;

import android.app.Activity;
import android.content.Context;
import com.karumi.dexter.listener.EmptyPermissionRequestErrorListener;
import com.karumi.dexter.listener.PermissionRequestErrorListener;
import com.karumi.dexter.listener.multi.BaseMultiplePermissionsListener;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public final class Dexter
  implements DexterBuilder, DexterBuilder.MultiPermissionListener, DexterBuilder.Permission, DexterBuilder.SinglePermissionListener
{
  private static DexterInstance instance;
  private PermissionRequestErrorListener errorListener = new EmptyPermissionRequestErrorListener();
  private MultiplePermissionsListener listener = new BaseMultiplePermissionsListener();
  private Collection<String> permissions;
  private boolean shouldExecuteOnSameThread = false;
  
  private Dexter(Activity paramActivity)
  {
    initialize(paramActivity);
  }
  
  private Thread getThread()
  {
    if (this.shouldExecuteOnSameThread) {
      return ThreadFactory.makeSameThread();
    }
    return ThreadFactory.makeMainThread();
  }
  
  private static void initialize(Context paramContext)
  {
    if (instance == null)
    {
      instance = new DexterInstance(paramContext, new AndroidPermissionService(), new IntentProvider());
      return;
    }
    instance.setContext(paramContext);
  }
  
  static void onActivityDestroyed()
  {
    if (instance != null) {
      instance.onActivityDestroyed();
    }
  }
  
  static void onActivityReady(Activity paramActivity)
  {
    if (instance != null) {
      instance.onActivityReady(paramActivity);
    }
  }
  
  static void onPermissionsRequested(Collection<String> paramCollection1, Collection<String> paramCollection2)
  {
    if (instance != null)
    {
      instance.onPermissionRequestGranted(paramCollection1);
      instance.onPermissionRequestDenied(paramCollection2);
    }
  }
  
  public static DexterBuilder.Permission withActivity(Activity paramActivity)
  {
    return new Dexter(paramActivity);
  }
  
  public final void check()
  {
    try
    {
      Thread localThread = getThread();
      instance.checkPermissions(this.listener, this.permissions, localThread);
      return;
    }
    catch (DexterException localDexterException)
    {
      this.errorListener.onError(localDexterException.error);
    }
  }
  
  public final DexterBuilder onSameThread()
  {
    this.shouldExecuteOnSameThread = true;
    return this;
  }
  
  public final DexterBuilder withErrorListener(PermissionRequestErrorListener paramPermissionRequestErrorListener)
  {
    this.errorListener = paramPermissionRequestErrorListener;
    return this;
  }
  
  public final DexterBuilder withListener(MultiplePermissionsListener paramMultiplePermissionsListener)
  {
    this.listener = paramMultiplePermissionsListener;
    return this;
  }
  
  public final DexterBuilder withListener(PermissionListener paramPermissionListener)
  {
    this.listener = new MultiplePermissionsListenerToPermissionListenerAdapter(paramPermissionListener);
    return this;
  }
  
  public final DexterBuilder.SinglePermissionListener withPermission(String paramString)
  {
    this.permissions = Collections.singletonList(paramString);
    return this;
  }
  
  public final DexterBuilder.MultiPermissionListener withPermissions(Collection<String> paramCollection)
  {
    this.permissions = new ArrayList(paramCollection);
    return this;
  }
  
  public final DexterBuilder.MultiPermissionListener withPermissions(String... paramVarArgs)
  {
    this.permissions = Arrays.asList(paramVarArgs);
    return this;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/Dexter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */