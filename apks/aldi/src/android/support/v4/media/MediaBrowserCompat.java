package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.IMediaSession.Stub;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class MediaBrowserCompat
{
  public static final String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
  public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
  static final boolean DEBUG = Log.isLoggable("MediaBrowserCompat", 3);
  public static final String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
  public static final String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
  public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
  public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
  static final String TAG = "MediaBrowserCompat";
  private final MediaBrowserImpl mImpl;
  
  public MediaBrowserCompat(Context paramContext, ComponentName paramComponentName, ConnectionCallback paramConnectionCallback, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      paramContext = new MediaBrowserImplApi26(paramContext, paramComponentName, paramConnectionCallback, paramBundle);
    }
    for (;;)
    {
      this.mImpl = paramContext;
      return;
      if (Build.VERSION.SDK_INT >= 23) {
        paramContext = new MediaBrowserImplApi23(paramContext, paramComponentName, paramConnectionCallback, paramBundle);
      } else if (Build.VERSION.SDK_INT >= 21) {
        paramContext = new MediaBrowserImplApi21(paramContext, paramComponentName, paramConnectionCallback, paramBundle);
      } else {
        paramContext = new MediaBrowserImplBase(paramContext, paramComponentName, paramConnectionCallback, paramBundle);
      }
    }
  }
  
  public final void connect()
  {
    this.mImpl.connect();
  }
  
  public final void disconnect()
  {
    this.mImpl.disconnect();
  }
  
  @Nullable
  public final Bundle getExtras()
  {
    return this.mImpl.getExtras();
  }
  
  public final void getItem(@NonNull String paramString, @NonNull ItemCallback paramItemCallback)
  {
    this.mImpl.getItem(paramString, paramItemCallback);
  }
  
  @Nullable
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY})
  public final Bundle getNotifyChildrenChangedOptions()
  {
    return this.mImpl.getNotifyChildrenChangedOptions();
  }
  
  @NonNull
  public final String getRoot()
  {
    return this.mImpl.getRoot();
  }
  
  @NonNull
  public final ComponentName getServiceComponent()
  {
    return this.mImpl.getServiceComponent();
  }
  
  @NonNull
  public final MediaSessionCompat.Token getSessionToken()
  {
    return this.mImpl.getSessionToken();
  }
  
  public final boolean isConnected()
  {
    return this.mImpl.isConnected();
  }
  
  public final void search(@NonNull String paramString, Bundle paramBundle, @NonNull SearchCallback paramSearchCallback)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramSearchCallback != null)
      {
        this.mImpl.search(paramString, paramBundle, paramSearchCallback);
        return;
      }
      throw new IllegalArgumentException("callback cannot be null");
    }
    throw new IllegalArgumentException("query cannot be empty");
  }
  
  public final void sendCustomAction(@NonNull String paramString, Bundle paramBundle, @Nullable CustomActionCallback paramCustomActionCallback)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      this.mImpl.sendCustomAction(paramString, paramBundle, paramCustomActionCallback);
      return;
    }
    throw new IllegalArgumentException("action cannot be empty");
  }
  
  public final void subscribe(@NonNull String paramString, @NonNull Bundle paramBundle, @NonNull SubscriptionCallback paramSubscriptionCallback)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramSubscriptionCallback != null)
      {
        if (paramBundle != null)
        {
          this.mImpl.subscribe(paramString, paramBundle, paramSubscriptionCallback);
          return;
        }
        throw new IllegalArgumentException("options are null");
      }
      throw new IllegalArgumentException("callback is null");
    }
    throw new IllegalArgumentException("parentId is empty");
  }
  
  public final void subscribe(@NonNull String paramString, @NonNull SubscriptionCallback paramSubscriptionCallback)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramSubscriptionCallback != null)
      {
        this.mImpl.subscribe(paramString, null, paramSubscriptionCallback);
        return;
      }
      throw new IllegalArgumentException("callback is null");
    }
    throw new IllegalArgumentException("parentId is empty");
  }
  
  public final void unsubscribe(@NonNull String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      this.mImpl.unsubscribe(paramString, null);
      return;
    }
    throw new IllegalArgumentException("parentId is empty");
  }
  
  public final void unsubscribe(@NonNull String paramString, @NonNull SubscriptionCallback paramSubscriptionCallback)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramSubscriptionCallback != null)
      {
        this.mImpl.unsubscribe(paramString, paramSubscriptionCallback);
        return;
      }
      throw new IllegalArgumentException("callback is null");
    }
    throw new IllegalArgumentException("parentId is empty");
  }
  
  static class CallbackHandler
    extends Handler
  {
    private final WeakReference<MediaBrowserCompat.MediaBrowserServiceCallbackImpl> mCallbackImplRef;
    private WeakReference<Messenger> mCallbacksMessengerRef;
    
    CallbackHandler(MediaBrowserCompat.MediaBrowserServiceCallbackImpl paramMediaBrowserServiceCallbackImpl)
    {
      this.mCallbackImplRef = new WeakReference(paramMediaBrowserServiceCallbackImpl);
    }
    
    public void handleMessage(Message paramMessage)
    {
      Object localObject;
      MediaBrowserCompat.MediaBrowserServiceCallbackImpl localMediaBrowserServiceCallbackImpl;
      Messenger localMessenger;
      if ((this.mCallbacksMessengerRef != null) && (this.mCallbacksMessengerRef.get() != null))
      {
        if (this.mCallbackImplRef.get() == null) {
          return;
        }
        localObject = paramMessage.getData();
        MediaSessionCompat.ensureClassLoader((Bundle)localObject);
        localMediaBrowserServiceCallbackImpl = (MediaBrowserCompat.MediaBrowserServiceCallbackImpl)this.mCallbackImplRef.get();
        localMessenger = (Messenger)this.mCallbacksMessengerRef.get();
      }
      try
      {
        Bundle localBundle1;
        switch (paramMessage.what)
        {
        case 3: 
          break;
          localBundle1 = ((Bundle)localObject).getBundle("data_options");
          MediaSessionCompat.ensureClassLoader(localBundle1);
          Bundle localBundle2 = ((Bundle)localObject).getBundle("data_notify_children_changed_options");
          MediaSessionCompat.ensureClassLoader(localBundle2);
          localMediaBrowserServiceCallbackImpl.onLoadChildren(localMessenger, ((Bundle)localObject).getString("data_media_item_id"), ((Bundle)localObject).getParcelableArrayList("data_media_item_list"), localBundle1, localBundle2);
          return;
        case 2: 
          localMediaBrowserServiceCallbackImpl.onConnectionFailed(localMessenger);
          return;
        case 1: 
          localBundle1 = ((Bundle)localObject).getBundle("data_root_hints");
          MediaSessionCompat.ensureClassLoader(localBundle1);
          localMediaBrowserServiceCallbackImpl.onServiceConnected(localMessenger, ((Bundle)localObject).getString("data_media_item_id"), (MediaSessionCompat.Token)((Bundle)localObject).getParcelable("data_media_session_token"), localBundle1);
          return;
          localObject = new StringBuilder("Unhandled message: ");
          ((StringBuilder)localObject).append(paramMessage);
          ((StringBuilder)localObject).append("\n  Client version: 1\n  Service version: ");
          ((StringBuilder)localObject).append(paramMessage.arg1);
          return;
          Log.e("MediaBrowserCompat", "Could not unparcel the data.");
          if (paramMessage.what == 1) {
            localMediaBrowserServiceCallbackImpl.onConnectionFailed(localMessenger);
          }
          return;
        }
      }
      catch (BadParcelableException localBadParcelableException)
      {
        for (;;) {}
      }
    }
    
    void setCallbacksMessenger(Messenger paramMessenger)
    {
      this.mCallbacksMessengerRef = new WeakReference(paramMessenger);
    }
  }
  
  public static class ConnectionCallback
  {
    ConnectionCallbackInternal mConnectionCallbackInternal;
    final Object mConnectionCallbackObj;
    
    public ConnectionCallback()
    {
      if (Build.VERSION.SDK_INT >= 21) {}
      for (Object localObject = MediaBrowserCompatApi21.createConnectionCallback(new StubApi21());; localObject = null)
      {
        this.mConnectionCallbackObj = localObject;
        return;
      }
    }
    
    public void onConnected() {}
    
    public void onConnectionFailed() {}
    
    public void onConnectionSuspended() {}
    
    void setInternalConnectionCallback(ConnectionCallbackInternal paramConnectionCallbackInternal)
    {
      this.mConnectionCallbackInternal = paramConnectionCallbackInternal;
    }
    
    static abstract interface ConnectionCallbackInternal
    {
      public abstract void onConnected();
      
      public abstract void onConnectionFailed();
      
      public abstract void onConnectionSuspended();
    }
    
    class StubApi21
      implements MediaBrowserCompatApi21.ConnectionCallback
    {
      StubApi21() {}
      
      public void onConnected()
      {
        if (MediaBrowserCompat.ConnectionCallback.this.mConnectionCallbackInternal != null) {
          MediaBrowserCompat.ConnectionCallback.this.mConnectionCallbackInternal.onConnected();
        }
        MediaBrowserCompat.ConnectionCallback.this.onConnected();
      }
      
      public void onConnectionFailed()
      {
        if (MediaBrowserCompat.ConnectionCallback.this.mConnectionCallbackInternal != null) {
          MediaBrowserCompat.ConnectionCallback.this.mConnectionCallbackInternal.onConnectionFailed();
        }
        MediaBrowserCompat.ConnectionCallback.this.onConnectionFailed();
      }
      
      public void onConnectionSuspended()
      {
        if (MediaBrowserCompat.ConnectionCallback.this.mConnectionCallbackInternal != null) {
          MediaBrowserCompat.ConnectionCallback.this.mConnectionCallbackInternal.onConnectionSuspended();
        }
        MediaBrowserCompat.ConnectionCallback.this.onConnectionSuspended();
      }
    }
  }
  
  public static abstract class CustomActionCallback
  {
    public void onError(String paramString, Bundle paramBundle1, Bundle paramBundle2) {}
    
    public void onProgressUpdate(String paramString, Bundle paramBundle1, Bundle paramBundle2) {}
    
    public void onResult(String paramString, Bundle paramBundle1, Bundle paramBundle2) {}
  }
  
  static class CustomActionResultReceiver
    extends ResultReceiver
  {
    private final String mAction;
    private final MediaBrowserCompat.CustomActionCallback mCallback;
    private final Bundle mExtras;
    
    CustomActionResultReceiver(String paramString, Bundle paramBundle, MediaBrowserCompat.CustomActionCallback paramCustomActionCallback, Handler paramHandler)
    {
      super();
      this.mAction = paramString;
      this.mExtras = paramBundle;
      this.mCallback = paramCustomActionCallback;
    }
    
    public void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      if (this.mCallback == null) {
        return;
      }
      MediaSessionCompat.ensureClassLoader(paramBundle);
      switch (paramInt)
      {
      default: 
        StringBuilder localStringBuilder = new StringBuilder("Unknown result code: ");
        localStringBuilder.append(paramInt);
        localStringBuilder.append(" (extras=");
        localStringBuilder.append(this.mExtras);
        localStringBuilder.append(", resultData=");
        localStringBuilder.append(paramBundle);
        localStringBuilder.append(")");
        return;
      case 1: 
        this.mCallback.onProgressUpdate(this.mAction, this.mExtras, paramBundle);
        return;
      case 0: 
        this.mCallback.onResult(this.mAction, this.mExtras, paramBundle);
        return;
      }
      this.mCallback.onError(this.mAction, this.mExtras, paramBundle);
    }
  }
  
  public static abstract class ItemCallback
  {
    final Object mItemCallbackObj;
    
    public ItemCallback()
    {
      if (Build.VERSION.SDK_INT >= 23) {}
      for (Object localObject = MediaBrowserCompatApi23.createItemCallback(new StubApi23());; localObject = null)
      {
        this.mItemCallbackObj = localObject;
        return;
      }
    }
    
    public void onError(@NonNull String paramString) {}
    
    public void onItemLoaded(MediaBrowserCompat.MediaItem paramMediaItem) {}
    
    class StubApi23
      implements MediaBrowserCompatApi23.ItemCallback
    {
      StubApi23() {}
      
      public void onError(@NonNull String paramString)
      {
        MediaBrowserCompat.ItemCallback.this.onError(paramString);
      }
      
      public void onItemLoaded(Parcel paramParcel)
      {
        Object localObject;
        if (paramParcel == null)
        {
          localObject = MediaBrowserCompat.ItemCallback.this;
          paramParcel = null;
        }
        for (;;)
        {
          ((MediaBrowserCompat.ItemCallback)localObject).onItemLoaded(paramParcel);
          return;
          paramParcel.setDataPosition(0);
          localObject = (MediaBrowserCompat.MediaItem)MediaBrowserCompat.MediaItem.CREATOR.createFromParcel(paramParcel);
          paramParcel.recycle();
          MediaBrowserCompat.ItemCallback localItemCallback = MediaBrowserCompat.ItemCallback.this;
          paramParcel = (Parcel)localObject;
          localObject = localItemCallback;
        }
      }
    }
  }
  
  static class ItemReceiver
    extends ResultReceiver
  {
    private final MediaBrowserCompat.ItemCallback mCallback;
    private final String mMediaId;
    
    ItemReceiver(String paramString, MediaBrowserCompat.ItemCallback paramItemCallback, Handler paramHandler)
    {
      super();
      this.mMediaId = paramString;
      this.mCallback = paramItemCallback;
    }
    
    public void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      MediaSessionCompat.ensureClassLoader(paramBundle);
      if ((paramInt == 0) && (paramBundle != null) && (paramBundle.containsKey("media_item")))
      {
        paramBundle = paramBundle.getParcelable("media_item");
        if ((paramBundle != null) && (!(paramBundle instanceof MediaBrowserCompat.MediaItem)))
        {
          this.mCallback.onError(this.mMediaId);
          return;
        }
        this.mCallback.onItemLoaded((MediaBrowserCompat.MediaItem)paramBundle);
        return;
      }
      this.mCallback.onError(this.mMediaId);
    }
  }
  
  static abstract interface MediaBrowserImpl
  {
    public abstract void connect();
    
    public abstract void disconnect();
    
    @Nullable
    public abstract Bundle getExtras();
    
    public abstract void getItem(@NonNull String paramString, @NonNull MediaBrowserCompat.ItemCallback paramItemCallback);
    
    @Nullable
    public abstract Bundle getNotifyChildrenChangedOptions();
    
    @NonNull
    public abstract String getRoot();
    
    public abstract ComponentName getServiceComponent();
    
    @NonNull
    public abstract MediaSessionCompat.Token getSessionToken();
    
    public abstract boolean isConnected();
    
    public abstract void search(@NonNull String paramString, Bundle paramBundle, @NonNull MediaBrowserCompat.SearchCallback paramSearchCallback);
    
    public abstract void sendCustomAction(@NonNull String paramString, Bundle paramBundle, @Nullable MediaBrowserCompat.CustomActionCallback paramCustomActionCallback);
    
    public abstract void subscribe(@NonNull String paramString, @Nullable Bundle paramBundle, @NonNull MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback);
    
    public abstract void unsubscribe(@NonNull String paramString, MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback);
  }
  
  @RequiresApi(21)
  static class MediaBrowserImplApi21
    implements MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal, MediaBrowserCompat.MediaBrowserImpl, MediaBrowserCompat.MediaBrowserServiceCallbackImpl
  {
    protected final Object mBrowserObj;
    protected Messenger mCallbacksMessenger;
    final Context mContext;
    protected final MediaBrowserCompat.CallbackHandler mHandler = new MediaBrowserCompat.CallbackHandler(this);
    private MediaSessionCompat.Token mMediaSessionToken;
    private Bundle mNotifyChildrenChangedOptions;
    protected final Bundle mRootHints;
    protected MediaBrowserCompat.ServiceBinderWrapper mServiceBinderWrapper;
    protected int mServiceVersion;
    private final ArrayMap<String, MediaBrowserCompat.Subscription> mSubscriptions = new ArrayMap();
    
    MediaBrowserImplApi21(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.ConnectionCallback paramConnectionCallback, Bundle paramBundle)
    {
      this.mContext = paramContext;
      if (paramBundle != null) {
        paramBundle = new Bundle(paramBundle);
      } else {
        paramBundle = new Bundle();
      }
      this.mRootHints = paramBundle;
      this.mRootHints.putInt("extra_client_version", 1);
      paramConnectionCallback.setInternalConnectionCallback(this);
      this.mBrowserObj = MediaBrowserCompatApi21.createBrowser(paramContext, paramComponentName, paramConnectionCallback.mConnectionCallbackObj, this.mRootHints);
    }
    
    public void connect()
    {
      MediaBrowserCompatApi21.connect(this.mBrowserObj);
    }
    
    public void disconnect()
    {
      if ((this.mServiceBinderWrapper != null) && (this.mCallbacksMessenger != null)) {}
      try
      {
        this.mServiceBinderWrapper.unregisterCallbackMessenger(this.mCallbacksMessenger);
        MediaBrowserCompatApi21.disconnect(this.mBrowserObj);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
    
    @Nullable
    public Bundle getExtras()
    {
      return MediaBrowserCompatApi21.getExtras(this.mBrowserObj);
    }
    
    public void getItem(@NonNull final String paramString, @NonNull final MediaBrowserCompat.ItemCallback paramItemCallback)
    {
      if (!TextUtils.isEmpty(paramString))
      {
        if (paramItemCallback != null)
        {
          Object localObject;
          if (!MediaBrowserCompatApi21.isConnected(this.mBrowserObj))
          {
            localObject = this.mHandler;
            paramItemCallback = new Runnable()
            {
              public void run()
              {
                paramItemCallback.onError(paramString);
              }
            };
            paramString = (String)localObject;
          }
          for (;;)
          {
            paramString.post(paramItemCallback);
            return;
            if (this.mServiceBinderWrapper == null)
            {
              localObject = this.mHandler;
              paramItemCallback = new Runnable()
              {
                public void run()
                {
                  paramItemCallback.onError(paramString);
                }
              };
              paramString = (String)localObject;
            }
            else
            {
              localObject = new MediaBrowserCompat.ItemReceiver(paramString, paramItemCallback, this.mHandler);
            }
            try
            {
              this.mServiceBinderWrapper.getMediaItem(paramString, (ResultReceiver)localObject, this.mCallbacksMessenger);
              return;
            }
            catch (RemoteException localRemoteException)
            {
              for (;;) {}
            }
            localObject = this.mHandler;
            paramItemCallback = new Runnable()
            {
              public void run()
              {
                paramItemCallback.onError(paramString);
              }
            };
            paramString = (String)localObject;
          }
        }
        throw new IllegalArgumentException("cb is null");
      }
      throw new IllegalArgumentException("mediaId is empty");
    }
    
    public Bundle getNotifyChildrenChangedOptions()
    {
      return this.mNotifyChildrenChangedOptions;
    }
    
    @NonNull
    public String getRoot()
    {
      return MediaBrowserCompatApi21.getRoot(this.mBrowserObj);
    }
    
    public ComponentName getServiceComponent()
    {
      return MediaBrowserCompatApi21.getServiceComponent(this.mBrowserObj);
    }
    
    @NonNull
    public MediaSessionCompat.Token getSessionToken()
    {
      if (this.mMediaSessionToken == null) {
        this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(this.mBrowserObj));
      }
      return this.mMediaSessionToken;
    }
    
    public boolean isConnected()
    {
      return MediaBrowserCompatApi21.isConnected(this.mBrowserObj);
    }
    
    public void onConnected()
    {
      Object localObject = MediaBrowserCompatApi21.getExtras(this.mBrowserObj);
      if (localObject == null) {
        return;
      }
      this.mServiceVersion = ((Bundle)localObject).getInt("extra_service_version", 0);
      IBinder localIBinder = BundleCompat.getBinder((Bundle)localObject, "extra_messenger");
      if (localIBinder != null)
      {
        this.mServiceBinderWrapper = new MediaBrowserCompat.ServiceBinderWrapper(localIBinder, this.mRootHints);
        this.mCallbacksMessenger = new Messenger(this.mHandler);
        this.mHandler.setCallbacksMessenger(this.mCallbacksMessenger);
      }
      try
      {
        this.mServiceBinderWrapper.registerCallbackMessenger(this.mContext, this.mCallbacksMessenger);
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
      localObject = IMediaSession.Stub.asInterface(BundleCompat.getBinder((Bundle)localObject, "extra_session_binder"));
      if (localObject != null) {
        this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(this.mBrowserObj), (IMediaSession)localObject);
      }
    }
    
    public void onConnectionFailed() {}
    
    public void onConnectionFailed(Messenger paramMessenger) {}
    
    public void onConnectionSuspended()
    {
      this.mServiceBinderWrapper = null;
      this.mCallbacksMessenger = null;
      this.mMediaSessionToken = null;
      this.mHandler.setCallbacksMessenger(null);
    }
    
    public void onLoadChildren(Messenger paramMessenger, String paramString, List paramList, Bundle paramBundle1, Bundle paramBundle2)
    {
      if (this.mCallbacksMessenger != paramMessenger) {
        return;
      }
      paramMessenger = (MediaBrowserCompat.Subscription)this.mSubscriptions.get(paramString);
      if (paramMessenger == null)
      {
        boolean bool = MediaBrowserCompat.DEBUG;
        return;
      }
      paramMessenger = paramMessenger.getCallback(paramBundle1);
      if (paramMessenger != null)
      {
        if (paramBundle1 == null)
        {
          if (paramList == null)
          {
            paramMessenger.onError(paramString);
            return;
          }
          this.mNotifyChildrenChangedOptions = paramBundle2;
          paramMessenger.onChildrenLoaded(paramString, paramList);
          this.mNotifyChildrenChangedOptions = null;
          return;
        }
        if (paramList == null)
        {
          paramMessenger.onError(paramString, paramBundle1);
          return;
        }
        this.mNotifyChildrenChangedOptions = paramBundle2;
        paramMessenger.onChildrenLoaded(paramString, paramList, paramBundle1);
        this.mNotifyChildrenChangedOptions = null;
      }
    }
    
    public void onServiceConnected(Messenger paramMessenger, String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle) {}
    
    public void search(@NonNull final String paramString, final Bundle paramBundle, @NonNull final MediaBrowserCompat.SearchCallback paramSearchCallback)
    {
      if (isConnected())
      {
        Object localObject;
        if (this.mServiceBinderWrapper == null)
        {
          localObject = this.mHandler;
          paramBundle = new Runnable()
          {
            public void run()
            {
              paramSearchCallback.onError(paramString, paramBundle);
            }
          };
        }
        for (paramString = (String)localObject;; paramString = (String)localObject)
        {
          paramString.post(paramBundle);
          return;
          localObject = new MediaBrowserCompat.SearchResultReceiver(paramString, paramBundle, paramSearchCallback, this.mHandler);
          try
          {
            this.mServiceBinderWrapper.search(paramString, paramBundle, (ResultReceiver)localObject, this.mCallbacksMessenger);
            return;
          }
          catch (RemoteException localRemoteException)
          {
            for (;;) {}
          }
          localObject = this.mHandler;
          paramBundle = new Runnable()
          {
            public void run()
            {
              paramSearchCallback.onError(paramString, paramBundle);
            }
          };
        }
      }
      else
      {
        throw new IllegalStateException("search() called while not connected");
      }
    }
    
    public void sendCustomAction(@NonNull final String paramString, final Bundle paramBundle, @Nullable final MediaBrowserCompat.CustomActionCallback paramCustomActionCallback)
    {
      if (isConnected())
      {
        if ((this.mServiceBinderWrapper == null) && (paramCustomActionCallback != null)) {
          this.mHandler.post(new Runnable()
          {
            public void run()
            {
              paramCustomActionCallback.onError(paramString, paramBundle, null);
            }
          });
        }
        localObject = new MediaBrowserCompat.CustomActionResultReceiver(paramString, paramBundle, paramCustomActionCallback, this.mHandler);
      }
      try
      {
        this.mServiceBinderWrapper.sendCustomAction(paramString, paramBundle, (ResultReceiver)localObject, this.mCallbacksMessenger);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
      Object localObject = new StringBuilder("Remote error sending a custom action: action=");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(", extras=");
      ((StringBuilder)localObject).append(paramBundle);
      if (paramCustomActionCallback != null) {
        this.mHandler.post(new Runnable()
        {
          public void run()
          {
            paramCustomActionCallback.onError(paramString, paramBundle, null);
          }
        });
      }
      return;
      paramCustomActionCallback = new StringBuilder("Cannot send a custom action (");
      paramCustomActionCallback.append(paramString);
      paramCustomActionCallback.append(") with extras ");
      paramCustomActionCallback.append(paramBundle);
      paramCustomActionCallback.append(" because the browser is not connected to the service.");
      throw new IllegalStateException(paramCustomActionCallback.toString());
    }
    
    public void subscribe(@NonNull String paramString, Bundle paramBundle, @NonNull MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
    {
      MediaBrowserCompat.Subscription localSubscription2 = (MediaBrowserCompat.Subscription)this.mSubscriptions.get(paramString);
      MediaBrowserCompat.Subscription localSubscription1 = localSubscription2;
      if (localSubscription2 == null)
      {
        localSubscription1 = new MediaBrowserCompat.Subscription();
        this.mSubscriptions.put(paramString, localSubscription1);
      }
      paramSubscriptionCallback.setSubscription(localSubscription1);
      if (paramBundle == null) {
        paramBundle = null;
      } else {
        paramBundle = new Bundle(paramBundle);
      }
      localSubscription1.putCallback(paramBundle, paramSubscriptionCallback);
      if (this.mServiceBinderWrapper == null)
      {
        MediaBrowserCompatApi21.subscribe(this.mBrowserObj, paramString, paramSubscriptionCallback.mSubscriptionCallbackObj);
        return;
      }
      try
      {
        this.mServiceBinderWrapper.addSubscription(paramString, paramSubscriptionCallback.mToken, paramBundle, this.mCallbacksMessenger);
        return;
      }
      catch (RemoteException paramString) {}
    }
    
    public void unsubscribe(@NonNull String paramString, MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
    {
      MediaBrowserCompat.Subscription localSubscription = (MediaBrowserCompat.Subscription)this.mSubscriptions.get(paramString);
      if (localSubscription == null) {
        return;
      }
      if (this.mServiceBinderWrapper == null)
      {
        if (paramSubscriptionCallback == null) {}
        for (;;)
        {
          MediaBrowserCompatApi21.unsubscribe(this.mBrowserObj, paramString);
          break;
          localList1 = localSubscription.getCallbacks();
          localList2 = localSubscription.getOptionsList();
          i = localList1.size() - 1;
          while (i >= 0)
          {
            if (localList1.get(i) == paramSubscriptionCallback)
            {
              localList1.remove(i);
              localList2.remove(i);
            }
            i -= 1;
          }
          if (localList1.size() != 0) {
            break;
          }
        }
      }
      if (paramSubscriptionCallback == null) {}
      try
      {
        this.mServiceBinderWrapper.removeSubscription(paramString, null, this.mCallbacksMessenger);
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
      List localList1 = localSubscription.getCallbacks();
      List localList2 = localSubscription.getOptionsList();
      int i = localList1.size() - 1;
      while (i >= 0)
      {
        if (localList1.get(i) == paramSubscriptionCallback)
        {
          this.mServiceBinderWrapper.removeSubscription(paramString, paramSubscriptionCallback.mToken, this.mCallbacksMessenger);
          localList1.remove(i);
          localList2.remove(i);
        }
        i -= 1;
      }
      if ((localSubscription.isEmpty()) || (paramSubscriptionCallback == null)) {
        this.mSubscriptions.remove(paramString);
      }
    }
  }
  
  @RequiresApi(23)
  static class MediaBrowserImplApi23
    extends MediaBrowserCompat.MediaBrowserImplApi21
  {
    MediaBrowserImplApi23(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.ConnectionCallback paramConnectionCallback, Bundle paramBundle)
    {
      super(paramComponentName, paramConnectionCallback, paramBundle);
    }
    
    public void getItem(@NonNull String paramString, @NonNull MediaBrowserCompat.ItemCallback paramItemCallback)
    {
      if (this.mServiceBinderWrapper == null)
      {
        MediaBrowserCompatApi23.getItem(this.mBrowserObj, paramString, paramItemCallback.mItemCallbackObj);
        return;
      }
      super.getItem(paramString, paramItemCallback);
    }
  }
  
  @RequiresApi(26)
  static class MediaBrowserImplApi26
    extends MediaBrowserCompat.MediaBrowserImplApi23
  {
    MediaBrowserImplApi26(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.ConnectionCallback paramConnectionCallback, Bundle paramBundle)
    {
      super(paramComponentName, paramConnectionCallback, paramBundle);
    }
    
    public void subscribe(@NonNull String paramString, @Nullable Bundle paramBundle, @NonNull MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
    {
      if ((this.mServiceBinderWrapper != null) && (this.mServiceVersion >= 2))
      {
        super.subscribe(paramString, paramBundle, paramSubscriptionCallback);
        return;
      }
      if (paramBundle == null)
      {
        MediaBrowserCompatApi21.subscribe(this.mBrowserObj, paramString, paramSubscriptionCallback.mSubscriptionCallbackObj);
        return;
      }
      MediaBrowserCompatApi26.subscribe(this.mBrowserObj, paramString, paramBundle, paramSubscriptionCallback.mSubscriptionCallbackObj);
    }
    
    public void unsubscribe(@NonNull String paramString, MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
    {
      if ((this.mServiceBinderWrapper != null) && (this.mServiceVersion >= 2))
      {
        super.unsubscribe(paramString, paramSubscriptionCallback);
        return;
      }
      if (paramSubscriptionCallback == null)
      {
        MediaBrowserCompatApi21.unsubscribe(this.mBrowserObj, paramString);
        return;
      }
      MediaBrowserCompatApi26.unsubscribe(this.mBrowserObj, paramString, paramSubscriptionCallback.mSubscriptionCallbackObj);
    }
  }
  
  static class MediaBrowserImplBase
    implements MediaBrowserCompat.MediaBrowserImpl, MediaBrowserCompat.MediaBrowserServiceCallbackImpl
  {
    static final int CONNECT_STATE_CONNECTED = 3;
    static final int CONNECT_STATE_CONNECTING = 2;
    static final int CONNECT_STATE_DISCONNECTED = 1;
    static final int CONNECT_STATE_DISCONNECTING = 0;
    static final int CONNECT_STATE_SUSPENDED = 4;
    final MediaBrowserCompat.ConnectionCallback mCallback;
    Messenger mCallbacksMessenger;
    final Context mContext;
    private Bundle mExtras;
    final MediaBrowserCompat.CallbackHandler mHandler = new MediaBrowserCompat.CallbackHandler(this);
    private MediaSessionCompat.Token mMediaSessionToken;
    private Bundle mNotifyChildrenChangedOptions;
    final Bundle mRootHints;
    private String mRootId;
    MediaBrowserCompat.ServiceBinderWrapper mServiceBinderWrapper;
    final ComponentName mServiceComponent;
    MediaServiceConnection mServiceConnection;
    int mState = 1;
    private final ArrayMap<String, MediaBrowserCompat.Subscription> mSubscriptions = new ArrayMap();
    
    public MediaBrowserImplBase(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.ConnectionCallback paramConnectionCallback, Bundle paramBundle)
    {
      if (paramContext != null)
      {
        if (paramComponentName != null)
        {
          if (paramConnectionCallback != null)
          {
            this.mContext = paramContext;
            this.mServiceComponent = paramComponentName;
            this.mCallback = paramConnectionCallback;
            if (paramBundle == null) {
              paramContext = null;
            } else {
              paramContext = new Bundle(paramBundle);
            }
            this.mRootHints = paramContext;
            return;
          }
          throw new IllegalArgumentException("connection callback must not be null");
        }
        throw new IllegalArgumentException("service component must not be null");
      }
      throw new IllegalArgumentException("context must not be null");
    }
    
    private static String getStateLabel(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return "UNKNOWN/".concat(String.valueOf(paramInt));
      case 4: 
        return "CONNECT_STATE_SUSPENDED";
      case 3: 
        return "CONNECT_STATE_CONNECTED";
      case 2: 
        return "CONNECT_STATE_CONNECTING";
      case 1: 
        return "CONNECT_STATE_DISCONNECTED";
      }
      return "CONNECT_STATE_DISCONNECTING";
    }
    
    private boolean isCurrent(Messenger paramMessenger, String paramString)
    {
      if ((this.mCallbacksMessenger == paramMessenger) && (this.mState != 0) && (this.mState != 1)) {
        return true;
      }
      if ((this.mState != 0) && (this.mState != 1))
      {
        paramMessenger = new StringBuilder();
        paramMessenger.append(paramString);
        paramMessenger.append(" for ");
        paramMessenger.append(this.mServiceComponent);
        paramMessenger.append(" with mCallbacksMessenger=");
        paramMessenger.append(this.mCallbacksMessenger);
        paramMessenger.append(" this=");
        paramMessenger.append(this);
      }
      return false;
    }
    
    public void connect()
    {
      if ((this.mState != 0) && (this.mState != 1))
      {
        StringBuilder localStringBuilder = new StringBuilder("connect() called while neigther disconnecting nor disconnected (state=");
        localStringBuilder.append(getStateLabel(this.mState));
        localStringBuilder.append(")");
        throw new IllegalStateException(localStringBuilder.toString());
      }
      this.mState = 2;
      this.mHandler.post(new Runnable()
      {
        public void run()
        {
          if (MediaBrowserCompat.MediaBrowserImplBase.this.mState == 0) {
            return;
          }
          MediaBrowserCompat.MediaBrowserImplBase.this.mState = 2;
          if ((MediaBrowserCompat.DEBUG) && (MediaBrowserCompat.MediaBrowserImplBase.this.mServiceConnection != null))
          {
            localObject = new StringBuilder("mServiceConnection should be null. Instead it is ");
            ((StringBuilder)localObject).append(MediaBrowserCompat.MediaBrowserImplBase.this.mServiceConnection);
            throw new RuntimeException(((StringBuilder)localObject).toString());
          }
          if (MediaBrowserCompat.MediaBrowserImplBase.this.mServiceBinderWrapper == null) {
            if (MediaBrowserCompat.MediaBrowserImplBase.this.mCallbacksMessenger == null)
            {
              localObject = new Intent("android.media.browse.MediaBrowserService");
              ((Intent)localObject).setComponent(MediaBrowserCompat.MediaBrowserImplBase.this.mServiceComponent);
              MediaBrowserCompat.MediaBrowserImplBase.this.mServiceConnection = new MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection(MediaBrowserCompat.MediaBrowserImplBase.this);
            }
          }
          try
          {
            bool = MediaBrowserCompat.MediaBrowserImplBase.this.mContext.bindService((Intent)localObject, MediaBrowserCompat.MediaBrowserImplBase.this.mServiceConnection, 1);
          }
          catch (Exception localException)
          {
            boolean bool;
            for (;;) {}
          }
          Object localObject = new StringBuilder("Failed binding to service ");
          ((StringBuilder)localObject).append(MediaBrowserCompat.MediaBrowserImplBase.this.mServiceComponent);
          Log.e("MediaBrowserCompat", ((StringBuilder)localObject).toString());
          bool = false;
          if (!bool)
          {
            MediaBrowserCompat.MediaBrowserImplBase.this.forceCloseConnection();
            MediaBrowserCompat.MediaBrowserImplBase.this.mCallback.onConnectionFailed();
          }
          if (MediaBrowserCompat.DEBUG) {
            MediaBrowserCompat.MediaBrowserImplBase.this.dump();
          }
          return;
          localObject = new StringBuilder("mCallbacksMessenger should be null. Instead it is ");
          ((StringBuilder)localObject).append(MediaBrowserCompat.MediaBrowserImplBase.this.mCallbacksMessenger);
          throw new RuntimeException(((StringBuilder)localObject).toString());
          localObject = new StringBuilder("mServiceBinderWrapper should be null. Instead it is ");
          ((StringBuilder)localObject).append(MediaBrowserCompat.MediaBrowserImplBase.this.mServiceBinderWrapper);
          throw new RuntimeException(((StringBuilder)localObject).toString());
        }
      });
    }
    
    public void disconnect()
    {
      this.mState = 0;
      this.mHandler.post(new Runnable()
      {
        public void run()
        {
          if (MediaBrowserCompat.MediaBrowserImplBase.this.mCallbacksMessenger != null) {}
          try
          {
            MediaBrowserCompat.MediaBrowserImplBase.this.mServiceBinderWrapper.disconnect(MediaBrowserCompat.MediaBrowserImplBase.this.mCallbacksMessenger);
          }
          catch (RemoteException localRemoteException)
          {
            int i;
            for (;;) {}
          }
          new StringBuilder("RemoteException during connect for ").append(MediaBrowserCompat.MediaBrowserImplBase.this.mServiceComponent);
          i = MediaBrowserCompat.MediaBrowserImplBase.this.mState;
          MediaBrowserCompat.MediaBrowserImplBase.this.forceCloseConnection();
          if (i != 0) {
            MediaBrowserCompat.MediaBrowserImplBase.this.mState = i;
          }
          if (MediaBrowserCompat.DEBUG) {
            MediaBrowserCompat.MediaBrowserImplBase.this.dump();
          }
        }
      });
    }
    
    void dump()
    {
      new StringBuilder("  mServiceComponent=").append(this.mServiceComponent);
      new StringBuilder("  mCallback=").append(this.mCallback);
      new StringBuilder("  mRootHints=").append(this.mRootHints);
      new StringBuilder("  mState=").append(getStateLabel(this.mState));
      new StringBuilder("  mServiceConnection=").append(this.mServiceConnection);
      new StringBuilder("  mServiceBinderWrapper=").append(this.mServiceBinderWrapper);
      new StringBuilder("  mCallbacksMessenger=").append(this.mCallbacksMessenger);
      new StringBuilder("  mRootId=").append(this.mRootId);
      new StringBuilder("  mMediaSessionToken=").append(this.mMediaSessionToken);
    }
    
    void forceCloseConnection()
    {
      if (this.mServiceConnection != null) {
        this.mContext.unbindService(this.mServiceConnection);
      }
      this.mState = 1;
      this.mServiceConnection = null;
      this.mServiceBinderWrapper = null;
      this.mCallbacksMessenger = null;
      this.mHandler.setCallbacksMessenger(null);
      this.mRootId = null;
      this.mMediaSessionToken = null;
    }
    
    @Nullable
    public Bundle getExtras()
    {
      if (isConnected()) {
        return this.mExtras;
      }
      StringBuilder localStringBuilder = new StringBuilder("getExtras() called while not connected (state=");
      localStringBuilder.append(getStateLabel(this.mState));
      localStringBuilder.append(")");
      throw new IllegalStateException(localStringBuilder.toString());
    }
    
    public void getItem(@NonNull final String paramString, @NonNull final MediaBrowserCompat.ItemCallback paramItemCallback)
    {
      if (!TextUtils.isEmpty(paramString))
      {
        if (paramItemCallback != null)
        {
          Object localObject;
          if (!isConnected())
          {
            localObject = this.mHandler;
            paramItemCallback = new Runnable()
            {
              public void run()
              {
                paramItemCallback.onError(paramString);
              }
            };
          }
          for (paramString = (String)localObject;; paramString = (String)localObject)
          {
            paramString.post(paramItemCallback);
            return;
            localObject = new MediaBrowserCompat.ItemReceiver(paramString, paramItemCallback, this.mHandler);
            try
            {
              this.mServiceBinderWrapper.getMediaItem(paramString, (ResultReceiver)localObject, this.mCallbacksMessenger);
              return;
            }
            catch (RemoteException localRemoteException)
            {
              for (;;) {}
            }
            localObject = this.mHandler;
            paramItemCallback = new Runnable()
            {
              public void run()
              {
                paramItemCallback.onError(paramString);
              }
            };
          }
        }
        else
        {
          throw new IllegalArgumentException("cb is null");
        }
      }
      else {
        throw new IllegalArgumentException("mediaId is empty");
      }
    }
    
    public Bundle getNotifyChildrenChangedOptions()
    {
      return this.mNotifyChildrenChangedOptions;
    }
    
    @NonNull
    public String getRoot()
    {
      if (isConnected()) {
        return this.mRootId;
      }
      StringBuilder localStringBuilder = new StringBuilder("getRoot() called while not connected(state=");
      localStringBuilder.append(getStateLabel(this.mState));
      localStringBuilder.append(")");
      throw new IllegalStateException(localStringBuilder.toString());
    }
    
    @NonNull
    public ComponentName getServiceComponent()
    {
      if (isConnected()) {
        return this.mServiceComponent;
      }
      StringBuilder localStringBuilder = new StringBuilder("getServiceComponent() called while not connected (state=");
      localStringBuilder.append(this.mState);
      localStringBuilder.append(")");
      throw new IllegalStateException(localStringBuilder.toString());
    }
    
    @NonNull
    public MediaSessionCompat.Token getSessionToken()
    {
      if (isConnected()) {
        return this.mMediaSessionToken;
      }
      StringBuilder localStringBuilder = new StringBuilder("getSessionToken() called while not connected(state=");
      localStringBuilder.append(this.mState);
      localStringBuilder.append(")");
      throw new IllegalStateException(localStringBuilder.toString());
    }
    
    public boolean isConnected()
    {
      return this.mState == 3;
    }
    
    public void onConnectionFailed(Messenger paramMessenger)
    {
      StringBuilder localStringBuilder = new StringBuilder("onConnectFailed for ");
      localStringBuilder.append(this.mServiceComponent);
      Log.e("MediaBrowserCompat", localStringBuilder.toString());
      if (!isCurrent(paramMessenger, "onConnectFailed")) {
        return;
      }
      if (this.mState != 2)
      {
        paramMessenger = new StringBuilder("onConnect from service while mState=");
        paramMessenger.append(getStateLabel(this.mState));
        paramMessenger.append("... ignoring");
        return;
      }
      forceCloseConnection();
      this.mCallback.onConnectionFailed();
    }
    
    public void onLoadChildren(Messenger paramMessenger, String paramString, List paramList, Bundle paramBundle1, Bundle paramBundle2)
    {
      if (!isCurrent(paramMessenger, "onLoadChildren")) {
        return;
      }
      if (MediaBrowserCompat.DEBUG)
      {
        paramMessenger = new StringBuilder("onLoadChildren for ");
        paramMessenger.append(this.mServiceComponent);
        paramMessenger.append(" id=");
        paramMessenger.append(paramString);
      }
      paramMessenger = (MediaBrowserCompat.Subscription)this.mSubscriptions.get(paramString);
      if (paramMessenger == null)
      {
        boolean bool = MediaBrowserCompat.DEBUG;
        return;
      }
      paramMessenger = paramMessenger.getCallback(paramBundle1);
      if (paramMessenger != null)
      {
        if (paramBundle1 == null)
        {
          if (paramList == null)
          {
            paramMessenger.onError(paramString);
            return;
          }
          this.mNotifyChildrenChangedOptions = paramBundle2;
          paramMessenger.onChildrenLoaded(paramString, paramList);
          this.mNotifyChildrenChangedOptions = null;
          return;
        }
        if (paramList == null)
        {
          paramMessenger.onError(paramString, paramBundle1);
          return;
        }
        this.mNotifyChildrenChangedOptions = paramBundle2;
        paramMessenger.onChildrenLoaded(paramString, paramList, paramBundle1);
        this.mNotifyChildrenChangedOptions = null;
      }
    }
    
    public void onServiceConnected(Messenger paramMessenger, String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle)
    {
      if (!isCurrent(paramMessenger, "onConnect")) {
        return;
      }
      if (this.mState != 2)
      {
        paramMessenger = new StringBuilder("onConnect from service while mState=");
        paramMessenger.append(getStateLabel(this.mState));
        paramMessenger.append("... ignoring");
        return;
      }
      this.mRootId = paramString;
      this.mMediaSessionToken = paramToken;
      this.mExtras = paramBundle;
      this.mState = 3;
      if (MediaBrowserCompat.DEBUG) {
        dump();
      }
      this.mCallback.onConnected();
      try
      {
        paramMessenger = this.mSubscriptions.entrySet().iterator();
        while (paramMessenger.hasNext())
        {
          paramToken = (Map.Entry)paramMessenger.next();
          paramString = (String)paramToken.getKey();
          paramBundle = (MediaBrowserCompat.Subscription)paramToken.getValue();
          paramToken = paramBundle.getCallbacks();
          paramBundle = paramBundle.getOptionsList();
          int i = 0;
          while (i < paramToken.size())
          {
            this.mServiceBinderWrapper.addSubscription(paramString, ((MediaBrowserCompat.SubscriptionCallback)paramToken.get(i)).mToken, (Bundle)paramBundle.get(i), this.mCallbacksMessenger);
            i += 1;
          }
        }
        return;
      }
      catch (RemoteException paramMessenger) {}
    }
    
    public void search(@NonNull final String paramString, final Bundle paramBundle, @NonNull final MediaBrowserCompat.SearchCallback paramSearchCallback)
    {
      MediaBrowserCompat.SearchResultReceiver localSearchResultReceiver;
      if (isConnected()) {
        localSearchResultReceiver = new MediaBrowserCompat.SearchResultReceiver(paramString, paramBundle, paramSearchCallback, this.mHandler);
      }
      try
      {
        this.mServiceBinderWrapper.search(paramString, paramBundle, localSearchResultReceiver, this.mCallbacksMessenger);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
      this.mHandler.post(new Runnable()
      {
        public void run()
        {
          paramSearchCallback.onError(paramString, paramBundle);
        }
      });
      return;
      paramString = new StringBuilder("search() called while not connected (state=");
      paramString.append(getStateLabel(this.mState));
      paramString.append(")");
      throw new IllegalStateException(paramString.toString());
    }
    
    public void sendCustomAction(@NonNull final String paramString, final Bundle paramBundle, @Nullable final MediaBrowserCompat.CustomActionCallback paramCustomActionCallback)
    {
      if (isConnected()) {
        localObject = new MediaBrowserCompat.CustomActionResultReceiver(paramString, paramBundle, paramCustomActionCallback, this.mHandler);
      }
      try
      {
        this.mServiceBinderWrapper.sendCustomAction(paramString, paramBundle, (ResultReceiver)localObject, this.mCallbacksMessenger);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
      Object localObject = new StringBuilder("Remote error sending a custom action: action=");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(", extras=");
      ((StringBuilder)localObject).append(paramBundle);
      if (paramCustomActionCallback != null) {
        this.mHandler.post(new Runnable()
        {
          public void run()
          {
            paramCustomActionCallback.onError(paramString, paramBundle, null);
          }
        });
      }
      return;
      paramCustomActionCallback = new StringBuilder("Cannot send a custom action (");
      paramCustomActionCallback.append(paramString);
      paramCustomActionCallback.append(") with extras ");
      paramCustomActionCallback.append(paramBundle);
      paramCustomActionCallback.append(" because the browser is not connected to the service.");
      throw new IllegalStateException(paramCustomActionCallback.toString());
    }
    
    public void subscribe(@NonNull String paramString, Bundle paramBundle, @NonNull MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
    {
      MediaBrowserCompat.Subscription localSubscription2 = (MediaBrowserCompat.Subscription)this.mSubscriptions.get(paramString);
      MediaBrowserCompat.Subscription localSubscription1 = localSubscription2;
      if (localSubscription2 == null)
      {
        localSubscription1 = new MediaBrowserCompat.Subscription();
        this.mSubscriptions.put(paramString, localSubscription1);
      }
      if (paramBundle == null) {
        paramBundle = null;
      } else {
        paramBundle = new Bundle(paramBundle);
      }
      localSubscription1.putCallback(paramBundle, paramSubscriptionCallback);
      if (isConnected()) {}
      try
      {
        this.mServiceBinderWrapper.addSubscription(paramString, paramSubscriptionCallback.mToken, paramBundle, this.mCallbacksMessenger);
        return;
      }
      catch (RemoteException paramString) {}
    }
    
    public void unsubscribe(@NonNull String paramString, MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
    {
      MediaBrowserCompat.Subscription localSubscription = (MediaBrowserCompat.Subscription)this.mSubscriptions.get(paramString);
      if (localSubscription == null) {
        return;
      }
      if (paramSubscriptionCallback == null) {}
      try
      {
        if (!isConnected()) {
          break label134;
        }
        this.mServiceBinderWrapper.removeSubscription(paramString, null, this.mCallbacksMessenger);
      }
      catch (RemoteException localRemoteException)
      {
        List localList1;
        List localList2;
        int i;
        for (;;) {}
      }
      localList1 = localSubscription.getCallbacks();
      localList2 = localSubscription.getOptionsList();
      i = localList1.size() - 1;
      while (i >= 0)
      {
        if (localList1.get(i) == paramSubscriptionCallback)
        {
          if (isConnected()) {
            this.mServiceBinderWrapper.removeSubscription(paramString, paramSubscriptionCallback.mToken, this.mCallbacksMessenger);
          }
          localList1.remove(i);
          localList2.remove(i);
        }
        i -= 1;
      }
      label134:
      if ((localSubscription.isEmpty()) || (paramSubscriptionCallback == null)) {
        this.mSubscriptions.remove(paramString);
      }
    }
    
    class MediaServiceConnection
      implements ServiceConnection
    {
      MediaServiceConnection() {}
      
      private void postOrRun(Runnable paramRunnable)
      {
        if (Thread.currentThread() == MediaBrowserCompat.MediaBrowserImplBase.this.mHandler.getLooper().getThread())
        {
          paramRunnable.run();
          return;
        }
        MediaBrowserCompat.MediaBrowserImplBase.this.mHandler.post(paramRunnable);
      }
      
      boolean isCurrent(String paramString)
      {
        if ((MediaBrowserCompat.MediaBrowserImplBase.this.mServiceConnection == this) && (MediaBrowserCompat.MediaBrowserImplBase.this.mState != 0) && (MediaBrowserCompat.MediaBrowserImplBase.this.mState != 1)) {
          return true;
        }
        if ((MediaBrowserCompat.MediaBrowserImplBase.this.mState != 0) && (MediaBrowserCompat.MediaBrowserImplBase.this.mState != 1))
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(paramString);
          localStringBuilder.append(" for ");
          localStringBuilder.append(MediaBrowserCompat.MediaBrowserImplBase.this.mServiceComponent);
          localStringBuilder.append(" with mServiceConnection=");
          localStringBuilder.append(MediaBrowserCompat.MediaBrowserImplBase.this.mServiceConnection);
          localStringBuilder.append(" this=");
          localStringBuilder.append(this);
        }
        return false;
      }
      
      public void onServiceConnected(final ComponentName paramComponentName, final IBinder paramIBinder)
      {
        postOrRun(new Runnable()
        {
          public void run()
          {
            if (MediaBrowserCompat.DEBUG)
            {
              StringBuilder localStringBuilder = new StringBuilder("MediaServiceConnection.onServiceConnected name=");
              localStringBuilder.append(paramComponentName);
              localStringBuilder.append(" binder=");
              localStringBuilder.append(paramIBinder);
              MediaBrowserCompat.MediaBrowserImplBase.this.dump();
            }
            if (!MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.this.isCurrent("onServiceConnected")) {
              return;
            }
            MediaBrowserCompat.MediaBrowserImplBase.this.mServiceBinderWrapper = new MediaBrowserCompat.ServiceBinderWrapper(paramIBinder, MediaBrowserCompat.MediaBrowserImplBase.this.mRootHints);
            MediaBrowserCompat.MediaBrowserImplBase.this.mCallbacksMessenger = new Messenger(MediaBrowserCompat.MediaBrowserImplBase.this.mHandler);
            MediaBrowserCompat.MediaBrowserImplBase.this.mHandler.setCallbacksMessenger(MediaBrowserCompat.MediaBrowserImplBase.this.mCallbacksMessenger);
            MediaBrowserCompat.MediaBrowserImplBase.this.mState = 2;
            try
            {
              if (MediaBrowserCompat.DEBUG) {
                MediaBrowserCompat.MediaBrowserImplBase.this.dump();
              }
              MediaBrowserCompat.MediaBrowserImplBase.this.mServiceBinderWrapper.connect(MediaBrowserCompat.MediaBrowserImplBase.this.mContext, MediaBrowserCompat.MediaBrowserImplBase.this.mCallbacksMessenger);
              return;
            }
            catch (RemoteException localRemoteException)
            {
              for (;;) {}
            }
            new StringBuilder("RemoteException during connect for ").append(MediaBrowserCompat.MediaBrowserImplBase.this.mServiceComponent);
            if (MediaBrowserCompat.DEBUG) {
              MediaBrowserCompat.MediaBrowserImplBase.this.dump();
            }
          }
        });
      }
      
      public void onServiceDisconnected(final ComponentName paramComponentName)
      {
        postOrRun(new Runnable()
        {
          public void run()
          {
            if (MediaBrowserCompat.DEBUG)
            {
              StringBuilder localStringBuilder = new StringBuilder("MediaServiceConnection.onServiceDisconnected name=");
              localStringBuilder.append(paramComponentName);
              localStringBuilder.append(" this=");
              localStringBuilder.append(this);
              localStringBuilder.append(" mServiceConnection=");
              localStringBuilder.append(MediaBrowserCompat.MediaBrowserImplBase.this.mServiceConnection);
              MediaBrowserCompat.MediaBrowserImplBase.this.dump();
            }
            if (!MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.this.isCurrent("onServiceDisconnected")) {
              return;
            }
            MediaBrowserCompat.MediaBrowserImplBase.this.mServiceBinderWrapper = null;
            MediaBrowserCompat.MediaBrowserImplBase.this.mCallbacksMessenger = null;
            MediaBrowserCompat.MediaBrowserImplBase.this.mHandler.setCallbacksMessenger(null);
            MediaBrowserCompat.MediaBrowserImplBase.this.mState = 4;
            MediaBrowserCompat.MediaBrowserImplBase.this.mCallback.onConnectionSuspended();
          }
        });
      }
    }
  }
  
  static abstract interface MediaBrowserServiceCallbackImpl
  {
    public abstract void onConnectionFailed(Messenger paramMessenger);
    
    public abstract void onLoadChildren(Messenger paramMessenger, String paramString, List paramList, Bundle paramBundle1, Bundle paramBundle2);
    
    public abstract void onServiceConnected(Messenger paramMessenger, String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle);
  }
  
  public static class MediaItem
    implements Parcelable
  {
    public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator()
    {
      public final MediaBrowserCompat.MediaItem createFromParcel(Parcel paramAnonymousParcel)
      {
        return new MediaBrowserCompat.MediaItem(paramAnonymousParcel);
      }
      
      public final MediaBrowserCompat.MediaItem[] newArray(int paramAnonymousInt)
      {
        return new MediaBrowserCompat.MediaItem[paramAnonymousInt];
      }
    };
    public static final int FLAG_BROWSABLE = 1;
    public static final int FLAG_PLAYABLE = 2;
    private final MediaDescriptionCompat mDescription;
    private final int mFlags;
    
    MediaItem(Parcel paramParcel)
    {
      this.mFlags = paramParcel.readInt();
      this.mDescription = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
    }
    
    public MediaItem(@NonNull MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
    {
      if (paramMediaDescriptionCompat != null)
      {
        if (!TextUtils.isEmpty(paramMediaDescriptionCompat.getMediaId()))
        {
          this.mFlags = paramInt;
          this.mDescription = paramMediaDescriptionCompat;
          return;
        }
        throw new IllegalArgumentException("description must have a non-empty media id");
      }
      throw new IllegalArgumentException("description cannot be null");
    }
    
    public static MediaItem fromMediaItem(Object paramObject)
    {
      if ((paramObject != null) && (Build.VERSION.SDK_INT >= 21))
      {
        int i = MediaBrowserCompatApi21.MediaItem.getFlags(paramObject);
        return new MediaItem(MediaDescriptionCompat.fromMediaDescription(MediaBrowserCompatApi21.MediaItem.getDescription(paramObject)), i);
      }
      return null;
    }
    
    public static List<MediaItem> fromMediaItemList(List<?> paramList)
    {
      if ((paramList != null) && (Build.VERSION.SDK_INT >= 21))
      {
        ArrayList localArrayList = new ArrayList(paramList.size());
        paramList = paramList.iterator();
        while (paramList.hasNext()) {
          localArrayList.add(fromMediaItem(paramList.next()));
        }
        return localArrayList;
      }
      return null;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    @NonNull
    public MediaDescriptionCompat getDescription()
    {
      return this.mDescription;
    }
    
    public int getFlags()
    {
      return this.mFlags;
    }
    
    @Nullable
    public String getMediaId()
    {
      return this.mDescription.getMediaId();
    }
    
    public boolean isBrowsable()
    {
      return (this.mFlags & 0x1) != 0;
    }
    
    public boolean isPlayable()
    {
      return (this.mFlags & 0x2) != 0;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("MediaItem{");
      localStringBuilder.append("mFlags=");
      localStringBuilder.append(this.mFlags);
      localStringBuilder.append(", mDescription=");
      localStringBuilder.append(this.mDescription);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.mFlags);
      this.mDescription.writeToParcel(paramParcel, paramInt);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static @interface Flags {}
  }
  
  public static abstract class SearchCallback
  {
    public void onError(@NonNull String paramString, Bundle paramBundle) {}
    
    public void onSearchResult(@NonNull String paramString, Bundle paramBundle, @NonNull List<MediaBrowserCompat.MediaItem> paramList) {}
  }
  
  static class SearchResultReceiver
    extends ResultReceiver
  {
    private final MediaBrowserCompat.SearchCallback mCallback;
    private final Bundle mExtras;
    private final String mQuery;
    
    SearchResultReceiver(String paramString, Bundle paramBundle, MediaBrowserCompat.SearchCallback paramSearchCallback, Handler paramHandler)
    {
      super();
      this.mQuery = paramString;
      this.mExtras = paramBundle;
      this.mCallback = paramSearchCallback;
    }
    
    public void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      MediaSessionCompat.ensureClassLoader(paramBundle);
      if ((paramInt == 0) && (paramBundle != null) && (paramBundle.containsKey("search_results")))
      {
        Parcelable[] arrayOfParcelable = paramBundle.getParcelableArray("search_results");
        paramBundle = null;
        if (arrayOfParcelable != null)
        {
          ArrayList localArrayList = new ArrayList();
          int i = arrayOfParcelable.length;
          paramInt = 0;
          for (;;)
          {
            paramBundle = localArrayList;
            if (paramInt >= i) {
              break;
            }
            localArrayList.add((MediaBrowserCompat.MediaItem)arrayOfParcelable[paramInt]);
            paramInt += 1;
          }
        }
        this.mCallback.onSearchResult(this.mQuery, this.mExtras, paramBundle);
        return;
      }
      this.mCallback.onError(this.mQuery, this.mExtras);
    }
  }
  
  static class ServiceBinderWrapper
  {
    private Messenger mMessenger;
    private Bundle mRootHints;
    
    public ServiceBinderWrapper(IBinder paramIBinder, Bundle paramBundle)
    {
      this.mMessenger = new Messenger(paramIBinder);
      this.mRootHints = paramBundle;
    }
    
    private void sendRequest(int paramInt, Bundle paramBundle, Messenger paramMessenger)
      throws RemoteException
    {
      Message localMessage = Message.obtain();
      localMessage.what = paramInt;
      localMessage.arg1 = 1;
      localMessage.setData(paramBundle);
      localMessage.replyTo = paramMessenger;
      this.mMessenger.send(localMessage);
    }
    
    void addSubscription(String paramString, IBinder paramIBinder, Bundle paramBundle, Messenger paramMessenger)
      throws RemoteException
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_media_item_id", paramString);
      BundleCompat.putBinder(localBundle, "data_callback_token", paramIBinder);
      localBundle.putBundle("data_options", paramBundle);
      sendRequest(3, localBundle, paramMessenger);
    }
    
    void connect(Context paramContext, Messenger paramMessenger)
      throws RemoteException
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_package_name", paramContext.getPackageName());
      localBundle.putBundle("data_root_hints", this.mRootHints);
      sendRequest(1, localBundle, paramMessenger);
    }
    
    void disconnect(Messenger paramMessenger)
      throws RemoteException
    {
      sendRequest(2, null, paramMessenger);
    }
    
    void getMediaItem(String paramString, ResultReceiver paramResultReceiver, Messenger paramMessenger)
      throws RemoteException
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_media_item_id", paramString);
      localBundle.putParcelable("data_result_receiver", paramResultReceiver);
      sendRequest(5, localBundle, paramMessenger);
    }
    
    void registerCallbackMessenger(Context paramContext, Messenger paramMessenger)
      throws RemoteException
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_package_name", paramContext.getPackageName());
      localBundle.putBundle("data_root_hints", this.mRootHints);
      sendRequest(6, localBundle, paramMessenger);
    }
    
    void removeSubscription(String paramString, IBinder paramIBinder, Messenger paramMessenger)
      throws RemoteException
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_media_item_id", paramString);
      BundleCompat.putBinder(localBundle, "data_callback_token", paramIBinder);
      sendRequest(4, localBundle, paramMessenger);
    }
    
    void search(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver, Messenger paramMessenger)
      throws RemoteException
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_search_query", paramString);
      localBundle.putBundle("data_search_extras", paramBundle);
      localBundle.putParcelable("data_result_receiver", paramResultReceiver);
      sendRequest(8, localBundle, paramMessenger);
    }
    
    void sendCustomAction(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver, Messenger paramMessenger)
      throws RemoteException
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_custom_action", paramString);
      localBundle.putBundle("data_custom_action_extras", paramBundle);
      localBundle.putParcelable("data_result_receiver", paramResultReceiver);
      sendRequest(9, localBundle, paramMessenger);
    }
    
    void unregisterCallbackMessenger(Messenger paramMessenger)
      throws RemoteException
    {
      sendRequest(7, null, paramMessenger);
    }
  }
  
  static class Subscription
  {
    private final List<MediaBrowserCompat.SubscriptionCallback> mCallbacks = new ArrayList();
    private final List<Bundle> mOptionsList = new ArrayList();
    
    public MediaBrowserCompat.SubscriptionCallback getCallback(Bundle paramBundle)
    {
      int i = 0;
      while (i < this.mOptionsList.size())
      {
        if (MediaBrowserCompatUtils.areSameOptions((Bundle)this.mOptionsList.get(i), paramBundle)) {
          return (MediaBrowserCompat.SubscriptionCallback)this.mCallbacks.get(i);
        }
        i += 1;
      }
      return null;
    }
    
    public List<MediaBrowserCompat.SubscriptionCallback> getCallbacks()
    {
      return this.mCallbacks;
    }
    
    public List<Bundle> getOptionsList()
    {
      return this.mOptionsList;
    }
    
    public boolean isEmpty()
    {
      return this.mCallbacks.isEmpty();
    }
    
    public void putCallback(Bundle paramBundle, MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
    {
      int i = 0;
      while (i < this.mOptionsList.size())
      {
        if (MediaBrowserCompatUtils.areSameOptions((Bundle)this.mOptionsList.get(i), paramBundle))
        {
          this.mCallbacks.set(i, paramSubscriptionCallback);
          return;
        }
        i += 1;
      }
      this.mCallbacks.add(paramSubscriptionCallback);
      this.mOptionsList.add(paramBundle);
    }
  }
  
  public static abstract class SubscriptionCallback
  {
    final Object mSubscriptionCallbackObj;
    WeakReference<MediaBrowserCompat.Subscription> mSubscriptionRef;
    final IBinder mToken = new Binder();
    
    public SubscriptionCallback()
    {
      Object localObject;
      if (Build.VERSION.SDK_INT >= 26) {
        localObject = MediaBrowserCompatApi26.createSubscriptionCallback(new StubApi26());
      }
      for (;;)
      {
        this.mSubscriptionCallbackObj = localObject;
        return;
        if (Build.VERSION.SDK_INT >= 21) {
          localObject = MediaBrowserCompatApi21.createSubscriptionCallback(new StubApi21());
        } else {
          localObject = null;
        }
      }
    }
    
    public void onChildrenLoaded(@NonNull String paramString, @NonNull List<MediaBrowserCompat.MediaItem> paramList) {}
    
    public void onChildrenLoaded(@NonNull String paramString, @NonNull List<MediaBrowserCompat.MediaItem> paramList, @NonNull Bundle paramBundle) {}
    
    public void onError(@NonNull String paramString) {}
    
    public void onError(@NonNull String paramString, @NonNull Bundle paramBundle) {}
    
    void setSubscription(MediaBrowserCompat.Subscription paramSubscription)
    {
      this.mSubscriptionRef = new WeakReference(paramSubscription);
    }
    
    class StubApi21
      implements MediaBrowserCompatApi21.SubscriptionCallback
    {
      StubApi21() {}
      
      List<MediaBrowserCompat.MediaItem> applyOptions(List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle)
      {
        if (paramList == null) {
          return null;
        }
        int i = paramBundle.getInt("android.media.browse.extra.PAGE", -1);
        int m = paramBundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if ((i == -1) && (m == -1)) {
          return paramList;
        }
        int k = m * i;
        int j = k + m;
        if ((i >= 0) && (m > 0) && (k < paramList.size()))
        {
          i = j;
          if (j > paramList.size()) {
            i = paramList.size();
          }
          return paramList.subList(k, i);
        }
        return Collections.emptyList();
      }
      
      public void onChildrenLoaded(@NonNull String paramString, List<?> paramList)
      {
        if (MediaBrowserCompat.SubscriptionCallback.this.mSubscriptionRef == null) {
          localObject = null;
        } else {
          localObject = (MediaBrowserCompat.Subscription)MediaBrowserCompat.SubscriptionCallback.this.mSubscriptionRef.get();
        }
        if (localObject == null)
        {
          MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(paramString, MediaBrowserCompat.MediaItem.fromMediaItemList(paramList));
          return;
        }
        paramList = MediaBrowserCompat.MediaItem.fromMediaItemList(paramList);
        List localList = ((MediaBrowserCompat.Subscription)localObject).getCallbacks();
        Object localObject = ((MediaBrowserCompat.Subscription)localObject).getOptionsList();
        int i = 0;
        while (i < localList.size())
        {
          Bundle localBundle = (Bundle)((List)localObject).get(i);
          if (localBundle == null) {
            MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(paramString, paramList);
          } else {
            MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(paramString, applyOptions(paramList, localBundle), localBundle);
          }
          i += 1;
        }
      }
      
      public void onError(@NonNull String paramString)
      {
        MediaBrowserCompat.SubscriptionCallback.this.onError(paramString);
      }
    }
    
    class StubApi26
      extends MediaBrowserCompat.SubscriptionCallback.StubApi21
      implements MediaBrowserCompatApi26.SubscriptionCallback
    {
      StubApi26()
      {
        super();
      }
      
      public void onChildrenLoaded(@NonNull String paramString, List<?> paramList, @NonNull Bundle paramBundle)
      {
        MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(paramString, MediaBrowserCompat.MediaItem.fromMediaItemList(paramList), paramBundle);
      }
      
      public void onError(@NonNull String paramString, @NonNull Bundle paramBundle)
      {
        MediaBrowserCompat.SubscriptionCallback.this.onError(paramString, paramBundle);
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/media/MediaBrowserCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */