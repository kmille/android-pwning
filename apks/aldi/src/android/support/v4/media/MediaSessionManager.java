package android.support.v4.media;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.util.Log;

public final class MediaSessionManager
{
  static final boolean DEBUG = Log.isLoggable("MediaSessionManager", 3);
  static final String TAG = "MediaSessionManager";
  private static final Object sLock = new Object();
  private static volatile MediaSessionManager sSessionManager;
  MediaSessionManagerImpl mImpl;
  
  private MediaSessionManager(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      paramContext = new MediaSessionManagerImplApi28(paramContext);
    }
    for (;;)
    {
      this.mImpl = paramContext;
      return;
      if (Build.VERSION.SDK_INT >= 21) {
        paramContext = new MediaSessionManagerImplApi21(paramContext);
      } else {
        paramContext = new MediaSessionManagerImplBase(paramContext);
      }
    }
  }
  
  @NonNull
  public static MediaSessionManager getSessionManager(@NonNull Context paramContext)
  {
    Object localObject1 = sSessionManager;
    if (localObject1 == null) {
      synchronized (sLock)
      {
        MediaSessionManager localMediaSessionManager = sSessionManager;
        localObject1 = localMediaSessionManager;
        if (localMediaSessionManager == null)
        {
          localObject1 = new MediaSessionManager(paramContext.getApplicationContext());
          sSessionManager = (MediaSessionManager)localObject1;
        }
        return (MediaSessionManager)localObject1;
      }
    }
    return (MediaSessionManager)localObject1;
  }
  
  final Context getContext()
  {
    return this.mImpl.getContext();
  }
  
  public final boolean isTrustedForMediaControl(@NonNull RemoteUserInfo paramRemoteUserInfo)
  {
    if (paramRemoteUserInfo != null) {
      return this.mImpl.isTrustedForMediaControl(paramRemoteUserInfo.mImpl);
    }
    throw new IllegalArgumentException("userInfo should not be null");
  }
  
  static abstract interface MediaSessionManagerImpl
  {
    public abstract Context getContext();
    
    public abstract boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl paramRemoteUserInfoImpl);
  }
  
  public static final class RemoteUserInfo
  {
    public static final String LEGACY_CONTROLLER = "android.media.session.MediaController";
    MediaSessionManager.RemoteUserInfoImpl mImpl;
    
    @RequiresApi(28)
    @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public RemoteUserInfo(android.media.session.MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
    {
      this.mImpl = new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(paramRemoteUserInfo);
    }
    
    public RemoteUserInfo(@NonNull String paramString, int paramInt1, int paramInt2)
    {
      if (Build.VERSION.SDK_INT >= 28) {}
      for (paramString = new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(paramString, paramInt1, paramInt2);; paramString = new MediaSessionManagerImplBase.RemoteUserInfoImplBase(paramString, paramInt1, paramInt2))
      {
        this.mImpl = paramString;
        return;
      }
    }
    
    public final boolean equals(@Nullable Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof RemoteUserInfo)) {
        return false;
      }
      return this.mImpl.equals(((RemoteUserInfo)paramObject).mImpl);
    }
    
    @NonNull
    public final String getPackageName()
    {
      return this.mImpl.getPackageName();
    }
    
    public final int getPid()
    {
      return this.mImpl.getPid();
    }
    
    public final int getUid()
    {
      return this.mImpl.getUid();
    }
    
    public final int hashCode()
    {
      return this.mImpl.hashCode();
    }
  }
  
  static abstract interface RemoteUserInfoImpl
  {
    public abstract String getPackageName();
    
    public abstract int getPid();
    
    public abstract int getUid();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/media/MediaSessionManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */