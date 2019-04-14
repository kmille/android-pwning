package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.annotation.BinderThread;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public abstract class BaseGmsClient<T extends IInterface>
{
  @KeepForSdk
  public static final int CONNECT_STATE_CONNECTED = 4;
  @KeepForSdk
  public static final int CONNECT_STATE_DISCONNECTED = 1;
  @KeepForSdk
  public static final int CONNECT_STATE_DISCONNECTING = 5;
  @KeepForSdk
  public static final String DEFAULT_ACCOUNT = "<<default account>>";
  @KeepForSdk
  public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = { "service_esmobile", "service_googleme" };
  @KeepForSdk
  public static final String KEY_PENDING_INTENT = "pendingIntent";
  private static final Feature[] zzbs = new Feature[0];
  private final Context mContext;
  final Handler mHandler;
  private final Object mLock = new Object();
  private int zzbt;
  private long zzbu;
  private long zzbv;
  private int zzbw;
  private long zzbx;
  @VisibleForTesting
  private zzh zzby;
  private final Looper zzbz;
  private final GmsClientSupervisor zzca;
  private final GoogleApiAvailabilityLight zzcb;
  private final Object zzcc = new Object();
  @GuardedBy("mServiceBrokerLock")
  private IGmsServiceBroker zzcd;
  @VisibleForTesting
  protected ConnectionProgressReportCallbacks zzce;
  @GuardedBy("mLock")
  private T zzcf;
  private final ArrayList<zzc<?>> zzcg = new ArrayList();
  @GuardedBy("mLock")
  private zze zzch;
  @GuardedBy("mLock")
  private int zzci = 1;
  private final BaseConnectionCallbacks zzcj;
  private final BaseOnConnectionFailedListener zzck;
  private final int zzcl;
  private final String zzcm;
  private ConnectionResult zzcn = null;
  private boolean zzco = false;
  private volatile zzb zzcp = null;
  @VisibleForTesting
  protected AtomicInteger zzcq = new AtomicInteger(0);
  
  @KeepForSdk
  @VisibleForTesting
  protected BaseGmsClient(Context paramContext, Handler paramHandler, GmsClientSupervisor paramGmsClientSupervisor, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, int paramInt, BaseConnectionCallbacks paramBaseConnectionCallbacks, BaseOnConnectionFailedListener paramBaseOnConnectionFailedListener)
  {
    this.mContext = ((Context)Preconditions.checkNotNull(paramContext, "Context must not be null"));
    this.mHandler = ((Handler)Preconditions.checkNotNull(paramHandler, "Handler must not be null"));
    this.zzbz = paramHandler.getLooper();
    this.zzca = ((GmsClientSupervisor)Preconditions.checkNotNull(paramGmsClientSupervisor, "Supervisor must not be null"));
    this.zzcb = ((GoogleApiAvailabilityLight)Preconditions.checkNotNull(paramGoogleApiAvailabilityLight, "API availability must not be null"));
    this.zzcl = paramInt;
    this.zzcj = paramBaseConnectionCallbacks;
    this.zzck = paramBaseOnConnectionFailedListener;
    this.zzcm = null;
  }
  
  @KeepForSdk
  protected BaseGmsClient(Context paramContext, Looper paramLooper, int paramInt, BaseConnectionCallbacks paramBaseConnectionCallbacks, BaseOnConnectionFailedListener paramBaseOnConnectionFailedListener, String paramString)
  {
    this(paramContext, paramLooper, GmsClientSupervisor.getInstance(paramContext), GoogleApiAvailabilityLight.getInstance(), paramInt, (BaseConnectionCallbacks)Preconditions.checkNotNull(paramBaseConnectionCallbacks), (BaseOnConnectionFailedListener)Preconditions.checkNotNull(paramBaseOnConnectionFailedListener), paramString);
  }
  
  @KeepForSdk
  @VisibleForTesting
  protected BaseGmsClient(Context paramContext, Looper paramLooper, GmsClientSupervisor paramGmsClientSupervisor, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, int paramInt, BaseConnectionCallbacks paramBaseConnectionCallbacks, BaseOnConnectionFailedListener paramBaseOnConnectionFailedListener, String paramString)
  {
    this.mContext = ((Context)Preconditions.checkNotNull(paramContext, "Context must not be null"));
    this.zzbz = ((Looper)Preconditions.checkNotNull(paramLooper, "Looper must not be null"));
    this.zzca = ((GmsClientSupervisor)Preconditions.checkNotNull(paramGmsClientSupervisor, "Supervisor must not be null"));
    this.zzcb = ((GoogleApiAvailabilityLight)Preconditions.checkNotNull(paramGoogleApiAvailabilityLight, "API availability must not be null"));
    this.mHandler = new zzb(paramLooper);
    this.zzcl = paramInt;
    this.zzcj = paramBaseConnectionCallbacks;
    this.zzck = paramBaseOnConnectionFailedListener;
    this.zzcm = paramString;
  }
  
  private final void zza(int paramInt, T paramT)
  {
    int i;
    if (paramInt == 4) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (paramT != null) {
      j = 1;
    } else {
      j = 0;
    }
    boolean bool;
    if (i == j) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    for (;;)
    {
      synchronized (this.mLock)
      {
        this.zzci = paramInt;
        this.zzcf = paramT;
        onSetConnectState(paramInt, paramT);
        switch (paramInt)
        {
        case 4: 
          onConnectedLocked(paramT);
          break;
        case 2: 
        case 3: 
          if ((this.zzch != null) && (this.zzby != null))
          {
            paramT = this.zzby.zzt();
            str1 = this.zzby.getPackageName();
            localObject2 = new StringBuilder(String.valueOf(paramT).length() + 70 + String.valueOf(str1).length());
            ((StringBuilder)localObject2).append("Calling connect() while still connected, missing disconnect() for ");
            ((StringBuilder)localObject2).append(paramT);
            ((StringBuilder)localObject2).append(" on ");
            ((StringBuilder)localObject2).append(str1);
            Log.e("GmsClient", ((StringBuilder)localObject2).toString());
            this.zzca.zza(this.zzby.zzt(), this.zzby.getPackageName(), this.zzby.zzq(), this.zzch, zzj());
            this.zzcq.incrementAndGet();
          }
          this.zzch = new zze(this.zzcq.get());
          if ((this.zzci == 3) && (getLocalStartServiceAction() != null)) {
            paramT = new zzh(getContext().getPackageName(), getLocalStartServiceAction(), true, 129);
          } else {
            paramT = new zzh(getStartServicePackage(), getStartServiceAction(), false, 129);
          }
          this.zzby = paramT;
          paramT = this.zzca;
          String str1 = this.zzby.zzt();
          Object localObject2 = this.zzby.getPackageName();
          paramInt = this.zzby.zzq();
          zze localzze = this.zzch;
          String str2 = zzj();
          if (!paramT.zza(new GmsClientSupervisor.zza(str1, (String)localObject2, paramInt), localzze, str2))
          {
            paramT = this.zzby.zzt();
            str1 = this.zzby.getPackageName();
            localObject2 = new StringBuilder(String.valueOf(paramT).length() + 34 + String.valueOf(str1).length());
            ((StringBuilder)localObject2).append("unable to connect to service: ");
            ((StringBuilder)localObject2).append(paramT);
            ((StringBuilder)localObject2).append(" on ");
            ((StringBuilder)localObject2).append(str1);
            Log.e("GmsClient", ((StringBuilder)localObject2).toString());
            zza(16, null, this.zzcq.get());
          }
          break;
        case 1: 
          if (this.zzch != null)
          {
            this.zzca.zza(getStartServiceAction(), getStartServicePackage(), 129, this.zzch, zzj());
            this.zzch = null;
          }
          return;
        }
      }
    }
  }
  
  private final void zza(zzb paramzzb)
  {
    this.zzcp = paramzzb;
  }
  
  private final boolean zza(int paramInt1, int paramInt2, T paramT)
  {
    synchronized (this.mLock)
    {
      if (this.zzci != paramInt1) {
        return false;
      }
      zza(paramInt2, paramT);
      return true;
    }
  }
  
  private final void zzb(int paramInt)
  {
    if (zzk())
    {
      paramInt = 5;
      this.zzco = true;
    }
    else
    {
      paramInt = 4;
    }
    this.mHandler.sendMessage(this.mHandler.obtainMessage(paramInt, this.zzcq.get(), 16));
  }
  
  @Nullable
  private final String zzj()
  {
    if (this.zzcm == null) {
      return this.mContext.getClass().getName();
    }
    return this.zzcm;
  }
  
  private final boolean zzk()
  {
    for (;;)
    {
      synchronized (this.mLock)
      {
        if (this.zzci == 3)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  private final boolean zzl()
  {
    if (this.zzco) {
      return false;
    }
    if (TextUtils.isEmpty(getServiceDescriptor())) {
      return false;
    }
    if (TextUtils.isEmpty(getLocalStartServiceAction())) {
      return false;
    }
    try
    {
      Class.forName(getServiceDescriptor());
      return true;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return false;
  }
  
  @KeepForSdk
  public void checkAvailabilityAndConnect()
  {
    int i = this.zzcb.isGooglePlayServicesAvailable(this.mContext, getMinApkVersion());
    if (i != 0)
    {
      zza(1, null);
      triggerNotAvailable(new LegacyClientCallbackAdapter(), i, null);
      return;
    }
    connect(new LegacyClientCallbackAdapter());
  }
  
  @KeepForSdk
  protected final void checkConnected()
  {
    if (isConnected()) {
      return;
    }
    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
  }
  
  @KeepForSdk
  public void connect(@NonNull ConnectionProgressReportCallbacks paramConnectionProgressReportCallbacks)
  {
    this.zzce = ((ConnectionProgressReportCallbacks)Preconditions.checkNotNull(paramConnectionProgressReportCallbacks, "Connection progress callbacks cannot be null."));
    zza(2, null);
  }
  
  @Nullable
  @KeepForSdk
  protected abstract T createServiceInterface(IBinder paramIBinder);
  
  @KeepForSdk
  public void disconnect()
  {
    this.zzcq.incrementAndGet();
    synchronized (this.zzcg)
    {
      int j = this.zzcg.size();
      int i = 0;
      while (i < j)
      {
        ((zzc)this.zzcg.get(i)).removeListener();
        i += 1;
      }
      this.zzcg.clear();
      synchronized (this.zzcc)
      {
        this.zzcd = null;
        zza(1, null);
        return;
      }
    }
  }
  
  @KeepForSdk
  public void dump(String paramString, FileDescriptor arg2, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    synchronized (this.mLock)
    {
      int i = this.zzci;
      paramArrayOfString = this.zzcf;
      synchronized (this.zzcc)
      {
        Object localObject = this.zzcd;
        paramPrintWriter.append(paramString).append("mConnectState=");
        switch (i)
        {
        default: 
          ??? = "UNKNOWN";
        }
        for (;;)
        {
          paramPrintWriter.print(???);
          break;
          ??? = "DISCONNECTING";
          continue;
          ??? = "CONNECTED";
          continue;
          ??? = "LOCAL_CONNECTING";
          continue;
          ??? = "REMOTE_CONNECTING";
          continue;
          ??? = "DISCONNECTED";
        }
        paramPrintWriter.append(" mService=");
        if (paramArrayOfString == null) {
          paramPrintWriter.append("null");
        } else {
          paramPrintWriter.append(getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(paramArrayOfString.asBinder())));
        }
        paramPrintWriter.append(" mServiceBroker=");
        if (localObject == null) {
          paramPrintWriter.println("null");
        } else {
          paramPrintWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((IGmsServiceBroker)localObject).asBinder())));
        }
        paramArrayOfString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        long l;
        StringBuilder localStringBuilder;
        if (this.zzbv > 0L)
        {
          ??? = paramPrintWriter.append(paramString).append("lastConnectedTime=");
          l = this.zzbv;
          localObject = paramArrayOfString.format(new Date(this.zzbv));
          localStringBuilder = new StringBuilder(String.valueOf(localObject).length() + 21);
          localStringBuilder.append(l);
          localStringBuilder.append(" ");
          localStringBuilder.append((String)localObject);
          ???.println(localStringBuilder.toString());
        }
        if (this.zzbu > 0L)
        {
          paramPrintWriter.append(paramString).append("lastSuspendedCause=");
          switch (this.zzbt)
          {
          default: 
            ??? = String.valueOf(this.zzbt);
          }
          for (;;)
          {
            paramPrintWriter.append(???);
            break;
            ??? = "CAUSE_NETWORK_LOST";
            continue;
            ??? = "CAUSE_SERVICE_DISCONNECTED";
          }
          ??? = paramPrintWriter.append(" lastSuspendedTime=");
          l = this.zzbu;
          localObject = paramArrayOfString.format(new Date(this.zzbu));
          localStringBuilder = new StringBuilder(String.valueOf(localObject).length() + 21);
          localStringBuilder.append(l);
          localStringBuilder.append(" ");
          localStringBuilder.append((String)localObject);
          ???.println(localStringBuilder.toString());
        }
        if (this.zzbx > 0L)
        {
          paramPrintWriter.append(paramString).append("lastFailedStatus=").append(CommonStatusCodes.getStatusCodeString(this.zzbw));
          paramString = paramPrintWriter.append(" lastFailedTime=");
          l = this.zzbx;
          ??? = paramArrayOfString.format(new Date(this.zzbx));
          paramPrintWriter = new StringBuilder(String.valueOf(???).length() + 21);
          paramPrintWriter.append(l);
          paramPrintWriter.append(" ");
          paramPrintWriter.append(???);
          paramString.println(paramPrintWriter.toString());
        }
        return;
      }
    }
  }
  
  @KeepForSdk
  public Account getAccount()
  {
    return null;
  }
  
  @KeepForSdk
  public Feature[] getApiFeatures()
  {
    return zzbs;
  }
  
  @Nullable
  @KeepForSdk
  public final Feature[] getAvailableFeatures()
  {
    zzb localzzb = this.zzcp;
    if (localzzb == null) {
      return null;
    }
    return localzzb.zzda;
  }
  
  @KeepForSdk
  public Bundle getConnectionHint()
  {
    return null;
  }
  
  @KeepForSdk
  public final Context getContext()
  {
    return this.mContext;
  }
  
  @KeepForSdk
  public String getEndpointPackageName()
  {
    if ((isConnected()) && (this.zzby != null)) {
      return this.zzby.getPackageName();
    }
    throw new RuntimeException("Failed to connect when checking package");
  }
  
  @KeepForSdk
  protected Bundle getGetServiceRequestExtraArgs()
  {
    return new Bundle();
  }
  
  @Nullable
  @KeepForSdk
  protected String getLocalStartServiceAction()
  {
    return null;
  }
  
  @KeepForSdk
  public final Looper getLooper()
  {
    return this.zzbz;
  }
  
  @KeepForSdk
  public int getMinApkVersion()
  {
    return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
  }
  
  @WorkerThread
  @KeepForSdk
  public void getRemoteService(IAccountAccessor arg1, Set<Scope> paramSet)
  {
    Bundle localBundle = getGetServiceRequestExtraArgs();
    GetServiceRequest localGetServiceRequest = new GetServiceRequest(this.zzcl);
    localGetServiceRequest.zzdh = this.mContext.getPackageName();
    localGetServiceRequest.zzdk = localBundle;
    if (paramSet != null) {
      localGetServiceRequest.zzdj = ((Scope[])paramSet.toArray(new Scope[paramSet.size()]));
    }
    if (requiresSignIn())
    {
      if (getAccount() != null) {
        paramSet = getAccount();
      } else {
        paramSet = new Account("<<default account>>", "com.google");
      }
      localGetServiceRequest.zzdl = paramSet;
      if (??? != null) {
        localGetServiceRequest.zzdi = ???.asBinder();
      }
    }
    else if (requiresAccount())
    {
      localGetServiceRequest.zzdl = getAccount();
    }
    localGetServiceRequest.zzdm = zzbs;
    localGetServiceRequest.zzdn = getApiFeatures();
    try
    {
      synchronized (this.zzcc)
      {
        if (this.zzcd != null) {
          this.zzcd.getService(new zzd(this, this.zzcq.get()), localGetServiceRequest);
        }
        return;
      }
    }
    catch (SecurityException ???)
    {
      throw ???;
      triggerConnectionSuspended(1);
      return;
    }
    catch (DeadObjectException ???)
    {
      for (;;) {}
    }
    catch (RemoteException|RuntimeException ???)
    {
      for (;;) {}
    }
    onPostInitHandler(8, null, null, this.zzcq.get());
  }
  
  @KeepForSdk
  protected Set<Scope> getScopes()
  {
    return Collections.EMPTY_SET;
  }
  
  @KeepForSdk
  public final T getService()
    throws DeadObjectException
  {
    for (;;)
    {
      synchronized (this.mLock)
      {
        if (this.zzci != 5)
        {
          checkConnected();
          if (this.zzcf != null)
          {
            bool = true;
            Preconditions.checkState(bool, "Client is connected but service is null");
            IInterface localIInterface = this.zzcf;
            return localIInterface;
          }
        }
        else
        {
          throw new DeadObjectException();
        }
      }
      boolean bool = false;
    }
  }
  
  @Nullable
  @KeepForSdk
  public IBinder getServiceBrokerBinder()
  {
    synchronized (this.zzcc)
    {
      if (this.zzcd == null) {
        return null;
      }
      IBinder localIBinder = this.zzcd.asBinder();
      return localIBinder;
    }
  }
  
  @NonNull
  @KeepForSdk
  protected abstract String getServiceDescriptor();
  
  @KeepForSdk
  public Intent getSignInIntent()
  {
    throw new UnsupportedOperationException("Not a sign in API");
  }
  
  @NonNull
  @KeepForSdk
  protected abstract String getStartServiceAction();
  
  @KeepForSdk
  protected String getStartServicePackage()
  {
    return "com.google.android.gms";
  }
  
  @KeepForSdk
  public boolean isConnected()
  {
    for (;;)
    {
      synchronized (this.mLock)
      {
        if (this.zzci == 4)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  @KeepForSdk
  public boolean isConnecting()
  {
    for (;;)
    {
      synchronized (this.mLock)
      {
        if (this.zzci == 2) {
          break label40;
        }
        if (this.zzci == 3)
        {
          break label40;
          return bool;
        }
      }
      boolean bool = false;
      continue;
      label40:
      bool = true;
    }
  }
  
  @CallSuper
  @KeepForSdk
  protected void onConnectedLocked(@NonNull T paramT)
  {
    this.zzbv = System.currentTimeMillis();
  }
  
  @CallSuper
  @KeepForSdk
  protected void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    this.zzbw = paramConnectionResult.getErrorCode();
    this.zzbx = System.currentTimeMillis();
  }
  
  @CallSuper
  @KeepForSdk
  protected void onConnectionSuspended(int paramInt)
  {
    this.zzbt = paramInt;
    this.zzbu = System.currentTimeMillis();
  }
  
  @KeepForSdk
  protected void onPostInitHandler(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    this.mHandler.sendMessage(this.mHandler.obtainMessage(1, paramInt2, -1, new zzf(paramInt1, paramIBinder, paramBundle)));
  }
  
  @KeepForSdk
  void onSetConnectState(int paramInt, T paramT) {}
  
  @KeepForSdk
  public void onUserSignOut(@NonNull SignOutCallbacks paramSignOutCallbacks)
  {
    paramSignOutCallbacks.onSignOutComplete();
  }
  
  @KeepForSdk
  public boolean providesSignIn()
  {
    return false;
  }
  
  @KeepForSdk
  public boolean requiresAccount()
  {
    return false;
  }
  
  @KeepForSdk
  public boolean requiresGooglePlayServices()
  {
    return true;
  }
  
  @KeepForSdk
  public boolean requiresSignIn()
  {
    return false;
  }
  
  @KeepForSdk
  public void triggerConnectionSuspended(int paramInt)
  {
    this.mHandler.sendMessage(this.mHandler.obtainMessage(6, this.zzcq.get(), paramInt));
  }
  
  @KeepForSdk
  @VisibleForTesting
  protected void triggerNotAvailable(@NonNull ConnectionProgressReportCallbacks paramConnectionProgressReportCallbacks, int paramInt, @Nullable PendingIntent paramPendingIntent)
  {
    this.zzce = ((ConnectionProgressReportCallbacks)Preconditions.checkNotNull(paramConnectionProgressReportCallbacks, "Connection progress callbacks cannot be null."));
    this.mHandler.sendMessage(this.mHandler.obtainMessage(3, this.zzcq.get(), paramInt, paramPendingIntent));
  }
  
  protected final void zza(int paramInt1, @Nullable Bundle paramBundle, int paramInt2)
  {
    this.mHandler.sendMessage(this.mHandler.obtainMessage(7, paramInt2, -1, new zzg(paramInt1, null)));
  }
  
  @KeepForSdk
  public static abstract interface BaseConnectionCallbacks
  {
    @KeepForSdk
    public abstract void onConnected(@Nullable Bundle paramBundle);
    
    @KeepForSdk
    public abstract void onConnectionSuspended(int paramInt);
  }
  
  @KeepForSdk
  public static abstract interface BaseOnConnectionFailedListener
  {
    public abstract void onConnectionFailed(@NonNull ConnectionResult paramConnectionResult);
  }
  
  @KeepForSdk
  public static abstract interface ConnectionProgressReportCallbacks
  {
    @KeepForSdk
    public abstract void onReportServiceBinding(@NonNull ConnectionResult paramConnectionResult);
  }
  
  public class LegacyClientCallbackAdapter
    implements BaseGmsClient.ConnectionProgressReportCallbacks
  {
    @KeepForSdk
    public LegacyClientCallbackAdapter() {}
    
    public void onReportServiceBinding(@NonNull ConnectionResult paramConnectionResult)
    {
      if (paramConnectionResult.isSuccess())
      {
        BaseGmsClient.this.getRemoteService(null, BaseGmsClient.this.getScopes());
        return;
      }
      if (BaseGmsClient.zzg(BaseGmsClient.this) != null) {
        BaseGmsClient.zzg(BaseGmsClient.this).onConnectionFailed(paramConnectionResult);
      }
    }
  }
  
  @KeepForSdk
  public static abstract interface SignOutCallbacks
  {
    @KeepForSdk
    public abstract void onSignOutComplete();
  }
  
  abstract class zza
    extends BaseGmsClient.zzc<Boolean>
  {
    private final int statusCode;
    private final Bundle zzcr;
    
    @BinderThread
    protected zza(int paramInt, Bundle paramBundle)
    {
      super(Boolean.TRUE);
      this.statusCode = paramInt;
      this.zzcr = paramBundle;
    }
    
    protected abstract void zza(ConnectionResult paramConnectionResult);
    
    protected abstract boolean zzm();
    
    protected final void zzn() {}
  }
  
  final class zzb
    extends zze
  {
    public zzb(Looper paramLooper)
    {
      super();
    }
    
    private static void zza(Message paramMessage)
    {
      paramMessage = (BaseGmsClient.zzc)paramMessage.obj;
      paramMessage.zzn();
      paramMessage.unregister();
    }
    
    private static boolean zzb(Message paramMessage)
    {
      if ((paramMessage.what != 2) && (paramMessage.what != 1)) {
        return paramMessage.what == 7;
      }
      return true;
    }
    
    public final void handleMessage(Message paramMessage)
    {
      if (BaseGmsClient.this.zzcq.get() != paramMessage.arg1)
      {
        if (zzb(paramMessage)) {
          zza(paramMessage);
        }
        return;
      }
      if (((paramMessage.what == 1) || (paramMessage.what == 7) || (paramMessage.what == 4) || (paramMessage.what == 5)) && (!BaseGmsClient.this.isConnecting()))
      {
        zza(paramMessage);
        return;
      }
      int i = paramMessage.what;
      PendingIntent localPendingIntent = null;
      if (i == 4)
      {
        BaseGmsClient.zza(BaseGmsClient.this, new ConnectionResult(paramMessage.arg2));
        if ((BaseGmsClient.zzb(BaseGmsClient.this)) && (!BaseGmsClient.zzc(BaseGmsClient.this)))
        {
          BaseGmsClient.zza(BaseGmsClient.this, 3, null);
          return;
        }
        if (BaseGmsClient.zzd(BaseGmsClient.this) != null) {
          paramMessage = BaseGmsClient.zzd(BaseGmsClient.this);
        } else {
          paramMessage = new ConnectionResult(8);
        }
        BaseGmsClient.this.zzce.onReportServiceBinding(paramMessage);
        BaseGmsClient.this.onConnectionFailed(paramMessage);
        return;
      }
      if (paramMessage.what == 5)
      {
        if (BaseGmsClient.zzd(BaseGmsClient.this) != null) {
          paramMessage = BaseGmsClient.zzd(BaseGmsClient.this);
        } else {
          paramMessage = new ConnectionResult(8);
        }
        BaseGmsClient.this.zzce.onReportServiceBinding(paramMessage);
        BaseGmsClient.this.onConnectionFailed(paramMessage);
        return;
      }
      if (paramMessage.what == 3)
      {
        if ((paramMessage.obj instanceof PendingIntent)) {
          localPendingIntent = (PendingIntent)paramMessage.obj;
        }
        paramMessage = new ConnectionResult(paramMessage.arg2, localPendingIntent);
        BaseGmsClient.this.zzce.onReportServiceBinding(paramMessage);
        BaseGmsClient.this.onConnectionFailed(paramMessage);
        return;
      }
      if (paramMessage.what == 6)
      {
        BaseGmsClient.zza(BaseGmsClient.this, 5, null);
        if (BaseGmsClient.zze(BaseGmsClient.this) != null) {
          BaseGmsClient.zze(BaseGmsClient.this).onConnectionSuspended(paramMessage.arg2);
        }
        BaseGmsClient.this.onConnectionSuspended(paramMessage.arg2);
        BaseGmsClient.zza(BaseGmsClient.this, 5, 1, null);
        return;
      }
      if ((paramMessage.what == 2) && (!BaseGmsClient.this.isConnected()))
      {
        zza(paramMessage);
        return;
      }
      if (zzb(paramMessage))
      {
        ((BaseGmsClient.zzc)paramMessage.obj).zzo();
        return;
      }
      i = paramMessage.what;
      paramMessage = new StringBuilder(45);
      paramMessage.append("Don't know how to handle message: ");
      paramMessage.append(i);
      Log.wtf("GmsClient", paramMessage.toString(), new Exception());
    }
  }
  
  protected abstract class zzc<TListener>
  {
    private TListener zzct;
    private boolean zzcu;
    
    public zzc()
    {
      Object localObject;
      this.zzct = localObject;
      this.zzcu = false;
    }
    
    public final void removeListener()
    {
      try
      {
        this.zzct = null;
        return;
      }
      finally {}
    }
    
    public final void unregister()
    {
      removeListener();
      synchronized (BaseGmsClient.zzf(BaseGmsClient.this))
      {
        BaseGmsClient.zzf(BaseGmsClient.this).remove(this);
        return;
      }
    }
    
    protected abstract void zza(TListener paramTListener);
    
    protected abstract void zzn();
    
    /* Error */
    public final void zzo()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 24	com/google/android/gms/common/internal/BaseGmsClient$zzc:zzct	Ljava/lang/Object;
      //   6: astore_1
      //   7: aload_0
      //   8: getfield 26	com/google/android/gms/common/internal/BaseGmsClient$zzc:zzcu	Z
      //   11: ifeq +46 -> 57
      //   14: aload_0
      //   15: invokestatic 55	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   18: astore_2
      //   19: new 57	java/lang/StringBuilder
      //   22: dup
      //   23: aload_2
      //   24: invokestatic 55	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   27: invokevirtual 61	java/lang/String:length	()I
      //   30: bipush 47
      //   32: iadd
      //   33: invokespecial 64	java/lang/StringBuilder:<init>	(I)V
      //   36: astore_3
      //   37: aload_3
      //   38: ldc 66
      //   40: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   43: pop
      //   44: aload_3
      //   45: aload_2
      //   46: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   49: pop
      //   50: aload_3
      //   51: ldc 72
      //   53: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   56: pop
      //   57: aload_0
      //   58: monitorexit
      //   59: aload_1
      //   60: ifnull +18 -> 78
      //   63: aload_0
      //   64: aload_1
      //   65: invokevirtual 74	com/google/android/gms/common/internal/BaseGmsClient$zzc:zza	(Ljava/lang/Object;)V
      //   68: goto +14 -> 82
      //   71: astore_1
      //   72: aload_0
      //   73: invokevirtual 76	com/google/android/gms/common/internal/BaseGmsClient$zzc:zzn	()V
      //   76: aload_1
      //   77: athrow
      //   78: aload_0
      //   79: invokevirtual 76	com/google/android/gms/common/internal/BaseGmsClient$zzc:zzn	()V
      //   82: aload_0
      //   83: monitorenter
      //   84: aload_0
      //   85: iconst_1
      //   86: putfield 26	com/google/android/gms/common/internal/BaseGmsClient$zzc:zzcu	Z
      //   89: aload_0
      //   90: monitorexit
      //   91: aload_0
      //   92: invokevirtual 78	com/google/android/gms/common/internal/BaseGmsClient$zzc:unregister	()V
      //   95: return
      //   96: astore_1
      //   97: aload_0
      //   98: monitorexit
      //   99: aload_1
      //   100: athrow
      //   101: astore_1
      //   102: aload_0
      //   103: monitorexit
      //   104: aload_1
      //   105: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	106	0	this	zzc
      //   6	59	1	localObject1	Object
      //   71	6	1	localRuntimeException	RuntimeException
      //   96	4	1	localObject2	Object
      //   101	4	1	localObject3	Object
      //   18	28	2	str	String
      //   36	15	3	localStringBuilder	StringBuilder
      // Exception table:
      //   from	to	target	type
      //   63	68	71	java/lang/RuntimeException
      //   84	91	96	finally
      //   97	99	96	finally
      //   2	57	101	finally
      //   57	59	101	finally
      //   102	104	101	finally
    }
  }
  
  @VisibleForTesting
  public static final class zzd
    extends IGmsCallbacks.zza
  {
    private BaseGmsClient zzcv;
    private final int zzcw;
    
    public zzd(@NonNull BaseGmsClient paramBaseGmsClient, int paramInt)
    {
      this.zzcv = paramBaseGmsClient;
      this.zzcw = paramInt;
    }
    
    @BinderThread
    public final void onPostInitComplete(int paramInt, @NonNull IBinder paramIBinder, @Nullable Bundle paramBundle)
    {
      Preconditions.checkNotNull(this.zzcv, "onPostInitComplete can be called only once per call to getRemoteService");
      this.zzcv.onPostInitHandler(paramInt, paramIBinder, paramBundle, this.zzcw);
      this.zzcv = null;
    }
    
    @BinderThread
    public final void zza(int paramInt, @Nullable Bundle paramBundle)
    {
      Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
    
    @BinderThread
    public final void zza(int paramInt, @NonNull IBinder paramIBinder, @NonNull zzb paramzzb)
    {
      Preconditions.checkNotNull(this.zzcv, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
      Preconditions.checkNotNull(paramzzb);
      BaseGmsClient.zza(this.zzcv, paramzzb);
      onPostInitComplete(paramInt, paramIBinder, paramzzb.zzcz);
    }
  }
  
  @VisibleForTesting
  public final class zze
    implements ServiceConnection
  {
    private final int zzcw;
    
    public zze(int paramInt)
    {
      this.zzcw = paramInt;
    }
    
    public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      if (paramIBinder == null)
      {
        BaseGmsClient.zza(BaseGmsClient.this, 16);
        return;
      }
      synchronized (BaseGmsClient.zza(BaseGmsClient.this))
      {
        BaseGmsClient localBaseGmsClient = BaseGmsClient.this;
        if (paramIBinder == null)
        {
          paramComponentName = null;
        }
        else
        {
          paramComponentName = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
          if ((paramComponentName != null) && ((paramComponentName instanceof IGmsServiceBroker))) {
            paramComponentName = (IGmsServiceBroker)paramComponentName;
          } else {
            paramComponentName = new IGmsServiceBroker.Stub.zza(paramIBinder);
          }
        }
        BaseGmsClient.zza(localBaseGmsClient, paramComponentName);
        BaseGmsClient.this.zza(0, null, this.zzcw);
        return;
      }
    }
    
    public final void onServiceDisconnected(ComponentName arg1)
    {
      synchronized (BaseGmsClient.zza(BaseGmsClient.this))
      {
        BaseGmsClient.zza(BaseGmsClient.this, null);
        BaseGmsClient.this.mHandler.sendMessage(BaseGmsClient.this.mHandler.obtainMessage(6, this.zzcw, 1));
        return;
      }
    }
  }
  
  protected final class zzf
    extends BaseGmsClient.zza
  {
    private final IBinder zzcx;
    
    @BinderThread
    public zzf(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    {
      super(paramInt, paramBundle);
      this.zzcx = paramIBinder;
    }
    
    protected final void zza(ConnectionResult paramConnectionResult)
    {
      if (BaseGmsClient.zzg(BaseGmsClient.this) != null) {
        BaseGmsClient.zzg(BaseGmsClient.this).onConnectionFailed(paramConnectionResult);
      }
      BaseGmsClient.this.onConnectionFailed(paramConnectionResult);
    }
    
    protected final boolean zzm()
    {
      boolean bool2 = false;
      try
      {
        Object localObject = this.zzcx.getInterfaceDescriptor();
        if (!BaseGmsClient.this.getServiceDescriptor().equals(localObject))
        {
          String str = BaseGmsClient.this.getServiceDescriptor();
          StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(localObject).length());
          localStringBuilder.append("service descriptor mismatch: ");
          localStringBuilder.append(str);
          localStringBuilder.append(" vs. ");
          localStringBuilder.append((String)localObject);
          Log.e("GmsClient", localStringBuilder.toString());
          return false;
        }
        localObject = BaseGmsClient.this.createServiceInterface(this.zzcx);
        boolean bool1 = bool2;
        if (localObject != null) {
          if (!BaseGmsClient.zza(BaseGmsClient.this, 2, 4, (IInterface)localObject))
          {
            bool1 = bool2;
            if (!BaseGmsClient.zza(BaseGmsClient.this, 3, 4, (IInterface)localObject)) {}
          }
          else
          {
            BaseGmsClient.zza(BaseGmsClient.this, null);
            localObject = BaseGmsClient.this.getConnectionHint();
            if (BaseGmsClient.zze(BaseGmsClient.this) != null) {
              BaseGmsClient.zze(BaseGmsClient.this).onConnected((Bundle)localObject);
            }
            bool1 = true;
          }
        }
        return bool1;
      }
      catch (RemoteException localRemoteException) {}
      return false;
    }
  }
  
  protected final class zzg
    extends BaseGmsClient.zza
  {
    @BinderThread
    public zzg(int paramInt, @Nullable Bundle paramBundle)
    {
      super(paramInt, null);
    }
    
    protected final void zza(ConnectionResult paramConnectionResult)
    {
      BaseGmsClient.this.zzce.onReportServiceBinding(paramConnectionResult);
      BaseGmsClient.this.onConnectionFailed(paramConnectionResult);
    }
    
    protected final boolean zzm()
    {
      BaseGmsClient.this.zzce.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
      return true;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/BaseGmsClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */