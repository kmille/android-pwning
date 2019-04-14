package com.karumi.dexter;

import com.karumi.dexter.listener.PermissionRequestErrorListener;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.Collection;

public abstract interface DexterBuilder
{
  public abstract void check();
  
  public abstract DexterBuilder onSameThread();
  
  public abstract DexterBuilder withErrorListener(PermissionRequestErrorListener paramPermissionRequestErrorListener);
  
  public static abstract interface MultiPermissionListener
  {
    public abstract DexterBuilder withListener(MultiplePermissionsListener paramMultiplePermissionsListener);
  }
  
  public static abstract interface Permission
  {
    public abstract DexterBuilder.SinglePermissionListener withPermission(String paramString);
    
    public abstract DexterBuilder.MultiPermissionListener withPermissions(Collection<String> paramCollection);
    
    public abstract DexterBuilder.MultiPermissionListener withPermissions(String... paramVarArgs);
  }
  
  public static abstract interface SinglePermissionListener
  {
    public abstract DexterBuilder withListener(PermissionListener paramPermissionListener);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/DexterBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */