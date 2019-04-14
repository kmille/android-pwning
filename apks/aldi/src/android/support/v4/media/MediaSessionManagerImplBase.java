package android.support.v4.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.provider.Settings.Secure;
import android.support.annotation.NonNull;
import android.support.v4.util.ObjectsCompat;
import android.text.TextUtils;

class MediaSessionManagerImplBase
  implements MediaSessionManager.MediaSessionManagerImpl
{
  private static final boolean DEBUG = MediaSessionManager.DEBUG;
  private static final String ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
  private static final String PERMISSION_MEDIA_CONTENT_CONTROL = "android.permission.MEDIA_CONTENT_CONTROL";
  private static final String PERMISSION_STATUS_BAR_SERVICE = "android.permission.STATUS_BAR_SERVICE";
  private static final String TAG = "MediaSessionManager";
  ContentResolver mContentResolver;
  Context mContext;
  
  MediaSessionManagerImplBase(Context paramContext)
  {
    this.mContext = paramContext;
    this.mContentResolver = this.mContext.getContentResolver();
  }
  
  private boolean isPermissionGranted(MediaSessionManager.RemoteUserInfoImpl paramRemoteUserInfoImpl, String paramString)
  {
    if (paramRemoteUserInfoImpl.getPid() < 0) {
      return this.mContext.getPackageManager().checkPermission(paramString, paramRemoteUserInfoImpl.getPackageName()) == 0;
    }
    return this.mContext.checkPermission(paramString, paramRemoteUserInfoImpl.getPid(), paramRemoteUserInfoImpl.getUid()) == 0;
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  boolean isEnabledNotificationListener(@NonNull MediaSessionManager.RemoteUserInfoImpl paramRemoteUserInfoImpl)
  {
    Object localObject = Settings.Secure.getString(this.mContentResolver, "enabled_notification_listeners");
    if (localObject != null)
    {
      localObject = ((String)localObject).split(":");
      int i = 0;
      while (i < localObject.length)
      {
        ComponentName localComponentName = ComponentName.unflattenFromString(localObject[i]);
        if ((localComponentName != null) && (localComponentName.getPackageName().equals(paramRemoteUserInfoImpl.getPackageName()))) {
          return true;
        }
        i += 1;
      }
    }
    return false;
  }
  
  public boolean isTrustedForMediaControl(@NonNull MediaSessionManager.RemoteUserInfoImpl paramRemoteUserInfoImpl)
  {
    try
    {
      localObject = this.mContext.getPackageManager().getApplicationInfo(paramRemoteUserInfoImpl.getPackageName(), 0);
      if (((ApplicationInfo)localObject).uid != paramRemoteUserInfoImpl.getUid())
      {
        if (DEBUG)
        {
          localObject = new StringBuilder("Package name ");
          ((StringBuilder)localObject).append(paramRemoteUserInfoImpl.getPackageName());
          ((StringBuilder)localObject).append(" doesn't match with the uid ");
          ((StringBuilder)localObject).append(paramRemoteUserInfoImpl.getUid());
        }
        return false;
      }
      return (isPermissionGranted(paramRemoteUserInfoImpl, "android.permission.STATUS_BAR_SERVICE")) || (isPermissionGranted(paramRemoteUserInfoImpl, "android.permission.MEDIA_CONTENT_CONTROL")) || (paramRemoteUserInfoImpl.getUid() == 1000) || (isEnabledNotificationListener(paramRemoteUserInfoImpl));
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Object localObject;
      for (;;) {}
    }
    if (DEBUG)
    {
      localObject = new StringBuilder("Package ");
      ((StringBuilder)localObject).append(paramRemoteUserInfoImpl.getPackageName());
      ((StringBuilder)localObject).append(" doesn't exist");
    }
    return false;
  }
  
  static class RemoteUserInfoImplBase
    implements MediaSessionManager.RemoteUserInfoImpl
  {
    private String mPackageName;
    private int mPid;
    private int mUid;
    
    RemoteUserInfoImplBase(String paramString, int paramInt1, int paramInt2)
    {
      this.mPackageName = paramString;
      this.mPid = paramInt1;
      this.mUid = paramInt2;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof RemoteUserInfoImplBase)) {
        return false;
      }
      paramObject = (RemoteUserInfoImplBase)paramObject;
      return (TextUtils.equals(this.mPackageName, ((RemoteUserInfoImplBase)paramObject).mPackageName)) && (this.mPid == ((RemoteUserInfoImplBase)paramObject).mPid) && (this.mUid == ((RemoteUserInfoImplBase)paramObject).mUid);
    }
    
    public String getPackageName()
    {
      return this.mPackageName;
    }
    
    public int getPid()
    {
      return this.mPid;
    }
    
    public int getUid()
    {
      return this.mUid;
    }
    
    public int hashCode()
    {
      return ObjectsCompat.hash(new Object[] { this.mPackageName, Integer.valueOf(this.mPid), Integer.valueOf(this.mUid) });
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/media/MediaSessionManagerImplBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */