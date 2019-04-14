package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import com.google.android.gms.tasks.Task;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zax
  implements zabs
{
  private final Looper zabj;
  private final GoogleApiManager zabm;
  private final Lock zaen;
  private final ClientSettings zaes;
  private final Map<Api.AnyClientKey<?>, zaw<?>> zaet = new HashMap();
  private final Map<Api.AnyClientKey<?>, zaw<?>> zaeu = new HashMap();
  private final Map<Api<?>, Boolean> zaev;
  private final zaaw zaew;
  private final GoogleApiAvailabilityLight zaex;
  private final Condition zaey;
  private final boolean zaez;
  private final boolean zafa;
  private final Queue<BaseImplementation.ApiMethodImpl<?, ?>> zafb = new LinkedList();
  @GuardedBy("mLock")
  private boolean zafc;
  @GuardedBy("mLock")
  private Map<zai<?>, ConnectionResult> zafd;
  @GuardedBy("mLock")
  private Map<zai<?>, ConnectionResult> zafe;
  @GuardedBy("mLock")
  private zaaa zaff;
  @GuardedBy("mLock")
  private ConnectionResult zafg;
  
  public zax(Context paramContext, Lock paramLock, Looper paramLooper, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> paramMap, ClientSettings paramClientSettings, Map<Api<?>, Boolean> paramMap1, Api.AbstractClientBuilder<? extends zad, SignInOptions> paramAbstractClientBuilder, ArrayList<zaq> paramArrayList, zaaw paramzaaw, boolean paramBoolean)
  {
    this.zaen = paramLock;
    this.zabj = paramLooper;
    this.zaey = paramLock.newCondition();
    this.zaex = paramGoogleApiAvailabilityLight;
    this.zaew = paramzaaw;
    this.zaev = paramMap1;
    this.zaes = paramClientSettings;
    this.zaez = paramBoolean;
    paramLock = new HashMap();
    paramGoogleApiAvailabilityLight = paramMap1.keySet().iterator();
    while (paramGoogleApiAvailabilityLight.hasNext())
    {
      paramMap1 = (Api)paramGoogleApiAvailabilityLight.next();
      paramLock.put(paramMap1.getClientKey(), paramMap1);
    }
    paramGoogleApiAvailabilityLight = new HashMap();
    paramMap1 = (ArrayList)paramArrayList;
    int j = paramMap1.size();
    int i = 0;
    while (i < j)
    {
      paramArrayList = paramMap1.get(i);
      i += 1;
      paramArrayList = (zaq)paramArrayList;
      paramGoogleApiAvailabilityLight.put(paramArrayList.mApi, paramArrayList);
    }
    paramMap = paramMap.entrySet().iterator();
    paramBoolean = true;
    int k = 0;
    j = 1;
    int m;
    for (i = 0; paramMap.hasNext(); i = m)
    {
      paramMap1 = (Map.Entry)paramMap.next();
      paramzaaw = (Api)paramLock.get(paramMap1.getKey());
      paramArrayList = (Api.Client)paramMap1.getValue();
      if (paramArrayList.requiresGooglePlayServices())
      {
        if (!((Boolean)this.zaev.get(paramzaaw)).booleanValue()) {
          k = 1;
        } else {
          k = i;
        }
        i = 1;
      }
      else
      {
        j = k;
        k = i;
        m = 0;
        i = j;
        j = m;
      }
      paramzaaw = new zaw(paramContext, paramzaaw, paramLooper, paramArrayList, (zaq)paramGoogleApiAvailabilityLight.get(paramzaaw), paramClientSettings, paramAbstractClientBuilder);
      this.zaet.put((Api.AnyClientKey)paramMap1.getKey(), paramzaaw);
      if (paramArrayList.requiresSignIn()) {
        this.zaeu.put((Api.AnyClientKey)paramMap1.getKey(), paramzaaw);
      }
      m = k;
      k = i;
    }
    if ((k == 0) || (j != 0) || (i != 0)) {
      paramBoolean = false;
    }
    this.zafa = paramBoolean;
    this.zabm = GoogleApiManager.zabc();
  }
  
  @Nullable
  private final ConnectionResult zaa(@NonNull Api.AnyClientKey<?> paramAnyClientKey)
  {
    this.zaen.lock();
    try
    {
      paramAnyClientKey = (zaw)this.zaet.get(paramAnyClientKey);
      if ((this.zafd != null) && (paramAnyClientKey != null))
      {
        paramAnyClientKey = (ConnectionResult)this.zafd.get(paramAnyClientKey.zak());
        return paramAnyClientKey;
      }
      return null;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  private final boolean zaa(zaw<?> paramzaw, ConnectionResult paramConnectionResult)
  {
    return (!paramConnectionResult.isSuccess()) && (!paramConnectionResult.hasResolution()) && (((Boolean)this.zaev.get(paramzaw.getApi())).booleanValue()) && (paramzaw.zaab().requiresGooglePlayServices()) && (this.zaex.isUserResolvableError(paramConnectionResult.getErrorCode()));
  }
  
  private final boolean zaac()
  {
    this.zaen.lock();
    try
    {
      Iterator localIterator;
      if ((this.zafc) && (this.zaez)) {
        localIterator = this.zaeu.keySet().iterator();
      }
      while (localIterator.hasNext())
      {
        ConnectionResult localConnectionResult = zaa((Api.AnyClientKey)localIterator.next());
        if (localConnectionResult != null)
        {
          boolean bool = localConnectionResult.isSuccess();
          if (bool) {
            break;
          }
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  @GuardedBy("mLock")
  private final void zaad()
  {
    if (this.zaes == null)
    {
      this.zaew.zagz = Collections.emptySet();
      return;
    }
    HashSet localHashSet = new HashSet(this.zaes.getRequiredScopes());
    Map localMap = this.zaes.getOptionalApiSettings();
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Api localApi = (Api)localIterator.next();
      ConnectionResult localConnectionResult = getConnectionResult(localApi);
      if ((localConnectionResult != null) && (localConnectionResult.isSuccess())) {
        localHashSet.addAll(((ClientSettings.OptionalApiSettings)localMap.get(localApi)).mScopes);
      }
    }
    this.zaew.zagz = localHashSet;
  }
  
  @GuardedBy("mLock")
  private final void zaae()
  {
    while (!this.zafb.isEmpty()) {
      execute((BaseImplementation.ApiMethodImpl)this.zafb.remove());
    }
    this.zaew.zab(null);
  }
  
  @Nullable
  @GuardedBy("mLock")
  private final ConnectionResult zaaf()
  {
    Iterator localIterator = this.zaet.values().iterator();
    Object localObject1 = null;
    Object localObject2 = null;
    int j = 0;
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject3 = (zaw)localIterator.next();
      Api localApi = ((GoogleApi)localObject3).getApi();
      localObject3 = ((GoogleApi)localObject3).zak();
      localObject3 = (ConnectionResult)this.zafd.get(localObject3);
      if ((!((ConnectionResult)localObject3).isSuccess()) && ((!((Boolean)this.zaev.get(localApi)).booleanValue()) || (((ConnectionResult)localObject3).hasResolution()) || (this.zaex.isUserResolvableError(((ConnectionResult)localObject3).getErrorCode()))))
      {
        int k;
        if ((((ConnectionResult)localObject3).getErrorCode() == 4) && (this.zaez))
        {
          k = localApi.zah().getPriority();
          if ((localObject2 == null) || (i > k))
          {
            localObject2 = localObject3;
            i = k;
          }
        }
        else
        {
          k = localApi.zah().getPriority();
          if ((localObject1 == null) || (j > k))
          {
            localObject1 = localObject3;
            j = k;
          }
        }
      }
    }
    if ((localObject1 != null) && (localObject2 != null) && (j > i)) {
      return (ConnectionResult)localObject2;
    }
    return (ConnectionResult)localObject1;
  }
  
  private final <T extends BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>> boolean zab(@NonNull T paramT)
  {
    Api.AnyClientKey localAnyClientKey = paramT.getClientKey();
    ConnectionResult localConnectionResult = zaa(localAnyClientKey);
    if ((localConnectionResult != null) && (localConnectionResult.getErrorCode() == 4))
    {
      paramT.setFailedResult(new Status(4, null, this.zabm.zaa(((zaw)this.zaet.get(localAnyClientKey)).zak(), System.identityHashCode(this.zaew))));
      return true;
    }
    return false;
  }
  
  @GuardedBy("mLock")
  public final ConnectionResult blockingConnect()
  {
    connect();
    for (;;)
    {
      if (!isConnecting()) {
        break label40;
      }
      try
      {
        this.zaey.await();
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
    }
    Thread.currentThread().interrupt();
    return new ConnectionResult(15, null);
    label40:
    if (isConnected()) {
      return ConnectionResult.RESULT_SUCCESS;
    }
    if (this.zafg != null) {
      return this.zafg;
    }
    return new ConnectionResult(13, null);
  }
  
  @GuardedBy("mLock")
  public final ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit)
  {
    connect();
    for (paramLong = paramTimeUnit.toNanos(paramLong);; paramLong = this.zaey.awaitNanos(paramLong))
    {
      if ((!isConnecting()) || (paramLong <= 0L)) {}
      try
      {
        disconnect();
        return new ConnectionResult(14, null);
      }
      catch (InterruptedException paramTimeUnit)
      {
        for (;;) {}
      }
    }
    Thread.currentThread().interrupt();
    return new ConnectionResult(15, null);
    if (isConnected()) {
      return ConnectionResult.RESULT_SUCCESS;
    }
    if (this.zafg != null) {
      return this.zafg;
    }
    return new ConnectionResult(13, null);
  }
  
  /* Error */
  public final void connect()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 62	com/google/android/gms/common/api/internal/zax:zaen	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 184 1 0
    //   9: aload_0
    //   10: getfield 236	com/google/android/gms/common/api/internal/zax:zafc	Z
    //   13: istore_1
    //   14: iload_1
    //   15: ifeq +13 -> 28
    //   18: aload_0
    //   19: getfield 62	com/google/android/gms/common/api/internal/zax:zaen	Ljava/util/concurrent/locks/Lock;
    //   22: invokeinterface 197 1 0
    //   27: return
    //   28: aload_0
    //   29: iconst_1
    //   30: putfield 236	com/google/android/gms/common/api/internal/zax:zafc	Z
    //   33: aload_0
    //   34: aconst_null
    //   35: putfield 186	com/google/android/gms/common/api/internal/zax:zafd	Ljava/util/Map;
    //   38: aload_0
    //   39: aconst_null
    //   40: putfield 317	com/google/android/gms/common/api/internal/zax:zafe	Ljava/util/Map;
    //   43: aload_0
    //   44: aconst_null
    //   45: putfield 406	com/google/android/gms/common/api/internal/zax:zaff	Lcom/google/android/gms/common/api/internal/zaaa;
    //   48: aload_0
    //   49: aconst_null
    //   50: putfield 203	com/google/android/gms/common/api/internal/zax:zafg	Lcom/google/android/gms/common/ConnectionResult;
    //   53: aload_0
    //   54: getfield 174	com/google/android/gms/common/api/internal/zax:zabm	Lcom/google/android/gms/common/api/internal/GoogleApiManager;
    //   57: invokevirtual 409	com/google/android/gms/common/api/internal/GoogleApiManager:zao	()V
    //   60: aload_0
    //   61: getfield 174	com/google/android/gms/common/api/internal/zax:zabm	Lcom/google/android/gms/common/api/internal/GoogleApiManager;
    //   64: aload_0
    //   65: getfield 53	com/google/android/gms/common/api/internal/zax:zaet	Ljava/util/Map;
    //   68: invokeinterface 303 1 0
    //   73: invokevirtual 412	com/google/android/gms/common/api/internal/GoogleApiManager:zaa	(Ljava/lang/Iterable;)Lcom/google/android/gms/tasks/Task;
    //   76: new 414	com/google/android/gms/common/util/concurrent/HandlerExecutor
    //   79: dup
    //   80: aload_0
    //   81: getfield 64	com/google/android/gms/common/api/internal/zax:zabj	Landroid/os/Looper;
    //   84: invokespecial 417	com/google/android/gms/common/util/concurrent/HandlerExecutor:<init>	(Landroid/os/Looper;)V
    //   87: new 419	com/google/android/gms/common/api/internal/zaz
    //   90: dup
    //   91: aload_0
    //   92: aconst_null
    //   93: invokespecial 422	com/google/android/gms/common/api/internal/zaz:<init>	(Lcom/google/android/gms/common/api/internal/zax;Lcom/google/android/gms/common/api/internal/zay;)V
    //   96: invokevirtual 428	com/google/android/gms/tasks/Task:addOnCompleteListener	(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;
    //   99: pop
    //   100: goto -82 -> 18
    //   103: astore_2
    //   104: aload_0
    //   105: getfield 62	com/google/android/gms/common/api/internal/zax:zaen	Ljava/util/concurrent/locks/Lock;
    //   108: invokeinterface 197 1 0
    //   113: aload_2
    //   114: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	zax
    //   13	2	1	bool	boolean
    //   103	11	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	14	103	finally
    //   28	100	103	finally
  }
  
  public final void disconnect()
  {
    this.zaen.lock();
    try
    {
      this.zafc = false;
      this.zafd = null;
      this.zafe = null;
      if (this.zaff != null)
      {
        this.zaff.cancel();
        this.zaff = null;
      }
      this.zafg = null;
      while (!this.zafb.isEmpty())
      {
        BaseImplementation.ApiMethodImpl localApiMethodImpl = (BaseImplementation.ApiMethodImpl)this.zafb.remove();
        localApiMethodImpl.zaa(null);
        localApiMethodImpl.cancel();
      }
      this.zaey.signalAll();
      return;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T paramT)
  {
    if ((this.zaez) && (zab(paramT))) {
      return paramT;
    }
    if (!isConnected())
    {
      this.zafb.add(paramT);
      return paramT;
    }
    this.zaew.zahe.zab(paramT);
    return ((zaw)this.zaet.get(paramT.getClientKey())).doRead(paramT);
  }
  
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T paramT)
  {
    Api.AnyClientKey localAnyClientKey = paramT.getClientKey();
    if ((this.zaez) && (zab(paramT))) {
      return paramT;
    }
    this.zaew.zahe.zab(paramT);
    return ((zaw)this.zaet.get(localAnyClientKey)).doWrite(paramT);
  }
  
  @Nullable
  public final ConnectionResult getConnectionResult(@NonNull Api<?> paramApi)
  {
    return zaa(paramApi.getClientKey());
  }
  
  public final boolean isConnected()
  {
    this.zaen.lock();
    try
    {
      if (this.zafd != null)
      {
        ConnectionResult localConnectionResult = this.zafg;
        if (localConnectionResult == null)
        {
          bool = true;
          break label32;
        }
      }
      boolean bool = false;
      label32:
      return bool;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  public final boolean isConnecting()
  {
    this.zaen.lock();
    try
    {
      if (this.zafd == null)
      {
        bool = this.zafc;
        if (bool)
        {
          bool = true;
          break label32;
        }
      }
      boolean bool = false;
      label32:
      return bool;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  public final boolean maybeSignIn(SignInConnectionListener paramSignInConnectionListener)
  {
    this.zaen.lock();
    try
    {
      if ((this.zafc) && (!zaac()))
      {
        this.zabm.zao();
        this.zaff = new zaaa(this, paramSignInConnectionListener);
        this.zabm.zaa(this.zaeu.values()).addOnCompleteListener(new HandlerExecutor(this.zabj), this.zaff);
        return true;
      }
      return false;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  public final void maybeSignOut()
  {
    this.zaen.lock();
    try
    {
      this.zabm.maybeSignOut();
      if (this.zaff != null)
      {
        this.zaff.cancel();
        this.zaff = null;
      }
      if (this.zafe == null) {
        this.zafe = new ArrayMap(this.zaeu.size());
      }
      ConnectionResult localConnectionResult = new ConnectionResult(4);
      Iterator localIterator = this.zaeu.values().iterator();
      while (localIterator.hasNext())
      {
        zaw localzaw = (zaw)localIterator.next();
        this.zafe.put(localzaw.zak(), localConnectionResult);
      }
      if (this.zafd != null) {
        this.zafd.putAll(this.zafe);
      }
      return;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  public final void zaw() {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */