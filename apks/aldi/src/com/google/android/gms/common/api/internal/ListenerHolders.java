package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

@KeepForSdk
public class ListenerHolders
{
  private final Set<ListenerHolder<?>> zajn = Collections.newSetFromMap(new WeakHashMap());
  
  @KeepForSdk
  public static <L> ListenerHolder<L> createListenerHolder(@NonNull L paramL, @NonNull Looper paramLooper, @NonNull String paramString)
  {
    Preconditions.checkNotNull(paramL, "Listener must not be null");
    Preconditions.checkNotNull(paramLooper, "Looper must not be null");
    Preconditions.checkNotNull(paramString, "Listener type must not be null");
    return new ListenerHolder(paramLooper, paramL, paramString);
  }
  
  @KeepForSdk
  public static <L> ListenerHolder.ListenerKey<L> createListenerKey(@NonNull L paramL, @NonNull String paramString)
  {
    Preconditions.checkNotNull(paramL, "Listener must not be null");
    Preconditions.checkNotNull(paramString, "Listener type must not be null");
    Preconditions.checkNotEmpty(paramString, "Listener type must not be empty");
    return new ListenerHolder.ListenerKey(paramL, paramString);
  }
  
  public final void release()
  {
    Iterator localIterator = this.zajn.iterator();
    while (localIterator.hasNext()) {
      ((ListenerHolder)localIterator.next()).clear();
    }
    this.zajn.clear();
  }
  
  public final <L> ListenerHolder<L> zaa(@NonNull L paramL, @NonNull Looper paramLooper, @NonNull String paramString)
  {
    paramL = createListenerHolder(paramL, paramLooper, paramString);
    this.zajn.add(paramL);
    return paramL;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/ListenerHolders.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */