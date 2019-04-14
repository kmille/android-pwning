package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zal;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class GmsClientEventManager
  implements Handler.Callback
{
  private final Handler mHandler;
  private final Object mLock = new Object();
  private final GmsClientEventState zaok;
  private final ArrayList<GoogleApiClient.ConnectionCallbacks> zaol = new ArrayList();
  @VisibleForTesting
  private final ArrayList<GoogleApiClient.ConnectionCallbacks> zaom = new ArrayList();
  private final ArrayList<GoogleApiClient.OnConnectionFailedListener> zaon = new ArrayList();
  private volatile boolean zaoo = false;
  private final AtomicInteger zaop = new AtomicInteger(0);
  private boolean zaoq = false;
  
  public GmsClientEventManager(Looper paramLooper, GmsClientEventState paramGmsClientEventState)
  {
    this.zaok = paramGmsClientEventState;
    this.mHandler = new zal(paramLooper, this);
  }
  
  public final boolean areCallbacksEnabled()
  {
    return this.zaoo;
  }
  
  public final void disableCallbacks()
  {
    this.zaoo = false;
    this.zaop.incrementAndGet();
  }
  
  public final void enableCallbacks()
  {
    this.zaoo = true;
  }
  
  public final boolean handleMessage(Message arg1)
  {
    if (???.what == 1)
    {
      GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)???.obj;
      synchronized (this.mLock)
      {
        if ((this.zaoo) && (this.zaok.isConnected()) && (this.zaol.contains(localConnectionCallbacks))) {
          localConnectionCallbacks.onConnected(this.zaok.getConnectionHint());
        }
        return true;
      }
    }
    int i = ???.what;
    ??? = new StringBuilder(45);
    ???.append("Don't know how to handle message: ");
    ???.append(i);
    Log.wtf("GmsClientEvents", ???.toString(), new Exception());
    return false;
  }
  
  public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    Preconditions.checkNotNull(paramConnectionCallbacks);
    synchronized (this.mLock)
    {
      boolean bool = this.zaol.contains(paramConnectionCallbacks);
      return bool;
    }
  }
  
  public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    Preconditions.checkNotNull(paramOnConnectionFailedListener);
    synchronized (this.mLock)
    {
      boolean bool = this.zaon.contains(paramOnConnectionFailedListener);
      return bool;
    }
  }
  
  @VisibleForTesting
  public final void onConnectionFailure(ConnectionResult paramConnectionResult)
  {
    ??? = Looper.myLooper();
    Object localObject2 = this.mHandler.getLooper();
    int i = 0;
    boolean bool;
    if (??? == localObject2) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool, "onConnectionFailure must only be called on the Handler thread");
    this.mHandler.removeMessages(1);
    synchronized (this.mLock)
    {
      localObject2 = new ArrayList(this.zaon);
      int k = this.zaop.get();
      localObject2 = (ArrayList)localObject2;
      int m = ((ArrayList)localObject2).size();
      while (i < m)
      {
        Object localObject3 = ((ArrayList)localObject2).get(i);
        int j = i + 1;
        localObject3 = (GoogleApiClient.OnConnectionFailedListener)localObject3;
        if ((this.zaoo) && (this.zaop.get() == k))
        {
          i = j;
          if (this.zaon.contains(localObject3))
          {
            ((GoogleApiClient.OnConnectionFailedListener)localObject3).onConnectionFailed(paramConnectionResult);
            i = j;
          }
        }
        else
        {
          return;
        }
      }
      return;
    }
  }
  
  @VisibleForTesting
  protected final void onConnectionSuccess()
  {
    synchronized (this.mLock)
    {
      onConnectionSuccess(this.zaok.getConnectionHint());
      return;
    }
  }
  
  @VisibleForTesting
  public final void onConnectionSuccess(Bundle paramBundle)
  {
    ??? = Looper.myLooper();
    Object localObject2 = this.mHandler.getLooper();
    boolean bool2 = true;
    boolean bool1;
    if (??? == localObject2) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Preconditions.checkState(bool1, "onConnectionSuccess must only be called on the Handler thread");
    for (;;)
    {
      synchronized (this.mLock)
      {
        Preconditions.checkState(this.zaoq ^ true);
        this.mHandler.removeMessages(1);
        this.zaoq = true;
        if (this.zaom.size() == 0)
        {
          bool1 = bool2;
          Preconditions.checkState(bool1);
          localObject2 = new ArrayList(this.zaol);
          int k = this.zaop.get();
          localObject2 = (ArrayList)localObject2;
          int m = ((ArrayList)localObject2).size();
          int i = 0;
          if (i < m)
          {
            Object localObject3 = ((ArrayList)localObject2).get(i);
            int j = i + 1;
            localObject3 = (GoogleApiClient.ConnectionCallbacks)localObject3;
            if ((this.zaoo) && (this.zaok.isConnected()) && (this.zaop.get() == k))
            {
              i = j;
              if (this.zaom.contains(localObject3)) {
                continue;
              }
              ((GoogleApiClient.ConnectionCallbacks)localObject3).onConnected(paramBundle);
              i = j;
              continue;
            }
          }
          this.zaom.clear();
          this.zaoq = false;
          return;
        }
      }
      bool1 = false;
    }
  }
  
  @VisibleForTesting
  public final void onUnintentionalDisconnection(int paramInt)
  {
    boolean bool;
    if (Looper.myLooper() == this.mHandler.getLooper()) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool, "onUnintentionalDisconnection must only be called on the Handler thread");
    this.mHandler.removeMessages(1);
    synchronized (this.mLock)
    {
      this.zaoq = true;
      ArrayList localArrayList = new ArrayList(this.zaol);
      int k = this.zaop.get();
      localArrayList = (ArrayList)localArrayList;
      int m = localArrayList.size();
      int i = 0;
      while (i < m)
      {
        Object localObject3 = localArrayList.get(i);
        int j = i + 1;
        localObject3 = (GoogleApiClient.ConnectionCallbacks)localObject3;
        if ((!this.zaoo) || (this.zaop.get() != k)) {
          break;
        }
        i = j;
        if (this.zaol.contains(localObject3))
        {
          ((GoogleApiClient.ConnectionCallbacks)localObject3).onConnectionSuspended(paramInt);
          i = j;
        }
      }
      this.zaom.clear();
      this.zaoq = false;
      return;
    }
  }
  
  public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    Preconditions.checkNotNull(paramConnectionCallbacks);
    synchronized (this.mLock)
    {
      if (this.zaol.contains(paramConnectionCallbacks))
      {
        String str = String.valueOf(paramConnectionCallbacks);
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 62);
        localStringBuilder.append("registerConnectionCallbacks(): listener ");
        localStringBuilder.append(str);
        localStringBuilder.append(" is already registered");
      }
      else
      {
        this.zaol.add(paramConnectionCallbacks);
      }
      if (this.zaok.isConnected()) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, paramConnectionCallbacks));
      }
      return;
    }
  }
  
  public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    Preconditions.checkNotNull(paramOnConnectionFailedListener);
    synchronized (this.mLock)
    {
      if (this.zaon.contains(paramOnConnectionFailedListener))
      {
        paramOnConnectionFailedListener = String.valueOf(paramOnConnectionFailedListener);
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramOnConnectionFailedListener).length() + 67);
        localStringBuilder.append("registerConnectionFailedListener(): listener ");
        localStringBuilder.append(paramOnConnectionFailedListener);
        localStringBuilder.append(" is already registered");
      }
      else
      {
        this.zaon.add(paramOnConnectionFailedListener);
      }
      return;
    }
  }
  
  public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    Preconditions.checkNotNull(paramConnectionCallbacks);
    synchronized (this.mLock)
    {
      if (!this.zaol.remove(paramConnectionCallbacks))
      {
        paramConnectionCallbacks = String.valueOf(paramConnectionCallbacks);
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramConnectionCallbacks).length() + 52);
        localStringBuilder.append("unregisterConnectionCallbacks(): listener ");
        localStringBuilder.append(paramConnectionCallbacks);
        localStringBuilder.append(" not found");
      }
      else if (this.zaoq)
      {
        this.zaom.add(paramConnectionCallbacks);
      }
      return;
    }
  }
  
  public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    Preconditions.checkNotNull(paramOnConnectionFailedListener);
    synchronized (this.mLock)
    {
      if (!this.zaon.remove(paramOnConnectionFailedListener))
      {
        paramOnConnectionFailedListener = String.valueOf(paramOnConnectionFailedListener);
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramOnConnectionFailedListener).length() + 57);
        localStringBuilder.append("unregisterConnectionFailedListener(): listener ");
        localStringBuilder.append(paramOnConnectionFailedListener);
        localStringBuilder.append(" not found");
      }
      return;
    }
  }
  
  @VisibleForTesting
  public static abstract interface GmsClientEventState
  {
    public abstract Bundle getConnectionHint();
    
    public abstract boolean isConnected();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/GmsClientEventManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */