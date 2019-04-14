package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zal;

@KeepForSdk
public final class ListenerHolder<L>
{
  private final zaa zaji;
  private volatile L zajj;
  private final ListenerKey<L> zajk;
  
  @KeepForSdk
  ListenerHolder(@NonNull Looper paramLooper, @NonNull L paramL, @NonNull String paramString)
  {
    this.zaji = new zaa(paramLooper);
    this.zajj = Preconditions.checkNotNull(paramL, "Listener must not be null");
    this.zajk = new ListenerKey(paramL, Preconditions.checkNotEmpty(paramString));
  }
  
  @KeepForSdk
  public final void clear()
  {
    this.zajj = null;
  }
  
  @NonNull
  @KeepForSdk
  public final ListenerKey<L> getListenerKey()
  {
    return this.zajk;
  }
  
  @KeepForSdk
  public final boolean hasListener()
  {
    return this.zajj != null;
  }
  
  @KeepForSdk
  public final void notifyListener(Notifier<? super L> paramNotifier)
  {
    Preconditions.checkNotNull(paramNotifier, "Notifier must not be null");
    paramNotifier = this.zaji.obtainMessage(1, paramNotifier);
    this.zaji.sendMessage(paramNotifier);
  }
  
  @KeepForSdk
  final void notifyListenerInternal(Notifier<? super L> paramNotifier)
  {
    Object localObject = this.zajj;
    if (localObject == null)
    {
      paramNotifier.onNotifyListenerFailed();
      return;
    }
    try
    {
      paramNotifier.notifyListener(localObject);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      paramNotifier.onNotifyListenerFailed();
      throw localRuntimeException;
    }
  }
  
  @KeepForSdk
  public static final class ListenerKey<L>
  {
    private final L zajj;
    private final String zajm;
    
    @KeepForSdk
    ListenerKey(L paramL, String paramString)
    {
      this.zajj = paramL;
      this.zajm = paramString;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof ListenerKey)) {
        return false;
      }
      paramObject = (ListenerKey)paramObject;
      return (this.zajj == ((ListenerKey)paramObject).zajj) && (this.zajm.equals(((ListenerKey)paramObject).zajm));
    }
    
    public final int hashCode()
    {
      return System.identityHashCode(this.zajj) * 31 + this.zajm.hashCode();
    }
  }
  
  @KeepForSdk
  public static abstract interface Notifier<L>
  {
    @KeepForSdk
    public abstract void notifyListener(L paramL);
    
    @KeepForSdk
    public abstract void onNotifyListenerFailed();
  }
  
  final class zaa
    extends zal
  {
    public zaa(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      int i = paramMessage.what;
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      Preconditions.checkArgument(bool);
      ListenerHolder.this.notifyListenerInternal((ListenerHolder.Notifier)paramMessage.obj);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/ListenerHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */