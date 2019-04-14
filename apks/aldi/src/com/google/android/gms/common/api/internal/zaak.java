package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zaj;
import com.google.android.gms.signin.zad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zaak
  implements zabd
{
  private final Context mContext;
  private final Api.AbstractClientBuilder<? extends zad, SignInOptions> zacd;
  private final Lock zaen;
  private final ClientSettings zaes;
  private final Map<Api<?>, Boolean> zaev;
  private final GoogleApiAvailabilityLight zaex;
  private ConnectionResult zafg;
  private final zabe zafs;
  private int zafv;
  private int zafw = 0;
  private int zafx;
  private final Bundle zafy = new Bundle();
  private final Set<Api.AnyClientKey> zafz = new HashSet();
  private zad zaga;
  private boolean zagb;
  private boolean zagc;
  private boolean zagd;
  private IAccountAccessor zage;
  private boolean zagf;
  private boolean zagg;
  private ArrayList<Future<?>> zagh = new ArrayList();
  
  public zaak(zabe paramzabe, ClientSettings paramClientSettings, Map<Api<?>, Boolean> paramMap, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, Api.AbstractClientBuilder<? extends zad, SignInOptions> paramAbstractClientBuilder, Lock paramLock, Context paramContext)
  {
    this.zafs = paramzabe;
    this.zaes = paramClientSettings;
    this.zaev = paramMap;
    this.zaex = paramGoogleApiAvailabilityLight;
    this.zacd = paramAbstractClientBuilder;
    this.zaen = paramLock;
    this.mContext = paramContext;
  }
  
  @GuardedBy("mLock")
  private final void zaa(zaj paramzaj)
  {
    if (!zac(0)) {
      return;
    }
    Object localObject = paramzaj.getConnectionResult();
    if (((ConnectionResult)localObject).isSuccess())
    {
      localObject = paramzaj.zacw();
      paramzaj = ((ResolveAccountResponse)localObject).getConnectionResult();
      if (!paramzaj.isSuccess())
      {
        localObject = String.valueOf(paramzaj);
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject).length() + 48);
        localStringBuilder.append("Sign-in succeeded with resolve account failure: ");
        localStringBuilder.append((String)localObject);
        Log.wtf("GoogleApiClientConnecting", localStringBuilder.toString(), new Exception());
        zae(paramzaj);
        return;
      }
      this.zagd = true;
      this.zage = ((ResolveAccountResponse)localObject).getAccountAccessor();
      this.zagf = ((ResolveAccountResponse)localObject).getSaveDefaultAccount();
      this.zagg = ((ResolveAccountResponse)localObject).isFromCrossClientAuth();
      zaap();
      return;
    }
    if (zad((ConnectionResult)localObject))
    {
      zaar();
      zaap();
      return;
    }
    zae((ConnectionResult)localObject);
  }
  
  @GuardedBy("mLock")
  private final boolean zaao()
  {
    this.zafx -= 1;
    if (this.zafx > 0) {
      return false;
    }
    if (this.zafx < 0)
    {
      this.zafs.zaed.zaay();
      Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
    }
    for (ConnectionResult localConnectionResult = new ConnectionResult(8, null);; localConnectionResult = this.zafg)
    {
      zae(localConnectionResult);
      return false;
      if (this.zafg == null) {
        break;
      }
      this.zafs.zahr = this.zafv;
    }
    return true;
  }
  
  @GuardedBy("mLock")
  private final void zaap()
  {
    if (this.zafx != 0) {
      return;
    }
    if ((!this.zagc) || (this.zagd))
    {
      ArrayList localArrayList = new ArrayList();
      this.zafw = 1;
      this.zafx = this.zafs.zagy.size();
      Iterator localIterator = this.zafs.zagy.keySet().iterator();
      while (localIterator.hasNext())
      {
        Api.AnyClientKey localAnyClientKey = (Api.AnyClientKey)localIterator.next();
        if (this.zafs.zaho.containsKey(localAnyClientKey))
        {
          if (zaao()) {
            zaaq();
          }
        }
        else {
          localArrayList.add((Api.Client)this.zafs.zagy.get(localAnyClientKey));
        }
      }
      if (!localArrayList.isEmpty()) {
        this.zagh.add(zabh.zabb().submit(new zaaq(this, localArrayList)));
      }
    }
  }
  
  @GuardedBy("mLock")
  private final void zaaq()
  {
    this.zafs.zaba();
    zabh.zabb().execute(new zaal(this));
    if (this.zaga != null)
    {
      if (this.zagf) {
        this.zaga.zaa(this.zage, this.zagg);
      }
      zab(false);
    }
    Object localObject = this.zafs.zaho.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Api.AnyClientKey localAnyClientKey = (Api.AnyClientKey)((Iterator)localObject).next();
      ((Api.Client)this.zafs.zagy.get(localAnyClientKey)).disconnect();
    }
    if (this.zafy.isEmpty()) {
      localObject = null;
    } else {
      localObject = this.zafy;
    }
    this.zafs.zahs.zab((Bundle)localObject);
  }
  
  @GuardedBy("mLock")
  private final void zaar()
  {
    this.zagc = false;
    this.zafs.zaed.zagz = Collections.emptySet();
    Iterator localIterator = this.zafz.iterator();
    while (localIterator.hasNext())
    {
      Api.AnyClientKey localAnyClientKey = (Api.AnyClientKey)localIterator.next();
      if (!this.zafs.zaho.containsKey(localAnyClientKey)) {
        this.zafs.zaho.put(localAnyClientKey, new ConnectionResult(17, null));
      }
    }
  }
  
  private final void zaas()
  {
    ArrayList localArrayList = (ArrayList)this.zagh;
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      Object localObject = localArrayList.get(i);
      i += 1;
      ((Future)localObject).cancel(true);
    }
    this.zagh.clear();
  }
  
  private final Set<Scope> zaat()
  {
    if (this.zaes == null) {
      return Collections.emptySet();
    }
    HashSet localHashSet = new HashSet(this.zaes.getRequiredScopes());
    Map localMap = this.zaes.getOptionalApiSettings();
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Api localApi = (Api)localIterator.next();
      if (!this.zafs.zaho.containsKey(localApi.getClientKey())) {
        localHashSet.addAll(((ClientSettings.OptionalApiSettings)localMap.get(localApi)).mScopes);
      }
    }
    return localHashSet;
  }
  
  @GuardedBy("mLock")
  private final void zab(ConnectionResult paramConnectionResult, Api<?> paramApi, boolean paramBoolean)
  {
    int m = paramApi.zah().getPriority();
    int k = 0;
    int j;
    if (paramBoolean)
    {
      if (paramConnectionResult.hasResolution()) {}
      while (this.zaex.getErrorResolutionIntent(paramConnectionResult.getErrorCode()) != null)
      {
        i = 1;
        break;
      }
      int i = 0;
      j = k;
      if (i == 0) {}
    }
    else if (this.zafg != null)
    {
      j = k;
      if (m >= this.zafv) {}
    }
    else
    {
      j = 1;
    }
    if (j != 0)
    {
      this.zafg = paramConnectionResult;
      this.zafv = m;
    }
    this.zafs.zaho.put(paramApi.getClientKey(), paramConnectionResult);
  }
  
  private final void zab(boolean paramBoolean)
  {
    if (this.zaga != null)
    {
      if ((this.zaga.isConnected()) && (paramBoolean)) {
        this.zaga.zacv();
      }
      this.zaga.disconnect();
      this.zage = null;
    }
  }
  
  @GuardedBy("mLock")
  private final boolean zac(int paramInt)
  {
    if (this.zafw != paramInt)
    {
      this.zafs.zaed.zaay();
      Object localObject1 = String.valueOf(this);
      Object localObject2 = new StringBuilder(String.valueOf(localObject1).length() + 23);
      ((StringBuilder)localObject2).append("Unexpected callback in ");
      ((StringBuilder)localObject2).append((String)localObject1);
      int i = this.zafx;
      localObject1 = new StringBuilder(33);
      ((StringBuilder)localObject1).append("mRemainingConnections=");
      ((StringBuilder)localObject1).append(i);
      localObject1 = zad(this.zafw);
      localObject2 = zad(paramInt);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject1).length() + 70 + String.valueOf(localObject2).length());
      localStringBuilder.append("GoogleApiClient connecting is in step ");
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(" but received callback for step ");
      localStringBuilder.append((String)localObject2);
      Log.wtf("GoogleApiClientConnecting", localStringBuilder.toString(), new Exception());
      zae(new ConnectionResult(8, null));
      return false;
    }
    return true;
  }
  
  private static String zad(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    case 1: 
      return "STEP_GETTING_REMOTE_SERVICE";
    }
    return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
  }
  
  @GuardedBy("mLock")
  private final boolean zad(ConnectionResult paramConnectionResult)
  {
    return (this.zagb) && (!paramConnectionResult.hasResolution());
  }
  
  @GuardedBy("mLock")
  private final void zae(ConnectionResult paramConnectionResult)
  {
    zaas();
    zab(paramConnectionResult.hasResolution() ^ true);
    this.zafs.zaf(paramConnectionResult);
    this.zafs.zahs.zac(paramConnectionResult);
  }
  
  public final void begin()
  {
    this.zafs.zaho.clear();
    this.zagc = false;
    this.zafg = null;
    this.zafw = 0;
    this.zagb = true;
    this.zagd = false;
    this.zagf = false;
    HashMap localHashMap = new HashMap();
    Object localObject = this.zaev.keySet().iterator();
    int i = 0;
    while (((Iterator)localObject).hasNext())
    {
      Api localApi = (Api)((Iterator)localObject).next();
      Api.Client localClient = (Api.Client)this.zafs.zagy.get(localApi.getClientKey());
      int j;
      if (localApi.zah().getPriority() == 1) {
        j = 1;
      } else {
        j = 0;
      }
      i |= j;
      boolean bool = ((Boolean)this.zaev.get(localApi)).booleanValue();
      if (localClient.requiresSignIn())
      {
        this.zagc = true;
        if (bool) {
          this.zafz.add(localApi.getClientKey());
        } else {
          this.zagb = false;
        }
      }
      localHashMap.put(localClient, new zaam(this, localApi, bool));
    }
    if (i != 0) {
      this.zagc = false;
    }
    if (this.zagc)
    {
      this.zaes.setClientSessionId(Integer.valueOf(System.identityHashCode(this.zafs.zaed)));
      localObject = new zaat(this, null);
      this.zaga = ((zad)this.zacd.buildClient(this.mContext, this.zafs.zaed.getLooper(), this.zaes, this.zaes.getSignInOptions(), (GoogleApiClient.ConnectionCallbacks)localObject, (GoogleApiClient.OnConnectionFailedListener)localObject));
    }
    this.zafx = this.zafs.zagy.size();
    this.zagh.add(zabh.zabb().submit(new zaan(this, localHashMap)));
  }
  
  public final void connect() {}
  
  public final boolean disconnect()
  {
    zaas();
    zab(true);
    this.zafs.zaf(null);
    return true;
  }
  
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T paramT)
  {
    this.zafs.zaed.zafb.add(paramT);
    return paramT;
  }
  
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T paramT)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
  
  @GuardedBy("mLock")
  public final void onConnected(Bundle paramBundle)
  {
    if (!zac(1)) {
      return;
    }
    if (paramBundle != null) {
      this.zafy.putAll(paramBundle);
    }
    if (zaao()) {
      zaaq();
    }
  }
  
  @GuardedBy("mLock")
  public final void onConnectionSuspended(int paramInt)
  {
    zae(new ConnectionResult(8, null));
  }
  
  @GuardedBy("mLock")
  public final void zaa(ConnectionResult paramConnectionResult, Api<?> paramApi, boolean paramBoolean)
  {
    if (!zac(1)) {
      return;
    }
    zab(paramConnectionResult, paramApi, paramBoolean);
    if (zaao()) {
      zaaq();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */