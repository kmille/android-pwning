package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

final class zas
  implements zabs
{
  private final Context mContext;
  private final Looper zabj;
  private final zaaw zaed;
  private final zabe zaee;
  private final zabe zaef;
  private final Map<Api.AnyClientKey<?>, zabe> zaeg;
  private final Set<SignInConnectionListener> zaeh = Collections.newSetFromMap(new WeakHashMap());
  private final Api.Client zaei;
  private Bundle zaej;
  private ConnectionResult zaek = null;
  private ConnectionResult zael = null;
  private boolean zaem = false;
  private final Lock zaen;
  @GuardedBy("mLock")
  private int zaeo = 0;
  
  private zas(Context paramContext, zaaw paramzaaw, Lock paramLock, Looper paramLooper, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> paramMap1, Map<Api.AnyClientKey<?>, Api.Client> paramMap2, ClientSettings paramClientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> paramAbstractClientBuilder, Api.Client paramClient, ArrayList<zaq> paramArrayList1, ArrayList<zaq> paramArrayList2, Map<Api<?>, Boolean> paramMap3, Map<Api<?>, Boolean> paramMap4)
  {
    this.mContext = paramContext;
    this.zaed = paramzaaw;
    this.zaen = paramLock;
    this.zabj = paramLooper;
    this.zaei = paramClient;
    this.zaee = new zabe(paramContext, this.zaed, paramLock, paramLooper, paramGoogleApiAvailabilityLight, paramMap2, null, paramMap4, null, paramArrayList2, new zau(this, null));
    this.zaef = new zabe(paramContext, this.zaed, paramLock, paramLooper, paramGoogleApiAvailabilityLight, paramMap1, paramClientSettings, paramMap3, paramAbstractClientBuilder, paramArrayList1, new zav(this, null));
    paramContext = new ArrayMap();
    paramzaaw = paramMap2.keySet().iterator();
    while (paramzaaw.hasNext()) {
      paramContext.put((Api.AnyClientKey)paramzaaw.next(), this.zaee);
    }
    paramzaaw = paramMap1.keySet().iterator();
    while (paramzaaw.hasNext()) {
      paramContext.put((Api.AnyClientKey)paramzaaw.next(), this.zaef);
    }
    this.zaeg = Collections.unmodifiableMap(paramContext);
  }
  
  public static zas zaa(Context paramContext, zaaw paramzaaw, Lock paramLock, Looper paramLooper, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> paramMap, ClientSettings paramClientSettings, Map<Api<?>, Boolean> paramMap1, Api.AbstractClientBuilder<? extends zad, SignInOptions> paramAbstractClientBuilder, ArrayList<zaq> paramArrayList)
  {
    ArrayMap localArrayMap1 = new ArrayMap();
    ArrayMap localArrayMap2 = new ArrayMap();
    Object localObject2 = paramMap.entrySet().iterator();
    paramMap = null;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      localObject1 = (Api.Client)((Map.Entry)localObject3).getValue();
      if (((Api.Client)localObject1).providesSignIn()) {
        paramMap = (Map<Api.AnyClientKey<?>, Api.Client>)localObject1;
      }
      if (((Api.Client)localObject1).requiresSignIn()) {
        localArrayMap1.put((Api.AnyClientKey)((Map.Entry)localObject3).getKey(), localObject1);
      } else {
        localArrayMap2.put((Api.AnyClientKey)((Map.Entry)localObject3).getKey(), localObject1);
      }
    }
    Preconditions.checkState(localArrayMap1.isEmpty() ^ true, "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
    Object localObject1 = new ArrayMap();
    localObject2 = new ArrayMap();
    Object localObject3 = paramMap1.keySet().iterator();
    Object localObject4;
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (Api)((Iterator)localObject3).next();
      Api.AnyClientKey localAnyClientKey = ((Api)localObject4).getClientKey();
      if (localArrayMap1.containsKey(localAnyClientKey)) {
        ((Map)localObject1).put(localObject4, (Boolean)paramMap1.get(localObject4));
      } else if (localArrayMap2.containsKey(localAnyClientKey)) {
        ((Map)localObject2).put(localObject4, (Boolean)paramMap1.get(localObject4));
      } else {
        throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
      }
    }
    paramMap1 = new ArrayList();
    localObject3 = new ArrayList();
    paramArrayList = (ArrayList)paramArrayList;
    int j = paramArrayList.size();
    int i = 0;
    while (i < j)
    {
      localObject4 = paramArrayList.get(i);
      i += 1;
      localObject4 = (zaq)localObject4;
      if (((Map)localObject1).containsKey(((zaq)localObject4).mApi)) {
        paramMap1.add(localObject4);
      } else if (((Map)localObject2).containsKey(((zaq)localObject4).mApi)) {
        ((ArrayList)localObject3).add(localObject4);
      } else {
        throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
      }
    }
    return new zas(paramContext, paramzaaw, paramLock, paramLooper, paramGoogleApiAvailabilityLight, localArrayMap1, localArrayMap2, paramClientSettings, paramAbstractClientBuilder, paramMap, paramMap1, (ArrayList)localObject3, (Map)localObject1, (Map)localObject2);
  }
  
  @GuardedBy("mLock")
  private final void zaa(int paramInt, boolean paramBoolean)
  {
    this.zaed.zab(paramInt, paramBoolean);
    this.zael = null;
    this.zaek = null;
  }
  
  private final void zaa(Bundle paramBundle)
  {
    if (this.zaej == null)
    {
      this.zaej = paramBundle;
      return;
    }
    if (paramBundle != null) {
      this.zaej.putAll(paramBundle);
    }
  }
  
  @GuardedBy("mLock")
  private final void zaa(ConnectionResult paramConnectionResult)
  {
    switch (this.zaeo)
    {
    default: 
      Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
      break;
    case 2: 
      this.zaed.zac(paramConnectionResult);
    case 1: 
      zay();
    }
    this.zaeo = 0;
  }
  
  private final boolean zaa(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> paramApiMethodImpl)
  {
    paramApiMethodImpl = paramApiMethodImpl.getClientKey();
    Preconditions.checkArgument(this.zaeg.containsKey(paramApiMethodImpl), "GoogleApiClient is not configured to use the API required for this call.");
    return ((zabe)this.zaeg.get(paramApiMethodImpl)).equals(this.zaef);
  }
  
  @Nullable
  private final PendingIntent zaaa()
  {
    if (this.zaei == null) {
      return null;
    }
    return PendingIntent.getActivity(this.mContext, System.identityHashCode(this.zaed), this.zaei.getSignInIntent(), 134217728);
  }
  
  private static boolean zab(ConnectionResult paramConnectionResult)
  {
    return (paramConnectionResult != null) && (paramConnectionResult.isSuccess());
  }
  
  @GuardedBy("mLock")
  private final void zax()
  {
    if (zab(this.zaek))
    {
      if ((!zab(this.zael)) && (!zaz()))
      {
        if (this.zael != null)
        {
          if (this.zaeo == 1)
          {
            zay();
            return;
          }
          zaa(this.zael);
          this.zaee.disconnect();
        }
      }
      else
      {
        switch (this.zaeo)
        {
        default: 
          Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
          break;
        case 2: 
          this.zaed.zab(this.zaej);
        case 1: 
          zay();
        }
        this.zaeo = 0;
      }
    }
    else
    {
      if ((this.zaek != null) && (zab(this.zael)))
      {
        this.zaef.disconnect();
        zaa(this.zaek);
        return;
      }
      if ((this.zaek != null) && (this.zael != null))
      {
        ConnectionResult localConnectionResult = this.zaek;
        if (this.zaef.zahr < this.zaee.zahr) {
          localConnectionResult = this.zael;
        }
        zaa(localConnectionResult);
      }
    }
  }
  
  @GuardedBy("mLock")
  private final void zay()
  {
    Iterator localIterator = this.zaeh.iterator();
    while (localIterator.hasNext()) {
      ((SignInConnectionListener)localIterator.next()).onComplete();
    }
    this.zaeh.clear();
  }
  
  @GuardedBy("mLock")
  private final boolean zaz()
  {
    return (this.zael != null) && (this.zael.getErrorCode() == 4);
  }
  
  @GuardedBy("mLock")
  public final ConnectionResult blockingConnect()
  {
    throw new UnsupportedOperationException();
  }
  
  @GuardedBy("mLock")
  public final ConnectionResult blockingConnect(long paramLong, @NonNull TimeUnit paramTimeUnit)
  {
    throw new UnsupportedOperationException();
  }
  
  @GuardedBy("mLock")
  public final void connect()
  {
    this.zaeo = 2;
    this.zaem = false;
    this.zael = null;
    this.zaek = null;
    this.zaee.connect();
    this.zaef.connect();
  }
  
  @GuardedBy("mLock")
  public final void disconnect()
  {
    this.zael = null;
    this.zaek = null;
    this.zaeo = 0;
    this.zaee.disconnect();
    this.zaef.disconnect();
    zay();
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("authClient").println(":");
    this.zaef.dump(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.append(paramString).append("anonClient").println(":");
    this.zaee.dump(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  @GuardedBy("mLock")
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T paramT)
  {
    if (zaa(paramT))
    {
      if (zaz())
      {
        paramT.setFailedResult(new Status(4, null, zaaa()));
        return paramT;
      }
      return this.zaef.enqueue(paramT);
    }
    return this.zaee.enqueue(paramT);
  }
  
  @GuardedBy("mLock")
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T paramT)
  {
    if (zaa(paramT))
    {
      if (zaz())
      {
        paramT.setFailedResult(new Status(4, null, zaaa()));
        return paramT;
      }
      return this.zaef.execute(paramT);
    }
    return this.zaee.execute(paramT);
  }
  
  @Nullable
  @GuardedBy("mLock")
  public final ConnectionResult getConnectionResult(@NonNull Api<?> paramApi)
  {
    if (((zabe)this.zaeg.get(paramApi.getClientKey())).equals(this.zaef))
    {
      if (zaz()) {
        return new ConnectionResult(4, zaaa());
      }
      return this.zaef.getConnectionResult(paramApi);
    }
    return this.zaee.getConnectionResult(paramApi);
  }
  
  public final boolean isConnected()
  {
    this.zaen.lock();
    try
    {
      boolean bool1 = this.zaee.isConnected();
      boolean bool2 = true;
      if (bool1)
      {
        bool1 = bool2;
        if (this.zaef.isConnected()) {
          break label61;
        }
        bool1 = bool2;
        if (zaz()) {
          break label61;
        }
        int i = this.zaeo;
        if (i == 1)
        {
          bool1 = bool2;
          break label61;
        }
      }
      bool1 = false;
      label61:
      return bool1;
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
      int i = this.zaeo;
      boolean bool;
      if (i == 2) {
        bool = true;
      } else {
        bool = false;
      }
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
      if (((isConnecting()) || (isConnected())) && (!this.zaef.isConnected()))
      {
        this.zaeh.add(paramSignInConnectionListener);
        if (this.zaeo == 0) {
          this.zaeo = 1;
        }
        this.zael = null;
        this.zaef.connect();
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
      boolean bool = isConnecting();
      this.zaef.disconnect();
      this.zael = new ConnectionResult(4);
      if (bool) {
        new zal(this.zabj).post(new zat(this));
      } else {
        zay();
      }
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
    this.zaee.zaw();
    this.zaef.zaw();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */