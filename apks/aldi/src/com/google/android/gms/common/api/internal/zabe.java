package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zabe
  implements zabs, zar
{
  private final Context mContext;
  private final Api.AbstractClientBuilder<? extends zad, SignInOptions> zacd;
  final zaaw zaed;
  private final Lock zaen;
  private final ClientSettings zaes;
  private final Map<Api<?>, Boolean> zaev;
  private final GoogleApiAvailabilityLight zaex;
  final Map<Api.AnyClientKey<?>, Api.Client> zagy;
  private final Condition zahm;
  private final zabg zahn;
  final Map<Api.AnyClientKey<?>, ConnectionResult> zaho = new HashMap();
  private volatile zabd zahp;
  private ConnectionResult zahq = null;
  int zahr;
  final zabt zahs;
  
  public zabe(Context paramContext, zaaw paramzaaw, Lock paramLock, Looper paramLooper, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> paramMap, ClientSettings paramClientSettings, Map<Api<?>, Boolean> paramMap1, Api.AbstractClientBuilder<? extends zad, SignInOptions> paramAbstractClientBuilder, ArrayList<zaq> paramArrayList, zabt paramzabt)
  {
    this.mContext = paramContext;
    this.zaen = paramLock;
    this.zaex = paramGoogleApiAvailabilityLight;
    this.zagy = paramMap;
    this.zaes = paramClientSettings;
    this.zaev = paramMap1;
    this.zacd = paramAbstractClientBuilder;
    this.zaed = paramzaaw;
    this.zahs = paramzabt;
    paramContext = (ArrayList)paramArrayList;
    int j = paramContext.size();
    int i = 0;
    while (i < j)
    {
      paramzaaw = paramContext.get(i);
      i += 1;
      ((zaq)paramzaaw).zaa(this);
    }
    this.zahn = new zabg(this, paramLooper);
    this.zahm = paramLock.newCondition();
    this.zahp = new zaav(this);
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
        this.zahm.await();
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
    if (this.zahq != null) {
      return this.zahq;
    }
    return new ConnectionResult(13, null);
  }
  
  @GuardedBy("mLock")
  public final ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit)
  {
    connect();
    for (paramLong = paramTimeUnit.toNanos(paramLong);; paramLong = this.zahm.awaitNanos(paramLong))
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
    if (this.zahq != null) {
      return this.zahq;
    }
    return new ConnectionResult(13, null);
  }
  
  @GuardedBy("mLock")
  public final void connect()
  {
    this.zahp.connect();
  }
  
  @GuardedBy("mLock")
  public final void disconnect()
  {
    if (this.zahp.disconnect()) {
      this.zaho.clear();
    }
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    String str = String.valueOf(paramString).concat("  ");
    paramPrintWriter.append(paramString).append("mState=").println(this.zahp);
    Iterator localIterator = this.zaev.keySet().iterator();
    while (localIterator.hasNext())
    {
      Api localApi = (Api)localIterator.next();
      paramPrintWriter.append(paramString).append(localApi.getName()).println(":");
      ((Api.Client)this.zagy.get(localApi.getClientKey())).dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  @GuardedBy("mLock")
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T paramT)
  {
    paramT.zau();
    return this.zahp.enqueue(paramT);
  }
  
  @GuardedBy("mLock")
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T paramT)
  {
    paramT.zau();
    return this.zahp.execute(paramT);
  }
  
  @Nullable
  @GuardedBy("mLock")
  public final ConnectionResult getConnectionResult(@NonNull Api<?> paramApi)
  {
    paramApi = paramApi.getClientKey();
    if (this.zagy.containsKey(paramApi))
    {
      if (((Api.Client)this.zagy.get(paramApi)).isConnected()) {
        return ConnectionResult.RESULT_SUCCESS;
      }
      if (this.zaho.containsKey(paramApi)) {
        return (ConnectionResult)this.zaho.get(paramApi);
      }
    }
    return null;
  }
  
  public final boolean isConnected()
  {
    return this.zahp instanceof zaah;
  }
  
  public final boolean isConnecting()
  {
    return this.zahp instanceof zaak;
  }
  
  public final boolean maybeSignIn(SignInConnectionListener paramSignInConnectionListener)
  {
    return false;
  }
  
  public final void maybeSignOut() {}
  
  public final void onConnected(@Nullable Bundle paramBundle)
  {
    this.zaen.lock();
    try
    {
      this.zahp.onConnected(paramBundle);
      return;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    this.zaen.lock();
    try
    {
      this.zahp.onConnectionSuspended(paramInt);
      return;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  public final void zaa(@NonNull ConnectionResult paramConnectionResult, @NonNull Api<?> paramApi, boolean paramBoolean)
  {
    this.zaen.lock();
    try
    {
      this.zahp.zaa(paramConnectionResult, paramApi, paramBoolean);
      return;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  final void zaa(zabf paramzabf)
  {
    paramzabf = this.zahn.obtainMessage(1, paramzabf);
    this.zahn.sendMessage(paramzabf);
  }
  
  final void zaaz()
  {
    this.zaen.lock();
    try
    {
      this.zahp = new zaak(this, this.zaes, this.zaev, this.zaex, this.zacd, this.zaen, this.mContext);
      this.zahp.begin();
      this.zahm.signalAll();
      return;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  final void zab(RuntimeException paramRuntimeException)
  {
    paramRuntimeException = this.zahn.obtainMessage(2, paramRuntimeException);
    this.zahn.sendMessage(paramRuntimeException);
  }
  
  final void zaba()
  {
    this.zaen.lock();
    try
    {
      this.zaed.zaaw();
      this.zahp = new zaah(this);
      this.zahp.begin();
      this.zahm.signalAll();
      return;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  final void zaf(ConnectionResult paramConnectionResult)
  {
    this.zaen.lock();
    try
    {
      this.zahq = paramConnectionResult;
      this.zahp = new zaav(this);
      this.zahp.begin();
      this.zahm.signalAll();
      return;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  @GuardedBy("mLock")
  public final void zaw()
  {
    if (isConnected()) {
      ((zaah)this.zahp).zaam();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zabe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */