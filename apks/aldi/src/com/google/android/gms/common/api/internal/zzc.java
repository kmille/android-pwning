package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.internal.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class zzc
  extends Fragment
  implements LifecycleFragment
{
  private static WeakHashMap<FragmentActivity, WeakReference<zzc>> zzbd = new WeakHashMap();
  private Map<String, LifecycleCallback> zzbe = new ArrayMap();
  private int zzbf = 0;
  private Bundle zzbg;
  
  public static zzc zza(FragmentActivity paramFragmentActivity)
  {
    Object localObject = (WeakReference)zzbd.get(paramFragmentActivity);
    if (localObject != null)
    {
      localObject = (zzc)((WeakReference)localObject).get();
      if (localObject != null) {
        return (zzc)localObject;
      }
    }
    try
    {
      zzc localzzc = (zzc)paramFragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
      if (localzzc != null)
      {
        localObject = localzzc;
        if (!localzzc.isRemoving()) {}
      }
      else
      {
        localObject = new zzc();
        paramFragmentActivity.getSupportFragmentManager().beginTransaction().add((Fragment)localObject, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
      }
      zzbd.put(paramFragmentActivity, new WeakReference(localObject));
      return (zzc)localObject;
    }
    catch (ClassCastException paramFragmentActivity)
    {
      throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", paramFragmentActivity);
    }
  }
  
  public final void addCallback(String paramString, @NonNull LifecycleCallback paramLifecycleCallback)
  {
    if (!this.zzbe.containsKey(paramString))
    {
      this.zzbe.put(paramString, paramLifecycleCallback);
      if (this.zzbf > 0) {
        new zze(Looper.getMainLooper()).post(new zzd(this, paramLifecycleCallback, paramString));
      }
      return;
    }
    paramLifecycleCallback = new StringBuilder(String.valueOf(paramString).length() + 59);
    paramLifecycleCallback.append("LifecycleCallback with tag ");
    paramLifecycleCallback.append(paramString);
    paramLifecycleCallback.append(" already added to this fragment.");
    throw new IllegalArgumentException(paramLifecycleCallback.toString());
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Iterator localIterator = this.zzbe.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final <T extends LifecycleCallback> T getCallbackOrNull(String paramString, Class<T> paramClass)
  {
    return (LifecycleCallback)paramClass.cast(this.zzbe.get(paramString));
  }
  
  public final boolean isCreated()
  {
    return this.zzbf > 0;
  }
  
  public final boolean isStarted()
  {
    return this.zzbf >= 2;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Iterator localIterator = this.zzbe.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.zzbf = 1;
    this.zzbg = paramBundle;
    Iterator localIterator = this.zzbe.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      LifecycleCallback localLifecycleCallback = (LifecycleCallback)((Map.Entry)localObject).getValue();
      if (paramBundle != null) {
        localObject = paramBundle.getBundle((String)((Map.Entry)localObject).getKey());
      } else {
        localObject = null;
      }
      localLifecycleCallback.onCreate((Bundle)localObject);
    }
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    this.zzbf = 5;
    Iterator localIterator = this.zzbe.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).onDestroy();
    }
  }
  
  public final void onResume()
  {
    super.onResume();
    this.zzbf = 3;
    Iterator localIterator = this.zzbe.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).onResume();
    }
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (paramBundle == null) {
      return;
    }
    Iterator localIterator = this.zzbe.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Bundle localBundle = new Bundle();
      ((LifecycleCallback)localEntry.getValue()).onSaveInstanceState(localBundle);
      paramBundle.putBundle((String)localEntry.getKey(), localBundle);
    }
  }
  
  public final void onStart()
  {
    super.onStart();
    this.zzbf = 2;
    Iterator localIterator = this.zzbe.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).onStart();
    }
  }
  
  public final void onStop()
  {
    super.onStop();
    this.zzbf = 4;
    Iterator localIterator = this.zzbe.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).onStop();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */