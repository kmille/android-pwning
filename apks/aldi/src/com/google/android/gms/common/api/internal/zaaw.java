package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.internal.service.zac;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zaaw
  extends GoogleApiClient
  implements zabt
{
  private final Context mContext;
  private final Looper zabj;
  private final int zaca;
  private final GoogleApiAvailability zacc;
  private final Api.AbstractClientBuilder<? extends zad, SignInOptions> zacd;
  private boolean zacg;
  private final Lock zaen;
  private final ClientSettings zaes;
  private final Map<Api<?>, Boolean> zaev;
  @VisibleForTesting
  final Queue<BaseImplementation.ApiMethodImpl<?, ?>> zafb = new LinkedList();
  private final GmsClientEventManager zagr;
  private zabs zags = null;
  private volatile boolean zagt;
  private long zagu;
  private long zagv;
  private final zabb zagw;
  @VisibleForTesting
  private zabq zagx;
  final Map<Api.AnyClientKey<?>, Api.Client> zagy;
  Set<Scope> zagz;
  private final ListenerHolders zaha;
  private final ArrayList<zaq> zahb;
  private Integer zahc;
  Set<zacm> zahd;
  final zacp zahe;
  private final GmsClientEventManager.GmsClientEventState zahf;
  
  public zaaw(Context paramContext, Lock paramLock, Looper paramLooper, ClientSettings paramClientSettings, GoogleApiAvailability paramGoogleApiAvailability, Api.AbstractClientBuilder<? extends zad, SignInOptions> paramAbstractClientBuilder, Map<Api<?>, Boolean> paramMap, List<GoogleApiClient.ConnectionCallbacks> paramList, List<GoogleApiClient.OnConnectionFailedListener> paramList1, Map<Api.AnyClientKey<?>, Api.Client> paramMap1, int paramInt1, int paramInt2, ArrayList<zaq> paramArrayList, boolean paramBoolean)
  {
    long l;
    if (ClientLibraryUtils.isPackageSide()) {
      l = 10000L;
    } else {
      l = 120000L;
    }
    this.zagu = l;
    this.zagv = 5000L;
    this.zagz = new HashSet();
    this.zaha = new ListenerHolders();
    this.zahc = null;
    this.zahd = null;
    this.zahf = new zaax(this);
    this.mContext = paramContext;
    this.zaen = paramLock;
    this.zacg = false;
    this.zagr = new GmsClientEventManager(paramLooper, this.zahf);
    this.zabj = paramLooper;
    this.zagw = new zabb(this, paramLooper);
    this.zacc = paramGoogleApiAvailability;
    this.zaca = paramInt1;
    if (this.zaca >= 0) {
      this.zahc = Integer.valueOf(paramInt2);
    }
    this.zaev = paramMap;
    this.zagy = paramMap1;
    this.zahb = paramArrayList;
    this.zahe = new zacp(this.zagy);
    paramContext = paramList.iterator();
    while (paramContext.hasNext())
    {
      paramLock = (GoogleApiClient.ConnectionCallbacks)paramContext.next();
      this.zagr.registerConnectionCallbacks(paramLock);
    }
    paramContext = paramList1.iterator();
    while (paramContext.hasNext())
    {
      paramLock = (GoogleApiClient.OnConnectionFailedListener)paramContext.next();
      this.zagr.registerConnectionFailedListener(paramLock);
    }
    this.zaes = paramClientSettings;
    this.zacd = paramAbstractClientBuilder;
  }
  
  private final void resume()
  {
    this.zaen.lock();
    try
    {
      if (this.zagt) {
        zaau();
      }
      return;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  public static int zaa(Iterable<Api.Client> paramIterable, boolean paramBoolean)
  {
    paramIterable = paramIterable.iterator();
    int j = 0;
    int i = 0;
    while (paramIterable.hasNext())
    {
      Api.Client localClient = (Api.Client)paramIterable.next();
      int k = j;
      if (localClient.requiresSignIn()) {
        k = 1;
      }
      j = k;
      if (localClient.providesSignIn())
      {
        i = 1;
        j = k;
      }
    }
    if (j != 0)
    {
      if ((i != 0) && (paramBoolean)) {
        return 2;
      }
      return 1;
    }
    return 3;
  }
  
  private final void zaa(GoogleApiClient paramGoogleApiClient, StatusPendingResult paramStatusPendingResult, boolean paramBoolean)
  {
    Common.zaph.zaa(paramGoogleApiClient).setResultCallback(new zaba(this, paramStatusPendingResult, paramBoolean, paramGoogleApiClient));
  }
  
  @GuardedBy("mLock")
  private final void zaau()
  {
    this.zagr.enableCallbacks();
    this.zags.connect();
  }
  
  private final void zaav()
  {
    this.zaen.lock();
    try
    {
      if (zaaw()) {
        zaau();
      }
      return;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  private final void zae(int paramInt)
  {
    if (this.zahc == null) {
      this.zahc = Integer.valueOf(paramInt);
    } else {
      if (this.zahc.intValue() != paramInt) {
        break label397;
      }
    }
    if (this.zags != null) {
      return;
    }
    Object localObject1 = this.zagy.values().iterator();
    int i = 0;
    paramInt = 0;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Api.Client)((Iterator)localObject1).next();
      int j = i;
      if (((Api.Client)localObject2).requiresSignIn()) {
        j = 1;
      }
      i = j;
      if (((Api.Client)localObject2).providesSignIn())
      {
        paramInt = 1;
        i = j;
      }
    }
    switch (this.zahc.intValue())
    {
    default: 
      break;
    case 2: 
      if (i != 0)
      {
        if (this.zacg)
        {
          this.zags = new zax(this.mContext, this.zaen, this.zabj, this.zacc, this.zagy, this.zaes, this.zaev, this.zacd, this.zahb, this, true);
          return;
        }
        this.zags = zas.zaa(this.mContext, this, this.zaen, this.zabj, this.zacc, this.zagy, this.zaes, this.zaev, this.zacd, this.zahb);
        return;
      }
      break;
    case 1: 
      if (i != 0)
      {
        if (paramInt != 0) {
          throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
        }
      }
      else {
        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
      }
      break;
    }
    if ((this.zacg) && (paramInt == 0))
    {
      this.zags = new zax(this.mContext, this.zaen, this.zabj, this.zacc, this.zagy, this.zaes, this.zaev, this.zacd, this.zahb, this, false);
      return;
    }
    this.zags = new zabe(this.mContext, this, this.zaen, this.zabj, this.zacc, this.zagy, this.zaes, this.zaev, this.zacd, this.zahb, this);
    return;
    label397:
    localObject1 = zaf(paramInt);
    Object localObject2 = zaf(this.zahc.intValue());
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject1).length() + 51 + String.valueOf(localObject2).length());
    localStringBuilder.append("Cannot use sign-in mode: ");
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append(". Mode was already set to ");
    localStringBuilder.append((String)localObject2);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private static String zaf(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    case 3: 
      return "SIGN_IN_MODE_NONE";
    case 2: 
      return "SIGN_IN_MODE_OPTIONAL";
    }
    return "SIGN_IN_MODE_REQUIRED";
  }
  
  public final ConnectionResult blockingConnect()
  {
    Object localObject1 = Looper.myLooper();
    Looper localLooper = Looper.getMainLooper();
    boolean bool2 = true;
    boolean bool1;
    if (localObject1 != localLooper) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Preconditions.checkState(bool1, "blockingConnect must not be called on the UI thread");
    this.zaen.lock();
    for (;;)
    {
      try
      {
        if (this.zaca >= 0)
        {
          if (this.zahc == null) {
            break label172;
          }
          bool1 = bool2;
          Preconditions.checkState(bool1, "Sign-in mode should have been set explicitly by auto-manage.");
        }
        else if (this.zahc == null)
        {
          this.zahc = Integer.valueOf(zaa(this.zagy.values(), false));
        }
        else
        {
          if (this.zahc.intValue() == 2) {
            continue;
          }
        }
        zae(this.zahc.intValue());
        this.zagr.enableCallbacks();
        localObject1 = this.zags.blockingConnect();
        return (ConnectionResult)localObject1;
        throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
      }
      finally
      {
        this.zaen.unlock();
      }
      label172:
      bool1 = false;
    }
  }
  
  public final ConnectionResult blockingConnect(long paramLong, @NonNull TimeUnit paramTimeUnit)
  {
    boolean bool;
    if (Looper.myLooper() != Looper.getMainLooper()) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool, "blockingConnect must not be called on the UI thread");
    Preconditions.checkNotNull(paramTimeUnit, "TimeUnit must not be null");
    this.zaen.lock();
    try
    {
      if (this.zahc == null) {
        this.zahc = Integer.valueOf(zaa(this.zagy.values(), false));
      } else {
        if (this.zahc.intValue() == 2) {
          break label125;
        }
      }
      zae(this.zahc.intValue());
      this.zagr.enableCallbacks();
      paramTimeUnit = this.zags.blockingConnect(paramLong, paramTimeUnit);
      return paramTimeUnit;
      label125:
      throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  public final PendingResult<Status> clearDefaultAccountAndReconnect()
  {
    Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
    boolean bool;
    if (this.zahc.intValue() != 2) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
    StatusPendingResult localStatusPendingResult = new StatusPendingResult(this);
    if (this.zagy.containsKey(Common.CLIENT_KEY))
    {
      zaa(this, localStatusPendingResult, false);
      return localStatusPendingResult;
    }
    AtomicReference localAtomicReference = new AtomicReference();
    Object localObject = new zaay(this, localAtomicReference, localStatusPendingResult);
    zaaz localzaaz = new zaaz(this, localStatusPendingResult);
    localObject = new GoogleApiClient.Builder(this.mContext).addApi(Common.API).addConnectionCallbacks((GoogleApiClient.ConnectionCallbacks)localObject).addOnConnectionFailedListener(localzaaz).setHandler(this.zagw).build();
    localAtomicReference.set(localObject);
    ((GoogleApiClient)localObject).connect();
    return localStatusPendingResult;
  }
  
  public final void connect()
  {
    this.zaen.lock();
    try
    {
      int i = this.zaca;
      boolean bool = false;
      if (i >= 0)
      {
        if (this.zahc != null) {
          bool = true;
        }
        Preconditions.checkState(bool, "Sign-in mode should have been set explicitly by auto-manage.");
      }
      else if (this.zahc == null)
      {
        this.zahc = Integer.valueOf(zaa(this.zagy.values(), false));
      }
      else
      {
        if (this.zahc.intValue() == 2) {
          break label101;
        }
      }
      connect(this.zahc.intValue());
      return;
      label101:
      throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  public final void connect(int paramInt)
  {
    this.zaen.lock();
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (paramInt != 3)
    {
      bool1 = bool2;
      if (paramInt != 1) {
        if (paramInt == 2) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
    }
    try
    {
      StringBuilder localStringBuilder = new StringBuilder(33);
      localStringBuilder.append("Illegal sign-in mode: ");
      localStringBuilder.append(paramInt);
      Preconditions.checkArgument(bool1, localStringBuilder.toString());
      zae(paramInt);
      zaau();
      return;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  /* Error */
  public final void disconnect()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 113	com/google/android/gms/common/api/internal/zaaw:zaen	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 194 1 0
    //   9: aload_0
    //   10: getfield 154	com/google/android/gms/common/api/internal/zaaw:zahe	Lcom/google/android/gms/common/api/internal/zacp;
    //   13: invokevirtual 466	com/google/android/gms/common/api/internal/zacp:release	()V
    //   16: aload_0
    //   17: getfield 67	com/google/android/gms/common/api/internal/zaaw:zags	Lcom/google/android/gms/common/api/internal/zabs;
    //   20: ifnull +12 -> 32
    //   23: aload_0
    //   24: getfield 67	com/google/android/gms/common/api/internal/zaaw:zags	Lcom/google/android/gms/common/api/internal/zabs;
    //   27: invokeinterface 468 1 0
    //   32: aload_0
    //   33: getfield 98	com/google/android/gms/common/api/internal/zaaw:zaha	Lcom/google/android/gms/common/api/internal/ListenerHolders;
    //   36: invokevirtual 469	com/google/android/gms/common/api/internal/ListenerHolders:release	()V
    //   39: aload_0
    //   40: getfield 72	com/google/android/gms/common/api/internal/zaaw:zafb	Ljava/util/Queue;
    //   43: invokeinterface 472 1 0
    //   48: astore_1
    //   49: aload_1
    //   50: invokeinterface 165 1 0
    //   55: ifeq +25 -> 80
    //   58: aload_1
    //   59: invokeinterface 169 1 0
    //   64: checkcast 474	com/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl
    //   67: astore_2
    //   68: aload_2
    //   69: aconst_null
    //   70: invokevirtual 479	com/google/android/gms/common/api/internal/BasePendingResult:zaa	(Lcom/google/android/gms/common/api/internal/zacs;)V
    //   73: aload_2
    //   74: invokevirtual 482	com/google/android/gms/common/api/PendingResult:cancel	()V
    //   77: goto -28 -> 49
    //   80: aload_0
    //   81: getfield 72	com/google/android/gms/common/api/internal/zaaw:zafb	Ljava/util/Queue;
    //   84: invokeinterface 485 1 0
    //   89: aload_0
    //   90: getfield 67	com/google/android/gms/common/api/internal/zaaw:zags	Lcom/google/android/gms/common/api/internal/zabs;
    //   93: astore_1
    //   94: aload_1
    //   95: ifnonnull +13 -> 108
    //   98: aload_0
    //   99: getfield 113	com/google/android/gms/common/api/internal/zaaw:zaen	Ljava/util/concurrent/locks/Lock;
    //   102: invokeinterface 202 1 0
    //   107: return
    //   108: aload_0
    //   109: invokevirtual 260	com/google/android/gms/common/api/internal/zaaw:zaaw	()Z
    //   112: pop
    //   113: aload_0
    //   114: getfield 122	com/google/android/gms/common/api/internal/zaaw:zagr	Lcom/google/android/gms/common/internal/GmsClientEventManager;
    //   117: invokevirtual 488	com/google/android/gms/common/internal/GmsClientEventManager:disableCallbacks	()V
    //   120: goto -22 -> 98
    //   123: astore_1
    //   124: aload_0
    //   125: getfield 113	com/google/android/gms/common/api/internal/zaaw:zaen	Ljava/util/concurrent/locks/Lock;
    //   128: invokeinterface 202 1 0
    //   133: aload_1
    //   134: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	this	zaaw
    //   48	47	1	localObject1	Object
    //   123	11	1	localObject2	Object
    //   67	7	2	localApiMethodImpl	BaseImplementation.ApiMethodImpl
    // Exception table:
    //   from	to	target	type
    //   9	32	123	finally
    //   32	49	123	finally
    //   49	77	123	finally
    //   80	94	123	finally
    //   108	120	123	finally
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("mContext=").println(this.mContext);
    paramPrintWriter.append(paramString).append("mResuming=").print(this.zagt);
    paramPrintWriter.append(" mWorkQueue.size()=").print(this.zafb.size());
    zacp localzacp = this.zahe;
    paramPrintWriter.append(" mUnconsumedApiCalls.size()=").println(localzacp.zaky.size());
    if (this.zags != null) {
      this.zags.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  /* Error */
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T paramT)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 531	com/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl:getClientKey	()Lcom/google/android/gms/common/api/Api$AnyClientKey;
    //   4: ifnull +8 -> 12
    //   7: iconst_1
    //   8: istore_2
    //   9: goto +5 -> 14
    //   12: iconst_0
    //   13: istore_2
    //   14: iload_2
    //   15: ldc_w 533
    //   18: invokestatic 462	com/google/android/gms/common/internal/Preconditions:checkArgument	(ZLjava/lang/Object;)V
    //   21: aload_0
    //   22: getfield 145	com/google/android/gms/common/api/internal/zaaw:zagy	Ljava/util/Map;
    //   25: aload_1
    //   26: invokevirtual 531	com/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl:getClientKey	()Lcom/google/android/gms/common/api/Api$AnyClientKey;
    //   29: invokeinterface 402 2 0
    //   34: istore_2
    //   35: aload_1
    //   36: invokevirtual 537	com/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl:getApi	()Lcom/google/android/gms/common/api/Api;
    //   39: ifnull +14 -> 53
    //   42: aload_1
    //   43: invokevirtual 537	com/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl:getApi	()Lcom/google/android/gms/common/api/Api;
    //   46: invokevirtual 542	com/google/android/gms/common/api/Api:getName	()Ljava/lang/String;
    //   49: astore_3
    //   50: goto +7 -> 57
    //   53: ldc_w 544
    //   56: astore_3
    //   57: new 310	java/lang/StringBuilder
    //   60: dup
    //   61: aload_3
    //   62: invokestatic 315	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   65: invokevirtual 318	java/lang/String:length	()I
    //   68: bipush 65
    //   70: iadd
    //   71: invokespecial 320	java/lang/StringBuilder:<init>	(I)V
    //   74: astore 4
    //   76: aload 4
    //   78: ldc_w 546
    //   81: invokevirtual 326	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: pop
    //   85: aload 4
    //   87: aload_3
    //   88: invokevirtual 326	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: pop
    //   92: aload 4
    //   94: ldc_w 548
    //   97: invokevirtual 326	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: iload_2
    //   102: aload 4
    //   104: invokevirtual 332	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: invokestatic 462	com/google/android/gms/common/internal/Preconditions:checkArgument	(ZLjava/lang/Object;)V
    //   110: aload_0
    //   111: getfield 113	com/google/android/gms/common/api/internal/zaaw:zaen	Ljava/util/concurrent/locks/Lock;
    //   114: invokeinterface 194 1 0
    //   119: aload_0
    //   120: getfield 67	com/google/android/gms/common/api/internal/zaaw:zags	Lcom/google/android/gms/common/api/internal/zabs;
    //   123: ifnonnull +25 -> 148
    //   126: aload_0
    //   127: getfield 72	com/google/android/gms/common/api/internal/zaaw:zafb	Ljava/util/Queue;
    //   130: aload_1
    //   131: invokeinterface 551 2 0
    //   136: pop
    //   137: aload_0
    //   138: getfield 113	com/google/android/gms/common/api/internal/zaaw:zaen	Ljava/util/concurrent/locks/Lock;
    //   141: invokeinterface 202 1 0
    //   146: aload_1
    //   147: areturn
    //   148: aload_0
    //   149: getfield 67	com/google/android/gms/common/api/internal/zaaw:zags	Lcom/google/android/gms/common/api/internal/zabs;
    //   152: aload_1
    //   153: invokeinterface 553 2 0
    //   158: astore_1
    //   159: goto -22 -> 137
    //   162: astore_1
    //   163: aload_0
    //   164: getfield 113	com/google/android/gms/common/api/internal/zaaw:zaen	Ljava/util/concurrent/locks/Lock;
    //   167: invokeinterface 202 1 0
    //   172: aload_1
    //   173: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	174	0	this	zaaw
    //   0	174	1	paramT	T
    //   8	94	2	bool	boolean
    //   49	39	3	str	String
    //   74	29	4	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   119	137	162	finally
    //   148	159	162	finally
  }
  
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T paramT)
  {
    if (paramT.getClientKey() != null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "This task can not be executed (it's probably a Batch or malformed)");
    boolean bool = this.zagy.containsKey(paramT.getClientKey());
    Object localObject;
    if (paramT.getApi() != null) {
      localObject = paramT.getApi().getName();
    } else {
      localObject = "the API";
    }
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject).length() + 65);
    localStringBuilder.append("GoogleApiClient is not configured to use ");
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(" required for this call.");
    Preconditions.checkArgument(bool, localStringBuilder.toString());
    this.zaen.lock();
    try
    {
      if (this.zags != null)
      {
        if (this.zagt)
        {
          this.zafb.add(paramT);
          for (;;)
          {
            localObject = paramT;
            if (this.zafb.isEmpty()) {
              break;
            }
            localObject = (BaseImplementation.ApiMethodImpl)this.zafb.remove();
            this.zahe.zab((BasePendingResult)localObject);
            ((BaseImplementation.ApiMethodImpl)localObject).setFailedResult(Status.RESULT_INTERNAL_ERROR);
          }
        }
        for (;;)
        {
          return (T)localObject;
          localObject = this.zags.execute(paramT);
        }
      }
      throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  @NonNull
  public final <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> paramAnyClientKey)
  {
    paramAnyClientKey = (Api.Client)this.zagy.get(paramAnyClientKey);
    Preconditions.checkNotNull(paramAnyClientKey, "Appropriate Api was not requested.");
    return paramAnyClientKey;
  }
  
  @NonNull
  public final ConnectionResult getConnectionResult(@NonNull Api<?> paramApi)
  {
    this.zaen.lock();
    try
    {
      if ((!isConnected()) && (!this.zagt)) {
        throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
      }
      if (this.zagy.containsKey(paramApi.getClientKey()))
      {
        ConnectionResult localConnectionResult = this.zags.getConnectionResult(paramApi);
        if (localConnectionResult == null)
        {
          if (this.zagt) {}
          for (paramApi = ConnectionResult.RESULT_SUCCESS;; paramApi = new ConnectionResult(8, null))
          {
            return paramApi;
            zaay();
            Log.wtf("GoogleApiClientImpl", String.valueOf(paramApi.getName()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
          }
        }
        return localConnectionResult;
      }
      throw new IllegalArgumentException(String.valueOf(paramApi.getName()).concat(" was never registered with GoogleApiClient"));
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  public final Context getContext()
  {
    return this.mContext;
  }
  
  public final Looper getLooper()
  {
    return this.zabj;
  }
  
  public final boolean hasApi(@NonNull Api<?> paramApi)
  {
    return this.zagy.containsKey(paramApi.getClientKey());
  }
  
  public final boolean hasConnectedApi(@NonNull Api<?> paramApi)
  {
    if (!isConnected()) {
      return false;
    }
    paramApi = (Api.Client)this.zagy.get(paramApi.getClientKey());
    return (paramApi != null) && (paramApi.isConnected());
  }
  
  public final boolean isConnected()
  {
    return (this.zags != null) && (this.zags.isConnected());
  }
  
  public final boolean isConnecting()
  {
    return (this.zags != null) && (this.zags.isConnecting());
  }
  
  public final boolean isConnectionCallbacksRegistered(@NonNull GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.zagr.isConnectionCallbacksRegistered(paramConnectionCallbacks);
  }
  
  public final boolean isConnectionFailedListenerRegistered(@NonNull GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.zagr.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }
  
  public final boolean maybeSignIn(SignInConnectionListener paramSignInConnectionListener)
  {
    return (this.zags != null) && (this.zags.maybeSignIn(paramSignInConnectionListener));
  }
  
  public final void maybeSignOut()
  {
    if (this.zags != null) {
      this.zags.maybeSignOut();
    }
  }
  
  public final void reconnect()
  {
    disconnect();
    connect();
  }
  
  public final void registerConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.zagr.registerConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public final void registerConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.zagr.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public final <L> ListenerHolder<L> registerListener(@NonNull L paramL)
  {
    this.zaen.lock();
    try
    {
      paramL = this.zaha.zaa(paramL, this.zabj, "NO_TYPE");
      return paramL;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  public final void stopAutoManage(@NonNull FragmentActivity paramFragmentActivity)
  {
    paramFragmentActivity = new LifecycleActivity(paramFragmentActivity);
    if (this.zaca >= 0)
    {
      zaj.zaa(paramFragmentActivity).zaa(this.zaca);
      return;
    }
    throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
  }
  
  public final void unregisterConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.zagr.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public final void unregisterConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.zagr.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public final void zaa(zacm paramzacm)
  {
    this.zaen.lock();
    try
    {
      if (this.zahd == null) {
        this.zahd = new HashSet();
      }
      this.zahd.add(paramzacm);
      return;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  @GuardedBy("mLock")
  final boolean zaaw()
  {
    if (!this.zagt) {
      return false;
    }
    this.zagt = false;
    this.zagw.removeMessages(2);
    this.zagw.removeMessages(1);
    if (this.zagx != null)
    {
      this.zagx.unregister();
      this.zagx = null;
    }
    return true;
  }
  
  final boolean zaax()
  {
    this.zaen.lock();
    try
    {
      Set localSet = this.zahd;
      if (localSet == null) {
        return false;
      }
      boolean bool = this.zahd.isEmpty();
      return bool ^ true;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  final String zaay()
  {
    StringWriter localStringWriter = new StringWriter();
    dump("", null, new PrintWriter(localStringWriter), null);
    return localStringWriter.toString();
  }
  
  @GuardedBy("mLock")
  public final void zab(int paramInt, boolean paramBoolean)
  {
    if ((paramInt == 1) && (!paramBoolean) && (!this.zagt))
    {
      this.zagt = true;
      if ((this.zagx == null) && (!ClientLibraryUtils.isPackageSide())) {
        this.zagx = this.zacc.zaa(this.mContext.getApplicationContext(), new zabc(this));
      }
      this.zagw.sendMessageDelayed(this.zagw.obtainMessage(1), this.zagu);
      this.zagw.sendMessageDelayed(this.zagw.obtainMessage(2), this.zagv);
    }
    this.zahe.zabx();
    this.zagr.onUnintentionalDisconnection(paramInt);
    this.zagr.disableCallbacks();
    if (paramInt == 2) {
      zaau();
    }
  }
  
  @GuardedBy("mLock")
  public final void zab(Bundle paramBundle)
  {
    while (!this.zafb.isEmpty()) {
      execute((BaseImplementation.ApiMethodImpl)this.zafb.remove());
    }
    this.zagr.onConnectionSuccess(paramBundle);
  }
  
  public final void zab(zacm paramzacm)
  {
    this.zaen.lock();
    try
    {
      if (this.zahd == null) {
        paramzacm = "Attempted to remove pending transform when no transforms are registered.";
      }
      for (Exception localException = new Exception();; localException = new Exception())
      {
        Log.wtf("GoogleApiClientImpl", paramzacm, localException);
        break label84;
        if (this.zahd.remove(paramzacm)) {
          break;
        }
        paramzacm = "Failed to remove pending transform - this may lead to memory leaks!";
      }
      if (!zaax()) {
        this.zags.zaw();
      }
      label84:
      return;
    }
    finally
    {
      this.zaen.unlock();
    }
  }
  
  @GuardedBy("mLock")
  public final void zac(ConnectionResult paramConnectionResult)
  {
    if (!this.zacc.isPlayServicesPossiblyUpdating(this.mContext, paramConnectionResult.getErrorCode())) {
      zaaw();
    }
    if (!this.zagt)
    {
      this.zagr.onConnectionFailure(paramConnectionResult);
      this.zagr.disableCallbacks();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */