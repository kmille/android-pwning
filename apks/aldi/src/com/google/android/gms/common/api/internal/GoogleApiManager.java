package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.ArraySet;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.signin.zad;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public class GoogleApiManager
  implements Handler.Callback
{
  private static final Object lock = new Object();
  public static final Status zahw = new Status(4, "Sign-out occurred while this API call was in progress.");
  private static final Status zahx = new Status(4, "The user must be signed in to make this API call.");
  @GuardedBy("lock")
  private static GoogleApiManager zaib;
  private final Handler handler;
  private long zahy = 5000L;
  private long zahz = 120000L;
  private long zaia = 10000L;
  private final Context zaic;
  private final GoogleApiAvailability zaid;
  private final GoogleApiAvailabilityCache zaie;
  private final AtomicInteger zaif = new AtomicInteger(1);
  private final AtomicInteger zaig = new AtomicInteger(0);
  private final Map<zai<?>, zaa<?>> zaih = new ConcurrentHashMap(5, 0.75F, 1);
  @GuardedBy("lock")
  private zaae zaii = null;
  @GuardedBy("lock")
  private final Set<zai<?>> zaij = new ArraySet();
  private final Set<zai<?>> zaik = new ArraySet();
  
  @KeepForSdk
  private GoogleApiManager(Context paramContext, Looper paramLooper, GoogleApiAvailability paramGoogleApiAvailability)
  {
    this.zaic = paramContext;
    this.handler = new com.google.android.gms.internal.base.zal(paramLooper, this);
    this.zaid = paramGoogleApiAvailability;
    this.zaie = new GoogleApiAvailabilityCache(paramGoogleApiAvailability);
    this.handler.sendMessage(this.handler.obtainMessage(6));
  }
  
  @KeepForSdk
  public static void reportSignOut()
  {
    synchronized (lock)
    {
      if (zaib != null)
      {
        GoogleApiManager localGoogleApiManager = zaib;
        localGoogleApiManager.zaig.incrementAndGet();
        localGoogleApiManager.handler.sendMessageAtFrontOfQueue(localGoogleApiManager.handler.obtainMessage(10));
      }
      return;
    }
  }
  
  public static GoogleApiManager zab(Context paramContext)
  {
    synchronized (lock)
    {
      if (zaib == null)
      {
        Object localObject2 = new HandlerThread("GoogleApiHandler", 9);
        ((HandlerThread)localObject2).start();
        localObject2 = ((HandlerThread)localObject2).getLooper();
        zaib = new GoogleApiManager(paramContext.getApplicationContext(), (Looper)localObject2, GoogleApiAvailability.getInstance());
      }
      paramContext = zaib;
      return paramContext;
    }
  }
  
  @WorkerThread
  private final void zab(GoogleApi<?> paramGoogleApi)
  {
    zai localzai = paramGoogleApi.zak();
    zaa localzaa2 = (zaa)this.zaih.get(localzai);
    zaa localzaa1 = localzaa2;
    if (localzaa2 == null)
    {
      localzaa1 = new zaa(paramGoogleApi);
      this.zaih.put(localzai, localzaa1);
    }
    if (localzaa1.requiresSignIn()) {
      this.zaik.add(localzai);
    }
    localzaa1.connect();
  }
  
  public static GoogleApiManager zabc()
  {
    synchronized (lock)
    {
      Preconditions.checkNotNull(zaib, "Must guarantee manager is non-null before using getInstance");
      GoogleApiManager localGoogleApiManager = zaib;
      return localGoogleApiManager;
    }
  }
  
  @WorkerThread
  public boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    long l = 300000L;
    Object localObject1;
    Object localObject2;
    label606:
    Object localObject3;
    switch (i)
    {
    default: 
      i = paramMessage.what;
      paramMessage = new StringBuilder(31);
      paramMessage.append("Unknown message id: ");
      paramMessage.append(i);
      return false;
    case 16: 
      paramMessage = (zab)paramMessage.obj;
      if (this.zaih.containsKey(zab.zac(paramMessage)))
      {
        zaa.zab((zaa)this.zaih.get(zab.zac(paramMessage)), paramMessage);
        return true;
      }
      break;
    case 15: 
      paramMessage = (zab)paramMessage.obj;
      if (this.zaih.containsKey(zab.zac(paramMessage)))
      {
        zaa.zaa((zaa)this.zaih.get(zab.zac(paramMessage)), paramMessage);
        return true;
      }
      break;
    case 14: 
      paramMessage = (zaaf)paramMessage.obj;
      localObject1 = paramMessage.zak();
      if (!this.zaih.containsKey(localObject1)) {
        localObject1 = paramMessage.zaal();
      }
      boolean bool;
      for (paramMessage = Boolean.FALSE;; paramMessage = Boolean.valueOf(bool))
      {
        ((TaskCompletionSource)localObject1).setResult(paramMessage);
        return true;
        bool = zaa.zaa((zaa)this.zaih.get(localObject1), false);
        localObject1 = paramMessage.zaal();
      }
    case 12: 
      if (this.zaih.containsKey(paramMessage.obj))
      {
        ((zaa)this.zaih.get(paramMessage.obj)).zabp();
        return true;
      }
      break;
    case 11: 
      if (this.zaih.containsKey(paramMessage.obj))
      {
        ((zaa)this.zaih.get(paramMessage.obj)).zaav();
        return true;
      }
      break;
    case 10: 
      paramMessage = this.zaik.iterator();
      while (paramMessage.hasNext())
      {
        localObject1 = (zai)paramMessage.next();
        ((zaa)this.zaih.remove(localObject1)).zabj();
      }
      this.zaik.clear();
      return true;
    case 9: 
      if (this.zaih.containsKey(paramMessage.obj))
      {
        ((zaa)this.zaih.get(paramMessage.obj)).resume();
        return true;
      }
      break;
    case 7: 
      zab((GoogleApi)paramMessage.obj);
      return true;
    case 6: 
      if ((PlatformVersion.isAtLeastIceCreamSandwich()) && ((this.zaic.getApplicationContext() instanceof Application)))
      {
        BackgroundDetector.initialize((Application)this.zaic.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new zabi(this));
        if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true))
        {
          this.zaia = 300000L;
          return true;
        }
      }
      break;
    case 5: 
      i = paramMessage.arg1;
      localObject1 = (ConnectionResult)paramMessage.obj;
      localObject2 = this.zaih.values().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramMessage = (zaa)((Iterator)localObject2).next();
        if (paramMessage.getInstanceId() == i) {
          break label606;
        }
      }
      paramMessage = null;
      if (paramMessage != null)
      {
        localObject2 = this.zaid.getErrorString(((ConnectionResult)localObject1).getErrorCode());
        localObject1 = ((ConnectionResult)localObject1).getErrorMessage();
        localObject3 = new StringBuilder(String.valueOf(localObject2).length() + 69 + String.valueOf(localObject1).length());
        ((StringBuilder)localObject3).append("Error resolution was canceled by the user, original error message: ");
        ((StringBuilder)localObject3).append((String)localObject2);
        ((StringBuilder)localObject3).append(": ");
        ((StringBuilder)localObject3).append((String)localObject1);
        paramMessage.zac(new Status(17, ((StringBuilder)localObject3).toString()));
        return true;
      }
      paramMessage = new StringBuilder(76);
      paramMessage.append("Could not find API instance ");
      paramMessage.append(i);
      paramMessage.append(" while trying to fail enqueued calls.");
      Log.wtf("GoogleApiManager", paramMessage.toString(), new Exception());
      return true;
    case 4: 
    case 8: 
    case 13: 
      localObject2 = (zabv)paramMessage.obj;
      localObject1 = (zaa)this.zaih.get(((zabv)localObject2).zajs.zak());
      paramMessage = (Message)localObject1;
      if (localObject1 == null)
      {
        zab(((zabv)localObject2).zajs);
        paramMessage = (zaa)this.zaih.get(((zabv)localObject2).zajs.zak());
      }
      if ((paramMessage.requiresSignIn()) && (this.zaig.get() != ((zabv)localObject2).zajr))
      {
        ((zabv)localObject2).zajq.zaa(zahw);
        paramMessage.zabj();
        return true;
      }
      paramMessage.zaa(((zabv)localObject2).zajq);
      return true;
    case 3: 
      paramMessage = this.zaih.values().iterator();
    case 2: 
    case 1: 
      while (paramMessage.hasNext())
      {
        localObject1 = (zaa)paramMessage.next();
        ((zaa)localObject1).zabl();
        ((zaa)localObject1).connect();
        continue;
        paramMessage = (zak)paramMessage.obj;
        localObject1 = paramMessage.zap().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (zai)((Iterator)localObject1).next();
          localObject3 = (zaa)this.zaih.get(localObject2);
          if (localObject3 == null)
          {
            paramMessage.zaa((zai)localObject2, new ConnectionResult(13), null);
            return true;
          }
          if (((zaa)localObject3).isConnected())
          {
            paramMessage.zaa((zai)localObject2, ConnectionResult.RESULT_SUCCESS, ((zaa)localObject3).zaab().getEndpointPackageName());
          }
          else if (((zaa)localObject3).zabm() != null)
          {
            paramMessage.zaa((zai)localObject2, ((zaa)localObject3).zabm(), null);
          }
          else
          {
            ((zaa)localObject3).zaa(paramMessage);
            ((zaa)localObject3).connect();
            continue;
            if (((Boolean)paramMessage.obj).booleanValue()) {
              l = 10000L;
            }
            this.zaia = l;
            this.handler.removeMessages(12);
            paramMessage = this.zaih.keySet().iterator();
            while (paramMessage.hasNext())
            {
              localObject1 = (zai)paramMessage.next();
              this.handler.sendMessageDelayed(this.handler.obtainMessage(12, localObject1), this.zaia);
            }
          }
        }
      }
    }
    return true;
  }
  
  final void maybeSignOut()
  {
    this.zaig.incrementAndGet();
    this.handler.sendMessage(this.handler.obtainMessage(10));
  }
  
  final PendingIntent zaa(zai<?> paramzai, int paramInt)
  {
    paramzai = (zaa)this.zaih.get(paramzai);
    if (paramzai == null) {
      return null;
    }
    paramzai = paramzai.zabq();
    if (paramzai == null) {
      return null;
    }
    return PendingIntent.getActivity(this.zaic, paramInt, paramzai.getSignInIntent(), 134217728);
  }
  
  public final <O extends Api.ApiOptions> Task<Boolean> zaa(@NonNull GoogleApi<O> paramGoogleApi, @NonNull ListenerHolder.ListenerKey<?> paramListenerKey)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    paramListenerKey = new zah(paramListenerKey, localTaskCompletionSource);
    this.handler.sendMessage(this.handler.obtainMessage(13, new zabv(paramListenerKey, this.zaig.get(), paramGoogleApi)));
    return localTaskCompletionSource.getTask();
  }
  
  public final <O extends Api.ApiOptions> Task<Void> zaa(@NonNull GoogleApi<O> paramGoogleApi, @NonNull RegisterListenerMethod<Api.AnyClient, ?> paramRegisterListenerMethod, @NonNull UnregisterListenerMethod<Api.AnyClient, ?> paramUnregisterListenerMethod)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    paramRegisterListenerMethod = new zaf(new zabw(paramRegisterListenerMethod, paramUnregisterListenerMethod), localTaskCompletionSource);
    this.handler.sendMessage(this.handler.obtainMessage(8, new zabv(paramRegisterListenerMethod, this.zaig.get(), paramGoogleApi)));
    return localTaskCompletionSource.getTask();
  }
  
  public final Task<Map<zai<?>, String>> zaa(Iterable<? extends GoogleApi<?>> paramIterable)
  {
    paramIterable = new zak(paramIterable);
    this.handler.sendMessage(this.handler.obtainMessage(2, paramIterable));
    return paramIterable.getTask();
  }
  
  public final void zaa(ConnectionResult paramConnectionResult, int paramInt)
  {
    if (!zac(paramConnectionResult, paramInt)) {
      this.handler.sendMessage(this.handler.obtainMessage(5, paramInt, 0, paramConnectionResult));
    }
  }
  
  public final void zaa(GoogleApi<?> paramGoogleApi)
  {
    this.handler.sendMessage(this.handler.obtainMessage(7, paramGoogleApi));
  }
  
  public final <O extends Api.ApiOptions> void zaa(GoogleApi<O> paramGoogleApi, int paramInt, BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> paramApiMethodImpl)
  {
    paramApiMethodImpl = new zae(paramInt, paramApiMethodImpl);
    this.handler.sendMessage(this.handler.obtainMessage(4, new zabv(paramApiMethodImpl, this.zaig.get(), paramGoogleApi)));
  }
  
  public final <O extends Api.ApiOptions, ResultT> void zaa(GoogleApi<O> paramGoogleApi, int paramInt, TaskApiCall<Api.AnyClient, ResultT> paramTaskApiCall, TaskCompletionSource<ResultT> paramTaskCompletionSource, StatusExceptionMapper paramStatusExceptionMapper)
  {
    paramTaskApiCall = new zag(paramInt, paramTaskApiCall, paramTaskCompletionSource, paramStatusExceptionMapper);
    this.handler.sendMessage(this.handler.obtainMessage(4, new zabv(paramTaskApiCall, this.zaig.get(), paramGoogleApi)));
  }
  
  public final void zaa(@NonNull zaae paramzaae)
  {
    synchronized (lock)
    {
      if (this.zaii != paramzaae)
      {
        this.zaii = paramzaae;
        this.zaij.clear();
      }
      this.zaij.addAll(paramzaae.zaaj());
      return;
    }
  }
  
  final void zab(@NonNull zaae paramzaae)
  {
    synchronized (lock)
    {
      if (this.zaii == paramzaae)
      {
        this.zaii = null;
        this.zaij.clear();
      }
      return;
    }
  }
  
  public final int zabd()
  {
    return this.zaif.getAndIncrement();
  }
  
  public final Task<Boolean> zac(GoogleApi<?> paramGoogleApi)
  {
    paramGoogleApi = new zaaf(paramGoogleApi.zak());
    this.handler.sendMessage(this.handler.obtainMessage(14, paramGoogleApi));
    return paramGoogleApi.zaal().getTask();
  }
  
  final boolean zac(ConnectionResult paramConnectionResult, int paramInt)
  {
    return this.zaid.zaa(this.zaic, paramConnectionResult, paramInt);
  }
  
  public final void zao()
  {
    this.handler.sendMessage(this.handler.obtainMessage(3));
  }
  
  public final class zaa<O extends Api.ApiOptions>
    implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zar
  {
    private final zai<O> zafp;
    private final Queue<zab> zaim = new LinkedList();
    private final Api.Client zain;
    private final Api.AnyClient zaio;
    private final zaab zaip;
    private final Set<zak> zaiq = new HashSet();
    private final Map<ListenerHolder.ListenerKey<?>, zabw> zair = new HashMap();
    private final int zais;
    private final zace zait;
    private boolean zaiu;
    private final List<GoogleApiManager.zab> zaiv = new ArrayList();
    private ConnectionResult zaiw = null;
    
    @WorkerThread
    public zaa()
    {
      Object localObject1;
      this.zain = ((GoogleApi)localObject1).zaa(GoogleApiManager.zaa(GoogleApiManager.this).getLooper(), this);
      if ((this.zain instanceof SimpleClientAdapter)) {}
      for (Object localObject2 = ((SimpleClientAdapter)this.zain).getClient();; localObject2 = this.zain)
      {
        this.zaio = ((Api.AnyClient)localObject2);
        break;
      }
      this.zafp = ((GoogleApi)localObject1).zak();
      this.zaip = new zaab();
      this.zais = ((GoogleApi)localObject1).getInstanceId();
      if (this.zain.requiresSignIn())
      {
        this.zait = ((GoogleApi)localObject1).zaa(GoogleApiManager.zab(GoogleApiManager.this), GoogleApiManager.zaa(GoogleApiManager.this));
        return;
      }
      this.zait = null;
    }
    
    @Nullable
    @WorkerThread
    private final Feature zaa(@Nullable Feature[] paramArrayOfFeature)
    {
      if (paramArrayOfFeature != null)
      {
        if (paramArrayOfFeature.length == 0) {
          return null;
        }
        Object localObject2 = this.zain.getAvailableFeatures();
        int j = 0;
        Object localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = new Feature[0];
        }
        localObject2 = new ArrayMap(localObject1.length);
        int k = localObject1.length;
        int i = 0;
        while (i < k)
        {
          Object localObject3 = localObject1[i];
          ((Map)localObject2).put(((Feature)localObject3).getName(), Long.valueOf(((Feature)localObject3).getVersion()));
          i += 1;
        }
        k = paramArrayOfFeature.length;
        i = j;
        while (i < k)
        {
          localObject1 = paramArrayOfFeature[i];
          if (((Map)localObject2).containsKey(((Feature)localObject1).getName()))
          {
            if (((Long)((Map)localObject2).get(((Feature)localObject1).getName())).longValue() < ((Feature)localObject1).getVersion()) {
              return (Feature)localObject1;
            }
            i += 1;
          }
          else
          {
            return (Feature)localObject1;
          }
        }
      }
      return null;
    }
    
    @WorkerThread
    private final void zaa(GoogleApiManager.zab paramzab)
    {
      if (!this.zaiv.contains(paramzab)) {
        return;
      }
      if (!this.zaiu)
      {
        if (!this.zain.isConnected())
        {
          connect();
          return;
        }
        zabi();
      }
    }
    
    @WorkerThread
    private final void zab(GoogleApiManager.zab paramzab)
    {
      if (this.zaiv.remove(paramzab))
      {
        GoogleApiManager.zaa(GoogleApiManager.this).removeMessages(15, paramzab);
        GoogleApiManager.zaa(GoogleApiManager.this).removeMessages(16, paramzab);
        paramzab = GoogleApiManager.zab.zad(paramzab);
        ArrayList localArrayList = new ArrayList(this.zaim.size());
        Object localObject = this.zaim.iterator();
        while (((Iterator)localObject).hasNext())
        {
          zab localzab = (zab)((Iterator)localObject).next();
          if ((localzab instanceof zac))
          {
            Feature[] arrayOfFeature = ((zac)localzab).zab(this);
            if ((arrayOfFeature != null) && (ArrayUtils.contains(arrayOfFeature, paramzab))) {
              localArrayList.add(localzab);
            }
          }
        }
        localArrayList = (ArrayList)localArrayList;
        int j = localArrayList.size();
        int i = 0;
        while (i < j)
        {
          localObject = localArrayList.get(i);
          i += 1;
          localObject = (zab)localObject;
          this.zaim.remove(localObject);
          ((zab)localObject).zaa(new UnsupportedApiCallException(paramzab));
        }
      }
    }
    
    @WorkerThread
    private final boolean zab(zab paramzab)
    {
      if (!(paramzab instanceof zac))
      {
        zac(paramzab);
        return true;
      }
      zac localzac = (zac)paramzab;
      Feature localFeature = zaa(localzac.zab(this));
      if (localFeature == null)
      {
        zac(paramzab);
        return true;
      }
      if (localzac.zac(this))
      {
        paramzab = new GoogleApiManager.zab(this.zafp, localFeature, null);
        int i = this.zaiv.indexOf(paramzab);
        if (i >= 0)
        {
          paramzab = (GoogleApiManager.zab)this.zaiv.get(i);
          GoogleApiManager.zaa(GoogleApiManager.this).removeMessages(15, paramzab);
          GoogleApiManager.zaa(GoogleApiManager.this).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(GoogleApiManager.this), 15, paramzab), GoogleApiManager.zac(GoogleApiManager.this));
        }
        else
        {
          this.zaiv.add(paramzab);
          GoogleApiManager.zaa(GoogleApiManager.this).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(GoogleApiManager.this), 15, paramzab), GoogleApiManager.zac(GoogleApiManager.this));
          GoogleApiManager.zaa(GoogleApiManager.this).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(GoogleApiManager.this), 16, paramzab), GoogleApiManager.zad(GoogleApiManager.this));
          paramzab = new ConnectionResult(2, null);
          if (!zah(paramzab)) {
            GoogleApiManager.this.zac(paramzab, this.zais);
          }
        }
      }
      else
      {
        localzac.zaa(new UnsupportedApiCallException(localFeature));
      }
      return false;
    }
    
    @WorkerThread
    private final void zabg()
    {
      zabl();
      zai(ConnectionResult.RESULT_SUCCESS);
      zabn();
      Iterator localIterator = this.zair.values().iterator();
      zabw localzabw;
      if (localIterator.hasNext())
      {
        localzabw = (zabw)localIterator.next();
        if (zaa(localzabw.zajw.getRequiredFeatures()) == null) {}
      }
      for (;;)
      {
        localIterator.remove();
        break;
        try
        {
          localzabw.zajw.registerListener(this.zaio, new TaskCompletionSource());
        }
        catch (DeadObjectException localDeadObjectException)
        {
          for (;;) {}
        }
        catch (RemoteException localRemoteException) {}
        onConnectionSuspended(1);
        this.zain.disconnect();
        zabi();
        zabo();
        return;
      }
    }
    
    @WorkerThread
    private final void zabh()
    {
      zabl();
      this.zaiu = true;
      this.zaip.zaai();
      GoogleApiManager.zaa(GoogleApiManager.this).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(GoogleApiManager.this), 9, this.zafp), GoogleApiManager.zac(GoogleApiManager.this));
      GoogleApiManager.zaa(GoogleApiManager.this).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(GoogleApiManager.this), 11, this.zafp), GoogleApiManager.zad(GoogleApiManager.this));
      GoogleApiManager.zae(GoogleApiManager.this).flush();
    }
    
    @WorkerThread
    private final void zabi()
    {
      ArrayList localArrayList = (ArrayList)new ArrayList(this.zaim);
      int k = localArrayList.size();
      int i = 0;
      while (i < k)
      {
        Object localObject = localArrayList.get(i);
        int j = i + 1;
        localObject = (zab)localObject;
        if (!this.zain.isConnected()) {
          break;
        }
        i = j;
        if (zab((zab)localObject))
        {
          this.zaim.remove(localObject);
          i = j;
        }
      }
    }
    
    @WorkerThread
    private final void zabn()
    {
      if (this.zaiu)
      {
        GoogleApiManager.zaa(GoogleApiManager.this).removeMessages(11, this.zafp);
        GoogleApiManager.zaa(GoogleApiManager.this).removeMessages(9, this.zafp);
        this.zaiu = false;
      }
    }
    
    private final void zabo()
    {
      GoogleApiManager.zaa(GoogleApiManager.this).removeMessages(12, this.zafp);
      GoogleApiManager.zaa(GoogleApiManager.this).sendMessageDelayed(GoogleApiManager.zaa(GoogleApiManager.this).obtainMessage(12, this.zafp), GoogleApiManager.zai(GoogleApiManager.this));
    }
    
    @WorkerThread
    private final void zac(zab paramzab)
    {
      paramzab.zaa(this.zaip, requiresSignIn());
      try
      {
        paramzab.zaa(this);
        return;
      }
      catch (DeadObjectException paramzab)
      {
        for (;;) {}
      }
      onConnectionSuspended(1);
      this.zain.disconnect();
    }
    
    @WorkerThread
    private final boolean zac(boolean paramBoolean)
    {
      Preconditions.checkHandlerThread(GoogleApiManager.zaa(GoogleApiManager.this));
      if ((this.zain.isConnected()) && (this.zair.size() == 0))
      {
        if (this.zaip.zaag())
        {
          if (paramBoolean) {
            zabo();
          }
          return false;
        }
        this.zain.disconnect();
        return true;
      }
      return false;
    }
    
    @WorkerThread
    private final boolean zah(@NonNull ConnectionResult paramConnectionResult)
    {
      synchronized ()
      {
        if ((GoogleApiManager.zaf(GoogleApiManager.this) != null) && (GoogleApiManager.zag(GoogleApiManager.this).contains(this.zafp)))
        {
          GoogleApiManager.zaf(GoogleApiManager.this).zab(paramConnectionResult, this.zais);
          return true;
        }
        return false;
      }
    }
    
    @WorkerThread
    private final void zai(ConnectionResult paramConnectionResult)
    {
      Iterator localIterator = this.zaiq.iterator();
      while (localIterator.hasNext())
      {
        zak localzak = (zak)localIterator.next();
        String str = null;
        if (Objects.equal(paramConnectionResult, ConnectionResult.RESULT_SUCCESS)) {
          str = this.zain.getEndpointPackageName();
        }
        localzak.zaa(this.zafp, paramConnectionResult, str);
      }
      this.zaiq.clear();
    }
    
    @WorkerThread
    public final void connect()
    {
      Preconditions.checkHandlerThread(GoogleApiManager.zaa(GoogleApiManager.this));
      if (!this.zain.isConnected())
      {
        if (this.zain.isConnecting()) {
          return;
        }
        int i = GoogleApiManager.zae(GoogleApiManager.this).getClientAvailability(GoogleApiManager.zab(GoogleApiManager.this), this.zain);
        if (i != 0)
        {
          onConnectionFailed(new ConnectionResult(i, null));
          return;
        }
        GoogleApiManager.zac localzac = new GoogleApiManager.zac(GoogleApiManager.this, this.zain, this.zafp);
        if (this.zain.requiresSignIn()) {
          this.zait.zaa(localzac);
        }
        this.zain.connect(localzac);
      }
    }
    
    public final int getInstanceId()
    {
      return this.zais;
    }
    
    final boolean isConnected()
    {
      return this.zain.isConnected();
    }
    
    public final void onConnected(@Nullable Bundle paramBundle)
    {
      if (Looper.myLooper() == GoogleApiManager.zaa(GoogleApiManager.this).getLooper())
      {
        zabg();
        return;
      }
      GoogleApiManager.zaa(GoogleApiManager.this).post(new zabj(this));
    }
    
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult paramConnectionResult)
    {
      Preconditions.checkHandlerThread(GoogleApiManager.zaa(GoogleApiManager.this));
      if (this.zait != null) {
        this.zait.zabs();
      }
      zabl();
      GoogleApiManager.zae(GoogleApiManager.this).flush();
      zai(paramConnectionResult);
      if (paramConnectionResult.getErrorCode() == 4)
      {
        zac(GoogleApiManager.zabf());
        return;
      }
      if (this.zaim.isEmpty())
      {
        this.zaiw = paramConnectionResult;
        return;
      }
      if (zah(paramConnectionResult)) {
        return;
      }
      if (!GoogleApiManager.this.zac(paramConnectionResult, this.zais))
      {
        if (paramConnectionResult.getErrorCode() == 18) {
          this.zaiu = true;
        }
        if (this.zaiu)
        {
          GoogleApiManager.zaa(GoogleApiManager.this).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(GoogleApiManager.this), 9, this.zafp), GoogleApiManager.zac(GoogleApiManager.this));
          return;
        }
        paramConnectionResult = this.zafp.zan();
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramConnectionResult).length() + 38);
        localStringBuilder.append("API: ");
        localStringBuilder.append(paramConnectionResult);
        localStringBuilder.append(" is not available on this device.");
        zac(new Status(17, localStringBuilder.toString()));
      }
    }
    
    public final void onConnectionSuspended(int paramInt)
    {
      if (Looper.myLooper() == GoogleApiManager.zaa(GoogleApiManager.this).getLooper())
      {
        zabh();
        return;
      }
      GoogleApiManager.zaa(GoogleApiManager.this).post(new zabk(this));
    }
    
    public final boolean requiresSignIn()
    {
      return this.zain.requiresSignIn();
    }
    
    @WorkerThread
    public final void resume()
    {
      Preconditions.checkHandlerThread(GoogleApiManager.zaa(GoogleApiManager.this));
      if (this.zaiu) {
        connect();
      }
    }
    
    public final void zaa(ConnectionResult paramConnectionResult, Api<?> paramApi, boolean paramBoolean)
    {
      if (Looper.myLooper() == GoogleApiManager.zaa(GoogleApiManager.this).getLooper())
      {
        onConnectionFailed(paramConnectionResult);
        return;
      }
      GoogleApiManager.zaa(GoogleApiManager.this).post(new zabl(this, paramConnectionResult));
    }
    
    @WorkerThread
    public final void zaa(zab paramzab)
    {
      Preconditions.checkHandlerThread(GoogleApiManager.zaa(GoogleApiManager.this));
      if (this.zain.isConnected())
      {
        if (zab(paramzab))
        {
          zabo();
          return;
        }
        this.zaim.add(paramzab);
        return;
      }
      this.zaim.add(paramzab);
      if ((this.zaiw != null) && (this.zaiw.hasResolution()))
      {
        onConnectionFailed(this.zaiw);
        return;
      }
      connect();
    }
    
    @WorkerThread
    public final void zaa(zak paramzak)
    {
      Preconditions.checkHandlerThread(GoogleApiManager.zaa(GoogleApiManager.this));
      this.zaiq.add(paramzak);
    }
    
    public final Api.Client zaab()
    {
      return this.zain;
    }
    
    @WorkerThread
    public final void zaav()
    {
      Preconditions.checkHandlerThread(GoogleApiManager.zaa(GoogleApiManager.this));
      if (this.zaiu)
      {
        zabn();
        Status localStatus;
        if (GoogleApiManager.zah(GoogleApiManager.this).isGooglePlayServicesAvailable(GoogleApiManager.zab(GoogleApiManager.this)) == 18) {
          localStatus = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
        } else {
          localStatus = new Status(8, "API failed to connect while resuming due to an unknown error.");
        }
        zac(localStatus);
        this.zain.disconnect();
      }
    }
    
    @WorkerThread
    public final void zabj()
    {
      Preconditions.checkHandlerThread(GoogleApiManager.zaa(GoogleApiManager.this));
      zac(GoogleApiManager.zahw);
      this.zaip.zaah();
      ListenerHolder.ListenerKey[] arrayOfListenerKey = (ListenerHolder.ListenerKey[])this.zair.keySet().toArray(new ListenerHolder.ListenerKey[this.zair.size()]);
      int j = arrayOfListenerKey.length;
      int i = 0;
      while (i < j)
      {
        zaa(new zah(arrayOfListenerKey[i], new TaskCompletionSource()));
        i += 1;
      }
      zai(new ConnectionResult(4));
      if (this.zain.isConnected()) {
        this.zain.onUserSignOut(new zabm(this));
      }
    }
    
    public final Map<ListenerHolder.ListenerKey<?>, zabw> zabk()
    {
      return this.zair;
    }
    
    @WorkerThread
    public final void zabl()
    {
      Preconditions.checkHandlerThread(GoogleApiManager.zaa(GoogleApiManager.this));
      this.zaiw = null;
    }
    
    @WorkerThread
    public final ConnectionResult zabm()
    {
      Preconditions.checkHandlerThread(GoogleApiManager.zaa(GoogleApiManager.this));
      return this.zaiw;
    }
    
    @WorkerThread
    public final boolean zabp()
    {
      return zac(true);
    }
    
    final zad zabq()
    {
      if (this.zait == null) {
        return null;
      }
      return this.zait.zabq();
    }
    
    @WorkerThread
    public final void zac(Status paramStatus)
    {
      Preconditions.checkHandlerThread(GoogleApiManager.zaa(GoogleApiManager.this));
      Iterator localIterator = this.zaim.iterator();
      while (localIterator.hasNext()) {
        ((zab)localIterator.next()).zaa(paramStatus);
      }
      this.zaim.clear();
    }
    
    @WorkerThread
    public final void zag(@NonNull ConnectionResult paramConnectionResult)
    {
      Preconditions.checkHandlerThread(GoogleApiManager.zaa(GoogleApiManager.this));
      this.zain.disconnect();
      onConnectionFailed(paramConnectionResult);
    }
  }
  
  static final class zab
  {
    private final zai<?> zaja;
    private final Feature zajb;
    
    private zab(zai<?> paramzai, Feature paramFeature)
    {
      this.zaja = paramzai;
      this.zajb = paramFeature;
    }
    
    public final boolean equals(Object paramObject)
    {
      if ((paramObject != null) && ((paramObject instanceof zab)))
      {
        paramObject = (zab)paramObject;
        if ((Objects.equal(this.zaja, ((zab)paramObject).zaja)) && (Objects.equal(this.zajb, ((zab)paramObject).zajb))) {
          return true;
        }
      }
      return false;
    }
    
    public final int hashCode()
    {
      return Objects.hashCode(new Object[] { this.zaja, this.zajb });
    }
    
    public final String toString()
    {
      return Objects.toStringHelper(this).add("key", this.zaja).add("feature", this.zajb).toString();
    }
  }
  
  final class zac
    implements zach, BaseGmsClient.ConnectionProgressReportCallbacks
  {
    private final zai<?> zafp;
    private final Api.Client zain;
    private IAccountAccessor zajc = null;
    private Set<Scope> zajd = null;
    private boolean zaje = false;
    
    public zac(zai<?> paramzai)
    {
      this.zain = paramzai;
      zai localzai;
      this.zafp = localzai;
    }
    
    @WorkerThread
    private final void zabr()
    {
      if ((this.zaje) && (this.zajc != null)) {
        this.zain.getRemoteService(this.zajc, this.zajd);
      }
    }
    
    public final void onReportServiceBinding(@NonNull ConnectionResult paramConnectionResult)
    {
      GoogleApiManager.zaa(GoogleApiManager.this).post(new zabo(this, paramConnectionResult));
    }
    
    @WorkerThread
    public final void zaa(IAccountAccessor paramIAccountAccessor, Set<Scope> paramSet)
    {
      if ((paramIAccountAccessor != null) && (paramSet != null))
      {
        this.zajc = paramIAccountAccessor;
        this.zajd = paramSet;
        zabr();
        return;
      }
      Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
      zag(new ConnectionResult(4));
    }
    
    @WorkerThread
    public final void zag(ConnectionResult paramConnectionResult)
    {
      ((GoogleApiManager.zaa)GoogleApiManager.zaj(GoogleApiManager.this).get(this.zafp)).zag(paramConnectionResult);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/GoogleApiManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */